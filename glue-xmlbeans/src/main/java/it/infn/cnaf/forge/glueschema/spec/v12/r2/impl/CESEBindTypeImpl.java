/*
 * XML Type:  CESEBindType
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.CESEBindType
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2.impl;
/**
 * An XML CESEBindType(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public class CESEBindTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.infn.cnaf.forge.glueschema.spec.v12.r2.CESEBindType
{
    private static final long serialVersionUID = 1L;
    
    public CESEBindTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CEUNIQUEID$0 = 
        new javax.xml.namespace.QName("", "CEUniqueID");
    private static final javax.xml.namespace.QName SEUNIQUEID$2 = 
        new javax.xml.namespace.QName("", "SEUniqueID");
    private static final javax.xml.namespace.QName MOUNTINFO$4 = 
        new javax.xml.namespace.QName("", "MountInfo");
    private static final javax.xml.namespace.QName WEIGHT$6 = 
        new javax.xml.namespace.QName("", "Weight");
    
    
    /**
     * Gets the "CEUniqueID" attribute
     */
    public java.lang.String getCEUniqueID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CEUNIQUEID$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CEUniqueID" attribute
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType xgetCEUniqueID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType)get_store().find_attribute_user(CEUNIQUEID$0);
            return target;
        }
    }
    
    /**
     * Sets the "CEUniqueID" attribute
     */
    public void setCEUniqueID(java.lang.String ceUniqueID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CEUNIQUEID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CEUNIQUEID$0);
            }
            target.setStringValue(ceUniqueID);
        }
    }
    
    /**
     * Sets (as xml) the "CEUniqueID" attribute
     */
    public void xsetCEUniqueID(it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType ceUniqueID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType)get_store().find_attribute_user(CEUNIQUEID$0);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType)get_store().add_attribute_user(CEUNIQUEID$0);
            }
            target.set(ceUniqueID);
        }
    }
    
    /**
     * Gets the "SEUniqueID" attribute
     */
    public java.lang.String getSEUniqueID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEUNIQUEID$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SEUniqueID" attribute
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType xgetSEUniqueID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType)get_store().find_attribute_user(SEUNIQUEID$2);
            return target;
        }
    }
    
    /**
     * Sets the "SEUniqueID" attribute
     */
    public void setSEUniqueID(java.lang.String seUniqueID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEUNIQUEID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SEUNIQUEID$2);
            }
            target.setStringValue(seUniqueID);
        }
    }
    
    /**
     * Sets (as xml) the "SEUniqueID" attribute
     */
    public void xsetSEUniqueID(it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType seUniqueID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType)get_store().find_attribute_user(SEUNIQUEID$2);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType)get_store().add_attribute_user(SEUNIQUEID$2);
            }
            target.set(seUniqueID);
        }
    }
    
    /**
     * Gets the "MountInfo" attribute
     */
    public java.lang.String getMountInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MOUNTINFO$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MountInfo" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMountInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MOUNTINFO$4);
            return target;
        }
    }
    
    /**
     * True if has "MountInfo" attribute
     */
    public boolean isSetMountInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MOUNTINFO$4) != null;
        }
    }
    
    /**
     * Sets the "MountInfo" attribute
     */
    public void setMountInfo(java.lang.String mountInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MOUNTINFO$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MOUNTINFO$4);
            }
            target.setStringValue(mountInfo);
        }
    }
    
    /**
     * Sets (as xml) the "MountInfo" attribute
     */
    public void xsetMountInfo(org.apache.xmlbeans.XmlString mountInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MOUNTINFO$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MOUNTINFO$4);
            }
            target.set(mountInfo);
        }
    }
    
    /**
     * Unsets the "MountInfo" attribute
     */
    public void unsetMountInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MOUNTINFO$4);
        }
    }
    
    /**
     * Gets the "Weight" attribute
     */
    public java.math.BigInteger getWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WEIGHT$6);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "Weight" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(WEIGHT$6);
            return target;
        }
    }
    
    /**
     * True if has "Weight" attribute
     */
    public boolean isSetWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(WEIGHT$6) != null;
        }
    }
    
    /**
     * Sets the "Weight" attribute
     */
    public void setWeight(java.math.BigInteger weight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WEIGHT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WEIGHT$6);
            }
            target.setBigIntegerValue(weight);
        }
    }
    
    /**
     * Sets (as xml) the "Weight" attribute
     */
    public void xsetWeight(org.apache.xmlbeans.XmlInteger weight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(WEIGHT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(WEIGHT$6);
            }
            target.set(weight);
        }
    }
    
    /**
     * Unsets the "Weight" attribute
     */
    public void unsetWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(WEIGHT$6);
        }
    }
}
