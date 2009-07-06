/*
 * XML Type:  ProcessorType
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2;


/**
 * An XML ProcessorType(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public interface ProcessorType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProcessorType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5E378313C67C9A33FF1E8A136471FF4E").resolveHandle("processortypedc78type");
    
    /**
     * Gets the "Vendor" attribute
     */
    java.lang.String getVendor();
    
    /**
     * Gets (as xml) the "Vendor" attribute
     */
    org.apache.xmlbeans.XmlString xgetVendor();
    
    /**
     * True if has "Vendor" attribute
     */
    boolean isSetVendor();
    
    /**
     * Sets the "Vendor" attribute
     */
    void setVendor(java.lang.String vendor);
    
    /**
     * Sets (as xml) the "Vendor" attribute
     */
    void xsetVendor(org.apache.xmlbeans.XmlString vendor);
    
    /**
     * Unsets the "Vendor" attribute
     */
    void unsetVendor();
    
    /**
     * Gets the "Model" attribute
     */
    java.lang.String getModel();
    
    /**
     * Gets (as xml) the "Model" attribute
     */
    org.apache.xmlbeans.XmlString xgetModel();
    
    /**
     * True if has "Model" attribute
     */
    boolean isSetModel();
    
    /**
     * Sets the "Model" attribute
     */
    void setModel(java.lang.String model);
    
    /**
     * Sets (as xml) the "Model" attribute
     */
    void xsetModel(org.apache.xmlbeans.XmlString model);
    
    /**
     * Unsets the "Model" attribute
     */
    void unsetModel();
    
    /**
     * Gets the "ClockSpeed" attribute
     */
    java.math.BigInteger getClockSpeed();
    
    /**
     * Gets (as xml) the "ClockSpeed" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetClockSpeed();
    
    /**
     * True if has "ClockSpeed" attribute
     */
    boolean isSetClockSpeed();
    
    /**
     * Sets the "ClockSpeed" attribute
     */
    void setClockSpeed(java.math.BigInteger clockSpeed);
    
    /**
     * Sets (as xml) the "ClockSpeed" attribute
     */
    void xsetClockSpeed(org.apache.xmlbeans.XmlInteger clockSpeed);
    
    /**
     * Unsets the "ClockSpeed" attribute
     */
    void unsetClockSpeed();
    
    /**
     * Gets the "InstructionSet" attribute
     */
    java.lang.String getInstructionSet();
    
    /**
     * Gets (as xml) the "InstructionSet" attribute
     */
    org.apache.xmlbeans.XmlString xgetInstructionSet();
    
    /**
     * True if has "InstructionSet" attribute
     */
    boolean isSetInstructionSet();
    
    /**
     * Sets the "InstructionSet" attribute
     */
    void setInstructionSet(java.lang.String instructionSet);
    
    /**
     * Sets (as xml) the "InstructionSet" attribute
     */
    void xsetInstructionSet(org.apache.xmlbeans.XmlString instructionSet);
    
    /**
     * Unsets the "InstructionSet" attribute
     */
    void unsetInstructionSet();
    
    /**
     * Gets the "OtherDescription" attribute
     */
    java.lang.String getOtherDescription();
    
    /**
     * Gets (as xml) the "OtherDescription" attribute
     */
    org.apache.xmlbeans.XmlString xgetOtherDescription();
    
    /**
     * True if has "OtherDescription" attribute
     */
    boolean isSetOtherDescription();
    
    /**
     * Sets the "OtherDescription" attribute
     */
    void setOtherDescription(java.lang.String otherDescription);
    
    /**
     * Sets (as xml) the "OtherDescription" attribute
     */
    void xsetOtherDescription(org.apache.xmlbeans.XmlString otherDescription);
    
    /**
     * Unsets the "OtherDescription" attribute
     */
    void unsetOtherDescription();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType newInstance() {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
