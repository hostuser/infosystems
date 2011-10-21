package grisu.info.ynfo

import grisu.jcommons.interfaces.InfoManager
import grisu.jcommons.model.info.Directory

class YnfoManager implements InfoManager {


	static void main (args) {

		def ym = new YnfoManager('/home/markus/Desktop/default_config.groovy')

		for ( d in ym.getDirectoriesForVO('/nz/nesi') ) {
			println d
		}

		for ( fs in ym.getFileSystemsForVO('/nz/nesi') ) {
			println fs
		}
	}


	def filesystems = []
	def directories = []

	public YnfoManager(def pathToConfig) {

		this(new ConfigSlurper().parse(new File(pathToConfig).toURL()))
	}


	public YnfoManager(ConfigObject config) {


		for (def e in config) {

			def name = e.key
			def object = e.value
			switch(object.class) {

				case Directory.class:
					directories.add(object)
					object.alias = name
					break
				case FileSystem.class:
					filesystems.add(object)
				default: break
			}
		}
	}


	public Set<Directory> getDirectoriesForVO(String fqan) {

		def fs = directories.findAll { it.fqan == fqan }
		return fs as Set
	}


	public Set<FileSystem> getFileSystemsForVO(String fqan) {

		def d = getDirectoriesForVO(fqan)
		return d*.filesystem
	}
}
