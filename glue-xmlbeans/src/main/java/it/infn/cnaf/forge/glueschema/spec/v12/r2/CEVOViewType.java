/*
 * XML Type:  CEVOViewType
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2;


/**
 * An XML CEVOViewType(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public interface CEVOViewType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CEVOViewType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5E378313C67C9A33FF1E8A136471FF4E").resolveHandle("cevoviewtypedb58type");
    
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
     * Gets the "RunningJobs" element
     */
    java.math.BigInteger getRunningJobs();
    
    /**
     * Gets (as xml) the "RunningJobs" element
     */
    org.apache.xmlbeans.XmlInteger xgetRunningJobs();
    
    /**
     * True if has "RunningJobs" element
     */
    boolean isSetRunningJobs();
    
    /**
     * Sets the "RunningJobs" element
     */
    void setRunningJobs(java.math.BigInteger runningJobs);
    
    /**
     * Sets (as xml) the "RunningJobs" element
     */
    void xsetRunningJobs(org.apache.xmlbeans.XmlInteger runningJobs);
    
    /**
     * Unsets the "RunningJobs" element
     */
    void unsetRunningJobs();
    
    /**
     * Gets the "WaitingJobs" element
     */
    java.math.BigInteger getWaitingJobs();
    
    /**
     * Gets (as xml) the "WaitingJobs" element
     */
    org.apache.xmlbeans.XmlInteger xgetWaitingJobs();
    
    /**
     * True if has "WaitingJobs" element
     */
    boolean isSetWaitingJobs();
    
    /**
     * Sets the "WaitingJobs" element
     */
    void setWaitingJobs(java.math.BigInteger waitingJobs);
    
    /**
     * Sets (as xml) the "WaitingJobs" element
     */
    void xsetWaitingJobs(org.apache.xmlbeans.XmlInteger waitingJobs);
    
    /**
     * Unsets the "WaitingJobs" element
     */
    void unsetWaitingJobs();
    
    /**
     * Gets the "TotalJobs" element
     */
    java.math.BigInteger getTotalJobs();
    
    /**
     * Gets (as xml) the "TotalJobs" element
     */
    org.apache.xmlbeans.XmlInteger xgetTotalJobs();
    
    /**
     * True if has "TotalJobs" element
     */
    boolean isSetTotalJobs();
    
    /**
     * Sets the "TotalJobs" element
     */
    void setTotalJobs(java.math.BigInteger totalJobs);
    
    /**
     * Sets (as xml) the "TotalJobs" element
     */
    void xsetTotalJobs(org.apache.xmlbeans.XmlInteger totalJobs);
    
    /**
     * Unsets the "TotalJobs" element
     */
    void unsetTotalJobs();
    
    /**
     * Gets the "FreeJobSlots" element
     */
    java.math.BigInteger getFreeJobSlots();
    
    /**
     * Gets (as xml) the "FreeJobSlots" element
     */
    org.apache.xmlbeans.XmlInteger xgetFreeJobSlots();
    
    /**
     * True if has "FreeJobSlots" element
     */
    boolean isSetFreeJobSlots();
    
    /**
     * Sets the "FreeJobSlots" element
     */
    void setFreeJobSlots(java.math.BigInteger freeJobSlots);
    
    /**
     * Sets (as xml) the "FreeJobSlots" element
     */
    void xsetFreeJobSlots(org.apache.xmlbeans.XmlInteger freeJobSlots);
    
    /**
     * Unsets the "FreeJobSlots" element
     */
    void unsetFreeJobSlots();
    
    /**
     * Gets the "EstimatedResponseTime" element
     */
    java.math.BigInteger getEstimatedResponseTime();
    
    /**
     * Gets (as xml) the "EstimatedResponseTime" element
     */
    org.apache.xmlbeans.XmlInteger xgetEstimatedResponseTime();
    
    /**
     * True if has "EstimatedResponseTime" element
     */
    boolean isSetEstimatedResponseTime();
    
    /**
     * Sets the "EstimatedResponseTime" element
     */
    void setEstimatedResponseTime(java.math.BigInteger estimatedResponseTime);
    
    /**
     * Sets (as xml) the "EstimatedResponseTime" element
     */
    void xsetEstimatedResponseTime(org.apache.xmlbeans.XmlInteger estimatedResponseTime);
    
    /**
     * Unsets the "EstimatedResponseTime" element
     */
    void unsetEstimatedResponseTime();
    
    /**
     * Gets the "WorstResponseTime" element
     */
    java.math.BigInteger getWorstResponseTime();
    
    /**
     * Gets (as xml) the "WorstResponseTime" element
     */
    org.apache.xmlbeans.XmlInteger xgetWorstResponseTime();
    
    /**
     * True if has "WorstResponseTime" element
     */
    boolean isSetWorstResponseTime();
    
    /**
     * Sets the "WorstResponseTime" element
     */
    void setWorstResponseTime(java.math.BigInteger worstResponseTime);
    
    /**
     * Sets (as xml) the "WorstResponseTime" element
     */
    void xsetWorstResponseTime(org.apache.xmlbeans.XmlInteger worstResponseTime);
    
    /**
     * Unsets the "WorstResponseTime" element
     */
    void unsetWorstResponseTime();
    
    /**
     * Gets the "DefaultSE" element
     */
    java.lang.String getDefaultSE();
    
    /**
     * Gets (as xml) the "DefaultSE" element
     */
    org.apache.xmlbeans.XmlString xgetDefaultSE();
    
    /**
     * True if has "DefaultSE" element
     */
    boolean isSetDefaultSE();
    
    /**
     * Sets the "DefaultSE" element
     */
    void setDefaultSE(java.lang.String defaultSE);
    
    /**
     * Sets (as xml) the "DefaultSE" element
     */
    void xsetDefaultSE(org.apache.xmlbeans.XmlString defaultSE);
    
    /**
     * Unsets the "DefaultSE" element
     */
    void unsetDefaultSE();
    
    /**
     * Gets the "ApplicationDir" element
     */
    java.lang.String getApplicationDir();
    
    /**
     * Gets (as xml) the "ApplicationDir" element
     */
    org.apache.xmlbeans.XmlString xgetApplicationDir();
    
    /**
     * True if has "ApplicationDir" element
     */
    boolean isSetApplicationDir();
    
    /**
     * Sets the "ApplicationDir" element
     */
    void setApplicationDir(java.lang.String applicationDir);
    
    /**
     * Sets (as xml) the "ApplicationDir" element
     */
    void xsetApplicationDir(org.apache.xmlbeans.XmlString applicationDir);
    
    /**
     * Unsets the "ApplicationDir" element
     */
    void unsetApplicationDir();
    
    /**
     * Gets the "DataDir" element
     */
    java.lang.String getDataDir();
    
    /**
     * Gets (as xml) the "DataDir" element
     */
    org.apache.xmlbeans.XmlString xgetDataDir();
    
    /**
     * True if has "DataDir" element
     */
    boolean isSetDataDir();
    
    /**
     * Sets the "DataDir" element
     */
    void setDataDir(java.lang.String dataDir);
    
    /**
     * Sets (as xml) the "DataDir" element
     */
    void xsetDataDir(org.apache.xmlbeans.XmlString dataDir);
    
    /**
     * Unsets the "DataDir" element
     */
    void unsetDataDir();
    
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
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType newInstance() {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
