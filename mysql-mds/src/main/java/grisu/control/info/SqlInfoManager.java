package grisu.control.info;

import grisu.jcommons.interfaces.InfoManager;
import grisu.jcommons.model.info.Directory;
import grisu.jcommons.model.info.FileSystem;

import java.util.Map;
import java.util.Set;

import org.bestgrid.mds.SQLQueryClient;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;

public class SqlInfoManager implements InfoManager {

	private final Map<String, String> configuration;
	private final SQLQueryClient client;

	public SqlInfoManager() {
		this(ImmutableMap.of("databaseUrl",
				"jdbc:mysql://localhost/mds_test?autoReconnect=true", "user",
				"grisu_read", "password", "password"));
	}

	public SqlInfoManager(Map<String, String> configuration) {
		this.configuration = configuration;
		String databaseUrl = configuration.get("databaseUrl");
		String databaseUser = configuration.get("user");
		String databasePassword = configuration.get("password");

		client = new SQLQueryClient(databaseUrl, databaseUser, databasePassword);
	}


	public Set<Directory> getDirectoriesForVO(String vo) {
		Set<Directory> result = Sets.newTreeSet();
		Map<String, String[]> dl = client.calculateDataLocationsForVO(vo);
		for (String host : dl.keySet()) {
			FileSystem fs = new FileSystem(host);
			for (String path : dl.get(host)) {
				String alias = null;
				Directory d = new Directory(fs, path, vo, alias);
				result.add(d);
			}
		}
		return result;
	}

	public Set<FileSystem> getFileSystemsForVO(String fqan) {
		Set<FileSystem> result = Sets.newTreeSet();
		Map<String, String[]> dl = client.calculateDataLocationsForVO(fqan);
		for (String host : dl.keySet()) {
			FileSystem fs = new FileSystem(host);
			result.add(fs);
		}
		return result;
	}

}
