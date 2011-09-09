package org.bestgrid.simplinfo.model;

import java.util.Set;

public interface InfoManager {

	/**
	 * Returns a set of all {@link Directory}s for a given VO.
	 * 
	 * @param vo the vo
	 * @return the set of directories
	 */
	public Set<Directory> getDirectoriesForVO(String vo);

	// /**
	// * Returns Directories that are sitting on the specified filesystem via
	// the specified VO.
	// *
	// * @param vo the vo
	// * @param fs the filesystem
	// * @return the accessible directories
	// */
	// public Set<Directory> getDirectoriesForVoOnFileSystem(String vo,
	// FileSystem fs);

	/**
	 * Returns a list of hosts that are accessible with the specified VO.
	 * 
	 * @param vo
	 *            the VO
	 * @return the list of file hosts
	 */
	public Set<FileSystem> getFileSystemsForVO(String fqan);

}
