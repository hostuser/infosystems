package org.bestgrid.info;

import grisu.jcommons.interfaces.GridInfoInterface;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import org.bestgrid.mds.SQLQueryClient;

import au.edu.sapac.grid.mds.QueryClient;

public class wikiHelper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		GridInfoInterface qc = null;
		if (args.length > 0) {
			if (args[0].equals("mysql")) {
				qc = new SQLQueryClient(
						"jdbc:mysql://mysql-bg.ceres.auckland.ac.nz/mds_test",
						"grisu_read", "password");
			}
		}
		if (qc == null) {
			qc = new QueryClient("/tmp");
		}

		String vo = "/ARCS/BeSTGRID";

		String[] apps = qc.getCodesOnGridForVO(vo);

		Comparator icc = new Comparator<String>() {

			public int compare(String strA, String strB) {
				return strA.compareToIgnoreCase(strB);
			}

		};

		Arrays.sort(apps, icc);

		String[] allSites = qc.getSitesForVO(vo);

		for (String app : apps) {
			System.out.println("== " + app + " ==");
			System.out
					.println("{| class=\"wikitable\"\n"
							+ ""
							+ "|-\n"
							+ "! scope=\"col\" width=\"260\" align=\"left\" | Version\n"
							+ "! scope=\"col\" width=\"340\" align=\"left\" | Site");
			String[] versions = qc.getVersionsOfCodeOnGridForVO(app, vo);
			for (String version : versions) {
				String[] sites = qc.getSitesWithAVersionOfACode(app, version);
				Set<String> temp = new TreeSet<String>();
				for (String site : sites) {
					if (Arrays.binarySearch(allSites, site) >= 0) {
						temp.add(site);
					}
				}
				if (temp.size() > 1) {
					Iterator<String> i = temp.iterator();
					System.out.println("|-\n|" + version + "\n|" + i.next()
							+ "\n");
					while (i.hasNext()) {
						System.out.println("|-\n|\n|" + i.next() + "\n");
					}
				} else {
					System.out.println("|-\n|" + version + "\n|"
							+ temp.iterator().next() + "\n");
				}
			}
			System.out.println("|}");
		}

	}
}
