/*
 * XML Type:  ServiceType
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2;


/**
 * An XML ServiceType(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public interface ServiceType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServiceType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5E378313C67C9A33FF1E8A136471FF4E").resolveHandle("servicetype9075type");
    
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
     * Gets the "Type" element
     */
    java.lang.String getType();
    
    /**
     * Gets (as xml) the "Type" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeOpenEnum xgetType();
    
    /**
     * True if has "Type" element
     */
    boolean isSetType();
    
    /**
     * Sets the "Type" element
     */
    void setType(java.lang.String type);
    
    /**
     * Sets (as xml) the "Type" element
     */
    void xsetType(it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeOpenEnum type);
    
    /**
     * Unsets the "Type" element
     */
    void unsetType();
    
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
     * Gets the "Endpoint" element
     */
    java.lang.String getEndpoint();
    
    /**
     * Gets (as xml) the "Endpoint" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetEndpoint();
    
    /**
     * True if has "Endpoint" element
     */
    boolean isSetEndpoint();
    
    /**
     * Sets the "Endpoint" element
     */
    void setEndpoint(java.lang.String endpoint);
    
    /**
     * Sets (as xml) the "Endpoint" element
     */
    void xsetEndpoint(org.apache.xmlbeans.XmlAnyURI endpoint);
    
    /**
     * Unsets the "Endpoint" element
     */
    void unsetEndpoint();
    
    /**
     * Gets the "Status" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceStatusEnum.Enum getStatus();
    
    /**
     * Gets (as xml) the "Status" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceStatusEnum xgetStatus();
    
    /**
     * True if has "Status" element
     */
    boolean isSetStatus();
    
    /**
     * Sets the "Status" element
     */
    void setStatus(it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceStatusEnum.Enum status);
    
    /**
     * Sets (as xml) the "Status" element
     */
    void xsetStatus(it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceStatusEnum status);
    
    /**
     * Unsets the "Status" element
     */
    void unsetStatus();
    
    /**
     * Gets the "StatusInfo" element
     */
    java.lang.String getStatusInfo();
    
    /**
     * Gets (as xml) the "StatusInfo" element
     */
    org.apache.xmlbeans.XmlString xgetStatusInfo();
    
    /**
     * True if has "StatusInfo" element
     */
    boolean isSetStatusInfo();
    
    /**
     * Sets the "StatusInfo" element
     */
    void setStatusInfo(java.lang.String statusInfo);
    
    /**
     * Sets (as xml) the "StatusInfo" element
     */
    void xsetStatusInfo(org.apache.xmlbeans.XmlString statusInfo);
    
    /**
     * Unsets the "StatusInfo" element
     */
    void unsetStatusInfo();
    
    /**
     * Gets the "WSDL" element
     */
    java.lang.String getWSDL();
    
    /**
     * Gets (as xml) the "WSDL" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetWSDL();
    
    /**
     * True if has "WSDL" element
     */
    boolean isSetWSDL();
    
    /**
     * Sets the "WSDL" element
     */
    void setWSDL(java.lang.String wsdl);
    
    /**
     * Sets (as xml) the "WSDL" element
     */
    void xsetWSDL(org.apache.xmlbeans.XmlAnyURI wsdl);
    
    /**
     * Unsets the "WSDL" element
     */
    void unsetWSDL();
    
    /**
     * Gets the "Semantics" element
     */
    java.lang.String getSemantics();
    
    /**
     * Gets (as xml) the "Semantics" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetSemantics();
    
    /**
     * True if has "Semantics" element
     */
    boolean isSetSemantics();
    
    /**
     * Sets the "Semantics" element
     */
    void setSemantics(java.lang.String semantics);
    
    /**
     * Sets (as xml) the "Semantics" element
     */
    void xsetSemantics(org.apache.xmlbeans.XmlAnyURI semantics);
    
    /**
     * Unsets the "Semantics" element
     */
    void unsetSemantics();
    
    /**
     * Gets the "StartTime" element
     */
    java.util.Calendar getStartTime();
    
    /**
     * Gets (as xml) the "StartTime" element
     */
    org.apache.xmlbeans.XmlDateTime xgetStartTime();
    
    /**
     * True if has "StartTime" element
     */
    boolean isSetStartTime();
    
    /**
     * Sets the "StartTime" element
     */
    void setStartTime(java.util.Calendar startTime);
    
    /**
     * Sets (as xml) the "StartTime" element
     */
    void xsetStartTime(org.apache.xmlbeans.XmlDateTime startTime);
    
    /**
     * Unsets the "StartTime" element
     */
    void unsetStartTime();
    
    /**
     * Gets array of all "Owner" elements
     */
    java.lang.String[] getOwnerArray();
    
    /**
     * Gets ith "Owner" element
     */
    java.lang.String getOwnerArray(int i);
    
    /**
     * Gets (as xml) array of all "Owner" elements
     */
    org.apache.xmlbeans.XmlString[] xgetOwnerArray();
    
    /**
     * Gets (as xml) ith "Owner" element
     */
    org.apache.xmlbeans.XmlString xgetOwnerArray(int i);
    
    /**
     * Returns number of "Owner" element
     */
    int sizeOfOwnerArray();
    
    /**
     * Sets array of all "Owner" element
     */
    void setOwnerArray(java.lang.String[] ownerArray);
    
    /**
     * Sets ith "Owner" element
     */
    void setOwnerArray(int i, java.lang.String owner);
    
    /**
     * Sets (as xml) array of all "Owner" element
     */
    void xsetOwnerArray(org.apache.xmlbeans.XmlString[] ownerArray);
    
    /**
     * Sets (as xml) ith "Owner" element
     */
    void xsetOwnerArray(int i, org.apache.xmlbeans.XmlString owner);
    
    /**
     * Inserts the value as the ith "Owner" element
     */
    void insertOwner(int i, java.lang.String owner);
    
    /**
     * Appends the value as the last "Owner" element
     */
    void addOwner(java.lang.String owner);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Owner" element
     */
    org.apache.xmlbeans.XmlString insertNewOwner(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Owner" element
     */
    org.apache.xmlbeans.XmlString addNewOwner();
    
    /**
     * Removes the ith "Owner" element
     */
    void removeOwner(int i);
    
    /**
     * Gets array of all "Data" elements
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType.Data[] getDataArray();
    
    /**
     * Gets ith "Data" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType.Data getDataArray(int i);
    
    /**
     * Returns number of "Data" element
     */
    int sizeOfDataArray();
    
    /**
     * Sets array of all "Data" element
     */
    void setDataArray(it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType.Data[] dataArray);
    
    /**
     * Sets ith "Data" element
     */
    void setDataArray(int i, it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType.Data data);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Data" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType.Data insertNewData(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Data" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType.Data addNewData();
    
    /**
     * Removes the ith "Data" element
     */
    void removeData(int i);
    
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
     * An XML Data(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
     *
     * This is a complex type.
     */
    public interface Data extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Data.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5E378313C67C9A33FF1E8A136471FF4E").resolveHandle("databb4felemtype");
        
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
            public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType.Data newInstance() {
              return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType.Data newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType newInstance() {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
