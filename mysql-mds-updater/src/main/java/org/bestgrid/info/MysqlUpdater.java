package org.bestgrid.info;

import org.apache.commons.lang.StringUtils;

import au.edu.sapac.grid.mds.QueryEngine;


public class MysqlUpdater {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String name = args[0];
		if (StringUtils.isBlank(name)) {
			name = "MDSCache.xml";
		}

		QueryEngine engine = new QueryEngine();
		engine.makeCacheFile(args[0]);
	}

}
