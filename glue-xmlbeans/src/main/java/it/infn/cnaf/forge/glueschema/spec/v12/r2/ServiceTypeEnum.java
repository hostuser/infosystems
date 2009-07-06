/*
 * XML Type:  ServiceTypeEnum
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeEnum
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2;


/**
 * An XML ServiceTypeEnum(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
 *
 * This is an atomic type that is a restriction of it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeEnum.
 */
public interface ServiceTypeEnum extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServiceTypeEnum.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5E378313C67C9A33FF1E8A136471FF4E").resolveHandle("servicetypeenumd474type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum ORG_GLITE_WMS = Enum.forString("org.glite.wms");
    static final Enum ORG_GLITE_RGMA_LATEST_PRODUCER = Enum.forString("org.glite.rgma.LatestProducer");
    static final Enum ORG_GLITE_RGMA_STREAM_PRODUCER = Enum.forString("org.glite.rgma.StreamProducer");
    static final Enum ORG_GLITE_RGMA_DB_PRODUCER = Enum.forString("org.glite.rgma.DBProducer");
    static final Enum ORG_GLITE_RGMA_CANONICAL_PRODUCER = Enum.forString("org.glite.rgma.CanonicalProducer");
    static final Enum ORG_GLITE_RGMA_ARCHIVER = Enum.forString("org.glite.rgma.Archiver");
    static final Enum ORG_GLITE_RGMA_CONSUMER = Enum.forString("org.glite.rgma.Consumer");
    static final Enum ORG_GLITE_RGMA_REGISTRY = Enum.forString("org.glite.rgma.Registry");
    static final Enum ORG_GLITE_RGMA_SCHEMA = Enum.forString("org.glite.rgma.Schema");
    static final Enum ORG_GLITE_RGMA_BROWSER = Enum.forString("org.glite.rgma.Browser");
    static final Enum ORG_GLITE_RGMA_PRIMARY_PRODUCER = Enum.forString("org.glite.rgma.PrimaryProducer");
    static final Enum ORG_GLITE_RGMA_SECONDARY_PRODUCER = Enum.forString("org.glite.rgma.SecondaryProducer");
    static final Enum ORG_GLITE_RGMA_ON_DEMAND_PRODUCER = Enum.forString("org.glite.rgma.OnDemandProducer");
    static final Enum ORG_GLITE_VOMS = Enum.forString("org.glite.voms");
    static final Enum ORG_GLITE_FIREMAN_CATALOG = Enum.forString("org.glite.FiremanCatalog");
    static final Enum ORG_GLITE_SE_INDEX = Enum.forString("org.glite.SEIndex");
    static final Enum ORG_GLITE_METADATA = Enum.forString("org.glite.Metadata");
    static final Enum ORG_GLITE_CHANNEL_MANAGEMENT = Enum.forString("org.glite.ChannelManagement");
    static final Enum ORG_GLITE_FILE_TRANSFER = Enum.forString("org.glite.FileTransfer");
    static final Enum ORG_GLITE_FILE_TRANSFER_STATS = Enum.forString("org.glite.FileTransferStats");
    static final Enum ORG_GLITE_CHANNEL_AGENT = Enum.forString("org.glite.ChannelAgent");
    static final Enum ORG_GLITE_KEY_STORE = Enum.forString("org.glite.KeyStore");
    static final Enum ORG_GLITE_FAS = Enum.forString("org.glite.FAS");
    static final Enum ORG_GLITE_GLITE_IO = Enum.forString("org.glite.gliteIO");
    static final Enum SRM = Enum.forString("SRM");
    static final Enum GSIFTP = Enum.forString("gsiftp");
    static final Enum ORG_EDG_LOCAL_REPLICA_CATALOG = Enum.forString("org.edg.local-replica-catalog");
    static final Enum ORG_EDG_REPLICA_METADATA_CATALOG = Enum.forString("org.edg.replica-metadata-catalog");
    static final Enum ORG_EDG_SE = Enum.forString("org.edg.SE");
    static final Enum IT_INFN_GRID_ICE = Enum.forString("it.infn.GridICE");
    static final Enum MY_PROXY = Enum.forString("MyProxy");
    static final Enum GUMS = Enum.forString("GUMS");
    static final Enum GRID_CAT = Enum.forString("GridCat");
    static final Enum EDU_CALTECH_CACR_MONALISA = Enum.forString("edu.caltech.cacr.monalisa");
    static final Enum OPEN_SSH = Enum.forString("OpenSSH");
    static final Enum MDS_GIIS = Enum.forString("MDS-GIIS");
    static final Enum BDII = Enum.forString("BDII");
    static final Enum RLS = Enum.forString("RLS");
    static final Enum DATA_LOCATION_INTERFACE = Enum.forString("data-location-interface");
    static final Enum PBS_TORQUE_SERVER = Enum.forString("pbs.torque.server");
    static final Enum PBS_TORQUE_MAUI = Enum.forString("pbs.torque.maui");
    static final Enum OTHER = Enum.forString("other");
    
    static final int INT_ORG_GLITE_WMS = Enum.INT_ORG_GLITE_WMS;
    static final int INT_ORG_GLITE_RGMA_LATEST_PRODUCER = Enum.INT_ORG_GLITE_RGMA_LATEST_PRODUCER;
    static final int INT_ORG_GLITE_RGMA_STREAM_PRODUCER = Enum.INT_ORG_GLITE_RGMA_STREAM_PRODUCER;
    static final int INT_ORG_GLITE_RGMA_DB_PRODUCER = Enum.INT_ORG_GLITE_RGMA_DB_PRODUCER;
    static final int INT_ORG_GLITE_RGMA_CANONICAL_PRODUCER = Enum.INT_ORG_GLITE_RGMA_CANONICAL_PRODUCER;
    static final int INT_ORG_GLITE_RGMA_ARCHIVER = Enum.INT_ORG_GLITE_RGMA_ARCHIVER;
    static final int INT_ORG_GLITE_RGMA_CONSUMER = Enum.INT_ORG_GLITE_RGMA_CONSUMER;
    static final int INT_ORG_GLITE_RGMA_REGISTRY = Enum.INT_ORG_GLITE_RGMA_REGISTRY;
    static final int INT_ORG_GLITE_RGMA_SCHEMA = Enum.INT_ORG_GLITE_RGMA_SCHEMA;
    static final int INT_ORG_GLITE_RGMA_BROWSER = Enum.INT_ORG_GLITE_RGMA_BROWSER;
    static final int INT_ORG_GLITE_RGMA_PRIMARY_PRODUCER = Enum.INT_ORG_GLITE_RGMA_PRIMARY_PRODUCER;
    static final int INT_ORG_GLITE_RGMA_SECONDARY_PRODUCER = Enum.INT_ORG_GLITE_RGMA_SECONDARY_PRODUCER;
    static final int INT_ORG_GLITE_RGMA_ON_DEMAND_PRODUCER = Enum.INT_ORG_GLITE_RGMA_ON_DEMAND_PRODUCER;
    static final int INT_ORG_GLITE_VOMS = Enum.INT_ORG_GLITE_VOMS;
    static final int INT_ORG_GLITE_FIREMAN_CATALOG = Enum.INT_ORG_GLITE_FIREMAN_CATALOG;
    static final int INT_ORG_GLITE_SE_INDEX = Enum.INT_ORG_GLITE_SE_INDEX;
    static final int INT_ORG_GLITE_METADATA = Enum.INT_ORG_GLITE_METADATA;
    static final int INT_ORG_GLITE_CHANNEL_MANAGEMENT = Enum.INT_ORG_GLITE_CHANNEL_MANAGEMENT;
    static final int INT_ORG_GLITE_FILE_TRANSFER = Enum.INT_ORG_GLITE_FILE_TRANSFER;
    static final int INT_ORG_GLITE_FILE_TRANSFER_STATS = Enum.INT_ORG_GLITE_FILE_TRANSFER_STATS;
    static final int INT_ORG_GLITE_CHANNEL_AGENT = Enum.INT_ORG_GLITE_CHANNEL_AGENT;
    static final int INT_ORG_GLITE_KEY_STORE = Enum.INT_ORG_GLITE_KEY_STORE;
    static final int INT_ORG_GLITE_FAS = Enum.INT_ORG_GLITE_FAS;
    static final int INT_ORG_GLITE_GLITE_IO = Enum.INT_ORG_GLITE_GLITE_IO;
    static final int INT_SRM = Enum.INT_SRM;
    static final int INT_GSIFTP = Enum.INT_GSIFTP;
    static final int INT_ORG_EDG_LOCAL_REPLICA_CATALOG = Enum.INT_ORG_EDG_LOCAL_REPLICA_CATALOG;
    static final int INT_ORG_EDG_REPLICA_METADATA_CATALOG = Enum.INT_ORG_EDG_REPLICA_METADATA_CATALOG;
    static final int INT_ORG_EDG_SE = Enum.INT_ORG_EDG_SE;
    static final int INT_IT_INFN_GRID_ICE = Enum.INT_IT_INFN_GRID_ICE;
    static final int INT_MY_PROXY = Enum.INT_MY_PROXY;
    static final int INT_GUMS = Enum.INT_GUMS;
    static final int INT_GRID_CAT = Enum.INT_GRID_CAT;
    static final int INT_EDU_CALTECH_CACR_MONALISA = Enum.INT_EDU_CALTECH_CACR_MONALISA;
    static final int INT_OPEN_SSH = Enum.INT_OPEN_SSH;
    static final int INT_MDS_GIIS = Enum.INT_MDS_GIIS;
    static final int INT_BDII = Enum.INT_BDII;
    static final int INT_RLS = Enum.INT_RLS;
    static final int INT_DATA_LOCATION_INTERFACE = Enum.INT_DATA_LOCATION_INTERFACE;
    static final int INT_PBS_TORQUE_SERVER = Enum.INT_PBS_TORQUE_SERVER;
    static final int INT_PBS_TORQUE_MAUI = Enum.INT_PBS_TORQUE_MAUI;
    static final int INT_OTHER = Enum.INT_OTHER;
    
    /**
     * Enumeration value class for it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeEnum.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_ORG_GLITE_WMS
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
        
        static final int INT_ORG_GLITE_WMS = 1;
        static final int INT_ORG_GLITE_RGMA_LATEST_PRODUCER = 2;
        static final int INT_ORG_GLITE_RGMA_STREAM_PRODUCER = 3;
        static final int INT_ORG_GLITE_RGMA_DB_PRODUCER = 4;
        static final int INT_ORG_GLITE_RGMA_CANONICAL_PRODUCER = 5;
        static final int INT_ORG_GLITE_RGMA_ARCHIVER = 6;
        static final int INT_ORG_GLITE_RGMA_CONSUMER = 7;
        static final int INT_ORG_GLITE_RGMA_REGISTRY = 8;
        static final int INT_ORG_GLITE_RGMA_SCHEMA = 9;
        static final int INT_ORG_GLITE_RGMA_BROWSER = 10;
        static final int INT_ORG_GLITE_RGMA_PRIMARY_PRODUCER = 11;
        static final int INT_ORG_GLITE_RGMA_SECONDARY_PRODUCER = 12;
        static final int INT_ORG_GLITE_RGMA_ON_DEMAND_PRODUCER = 13;
        static final int INT_ORG_GLITE_VOMS = 14;
        static final int INT_ORG_GLITE_FIREMAN_CATALOG = 15;
        static final int INT_ORG_GLITE_SE_INDEX = 16;
        static final int INT_ORG_GLITE_METADATA = 17;
        static final int INT_ORG_GLITE_CHANNEL_MANAGEMENT = 18;
        static final int INT_ORG_GLITE_FILE_TRANSFER = 19;
        static final int INT_ORG_GLITE_FILE_TRANSFER_STATS = 20;
        static final int INT_ORG_GLITE_CHANNEL_AGENT = 21;
        static final int INT_ORG_GLITE_KEY_STORE = 22;
        static final int INT_ORG_GLITE_FAS = 23;
        static final int INT_ORG_GLITE_GLITE_IO = 24;
        static final int INT_SRM = 25;
        static final int INT_GSIFTP = 26;
        static final int INT_ORG_EDG_LOCAL_REPLICA_CATALOG = 27;
        static final int INT_ORG_EDG_REPLICA_METADATA_CATALOG = 28;
        static final int INT_ORG_EDG_SE = 29;
        static final int INT_IT_INFN_GRID_ICE = 30;
        static final int INT_MY_PROXY = 31;
        static final int INT_GUMS = 32;
        static final int INT_GRID_CAT = 33;
        static final int INT_EDU_CALTECH_CACR_MONALISA = 34;
        static final int INT_OPEN_SSH = 35;
        static final int INT_MDS_GIIS = 36;
        static final int INT_BDII = 37;
        static final int INT_RLS = 38;
        static final int INT_DATA_LOCATION_INTERFACE = 39;
        static final int INT_PBS_TORQUE_SERVER = 40;
        static final int INT_PBS_TORQUE_MAUI = 41;
        static final int INT_OTHER = 42;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("org.glite.wms", INT_ORG_GLITE_WMS),
                new Enum("org.glite.rgma.LatestProducer", INT_ORG_GLITE_RGMA_LATEST_PRODUCER),
                new Enum("org.glite.rgma.StreamProducer", INT_ORG_GLITE_RGMA_STREAM_PRODUCER),
                new Enum("org.glite.rgma.DBProducer", INT_ORG_GLITE_RGMA_DB_PRODUCER),
                new Enum("org.glite.rgma.CanonicalProducer", INT_ORG_GLITE_RGMA_CANONICAL_PRODUCER),
                new Enum("org.glite.rgma.Archiver", INT_ORG_GLITE_RGMA_ARCHIVER),
                new Enum("org.glite.rgma.Consumer", INT_ORG_GLITE_RGMA_CONSUMER),
                new Enum("org.glite.rgma.Registry", INT_ORG_GLITE_RGMA_REGISTRY),
                new Enum("org.glite.rgma.Schema", INT_ORG_GLITE_RGMA_SCHEMA),
                new Enum("org.glite.rgma.Browser", INT_ORG_GLITE_RGMA_BROWSER),
                new Enum("org.glite.rgma.PrimaryProducer", INT_ORG_GLITE_RGMA_PRIMARY_PRODUCER),
                new Enum("org.glite.rgma.SecondaryProducer", INT_ORG_GLITE_RGMA_SECONDARY_PRODUCER),
                new Enum("org.glite.rgma.OnDemandProducer", INT_ORG_GLITE_RGMA_ON_DEMAND_PRODUCER),
                new Enum("org.glite.voms", INT_ORG_GLITE_VOMS),
                new Enum("org.glite.FiremanCatalog", INT_ORG_GLITE_FIREMAN_CATALOG),
                new Enum("org.glite.SEIndex", INT_ORG_GLITE_SE_INDEX),
                new Enum("org.glite.Metadata", INT_ORG_GLITE_METADATA),
                new Enum("org.glite.ChannelManagement", INT_ORG_GLITE_CHANNEL_MANAGEMENT),
                new Enum("org.glite.FileTransfer", INT_ORG_GLITE_FILE_TRANSFER),
                new Enum("org.glite.FileTransferStats", INT_ORG_GLITE_FILE_TRANSFER_STATS),
                new Enum("org.glite.ChannelAgent", INT_ORG_GLITE_CHANNEL_AGENT),
                new Enum("org.glite.KeyStore", INT_ORG_GLITE_KEY_STORE),
                new Enum("org.glite.FAS", INT_ORG_GLITE_FAS),
                new Enum("org.glite.gliteIO", INT_ORG_GLITE_GLITE_IO),
                new Enum("SRM", INT_SRM),
                new Enum("gsiftp", INT_GSIFTP),
                new Enum("org.edg.local-replica-catalog", INT_ORG_EDG_LOCAL_REPLICA_CATALOG),
                new Enum("org.edg.replica-metadata-catalog", INT_ORG_EDG_REPLICA_METADATA_CATALOG),
                new Enum("org.edg.SE", INT_ORG_EDG_SE),
                new Enum("it.infn.GridICE", INT_IT_INFN_GRID_ICE),
                new Enum("MyProxy", INT_MY_PROXY),
                new Enum("GUMS", INT_GUMS),
                new Enum("GridCat", INT_GRID_CAT),
                new Enum("edu.caltech.cacr.monalisa", INT_EDU_CALTECH_CACR_MONALISA),
                new Enum("OpenSSH", INT_OPEN_SSH),
                new Enum("MDS-GIIS", INT_MDS_GIIS),
                new Enum("BDII", INT_BDII),
                new Enum("RLS", INT_RLS),
                new Enum("data-location-interface", INT_DATA_LOCATION_INTERFACE),
                new Enum("pbs.torque.server", INT_PBS_TORQUE_SERVER),
                new Enum("pbs.torque.maui", INT_PBS_TORQUE_MAUI),
                new Enum("other", INT_OTHER),
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
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeEnum newValue(java.lang.Object obj) {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeEnum) type.newValue( obj ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeEnum newInstance() {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeEnum newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeEnum parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeEnum parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeEnum parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeEnum parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeEnum parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeEnum parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeEnum parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeEnum parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeEnum parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeEnum parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeEnum parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeEnum parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeEnum parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeEnum parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeEnum parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeEnum parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeEnum) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
