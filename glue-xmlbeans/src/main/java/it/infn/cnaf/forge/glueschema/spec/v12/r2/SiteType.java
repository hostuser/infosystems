/*
 * XML Type:  SiteType
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2;


/**
 * An XML SiteType(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public interface SiteType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SiteType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5E378313C67C9A33FF1E8A136471FF4E").resolveHandle("sitetypecdb1type");
    
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
     * Gets the "Description" element
     */
    java.lang.String getDescription();
    
    /**
     * Gets (as xml) the "Description" element
     */
    org.apache.xmlbeans.XmlString xgetDescription();
    
    /**
     * True if has "Description" element
     */
    boolean isSetDescription();
    
    /**
     * Sets the "Description" element
     */
    void setDescription(java.lang.String description);
    
    /**
     * Sets (as xml) the "Description" element
     */
    void xsetDescription(org.apache.xmlbeans.XmlString description);
    
    /**
     * Unsets the "Description" element
     */
    void unsetDescription();
    
    /**
     * Gets the "UserSupportContact" element
     */
    java.lang.String getUserSupportContact();
    
    /**
     * Gets (as xml) the "UserSupportContact" element
     */
    org.apache.xmlbeans.XmlString xgetUserSupportContact();
    
    /**
     * True if has "UserSupportContact" element
     */
    boolean isSetUserSupportContact();
    
    /**
     * Sets the "UserSupportContact" element
     */
    void setUserSupportContact(java.lang.String userSupportContact);
    
    /**
     * Sets (as xml) the "UserSupportContact" element
     */
    void xsetUserSupportContact(org.apache.xmlbeans.XmlString userSupportContact);
    
    /**
     * Unsets the "UserSupportContact" element
     */
    void unsetUserSupportContact();
    
    /**
     * Gets the "SysAdminContact" element
     */
    java.lang.String getSysAdminContact();
    
    /**
     * Gets (as xml) the "SysAdminContact" element
     */
    org.apache.xmlbeans.XmlString xgetSysAdminContact();
    
    /**
     * True if has "SysAdminContact" element
     */
    boolean isSetSysAdminContact();
    
    /**
     * Sets the "SysAdminContact" element
     */
    void setSysAdminContact(java.lang.String sysAdminContact);
    
    /**
     * Sets (as xml) the "SysAdminContact" element
     */
    void xsetSysAdminContact(org.apache.xmlbeans.XmlString sysAdminContact);
    
    /**
     * Unsets the "SysAdminContact" element
     */
    void unsetSysAdminContact();
    
    /**
     * Gets the "SecurityContact" element
     */
    java.lang.String getSecurityContact();
    
    /**
     * Gets (as xml) the "SecurityContact" element
     */
    org.apache.xmlbeans.XmlString xgetSecurityContact();
    
    /**
     * True if has "SecurityContact" element
     */
    boolean isSetSecurityContact();
    
    /**
     * Sets the "SecurityContact" element
     */
    void setSecurityContact(java.lang.String securityContact);
    
    /**
     * Sets (as xml) the "SecurityContact" element
     */
    void xsetSecurityContact(org.apache.xmlbeans.XmlString securityContact);
    
    /**
     * Unsets the "SecurityContact" element
     */
    void unsetSecurityContact();
    
    /**
     * Gets the "Location" element
     */
    java.lang.String getLocation();
    
    /**
     * Gets (as xml) the "Location" element
     */
    org.apache.xmlbeans.XmlString xgetLocation();
    
    /**
     * True if has "Location" element
     */
    boolean isSetLocation();
    
    /**
     * Sets the "Location" element
     */
    void setLocation(java.lang.String location);
    
    /**
     * Sets (as xml) the "Location" element
     */
    void xsetLocation(org.apache.xmlbeans.XmlString location);
    
    /**
     * Unsets the "Location" element
     */
    void unsetLocation();
    
    /**
     * Gets the "Latitude" element
     */
    double getLatitude();
    
    /**
     * Gets (as xml) the "Latitude" element
     */
    org.apache.xmlbeans.XmlDouble xgetLatitude();
    
    /**
     * True if has "Latitude" element
     */
    boolean isSetLatitude();
    
    /**
     * Sets the "Latitude" element
     */
    void setLatitude(double latitude);
    
    /**
     * Sets (as xml) the "Latitude" element
     */
    void xsetLatitude(org.apache.xmlbeans.XmlDouble latitude);
    
    /**
     * Unsets the "Latitude" element
     */
    void unsetLatitude();
    
    /**
     * Gets the "Longitude" element
     */
    double getLongitude();
    
    /**
     * Gets (as xml) the "Longitude" element
     */
    org.apache.xmlbeans.XmlDouble xgetLongitude();
    
    /**
     * True if has "Longitude" element
     */
    boolean isSetLongitude();
    
    /**
     * Sets the "Longitude" element
     */
    void setLongitude(double longitude);
    
    /**
     * Sets (as xml) the "Longitude" element
     */
    void xsetLongitude(org.apache.xmlbeans.XmlDouble longitude);
    
    /**
     * Unsets the "Longitude" element
     */
    void unsetLongitude();
    
    /**
     * Gets the "Web" element
     */
    java.lang.String getWeb();
    
    /**
     * Gets (as xml) the "Web" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetWeb();
    
    /**
     * True if has "Web" element
     */
    boolean isSetWeb();
    
    /**
     * Sets the "Web" element
     */
    void setWeb(java.lang.String web);
    
    /**
     * Sets (as xml) the "Web" element
     */
    void xsetWeb(org.apache.xmlbeans.XmlAnyURI web);
    
    /**
     * Unsets the "Web" element
     */
    void unsetWeb();
    
    /**
     * Gets array of all "Sponsor" elements
     */
    java.lang.String[] getSponsorArray();
    
    /**
     * Gets ith "Sponsor" element
     */
    java.lang.String getSponsorArray(int i);
    
    /**
     * Gets (as xml) array of all "Sponsor" elements
     */
    org.apache.xmlbeans.XmlString[] xgetSponsorArray();
    
    /**
     * Gets (as xml) ith "Sponsor" element
     */
    org.apache.xmlbeans.XmlString xgetSponsorArray(int i);
    
    /**
     * Returns number of "Sponsor" element
     */
    int sizeOfSponsorArray();
    
    /**
     * Sets array of all "Sponsor" element
     */
    void setSponsorArray(java.lang.String[] sponsorArray);
    
    /**
     * Sets ith "Sponsor" element
     */
    void setSponsorArray(int i, java.lang.String sponsor);
    
    /**
     * Sets (as xml) array of all "Sponsor" element
     */
    void xsetSponsorArray(org.apache.xmlbeans.XmlString[] sponsorArray);
    
    /**
     * Sets (as xml) ith "Sponsor" element
     */
    void xsetSponsorArray(int i, org.apache.xmlbeans.XmlString sponsor);
    
    /**
     * Inserts the value as the ith "Sponsor" element
     */
    void insertSponsor(int i, java.lang.String sponsor);
    
    /**
     * Appends the value as the last "Sponsor" element
     */
    void addSponsor(java.lang.String sponsor);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Sponsor" element
     */
    org.apache.xmlbeans.XmlString insertNewSponsor(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Sponsor" element
     */
    org.apache.xmlbeans.XmlString addNewSponsor();
    
    /**
     * Removes the ith "Sponsor" element
     */
    void removeSponsor(int i);
    
    /**
     * Gets array of all "OtherInfo" elements
     */
    java.lang.String[] getOtherInfoArray();
    
    /**
     * Gets ith "OtherInfo" element
     */
    java.lang.String getOtherInfoArray(int i);
    
    /**
     * Gets (as xml) array of all "OtherInfo" elements
     */
    org.apache.xmlbeans.XmlString[] xgetOtherInfoArray();
    
    /**
     * Gets (as xml) ith "OtherInfo" element
     */
    org.apache.xmlbeans.XmlString xgetOtherInfoArray(int i);
    
    /**
     * Returns number of "OtherInfo" element
     */
    int sizeOfOtherInfoArray();
    
    /**
     * Sets array of all "OtherInfo" element
     */
    void setOtherInfoArray(java.lang.String[] otherInfoArray);
    
    /**
     * Sets ith "OtherInfo" element
     */
    void setOtherInfoArray(int i, java.lang.String otherInfo);
    
    /**
     * Sets (as xml) array of all "OtherInfo" element
     */
    void xsetOtherInfoArray(org.apache.xmlbeans.XmlString[] otherInfoArray);
    
    /**
     * Sets (as xml) ith "OtherInfo" element
     */
    void xsetOtherInfoArray(int i, org.apache.xmlbeans.XmlString otherInfo);
    
    /**
     * Inserts the value as the ith "OtherInfo" element
     */
    void insertOtherInfo(int i, java.lang.String otherInfo);
    
    /**
     * Appends the value as the last "OtherInfo" element
     */
    void addOtherInfo(java.lang.String otherInfo);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OtherInfo" element
     */
    org.apache.xmlbeans.XmlString insertNewOtherInfo(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OtherInfo" element
     */
    org.apache.xmlbeans.XmlString addNewOtherInfo();
    
    /**
     * Removes the ith "OtherInfo" element
     */
    void removeOtherInfo(int i);
    
    /**
     * Gets array of all "Cluster" elements
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType[] getClusterArray();
    
    /**
     * Gets ith "Cluster" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType getClusterArray(int i);
    
    /**
     * Returns number of "Cluster" element
     */
    int sizeOfClusterArray();
    
    /**
     * Sets array of all "Cluster" element
     */
    void setClusterArray(it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType[] clusterArray);
    
    /**
     * Sets ith "Cluster" element
     */
    void setClusterArray(int i, it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType cluster);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Cluster" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType insertNewCluster(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Cluster" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType addNewCluster();
    
    /**
     * Removes the ith "Cluster" element
     */
    void removeCluster(int i);
    
    /**
     * Gets array of all "StorageElement" elements
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType[] getStorageElementArray();
    
    /**
     * Gets ith "StorageElement" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType getStorageElementArray(int i);
    
    /**
     * Returns number of "StorageElement" element
     */
    int sizeOfStorageElementArray();
    
    /**
     * Sets array of all "StorageElement" element
     */
    void setStorageElementArray(it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType[] storageElementArray);
    
    /**
     * Sets ith "StorageElement" element
     */
    void setStorageElementArray(int i, it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType storageElement);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StorageElement" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType insertNewStorageElement(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StorageElement" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType addNewStorageElement();
    
    /**
     * Removes the ith "StorageElement" element
     */
    void removeStorageElement(int i);
    
    /**
     * Gets array of all "Service" elements
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType[] getServiceArray();
    
    /**
     * Gets ith "Service" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType getServiceArray(int i);
    
    /**
     * Returns number of "Service" element
     */
    int sizeOfServiceArray();
    
    /**
     * Sets array of all "Service" element
     */
    void setServiceArray(it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType[] serviceArray);
    
    /**
     * Sets ith "Service" element
     */
    void setServiceArray(int i, it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType service);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Service" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType insertNewService(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Service" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType addNewService();
    
    /**
     * Removes the ith "Service" element
     */
    void removeService(int i);
    
    /**
     * Gets array of all "CESEBind" elements
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.CESEBindType[] getCESEBindArray();
    
    /**
     * Gets ith "CESEBind" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.CESEBindType getCESEBindArray(int i);
    
    /**
     * Returns number of "CESEBind" element
     */
    int sizeOfCESEBindArray();
    
    /**
     * Sets array of all "CESEBind" element
     */
    void setCESEBindArray(it.infn.cnaf.forge.glueschema.spec.v12.r2.CESEBindType[] ceseBindArray);
    
    /**
     * Sets ith "CESEBind" element
     */
    void setCESEBindArray(int i, it.infn.cnaf.forge.glueschema.spec.v12.r2.CESEBindType ceseBind);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CESEBind" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.CESEBindType insertNewCESEBind(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CESEBind" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.CESEBindType addNewCESEBind();
    
    /**
     * Removes the ith "CESEBind" element
     */
    void removeCESEBind(int i);
    
    /**
     * Gets array of all "Service2Service" elements
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.Service2ServiceType[] getService2ServiceArray();
    
    /**
     * Gets ith "Service2Service" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.Service2ServiceType getService2ServiceArray(int i);
    
    /**
     * Returns number of "Service2Service" element
     */
    int sizeOfService2ServiceArray();
    
    /**
     * Sets array of all "Service2Service" element
     */
    void setService2ServiceArray(it.infn.cnaf.forge.glueschema.spec.v12.r2.Service2ServiceType[] service2ServiceArray);
    
    /**
     * Sets ith "Service2Service" element
     */
    void setService2ServiceArray(int i, it.infn.cnaf.forge.glueschema.spec.v12.r2.Service2ServiceType service2Service);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Service2Service" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.Service2ServiceType insertNewService2Service(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Service2Service" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.Service2ServiceType addNewService2Service();
    
    /**
     * Removes the ith "Service2Service" element
     */
    void removeService2Service(int i);
    
    /**
     * Gets array of all "Host" elements
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType[] getHostArray();
    
    /**
     * Gets ith "Host" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType getHostArray(int i);
    
    /**
     * Returns number of "Host" element
     */
    int sizeOfHostArray();
    
    /**
     * Sets array of all "Host" element
     */
    void setHostArray(it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType[] hostArray);
    
    /**
     * Sets ith "Host" element
     */
    void setHostArray(int i, it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType host);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Host" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType insertNewHost(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Host" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType addNewHost();
    
    /**
     * Removes the ith "Host" element
     */
    void removeHost(int i);
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType newInstance() {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
