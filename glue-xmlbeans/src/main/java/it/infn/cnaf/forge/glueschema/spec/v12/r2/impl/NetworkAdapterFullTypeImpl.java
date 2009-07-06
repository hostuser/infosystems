/*
 * XML Type:  NetworkAdapterFullType
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.NetworkAdapterFullType
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2.impl;
/**
 * An XML NetworkAdapterFullType(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public class NetworkAdapterFullTypeImpl extends it.infn.cnaf.forge.glueschema.spec.v12.r2.impl.NetworkAdapterTypeImpl implements it.infn.cnaf.forge.glueschema.spec.v12.r2.NetworkAdapterFullType
{
    private static final long serialVersionUID = 1L;
    
    public NetworkAdapterFullTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("", "Name");
    private static final javax.xml.namespace.QName IPADDRESS$2 = 
        new javax.xml.namespace.QName("", "IPAddress");
    private static final javax.xml.namespace.QName MTU$4 = 
        new javax.xml.namespace.QName("", "MTU");
    
    
    /**
     * Gets the "Name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
            return target;
        }
    }
    
    /**
     * True if has "Name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$0) != null;
        }
    }
    
    /**
     * Sets the "Name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "Name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "Name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$0);
        }
    }
    
    /**
     * Gets the "IPAddress" attribute
     */
    public java.lang.String getIPAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IPADDRESS$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "IPAddress" attribute
     */
    public org.apache.xmlbeans.XmlString xgetIPAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IPADDRESS$2);
            return target;
        }
    }
    
    /**
     * True if has "IPAddress" attribute
     */
    public boolean isSetIPAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(IPADDRESS$2) != null;
        }
    }
    
    /**
     * Sets the "IPAddress" attribute
     */
    public void setIPAddress(java.lang.String ipAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IPADDRESS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IPADDRESS$2);
            }
            target.setStringValue(ipAddress);
        }
    }
    
    /**
     * Sets (as xml) the "IPAddress" attribute
     */
    public void xsetIPAddress(org.apache.xmlbeans.XmlString ipAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IPADDRESS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(IPADDRESS$2);
            }
            target.set(ipAddress);
        }
    }
    
    /**
     * Unsets the "IPAddress" attribute
     */
    public void unsetIPAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(IPADDRESS$2);
        }
    }
    
    /**
     * Gets the "MTU" attribute
     */
    public java.math.BigInteger getMTU()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MTU$4);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "MTU" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetMTU()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(MTU$4);
            return target;
        }
    }
    
    /**
     * True if has "MTU" attribute
     */
    public boolean isSetMTU()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MTU$4) != null;
        }
    }
    
    /**
     * Sets the "MTU" attribute
     */
    public void setMTU(java.math.BigInteger mtu)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MTU$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MTU$4);
            }
            target.setBigIntegerValue(mtu);
        }
    }
    
    /**
     * Sets (as xml) the "MTU" attribute
     */
    public void xsetMTU(org.apache.xmlbeans.XmlInteger mtu)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(MTU$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(MTU$4);
            }
            target.set(mtu);
        }
    }
    
    /**
     * Unsets the "MTU" attribute
     */
    public void unsetMTU()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MTU$4);
        }
    }
}
