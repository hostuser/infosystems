package grisu.control.info;

import grisu.jcommons.interfaces.InfoManager;
import grisu.jcommons.model.info.Directory;
import grisu.jcommons.model.info.FileSystem;
import it.infn.cnaf.forge.glueschema.spec.v12.r2.SEAccessProtocolType;
import it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType;
import it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import au.edu.sapac.grid.mds.QueryClient;

import com.google.common.collect.Sets;

public class MdsInfoManager implements InfoManager {

	QueryClient client;

	public MdsInfoManager(String dir) {

		client = new QueryClient(dir);

	}

	private Map<String, String[]> calculateDataLocationsForVO(String fqan) {

		Map<String, String[]> dataLocationsMap = new HashMap<String, String[]>();
		it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType[] storageElements = (client)
				.getStorageElementsForVO(fqan);
		if (storageElements != null) {
			for (StorageElementType storageElement : storageElements) {
				it.infn.cnaf.forge.glueschema.spec.v12.r2.SEAccessProtocolType[] accessProtocols = storageElement
						.getAccessProtocolArray();

				// now get the storageAreas that VO fqan has access to
				it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType[] allStorageAreas = storageElement
						.getStorageAreaArray();

				java.util.List<String> voStorageAreaList = new java.util.ArrayList<String>();

				for (StorageAreaType allStorageArea : allStorageAreas) {
					String[] aclTypes = allStorageArea.getACL().getRuleArray();

					for (String aclType : aclTypes) {
						if (aclType.equalsIgnoreCase(fqan)) {
							voStorageAreaList.add(allStorageArea.getPath());
						}
					}
				}

				for (SEAccessProtocolType accessProtocol : accessProtocols) {
					if (!voStorageAreaList.isEmpty()) {
						dataLocationsMap.put(accessProtocol.getEndpoint(),
								voStorageAreaList.toArray(new String[0]));
					}
				}

			}
		}
		return dataLocationsMap;
	}

	public Set<Directory> getDirectoriesForVO(String vo) {
		Set<Directory> result = Sets.newTreeSet();
		Map<String, String[]> dl = calculateDataLocationsForVO(vo);
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
		Map<String, String[]> dl = calculateDataLocationsForVO(fqan);
		for (String host : dl.keySet()) {
			FileSystem fs = new FileSystem(host);
			result.add(fs);
		}
		return result;
	}

}
