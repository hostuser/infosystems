/*
 * XML Type:  CEVOViewType
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2.impl;
/**
 * An XML CEVOViewType(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public class CEVOViewTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType
{
    private static final long serialVersionUID = 1L;
    
    public CEVOViewTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACL$0 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "ACL");
    private static final javax.xml.namespace.QName RUNNINGJOBS$2 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "RunningJobs");
    private static final javax.xml.namespace.QName WAITINGJOBS$4 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "WaitingJobs");
    private static final javax.xml.namespace.QName TOTALJOBS$6 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "TotalJobs");
    private static final javax.xml.namespace.QName FREEJOBSLOTS$8 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "FreeJobSlots");
    private static final javax.xml.namespace.QName ESTIMATEDRESPONSETIME$10 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "EstimatedResponseTime");
    private static final javax.xml.namespace.QName WORSTRESPONSETIME$12 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "WorstResponseTime");
    private static final javax.xml.namespace.QName DEFAULTSE$14 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "DefaultSE");
    private static final javax.xml.namespace.QName APPLICATIONDIR$16 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "ApplicationDir");
    private static final javax.xml.namespace.QName DATADIR$18 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "DataDir");
    private static final javax.xml.namespace.QName LOCALID$20 = 
        new javax.xml.namespace.QName("", "LocalID");
    
    
    /**
     * Gets the "ACL" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.ACLType getACL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.ACLType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ACLType)get_store().find_element_user(ACL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ACL" element
     */
    public boolean isSetACL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACL$0) != 0;
        }
    }
    
    /**
     * Sets the "ACL" element
     */
    public void setACL(it.infn.cnaf.forge.glueschema.spec.v12.r2.ACLType acl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.ACLType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ACLType)get_store().find_element_user(ACL$0, 0);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ACLType)get_store().add_element_user(ACL$0);
            }
            target.set(acl);
        }
    }
    
    /**
     * Appends and returns a new empty "ACL" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.ACLType addNewACL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.ACLType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ACLType)get_store().add_element_user(ACL$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ACL" element
     */
    public void unsetACL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACL$0, 0);
        }
    }
    
    /**
     * Gets the "RunningJobs" element
     */
    public java.math.BigInteger getRunningJobs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUNNINGJOBS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "RunningJobs" element
     */
    public org.apache.xmlbeans.XmlInteger xgetRunningJobs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(RUNNINGJOBS$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "RunningJobs" element
     */
    public boolean isSetRunningJobs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RUNNINGJOBS$2) != 0;
        }
    }
    
    /**
     * Sets the "RunningJobs" element
     */
    public void setRunningJobs(java.math.BigInteger runningJobs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUNNINGJOBS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RUNNINGJOBS$2);
            }
            target.setBigIntegerValue(runningJobs);
        }
    }
    
    /**
     * Sets (as xml) the "RunningJobs" element
     */
    public void xsetRunningJobs(org.apache.xmlbeans.XmlInteger runningJobs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(RUNNINGJOBS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(RUNNINGJOBS$2);
            }
            target.set(runningJobs);
        }
    }
    
    /**
     * Unsets the "RunningJobs" element
     */
    public void unsetRunningJobs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RUNNINGJOBS$2, 0);
        }
    }
    
    /**
     * Gets the "WaitingJobs" element
     */
    public java.math.BigInteger getWaitingJobs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WAITINGJOBS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "WaitingJobs" element
     */
    public org.apache.xmlbeans.XmlInteger xgetWaitingJobs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(WAITINGJOBS$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "WaitingJobs" element
     */
    public boolean isSetWaitingJobs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WAITINGJOBS$4) != 0;
        }
    }
    
    /**
     * Sets the "WaitingJobs" element
     */
    public void setWaitingJobs(java.math.BigInteger waitingJobs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WAITINGJOBS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WAITINGJOBS$4);
            }
            target.setBigIntegerValue(waitingJobs);
        }
    }
    
    /**
     * Sets (as xml) the "WaitingJobs" element
     */
    public void xsetWaitingJobs(org.apache.xmlbeans.XmlInteger waitingJobs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(WAITINGJOBS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(WAITINGJOBS$4);
            }
            target.set(waitingJobs);
        }
    }
    
    /**
     * Unsets the "WaitingJobs" element
     */
    public void unsetWaitingJobs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WAITINGJOBS$4, 0);
        }
    }
    
    /**
     * Gets the "TotalJobs" element
     */
    public java.math.BigInteger getTotalJobs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALJOBS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "TotalJobs" element
     */
    public org.apache.xmlbeans.XmlInteger xgetTotalJobs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TOTALJOBS$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "TotalJobs" element
     */
    public boolean isSetTotalJobs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALJOBS$6) != 0;
        }
    }
    
    /**
     * Sets the "TotalJobs" element
     */
    public void setTotalJobs(java.math.BigInteger totalJobs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALJOBS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALJOBS$6);
            }
            target.setBigIntegerValue(totalJobs);
        }
    }
    
    /**
     * Sets (as xml) the "TotalJobs" element
     */
    public void xsetTotalJobs(org.apache.xmlbeans.XmlInteger totalJobs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TOTALJOBS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(TOTALJOBS$6);
            }
            target.set(totalJobs);
        }
    }
    
    /**
     * Unsets the "TotalJobs" element
     */
    public void unsetTotalJobs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALJOBS$6, 0);
        }
    }
    
    /**
     * Gets the "FreeJobSlots" element
     */
    public java.math.BigInteger getFreeJobSlots()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FREEJOBSLOTS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "FreeJobSlots" element
     */
    public org.apache.xmlbeans.XmlInteger xgetFreeJobSlots()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(FREEJOBSLOTS$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "FreeJobSlots" element
     */
    public boolean isSetFreeJobSlots()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FREEJOBSLOTS$8) != 0;
        }
    }
    
    /**
     * Sets the "FreeJobSlots" element
     */
    public void setFreeJobSlots(java.math.BigInteger freeJobSlots)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FREEJOBSLOTS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FREEJOBSLOTS$8);
            }
            target.setBigIntegerValue(freeJobSlots);
        }
    }
    
    /**
     * Sets (as xml) the "FreeJobSlots" element
     */
    public void xsetFreeJobSlots(org.apache.xmlbeans.XmlInteger freeJobSlots)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(FREEJOBSLOTS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(FREEJOBSLOTS$8);
            }
            target.set(freeJobSlots);
        }
    }
    
    /**
     * Unsets the "FreeJobSlots" element
     */
    public void unsetFreeJobSlots()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FREEJOBSLOTS$8, 0);
        }
    }
    
    /**
     * Gets the "EstimatedResponseTime" element
     */
    public java.math.BigInteger getEstimatedResponseTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTIMATEDRESPONSETIME$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "EstimatedResponseTime" element
     */
    public org.apache.xmlbeans.XmlInteger xgetEstimatedResponseTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ESTIMATEDRESPONSETIME$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "EstimatedResponseTime" element
     */
    public boolean isSetEstimatedResponseTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ESTIMATEDRESPONSETIME$10) != 0;
        }
    }
    
    /**
     * Sets the "EstimatedResponseTime" element
     */
    public void setEstimatedResponseTime(java.math.BigInteger estimatedResponseTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTIMATEDRESPONSETIME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ESTIMATEDRESPONSETIME$10);
            }
            target.setBigIntegerValue(estimatedResponseTime);
        }
    }
    
    /**
     * Sets (as xml) the "EstimatedResponseTime" element
     */
    public void xsetEstimatedResponseTime(org.apache.xmlbeans.XmlInteger estimatedResponseTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ESTIMATEDRESPONSETIME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(ESTIMATEDRESPONSETIME$10);
            }
            target.set(estimatedResponseTime);
        }
    }
    
    /**
     * Unsets the "EstimatedResponseTime" element
     */
    public void unsetEstimatedResponseTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ESTIMATEDRESPONSETIME$10, 0);
        }
    }
    
    /**
     * Gets the "WorstResponseTime" element
     */
    public java.math.BigInteger getWorstResponseTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORSTRESPONSETIME$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "WorstResponseTime" element
     */
    public org.apache.xmlbeans.XmlInteger xgetWorstResponseTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(WORSTRESPONSETIME$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "WorstResponseTime" element
     */
    public boolean isSetWorstResponseTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WORSTRESPONSETIME$12) != 0;
        }
    }
    
    /**
     * Sets the "WorstResponseTime" element
     */
    public void setWorstResponseTime(java.math.BigInteger worstResponseTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORSTRESPONSETIME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORSTRESPONSETIME$12);
            }
            target.setBigIntegerValue(worstResponseTime);
        }
    }
    
    /**
     * Sets (as xml) the "WorstResponseTime" element
     */
    public void xsetWorstResponseTime(org.apache.xmlbeans.XmlInteger worstResponseTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(WORSTRESPONSETIME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(WORSTRESPONSETIME$12);
            }
            target.set(worstResponseTime);
        }
    }
    
    /**
     * Unsets the "WorstResponseTime" element
     */
    public void unsetWorstResponseTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WORSTRESPONSETIME$12, 0);
        }
    }
    
    /**
     * Gets the "DefaultSE" element
     */
    public java.lang.String getDefaultSE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTSE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DefaultSE" element
     */
    public org.apache.xmlbeans.XmlString xgetDefaultSE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULTSE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "DefaultSE" element
     */
    public boolean isSetDefaultSE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFAULTSE$14) != 0;
        }
    }
    
    /**
     * Sets the "DefaultSE" element
     */
    public void setDefaultSE(java.lang.String defaultSE)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTSE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEFAULTSE$14);
            }
            target.setStringValue(defaultSE);
        }
    }
    
    /**
     * Sets (as xml) the "DefaultSE" element
     */
    public void xsetDefaultSE(org.apache.xmlbeans.XmlString defaultSE)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULTSE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEFAULTSE$14);
            }
            target.set(defaultSE);
        }
    }
    
    /**
     * Unsets the "DefaultSE" element
     */
    public void unsetDefaultSE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFAULTSE$14, 0);
        }
    }
    
    /**
     * Gets the "ApplicationDir" element
     */
    public java.lang.String getApplicationDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPLICATIONDIR$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ApplicationDir" element
     */
    public org.apache.xmlbeans.XmlString xgetApplicationDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPLICATIONDIR$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "ApplicationDir" element
     */
    public boolean isSetApplicationDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(APPLICATIONDIR$16) != 0;
        }
    }
    
    /**
     * Sets the "ApplicationDir" element
     */
    public void setApplicationDir(java.lang.String applicationDir)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPLICATIONDIR$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APPLICATIONDIR$16);
            }
            target.setStringValue(applicationDir);
        }
    }
    
    /**
     * Sets (as xml) the "ApplicationDir" element
     */
    public void xsetApplicationDir(org.apache.xmlbeans.XmlString applicationDir)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPLICATIONDIR$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APPLICATIONDIR$16);
            }
            target.set(applicationDir);
        }
    }
    
    /**
     * Unsets the "ApplicationDir" element
     */
    public void unsetApplicationDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(APPLICATIONDIR$16, 0);
        }
    }
    
    /**
     * Gets the "DataDir" element
     */
    public java.lang.String getDataDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATADIR$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataDir" element
     */
    public org.apache.xmlbeans.XmlString xgetDataDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATADIR$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "DataDir" element
     */
    public boolean isSetDataDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATADIR$18) != 0;
        }
    }
    
    /**
     * Sets the "DataDir" element
     */
    public void setDataDir(java.lang.String dataDir)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATADIR$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATADIR$18);
            }
            target.setStringValue(dataDir);
        }
    }
    
    /**
     * Sets (as xml) the "DataDir" element
     */
    public void xsetDataDir(org.apache.xmlbeans.XmlString dataDir)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATADIR$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATADIR$18);
            }
            target.set(dataDir);
        }
    }
    
    /**
     * Unsets the "DataDir" element
     */
    public void unsetDataDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATADIR$18, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCALID$20);
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
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.LocalIDType)get_store().find_attribute_user(LOCALID$20);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCALID$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCALID$20);
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
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.LocalIDType)get_store().find_attribute_user(LOCALID$20);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.LocalIDType)get_store().add_attribute_user(LOCALID$20);
            }
            target.set(localID);
        }
    }
}
