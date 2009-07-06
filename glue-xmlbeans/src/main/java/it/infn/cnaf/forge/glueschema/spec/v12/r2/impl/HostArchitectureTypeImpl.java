/*
 * XML Type:  HostArchitectureType
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.HostArchitectureType
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2.impl;
/**
 * An XML HostArchitectureType(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public class HostArchitectureTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.infn.cnaf.forge.glueschema.spec.v12.r2.HostArchitectureType
{
    private static final long serialVersionUID = 1L;
    
    public HostArchitectureTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PLATFORMTYPE$0 = 
        new javax.xml.namespace.QName("", "PlatformType");
    private static final javax.xml.namespace.QName SMPSIZE$2 = 
        new javax.xml.namespace.QName("", "SMPSize");
    
    
    /**
     * Gets the "PlatformType" attribute
     */
    public java.lang.String getPlatformType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PLATFORMTYPE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PlatformType" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPlatformType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PLATFORMTYPE$0);
            return target;
        }
    }
    
    /**
     * True if has "PlatformType" attribute
     */
    public boolean isSetPlatformType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PLATFORMTYPE$0) != null;
        }
    }
    
    /**
     * Sets the "PlatformType" attribute
     */
    public void setPlatformType(java.lang.String platformType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PLATFORMTYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PLATFORMTYPE$0);
            }
            target.setStringValue(platformType);
        }
    }
    
    /**
     * Sets (as xml) the "PlatformType" attribute
     */
    public void xsetPlatformType(org.apache.xmlbeans.XmlString platformType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PLATFORMTYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PLATFORMTYPE$0);
            }
            target.set(platformType);
        }
    }
    
    /**
     * Unsets the "PlatformType" attribute
     */
    public void unsetPlatformType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PLATFORMTYPE$0);
        }
    }
    
    /**
     * Gets the "SMPSize" attribute
     */
    public java.math.BigInteger getSMPSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SMPSIZE$2);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "SMPSize" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetSMPSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SMPSIZE$2);
            return target;
        }
    }
    
    /**
     * True if has "SMPSize" attribute
     */
    public boolean isSetSMPSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SMPSIZE$2) != null;
        }
    }
    
    /**
     * Sets the "SMPSize" attribute
     */
    public void setSMPSize(java.math.BigInteger smpSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SMPSIZE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SMPSIZE$2);
            }
            target.setBigIntegerValue(smpSize);
        }
    }
    
    /**
     * Sets (as xml) the "SMPSize" attribute
     */
    public void xsetSMPSize(org.apache.xmlbeans.XmlInteger smpSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SMPSIZE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SMPSIZE$2);
            }
            target.set(smpSize);
        }
    }
    
    /**
     * Unsets the "SMPSize" attribute
     */
    public void unsetSMPSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SMPSIZE$2);
        }
    }
}
