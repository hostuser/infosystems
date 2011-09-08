package org.bestgrid.simplinfo;

import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.HierarchicalINIConfiguration;
import org.apache.commons.configuration.SubnodeConfiguration;
import org.apache.commons.lang.StringUtils;

import com.google.common.collect.Sets;

public class SimplInfoQueryClient {

	enum Key {
		FILESYSTEM,
		PORT,
		PROTOCOL,
		HOST;
	}

	enum Section {
		FILESYSTEM,
		GROUP;
	}

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

	private SubnodeConfiguration getFileSystem(String fsName) {

		SubnodeConfiguration fsSection = config.getSection(Section.FILESYSTEM
				.toString().toLowerCase() + "_" + fsName);
		return fsSection;
	}

	private SubnodeConfiguration getGroup(String groupName) {

		SubnodeConfiguration fsSection = config.getSection(Section.GROUP
				.toString().toLowerCase() + "_" + groupName);
		return fsSection;
	}

	public Set<String> getGroupFileSystems(String groupname) {

		Object value = getItem(Section.GROUP, groupname, Key.FILESYSTEM);

		if (value == null) {
			return null;
		}

		Set<String> filesystems = new TreeSet<String>();
		if (value instanceof String) {
			filesystems.add((String) value);
		} else {
			filesystems.addAll((List<String>) value);
		}

		return filesystems;

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
