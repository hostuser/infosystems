package org.bestgrid.simplinfo;

import grisu.jcommons.interfaces.GridResource;
import grisu.jcommons.interfaces.InformationManager;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.apache.commons.lang.NotImplementedException;

public class SimplinfoManager implements InformationManager {


	SimplInfoQueryClient qc = null;

	public SimplinfoManager() {
		qc = new SimplInfoQueryClient();
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

		Set<String> fss = qc.getGroupFileSystems(fqan);

		if ((fss == null) || (fss.size() == 0)) {
			return new HashMap<String, String[]>();
		}

		Map<String, Set<String>> result = new TreeMap<String, Set<String>>();
		for (String fs : fss) {
			int i = fs.indexOf(":");
			String filesystemname = fs.substring(0, i);
			String host = qc.getHost(filesystemname);
			String path = fs.substring(i + 1);

			Set<String> pathSet = result.get(host);
			if (pathSet == null) {
				pathSet = new TreeSet<String>();
				result.put(host, pathSet);
			}
			pathSet.add(path);
		}

		Map<String, String[]> temp = new TreeMap<String, String[]>();
		for (String key : result.keySet()) {
			String[] pathArray = result.get(key).toArray(new String[] {});
			temp.put(key, pathArray);
		}

		return temp;

	}


	public GridResource getGridResource(String submissionLocation) {
		throw new NotImplementedException();
	}



	public String getJobmanagerOfQueueAtSite(String site, String queue) {
		throw new NotImplementedException();
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
