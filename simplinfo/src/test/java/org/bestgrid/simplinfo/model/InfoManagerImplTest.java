package org.bestgrid.simplinfo.model;

import java.util.Set;

import org.junit.Test;

public class InfoManagerImplTest {

	private final InfoManagerImpl im = new InfoManagerImpl();

	@Test
	public void testGetDirectoriesForVO() {

		Set<Directory> dirs = im.getDirectoriesForVO("/nz/nesi");

	}

	@Test
	public void testGetFileSystemsForVO() {
		im.getFileSystemsForVO("/nz/nesi");
	}

}
