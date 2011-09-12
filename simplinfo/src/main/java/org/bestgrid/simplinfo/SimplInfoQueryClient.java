package org.bestgrid.simplinfo;

import grisu.jcommons.model.info.Directory;
import grisu.jcommons.model.info.FileSystem;

import java.io.File;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.HierarchicalINIConfiguration;
import org.apache.commons.configuration.SubnodeConfiguration;
import org.apache.commons.lang.StringUtils;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

public class SimplInfoQueryClient {

	enum Key {
		DIRECTORY,
		PORT,
		PROTOCOL,
		HOST,
		FILESYSTEM,
		PATH,
		FQAN;
	}

	enum Section {
		FILESYSTEM,
		DIRECTORY;
	}

	Cache eternal = CacheManager.getInstance().getCache("eternal");

	private final HierarchicalINIConfiguration config;

	public SimplInfoQueryClient() {
		final File configDir = Environment.getConfigDirectory();
		try {
			this.config = new HierarchicalINIConfiguration(new File(configDir,
					"info.config"));
		} catch (ConfigurationException e) {
			throw new RuntimeException(e);
		}
	}

	public Set<Directory> getDirectories() {

		if (eternal.get("ALL_DIRECTORIES") != null) {
			return (Set<Directory>) eternal.get("ALL_DIRECTORIES")
					.getObjectValue();
		}

		Set<Directory> result = Sets.newTreeSet();
		for ( String name : getDirectoryNames() ) {
			String fileSystem = (String)getItem(Section.DIRECTORY, name, Key.FILESYSTEM);
			FileSystem fs = getFileSystem(fileSystem);
			String path = (String) getItem(Section.DIRECTORY, name, Key.PATH);
			String fqan = (String) getItem(Section.DIRECTORY, name, Key.FQAN);
			Directory temp = new Directory(fs, path, fqan, name);
			result.add(temp);
		}

		eternal.put(new Element("ALL_DIRECTORIES", result));

		return result;
	}


	public Set<Directory> getDirectories(String groupname) {

		Set<Directory> result = new TreeSet<Directory>();

		for (Directory d : getDirectories()) {
			if (d.getFqan().equals(groupname)) {
				result.add(d);
			}
		}

		return result;

	}

	public Set<String> getDirectoryNames() {
		return getSectionItemNames(Section.DIRECTORY);
	}

	public FileSystem getFileSystem(String fsName) {

		return getFileSystems().get(fsName);
	}

	public Set<String> getFileSystemNames() {
		return getSectionItemNames(Section.FILESYSTEM);
	}

	public Map<String, FileSystem> getFileSystems() {

		if (eternal.get("ALL_FILESYSTEMS") != null) {
			return (Map<String, FileSystem>) eternal.get("ALL_FILESYSTEMS")
					.getObjectValue();
		}

		Map<String, FileSystem> result = Maps.newTreeMap();
		for (String fsName : getFileSystemNames()) {
			String host = getHost(fsName);
			String prot = getProtocol(fsName);
			Integer port = getPort(fsName);

			FileSystem temp = new FileSystem(prot, host, port);
			result.put(fsName, temp);
		}

		eternal.put(new Element("ALL_FILESYSTEMS", result));

		return result;
	}

	public Set<FileSystem> getFileSystems(String groupname) {

		Set<FileSystem> result = Sets.newTreeSet();
		for (Directory d : getDirectories(groupname)) {
			result.add(d.getFilesystem());
		}
		return result;
	}

	public String getHost(String filesystemname) {

		Object value = getItem(Section.FILESYSTEM, filesystemname, Key.HOST);

		if (value == null) {
			return null;
		}

		return (String) value;

	}

	private Object getItem(Section section, String name, Key key) {

		SubnodeConfiguration sectionConf = getSection(section, name);

		if (sectionConf == null) {
			return null;
		}

		return sectionConf.getProperty(key.toString().toLowerCase());

	}

	public Integer getPort(String filesystemname) {

		Object value = getItem(Section.FILESYSTEM, filesystemname, Key.PORT);

		if (value == null) {
			return null;
		}
		try {
			return Integer.valueOf((String) value);
		} catch (Exception e) {
			return -1;
		}

	}

	public String getProtocol(String filesystemname) {

		Object value = getItem(Section.FILESYSTEM, filesystemname, Key.PROTOCOL);

		if (value == null) {
			return null;
		}

		return (String) value;
	}

	private SubnodeConfiguration getSection(Section section, String name) {

		SubnodeConfiguration sectionConf = config.getSection(section.toString()
				.toLowerCase() + "_" + name);
		return sectionConf;

	}

	private Set<String> getSectionItemNames(Section section) {

		Set<String> result = Sets.newHashSet();
		for (String name : getSections()) {

			if (StringUtils.startsWith(name, section.toString().toLowerCase())) {
				result.add(name.substring(section.toString().length() + 1));
			}
		}
		return result;
	}

	private Set<String> getSections() {
		return config.getSections();
	}
}
