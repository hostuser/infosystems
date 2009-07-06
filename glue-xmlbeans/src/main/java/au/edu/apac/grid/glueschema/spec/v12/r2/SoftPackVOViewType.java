/*
 * XML Type:  SoftPackVOViewType
 * Namespace: http://grid.apac.edu.au/glueschema/Spec/V12/R2
 * Java type: au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType
 *
 * Automatically generated - do not modify.
 */
package au.edu.apac.grid.glueschema.spec.v12.r2;


/**
 * An XML SoftPackVOViewType(@http://grid.apac.edu.au/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public interface SoftPackVOViewType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SoftPackVOViewType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5E378313C67C9A33FF1E8A136471FF4E").resolveHandle("softpackvoviewtype51abtype");
    
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
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType newInstance() {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
