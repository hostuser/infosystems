/*
 * XML Type:  SubClusterType
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2.impl;
/**
 * An XML SubClusterType(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public class SubClusterTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType
{
    private static final long serialVersionUID = 1L;
    
    public SubClusterTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Name");
    private static final javax.xml.namespace.QName PHYSICALCPUS$2 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "PhysicalCPUs");
    private static final javax.xml.namespace.QName LOGICALCPUS$4 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "LogicalCPUs");
    private static final javax.xml.namespace.QName TMPDIR$6 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "TmpDir");
    private static final javax.xml.namespace.QName WNTMPDIR$8 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "WNTmpDir");
    private static final javax.xml.namespace.QName OPERATINGSYSTEM$10 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "OperatingSystem");
    private static final javax.xml.namespace.QName PROCESSOR$12 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Processor");
    private static final javax.xml.namespace.QName NETWORKADAPTER$14 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "NetworkAdapter");
    private static final javax.xml.namespace.QName MAINMEMORY$16 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "MainMemory");
    private static final javax.xml.namespace.QName ARCHITECTURE$18 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Architecture");
    private static final javax.xml.namespace.QName BENCHMARK$20 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Benchmark");
    private static final javax.xml.namespace.QName LOCATION$22 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Location");
    private static final javax.xml.namespace.QName RUNTIMEENV$24 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "RunTimeEnv");
    private static final javax.xml.namespace.QName UNIQUEID$26 = 
        new javax.xml.namespace.QName("", "UniqueID");
    
    
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
     * Gets the "PhysicalCPUs" element
     */
    public java.math.BigInteger getPhysicalCPUs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHYSICALCPUS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "PhysicalCPUs" element
     */
    public org.apache.xmlbeans.XmlInteger xgetPhysicalCPUs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PHYSICALCPUS$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "PhysicalCPUs" element
     */
    public boolean isSetPhysicalCPUs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PHYSICALCPUS$2) != 0;
        }
    }
    
    /**
     * Sets the "PhysicalCPUs" element
     */
    public void setPhysicalCPUs(java.math.BigInteger physicalCPUs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHYSICALCPUS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHYSICALCPUS$2);
            }
            target.setBigIntegerValue(physicalCPUs);
        }
    }
    
    /**
     * Sets (as xml) the "PhysicalCPUs" element
     */
    public void xsetPhysicalCPUs(org.apache.xmlbeans.XmlInteger physicalCPUs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PHYSICALCPUS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PHYSICALCPUS$2);
            }
            target.set(physicalCPUs);
        }
    }
    
    /**
     * Unsets the "PhysicalCPUs" element
     */
    public void unsetPhysicalCPUs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PHYSICALCPUS$2, 0);
        }
    }
    
    /**
     * Gets the "LogicalCPUs" element
     */
    public java.math.BigInteger getLogicalCPUs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGICALCPUS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "LogicalCPUs" element
     */
    public org.apache.xmlbeans.XmlInteger xgetLogicalCPUs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(LOGICALCPUS$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "LogicalCPUs" element
     */
    public boolean isSetLogicalCPUs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOGICALCPUS$4) != 0;
        }
    }
    
    /**
     * Sets the "LogicalCPUs" element
     */
    public void setLogicalCPUs(java.math.BigInteger logicalCPUs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGICALCPUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOGICALCPUS$4);
            }
            target.setBigIntegerValue(logicalCPUs);
        }
    }
    
    /**
     * Sets (as xml) the "LogicalCPUs" element
     */
    public void xsetLogicalCPUs(org.apache.xmlbeans.XmlInteger logicalCPUs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(LOGICALCPUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(LOGICALCPUS$4);
            }
            target.set(logicalCPUs);
        }
    }
    
    /**
     * Unsets the "LogicalCPUs" element
     */
    public void unsetLogicalCPUs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOGICALCPUS$4, 0);
        }
    }
    
    /**
     * Gets the "TmpDir" element
     */
    public java.lang.String getTmpDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TMPDIR$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TmpDir" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType xgetTmpDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType)get_store().find_element_user(TMPDIR$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "TmpDir" element
     */
    public boolean isSetTmpDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TMPDIR$6) != 0;
        }
    }
    
    /**
     * Sets the "TmpDir" element
     */
    public void setTmpDir(java.lang.String tmpDir)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TMPDIR$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TMPDIR$6);
            }
            target.setStringValue(tmpDir);
        }
    }
    
    /**
     * Sets (as xml) the "TmpDir" element
     */
    public void xsetTmpDir(it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType tmpDir)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType)get_store().find_element_user(TMPDIR$6, 0);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType)get_store().add_element_user(TMPDIR$6);
            }
            target.set(tmpDir);
        }
    }
    
    /**
     * Unsets the "TmpDir" element
     */
    public void unsetTmpDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TMPDIR$6, 0);
        }
    }
    
    /**
     * Gets the "WNTmpDir" element
     */
    public java.lang.String getWNTmpDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WNTMPDIR$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "WNTmpDir" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType xgetWNTmpDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType)get_store().find_element_user(WNTMPDIR$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "WNTmpDir" element
     */
    public boolean isSetWNTmpDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WNTMPDIR$8) != 0;
        }
    }
    
    /**
     * Sets the "WNTmpDir" element
     */
    public void setWNTmpDir(java.lang.String wnTmpDir)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WNTMPDIR$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WNTMPDIR$8);
            }
            target.setStringValue(wnTmpDir);
        }
    }
    
    /**
     * Sets (as xml) the "WNTmpDir" element
     */
    public void xsetWNTmpDir(it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType wnTmpDir)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType)get_store().find_element_user(WNTMPDIR$8, 0);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType)get_store().add_element_user(WNTMPDIR$8);
            }
            target.set(wnTmpDir);
        }
    }
    
    /**
     * Unsets the "WNTmpDir" element
     */
    public void unsetWNTmpDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WNTMPDIR$8, 0);
        }
    }
    
    /**
     * Gets the "OperatingSystem" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.OperatingSystemType getOperatingSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.OperatingSystemType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.OperatingSystemType)get_store().find_element_user(OPERATINGSYSTEM$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "OperatingSystem" element
     */
    public boolean isSetOperatingSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATINGSYSTEM$10) != 0;
        }
    }
    
    /**
     * Sets the "OperatingSystem" element
     */
    public void setOperatingSystem(it.infn.cnaf.forge.glueschema.spec.v12.r2.OperatingSystemType operatingSystem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.OperatingSystemType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.OperatingSystemType)get_store().find_element_user(OPERATINGSYSTEM$10, 0);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.OperatingSystemType)get_store().add_element_user(OPERATINGSYSTEM$10);
            }
            target.set(operatingSystem);
        }
    }
    
    /**
     * Appends and returns a new empty "OperatingSystem" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.OperatingSystemType addNewOperatingSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.OperatingSystemType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.OperatingSystemType)get_store().add_element_user(OPERATINGSYSTEM$10);
            return target;
        }
    }
    
    /**
     * Unsets the "OperatingSystem" element
     */
    public void unsetOperatingSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATINGSYSTEM$10, 0);
        }
    }
    
    /**
     * Gets the "Processor" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType getProcessor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType)get_store().find_element_user(PROCESSOR$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Processor" element
     */
    public boolean isSetProcessor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCESSOR$12) != 0;
        }
    }
    
    /**
     * Sets the "Processor" element
     */
    public void setProcessor(it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType processor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType)get_store().find_element_user(PROCESSOR$12, 0);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType)get_store().add_element_user(PROCESSOR$12);
            }
            target.set(processor);
        }
    }
    
    /**
     * Appends and returns a new empty "Processor" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType addNewProcessor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType)get_store().add_element_user(PROCESSOR$12);
            return target;
        }
    }
    
    /**
     * Unsets the "Processor" element
     */
    public void unsetProcessor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCESSOR$12, 0);
        }
    }
    
    /**
     * Gets the "NetworkAdapter" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.NetworkAdapterType getNetworkAdapter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.NetworkAdapterType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.NetworkAdapterType)get_store().find_element_user(NETWORKADAPTER$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "NetworkAdapter" element
     */
    public boolean isSetNetworkAdapter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NETWORKADAPTER$14) != 0;
        }
    }
    
    /**
     * Sets the "NetworkAdapter" element
     */
    public void setNetworkAdapter(it.infn.cnaf.forge.glueschema.spec.v12.r2.NetworkAdapterType networkAdapter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.NetworkAdapterType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.NetworkAdapterType)get_store().find_element_user(NETWORKADAPTER$14, 0);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.NetworkAdapterType)get_store().add_element_user(NETWORKADAPTER$14);
            }
            target.set(networkAdapter);
        }
    }
    
    /**
     * Appends and returns a new empty "NetworkAdapter" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.NetworkAdapterType addNewNetworkAdapter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.NetworkAdapterType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.NetworkAdapterType)get_store().add_element_user(NETWORKADAPTER$14);
            return target;
        }
    }
    
    /**
     * Unsets the "NetworkAdapter" element
     */
    public void unsetNetworkAdapter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NETWORKADAPTER$14, 0);
        }
    }
    
    /**
     * Gets the "MainMemory" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.MainMemoryType getMainMemory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.MainMemoryType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.MainMemoryType)get_store().find_element_user(MAINMEMORY$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MainMemory" element
     */
    public boolean isSetMainMemory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAINMEMORY$16) != 0;
        }
    }
    
    /**
     * Sets the "MainMemory" element
     */
    public void setMainMemory(it.infn.cnaf.forge.glueschema.spec.v12.r2.MainMemoryType mainMemory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.MainMemoryType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.MainMemoryType)get_store().find_element_user(MAINMEMORY$16, 0);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.MainMemoryType)get_store().add_element_user(MAINMEMORY$16);
            }
            target.set(mainMemory);
        }
    }
    
    /**
     * Appends and returns a new empty "MainMemory" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.MainMemoryType addNewMainMemory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.MainMemoryType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.MainMemoryType)get_store().add_element_user(MAINMEMORY$16);
            return target;
        }
    }
    
    /**
     * Unsets the "MainMemory" element
     */
    public void unsetMainMemory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAINMEMORY$16, 0);
        }
    }
    
    /**
     * Gets the "Architecture" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.HostArchitectureType getArchitecture()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.HostArchitectureType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostArchitectureType)get_store().find_element_user(ARCHITECTURE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Architecture" element
     */
    public boolean isSetArchitecture()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARCHITECTURE$18) != 0;
        }
    }
    
    /**
     * Sets the "Architecture" element
     */
    public void setArchitecture(it.infn.cnaf.forge.glueschema.spec.v12.r2.HostArchitectureType architecture)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.HostArchitectureType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostArchitectureType)get_store().find_element_user(ARCHITECTURE$18, 0);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostArchitectureType)get_store().add_element_user(ARCHITECTURE$18);
            }
            target.set(architecture);
        }
    }
    
    /**
     * Appends and returns a new empty "Architecture" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.HostArchitectureType addNewArchitecture()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.HostArchitectureType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostArchitectureType)get_store().add_element_user(ARCHITECTURE$18);
            return target;
        }
    }
    
    /**
     * Unsets the "Architecture" element
     */
    public void unsetArchitecture()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARCHITECTURE$18, 0);
        }
    }
    
    /**
     * Gets the "Benchmark" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.BenchmarkType getBenchmark()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.BenchmarkType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.BenchmarkType)get_store().find_element_user(BENCHMARK$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Benchmark" element
     */
    public boolean isSetBenchmark()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BENCHMARK$20) != 0;
        }
    }
    
    /**
     * Sets the "Benchmark" element
     */
    public void setBenchmark(it.infn.cnaf.forge.glueschema.spec.v12.r2.BenchmarkType benchmark)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.BenchmarkType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.BenchmarkType)get_store().find_element_user(BENCHMARK$20, 0);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.BenchmarkType)get_store().add_element_user(BENCHMARK$20);
            }
            target.set(benchmark);
        }
    }
    
    /**
     * Appends and returns a new empty "Benchmark" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.BenchmarkType addNewBenchmark()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.BenchmarkType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.BenchmarkType)get_store().add_element_user(BENCHMARK$20);
            return target;
        }
    }
    
    /**
     * Unsets the "Benchmark" element
     */
    public void unsetBenchmark()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BENCHMARK$20, 0);
        }
    }
    
    /**
     * Gets array of all "Location" elements
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType.Location[] getLocationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCATION$22, targetList);
            it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType.Location[] result = new it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType.Location[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Location" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType.Location getLocationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType.Location target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType.Location)get_store().find_element_user(LOCATION$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Location" element
     */
    public int sizeOfLocationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATION$22);
        }
    }
    
    /**
     * Sets array of all "Location" element
     */
    public void setLocationArray(it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType.Location[] locationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(locationArray, LOCATION$22);
        }
    }
    
    /**
     * Sets ith "Location" element
     */
    public void setLocationArray(int i, it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType.Location location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType.Location target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType.Location)get_store().find_element_user(LOCATION$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(location);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Location" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType.Location insertNewLocation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType.Location target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType.Location)get_store().insert_element_user(LOCATION$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Location" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType.Location addNewLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType.Location target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType.Location)get_store().add_element_user(LOCATION$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "Location" element
     */
    public void removeLocation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATION$22, i);
        }
    }
    
    /**
     * Gets the "RunTimeEnv" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.RunTimeEnvType getRunTimeEnv()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.RunTimeEnvType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.RunTimeEnvType)get_store().find_element_user(RUNTIMEENV$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "RunTimeEnv" element
     */
    public boolean isSetRunTimeEnv()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RUNTIMEENV$24) != 0;
        }
    }
    
    /**
     * Sets the "RunTimeEnv" element
     */
    public void setRunTimeEnv(it.infn.cnaf.forge.glueschema.spec.v12.r2.RunTimeEnvType runTimeEnv)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.RunTimeEnvType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.RunTimeEnvType)get_store().find_element_user(RUNTIMEENV$24, 0);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.RunTimeEnvType)get_store().add_element_user(RUNTIMEENV$24);
            }
            target.set(runTimeEnv);
        }
    }
    
    /**
     * Appends and returns a new empty "RunTimeEnv" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.RunTimeEnvType addNewRunTimeEnv()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.RunTimeEnvType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.RunTimeEnvType)get_store().add_element_user(RUNTIMEENV$24);
            return target;
        }
    }
    
    /**
     * Unsets the "RunTimeEnv" element
     */
    public void unsetRunTimeEnv()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RUNTIMEENV$24, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIQUEID$26);
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
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType)get_store().find_attribute_user(UNIQUEID$26);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIQUEID$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNIQUEID$26);
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
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType)get_store().find_attribute_user(UNIQUEID$26);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType)get_store().add_attribute_user(UNIQUEID$26);
            }
            target.set(uniqueID);
        }
    }
    /**
     * An XML Location(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
     *
     * This is a complex type.
     */
    public static class LocationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType.Location
    {
        private static final long serialVersionUID = 1L;
        
        public LocationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Name");
        private static final javax.xml.namespace.QName VERSION$2 = 
            new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Version");
        private static final javax.xml.namespace.QName PATH$4 = 
            new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Path");
        private static final javax.xml.namespace.QName LOCALID$6 = 
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
         * Gets the "LocalID" attribute
         */
        public java.lang.String getLocalID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCALID$6);
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
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.LocalIDType)get_store().find_attribute_user(LOCALID$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCALID$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCALID$6);
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
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.LocalIDType)get_store().find_attribute_user(LOCALID$6);
                if (target == null)
                {
                    target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.LocalIDType)get_store().add_attribute_user(LOCALID$6);
                }
                target.set(localID);
            }
        }
    }
}
