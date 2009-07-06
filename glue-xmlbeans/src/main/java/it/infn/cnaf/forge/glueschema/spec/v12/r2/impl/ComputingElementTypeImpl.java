/*
 * XML Type:  ComputingElementType
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.ComputingElementType
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2.impl;
/**
 * An XML ComputingElementType(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public class ComputingElementTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.infn.cnaf.forge.glueschema.spec.v12.r2.ComputingElementType
{
    private static final long serialVersionUID = 1L;
    
    public ComputingElementTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INFORMATIONSERVICEURL$0 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "InformationServiceURL");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Name");
    private static final javax.xml.namespace.QName LRMSTYPE$4 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "LRMSType");
    private static final javax.xml.namespace.QName LRMSVERSION$6 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "LRMSVersion");
    private static final javax.xml.namespace.QName GRAMVERSION$8 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "GRAMVersion");
    private static final javax.xml.namespace.QName HOSTNAME$10 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "HostName");
    private static final javax.xml.namespace.QName GATEKEEPERPORT$12 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "GateKeeperPort");
    private static final javax.xml.namespace.QName JOBMANAGER$14 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "JobManager");
    private static final javax.xml.namespace.QName CONTACTSTRING$16 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "ContactString");
    private static final javax.xml.namespace.QName APPLICATIONDIR$18 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "ApplicationDir");
    private static final javax.xml.namespace.QName DATADIR$20 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "DataDir");
    private static final javax.xml.namespace.QName DEFAULTSE$22 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "DefaultSE");
    private static final javax.xml.namespace.QName STATUS$24 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Status");
    private static final javax.xml.namespace.QName RUNNINGJOBS$26 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "RunningJobs");
    private static final javax.xml.namespace.QName WAITINGJOBS$28 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "WaitingJobs");
    private static final javax.xml.namespace.QName TOTALJOBS$30 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "TotalJobs");
    private static final javax.xml.namespace.QName ESTIMATEDRESPONSETIME$32 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "EstimatedResponseTime");
    private static final javax.xml.namespace.QName WORSTRESPONSETIME$34 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "WorstResponseTime");
    private static final javax.xml.namespace.QName FREEJOBSLOTS$36 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "FreeJobSlots");
    private static final javax.xml.namespace.QName MAXWALLCLOCKTIME$38 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "MaxWallClockTime");
    private static final javax.xml.namespace.QName MAXCPUTIME$40 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "MaxCPUTime");
    private static final javax.xml.namespace.QName MAXTOTALJOBS$42 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "MaxTotalJobs");
    private static final javax.xml.namespace.QName MAXRUNNINGJOBS$44 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "MaxRunningJobs");
    private static final javax.xml.namespace.QName PRIORITY$46 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Priority");
    private static final javax.xml.namespace.QName ASSIGNEDJOBSLOTS$48 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "AssignedJobSlots");
    private static final javax.xml.namespace.QName ACL$50 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "ACL");
    private static final javax.xml.namespace.QName JOB$52 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Job");
    private static final javax.xml.namespace.QName VOVIEW$54 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "VOView");
    private static final javax.xml.namespace.QName UNIQUEID$56 = 
        new javax.xml.namespace.QName("", "UniqueID");
    
    
    /**
     * Gets the "InformationServiceURL" element
     */
    public java.lang.String getInformationServiceURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INFORMATIONSERVICEURL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "InformationServiceURL" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetInformationServiceURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(INFORMATIONSERVICEURL$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "InformationServiceURL" element
     */
    public boolean isSetInformationServiceURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INFORMATIONSERVICEURL$0) != 0;
        }
    }
    
    /**
     * Sets the "InformationServiceURL" element
     */
    public void setInformationServiceURL(java.lang.String informationServiceURL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INFORMATIONSERVICEURL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INFORMATIONSERVICEURL$0);
            }
            target.setStringValue(informationServiceURL);
        }
    }
    
    /**
     * Sets (as xml) the "InformationServiceURL" element
     */
    public void xsetInformationServiceURL(org.apache.xmlbeans.XmlAnyURI informationServiceURL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(INFORMATIONSERVICEURL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(INFORMATIONSERVICEURL$0);
            }
            target.set(informationServiceURL);
        }
    }
    
    /**
     * Unsets the "InformationServiceURL" element
     */
    public void unsetInformationServiceURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INFORMATIONSERVICEURL$0, 0);
        }
    }
    
    /**
     * Gets the "Name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$2) != 0;
        }
    }
    
    /**
     * Sets the "Name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$2);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "Name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$2);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "Name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$2, 0);
        }
    }
    
    /**
     * Gets the "LRMSType" element
     */
    public java.lang.String getLRMSType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LRMSTYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LRMSType" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.LRMSTypeOpenEnum xgetLRMSType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.LRMSTypeOpenEnum target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.LRMSTypeOpenEnum)get_store().find_element_user(LRMSTYPE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "LRMSType" element
     */
    public boolean isSetLRMSType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LRMSTYPE$4) != 0;
        }
    }
    
    /**
     * Sets the "LRMSType" element
     */
    public void setLRMSType(java.lang.String lrmsType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LRMSTYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LRMSTYPE$4);
            }
            target.setStringValue(lrmsType);
        }
    }
    
    /**
     * Sets (as xml) the "LRMSType" element
     */
    public void xsetLRMSType(it.infn.cnaf.forge.glueschema.spec.v12.r2.LRMSTypeOpenEnum lrmsType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.LRMSTypeOpenEnum target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.LRMSTypeOpenEnum)get_store().find_element_user(LRMSTYPE$4, 0);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.LRMSTypeOpenEnum)get_store().add_element_user(LRMSTYPE$4);
            }
            target.set(lrmsType);
        }
    }
    
    /**
     * Unsets the "LRMSType" element
     */
    public void unsetLRMSType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LRMSTYPE$4, 0);
        }
    }
    
    /**
     * Gets the "LRMSVersion" element
     */
    public java.lang.String getLRMSVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LRMSVERSION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LRMSVersion" element
     */
    public org.apache.xmlbeans.XmlString xgetLRMSVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LRMSVERSION$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "LRMSVersion" element
     */
    public boolean isSetLRMSVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LRMSVERSION$6) != 0;
        }
    }
    
    /**
     * Sets the "LRMSVersion" element
     */
    public void setLRMSVersion(java.lang.String lrmsVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LRMSVERSION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LRMSVERSION$6);
            }
            target.setStringValue(lrmsVersion);
        }
    }
    
    /**
     * Sets (as xml) the "LRMSVersion" element
     */
    public void xsetLRMSVersion(org.apache.xmlbeans.XmlString lrmsVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LRMSVERSION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LRMSVERSION$6);
            }
            target.set(lrmsVersion);
        }
    }
    
    /**
     * Unsets the "LRMSVersion" element
     */
    public void unsetLRMSVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LRMSVERSION$6, 0);
        }
    }
    
    /**
     * Gets the "GRAMVersion" element
     */
    public java.lang.String getGRAMVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GRAMVERSION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "GRAMVersion" element
     */
    public org.apache.xmlbeans.XmlString xgetGRAMVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GRAMVERSION$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "GRAMVersion" element
     */
    public boolean isSetGRAMVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GRAMVERSION$8) != 0;
        }
    }
    
    /**
     * Sets the "GRAMVersion" element
     */
    public void setGRAMVersion(java.lang.String gramVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GRAMVERSION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GRAMVERSION$8);
            }
            target.setStringValue(gramVersion);
        }
    }
    
    /**
     * Sets (as xml) the "GRAMVersion" element
     */
    public void xsetGRAMVersion(org.apache.xmlbeans.XmlString gramVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GRAMVERSION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GRAMVERSION$8);
            }
            target.set(gramVersion);
        }
    }
    
    /**
     * Unsets the "GRAMVersion" element
     */
    public void unsetGRAMVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GRAMVERSION$8, 0);
        }
    }
    
    /**
     * Gets the "HostName" element
     */
    public java.lang.String getHostName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOSTNAME$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "HostName" element
     */
    public org.apache.xmlbeans.XmlString xgetHostName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOSTNAME$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "HostName" element
     */
    public boolean isSetHostName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HOSTNAME$10) != 0;
        }
    }
    
    /**
     * Sets the "HostName" element
     */
    public void setHostName(java.lang.String hostName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOSTNAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOSTNAME$10);
            }
            target.setStringValue(hostName);
        }
    }
    
    /**
     * Sets (as xml) the "HostName" element
     */
    public void xsetHostName(org.apache.xmlbeans.XmlString hostName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOSTNAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HOSTNAME$10);
            }
            target.set(hostName);
        }
    }
    
    /**
     * Unsets the "HostName" element
     */
    public void unsetHostName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HOSTNAME$10, 0);
        }
    }
    
    /**
     * Gets the "GateKeeperPort" element
     */
    public java.math.BigInteger getGateKeeperPort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GATEKEEPERPORT$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "GateKeeperPort" element
     */
    public org.apache.xmlbeans.XmlInteger xgetGateKeeperPort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(GATEKEEPERPORT$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "GateKeeperPort" element
     */
    public boolean isSetGateKeeperPort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GATEKEEPERPORT$12) != 0;
        }
    }
    
    /**
     * Sets the "GateKeeperPort" element
     */
    public void setGateKeeperPort(java.math.BigInteger gateKeeperPort)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GATEKEEPERPORT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GATEKEEPERPORT$12);
            }
            target.setBigIntegerValue(gateKeeperPort);
        }
    }
    
    /**
     * Sets (as xml) the "GateKeeperPort" element
     */
    public void xsetGateKeeperPort(org.apache.xmlbeans.XmlInteger gateKeeperPort)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(GATEKEEPERPORT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(GATEKEEPERPORT$12);
            }
            target.set(gateKeeperPort);
        }
    }
    
    /**
     * Unsets the "GateKeeperPort" element
     */
    public void unsetGateKeeperPort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GATEKEEPERPORT$12, 0);
        }
    }
    
    /**
     * Gets the "JobManager" element
     */
    public java.lang.String getJobManager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBMANAGER$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "JobManager" element
     */
    public org.apache.xmlbeans.XmlString xgetJobManager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBMANAGER$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "JobManager" element
     */
    public boolean isSetJobManager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(JOBMANAGER$14) != 0;
        }
    }
    
    /**
     * Sets the "JobManager" element
     */
    public void setJobManager(java.lang.String jobManager)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBMANAGER$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JOBMANAGER$14);
            }
            target.setStringValue(jobManager);
        }
    }
    
    /**
     * Sets (as xml) the "JobManager" element
     */
    public void xsetJobManager(org.apache.xmlbeans.XmlString jobManager)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBMANAGER$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(JOBMANAGER$14);
            }
            target.set(jobManager);
        }
    }
    
    /**
     * Unsets the "JobManager" element
     */
    public void unsetJobManager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(JOBMANAGER$14, 0);
        }
    }
    
    /**
     * Gets array of all "ContactString" elements
     */
    public java.lang.String[] getContactStringArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTACTSTRING$16, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "ContactString" element
     */
    public java.lang.String getContactStringArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTSTRING$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "ContactString" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetContactStringArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTACTSTRING$16, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "ContactString" element
     */
    public org.apache.xmlbeans.XmlString xgetContactStringArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACTSTRING$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "ContactString" element
     */
    public int sizeOfContactStringArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTACTSTRING$16);
        }
    }
    
    /**
     * Sets array of all "ContactString" element
     */
    public void setContactStringArray(java.lang.String[] contactStringArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(contactStringArray, CONTACTSTRING$16);
        }
    }
    
    /**
     * Sets ith "ContactString" element
     */
    public void setContactStringArray(int i, java.lang.String contactString)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTSTRING$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(contactString);
        }
    }
    
    /**
     * Sets (as xml) array of all "ContactString" element
     */
    public void xsetContactStringArray(org.apache.xmlbeans.XmlString[]contactStringArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(contactStringArray, CONTACTSTRING$16);
        }
    }
    
    /**
     * Sets (as xml) ith "ContactString" element
     */
    public void xsetContactStringArray(int i, org.apache.xmlbeans.XmlString contactString)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACTSTRING$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(contactString);
        }
    }
    
    /**
     * Inserts the value as the ith "ContactString" element
     */
    public void insertContactString(int i, java.lang.String contactString)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CONTACTSTRING$16, i);
            target.setStringValue(contactString);
        }
    }
    
    /**
     * Appends the value as the last "ContactString" element
     */
    public void addContactString(java.lang.String contactString)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACTSTRING$16);
            target.setStringValue(contactString);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ContactString" element
     */
    public org.apache.xmlbeans.XmlString insertNewContactString(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(CONTACTSTRING$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ContactString" element
     */
    public org.apache.xmlbeans.XmlString addNewContactString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTACTSTRING$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "ContactString" element
     */
    public void removeContactString(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTACTSTRING$16, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPLICATIONDIR$18, 0);
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
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType xgetApplicationDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType)get_store().find_element_user(APPLICATIONDIR$18, 0);
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
            return get_store().count_elements(APPLICATIONDIR$18) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPLICATIONDIR$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APPLICATIONDIR$18);
            }
            target.setStringValue(applicationDir);
        }
    }
    
    /**
     * Sets (as xml) the "ApplicationDir" element
     */
    public void xsetApplicationDir(it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType applicationDir)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType)get_store().find_element_user(APPLICATIONDIR$18, 0);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType)get_store().add_element_user(APPLICATIONDIR$18);
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
            get_store().remove_element(APPLICATIONDIR$18, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATADIR$20, 0);
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
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType xgetDataDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType)get_store().find_element_user(DATADIR$20, 0);
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
            return get_store().count_elements(DATADIR$20) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATADIR$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATADIR$20);
            }
            target.setStringValue(dataDir);
        }
    }
    
    /**
     * Sets (as xml) the "DataDir" element
     */
    public void xsetDataDir(it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType dataDir)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType)get_store().find_element_user(DATADIR$20, 0);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType)get_store().add_element_user(DATADIR$20);
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
            get_store().remove_element(DATADIR$20, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTSE$22, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULTSE$22, 0);
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
            return get_store().count_elements(DEFAULTSE$22) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTSE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEFAULTSE$22);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULTSE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEFAULTSE$22);
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
            get_store().remove_element(DEFAULTSE$22, 0);
        }
    }
    
    /**
     * Gets the "Status" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum.Enum getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$24, 0);
            if (target == null)
            {
                return null;
            }
            return (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Status" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum)get_store().find_element_user(STATUS$24, 0);
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
            return get_store().count_elements(STATUS$24) != 0;
        }
    }
    
    /**
     * Sets the "Status" element
     */
    public void setStatus(it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum.Enum status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$24);
            }
            target.setEnumValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "Status" element
     */
    public void xsetStatus(it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum)get_store().find_element_user(STATUS$24, 0);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEStatusEnum)get_store().add_element_user(STATUS$24);
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
            get_store().remove_element(STATUS$24, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUNNINGJOBS$26, 0);
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
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(RUNNINGJOBS$26, 0);
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
            return get_store().count_elements(RUNNINGJOBS$26) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUNNINGJOBS$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RUNNINGJOBS$26);
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
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(RUNNINGJOBS$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(RUNNINGJOBS$26);
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
            get_store().remove_element(RUNNINGJOBS$26, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WAITINGJOBS$28, 0);
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
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(WAITINGJOBS$28, 0);
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
            return get_store().count_elements(WAITINGJOBS$28) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WAITINGJOBS$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WAITINGJOBS$28);
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
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(WAITINGJOBS$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(WAITINGJOBS$28);
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
            get_store().remove_element(WAITINGJOBS$28, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALJOBS$30, 0);
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
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TOTALJOBS$30, 0);
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
            return get_store().count_elements(TOTALJOBS$30) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALJOBS$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALJOBS$30);
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
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TOTALJOBS$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(TOTALJOBS$30);
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
            get_store().remove_element(TOTALJOBS$30, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTIMATEDRESPONSETIME$32, 0);
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
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ESTIMATEDRESPONSETIME$32, 0);
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
            return get_store().count_elements(ESTIMATEDRESPONSETIME$32) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTIMATEDRESPONSETIME$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ESTIMATEDRESPONSETIME$32);
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
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ESTIMATEDRESPONSETIME$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(ESTIMATEDRESPONSETIME$32);
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
            get_store().remove_element(ESTIMATEDRESPONSETIME$32, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORSTRESPONSETIME$34, 0);
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
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(WORSTRESPONSETIME$34, 0);
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
            return get_store().count_elements(WORSTRESPONSETIME$34) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORSTRESPONSETIME$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORSTRESPONSETIME$34);
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
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(WORSTRESPONSETIME$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(WORSTRESPONSETIME$34);
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
            get_store().remove_element(WORSTRESPONSETIME$34, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FREEJOBSLOTS$36, 0);
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
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(FREEJOBSLOTS$36, 0);
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
            return get_store().count_elements(FREEJOBSLOTS$36) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FREEJOBSLOTS$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FREEJOBSLOTS$36);
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
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(FREEJOBSLOTS$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(FREEJOBSLOTS$36);
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
            get_store().remove_element(FREEJOBSLOTS$36, 0);
        }
    }
    
    /**
     * Gets the "MaxWallClockTime" element
     */
    public java.math.BigInteger getMaxWallClockTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXWALLCLOCKTIME$38, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "MaxWallClockTime" element
     */
    public org.apache.xmlbeans.XmlInteger xgetMaxWallClockTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MAXWALLCLOCKTIME$38, 0);
            return target;
        }
    }
    
    /**
     * True if has "MaxWallClockTime" element
     */
    public boolean isSetMaxWallClockTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXWALLCLOCKTIME$38) != 0;
        }
    }
    
    /**
     * Sets the "MaxWallClockTime" element
     */
    public void setMaxWallClockTime(java.math.BigInteger maxWallClockTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXWALLCLOCKTIME$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXWALLCLOCKTIME$38);
            }
            target.setBigIntegerValue(maxWallClockTime);
        }
    }
    
    /**
     * Sets (as xml) the "MaxWallClockTime" element
     */
    public void xsetMaxWallClockTime(org.apache.xmlbeans.XmlInteger maxWallClockTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MAXWALLCLOCKTIME$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MAXWALLCLOCKTIME$38);
            }
            target.set(maxWallClockTime);
        }
    }
    
    /**
     * Unsets the "MaxWallClockTime" element
     */
    public void unsetMaxWallClockTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXWALLCLOCKTIME$38, 0);
        }
    }
    
    /**
     * Gets the "MaxCPUTime" element
     */
    public java.math.BigInteger getMaxCPUTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXCPUTIME$40, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "MaxCPUTime" element
     */
    public org.apache.xmlbeans.XmlInteger xgetMaxCPUTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MAXCPUTIME$40, 0);
            return target;
        }
    }
    
    /**
     * True if has "MaxCPUTime" element
     */
    public boolean isSetMaxCPUTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXCPUTIME$40) != 0;
        }
    }
    
    /**
     * Sets the "MaxCPUTime" element
     */
    public void setMaxCPUTime(java.math.BigInteger maxCPUTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXCPUTIME$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXCPUTIME$40);
            }
            target.setBigIntegerValue(maxCPUTime);
        }
    }
    
    /**
     * Sets (as xml) the "MaxCPUTime" element
     */
    public void xsetMaxCPUTime(org.apache.xmlbeans.XmlInteger maxCPUTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MAXCPUTIME$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MAXCPUTIME$40);
            }
            target.set(maxCPUTime);
        }
    }
    
    /**
     * Unsets the "MaxCPUTime" element
     */
    public void unsetMaxCPUTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXCPUTIME$40, 0);
        }
    }
    
    /**
     * Gets the "MaxTotalJobs" element
     */
    public java.math.BigInteger getMaxTotalJobs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXTOTALJOBS$42, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "MaxTotalJobs" element
     */
    public org.apache.xmlbeans.XmlInteger xgetMaxTotalJobs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MAXTOTALJOBS$42, 0);
            return target;
        }
    }
    
    /**
     * True if has "MaxTotalJobs" element
     */
    public boolean isSetMaxTotalJobs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXTOTALJOBS$42) != 0;
        }
    }
    
    /**
     * Sets the "MaxTotalJobs" element
     */
    public void setMaxTotalJobs(java.math.BigInteger maxTotalJobs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXTOTALJOBS$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXTOTALJOBS$42);
            }
            target.setBigIntegerValue(maxTotalJobs);
        }
    }
    
    /**
     * Sets (as xml) the "MaxTotalJobs" element
     */
    public void xsetMaxTotalJobs(org.apache.xmlbeans.XmlInteger maxTotalJobs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MAXTOTALJOBS$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MAXTOTALJOBS$42);
            }
            target.set(maxTotalJobs);
        }
    }
    
    /**
     * Unsets the "MaxTotalJobs" element
     */
    public void unsetMaxTotalJobs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXTOTALJOBS$42, 0);
        }
    }
    
    /**
     * Gets the "MaxRunningJobs" element
     */
    public java.math.BigInteger getMaxRunningJobs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXRUNNINGJOBS$44, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "MaxRunningJobs" element
     */
    public org.apache.xmlbeans.XmlInteger xgetMaxRunningJobs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MAXRUNNINGJOBS$44, 0);
            return target;
        }
    }
    
    /**
     * True if has "MaxRunningJobs" element
     */
    public boolean isSetMaxRunningJobs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXRUNNINGJOBS$44) != 0;
        }
    }
    
    /**
     * Sets the "MaxRunningJobs" element
     */
    public void setMaxRunningJobs(java.math.BigInteger maxRunningJobs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXRUNNINGJOBS$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXRUNNINGJOBS$44);
            }
            target.setBigIntegerValue(maxRunningJobs);
        }
    }
    
    /**
     * Sets (as xml) the "MaxRunningJobs" element
     */
    public void xsetMaxRunningJobs(org.apache.xmlbeans.XmlInteger maxRunningJobs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MAXRUNNINGJOBS$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MAXRUNNINGJOBS$44);
            }
            target.set(maxRunningJobs);
        }
    }
    
    /**
     * Unsets the "MaxRunningJobs" element
     */
    public void unsetMaxRunningJobs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXRUNNINGJOBS$44, 0);
        }
    }
    
    /**
     * Gets the "Priority" element
     */
    public java.math.BigInteger getPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIORITY$46, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "Priority" element
     */
    public org.apache.xmlbeans.XmlInteger xgetPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PRIORITY$46, 0);
            return target;
        }
    }
    
    /**
     * True if has "Priority" element
     */
    public boolean isSetPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIORITY$46) != 0;
        }
    }
    
    /**
     * Sets the "Priority" element
     */
    public void setPriority(java.math.BigInteger priority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIORITY$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIORITY$46);
            }
            target.setBigIntegerValue(priority);
        }
    }
    
    /**
     * Sets (as xml) the "Priority" element
     */
    public void xsetPriority(org.apache.xmlbeans.XmlInteger priority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PRIORITY$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PRIORITY$46);
            }
            target.set(priority);
        }
    }
    
    /**
     * Unsets the "Priority" element
     */
    public void unsetPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIORITY$46, 0);
        }
    }
    
    /**
     * Gets the "AssignedJobSlots" element
     */
    public java.math.BigInteger getAssignedJobSlots()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSIGNEDJOBSLOTS$48, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "AssignedJobSlots" element
     */
    public org.apache.xmlbeans.XmlInteger xgetAssignedJobSlots()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ASSIGNEDJOBSLOTS$48, 0);
            return target;
        }
    }
    
    /**
     * True if has "AssignedJobSlots" element
     */
    public boolean isSetAssignedJobSlots()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ASSIGNEDJOBSLOTS$48) != 0;
        }
    }
    
    /**
     * Sets the "AssignedJobSlots" element
     */
    public void setAssignedJobSlots(java.math.BigInteger assignedJobSlots)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSIGNEDJOBSLOTS$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASSIGNEDJOBSLOTS$48);
            }
            target.setBigIntegerValue(assignedJobSlots);
        }
    }
    
    /**
     * Sets (as xml) the "AssignedJobSlots" element
     */
    public void xsetAssignedJobSlots(org.apache.xmlbeans.XmlInteger assignedJobSlots)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ASSIGNEDJOBSLOTS$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(ASSIGNEDJOBSLOTS$48);
            }
            target.set(assignedJobSlots);
        }
    }
    
    /**
     * Unsets the "AssignedJobSlots" element
     */
    public void unsetAssignedJobSlots()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ASSIGNEDJOBSLOTS$48, 0);
        }
    }
    
    /**
     * Gets the "ACL" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.ACLType getACL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.ACLType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ACLType)get_store().find_element_user(ACL$50, 0);
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
            return get_store().count_elements(ACL$50) != 0;
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
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ACLType)get_store().find_element_user(ACL$50, 0);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ACLType)get_store().add_element_user(ACL$50);
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
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ACLType)get_store().add_element_user(ACL$50);
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
            get_store().remove_element(ACL$50, 0);
        }
    }
    
    /**
     * Gets array of all "Job" elements
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType[] getJobArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(JOB$52, targetList);
            it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType[] result = new it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Job" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType getJobArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType)get_store().find_element_user(JOB$52, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Job" element
     */
    public int sizeOfJobArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(JOB$52);
        }
    }
    
    /**
     * Sets array of all "Job" element
     */
    public void setJobArray(it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType[] jobArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(jobArray, JOB$52);
        }
    }
    
    /**
     * Sets ith "Job" element
     */
    public void setJobArray(int i, it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType job)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType)get_store().find_element_user(JOB$52, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(job);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Job" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType insertNewJob(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType)get_store().insert_element_user(JOB$52, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Job" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType addNewJob()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.JobType)get_store().add_element_user(JOB$52);
            return target;
        }
    }
    
    /**
     * Removes the ith "Job" element
     */
    public void removeJob(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(JOB$52, i);
        }
    }
    
    /**
     * Gets array of all "VOView" elements
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType[] getVOViewArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VOVIEW$54, targetList);
            it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType[] result = new it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "VOView" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType getVOViewArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType)get_store().find_element_user(VOVIEW$54, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "VOView" element
     */
    public int sizeOfVOViewArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VOVIEW$54);
        }
    }
    
    /**
     * Sets array of all "VOView" element
     */
    public void setVOViewArray(it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType[] voViewArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(voViewArray, VOVIEW$54);
        }
    }
    
    /**
     * Sets ith "VOView" element
     */
    public void setVOViewArray(int i, it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType voView)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType)get_store().find_element_user(VOVIEW$54, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(voView);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "VOView" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType insertNewVOView(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType)get_store().insert_element_user(VOVIEW$54, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "VOView" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType addNewVOView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.CEVOViewType)get_store().add_element_user(VOVIEW$54);
            return target;
        }
    }
    
    /**
     * Removes the ith "VOView" element
     */
    public void removeVOView(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VOVIEW$54, i);
        }
    }
    
    /**
     * Gets the "UniqueID" attribute
     */
    public java.lang.String getUniqueID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIQUEID$56);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "UniqueID" attribute
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType xgetUniqueID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType)get_store().find_attribute_user(UNIQUEID$56);
            return target;
        }
    }
    
    /**
     * Sets the "UniqueID" attribute
     */
    public void setUniqueID(java.lang.String uniqueID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIQUEID$56);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNIQUEID$56);
            }
            target.setStringValue(uniqueID);
        }
    }
    
    /**
     * Sets (as xml) the "UniqueID" attribute
     */
    public void xsetUniqueID(it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType uniqueID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType)get_store().find_attribute_user(UNIQUEID$56);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType)get_store().add_attribute_user(UNIQUEID$56);
            }
            target.set(uniqueID);
        }
    }
}
