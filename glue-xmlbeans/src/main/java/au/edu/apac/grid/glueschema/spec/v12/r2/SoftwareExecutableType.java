/*
 * XML Type:  SoftwareExecutableType
 * Namespace: http://grid.apac.edu.au/glueschema/Spec/V12/R2
 * Java type: au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType
 *
 * Automatically generated - do not modify.
 */
package au.edu.apac.grid.glueschema.spec.v12.r2;


/**
 * An XML SoftwareExecutableType(@http://grid.apac.edu.au/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public interface SoftwareExecutableType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SoftwareExecutableType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5E378313C67C9A33FF1E8A136471FF4E").resolveHandle("softwareexecutabletypee6fbtype");
    
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
     * Gets the "ParallelType" element
     */
    java.lang.String getParallelType();
    
    /**
     * Gets (as xml) the "ParallelType" element
     */
    org.apache.xmlbeans.XmlString xgetParallelType();
    
    /**
     * True if has "ParallelType" element
     */
    boolean isSetParallelType();
    
    /**
     * Sets the "ParallelType" element
     */
    void setParallelType(java.lang.String parallelType);
    
    /**
     * Sets (as xml) the "ParallelType" element
     */
    void xsetParallelType(org.apache.xmlbeans.XmlString parallelType);
    
    /**
     * Unsets the "ParallelType" element
     */
    void unsetParallelType();
    
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
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType newInstance() {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
