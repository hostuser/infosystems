/*
 * XML Type:  SubClusterType
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2;


/**
 * An XML SubClusterType(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public interface SubClusterType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubClusterType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5E378313C67C9A33FF1E8A136471FF4E").resolveHandle("subclustertype09fetype");
    
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
     * Gets the "PhysicalCPUs" element
     */
    java.math.BigInteger getPhysicalCPUs();
    
    /**
     * Gets (as xml) the "PhysicalCPUs" element
     */
    org.apache.xmlbeans.XmlInteger xgetPhysicalCPUs();
    
    /**
     * True if has "PhysicalCPUs" element
     */
    boolean isSetPhysicalCPUs();
    
    /**
     * Sets the "PhysicalCPUs" element
     */
    void setPhysicalCPUs(java.math.BigInteger physicalCPUs);
    
    /**
     * Sets (as xml) the "PhysicalCPUs" element
     */
    void xsetPhysicalCPUs(org.apache.xmlbeans.XmlInteger physicalCPUs);
    
    /**
     * Unsets the "PhysicalCPUs" element
     */
    void unsetPhysicalCPUs();
    
    /**
     * Gets the "LogicalCPUs" element
     */
    java.math.BigInteger getLogicalCPUs();
    
    /**
     * Gets (as xml) the "LogicalCPUs" element
     */
    org.apache.xmlbeans.XmlInteger xgetLogicalCPUs();
    
    /**
     * True if has "LogicalCPUs" element
     */
    boolean isSetLogicalCPUs();
    
    /**
     * Sets the "LogicalCPUs" element
     */
    void setLogicalCPUs(java.math.BigInteger logicalCPUs);
    
    /**
     * Sets (as xml) the "LogicalCPUs" element
     */
    void xsetLogicalCPUs(org.apache.xmlbeans.XmlInteger logicalCPUs);
    
    /**
     * Unsets the "LogicalCPUs" element
     */
    void unsetLogicalCPUs();
    
    /**
     * Gets the "TmpDir" element
     */
    java.lang.String getTmpDir();
    
    /**
     * Gets (as xml) the "TmpDir" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType xgetTmpDir();
    
    /**
     * True if has "TmpDir" element
     */
    boolean isSetTmpDir();
    
    /**
     * Sets the "TmpDir" element
     */
    void setTmpDir(java.lang.String tmpDir);
    
    /**
     * Sets (as xml) the "TmpDir" element
     */
    void xsetTmpDir(it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType tmpDir);
    
    /**
     * Unsets the "TmpDir" element
     */
    void unsetTmpDir();
    
    /**
     * Gets the "WNTmpDir" element
     */
    java.lang.String getWNTmpDir();
    
    /**
     * Gets (as xml) the "WNTmpDir" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType xgetWNTmpDir();
    
    /**
     * True if has "WNTmpDir" element
     */
    boolean isSetWNTmpDir();
    
    /**
     * Sets the "WNTmpDir" element
     */
    void setWNTmpDir(java.lang.String wnTmpDir);
    
    /**
     * Sets (as xml) the "WNTmpDir" element
     */
    void xsetWNTmpDir(it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType wnTmpDir);
    
    /**
     * Unsets the "WNTmpDir" element
     */
    void unsetWNTmpDir();
    
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
    it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType getProcessor();
    
    /**
     * True if has "Processor" element
     */
    boolean isSetProcessor();
    
    /**
     * Sets the "Processor" element
     */
    void setProcessor(it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType processor);
    
    /**
     * Appends and returns a new empty "Processor" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType addNewProcessor();
    
    /**
     * Unsets the "Processor" element
     */
    void unsetProcessor();
    
    /**
     * Gets the "NetworkAdapter" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.NetworkAdapterType getNetworkAdapter();
    
    /**
     * True if has "NetworkAdapter" element
     */
    boolean isSetNetworkAdapter();
    
    /**
     * Sets the "NetworkAdapter" element
     */
    void setNetworkAdapter(it.infn.cnaf.forge.glueschema.spec.v12.r2.NetworkAdapterType networkAdapter);
    
    /**
     * Appends and returns a new empty "NetworkAdapter" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.NetworkAdapterType addNewNetworkAdapter();
    
    /**
     * Unsets the "NetworkAdapter" element
     */
    void unsetNetworkAdapter();
    
    /**
     * Gets the "MainMemory" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.MainMemoryType getMainMemory();
    
    /**
     * True if has "MainMemory" element
     */
    boolean isSetMainMemory();
    
    /**
     * Sets the "MainMemory" element
     */
    void setMainMemory(it.infn.cnaf.forge.glueschema.spec.v12.r2.MainMemoryType mainMemory);
    
    /**
     * Appends and returns a new empty "MainMemory" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.MainMemoryType addNewMainMemory();
    
    /**
     * Unsets the "MainMemory" element
     */
    void unsetMainMemory();
    
    /**
     * Gets the "Architecture" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.HostArchitectureType getArchitecture();
    
    /**
     * True if has "Architecture" element
     */
    boolean isSetArchitecture();
    
    /**
     * Sets the "Architecture" element
     */
    void setArchitecture(it.infn.cnaf.forge.glueschema.spec.v12.r2.HostArchitectureType architecture);
    
    /**
     * Appends and returns a new empty "Architecture" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.HostArchitectureType addNewArchitecture();
    
    /**
     * Unsets the "Architecture" element
     */
    void unsetArchitecture();
    
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
     * Gets array of all "Location" elements
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType.Location[] getLocationArray();
    
    /**
     * Gets ith "Location" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType.Location getLocationArray(int i);
    
    /**
     * Returns number of "Location" element
     */
    int sizeOfLocationArray();
    
    /**
     * Sets array of all "Location" element
     */
    void setLocationArray(it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType.Location[] locationArray);
    
    /**
     * Sets ith "Location" element
     */
    void setLocationArray(int i, it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType.Location location);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Location" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType.Location insertNewLocation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Location" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType.Location addNewLocation();
    
    /**
     * Removes the ith "Location" element
     */
    void removeLocation(int i);
    
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
     * An XML Location(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
     *
     * This is a complex type.
     */
    public interface Location extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Location.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5E378313C67C9A33FF1E8A136471FF4E").resolveHandle("location9e2felemtype");
        
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
         * Gets the "Version" element
         */
        java.lang.String getVersion();
        
        /**
         * Gets (as xml) the "Version" element
         */
        org.apache.xmlbeans.XmlString xgetVersion();
        
        /**
         * True if has "Version" element
         */
        boolean isSetVersion();
        
        /**
         * Sets the "Version" element
         */
        void setVersion(java.lang.String version);
        
        /**
         * Sets (as xml) the "Version" element
         */
        void xsetVersion(org.apache.xmlbeans.XmlString version);
        
        /**
         * Unsets the "Version" element
         */
        void unsetVersion();
        
        /**
         * Gets the "Path" element
         */
        java.lang.String getPath();
        
        /**
         * Gets (as xml) the "Path" element
         */
        org.apache.xmlbeans.XmlString xgetPath();
        
        /**
         * True if has "Path" element
         */
        boolean isSetPath();
        
        /**
         * Sets the "Path" element
         */
        void setPath(java.lang.String path);
        
        /**
         * Sets (as xml) the "Path" element
         */
        void xsetPath(org.apache.xmlbeans.XmlString path);
        
        /**
         * Unsets the "Path" element
         */
        void unsetPath();
        
        /**
         * Gets the "LocalID" attribute
         */
        java.lang.String getLocalID();
        
        /**
         * Gets (as xml) the "LocalID" attribute
         */
        it.infn.cnaf.forge.glueschema.spec.v12.r2.LocalIDType xgetLocalID();
        
        /**
         * Sets the "LocalID" attribute
         */
        void setLocalID(java.lang.String localID);
        
        /**
         * Sets (as xml) the "LocalID" attribute
         */
        void xsetLocalID(it.infn.cnaf.forge.glueschema.spec.v12.r2.LocalIDType localID);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType.Location newInstance() {
              return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType.Location) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType.Location newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType.Location) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType newInstance() {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
