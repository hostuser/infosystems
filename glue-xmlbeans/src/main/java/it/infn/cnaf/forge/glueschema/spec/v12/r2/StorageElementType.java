/*
 * XML Type:  StorageElementType
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2;


/**
 * An XML StorageElementType(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public interface StorageElementType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StorageElementType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5E378313C67C9A33FF1E8A136471FF4E").resolveHandle("storageelementtype9877type");
    
    /**
     * Gets the "InformationServiceURL" element
     */
    java.lang.String getInformationServiceURL();
    
    /**
     * Gets (as xml) the "InformationServiceURL" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetInformationServiceURL();
    
    /**
     * True if has "InformationServiceURL" element
     */
    boolean isSetInformationServiceURL();
    
    /**
     * Sets the "InformationServiceURL" element
     */
    void setInformationServiceURL(java.lang.String informationServiceURL);
    
    /**
     * Sets (as xml) the "InformationServiceURL" element
     */
    void xsetInformationServiceURL(org.apache.xmlbeans.XmlAnyURI informationServiceURL);
    
    /**
     * Unsets the "InformationServiceURL" element
     */
    void unsetInformationServiceURL();
    
    /**
     * Gets the "SizeTotal" element
     */
    java.math.BigInteger getSizeTotal();
    
    /**
     * Gets (as xml) the "SizeTotal" element
     */
    org.apache.xmlbeans.XmlInteger xgetSizeTotal();
    
    /**
     * True if has "SizeTotal" element
     */
    boolean isSetSizeTotal();
    
    /**
     * Sets the "SizeTotal" element
     */
    void setSizeTotal(java.math.BigInteger sizeTotal);
    
    /**
     * Sets (as xml) the "SizeTotal" element
     */
    void xsetSizeTotal(org.apache.xmlbeans.XmlInteger sizeTotal);
    
    /**
     * Unsets the "SizeTotal" element
     */
    void unsetSizeTotal();
    
    /**
     * Gets the "SizeFree" element
     */
    java.math.BigInteger getSizeFree();
    
    /**
     * Gets (as xml) the "SizeFree" element
     */
    org.apache.xmlbeans.XmlInteger xgetSizeFree();
    
    /**
     * True if has "SizeFree" element
     */
    boolean isSetSizeFree();
    
    /**
     * Sets the "SizeFree" element
     */
    void setSizeFree(java.math.BigInteger sizeFree);
    
    /**
     * Sets (as xml) the "SizeFree" element
     */
    void xsetSizeFree(org.apache.xmlbeans.XmlInteger sizeFree);
    
    /**
     * Unsets the "SizeFree" element
     */
    void unsetSizeFree();
    
    /**
     * Gets the "Architecture" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.SEArchitectureEnum.Enum getArchitecture();
    
    /**
     * Gets (as xml) the "Architecture" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.SEArchitectureEnum xgetArchitecture();
    
    /**
     * True if has "Architecture" element
     */
    boolean isSetArchitecture();
    
    /**
     * Sets the "Architecture" element
     */
    void setArchitecture(it.infn.cnaf.forge.glueschema.spec.v12.r2.SEArchitectureEnum.Enum architecture);
    
    /**
     * Sets (as xml) the "Architecture" element
     */
    void xsetArchitecture(it.infn.cnaf.forge.glueschema.spec.v12.r2.SEArchitectureEnum architecture);
    
    /**
     * Unsets the "Architecture" element
     */
    void unsetArchitecture();
    
    /**
     * Gets array of all "StorageArea" elements
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType[] getStorageAreaArray();
    
    /**
     * Gets ith "StorageArea" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType getStorageAreaArray(int i);
    
    /**
     * Returns number of "StorageArea" element
     */
    int sizeOfStorageAreaArray();
    
    /**
     * Sets array of all "StorageArea" element
     */
    void setStorageAreaArray(it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType[] storageAreaArray);
    
    /**
     * Sets ith "StorageArea" element
     */
    void setStorageAreaArray(int i, it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType storageArea);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StorageArea" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType insertNewStorageArea(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StorageArea" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType addNewStorageArea();
    
    /**
     * Removes the ith "StorageArea" element
     */
    void removeStorageArea(int i);
    
    /**
     * Gets array of all "AccessProtocol" elements
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.SEAccessProtocolType[] getAccessProtocolArray();
    
    /**
     * Gets ith "AccessProtocol" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.SEAccessProtocolType getAccessProtocolArray(int i);
    
    /**
     * Returns number of "AccessProtocol" element
     */
    int sizeOfAccessProtocolArray();
    
    /**
     * Sets array of all "AccessProtocol" element
     */
    void setAccessProtocolArray(it.infn.cnaf.forge.glueschema.spec.v12.r2.SEAccessProtocolType[] accessProtocolArray);
    
    /**
     * Sets ith "AccessProtocol" element
     */
    void setAccessProtocolArray(int i, it.infn.cnaf.forge.glueschema.spec.v12.r2.SEAccessProtocolType accessProtocol);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AccessProtocol" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.SEAccessProtocolType insertNewAccessProtocol(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AccessProtocol" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.SEAccessProtocolType addNewAccessProtocol();
    
    /**
     * Removes the ith "AccessProtocol" element
     */
    void removeAccessProtocol(int i);
    
    /**
     * Gets array of all "ControlProtocol" elements
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType[] getControlProtocolArray();
    
    /**
     * Gets ith "ControlProtocol" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType getControlProtocolArray(int i);
    
    /**
     * Returns number of "ControlProtocol" element
     */
    int sizeOfControlProtocolArray();
    
    /**
     * Sets array of all "ControlProtocol" element
     */
    void setControlProtocolArray(it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType[] controlProtocolArray);
    
    /**
     * Sets ith "ControlProtocol" element
     */
    void setControlProtocolArray(int i, it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType controlProtocol);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ControlProtocol" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType insertNewControlProtocol(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ControlProtocol" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType addNewControlProtocol();
    
    /**
     * Removes the ith "ControlProtocol" element
     */
    void removeControlProtocol(int i);
    
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
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType newInstance() {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
