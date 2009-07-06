/*
 * XML Type:  ProcessorFullType
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2;


/**
 * An XML ProcessorFullType(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public interface ProcessorFullType extends it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProcessorFullType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5E378313C67C9A33FF1E8A136471FF4E").resolveHandle("processorfulltype01a9type");
    
    /**
     * Gets the "CacheL1" attribute
     */
    java.math.BigInteger getCacheL1();
    
    /**
     * Gets (as xml) the "CacheL1" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetCacheL1();
    
    /**
     * True if has "CacheL1" attribute
     */
    boolean isSetCacheL1();
    
    /**
     * Sets the "CacheL1" attribute
     */
    void setCacheL1(java.math.BigInteger cacheL1);
    
    /**
     * Sets (as xml) the "CacheL1" attribute
     */
    void xsetCacheL1(org.apache.xmlbeans.XmlInteger cacheL1);
    
    /**
     * Unsets the "CacheL1" attribute
     */
    void unsetCacheL1();
    
    /**
     * Gets the "CacheL1I" attribute
     */
    java.math.BigInteger getCacheL1I();
    
    /**
     * Gets (as xml) the "CacheL1I" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetCacheL1I();
    
    /**
     * True if has "CacheL1I" attribute
     */
    boolean isSetCacheL1I();
    
    /**
     * Sets the "CacheL1I" attribute
     */
    void setCacheL1I(java.math.BigInteger cacheL1I);
    
    /**
     * Sets (as xml) the "CacheL1I" attribute
     */
    void xsetCacheL1I(org.apache.xmlbeans.XmlInteger cacheL1I);
    
    /**
     * Unsets the "CacheL1I" attribute
     */
    void unsetCacheL1I();
    
    /**
     * Gets the "CacheL1D" attribute
     */
    java.math.BigInteger getCacheL1D();
    
    /**
     * Gets (as xml) the "CacheL1D" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetCacheL1D();
    
    /**
     * True if has "CacheL1D" attribute
     */
    boolean isSetCacheL1D();
    
    /**
     * Sets the "CacheL1D" attribute
     */
    void setCacheL1D(java.math.BigInteger cacheL1D);
    
    /**
     * Sets (as xml) the "CacheL1D" attribute
     */
    void xsetCacheL1D(org.apache.xmlbeans.XmlInteger cacheL1D);
    
    /**
     * Unsets the "CacheL1D" attribute
     */
    void unsetCacheL1D();
    
    /**
     * Gets the "CacheL2" attribute
     */
    java.math.BigInteger getCacheL2();
    
    /**
     * Gets (as xml) the "CacheL2" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetCacheL2();
    
    /**
     * True if has "CacheL2" attribute
     */
    boolean isSetCacheL2();
    
    /**
     * Sets the "CacheL2" attribute
     */
    void setCacheL2(java.math.BigInteger cacheL2);
    
    /**
     * Sets (as xml) the "CacheL2" attribute
     */
    void xsetCacheL2(org.apache.xmlbeans.XmlInteger cacheL2);
    
    /**
     * Unsets the "CacheL2" attribute
     */
    void unsetCacheL2();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType newInstance() {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
