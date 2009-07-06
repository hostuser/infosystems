/*
 * XML Type:  HostType
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2;


/**
 * An XML HostType(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public interface HostType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HostType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5E378313C67C9A33FF1E8A136471FF4E").resolveHandle("hosttype71f0type");
    
    /**
     * Gets the "Name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "Name" element
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * True if has "Name" element
     */
    boolean isSetName();
    
    /**
     * Sets the "Name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "Name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Unsets the "Name" element
     */
    void unsetName();
    
    /**
     * Gets the "UpTime" element
     */
    java.math.BigInteger getUpTime();
    
    /**
     * Gets (as xml) the "UpTime" element
     */
    org.apache.xmlbeans.XmlInteger xgetUpTime();
    
    /**
     * True if has "UpTime" element
     */
    boolean isSetUpTime();
    
    /**
     * Sets the "UpTime" element
     */
    void setUpTime(java.math.BigInteger upTime);
    
    /**
     * Sets (as xml) the "UpTime" element
     */
    void xsetUpTime(org.apache.xmlbeans.XmlInteger upTime);
    
    /**
     * Unsets the "UpTime" element
     */
    void unsetUpTime();
    
    /**
     * Gets the "Architecture" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.HostArchitectureFullType getArchitecture();
    
    /**
     * True if has "Architecture" element
     */
    boolean isSetArchitecture();
    
    /**
     * Sets the "Architecture" element
     */
    void setArchitecture(it.infn.cnaf.forge.glueschema.spec.v12.r2.HostArchitectureFullType architecture);
    
    /**
     * Appends and returns a new empty "Architecture" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.HostArchitectureFullType addNewArchitecture();
    
    /**
     * Unsets the "Architecture" element
     */
    void unsetArchitecture();
    
    /**
     * Gets the "MainMemory" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.MainMemoryFullType getMainMemory();
    
    /**
     * True if has "MainMemory" element
     */
    boolean isSetMainMemory();
    
    /**
     * Sets the "MainMemory" element
     */
    void setMainMemory(it.infn.cnaf.forge.glueschema.spec.v12.r2.MainMemoryFullType mainMemory);
    
    /**
     * Appends and returns a new empty "MainMemory" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.MainMemoryFullType addNewMainMemory();
    
    /**
     * Unsets the "MainMemory" element
     */
    void unsetMainMemory();
    
    /**
     * Gets the "OperatingSystem" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.OperatingSystemType getOperatingSystem();
    
    /**
     * True if has "OperatingSystem" element
     */
    boolean isSetOperatingSystem();
    
    /**
     * Sets the "OperatingSystem" element
     */
    void setOperatingSystem(it.infn.cnaf.forge.glueschema.spec.v12.r2.OperatingSystemType operatingSystem);
    
    /**
     * Appends and returns a new empty "OperatingSystem" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.OperatingSystemType addNewOperatingSystem();
    
    /**
     * Unsets the "OperatingSystem" element
     */
    void unsetOperatingSystem();
    
    /**
     * Gets the "Processor" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType getProcessor();
    
    /**
     * True if has "Processor" element
     */
    boolean isSetProcessor();
    
    /**
     * Sets the "Processor" element
     */
    void setProcessor(it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType processor);
    
    /**
     * Appends and returns a new empty "Processor" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType addNewProcessor();
    
    /**
     * Unsets the "Processor" element
     */
    void unsetProcessor();
    
    /**
     * Gets the "Load" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.LoadType getLoad();
    
    /**
     * True if has "Load" element
     */
    boolean isSetLoad();
    
    /**
     * Sets the "Load" element
     */
    void setLoad(it.infn.cnaf.forge.glueschema.spec.v12.r2.LoadType load);
    
    /**
     * Appends and returns a new empty "Load" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.LoadType addNewLoad();
    
    /**
     * Unsets the "Load" element
     */
    void unsetLoad();
    
    /**
     * Gets array of all "NetworkAdapter" elements
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.NetworkAdapterFullType[] getNetworkAdapterArray();
    
    /**
     * Gets ith "NetworkAdapter" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.NetworkAdapterFullType getNetworkAdapterArray(int i);
    
    /**
     * Returns number of "NetworkAdapter" element
     */
    int sizeOfNetworkAdapterArray();
    
    /**
     * Sets array of all "NetworkAdapter" element
     */
    void setNetworkAdapterArray(it.infn.cnaf.forge.glueschema.spec.v12.r2.NetworkAdapterFullType[] networkAdapterArray);
    
    /**
     * Sets ith "NetworkAdapter" element
     */
    void setNetworkAdapterArray(int i, it.infn.cnaf.forge.glueschema.spec.v12.r2.NetworkAdapterFullType networkAdapter);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "NetworkAdapter" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.NetworkAdapterFullType insertNewNetworkAdapter(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "NetworkAdapter" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.NetworkAdapterFullType addNewNetworkAdapter();
    
    /**
     * Removes the ith "NetworkAdapter" element
     */
    void removeNetworkAdapter(int i);
    
    /**
     * Gets the "Benchmark" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.BenchmarkType getBenchmark();
    
    /**
     * True if has "Benchmark" element
     */
    boolean isSetBenchmark();
    
    /**
     * Sets the "Benchmark" element
     */
    void setBenchmark(it.infn.cnaf.forge.glueschema.spec.v12.r2.BenchmarkType benchmark);
    
    /**
     * Appends and returns a new empty "Benchmark" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.BenchmarkType addNewBenchmark();
    
    /**
     * Unsets the "Benchmark" element
     */
    void unsetBenchmark();
    
    /**
     * Gets the "RunTimeEnv" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.RunTimeEnvType getRunTimeEnv();
    
    /**
     * True if has "RunTimeEnv" element
     */
    boolean isSetRunTimeEnv();
    
    /**
     * Sets the "RunTimeEnv" element
     */
    void setRunTimeEnv(it.infn.cnaf.forge.glueschema.spec.v12.r2.RunTimeEnvType runTimeEnv);
    
    /**
     * Appends and returns a new empty "RunTimeEnv" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.RunTimeEnvType addNewRunTimeEnv();
    
    /**
     * Unsets the "RunTimeEnv" element
     */
    void unsetRunTimeEnv();
    
    /**
     * Gets array of all "StorageDevice" elements
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageDeviceType[] getStorageDeviceArray();
    
    /**
     * Gets ith "StorageDevice" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageDeviceType getStorageDeviceArray(int i);
    
    /**
     * Returns number of "StorageDevice" element
     */
    int sizeOfStorageDeviceArray();
    
    /**
     * Sets array of all "StorageDevice" element
     */
    void setStorageDeviceArray(it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageDeviceType[] storageDeviceArray);
    
    /**
     * Sets ith "StorageDevice" element
     */
    void setStorageDeviceArray(int i, it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageDeviceType storageDevice);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StorageDevice" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageDeviceType insertNewStorageDevice(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StorageDevice" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageDeviceType addNewStorageDevice();
    
    /**
     * Removes the ith "StorageDevice" element
     */
    void removeStorageDevice(int i);
    
    /**
     * Gets array of all "StoragePartition" elements
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.StoragePartitionType[] getStoragePartitionArray();
    
    /**
     * Gets ith "StoragePartition" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.StoragePartitionType getStoragePartitionArray(int i);
    
    /**
     * Returns number of "StoragePartition" element
     */
    int sizeOfStoragePartitionArray();
    
    /**
     * Sets array of all "StoragePartition" element
     */
    void setStoragePartitionArray(it.infn.cnaf.forge.glueschema.spec.v12.r2.StoragePartitionType[] storagePartitionArray);
    
    /**
     * Sets ith "StoragePartition" element
     */
    void setStoragePartitionArray(int i, it.infn.cnaf.forge.glueschema.spec.v12.r2.StoragePartitionType storagePartition);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StoragePartition" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.StoragePartitionType insertNewStoragePartition(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StoragePartition" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.StoragePartitionType addNewStoragePartition();
    
    /**
     * Removes the ith "StoragePartition" element
     */
    void removeStoragePartition(int i);
    
    /**
     * Gets array of all "LocalFileSystem" elements
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType[] getLocalFileSystemArray();
    
    /**
     * Gets ith "LocalFileSystem" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType getLocalFileSystemArray(int i);
    
    /**
     * Returns number of "LocalFileSystem" element
     */
    int sizeOfLocalFileSystemArray();
    
    /**
     * Sets array of all "LocalFileSystem" element
     */
    void setLocalFileSystemArray(it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType[] localFileSystemArray);
    
    /**
     * Sets ith "LocalFileSystem" element
     */
    void setLocalFileSystemArray(int i, it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType localFileSystem);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LocalFileSystem" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType insertNewLocalFileSystem(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LocalFileSystem" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType addNewLocalFileSystem();
    
    /**
     * Removes the ith "LocalFileSystem" element
     */
    void removeLocalFileSystem(int i);
    
    /**
     * Gets array of all "RemoteFileSystem" elements
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType[] getRemoteFileSystemArray();
    
    /**
     * Gets ith "RemoteFileSystem" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType getRemoteFileSystemArray(int i);
    
    /**
     * Returns number of "RemoteFileSystem" element
     */
    int sizeOfRemoteFileSystemArray();
    
    /**
     * Sets array of all "RemoteFileSystem" element
     */
    void setRemoteFileSystemArray(it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType[] remoteFileSystemArray);
    
    /**
     * Sets ith "RemoteFileSystem" element
     */
    void setRemoteFileSystemArray(int i, it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType remoteFileSystem);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RemoteFileSystem" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType insertNewRemoteFileSystem(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RemoteFileSystem" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType addNewRemoteFileSystem();
    
    /**
     * Removes the ith "RemoteFileSystem" element
     */
    void removeRemoteFileSystem(int i);
    
    /**
     * Gets array of all "StorageDevice2StoragePartition" elements
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StorageDevice2StoragePartition[] getStorageDevice2StoragePartitionArray();
    
    /**
     * Gets ith "StorageDevice2StoragePartition" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StorageDevice2StoragePartition getStorageDevice2StoragePartitionArray(int i);
    
    /**
     * Returns number of "StorageDevice2StoragePartition" element
     */
    int sizeOfStorageDevice2StoragePartitionArray();
    
    /**
     * Sets array of all "StorageDevice2StoragePartition" element
     */
    void setStorageDevice2StoragePartitionArray(it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StorageDevice2StoragePartition[] storageDevice2StoragePartitionArray);
    
    /**
     * Sets ith "StorageDevice2StoragePartition" element
     */
    void setStorageDevice2StoragePartitionArray(int i, it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StorageDevice2StoragePartition storageDevice2StoragePartition);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StorageDevice2StoragePartition" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StorageDevice2StoragePartition insertNewStorageDevice2StoragePartition(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StorageDevice2StoragePartition" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StorageDevice2StoragePartition addNewStorageDevice2StoragePartition();
    
    /**
     * Removes the ith "StorageDevice2StoragePartition" element
     */
    void removeStorageDevice2StoragePartition(int i);
    
    /**
     * Gets array of all "StoragePartition2FileSystem" elements
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StoragePartition2FileSystem[] getStoragePartition2FileSystemArray();
    
    /**
     * Gets ith "StoragePartition2FileSystem" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StoragePartition2FileSystem getStoragePartition2FileSystemArray(int i);
    
    /**
     * Returns number of "StoragePartition2FileSystem" element
     */
    int sizeOfStoragePartition2FileSystemArray();
    
    /**
     * Sets array of all "StoragePartition2FileSystem" element
     */
    void setStoragePartition2FileSystemArray(it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StoragePartition2FileSystem[] storagePartition2FileSystemArray);
    
    /**
     * Sets ith "StoragePartition2FileSystem" element
     */
    void setStoragePartition2FileSystemArray(int i, it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StoragePartition2FileSystem storagePartition2FileSystem);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StoragePartition2FileSystem" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StoragePartition2FileSystem insertNewStoragePartition2FileSystem(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StoragePartition2FileSystem" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StoragePartition2FileSystem addNewStoragePartition2FileSystem();
    
    /**
     * Removes the ith "StoragePartition2FileSystem" element
     */
    void removeStoragePartition2FileSystem(int i);
    
    /**
     * Gets the "UniqueID" attribute
     */
    java.lang.String getUniqueID();
    
    /**
     * Gets (as xml) the "UniqueID" attribute
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType xgetUniqueID();
    
    /**
     * Sets the "UniqueID" attribute
     */
    void setUniqueID(java.lang.String uniqueID);
    
    /**
     * Sets (as xml) the "UniqueID" attribute
     */
    void xsetUniqueID(it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType uniqueID);
    
    /**
     * An XML StorageDevice2StoragePartition(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
     *
     * This is a complex type.
     */
    public interface StorageDevice2StoragePartition extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StorageDevice2StoragePartition.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5E378313C67C9A33FF1E8A136471FF4E").resolveHandle("storagedevice2storagepartitionc11celemtype");
        
        /**
         * Gets the "StorageDeviceName" attribute
         */
        java.lang.String getStorageDeviceName();
        
        /**
         * Gets (as xml) the "StorageDeviceName" attribute
         */
        org.apache.xmlbeans.XmlString xgetStorageDeviceName();
        
        /**
         * Sets the "StorageDeviceName" attribute
         */
        void setStorageDeviceName(java.lang.String storageDeviceName);
        
        /**
         * Sets (as xml) the "StorageDeviceName" attribute
         */
        void xsetStorageDeviceName(org.apache.xmlbeans.XmlString storageDeviceName);
        
        /**
         * Gets the "StoragePartitionName" attribute
         */
        java.lang.String getStoragePartitionName();
        
        /**
         * Gets (as xml) the "StoragePartitionName" attribute
         */
        org.apache.xmlbeans.XmlString xgetStoragePartitionName();
        
        /**
         * Sets the "StoragePartitionName" attribute
         */
        void setStoragePartitionName(java.lang.String storagePartitionName);
        
        /**
         * Sets (as xml) the "StoragePartitionName" attribute
         */
        void xsetStoragePartitionName(org.apache.xmlbeans.XmlString storagePartitionName);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StorageDevice2StoragePartition newInstance() {
              return (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StorageDevice2StoragePartition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StorageDevice2StoragePartition newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StorageDevice2StoragePartition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML StoragePartition2FileSystem(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
     *
     * This is a complex type.
     */
    public interface StoragePartition2FileSystem extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StoragePartition2FileSystem.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5E378313C67C9A33FF1E8A136471FF4E").resolveHandle("storagepartition2filesystemadcaelemtype");
        
        /**
         * Gets the "StoragePartitionName" attribute
         */
        java.lang.String getStoragePartitionName();
        
        /**
         * Gets (as xml) the "StoragePartitionName" attribute
         */
        org.apache.xmlbeans.XmlString xgetStoragePartitionName();
        
        /**
         * Sets the "StoragePartitionName" attribute
         */
        void setStoragePartitionName(java.lang.String storagePartitionName);
        
        /**
         * Sets (as xml) the "StoragePartitionName" attribute
         */
        void xsetStoragePartitionName(org.apache.xmlbeans.XmlString storagePartitionName);
        
        /**
         * Gets the "FileSystemName" attribute
         */
        java.lang.String getFileSystemName();
        
        /**
         * Gets (as xml) the "FileSystemName" attribute
         */
        org.apache.xmlbeans.XmlString xgetFileSystemName();
        
        /**
         * Sets the "FileSystemName" attribute
         */
        void setFileSystemName(java.lang.String fileSystemName);
        
        /**
         * Sets (as xml) the "FileSystemName" attribute
         */
        void xsetFileSystemName(org.apache.xmlbeans.XmlString fileSystemName);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StoragePartition2FileSystem newInstance() {
              return (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StoragePartition2FileSystem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StoragePartition2FileSystem newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StoragePartition2FileSystem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType newInstance() {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
