/*
 * XML Type:  SEControlProtocolType
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2;


/**
 * An XML SEControlProtocolType(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public interface SEControlProtocolType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SEControlProtocolType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5E378313C67C9A33FF1E8A136471FF4E").resolveHandle("secontrolprotocoltypeba27type");
    
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
     * Gets the "Type" element
     */
    java.lang.String getType();
    
    /**
     * Gets (as xml) the "Type" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolOpenEnum xgetType();
    
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
    void xsetType(it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolOpenEnum type);
    
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
     * Gets array of all "Capability" elements
     */
    java.lang.String[] getCapabilityArray();
    
    /**
     * Gets ith "Capability" element
     */
    java.lang.String getCapabilityArray(int i);
    
    /**
     * Gets (as xml) array of all "Capability" elements
     */
    org.apache.xmlbeans.XmlString[] xgetCapabilityArray();
    
    /**
     * Gets (as xml) ith "Capability" element
     */
    org.apache.xmlbeans.XmlString xgetCapabilityArray(int i);
    
    /**
     * Returns number of "Capability" element
     */
    int sizeOfCapabilityArray();
    
    /**
     * Sets array of all "Capability" element
     */
    void setCapabilityArray(java.lang.String[] capabilityArray);
    
    /**
     * Sets ith "Capability" element
     */
    void setCapabilityArray(int i, java.lang.String capability);
    
    /**
     * Sets (as xml) array of all "Capability" element
     */
    void xsetCapabilityArray(org.apache.xmlbeans.XmlString[] capabilityArray);
    
    /**
     * Sets (as xml) ith "Capability" element
     */
    void xsetCapabilityArray(int i, org.apache.xmlbeans.XmlString capability);
    
    /**
     * Inserts the value as the ith "Capability" element
     */
    void insertCapability(int i, java.lang.String capability);
    
    /**
     * Appends the value as the last "Capability" element
     */
    void addCapability(java.lang.String capability);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Capability" element
     */
    org.apache.xmlbeans.XmlString insertNewCapability(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Capability" element
     */
    org.apache.xmlbeans.XmlString addNewCapability();
    
    /**
     * Removes the ith "Capability" element
     */
    void removeCapability(int i);
    
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
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType newInstance() {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
