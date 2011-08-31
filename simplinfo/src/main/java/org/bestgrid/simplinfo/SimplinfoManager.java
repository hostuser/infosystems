package org.bestgrid.simplinfo;

import grisu.jcommons.interfaces.GridResource;
import grisu.jcommons.interfaces.InformationManager;

import java.io.File;
import java.util.Map;
import java.util.Set;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.HierarchicalINIConfiguration;
import org.apache.commons.configuration.SubnodeConfiguration;
import org.apache.commons.lang.NotImplementedException;
import org.apache.commons.lang.StringUtils;

import com.google.common.collect.Sets;

public class SimplinfoManager implements InformationManager {

	enum Section {
		FILESYSTEM(),
		GROUP();
	}

	private final HierarchicalINIConfiguration config;

	public SimplinfoManager() {

		final File configDir = Environment.getConfigDirectory();
		try {
			this.config = new HierarchicalINIConfiguration(new File(configDir,
					"info.config"));
		} catch (ConfigurationException e) {
			throw new RuntimeException(e);
		}
	}

	public String[] getAllApplicationsAtSite(String site) {
		throw new NotImplementedException();
	}

	public String[] getAllApplicationsOnGrid() {
		throw new NotImplementedException();
	}

	public String[] getAllApplicationsOnGridForVO(String fqan) {
		throw new NotImplementedException();
	}

	public Map<String, GridResource> getAllGridResources() {
		throw new NotImplementedException();
	}

	public Map<String, String> getAllHosts() {
		throw new NotImplementedException();
	}

	public String[] getAllSites() {
		throw new NotImplementedException();
	}

	public String[] getAllSubmissionLocations() {
		throw new NotImplementedException();
	}

	public String[] getAllSubmissionLocations(String application, String version) {
		throw new NotImplementedException();
	}

	public String[] getAllSubmissionLocationsForApplication(String application) {
		throw new NotImplementedException();
	}

	public String[] getAllSubmissionLocationsForSite(String site) {
		throw new NotImplementedException();
	}

	public String[] getAllSubmissionLocationsForVO(String fqan) {
		throw new NotImplementedException();
	}

	public String[] getAllVersionsOfApplicationOnGrid(String application) {
		throw new NotImplementedException();
	}

	public String[] getAllVersionsOfApplicationOnGridForVO(String application,
			String vo) {
		throw new NotImplementedException();

	}

	public Map<String, String> getApplicationDetails(String application,
			String version, String submissionLocation) {
		throw new NotImplementedException();
	}

	public String[] getApplicationsThatProvideExecutable(String executable) {
		throw new NotImplementedException();
	}

	public Map<String, String[]> getDataLocationsForVO(String fqan) {

		Set<String> filesystemNames = getSectionItemNames(Section.FILESYSTEM);

		for (String s : filesystemNames) {
			System.out.println(s);
		}

		return null;

	}

	private SubnodeConfiguration getFileSystem(String fsName) {

		SubnodeConfiguration fsSection = config.getSection(Section.FILESYSTEM
				.toString().toLowerCase() + "_" + fsName);
		return fsSection;
	}

	public GridResource getGridResource(String submissionLocation) {
		throw new NotImplementedException();
	}

	public String getJobmanagerOfQueueAtSite(String site, String queue) {
		throw new NotImplementedException();
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
				result.add(name.substring(section.toString().length()+1));
			}
		}
		return result;
	}

	private Set<String> getSections() {
		return config.getSections();
	}

	public String getSiteForHostOrUrl(String host_or_url) {
		throw new NotImplementedException();
	}

	public String[] getStagingFileSystemForSubmissionLocation(String subLoc) {
		throw new NotImplementedException();
	}

	public String[] getVersionsOfApplicationOnSite(String application,
			String site) {
		throw new NotImplementedException();
	}

	public String[] getVersionsOfApplicationOnSubmissionLocation(
			String application, String submissionLocation) {
		throw new NotImplementedException();
	}

	public boolean isVolatileDataLocation(String host, String path, String fqan) {
		throw new NotImplementedException();
	}

}
