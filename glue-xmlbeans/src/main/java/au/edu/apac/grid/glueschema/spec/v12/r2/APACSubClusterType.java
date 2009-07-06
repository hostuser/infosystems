/*
 * XML Type:  APACSubClusterType
 * Namespace: http://grid.apac.edu.au/glueschema/Spec/V12/R2
 * Java type: au.edu.apac.grid.glueschema.spec.v12.r2.APACSubClusterType
 *
 * Automatically generated - do not modify.
 */
package au.edu.apac.grid.glueschema.spec.v12.r2;


/**
 * An XML APACSubClusterType(@http://grid.apac.edu.au/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public interface APACSubClusterType extends it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(APACSubClusterType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5E378313C67C9A33FF1E8A136471FF4E").resolveHandle("apacsubclustertype72a1type");
    
    /**
     * Gets array of all "SoftwarePackage" elements
     */
    au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType[] getSoftwarePackageArray();
    
    /**
     * Gets ith "SoftwarePackage" element
     */
    au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType getSoftwarePackageArray(int i);
    
    /**
     * Returns number of "SoftwarePackage" element
     */
    int sizeOfSoftwarePackageArray();
    
    /**
     * Sets array of all "SoftwarePackage" element
     */
    void setSoftwarePackageArray(au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType[] softwarePackageArray);
    
    /**
     * Sets ith "SoftwarePackage" element
     */
    void setSoftwarePackageArray(int i, au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType softwarePackage);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SoftwarePackage" element
     */
    au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType insertNewSoftwarePackage(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SoftwarePackage" element
     */
    au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType addNewSoftwarePackage();
    
    /**
     * Removes the ith "SoftwarePackage" element
     */
    void removeSoftwarePackage(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.edu.apac.grid.glueschema.spec.v12.r2.APACSubClusterType newInstance() {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.APACSubClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.APACSubClusterType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.APACSubClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.edu.apac.grid.glueschema.spec.v12.r2.APACSubClusterType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.APACSubClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.APACSubClusterType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.APACSubClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.edu.apac.grid.glueschema.spec.v12.r2.APACSubClusterType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.APACSubClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.APACSubClusterType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.APACSubClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.APACSubClusterType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.APACSubClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.APACSubClusterType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.APACSubClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.APACSubClusterType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.APACSubClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.APACSubClusterType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.APACSubClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.APACSubClusterType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.APACSubClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.APACSubClusterType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.APACSubClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.APACSubClusterType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.APACSubClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.APACSubClusterType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.APACSubClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.APACSubClusterType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.APACSubClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.edu.apac.grid.glueschema.spec.v12.r2.APACSubClusterType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.APACSubClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.edu.apac.grid.glueschema.spec.v12.r2.APACSubClusterType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.APACSubClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.edu.apac.grid.glueschema.spec.v12.r2.APACSubClusterType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.edu.apac.grid.glueschema.spec.v12.r2.APACSubClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
