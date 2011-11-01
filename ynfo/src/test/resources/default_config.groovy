import grisu.jcommons.model.info.Directory
import grisu.jcommons.model.info.FileSystem


// filesystems
auckland_gram5 = new FileSystem(
	host:'gram5.ceres.auckland.ac.nz',
	protocol:'gsiftp',
	port:2811
)

canterbury_df = new FileSystem(
			host:'df.canterbury.ac.nz'
)


// directories
auckland_home = new Directory(
	 	filesystem:auckland_gram5, 
		fqan:"/nz/nesi", 
		path:"/~/" 
)

auckland_tmp = new Directory(
		filesystem:auckland_gram5,
		fqan:"/nz/nesi",
		path:"/tmp",
)

auckland_dev = new Directory(
	filesystem:auckland_gram5,
	fqan:"/nz/grid-dev",
	path:"/tmp",
)

canterbury_home = new Directory(
	filesystem:canterbury_df,
		fqan:"/nz/nesi",
		path:"/~/"
)
	



