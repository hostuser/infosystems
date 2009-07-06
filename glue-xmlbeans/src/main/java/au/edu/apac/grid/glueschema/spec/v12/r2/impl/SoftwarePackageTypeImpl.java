/*
 * XML Type:  SoftwarePackageType
 * Namespace: http://grid.apac.edu.au/glueschema/Spec/V12/R2
 * Java type: au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType
 *
 * Automatically generated - do not modify.
 */
package au.edu.apac.grid.glueschema.spec.v12.r2.impl;
/**
 * An XML SoftwarePackageType(@http://grid.apac.edu.au/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public class SoftwarePackageTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType
{
    private static final long serialVersionUID = 1L;
    
    public SoftwarePackageTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://grid.apac.edu.au/glueschema/Spec/V12/R2", "Name");
    private static final javax.xml.namespace.QName VERSION$2 = 
        new javax.xml.namespace.QName("http://grid.apac.edu.au/glueschema/Spec/V12/R2", "Version");
    private static final javax.xml.namespace.QName PATH$4 = 
        new javax.xml.namespace.QName("http://grid.apac.edu.au/glueschema/Spec/V12/R2", "Path");
    private static final javax.xml.namespace.QName QUEUERESOURCE$6 = 
        new javax.xml.namespace.QName("http://grid.apac.edu.au/glueschema/Spec/V12/R2", "QueueResource");
    private static final javax.xml.namespace.QName MODULE$8 = 
        new javax.xml.namespace.QName("http://grid.apac.edu.au/glueschema/Spec/V12/R2", "Module");
    private static final javax.xml.namespace.QName SERIALAVAIL$10 = 
        new javax.xml.namespace.QName("http://grid.apac.edu.au/glueschema/Spec/V12/R2", "SerialAvail");
    private static final javax.xml.namespace.QName PARALLELAVAIL$12 = 
        new javax.xml.namespace.QName("http://grid.apac.edu.au/glueschema/Spec/V12/R2", "ParallelAvail");
    private static final javax.xml.namespace.QName PARALLELMAXCPUS$14 = 
        new javax.xml.namespace.QName("http://grid.apac.edu.au/glueschema/Spec/V12/R2", "ParallelMaxCPUs");
    private static final javax.xml.namespace.QName SUPPORTEDPARALLELTYPE$16 = 
        new javax.xml.namespace.QName("http://grid.apac.edu.au/glueschema/Spec/V12/R2", "SupportedParallelType");
    private static final javax.xml.namespace.QName LICENSETYPE$18 = 
        new javax.xml.namespace.QName("http://grid.apac.edu.au/glueschema/Spec/V12/R2", "LicenseType");
    private static final javax.xml.namespace.QName TOTALCPUSEATS$20 = 
        new javax.xml.namespace.QName("http://grid.apac.edu.au/glueschema/Spec/V12/R2", "TotalCPUSeats");
    private static final javax.xml.namespace.QName FREECPUSEATS$22 = 
        new javax.xml.namespace.QName("http://grid.apac.edu.au/glueschema/Spec/V12/R2", "FreeCPUSeats");
    private static final javax.xml.namespace.QName TOTALJOBSEATS$24 = 
        new javax.xml.namespace.QName("http://grid.apac.edu.au/glueschema/Spec/V12/R2", "TotalJobSeats");
    private static final javax.xml.namespace.QName FREEJOBSEATS$26 = 
        new javax.xml.namespace.QName("http://grid.apac.edu.au/glueschema/Spec/V12/R2", "FreeJobSeats");
    private static final javax.xml.namespace.QName TOTALUSERSEATS$28 = 
        new javax.xml.namespace.QName("http://grid.apac.edu.au/glueschema/Spec/V12/R2", "TotalUserSeats");
    private static final javax.xml.namespace.QName FREEUSERSEATS$30 = 
        new javax.xml.namespace.QName("http://grid.apac.edu.au/glueschema/Spec/V12/R2", "FreeUserSeats");
    private static final javax.xml.namespace.QName ACL$32 = 
        new javax.xml.namespace.QName("http://grid.apac.edu.au/glueschema/Spec/V12/R2", "ACL");
    private static final javax.xml.namespace.QName VOVIEW$34 = 
        new javax.xml.namespace.QName("http://grid.apac.edu.au/glueschema/Spec/V12/R2", "VOView");
    private static final javax.xml.namespace.QName SOFTWAREEXECUTABLE$36 = 
        new javax.xml.namespace.QName("http://grid.apac.edu.au/glueschema/Spec/V12/R2", "SoftwareExecutable");
    private static final javax.xml.namespace.QName DATA$38 = 
        new javax.xml.namespace.QName("http://grid.apac.edu.au/glueschema/Spec/V12/R2", "Data");
    private static final javax.xml.namespace.QName LOCALID$40 = 
        new javax.xml.namespace.QName("", "LocalID");
    
    
    /**
     * Gets the "Name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
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
            return get_store().count_elements(NAME$0) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
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
            get_store().remove_element(NAME$0, 0);
        }
    }
    
    /**
     * Gets the "Version" element
     */
    public java.lang.String getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Version" element
     */
    public org.apache.xmlbeans.XmlString xgetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Version" element
     */
    public boolean isSetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERSION$2) != 0;
        }
    }
    
    /**
     * Sets the "Version" element
     */
    public void setVersion(java.lang.String version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSION$2);
            }
            target.setStringValue(version);
        }
    }
    
    /**
     * Sets (as xml) the "Version" element
     */
    public void xsetVersion(org.apache.xmlbeans.XmlString version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERSION$2);
            }
            target.set(version);
        }
    }
    
    /**
     * Unsets the "Version" element
     */
    public void unsetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERSION$2, 0);
        }
    }
    
    /**
     * Gets the "Path" element
     */
    public java.lang.String getPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATH$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Path" element
     */
    public org.apache.xmlbeans.XmlString xgetPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PATH$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "Path" element
     */
    public boolean isSetPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PATH$4) != 0;
        }
    }
    
    /**
     * Sets the "Path" element
     */
    public void setPath(java.lang.String path)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATH$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PATH$4);
            }
            target.setStringValue(path);
        }
    }
    
    /**
     * Sets (as xml) the "Path" element
     */
    public void xsetPath(org.apache.xmlbeans.XmlString path)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PATH$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PATH$4);
            }
            target.set(path);
        }
    }
    
    /**
     * Unsets the "Path" element
     */
    public void unsetPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PATH$4, 0);
        }
    }
    
    /**
     * Gets the "QueueResource" element
     */
    public java.lang.String getQueueResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUEUERESOURCE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "QueueResource" element
     */
    public org.apache.xmlbeans.XmlString xgetQueueResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUEUERESOURCE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "QueueResource" element
     */
    public boolean isSetQueueResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUEUERESOURCE$6) != 0;
        }
    }
    
    /**
     * Sets the "QueueResource" element
     */
    public void setQueueResource(java.lang.String queueResource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUEUERESOURCE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUEUERESOURCE$6);
            }
            target.setStringValue(queueResource);
        }
    }
    
    /**
     * Sets (as xml) the "QueueResource" element
     */
    public void xsetQueueResource(org.apache.xmlbeans.XmlString queueResource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUEUERESOURCE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUEUERESOURCE$6);
            }
            target.set(queueResource);
        }
    }
    
    /**
     * Unsets the "QueueResource" element
     */
    public void unsetQueueResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUEUERESOURCE$6, 0);
        }
    }
    
    /**
     * Gets the "Module" element
     */
    public java.lang.String getModule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODULE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Module" element
     */
    public org.apache.xmlbeans.XmlString xgetModule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MODULE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "Module" element
     */
    public boolean isSetModule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MODULE$8) != 0;
        }
    }
    
    /**
     * Sets the "Module" element
     */
    public void setModule(java.lang.String module)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODULE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MODULE$8);
            }
            target.setStringValue(module);
        }
    }
    
    /**
     * Sets (as xml) the "Module" element
     */
    public void xsetModule(org.apache.xmlbeans.XmlString module)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MODULE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MODULE$8);
            }
            target.set(module);
        }
    }
    
    /**
     * Unsets the "Module" element
     */
    public void unsetModule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MODULE$8, 0);
        }
    }
    
    /**
     * Gets the "SerialAvail" element
     */
    public boolean getSerialAvail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERIALAVAIL$10, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "SerialAvail" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetSerialAvail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SERIALAVAIL$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "SerialAvail" element
     */
    public boolean isSetSerialAvail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERIALAVAIL$10) != 0;
        }
    }
    
    /**
     * Sets the "SerialAvail" element
     */
    public void setSerialAvail(boolean serialAvail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERIALAVAIL$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERIALAVAIL$10);
            }
            target.setBooleanValue(serialAvail);
        }
    }
    
    /**
     * Sets (as xml) the "SerialAvail" element
     */
    public void xsetSerialAvail(org.apache.xmlbeans.XmlBoolean serialAvail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SERIALAVAIL$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SERIALAVAIL$10);
            }
            target.set(serialAvail);
        }
    }
    
    /**
     * Unsets the "SerialAvail" element
     */
    public void unsetSerialAvail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERIALAVAIL$10, 0);
        }
    }
    
    /**
     * Gets the "ParallelAvail" element
     */
    public boolean getParallelAvail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARALLELAVAIL$12, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ParallelAvail" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetParallelAvail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PARALLELAVAIL$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "ParallelAvail" element
     */
    public boolean isSetParallelAvail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARALLELAVAIL$12) != 0;
        }
    }
    
    /**
     * Sets the "ParallelAvail" element
     */
    public void setParallelAvail(boolean parallelAvail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARALLELAVAIL$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARALLELAVAIL$12);
            }
            target.setBooleanValue(parallelAvail);
        }
    }
    
    /**
     * Sets (as xml) the "ParallelAvail" element
     */
    public void xsetParallelAvail(org.apache.xmlbeans.XmlBoolean parallelAvail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PARALLELAVAIL$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PARALLELAVAIL$12);
            }
            target.set(parallelAvail);
        }
    }
    
    /**
     * Unsets the "ParallelAvail" element
     */
    public void unsetParallelAvail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARALLELAVAIL$12, 0);
        }
    }
    
    /**
     * Gets the "ParallelMaxCPUs" element
     */
    public java.math.BigInteger getParallelMaxCPUs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARALLELMAXCPUS$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "ParallelMaxCPUs" element
     */
    public org.apache.xmlbeans.XmlInteger xgetParallelMaxCPUs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PARALLELMAXCPUS$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "ParallelMaxCPUs" element
     */
    public boolean isSetParallelMaxCPUs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARALLELMAXCPUS$14) != 0;
        }
    }
    
    /**
     * Sets the "ParallelMaxCPUs" element
     */
    public void setParallelMaxCPUs(java.math.BigInteger parallelMaxCPUs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARALLELMAXCPUS$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARALLELMAXCPUS$14);
            }
            target.setBigIntegerValue(parallelMaxCPUs);
        }
    }
    
    /**
     * Sets (as xml) the "ParallelMaxCPUs" element
     */
    public void xsetParallelMaxCPUs(org.apache.xmlbeans.XmlInteger parallelMaxCPUs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PARALLELMAXCPUS$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PARALLELMAXCPUS$14);
            }
            target.set(parallelMaxCPUs);
        }
    }
    
    /**
     * Unsets the "ParallelMaxCPUs" element
     */
    public void unsetParallelMaxCPUs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARALLELMAXCPUS$14, 0);
        }
    }
    
    /**
     * Gets array of all "SupportedParallelType" elements
     */
    public java.lang.String[] getSupportedParallelTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUPPORTEDPARALLELTYPE$16, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "SupportedParallelType" element
     */
    public java.lang.String getSupportedParallelTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPORTEDPARALLELTYPE$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "SupportedParallelType" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetSupportedParallelTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUPPORTEDPARALLELTYPE$16, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "SupportedParallelType" element
     */
    public org.apache.xmlbeans.XmlString xgetSupportedParallelTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUPPORTEDPARALLELTYPE$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "SupportedParallelType" element
     */
    public int sizeOfSupportedParallelTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPORTEDPARALLELTYPE$16);
        }
    }
    
    /**
     * Sets array of all "SupportedParallelType" element
     */
    public void setSupportedParallelTypeArray(java.lang.String[] supportedParallelTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(supportedParallelTypeArray, SUPPORTEDPARALLELTYPE$16);
        }
    }
    
    /**
     * Sets ith "SupportedParallelType" element
     */
    public void setSupportedParallelTypeArray(int i, java.lang.String supportedParallelType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPORTEDPARALLELTYPE$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(supportedParallelType);
        }
    }
    
    /**
     * Sets (as xml) array of all "SupportedParallelType" element
     */
    public void xsetSupportedParallelTypeArray(org.apache.xmlbeans.XmlString[]supportedParallelTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(supportedParallelTypeArray, SUPPORTEDPARALLELTYPE$16);
        }
    }
    
    /**
     * Sets (as xml) ith "SupportedParallelType" element
     */
    public void xsetSupportedParallelTypeArray(int i, org.apache.xmlbeans.XmlString supportedParallelType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUPPORTEDPARALLELTYPE$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(supportedParallelType);
        }
    }
    
    /**
     * Inserts the value as the ith "SupportedParallelType" element
     */
    public void insertSupportedParallelType(int i, java.lang.String supportedParallelType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SUPPORTEDPARALLELTYPE$16, i);
            target.setStringValue(supportedParallelType);
        }
    }
    
    /**
     * Appends the value as the last "SupportedParallelType" element
     */
    public void addSupportedParallelType(java.lang.String supportedParallelType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUPPORTEDPARALLELTYPE$16);
            target.setStringValue(supportedParallelType);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SupportedParallelType" element
     */
    public org.apache.xmlbeans.XmlString insertNewSupportedParallelType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(SUPPORTEDPARALLELTYPE$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SupportedParallelType" element
     */
    public org.apache.xmlbeans.XmlString addNewSupportedParallelType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUPPORTEDPARALLELTYPE$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "SupportedParallelType" element
     */
    public void removeSupportedParallelType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPORTEDPARALLELTYPE$16, i);
        }
    }
    
    /**
     * Gets the "LicenseType" element
     */
    public java.lang.String getLicenseType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LICENSETYPE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LicenseType" element
     */
    public org.apache.xmlbeans.XmlString xgetLicenseType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LICENSETYPE$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "LicenseType" element
     */
    public boolean isSetLicenseType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LICENSETYPE$18) != 0;
        }
    }
    
    /**
     * Sets the "LicenseType" element
     */
    public void setLicenseType(java.lang.String licenseType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LICENSETYPE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LICENSETYPE$18);
            }
            target.setStringValue(licenseType);
        }
    }
    
    /**
     * Sets (as xml) the "LicenseType" element
     */
    public void xsetLicenseType(org.apache.xmlbeans.XmlString licenseType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LICENSETYPE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LICENSETYPE$18);
            }
            target.set(licenseType);
        }
    }
    
    /**
     * Unsets the "LicenseType" element
     */
    public void unsetLicenseType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LICENSETYPE$18, 0);
        }
    }
    
    /**
     * Gets the "TotalCPUSeats" element
     */
    public java.math.BigInteger getTotalCPUSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALCPUSEATS$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "TotalCPUSeats" element
     */
    public org.apache.xmlbeans.XmlInteger xgetTotalCPUSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TOTALCPUSEATS$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "TotalCPUSeats" element
     */
    public boolean isSetTotalCPUSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALCPUSEATS$20) != 0;
        }
    }
    
    /**
     * Sets the "TotalCPUSeats" element
     */
    public void setTotalCPUSeats(java.math.BigInteger totalCPUSeats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALCPUSEATS$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALCPUSEATS$20);
            }
            target.setBigIntegerValue(totalCPUSeats);
        }
    }
    
    /**
     * Sets (as xml) the "TotalCPUSeats" element
     */
    public void xsetTotalCPUSeats(org.apache.xmlbeans.XmlInteger totalCPUSeats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TOTALCPUSEATS$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(TOTALCPUSEATS$20);
            }
            target.set(totalCPUSeats);
        }
    }
    
    /**
     * Unsets the "TotalCPUSeats" element
     */
    public void unsetTotalCPUSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALCPUSEATS$20, 0);
        }
    }
    
    /**
     * Gets the "FreeCPUSeats" element
     */
    public java.math.BigInteger getFreeCPUSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FREECPUSEATS$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "FreeCPUSeats" element
     */
    public org.apache.xmlbeans.XmlInteger xgetFreeCPUSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(FREECPUSEATS$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "FreeCPUSeats" element
     */
    public boolean isSetFreeCPUSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FREECPUSEATS$22) != 0;
        }
    }
    
    /**
     * Sets the "FreeCPUSeats" element
     */
    public void setFreeCPUSeats(java.math.BigInteger freeCPUSeats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FREECPUSEATS$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FREECPUSEATS$22);
            }
            target.setBigIntegerValue(freeCPUSeats);
        }
    }
    
    /**
     * Sets (as xml) the "FreeCPUSeats" element
     */
    public void xsetFreeCPUSeats(org.apache.xmlbeans.XmlInteger freeCPUSeats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(FREECPUSEATS$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(FREECPUSEATS$22);
            }
            target.set(freeCPUSeats);
        }
    }
    
    /**
     * Unsets the "FreeCPUSeats" element
     */
    public void unsetFreeCPUSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FREECPUSEATS$22, 0);
        }
    }
    
    /**
     * Gets the "TotalJobSeats" element
     */
    public java.math.BigInteger getTotalJobSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALJOBSEATS$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "TotalJobSeats" element
     */
    public org.apache.xmlbeans.XmlInteger xgetTotalJobSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TOTALJOBSEATS$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "TotalJobSeats" element
     */
    public boolean isSetTotalJobSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALJOBSEATS$24) != 0;
        }
    }
    
    /**
     * Sets the "TotalJobSeats" element
     */
    public void setTotalJobSeats(java.math.BigInteger totalJobSeats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALJOBSEATS$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALJOBSEATS$24);
            }
            target.setBigIntegerValue(totalJobSeats);
        }
    }
    
    /**
     * Sets (as xml) the "TotalJobSeats" element
     */
    public void xsetTotalJobSeats(org.apache.xmlbeans.XmlInteger totalJobSeats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TOTALJOBSEATS$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(TOTALJOBSEATS$24);
            }
            target.set(totalJobSeats);
        }
    }
    
    /**
     * Unsets the "TotalJobSeats" element
     */
    public void unsetTotalJobSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALJOBSEATS$24, 0);
        }
    }
    
    /**
     * Gets the "FreeJobSeats" element
     */
    public java.math.BigInteger getFreeJobSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FREEJOBSEATS$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "FreeJobSeats" element
     */
    public org.apache.xmlbeans.XmlInteger xgetFreeJobSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(FREEJOBSEATS$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "FreeJobSeats" element
     */
    public boolean isSetFreeJobSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FREEJOBSEATS$26) != 0;
        }
    }
    
    /**
     * Sets the "FreeJobSeats" element
     */
    public void setFreeJobSeats(java.math.BigInteger freeJobSeats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FREEJOBSEATS$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FREEJOBSEATS$26);
            }
            target.setBigIntegerValue(freeJobSeats);
        }
    }
    
    /**
     * Sets (as xml) the "FreeJobSeats" element
     */
    public void xsetFreeJobSeats(org.apache.xmlbeans.XmlInteger freeJobSeats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(FREEJOBSEATS$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(FREEJOBSEATS$26);
            }
            target.set(freeJobSeats);
        }
    }
    
    /**
     * Unsets the "FreeJobSeats" element
     */
    public void unsetFreeJobSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FREEJOBSEATS$26, 0);
        }
    }
    
    /**
     * Gets the "TotalUserSeats" element
     */
    public java.math.BigInteger getTotalUserSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALUSERSEATS$28, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "TotalUserSeats" element
     */
    public org.apache.xmlbeans.XmlInteger xgetTotalUserSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TOTALUSERSEATS$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "TotalUserSeats" element
     */
    public boolean isSetTotalUserSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALUSERSEATS$28) != 0;
        }
    }
    
    /**
     * Sets the "TotalUserSeats" element
     */
    public void setTotalUserSeats(java.math.BigInteger totalUserSeats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALUSERSEATS$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALUSERSEATS$28);
            }
            target.setBigIntegerValue(totalUserSeats);
        }
    }
    
    /**
     * Sets (as xml) the "TotalUserSeats" element
     */
    public void xsetTotalUserSeats(org.apache.xmlbeans.XmlInteger totalUserSeats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TOTALUSERSEATS$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(TOTALUSERSEATS$28);
            }
            target.set(totalUserSeats);
        }
    }
    
    /**
     * Unsets the "TotalUserSeats" element
     */
    public void unsetTotalUserSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALUSERSEATS$28, 0);
        }
    }
    
    /**
     * Gets the "FreeUserSeats" element
     */
    public java.math.BigInteger getFreeUserSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FREEUSERSEATS$30, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "FreeUserSeats" element
     */
    public org.apache.xmlbeans.XmlInteger xgetFreeUserSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(FREEUSERSEATS$30, 0);
            return target;
        }
    }
    
    /**
     * True if has "FreeUserSeats" element
     */
    public boolean isSetFreeUserSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FREEUSERSEATS$30) != 0;
        }
    }
    
    /**
     * Sets the "FreeUserSeats" element
     */
    public void setFreeUserSeats(java.math.BigInteger freeUserSeats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FREEUSERSEATS$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FREEUSERSEATS$30);
            }
            target.setBigIntegerValue(freeUserSeats);
        }
    }
    
    /**
     * Sets (as xml) the "FreeUserSeats" element
     */
    public void xsetFreeUserSeats(org.apache.xmlbeans.XmlInteger freeUserSeats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(FREEUSERSEATS$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(FREEUSERSEATS$30);
            }
            target.set(freeUserSeats);
        }
    }
    
    /**
     * Unsets the "FreeUserSeats" element
     */
    public void unsetFreeUserSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FREEUSERSEATS$30, 0);
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
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ACLType)get_store().find_element_user(ACL$32, 0);
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
            return get_store().count_elements(ACL$32) != 0;
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
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ACLType)get_store().find_element_user(ACL$32, 0);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ACLType)get_store().add_element_user(ACL$32);
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
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ACLType)get_store().add_element_user(ACL$32);
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
            get_store().remove_element(ACL$32, 0);
        }
    }
    
    /**
     * Gets array of all "VOView" elements
     */
    public au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType[] getVOViewArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VOVIEW$34, targetList);
            au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType[] result = new au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "VOView" element
     */
    public au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType getVOViewArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType target = null;
            target = (au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType)get_store().find_element_user(VOVIEW$34, i);
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
            return get_store().count_elements(VOVIEW$34);
        }
    }
    
    /**
     * Sets array of all "VOView" element
     */
    public void setVOViewArray(au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType[] voViewArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(voViewArray, VOVIEW$34);
        }
    }
    
    /**
     * Sets ith "VOView" element
     */
    public void setVOViewArray(int i, au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType voView)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType target = null;
            target = (au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType)get_store().find_element_user(VOVIEW$34, i);
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
    public au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType insertNewVOView(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType target = null;
            target = (au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType)get_store().insert_element_user(VOVIEW$34, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "VOView" element
     */
    public au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType addNewVOView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType target = null;
            target = (au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType)get_store().add_element_user(VOVIEW$34);
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
            get_store().remove_element(VOVIEW$34, i);
        }
    }
    
    /**
     * Gets array of all "SoftwareExecutable" elements
     */
    public au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType[] getSoftwareExecutableArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SOFTWAREEXECUTABLE$36, targetList);
            au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType[] result = new au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SoftwareExecutable" element
     */
    public au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType getSoftwareExecutableArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType target = null;
            target = (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType)get_store().find_element_user(SOFTWAREEXECUTABLE$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SoftwareExecutable" element
     */
    public int sizeOfSoftwareExecutableArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOFTWAREEXECUTABLE$36);
        }
    }
    
    /**
     * Sets array of all "SoftwareExecutable" element
     */
    public void setSoftwareExecutableArray(au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType[] softwareExecutableArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(softwareExecutableArray, SOFTWAREEXECUTABLE$36);
        }
    }
    
    /**
     * Sets ith "SoftwareExecutable" element
     */
    public void setSoftwareExecutableArray(int i, au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType softwareExecutable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType target = null;
            target = (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType)get_store().find_element_user(SOFTWAREEXECUTABLE$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(softwareExecutable);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SoftwareExecutable" element
     */
    public au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType insertNewSoftwareExecutable(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType target = null;
            target = (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType)get_store().insert_element_user(SOFTWAREEXECUTABLE$36, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SoftwareExecutable" element
     */
    public au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType addNewSoftwareExecutable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType target = null;
            target = (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType)get_store().add_element_user(SOFTWAREEXECUTABLE$36);
            return target;
        }
    }
    
    /**
     * Removes the ith "SoftwareExecutable" element
     */
    public void removeSoftwareExecutable(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOFTWAREEXECUTABLE$36, i);
        }
    }
    
    /**
     * Gets array of all "Data" elements
     */
    public au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType.Data[] getDataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATA$38, targetList);
            au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType.Data[] result = new au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType.Data[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Data" element
     */
    public au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType.Data getDataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType.Data target = null;
            target = (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType.Data)get_store().find_element_user(DATA$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Data" element
     */
    public int sizeOfDataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATA$38);
        }
    }
    
    /**
     * Sets array of all "Data" element
     */
    public void setDataArray(au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType.Data[] dataArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataArray, DATA$38);
        }
    }
    
    /**
     * Sets ith "Data" element
     */
    public void setDataArray(int i, au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType.Data data)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType.Data target = null;
            target = (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType.Data)get_store().find_element_user(DATA$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(data);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Data" element
     */
    public au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType.Data insertNewData(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType.Data target = null;
            target = (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType.Data)get_store().insert_element_user(DATA$38, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Data" element
     */
    public au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType.Data addNewData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType.Data target = null;
            target = (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType.Data)get_store().add_element_user(DATA$38);
            return target;
        }
    }
    
    /**
     * Removes the ith "Data" element
     */
    public void removeData(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATA$38, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCALID$40);
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
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.LocalIDType)get_store().find_attribute_user(LOCALID$40);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCALID$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCALID$40);
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
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.LocalIDType)get_store().find_attribute_user(LOCALID$40);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.LocalIDType)get_store().add_attribute_user(LOCALID$40);
            }
            target.set(localID);
        }
    }
    /**
     * An XML Data(@http://grid.apac.edu.au/glueschema/Spec/V12/R2).
     *
     * This is a complex type.
     */
    public static class DataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType.Data
    {
        private static final long serialVersionUID = 1L;
        
        public DataImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName KEY$0 = 
            new javax.xml.namespace.QName("http://grid.apac.edu.au/glueschema/Spec/V12/R2", "Key");
        private static final javax.xml.namespace.QName VALUE$2 = 
            new javax.xml.namespace.QName("http://grid.apac.edu.au/glueschema/Spec/V12/R2", "Value");
        
        
        /**
         * Gets the "Key" element
         */
        public java.lang.String getKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEY$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Key" element
         */
        public org.apache.xmlbeans.XmlString xgetKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEY$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Key" element
         */
        public void setKey(java.lang.String key)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KEY$0);
                }
                target.setStringValue(key);
            }
        }
        
        /**
         * Sets (as xml) the "Key" element
         */
        public void xsetKey(org.apache.xmlbeans.XmlString key)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KEY$0);
                }
                target.set(key);
            }
        }
        
        /**
         * Gets the "Value" element
         */
        public java.lang.String getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Value" element
         */
        public org.apache.xmlbeans.XmlString xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Value" element
         */
        public void setValue(java.lang.String value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUE$2);
                }
                target.setStringValue(value);
            }
        }
        
        /**
         * Sets (as xml) the "Value" element
         */
        public void xsetValue(org.apache.xmlbeans.XmlString value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VALUE$2);
                }
                target.set(value);
            }
        }
    }
}
