package org.bestgrid.simplinfo;

import java.util.Map;

import org.apache.commons.lang.StringUtils;

public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SimplinfoManager sim = new SimplinfoManager();

		Map<String, String[]> map = sim.getDataLocationsForVO("/nz/nesi");

		for ( String host : map.keySet() ) {
			System.out.println("Host: "+host);
			System.out.println("\t" + StringUtils.join(map.get(host), ", "));
		}

	}

}
