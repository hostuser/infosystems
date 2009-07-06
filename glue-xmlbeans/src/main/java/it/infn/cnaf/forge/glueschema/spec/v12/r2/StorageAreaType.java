/*
 * XML Type:  StorageAreaType
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2;


/**
 * An XML StorageAreaType(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public interface StorageAreaType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StorageAreaType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5E378313C67C9A33FF1E8A136471FF4E").resolveHandle("storageareatype4ae2type");
    
    /**
     * Gets the "Path" element
     */
    java.lang.String getPath();
    
    /**
     * Gets (as xml) the "Path" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType xgetPath();
    
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
    void xsetPath(it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType path);
    
    /**
     * Unsets the "Path" element
     */
    void unsetPath();
    
    /**
     * Gets the "Type" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.SATypeEnum.Enum getType();
    
    /**
     * Gets (as xml) the "Type" element
     */
    it.infn.cnaf.forge.glueschema.spec.v12.r2.SATypeEnum xgetType();
    
    /**
     * True if has "Type" element
     */
    boolean isSetType();
    
    /**
     * Sets the "Type" element
     */
    void setType(it.infn.cnaf.forge.glueschema.spec.v12.r2.SATypeEnum.Enum type);
    
    /**
     * Sets (as xml) the "Type" element
     */
    void xsetType(it.infn.cnaf.forge.glueschema.spec.v12.r2.SATypeEnum type);
    
    /**
     * Unsets the "Type" element
     */
    void unsetType();
    
    /**
     * Gets the "Quota" element
     */
    java.math.BigInteger getQuota();
    
    /**
     * Gets (as xml) the "Quota" element
     */
    org.apache.xmlbeans.XmlInteger xgetQuota();
    
    /**
     * True if has "Quota" element
     */
    boolean isSetQuota();
    
    /**
     * Sets the "Quota" element
     */
    void setQuota(java.math.BigInteger quota);
    
    /**
     * Sets (as xml) the "Quota" element
     */
    void xsetQuota(org.apache.xmlbeans.XmlInteger quota);
    
    /**
     * Unsets the "Quota" element
     */
    void unsetQuota();
    
    /**
     * Gets the "MinFileSize" element
     */
    java.math.BigInteger getMinFileSize();
    
    /**
     * Gets (as xml) the "MinFileSize" element
     */
    org.apache.xmlbeans.XmlInteger xgetMinFileSize();
    
    /**
     * True if has "MinFileSize" element
     */
    boolean isSetMinFileSize();
    
    /**
     * Sets the "MinFileSize" element
     */
    void setMinFileSize(java.math.BigInteger minFileSize);
    
    /**
     * Sets (as xml) the "MinFileSize" element
     */
    void xsetMinFileSize(org.apache.xmlbeans.XmlInteger minFileSize);
    
    /**
     * Unsets the "MinFileSize" element
     */
    void unsetMinFileSize();
    
    /**
     * Gets the "MaxFileSize" element
     */
    java.math.BigInteger getMaxFileSize();
    
    /**
     * Gets (as xml) the "MaxFileSize" element
     */
    org.apache.xmlbeans.XmlInteger xgetMaxFileSize();
    
    /**
     * True if has "MaxFileSize" element
     */
    boolean isSetMaxFileSize();
    
    /**
     * Sets the "MaxFileSize" element
     */
    void setMaxFileSize(java.math.BigInteger maxFileSize);
    
    /**
     * Sets (as xml) the "MaxFileSize" element
     */
    void xsetMaxFileSize(org.apache.xmlbeans.XmlInteger maxFileSize);
    
    /**
     * Unsets the "MaxFileSize" element
     */
    void unsetMaxFileSize();
    
    /**
     * Gets the "MaxData" element
     */
    java.math.BigInteger getMaxData();
    
    /**
     * Gets (as xml) the "MaxData" element
     */
    org.apache.xmlbeans.XmlInteger xgetMaxData();
    
    /**
     * True if has "MaxData" element
     */
    boolean isSetMaxData();
    
    /**
     * Sets the "MaxData" element
     */
    void setMaxData(java.math.BigInteger maxData);
    
    /**
     * Sets (as xml) the "MaxData" element
     */
    void xsetMaxData(org.apache.xmlbeans.XmlInteger maxData);
    
    /**
     * Unsets the "MaxData" element
     */
    void unsetMaxData();
    
    /**
     * Gets the "MaxNumFiles" element
     */
    java.math.BigInteger getMaxNumFiles();
    
    /**
     * Gets (as xml) the "MaxNumFiles" element
     */
    org.apache.xmlbeans.XmlInteger xgetMaxNumFiles();
    
    /**
     * True if has "MaxNumFiles" element
     */
    boolean isSetMaxNumFiles();
    
    /**
     * Sets the "MaxNumFiles" element
     */
    void setMaxNumFiles(java.math.BigInteger maxNumFiles);
    
    /**
     * Sets (as xml) the "MaxNumFiles" element
     */
    void xsetMaxNumFiles(org.apache.xmlbeans.XmlInteger maxNumFiles);
    
    /**
     * Unsets the "MaxNumFiles" element
     */
    void unsetMaxNumFiles();
    
    /**
     * Gets the "MaxPinDuration" element
     */
    java.math.BigInteger getMaxPinDuration();
    
    /**
     * Gets (as xml) the "MaxPinDuration" element
     */
    org.apache.xmlbeans.XmlInteger xgetMaxPinDuration();
    
    /**
     * True if has "MaxPinDuration" element
     */
    boolean isSetMaxPinDuration();
    
    /**
     * Sets the "MaxPinDuration" element
     */
    void setMaxPinDuration(java.math.BigInteger maxPinDuration);
    
    /**
     * Sets (as xml) the "MaxPinDuration" element
     */
    void xsetMaxPinDuration(org.apache.xmlbeans.XmlInteger maxPinDuration);
    
    /**
     * Unsets the "MaxPinDuration" element
     */
    void unsetMaxPinDuration();
    
    /**
     * Gets the "UsedSpace" element
     */
    java.math.BigInteger getUsedSpace();
    
    /**
     * Gets (as xml) the "UsedSpace" element
     */
    org.apache.xmlbeans.XmlInteger xgetUsedSpace();
    
    /**
     * True if has "UsedSpace" element
     */
    boolean isSetUsedSpace();
    
    /**
     * Sets the "UsedSpace" element
     */
    void setUsedSpace(java.math.BigInteger usedSpace);
    
    /**
     * Sets (as xml) the "UsedSpace" element
     */
    void xsetUsedSpace(org.apache.xmlbeans.XmlInteger usedSpace);
    
    /**
     * Unsets the "UsedSpace" element
     */
    void unsetUsedSpace();
    
    /**
     * Gets the "AvailableSpace" element
     */
    java.math.BigInteger getAvailableSpace();
    
    /**
     * Gets (as xml) the "AvailableSpace" element
     */
    org.apache.xmlbeans.XmlInteger xgetAvailableSpace();
    
    /**
     * True if has "AvailableSpace" element
     */
    boolean isSetAvailableSpace();
    
    /**
     * Sets the "AvailableSpace" element
     */
    void setAvailableSpace(java.math.BigInteger availableSpace);
    
    /**
     * Sets (as xml) the "AvailableSpace" element
     */
    void xsetAvailableSpace(org.apache.xmlbeans.XmlInteger availableSpace);
    
    /**
     * Unsets the "AvailableSpace" element
     */
    void unsetAvailableSpace();
    
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
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType newInstance() {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
