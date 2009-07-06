/*
 * XML Type:  ClusterType
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2;


/**
 * An XML ClusterType(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public interface ClusterType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ClusterType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5E378313C67C9A33FF1E8A136471FF4E").resolveHandle("clustertype4650type");
    
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
     * Gets the "TmpDir" element
     */
    java.lang.String getTmpDir();
    
    /**
     * Gets (as xml) the "TmpDir" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType xgetTmpDir();
    
    /**
     * True if has "TmpDir" element
     */
    boolean isSetTmpDir();
    
    /**
     * Sets the "TmpDir" element
     */
    void setTmpDir(java.lang.String tmpDir);
    
    /**
     * Sets (as xml) the "TmpDir" element
     */
    void xsetTmpDir(it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType tmpDir);
    
    /**
     * Unsets the "TmpDir" element
     */
    void unsetTmpDir();
    
    /**
     * Gets the "WNTmpDir" element
     */
    java.lang.String getWNTmpDir();
    
    /**
     * Gets (as xml) the "WNTmpDir" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType xgetWNTmpDir();
    
    /**
     * True if has "WNTmpDir" element
     */
    boolean isSetWNTmpDir();
    
    /**
     * Sets the "WNTmpDir" element
     */
    void setWNTmpDir(java.lang.String wnTmpDir);
    
    /**
     * Sets (as xml) the "WNTmpDir" element
     */
    void xsetWNTmpDir(it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType wnTmpDir);
    
    /**
     * Unsets the "WNTmpDir" element
     */
    void unsetWNTmpDir();
    
    /**
     * Gets array of all "ComputingElement" elements
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.ComputingElementType[] getComputingElementArray();
    
    /**
     * Gets ith "ComputingElement" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.ComputingElementType getComputingElementArray(int i);
    
    /**
     * Returns number of "ComputingElement" element
     */
    int sizeOfComputingElementArray();
    
    /**
     * Sets array of all "ComputingElement" element
     */
    void setComputingElementArray(it.infn.cnaf.forge.glueschema.spec.v12.r2.ComputingElementType[] computingElementArray);
    
    /**
     * Sets ith "ComputingElement" element
     */
    void setComputingElementArray(int i, it.infn.cnaf.forge.glueschema.spec.v12.r2.ComputingElementType computingElement);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ComputingElement" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.ComputingElementType insertNewComputingElement(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ComputingElement" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.ComputingElementType addNewComputingElement();
    
    /**
     * Removes the ith "ComputingElement" element
     */
    void removeComputingElement(int i);
    
    /**
     * Gets array of all "SubCluster" elements
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType[] getSubClusterArray();
    
    /**
     * Gets ith "SubCluster" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType getSubClusterArray(int i);
    
    /**
     * Returns number of "SubCluster" element
     */
    int sizeOfSubClusterArray();
    
    /**
     * Sets array of all "SubCluster" element
     */
    void setSubClusterArray(it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType[] subClusterArray);
    
    /**
     * Sets ith "SubCluster" element
     */
    void setSubClusterArray(int i, it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType subCluster);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SubCluster" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType insertNewSubCluster(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SubCluster" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType addNewSubCluster();
    
    /**
     * Removes the ith "SubCluster" element
     */
    void removeSubCluster(int i);
    
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
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType newInstance() {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
