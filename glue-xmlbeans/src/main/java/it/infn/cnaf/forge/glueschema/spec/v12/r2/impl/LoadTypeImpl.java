/*
 * XML Type:  LoadType
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.LoadType
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2.impl;
/**
 * An XML LoadType(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public class LoadTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.infn.cnaf.forge.glueschema.spec.v12.r2.LoadType
{
    private static final long serialVersionUID = 1L;
    
    public LoadTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LAST1MIN$0 = 
        new javax.xml.namespace.QName("", "Last1Min");
    private static final javax.xml.namespace.QName LAST5MIN$2 = 
        new javax.xml.namespace.QName("", "Last5Min");
    private static final javax.xml.namespace.QName LAST15MIN$4 = 
        new javax.xml.namespace.QName("", "Last15Min");
    
    
    /**
     * Gets the "Last1Min" attribute
     */
    public java.math.BigInteger getLast1Min()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LAST1MIN$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "Last1Min" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetLast1Min()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(LAST1MIN$0);
            return target;
        }
    }
    
    /**
     * True if has "Last1Min" attribute
     */
    public boolean isSetLast1Min()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LAST1MIN$0) != null;
        }
    }
    
    /**
     * Sets the "Last1Min" attribute
     */
    public void setLast1Min(java.math.BigInteger last1Min)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LAST1MIN$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LAST1MIN$0);
            }
            target.setBigIntegerValue(last1Min);
        }
    }
    
    /**
     * Sets (as xml) the "Last1Min" attribute
     */
    public void xsetLast1Min(org.apache.xmlbeans.XmlInteger last1Min)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(LAST1MIN$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(LAST1MIN$0);
            }
            target.set(last1Min);
        }
    }
    
    /**
     * Unsets the "Last1Min" attribute
     */
    public void unsetLast1Min()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LAST1MIN$0);
        }
    }
    
    /**
     * Gets the "Last5Min" attribute
     */
    public java.math.BigInteger getLast5Min()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LAST5MIN$2);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "Last5Min" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetLast5Min()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(LAST5MIN$2);
            return target;
        }
    }
    
    /**
     * True if has "Last5Min" attribute
     */
    public boolean isSetLast5Min()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LAST5MIN$2) != null;
        }
    }
    
    /**
     * Sets the "Last5Min" attribute
     */
    public void setLast5Min(java.math.BigInteger last5Min)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LAST5MIN$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LAST5MIN$2);
            }
            target.setBigIntegerValue(last5Min);
        }
    }
    
    /**
     * Sets (as xml) the "Last5Min" attribute
     */
    public void xsetLast5Min(org.apache.xmlbeans.XmlInteger last5Min)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(LAST5MIN$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(LAST5MIN$2);
            }
            target.set(last5Min);
        }
    }
    
    /**
     * Unsets the "Last5Min" attribute
     */
    public void unsetLast5Min()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LAST5MIN$2);
        }
    }
    
    /**
     * Gets the "Last15Min" attribute
     */
    public java.math.BigInteger getLast15Min()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LAST15MIN$4);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "Last15Min" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetLast15Min()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(LAST15MIN$4);
            return target;
        }
    }
    
    /**
     * True if has "Last15Min" attribute
     */
    public boolean isSetLast15Min()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LAST15MIN$4) != null;
        }
    }
    
    /**
     * Sets the "Last15Min" attribute
     */
    public void setLast15Min(java.math.BigInteger last15Min)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LAST15MIN$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LAST15MIN$4);
            }
            target.setBigIntegerValue(last15Min);
        }
    }
    
    /**
     * Sets (as xml) the "Last15Min" attribute
     */
    public void xsetLast15Min(org.apache.xmlbeans.XmlInteger last15Min)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(LAST15MIN$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(LAST15MIN$4);
            }
            target.set(last15Min);
        }
    }
    
    /**
     * Unsets the "Last15Min" attribute
     */
    public void unsetLast15Min()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LAST15MIN$4);
        }
    }
}
