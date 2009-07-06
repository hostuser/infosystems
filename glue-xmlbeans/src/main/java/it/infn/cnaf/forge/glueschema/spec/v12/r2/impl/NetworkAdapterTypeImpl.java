/*
 * XML Type:  NetworkAdapterType
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.NetworkAdapterType
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2.impl;
/**
 * An XML NetworkAdapterType(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public class NetworkAdapterTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.infn.cnaf.forge.glueschema.spec.v12.r2.NetworkAdapterType
{
    private static final long serialVersionUID = 1L;
    
    public NetworkAdapterTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INBOUNDIP$0 = 
        new javax.xml.namespace.QName("", "InboundIP");
    private static final javax.xml.namespace.QName OUTBOUNDIP$2 = 
        new javax.xml.namespace.QName("", "OutboundIP");
    
    
    /**
     * Gets the "InboundIP" attribute
     */
    public boolean getInboundIP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INBOUNDIP$0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "InboundIP" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetInboundIP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INBOUNDIP$0);
            return target;
        }
    }
    
    /**
     * True if has "InboundIP" attribute
     */
    public boolean isSetInboundIP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INBOUNDIP$0) != null;
        }
    }
    
    /**
     * Sets the "InboundIP" attribute
     */
    public void setInboundIP(boolean inboundIP)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INBOUNDIP$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INBOUNDIP$0);
            }
            target.setBooleanValue(inboundIP);
        }
    }
    
    /**
     * Sets (as xml) the "InboundIP" attribute
     */
    public void xsetInboundIP(org.apache.xmlbeans.XmlBoolean inboundIP)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INBOUNDIP$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(INBOUNDIP$0);
            }
            target.set(inboundIP);
        }
    }
    
    /**
     * Unsets the "InboundIP" attribute
     */
    public void unsetInboundIP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INBOUNDIP$0);
        }
    }
    
    /**
     * Gets the "OutboundIP" attribute
     */
    public boolean getOutboundIP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OUTBOUNDIP$2);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "OutboundIP" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetOutboundIP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OUTBOUNDIP$2);
            return target;
        }
    }
    
    /**
     * True if has "OutboundIP" attribute
     */
    public boolean isSetOutboundIP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OUTBOUNDIP$2) != null;
        }
    }
    
    /**
     * Sets the "OutboundIP" attribute
     */
    public void setOutboundIP(boolean outboundIP)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OUTBOUNDIP$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OUTBOUNDIP$2);
            }
            target.setBooleanValue(outboundIP);
        }
    }
    
    /**
     * Sets (as xml) the "OutboundIP" attribute
     */
    public void xsetOutboundIP(org.apache.xmlbeans.XmlBoolean outboundIP)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OUTBOUNDIP$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(OUTBOUNDIP$2);
            }
            target.set(outboundIP);
        }
    }
    
    /**
     * Unsets the "OutboundIP" attribute
     */
    public void unsetOutboundIP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OUTBOUNDIP$2);
        }
    }
}
