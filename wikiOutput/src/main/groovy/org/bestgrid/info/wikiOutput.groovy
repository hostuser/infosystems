package org.bestgrid.info

import au.edu.sapac.grid.mds.QueryClient 

qc = new QueryClient("/tmp")
//qc = new SQLQueryClient("jdbc:mysql://mysql-bg.ceres.auckland.ac.nz/mds_test", "grisu_read", "password")

vo = "/ARCS/BeSTGRID"

apps = qc.getCodesOnGridForVO(vo)

allSites = qc.getSitesForVO(vo) 

for (app in apps) {
	
	println app
	println "|Version|Site|"
	versions = qc.getVersionsOfCodeOnGridForVO(app, vo)
	for ( version in versions ) {
		sites = qc.getSitesWithAVersionOfACode(app, version)
		
		if ( sites.size() > 1 ) { 
			println("|"+version+"||")
			for ( site in sites ) {
				if ( allSites.contains(site) ) {
					println("||"+site+"|")
				}
			}
		} else {
			if ( allSites.contains(sites[0]) ) {
				println("|"+version+"|"+sites[0]+"|")
			}
		}
	}
}
