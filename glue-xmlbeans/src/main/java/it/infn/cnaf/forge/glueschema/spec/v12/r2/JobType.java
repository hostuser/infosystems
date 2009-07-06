/*
 * XML Type:  JobType
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2;


/**
 * An XML JobType(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public interface JobType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(JobType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5E378313C67C9A33FF1E8A136471FF4E").resolveHandle("jobtypebcedtype");
    
    /**
     * Gets the "GlobalID" element
     */
    java.lang.String getGlobalID();
    
    /**
     * Gets (as xml) the "GlobalID" element
     */
    org.apache.xmlbeans.XmlString xgetGlobalID();
    
    /**
     * True if has "GlobalID" element
     */
    boolean isSetGlobalID();
    
    /**
     * Sets the "GlobalID" element
     */
    void setGlobalID(java.lang.String globalID);
    
    /**
     * Sets (as xml) the "GlobalID" element
     */
    void xsetGlobalID(org.apache.xmlbeans.XmlString globalID);
    
    /**
     * Unsets the "GlobalID" element
     */
    void unsetGlobalID();
    
    /**
     * Gets the "LocalOwner" element
     */
    java.lang.String getLocalOwner();
    
    /**
     * Gets (as xml) the "LocalOwner" element
     */
    org.apache.xmlbeans.XmlString xgetLocalOwner();
    
    /**
     * True if has "LocalOwner" element
     */
    boolean isSetLocalOwner();
    
    /**
     * Sets the "LocalOwner" element
     */
    void setLocalOwner(java.lang.String localOwner);
    
    /**
     * Sets (as xml) the "LocalOwner" element
     */
    void xsetLocalOwner(org.apache.xmlbeans.XmlString localOwner);
    
    /**
     * Unsets the "LocalOwner" element
     */
    void unsetLocalOwner();
    
    /**
     * Gets the "GlobalOwner" element
     */
    java.lang.String getGlobalOwner();
    
    /**
     * Gets (as xml) the "GlobalOwner" element
     */
    org.apache.xmlbeans.XmlString xgetGlobalOwner();
    
    /**
     * True if has "GlobalOwner" element
     */
    boolean isSetGlobalOwner();
    
    /**
     * Sets the "GlobalOwner" element
     */
    void setGlobalOwner(java.lang.String globalOwner);
    
    /**
     * Sets (as xml) the "GlobalOwner" element
     */
    void xsetGlobalOwner(org.apache.xmlbeans.XmlString globalOwner);
    
    /**
     * Unsets the "GlobalOwner" element
     */
    void unsetGlobalOwner();
    
    /**
     * Gets the "Status" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.JobStatusEnum.Enum getStatus();
    
    /**
     * Gets (as xml) the "Status" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.JobStatusEnum xgetStatus();
    
    /**
     * True if has "Status" element
     */
    boolean isSetStatus();
    
    /**
     * Sets the "Status" element
     */
    void setStatus(it.infn.cnaf.forge.glueschema.spec.v12.r2.JobStatusEnum.Enum status);
    
    /**
     * Sets (as xml) the "Status" element
     */
    void xsetStatus(it.infn.cnaf.forge.glueschema.spec.v12.r2.JobStatusEnum status);
    
    /**
     * Unsets the "Status" element
     */
    void unsetStatus();
    
    /**
     * Gets the "SchedulerSpecific" element
     */
    java.lang.String getSchedulerSpecific();
    
    /**
     * Gets (as xml) the "SchedulerSpecific" element
     */
    org.apache.xmlbeans.XmlString xgetSchedulerSpecific();
    
    /**
     * True if has "SchedulerSpecific" element
     */
    boolean isSetSchedulerSpecific();
    
    /**
     * Sets the "SchedulerSpecific" element
     */
    void setSchedulerSpecific(java.lang.String schedulerSpecific);
    
    /**
     * Sets (as xml) the "SchedulerSpecific" element
     */
    void xsetSchedulerSpecific(org.apache.xmlbeans.XmlString schedulerSpecific);
    
    /**
     * Unsets the "SchedulerSpecific" element
     */
    void unsetSchedulerSpecific();
    
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
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType newInstance() {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
