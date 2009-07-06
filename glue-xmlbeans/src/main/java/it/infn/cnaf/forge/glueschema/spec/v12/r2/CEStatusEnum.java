/*
 * XML Type:  CEStatusEnum
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2;


/**
 * An XML CEStatusEnum(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
 *
 * This is an atomic type that is a restriction of it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum.
 */
public interface CEStatusEnum extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CEStatusEnum.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5E378313C67C9A33FF1E8A136471FF4E").resolveHandle("cestatusenumd5ddtype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum PRODUCTION = Enum.forString("Production");
    static final Enum QUEUEING = Enum.forString("Queueing");
    static final Enum DRAINING = Enum.forString("Draining");
    static final Enum CLOSED = Enum.forString("Closed");
    
    static final int INT_PRODUCTION = Enum.INT_PRODUCTION;
    static final int INT_QUEUEING = Enum.INT_QUEUEING;
    static final int INT_DRAINING = Enum.INT_DRAINING;
    static final int INT_CLOSED = Enum.INT_CLOSED;
    
    /**
     * Enumeration value class for it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_PRODUCTION
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_PRODUCTION = 1;
        static final int INT_QUEUEING = 2;
        static final int INT_DRAINING = 3;
        static final int INT_CLOSED = 4;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("Production", INT_PRODUCTION),
                new Enum("Queueing", INT_QUEUEING),
                new Enum("Draining", INT_DRAINING),
                new Enum("Closed", INT_CLOSED),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum newValue(java.lang.Object obj) {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum) type.newValue( obj ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum newInstance() {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
