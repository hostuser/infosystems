/*
 * XML Type:  HostArchitectureFullType
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.HostArchitectureFullType
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2.impl;
/**
 * An XML HostArchitectureFullType(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public class HostArchitectureFullTypeImpl extends it.infn.cnaf.forge.glueschema.spec.v12.r2.impl.HostArchitectureTypeImpl implements it.infn.cnaf.forge.glueschema.spec.v12.r2.HostArchitectureFullType
{
    private static final long serialVersionUID = 1L;
    
    public HostArchitectureFullTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SMTSIZE$0 = 
        new javax.xml.namespace.QName("", "SMTSize");
    
    
    /**
     * Gets the "SMTSize" attribute
     */
    public java.math.BigInteger getSMTSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SMTSIZE$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "SMTSize" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetSMTSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SMTSIZE$0);
            return target;
        }
    }
    
    /**
     * True if has "SMTSize" attribute
     */
    public boolean isSetSMTSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SMTSIZE$0) != null;
        }
    }
    
    /**
     * Sets the "SMTSize" attribute
     */
    public void setSMTSize(java.math.BigInteger smtSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SMTSIZE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SMTSIZE$0);
            }
            target.setBigIntegerValue(smtSize);
        }
    }
    
    /**
     * Sets (as xml) the "SMTSize" attribute
     */
    public void xsetSMTSize(org.apache.xmlbeans.XmlInteger smtSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SMTSIZE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SMTSIZE$0);
            }
            target.set(smtSize);
        }
    }
    
    /**
     * Unsets the "SMTSize" attribute
     */
    public void unsetSMTSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SMTSIZE$0);
        }
    }
}
