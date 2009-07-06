/*
 * XML Type:  BenchmarkType
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.BenchmarkType
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2.impl;
/**
 * An XML BenchmarkType(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public class BenchmarkTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.infn.cnaf.forge.glueschema.spec.v12.r2.BenchmarkType
{
    private static final long serialVersionUID = 1L;
    
    public BenchmarkTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SI00$0 = 
        new javax.xml.namespace.QName("", "SI00");
    private static final javax.xml.namespace.QName SF00$2 = 
        new javax.xml.namespace.QName("", "SF00");
    
    
    /**
     * Gets the "SI00" attribute
     */
    public java.math.BigInteger getSI00()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SI00$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "SI00" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetSI00()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SI00$0);
            return target;
        }
    }
    
    /**
     * True if has "SI00" attribute
     */
    public boolean isSetSI00()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SI00$0) != null;
        }
    }
    
    /**
     * Sets the "SI00" attribute
     */
    public void setSI00(java.math.BigInteger si00)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SI00$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SI00$0);
            }
            target.setBigIntegerValue(si00);
        }
    }
    
    /**
     * Sets (as xml) the "SI00" attribute
     */
    public void xsetSI00(org.apache.xmlbeans.XmlInteger si00)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SI00$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SI00$0);
            }
            target.set(si00);
        }
    }
    
    /**
     * Unsets the "SI00" attribute
     */
    public void unsetSI00()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SI00$0);
        }
    }
    
    /**
     * Gets the "SF00" attribute
     */
    public java.math.BigInteger getSF00()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SF00$2);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "SF00" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetSF00()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SF00$2);
            return target;
        }
    }
    
    /**
     * True if has "SF00" attribute
     */
    public boolean isSetSF00()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SF00$2) != null;
        }
    }
    
    /**
     * Sets the "SF00" attribute
     */
    public void setSF00(java.math.BigInteger sf00)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SF00$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SF00$2);
            }
            target.setBigIntegerValue(sf00);
        }
    }
    
    /**
     * Sets (as xml) the "SF00" attribute
     */
    public void xsetSF00(org.apache.xmlbeans.XmlInteger sf00)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SF00$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SF00$2);
            }
            target.set(sf00);
        }
    }
    
    /**
     * Unsets the "SF00" attribute
     */
    public void unsetSF00()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SF00$2);
        }
    }
}
