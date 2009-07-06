/*
 * XML Type:  MainMemoryType
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.MainMemoryType
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2.impl;
/**
 * An XML MainMemoryType(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public class MainMemoryTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.infn.cnaf.forge.glueschema.spec.v12.r2.MainMemoryType
{
    private static final long serialVersionUID = 1L;
    
    public MainMemoryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RAMSIZE$0 = 
        new javax.xml.namespace.QName("", "RAMSize");
    private static final javax.xml.namespace.QName VIRTUALSIZE$2 = 
        new javax.xml.namespace.QName("", "VirtualSize");
    
    
    /**
     * Gets the "RAMSize" attribute
     */
    public java.math.BigInteger getRAMSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RAMSIZE$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "RAMSize" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetRAMSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RAMSIZE$0);
            return target;
        }
    }
    
    /**
     * True if has "RAMSize" attribute
     */
    public boolean isSetRAMSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RAMSIZE$0) != null;
        }
    }
    
    /**
     * Sets the "RAMSize" attribute
     */
    public void setRAMSize(java.math.BigInteger ramSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RAMSIZE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RAMSIZE$0);
            }
            target.setBigIntegerValue(ramSize);
        }
    }
    
    /**
     * Sets (as xml) the "RAMSize" attribute
     */
    public void xsetRAMSize(org.apache.xmlbeans.XmlInteger ramSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RAMSIZE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(RAMSIZE$0);
            }
            target.set(ramSize);
        }
    }
    
    /**
     * Unsets the "RAMSize" attribute
     */
    public void unsetRAMSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RAMSIZE$0);
        }
    }
    
    /**
     * Gets the "VirtualSize" attribute
     */
    public java.math.BigInteger getVirtualSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIRTUALSIZE$2);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "VirtualSize" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetVirtualSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(VIRTUALSIZE$2);
            return target;
        }
    }
    
    /**
     * True if has "VirtualSize" attribute
     */
    public boolean isSetVirtualSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VIRTUALSIZE$2) != null;
        }
    }
    
    /**
     * Sets the "VirtualSize" attribute
     */
    public void setVirtualSize(java.math.BigInteger virtualSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIRTUALSIZE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VIRTUALSIZE$2);
            }
            target.setBigIntegerValue(virtualSize);
        }
    }
    
    /**
     * Sets (as xml) the "VirtualSize" attribute
     */
    public void xsetVirtualSize(org.apache.xmlbeans.XmlInteger virtualSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(VIRTUALSIZE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(VIRTUALSIZE$2);
            }
            target.set(virtualSize);
        }
    }
    
    /**
     * Unsets the "VirtualSize" attribute
     */
    public void unsetVirtualSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VIRTUALSIZE$2);
        }
    }
}
