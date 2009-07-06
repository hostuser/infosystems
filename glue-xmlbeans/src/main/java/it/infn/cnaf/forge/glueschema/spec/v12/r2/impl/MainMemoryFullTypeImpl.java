/*
 * XML Type:  MainMemoryFullType
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.MainMemoryFullType
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2.impl;
/**
 * An XML MainMemoryFullType(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public class MainMemoryFullTypeImpl extends it.infn.cnaf.forge.glueschema.spec.v12.r2.impl.MainMemoryTypeImpl implements it.infn.cnaf.forge.glueschema.spec.v12.r2.MainMemoryFullType
{
    private static final long serialVersionUID = 1L;
    
    public MainMemoryFullTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RAMAVAILABLE$0 = 
        new javax.xml.namespace.QName("", "RAMAvailable");
    private static final javax.xml.namespace.QName VIRTUALAVAILABLE$2 = 
        new javax.xml.namespace.QName("", "VirtualAvailable");
    
    
    /**
     * Gets the "RAMAvailable" attribute
     */
    public java.math.BigInteger getRAMAvailable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RAMAVAILABLE$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "RAMAvailable" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetRAMAvailable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RAMAVAILABLE$0);
            return target;
        }
    }
    
    /**
     * True if has "RAMAvailable" attribute
     */
    public boolean isSetRAMAvailable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RAMAVAILABLE$0) != null;
        }
    }
    
    /**
     * Sets the "RAMAvailable" attribute
     */
    public void setRAMAvailable(java.math.BigInteger ramAvailable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RAMAVAILABLE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RAMAVAILABLE$0);
            }
            target.setBigIntegerValue(ramAvailable);
        }
    }
    
    /**
     * Sets (as xml) the "RAMAvailable" attribute
     */
    public void xsetRAMAvailable(org.apache.xmlbeans.XmlInteger ramAvailable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RAMAVAILABLE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(RAMAVAILABLE$0);
            }
            target.set(ramAvailable);
        }
    }
    
    /**
     * Unsets the "RAMAvailable" attribute
     */
    public void unsetRAMAvailable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RAMAVAILABLE$0);
        }
    }
    
    /**
     * Gets the "VirtualAvailable" attribute
     */
    public java.math.BigInteger getVirtualAvailable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIRTUALAVAILABLE$2);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "VirtualAvailable" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetVirtualAvailable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(VIRTUALAVAILABLE$2);
            return target;
        }
    }
    
    /**
     * True if has "VirtualAvailable" attribute
     */
    public boolean isSetVirtualAvailable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VIRTUALAVAILABLE$2) != null;
        }
    }
    
    /**
     * Sets the "VirtualAvailable" attribute
     */
    public void setVirtualAvailable(java.math.BigInteger virtualAvailable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIRTUALAVAILABLE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VIRTUALAVAILABLE$2);
            }
            target.setBigIntegerValue(virtualAvailable);
        }
    }
    
    /**
     * Sets (as xml) the "VirtualAvailable" attribute
     */
    public void xsetVirtualAvailable(org.apache.xmlbeans.XmlInteger virtualAvailable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(VIRTUALAVAILABLE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(VIRTUALAVAILABLE$2);
            }
            target.set(virtualAvailable);
        }
    }
    
    /**
     * Unsets the "VirtualAvailable" attribute
     */
    public void unsetVirtualAvailable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VIRTUALAVAILABLE$2);
        }
    }
}
