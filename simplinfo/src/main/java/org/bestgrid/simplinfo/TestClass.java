package org.bestgrid.simplinfo;

import grisu.jcommons.interfaces.InfoManager;
import grisu.jcommons.model.info.Directory;

import java.util.Set;

import org.bestgrid.simplinfo.model.InfoManagerImpl;

public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		InfoManager im = new InfoManagerImpl();

		Set<Directory> dirs = im.getDirectoriesForVO("/nz/nesi");

		for (Directory d : dirs) {
			System.out.println("Host: " + d.getFilesystem().getHost());
			System.out.println("\t" + d.toString());
		}

	}

}
