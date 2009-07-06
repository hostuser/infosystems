/*
 * XML Type:  ProcessorFullType
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2.impl;
/**
 * An XML ProcessorFullType(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public class ProcessorFullTypeImpl extends it.infn.cnaf.forge.glueschema.spec.v12.r2.impl.ProcessorTypeImpl implements it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType
{
    private static final long serialVersionUID = 1L;
    
    public ProcessorFullTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CACHEL1$0 = 
        new javax.xml.namespace.QName("", "CacheL1");
    private static final javax.xml.namespace.QName CACHEL1I$2 = 
        new javax.xml.namespace.QName("", "CacheL1I");
    private static final javax.xml.namespace.QName CACHEL1D$4 = 
        new javax.xml.namespace.QName("", "CacheL1D");
    private static final javax.xml.namespace.QName CACHEL2$6 = 
        new javax.xml.namespace.QName("", "CacheL2");
    
    
    /**
     * Gets the "CacheL1" attribute
     */
    public java.math.BigInteger getCacheL1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CACHEL1$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "CacheL1" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetCacheL1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CACHEL1$0);
            return target;
        }
    }
    
    /**
     * True if has "CacheL1" attribute
     */
    public boolean isSetCacheL1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CACHEL1$0) != null;
        }
    }
    
    /**
     * Sets the "CacheL1" attribute
     */
    public void setCacheL1(java.math.BigInteger cacheL1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CACHEL1$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CACHEL1$0);
            }
            target.setBigIntegerValue(cacheL1);
        }
    }
    
    /**
     * Sets (as xml) the "CacheL1" attribute
     */
    public void xsetCacheL1(org.apache.xmlbeans.XmlInteger cacheL1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CACHEL1$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(CACHEL1$0);
            }
            target.set(cacheL1);
        }
    }
    
    /**
     * Unsets the "CacheL1" attribute
     */
    public void unsetCacheL1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CACHEL1$0);
        }
    }
    
    /**
     * Gets the "CacheL1I" attribute
     */
    public java.math.BigInteger getCacheL1I()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CACHEL1I$2);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "CacheL1I" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetCacheL1I()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CACHEL1I$2);
            return target;
        }
    }
    
    /**
     * True if has "CacheL1I" attribute
     */
    public boolean isSetCacheL1I()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CACHEL1I$2) != null;
        }
    }
    
    /**
     * Sets the "CacheL1I" attribute
     */
    public void setCacheL1I(java.math.BigInteger cacheL1I)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CACHEL1I$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CACHEL1I$2);
            }
            target.setBigIntegerValue(cacheL1I);
        }
    }
    
    /**
     * Sets (as xml) the "CacheL1I" attribute
     */
    public void xsetCacheL1I(org.apache.xmlbeans.XmlInteger cacheL1I)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CACHEL1I$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(CACHEL1I$2);
            }
            target.set(cacheL1I);
        }
    }
    
    /**
     * Unsets the "CacheL1I" attribute
     */
    public void unsetCacheL1I()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CACHEL1I$2);
        }
    }
    
    /**
     * Gets the "CacheL1D" attribute
     */
    public java.math.BigInteger getCacheL1D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CACHEL1D$4);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "CacheL1D" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetCacheL1D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CACHEL1D$4);
            return target;
        }
    }
    
    /**
     * True if has "CacheL1D" attribute
     */
    public boolean isSetCacheL1D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CACHEL1D$4) != null;
        }
    }
    
    /**
     * Sets the "CacheL1D" attribute
     */
    public void setCacheL1D(java.math.BigInteger cacheL1D)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CACHEL1D$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CACHEL1D$4);
            }
            target.setBigIntegerValue(cacheL1D);
        }
    }
    
    /**
     * Sets (as xml) the "CacheL1D" attribute
     */
    public void xsetCacheL1D(org.apache.xmlbeans.XmlInteger cacheL1D)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CACHEL1D$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(CACHEL1D$4);
            }
            target.set(cacheL1D);
        }
    }
    
    /**
     * Unsets the "CacheL1D" attribute
     */
    public void unsetCacheL1D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CACHEL1D$4);
        }
    }
    
    /**
     * Gets the "CacheL2" attribute
     */
    public java.math.BigInteger getCacheL2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CACHEL2$6);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "CacheL2" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetCacheL2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CACHEL2$6);
            return target;
        }
    }
    
    /**
     * True if has "CacheL2" attribute
     */
    public boolean isSetCacheL2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CACHEL2$6) != null;
        }
    }
    
    /**
     * Sets the "CacheL2" attribute
     */
    public void setCacheL2(java.math.BigInteger cacheL2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CACHEL2$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CACHEL2$6);
            }
            target.setBigIntegerValue(cacheL2);
        }
    }
    
    /**
     * Sets (as xml) the "CacheL2" attribute
     */
    public void xsetCacheL2(org.apache.xmlbeans.XmlInteger cacheL2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CACHEL2$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(CACHEL2$6);
            }
            target.set(cacheL2);
        }
    }
    
    /**
     * Unsets the "CacheL2" attribute
     */
    public void unsetCacheL2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CACHEL2$6);
        }
    }
}
