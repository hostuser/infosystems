from xml.dom.minidom import parse, parseString
import MySQLdb
import sys
from _mysql import escape_string as escape

cacheFile = sys.argv[1]
dbHost = sys.argv[2]
dbName = sys.argv[3]
dbUser = sys.argv[4]
dbPassword = sys.argv[5]

dom = parse(cacheFile)
db = MySQLdb.connect(host=dbHost ,user=dbUser,passwd=dbPassword,db=dbName)

sites = dom.firstChild.childNodes

def getFirst(el,name):
    try:
        return el.getElementsByTagName(name)[0].firstChild.wholeText
    except IndexError:
        return ""
    except AttributeError:
        return ""

def getFirstN(el,name):
    try:
        return el.getElementsByTagName(name)[0].firstChild.wholeText
    except IndexError:
        return "0"

# start transaction
cursor = db.cursor()
cursor.execute("SET autocommit=0");
cursor.execute("START TRANSACTION");

# delete all tables

cursor.execute("DELETE FROM AccessProtocols");
cursor.execute("DELETE FROM ComputeElements");
cursor.execute("DELETE FROM Sites");
cursor.execute("DELETE FROM Clusters");
cursor.execute("DELETE FROM SoftwareExecutables");
cursor.execute("DELETE FROM StorageAreas");
cursor.execute("DELETE FROM SoftwarePackages");
cursor.execute("DELETE FROM StorageElements");
cursor.execute("DELETE FROM SubClusters");
cursor.execute("DELETE FROM storageAreaACLs");
cursor.execute("DELETE FROM voViewACLs");
cursor.execute("DELETE FROM voViews");
cursor.execute("DELETE FROM softwarePackageACLs");

for site in sites:
    # just ignore text nodes
    if  site.nodeType != 3:
        try:
            uniqueID = site.attributes['UniqueID'].value
        except KeyError:
            uniqueID ="not-so-unique"
        name = getFirst(site,"Name")
        userSupport = getFirst(site,'UserSupportContact')
        sysAdmin = getFirst(site,'SysAdminContact')
        security = getFirst(site,'SecurityContact')
        description = getFirst(site,'Description')
        location = getFirst(site,'Location')
        latitude = float(getFirstN(site,'Latitude'))
        longitude = float(getFirstN(site,'Longitude'))
        web =  getFirst(site,'Web')
        sponsor =  getFirst(site,'Sponsor')
        site_query = 'SELECT * FROM Sites WHERE uniqueID= "%s"' % escape(uniqueID)
        cursor.execute(site_query)
        r = cursor.fetchone()
        if (r == None):
            print "inserting site definition now..."
            site_tuple = (escape(uniqueID), escape(name),escape(description),
                          escape(userSupport), escape(sysAdmin), escape(security), escape(location),
                          latitude,longitude,escape(web),escape(sponsor))
            site_insert = 'INSERT INTO Sites VALUES(NULL,"%s","%s","%s","%s","%s","%s","%s",%f,%f,"%s","%s")' % site_tuple
            cursor.execute(site_insert)
            site_id =  cursor.lastrowid
        else:
            site_id = r[0]

        storageElements  = site.getElementsByTagName('StorageElement')

        for storageElement in storageElements:
            seUniqueID = storageElement.attributes['UniqueID'].value
            seSizeTotal = int(getFirstN(storageElement,"SizeTotal"))
            seSizeFree = int(getFirstN(storageElement,"SizeFree"))
            seArch = getFirst(storageElement,"Architecture")
            se_query = 'SELECT * From StorageElements WHERE uniqueID= "%s"' % escape(seUniqueID)
            cursor.execute(se_query)
            r = cursor.fetchone()
            if (r == None):
                print "inserting storage element definition now..."
                se_tuple = (site_id,escape(seUniqueID), seSizeTotal,seSizeFree, escape(seArch))
                se_insert = 'INSERT INTO StorageElements VALUES(NULL,%i,"%s",%i,%i,"%s")' % se_tuple
                cursor.execute(se_insert)
                se_id = cursor.lastrowid
            else:
                se_id = r[0]
                print se_id

            accessProtocols = storageElement.getElementsByTagName('AccessProtocol')
            for ap in accessProtocols:
                aType = getFirst(ap,"Type")
                aEndpoint = getFirst(ap,"Endpoint")
                aVersion  = getFirst(ap,"Version")
                aLocalID = ap.attributes['LocalID'].value
                # todo: modify capability
                ap_query = 'SELECT * From AccessProtocols WHERE localID= "%s" AND storageElement_id=%i' % (escape(aLocalID),se_id)
                cursor.execute(ap_query)
                r = cursor.fetchone()
                if (r==None):
                    ap_tuple = (escape(aLocalID),se_id,escape(aType), escape(aEndpoint), escape(aVersion))
                    ap_insert = 'INSERT INTO AccessProtocols VALUES(NULL,"%s",%i,"%s","%s","%s")' % ap_tuple
                    cursor.execute(ap_insert)

            sas = storageElement.getElementsByTagName('StorageArea')
            for sa in sas:
                saLocalID = sa.attributes['LocalID'].value
                saPath = getFirst(sa,"Path")
                saType =getFirst(sa,"Type")
                saUsedSpace = int(getFirstN(sa,"UsedSpace"))
                saAvailableSpace = int(getFirstN(sa,"AvailableSpace"))
                sa_query = 'SELECT * From StorageAreas WHERE localID= "%s" AND storageElement_id=%i' % (escape(saLocalID),se_id)
                cursor.execute(sa_query)
                r = cursor.fetchone()
                if (r==None):
                    sa_tuple = (se_id, escape(saLocalID), escape(saPath), escape(saType), saAvailableSpace, saUsedSpace )
                    sa_insert =  'INSERT INTO StorageAreas VALUES(NULL,%i,"%s","%s","%s",%i,%i)' % sa_tuple
                    cursor.execute(sa_insert)
                    sa_id = cursor.lastrowid
                else:
                    sa_id = r[0]

                acl = sa.getElementsByTagName("ACL")
                if (len(acl) > 0):
                    sACLs = acl[0].getElementsByTagName("Rule")
                else:
                    sACLs = []
                for rule in sACLs:
                    vo = rule.firstChild.wholeText
                    vo_select = 'SELECT * FROM storageAreaACLs WHERE storageArea_id=%i AND vo="%s"' % (sa_id, escape(vo))
                    cursor.execute(vo_select)
                    r = cursor.fetchone()
                    if (r == None):
                        cursor.execute('INSERT INTO storageAreaACLs VALUES (%i,"%s")' % (sa_id,escape(vo)))


        clusters = site.getElementsByTagName('Cluster')
        for cluster in clusters:
            clusterUniqueID  = cluster.attributes['UniqueID'].value
            clusterName = getFirst(cluster,"Name")
            clusterTmpDir = getFirst(cluster,"TmpDir")
            clusterWnDir = getFirst(cluster,"WNTmpDir")
            cluster_query = 'SELECT * From Clusters WHERE uniqueID= "%s"' % escape(clusterUniqueID)
            cursor.execute(cluster_query)
            r = cursor.fetchone()
            if (r == None):
                print "inserting cluster definition now..."
                cluster_tuple = (site_id,escape(clusterUniqueID), escape(clusterName),escape(clusterTmpDir), escape(clusterWnDir))
                cluster_insert = 'INSERT INTO Clusters VALUES(NULL,%i,"%s","%s","%s","%s")' % cluster_tuple
                print cluster_insert
                cursor.execute(cluster_insert)
                cluster_id = cursor.lastrowid
            else:
                cluster_id = r[0]

            subclusters = cluster.getElementsByTagName("SubCluster")
            for subcluster in subclusters:
                print "processing subcluster..."
                subUniqueID = subcluster.attributes['UniqueID'].value
                subName = getFirst(subcluster,"Name")
                subPhysicalCPUs = int(getFirstN(subcluster,"PhysicalCPUs"))
                subLogicalCPUs = int(getFirstN(subcluster,"LogicalCPUs"))
                subTmpDir = getFirst(subcluster,"TmpDir")
                subWnDir = getFirst(subcluster,"WNTmpDir")
                try:
                    subOS  = subcluster.getElementsByTagName("OperatingSystem")[0].attributes['Name'].value
                except IndexError:
                    subOS = "";
                try:
                    subProcessor = subcluster.getElementsByTagName("Processor")[0].attributes['Model'].value
                except IndexError:
                    subProcessor = "";
                try:
                    subNetwork = subcluster.getElementsByTagName("NetworkAdapter")[0].attributes['InboundIP'].value
                except KeyError:
                    subNetwork = ""
                except IndexError:
                    subNetwork = "";
                try:
                   subRAM = int(subcluster.getElementsByTagName("MainMemory")[0].attributes['RAMSize'].value)
                except IndexError:
                   subRAM = 0;
                try:
                   subVirtual = int(subcluster.getElementsByTagName("MainMemory")[0].attributes['VirtualSize'].value)
                except IndexError:
                   subVirtual = 0;
                try:
                   subArch      = subcluster.getElementsByTagName("Architecture")[0].attributes['PlatformType'].value
                except IndexError:
                   subArch = "";
                subcluster_query = 'SELECT * From SubClusters WHERE uniqueID= "%s"' % escape(subUniqueID)
                cursor.execute(subcluster_query)
                print subcluster_query
                r = cursor.fetchone()
                if (r == None):
                    print "inserting subcluster "
                    subcluster_tuple = (cluster_id, escape(subUniqueID), subPhysicalCPUs, subLogicalCPUs, escape(subOS),
                                        escape(subProcessor), escape(subNetwork), subRAM, subVirtual, escape(subArch),
                                        escape(subTmpDir),escape(subWnDir))
                    subcluster_insert = 'INSERT INTO SubClusters VALUES (NULL,%i,"%s",%i,%i,"%s","%s","%s",%i,%i,"%s","%s","%s")' % subcluster_tuple
                    print subcluster_insert
                    cursor.execute(subcluster_insert)
                    subcluster_id = cursor.lastrowid

                else:
                    subcluster_id = r[0]

                softwarePackages = subcluster.getElementsByTagName("SoftwarePackage")
                for package in softwarePackages:
                    packageLocalID = package.attributes['LocalID'].value
                    packageName = getFirst(package,"Name")
                    packageVersion = getFirst(package,"Version")
                    packageModule = getFirst(package,"Module")
                    package_query = 'SELECT * From SoftwarePackages WHERE LocalID="%s" AND subcluster_id=%i' % (escape(packageLocalID),subcluster_id)
                    cursor.execute(package_query)
                    r = cursor.fetchone()
                    if (r == None):
                        print "inserting software package"
                        package_tuple = (escape(packageLocalID), subcluster_id, escape(packageName), escape(packageVersion), escape(packageModule))
                        package_insert = 'INSERT INTO SoftwarePackages VALUES (NULL,"%s",%i,"%s","%s","%s")' % package_tuple
                        cursor.execute(package_insert)
                        package_id = cursor.lastrowid
                    else:
                        package_id = r[0]

                    acl = package.getElementsByTagName("ACL")
                    if (len(acl) > 0):
                        softwareACLs = acl[0].getElementsByTagName("Rule")
                    else:
                        softwareACLs = []
                    for rule in softwareACLs:
                        vo = rule.firstChild.wholeText
                        vo_select = 'SELECT * FROM softwarePackageACLs WHERE sp_id=%i AND vo="%s"' % (package_id, escape(vo))
                        cursor.execute(vo_select)
                        r = cursor.fetchone()
                        if (r == None):
                            cursor.execute('INSERT INTO softwarePackageACLs VALUES (%i,"%s")' % (package_id,escape(vo)))

                    executables = package.getElementsByTagName("SoftwareExecutable")
                    for executable in executables:
                        executableLocalID = executable.attributes['LocalID'].value
                        executableName = getFirst(executable,"Name")
                        executablePath = getFirst(executable,"Path")
                        isSerialS = getFirst(executable,"SerialAvail")
                        if (isSerialS == 'true'):
                            isSerial = 1;
                        else:
                            isSerial = 0;
                        isParallelS = getFirst(executable,"ParallelAvail")
                        if (isParallelS == 'true'):
                            isParallel = 1;
                        else:
                            isParallel = 0;
                        executable_query = 'SELECT * From SoftwareExecutables WHERE LocalID="%s" AND package_id=%i' % (escape(executableLocalID),package_id)
                        cursor.execute(executable_query)
                        r = cursor.fetchone()
                        if (r == None):
                            print "inserting executable"
                            executable_tuple  = (escape(executableLocalID), package_id, escape(executableName),escape(executablePath),isSerial,isParallel)
                            executable_insert = 'INSERT INTO SoftwareExecutables VALUES (NULL,"%s",%i,"%s","%s",%i,%i)' % executable_tuple
                            cursor.execute(executable_insert)
                        else:
                            print "software already inserted"


            ces = cluster.getElementsByTagName("ComputingElement")
            for ce in ces:
                print "processing CE"
                ceUniqueID = ce.attributes['UniqueID'].value
                ceName = getFirst(ce,"Name")
                lrmsType = getFirst(ce,"LRMSType")
                lrmsVersion = getFirst(ce,"LRMSVersion")
                gramVersion = getFirst(ce,"GRAMVersion")
                ceHost = getFirst(ce,"HostName")
                cePort = int(getFirstN(ce,"GateKeeperPort"))
                jobManager = getFirst(ce,"JobManager")
                contactString = getFirst(ce,"ContactString")
                appDir = getFirst(ce,"ApplicationDir")
                dataDir = getFirst(ce,"DataDir")
                defaultSE = getFirst(ce,"DefaultSE")

                query_for_se = 'SELECT ID FROM StorageElements WHERE UniqueID="%s"' % escape(defaultSE)
                cursor.execute(query_for_se)
                r = cursor.fetchone()
                if (r != None):
                    seId = r[0]
                else:
                    seId = -1;
                status = getFirst(ce,"Status")
                runningJobs =int(getFirstN(ce,"RunningJobs"))
                waitingJobs = int(getFirstN(ce,"WaitingJobs"))
                totalJobs = int(getFirstN(ce,"TotalJobs"))
                freeJobSlots = int(getFirstN(ce,"FreeJobSlots"))
                maxTime = int(getFirstN(ce,"MaxWallClockTime"))
                maxCpuTime = int(getFirstN(ce,"MaxCPUTime"))
                maxTotalJobs = int(getFirstN(ce,"MaxTotalJobs"))
                maxRunningJobs = int(getFirstN(ce,"MaxRunningJobs"))
                priority = int(getFirstN(ce,"Priority"))

                ce_query  = 'SELECT * From ComputeElements WHERE uniqueID= "%s"' % escape(ceUniqueID)
                cursor.execute(ce_query)
                r = cursor.fetchone()
                if (r == None):
                    ce_tuple = (cluster_id, escape(ceUniqueID), escape(ceName), escape(lrmsType), escape(lrmsVersion), escape(gramVersion), escape(ceHost),
                                cePort,escape(jobManager), escape(contactString), escape(appDir), escape(dataDir), int(seId), escape(status),
                                runningJobs, waitingJobs, totalJobs, freeJobSlots, maxTime, maxCpuTime,maxTotalJobs,maxRunningJobs,priority );
                    ce_insert = 'INSERT INTO ComputeElements VALUES (NULL,%i,"%s","%s","%s","%s","%s","%s",%i,"%s","%s","%s","%s",%i,"%s",%i,%i,%i,%i,%i,%i,%i,%i,%i)' % ce_tuple
                    cursor.execute(ce_insert)
                    ce_id = cursor.lastrowid
                else:
                    ce_id = r[0]

                voViews = ce.getElementsByTagName("VOView")
                for voView in voViews:
                    voViewID = voView.attributes['LocalID'].value
                    runningJobs =int(getFirstN(voView,"RunningJobs"))
                    waitingJobs = int(getFirstN(voView,"WaitingJobs"))
                    totalJobs = int(getFirstN(voView,"TotalJobs"))
                    freeJobSlots = int(getFirstN(voView,"FreeJobSlots"))
                    dataDir = getFirst(ce,"DataDir")
                    defaultSE = getFirst(ce,"DefaultSE")
                    query_for_se = 'SELECT ID FROM StorageElements WHERE UniqueID="%s"' % escape(defaultSE)
                    cursor.execute(query_for_se)
                    r = cursor.fetchone()
                    if (r != None):
                        seId = r[0]
                        voView_query  = 'SELECT * From voViews WHERE localId= "%s" AND ce_id=%i' % (escape(voViewID),ce_id)
                        cursor.execute(voView_query)
                        r = cursor.fetchone()
                    if (r==None):
                        voView_tuple = (escape(voViewID),ce_id,runningJobs,waitingJobs,totalJobs,freeJobSlots, seId,escape(dataDir))
                        voView_insert = 'INSERT INTO voViews Values(NULL,"%s",%i,%i,%i,%i,%i,%i,"%s")' % voView_tuple
                        cursor.execute(voView_insert)
                        voView_id = cursor.lastrowid
                    else:
                        voView_id = r[0]

                    vACLs = voView.getElementsByTagName("ACL")[0].getElementsByTagName("Rule")
                    for rule in vACLs:
                        vo = rule.firstChild.wholeText
                        vo_select = 'SELECT * FROM voViewACLs WHERE voView_id=%i AND vo="%s"' % (voView_id, escape(vo))
                        cursor.execute(vo_select)
                        r = cursor.fetchone()
                        if (r == None):
                            cursor.execute('INSERT INTO voViewACLs VALUES (%i,"%s")' % (voView_id,escape(vo)))


cursor.execute("COMMIT");











