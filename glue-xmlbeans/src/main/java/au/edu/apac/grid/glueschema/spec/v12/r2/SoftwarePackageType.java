/*
 * XML Type:  SoftwarePackageType
 * Namespace: http://grid.apac.edu.au/glueschema/Spec/V12/R2
 * Java type: au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType
 *
 * Automatically generated - do not modify.
 */
package au.edu.apac.grid.glueschema.spec.v12.r2;


/**
 * An XML SoftwarePackageType(@http://grid.apac.edu.au/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public interface SoftwarePackageType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SoftwarePackageType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5E378313C67C9A33FF1E8A136471FF4E").resolveHandle("softwarepackagetypefe1ftype");
    
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
     * Gets the "QueueResource" element
     */
    java.lang.String getQueueResource();
    
    /**
     * Gets (as xml) the "QueueResource" element
     */
    org.apache.xmlbeans.XmlString xgetQueueResource();
    
    /**
     * True if has "QueueResource" element
     */
    boolean isSetQueueResource();
    
    /**
     * Sets the "QueueResource" element
     */
    void setQueueResource(java.lang.String queueResource);
    
    /**
     * Sets (as xml) the "QueueResource" element
     */
    void xsetQueueResource(org.apache.xmlbeans.XmlString queueResource);
    
    /**
     * Unsets the "QueueResource" element
     */
    void unsetQueueResource();
    
    /**
     * Gets the "Module" element
     */
    java.lang.String getModule();
    
    /**
     * Gets (as xml) the "Module" element
     */
    org.apache.xmlbeans.XmlString xgetModule();
    
    /**
     * True if has "Module" element
     */
    boolean isSetModule();
    
    /**
     * Sets the "Module" element
     */
    void setModule(java.lang.String module);
    
    /**
     * Sets (as xml) the "Module" element
     */
    void xsetModule(org.apache.xmlbeans.XmlString module);
    
    /**
     * Unsets the "Module" element
     */
    void unsetModule();
    
    /**
     * Gets the "SerialAvail" element
     */
    boolean getSerialAvail();
    
    /**
     * Gets (as xml) the "SerialAvail" element
     */
    org.apache.xmlbeans.XmlBoolean xgetSerialAvail();
    
    /**
     * True if has "SerialAvail" element
     */
    boolean isSetSerialAvail();
    
    /**
     * Sets the "SerialAvail" element
     */
    void setSerialAvail(boolean serialAvail);
    
    /**
     * Sets (as xml) the "SerialAvail" element
     */
    void xsetSerialAvail(org.apache.xmlbeans.XmlBoolean serialAvail);
    
    /**
     * Unsets the "SerialAvail" element
     */
    void unsetSerialAvail();
    
    /**
     * Gets the "ParallelAvail" element
     */
    boolean getParallelAvail();
    
    /**
     * Gets (as xml) the "ParallelAvail" element
     */
    org.apache.xmlbeans.XmlBoolean xgetParallelAvail();
    
    /**
     * True if has "ParallelAvail" element
     */
    boolean isSetParallelAvail();
    
    /**
     * Sets the "ParallelAvail" element
     */
    void setParallelAvail(boolean parallelAvail);
    
    /**
     * Sets (as xml) the "ParallelAvail" element
     */
    void xsetParallelAvail(org.apache.xmlbeans.XmlBoolean parallelAvail);
    
    /**
     * Unsets the "ParallelAvail" element
     */
    void unsetParallelAvail();
    
    /**
     * Gets the "ParallelMaxCPUs" element
     */
    java.math.BigInteger getParallelMaxCPUs();
    
    /**
     * Gets (as xml) the "ParallelMaxCPUs" element
     */
    org.apache.xmlbeans.XmlInteger xgetParallelMaxCPUs();
    
    /**
     * True if has "ParallelMaxCPUs" element
     */
    boolean isSetParallelMaxCPUs();
    
    /**
     * Sets the "ParallelMaxCPUs" element
     */
    void setParallelMaxCPUs(java.math.BigInteger parallelMaxCPUs);
    
    /**
     * Sets (as xml) the "ParallelMaxCPUs" element
     */
    void xsetParallelMaxCPUs(org.apache.xmlbeans.XmlInteger parallelMaxCPUs);
    
    /**
     * Unsets the "ParallelMaxCPUs" element
     */
    void unsetParallelMaxCPUs();
    
    /**
     * Gets array of all "SupportedParallelType" elements
     */
    java.lang.String[] getSupportedParallelTypeArray();
    
    /**
     * Gets ith "SupportedParallelType" element
     */
    java.lang.String getSupportedParallelTypeArray(int i);
    
    /**
     * Gets (as xml) array of all "SupportedParallelType" elements
     */
    org.apache.xmlbeans.XmlString[] xgetSupportedParallelTypeArray();
    
    /**
     * Gets (as xml) ith "SupportedParallelType" element
     */
    org.apache.xmlbeans.XmlString xgetSupportedParallelTypeArray(int i);
    
    /**
     * Returns number of "SupportedParallelType" element
     */
    int sizeOfSupportedParallelTypeArray();
    
    /**
     * Sets array of all "SupportedParallelType" element
     */
    void setSupportedParallelTypeArray(java.lang.String[] supportedParallelTypeArray);
    
    /**
     * Sets ith "SupportedParallelType" element
     */
    void setSupportedParallelTypeArray(int i, java.lang.String supportedParallelType);
    
    /**
     * Sets (as xml) array of all "SupportedParallelType" element
     */
    void xsetSupportedParallelTypeArray(org.apache.xmlbeans.XmlString[] supportedParallelTypeArray);
    
    /**
     * Sets (as xml) ith "SupportedParallelType" element
     */
    void xsetSupportedParallelTypeArray(int i, org.apache.xmlbeans.XmlString supportedParallelType);
    
    /**
     * Inserts the value as the ith "SupportedParallelType" element
     */
    void insertSupportedParallelType(int i, java.lang.String supportedParallelType);
    
    /**
     * Appends the value as the last "SupportedParallelType" element
     */
    void addSupportedParallelType(java.lang.String supportedParallelType);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SupportedParallelType" element
     */
    org.apache.xmlbeans.XmlString insertNewSupportedParallelType(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SupportedParallelType" element
     */
    org.apache.xmlbeans.XmlString addNewSupportedParallelType();
    
    /**
     * Removes the ith "SupportedParallelType" element
     */
    void removeSupportedParallelType(int i);
    
    /**
     * Gets the "LicenseType" element
     */
    java.lang.String getLicenseType();
    
    /**
     * Gets (as xml) the "LicenseType" element
     */
    org.apache.xmlbeans.XmlString xgetLicenseType();
    
    /**
     * True if has "LicenseType" element
     */
    boolean isSetLicenseType();
    
    /**
     * Sets the "LicenseType" element
     */
    void setLicenseType(java.lang.String licenseType);
    
    /**
     * Sets (as xml) the "LicenseType" element
     */
    void xsetLicenseType(org.apache.xmlbeans.XmlString licenseType);
    
    /**
     * Unsets the "LicenseType" element
     */
    void unsetLicenseType();
    
    /**
     * Gets the "TotalCPUSeats" element
     */
    java.math.BigInteger getTotalCPUSeats();
    
    /**
     * Gets (as xml) the "TotalCPUSeats" element
     */
    org.apache.xmlbeans.XmlInteger xgetTotalCPUSeats();
    
    /**
     * True if has "TotalCPUSeats" element
     */
    boolean isSetTotalCPUSeats();
    
    /**
     * Sets the "TotalCPUSeats" element
     */
    void setTotalCPUSeats(java.math.BigInteger totalCPUSeats);
    
    /**
     * Sets (as xml) the "TotalCPUSeats" element
     */
    void xsetTotalCPUSeats(org.apache.xmlbeans.XmlInteger totalCPUSeats);
    
    /**
     * Unsets the "TotalCPUSeats" element
     */
    void unsetTotalCPUSeats();
    
    /**
     * Gets the "FreeCPUSeats" element
     */
    java.math.BigInteger getFreeCPUSeats();
    
    /**
     * Gets (as xml) the "FreeCPUSeats" element
     */
    org.apache.xmlbeans.XmlInteger xgetFreeCPUSeats();
    
    /**
     * True if has "FreeCPUSeats" element
     */
    boolean isSetFreeCPUSeats();
    
    /**
     * Sets the "FreeCPUSeats" element
     */
    void setFreeCPUSeats(java.math.BigInteger freeCPUSeats);
    
    /**
     * Sets (as xml) the "FreeCPUSeats" element
     */
    void xsetFreeCPUSeats(org.apache.xmlbeans.XmlInteger freeCPUSeats);
    
    /**
     * Unsets the "FreeCPUSeats" element
     */
    void unsetFreeCPUSeats();
    
    /**
     * Gets the "TotalJobSeats" element
     */
    java.math.BigInteger getTotalJobSeats();
    
    /**
     * Gets (as xml) the "TotalJobSeats" element
     */
    org.apache.xmlbeans.XmlInteger xgetTotalJobSeats();
    
    /**
     * True if has "TotalJobSeats" element
     */
    boolean isSetTotalJobSeats();
    
    /**
     * Sets the "TotalJobSeats" element
     */
    void setTotalJobSeats(java.math.BigInteger totalJobSeats);
    
    /**
     * Sets (as xml) the "TotalJobSeats" element
     */
    void xsetTotalJobSeats(org.apache.xmlbeans.XmlInteger totalJobSeats);
    
    /**
     * Unsets the "TotalJobSeats" element
     */
    void unsetTotalJobSeats();
    
    /**
     * Gets the "FreeJobSeats" element
     */
    java.math.BigInteger getFreeJobSeats();
    
    /**
     * Gets (as xml) the "FreeJobSeats" element
     */
    org.apache.xmlbeans.XmlInteger xgetFreeJobSeats();
    
    /**
     * True if has "FreeJobSeats" element
     */
    boolean isSetFreeJobSeats();
    
    /**
     * Sets the "FreeJobSeats" element
     */
    void setFreeJobSeats(java.math.BigInteger freeJobSeats);
    
    /**
     * Sets (as xml) the "FreeJobSeats" element
     */
    void xsetFreeJobSeats(org.apache.xmlbeans.XmlInteger freeJobSeats);
    
    /**
     * Unsets the "FreeJobSeats" element
     */
    void unsetFreeJobSeats();
    
    /**
     * Gets the "TotalUserSeats" element
     */
    java.math.BigInteger getTotalUserSeats();
    
    /**
     * Gets (as xml) the "TotalUserSeats" element
     */
    org.apache.xmlbeans.XmlInteger xgetTotalUserSeats();
    
    /**
     * True if has "TotalUserSeats" element
     */
    boolean isSetTotalUserSeats();
    
    /**
     * Sets the "TotalUserSeats" element
     */
    void setTotalUserSeats(java.math.BigInteger totalUserSeats);
    
    /**
     * Sets (as xml) the "TotalUserSeats" element
     */
    void xsetTotalUserSeats(org.apache.xmlbeans.XmlInteger totalUserSeats);
    
    /**
     * Unsets the "TotalUserSeats" element
     */
    void unsetTotalUserSeats();
    
    /**
     * Gets the "FreeUserSeats" element
     */
    java.math.BigInteger getFreeUserSeats();
    
    /**
     * Gets (as xml) the "FreeUserSeats" element
     */
    org.apache.xmlbeans.XmlInteger xgetFreeUserSeats();
    
    /**
     * True if has "FreeUserSeats" element
     */
    boolean isSetFreeUserSeats();
    
    /**
     * Sets the "FreeUserSeats" element
     */
    void setFreeUserSeats(java.math.BigInteger freeUserSeats);
    
    /**
     * Sets (as xml) the "FreeUserSeats" element
     */
    void xsetFreeUserSeats(org.apache.xmlbeans.XmlInteger freeUserSeats);
    
    /**
     * Unsets the "FreeUserSeats" element
     */
    void unsetFreeUserSeats();
    
    /**
     * Gets the "ACL" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.ACLType getACL();
    
    /**
     * True if has "ACL" element
     */
    boolean isSetACL();
    
    /**
     * Sets the "ACL" element
     */
    void setACL(it.infn.cnaf.forge.glueschema.spec.v12.r2.ACLType acl);
    
    /**
     * Appends and returns a new empty "ACL" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.ACLType addNewACL();
    
    /**
     * Unsets the "ACL" element
     */
    void unsetACL();
    
    /**
     * Gets array of all "VOView" elements
     */
    au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType[] getVOViewArray();
    
    /**
     * Gets ith "VOView" element
     */
    au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType getVOViewArray(int i);
    
    /**
     * Returns number of "VOView" element
     */
    int sizeOfVOViewArray();
    
    /**
     * Sets array of all "VOView" element
     */
    void setVOViewArray(au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType[] voViewArray);
    
    /**
     * Sets ith "VOView" element
     */
    void setVOViewArray(int i, au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType voView);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "VOView" element
     */
    au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType insertNewVOView(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "VOView" element
     */
    au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType addNewVOView();
    
    /**
     * Removes the ith "VOView" element
     */
    void removeVOView(int i);
    
    /**
     * Gets array of all "SoftwareExecutable" elements
     */
    au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType[] getSoftwareExecutableArray();
    
    /**
     * Gets ith "SoftwareExecutable" element
     */
    au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType getSoftwareExecutableArray(int i);
    
    /**
     * Returns number of "SoftwareExecutable" element
     */
    int sizeOfSoftwareExecutableArray();
    
    /**
     * Sets array of all "SoftwareExecutable" element
     */
    void setSoftwareExecutableArray(au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType[] softwareExecutableArray);
    
    /**
     * Sets ith "SoftwareExecutable" element
     */
    void setSoftwareExecutableArray(int i, au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType softwareExecutable);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SoftwareExecutable" element
     */
    au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType insertNewSoftwareExecutable(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SoftwareExecutable" element
     */
    au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType addNewSoftwareExecutable();
    
    /**
     * Removes the ith "SoftwareExecutable" element
     */
    void removeSoftwareExecutable(int i);
    
    /**
     * Gets array of all "Data" elements
     */
    au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType.Data[] getDataArray();
    
    /**
     * Gets ith "Data" element
     */
    au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType.Data getDataArray(int i);
    
    /**
     * Returns number of "Data" element
     */
    int sizeOfDataArray();
    
    /**
     * Sets array of all "Data" element
     */
    void setDataArray(au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType.Data[] dataArray);
    
    /**
     * Sets ith "Data" element
     */
    void setDataArray(int i, au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType.Data data);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Data" element
     */
    au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType.Data insertNewData(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Data" element
     */
    au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType.Data addNewData();
    
    /**
     * Removes the ith "Data" element
     */
    void removeData(int i);
    
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
     * An XML Data(@http://grid.apac.edu.au/glueschema/Spec/V12/R2).
     *
     * This is a complex type.
     */
    public interface Data extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Data.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5E378313C67C9A33FF1E8A136471FF4E").resolveHandle("data1d79elemtype");
        
        /**
         * Gets the "Key" element
         */
        java.lang.String getKey();
        
        /**
         * Gets (as xml) the "Key" element
         */
        org.apache.xmlbeans.XmlString xgetKey();
        
        /**
         * Sets the "Key" element
         */
        void setKey(java.lang.String key);
        
        /**
         * Sets (as xml) the "Key" element
         */
        void xsetKey(org.apache.xmlbeans.XmlString key);
        
        /**
         * Gets the "Value" element
         */
        java.lang.String getValue();
        
        /**
         * Gets (as xml) the "Value" element
         */
        org.apache.xmlbeans.XmlString xgetValue();
        
        /**
         * Sets the "Value" element
         */
        void setValue(java.lang.String value);
        
        /**
         * Sets (as xml) the "Value" element
         */
        void xsetValue(org.apache.xmlbeans.XmlString value);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType.Data newInstance() {
              return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType.Data newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType newInstance() {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
