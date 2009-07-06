/*
 * XML Type:  StoragePartitionType
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.StoragePartitionType
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2.impl;
/**
 * An XML StoragePartitionType(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public class StoragePartitionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.infn.cnaf.forge.glueschema.spec.v12.r2.StoragePartitionType
{
    private static final long serialVersionUID = 1L;
    
    public StoragePartitionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("", "Name");
    private static final javax.xml.namespace.QName SIZE$2 = 
        new javax.xml.namespace.QName("", "Size");
    private static final javax.xml.namespace.QName RATERATE$4 = 
        new javax.xml.namespace.QName("", "RateRate");
    private static final javax.xml.namespace.QName WRITERATE$6 = 
        new javax.xml.namespace.QName("", "WriteRate");
    
    
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
     * Gets the "Size" attribute
     */
    public java.lang.String getSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIZE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Size" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SIZE$2);
            return target;
        }
    }
    
    /**
     * True if has "Size" attribute
     */
    public boolean isSetSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SIZE$2) != null;
        }
    }
    
    /**
     * Sets the "Size" attribute
     */
    public void setSize(java.lang.String size)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIZE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SIZE$2);
            }
            target.setStringValue(size);
        }
    }
    
    /**
     * Sets (as xml) the "Size" attribute
     */
    public void xsetSize(org.apache.xmlbeans.XmlString size)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SIZE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SIZE$2);
            }
            target.set(size);
        }
    }
    
    /**
     * Unsets the "Size" attribute
     */
    public void unsetSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SIZE$2);
        }
    }
    
    /**
     * Gets the "RateRate" attribute
     */
    public java.math.BigInteger getRateRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RATERATE$4);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "RateRate" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetRateRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RATERATE$4);
            return target;
        }
    }
    
    /**
     * True if has "RateRate" attribute
     */
    public boolean isSetRateRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RATERATE$4) != null;
        }
    }
    
    /**
     * Sets the "RateRate" attribute
     */
    public void setRateRate(java.math.BigInteger rateRate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RATERATE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RATERATE$4);
            }
            target.setBigIntegerValue(rateRate);
        }
    }
    
    /**
     * Sets (as xml) the "RateRate" attribute
     */
    public void xsetRateRate(org.apache.xmlbeans.XmlInteger rateRate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RATERATE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(RATERATE$4);
            }
            target.set(rateRate);
        }
    }
    
    /**
     * Unsets the "RateRate" attribute
     */
    public void unsetRateRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RATERATE$4);
        }
    }
    
    /**
     * Gets the "WriteRate" attribute
     */
    public java.math.BigInteger getWriteRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WRITERATE$6);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "WriteRate" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetWriteRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(WRITERATE$6);
            return target;
        }
    }
    
    /**
     * True if has "WriteRate" attribute
     */
    public boolean isSetWriteRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(WRITERATE$6) != null;
        }
    }
    
    /**
     * Sets the "WriteRate" attribute
     */
    public void setWriteRate(java.math.BigInteger writeRate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WRITERATE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WRITERATE$6);
            }
            target.setBigIntegerValue(writeRate);
        }
    }
    
    /**
     * Sets (as xml) the "WriteRate" attribute
     */
    public void xsetWriteRate(org.apache.xmlbeans.XmlInteger writeRate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(WRITERATE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(WRITERATE$6);
            }
            target.set(writeRate);
        }
    }
    
    /**
     * Unsets the "WriteRate" attribute
     */
    public void unsetWriteRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(WRITERATE$6);
        }
    }
}
