package org.bestgrid.simplinfo.model;

import java.util.Set;
import java.util.TreeSet;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;

import org.bestgrid.simplinfo.SimplInfoQueryClient;

public class InfoManagerImpl implements InfoManager {

	Cache eternal = CacheManager.getInstance().getCache("eternal");

	SimplInfoQueryClient qc = null;

	public InfoManagerImpl() {
		qc = new SimplInfoQueryClient();
	}


	public Set<Directory> getDirectoriesForVO(String vo) {
		Set<Directory> result = new TreeSet<Directory>();
		for (FileSystem fs : getFileSystemsForVO(vo)) {
			Set<Directory> temp = getDirectoriesForVoOnFileSystem(vo, fs);
			result.addAll(temp);
		}
		return result;
	}

	private Set<Directory> getDirectoriesForVoOnFileSystem(String fqan,
			FileSystem fs) {

		Set<Directory> result = new TreeSet<Directory>();
		for (Directory d : qc.getDirectories(fqan)) {
			if (d.getFilesystem().equals(fs)) {
				result.add(d);
			}
		}
		return result;
	}

	public Set<FileSystem> getFileSystemsForVO(String fqan) {

		return qc.getFileSystems(fqan);
	}

}
