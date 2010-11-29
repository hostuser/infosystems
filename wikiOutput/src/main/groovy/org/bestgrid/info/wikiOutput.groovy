package org.bestgrid.info

import au.edu.sapac.grid.mds.QueryClient 

//public static void main(String[] args) {

qc = new QueryClient("/tmp")
//qc = new SQLQueryClient("jdbc:mysql://mysql-bg.ceres.auckland.ac.nz/mds_test", "grisu_read", "password")


apps = qc.getCodesOnGridForVO("/ARCS/BeSTGRID")

for (app in apps) {
	
	println app
	println "|Version|Site|"
	versions = qc.getVersionsOfCodeOnGridForVO(app, "/ARCS/BeSTGRID")
	for ( version in versions ) {
		sites = qc.getSitesWithAVersionOfACode(app, version)
		if ( sites.size() > 1 ) {
			println("|"+version+"||")
			for ( site in sites ) {
				println("||"+site+"|")
			}
		} else {
			println("|"+version+"|"+sites[0]+"|")
		}
	}
}
//}
