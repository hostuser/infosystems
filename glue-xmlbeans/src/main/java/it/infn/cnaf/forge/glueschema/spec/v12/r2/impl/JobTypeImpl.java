/*
 * XML Type:  JobType
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2.impl;
/**
 * An XML JobType(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public class JobTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType
{
    private static final long serialVersionUID = 1L;
    
    public JobTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GLOBALID$0 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "GlobalID");
    private static final javax.xml.namespace.QName LOCALOWNER$2 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "LocalOwner");
    private static final javax.xml.namespace.QName GLOBALOWNER$4 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "GlobalOwner");
    private static final javax.xml.namespace.QName STATUS$6 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Status");
    private static final javax.xml.namespace.QName SCHEDULERSPECIFIC$8 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "SchedulerSpecific");
    private static final javax.xml.namespace.QName LOCALID$10 = 
        new javax.xml.namespace.QName("", "LocalID");
    
    
    /**
     * Gets the "GlobalID" element
     */
    public java.lang.String getGlobalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GLOBALID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "GlobalID" element
     */
    public org.apache.xmlbeans.XmlString xgetGlobalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GLOBALID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "GlobalID" element
     */
    public boolean isSetGlobalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GLOBALID$0) != 0;
        }
    }
    
    /**
     * Sets the "GlobalID" element
     */
    public void setGlobalID(java.lang.String globalID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GLOBALID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GLOBALID$0);
            }
            target.setStringValue(globalID);
        }
    }
    
    /**
     * Sets (as xml) the "GlobalID" element
     */
    public void xsetGlobalID(org.apache.xmlbeans.XmlString globalID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GLOBALID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GLOBALID$0);
            }
            target.set(globalID);
        }
    }
    
    /**
     * Unsets the "GlobalID" element
     */
    public void unsetGlobalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GLOBALID$0, 0);
        }
    }
    
    /**
     * Gets the "LocalOwner" element
     */
    public java.lang.String getLocalOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALOWNER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LocalOwner" element
     */
    public org.apache.xmlbeans.XmlString xgetLocalOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCALOWNER$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "LocalOwner" element
     */
    public boolean isSetLocalOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCALOWNER$2) != 0;
        }
    }
    
    /**
     * Sets the "LocalOwner" element
     */
    public void setLocalOwner(java.lang.String localOwner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALOWNER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCALOWNER$2);
            }
            target.setStringValue(localOwner);
        }
    }
    
    /**
     * Sets (as xml) the "LocalOwner" element
     */
    public void xsetLocalOwner(org.apache.xmlbeans.XmlString localOwner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCALOWNER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOCALOWNER$2);
            }
            target.set(localOwner);
        }
    }
    
    /**
     * Unsets the "LocalOwner" element
     */
    public void unsetLocalOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCALOWNER$2, 0);
        }
    }
    
    /**
     * Gets the "GlobalOwner" element
     */
    public java.lang.String getGlobalOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GLOBALOWNER$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "GlobalOwner" element
     */
    public org.apache.xmlbeans.XmlString xgetGlobalOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GLOBALOWNER$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "GlobalOwner" element
     */
    public boolean isSetGlobalOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GLOBALOWNER$4) != 0;
        }
    }
    
    /**
     * Sets the "GlobalOwner" element
     */
    public void setGlobalOwner(java.lang.String globalOwner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GLOBALOWNER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GLOBALOWNER$4);
            }
            target.setStringValue(globalOwner);
        }
    }
    
    /**
     * Sets (as xml) the "GlobalOwner" element
     */
    public void xsetGlobalOwner(org.apache.xmlbeans.XmlString globalOwner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GLOBALOWNER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GLOBALOWNER$4);
            }
            target.set(globalOwner);
        }
    }
    
    /**
     * Unsets the "GlobalOwner" element
     */
    public void unsetGlobalOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GLOBALOWNER$4, 0);
        }
    }
    
    /**
     * Gets the "Status" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.JobStatusEnum.Enum getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$6, 0);
            if (target == null)
            {
                return null;
            }
            return (it.infn.cnaf.forge.glueschema.spec.v12.r2.JobStatusEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Status" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.JobStatusEnum xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.JobStatusEnum target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.JobStatusEnum)get_store().find_element_user(STATUS$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "Status" element
     */
    public boolean isSetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUS$6) != 0;
        }
    }
    
    /**
     * Sets the "Status" element
     */
    public void setStatus(it.infn.cnaf.forge.glueschema.spec.v12.r2.JobStatusEnum.Enum status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$6);
            }
            target.setEnumValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "Status" element
     */
    public void xsetStatus(it.infn.cnaf.forge.glueschema.spec.v12.r2.JobStatusEnum status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.JobStatusEnum target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.JobStatusEnum)get_store().find_element_user(STATUS$6, 0);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.JobStatusEnum)get_store().add_element_user(STATUS$6);
            }
            target.set(status);
        }
    }
    
    /**
     * Unsets the "Status" element
     */
    public void unsetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUS$6, 0);
        }
    }
    
    /**
     * Gets the "SchedulerSpecific" element
     */
    public java.lang.String getSchedulerSpecific()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEDULERSPECIFIC$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SchedulerSpecific" element
     */
    public org.apache.xmlbeans.XmlString xgetSchedulerSpecific()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCHEDULERSPECIFIC$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "SchedulerSpecific" element
     */
    public boolean isSetSchedulerSpecific()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCHEDULERSPECIFIC$8) != 0;
        }
    }
    
    /**
     * Sets the "SchedulerSpecific" element
     */
    public void setSchedulerSpecific(java.lang.String schedulerSpecific)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEDULERSPECIFIC$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCHEDULERSPECIFIC$8);
            }
            target.setStringValue(schedulerSpecific);
        }
    }
    
    /**
     * Sets (as xml) the "SchedulerSpecific" element
     */
    public void xsetSchedulerSpecific(org.apache.xmlbeans.XmlString schedulerSpecific)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCHEDULERSPECIFIC$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCHEDULERSPECIFIC$8);
            }
            target.set(schedulerSpecific);
        }
    }
    
    /**
     * Unsets the "SchedulerSpecific" element
     */
    public void unsetSchedulerSpecific()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCHEDULERSPECIFIC$8, 0);
        }
    }
    
    /**
     * Gets the "LocalID" attribute
     */
    public java.lang.String getLocalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCALID$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LocalID" attribute
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.LocalIDType xgetLocalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.LocalIDType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.LocalIDType)get_store().find_attribute_user(LOCALID$10);
            return target;
        }
    }
    
    /**
     * Sets the "LocalID" attribute
     */
    public void setLocalID(java.lang.String localID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCALID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCALID$10);
            }
            target.setStringValue(localID);
        }
    }
    
    /**
     * Sets (as xml) the "LocalID" attribute
     */
    public void xsetLocalID(it.infn.cnaf.forge.glueschema.spec.v12.r2.LocalIDType localID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.LocalIDType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.LocalIDType)get_store().find_attribute_user(LOCALID$10);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.LocalIDType)get_store().add_attribute_user(LOCALID$10);
            }
            target.set(localID);
        }
    }
}
