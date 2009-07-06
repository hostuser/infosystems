/*
 * XML Type:  HostType
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2.impl;
/**
 * An XML HostType(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public class HostTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType
{
    private static final long serialVersionUID = 1L;
    
    public HostTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Name");
    private static final javax.xml.namespace.QName UPTIME$2 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "UpTime");
    private static final javax.xml.namespace.QName ARCHITECTURE$4 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Architecture");
    private static final javax.xml.namespace.QName MAINMEMORY$6 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "MainMemory");
    private static final javax.xml.namespace.QName OPERATINGSYSTEM$8 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "OperatingSystem");
    private static final javax.xml.namespace.QName PROCESSOR$10 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Processor");
    private static final javax.xml.namespace.QName LOAD$12 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Load");
    private static final javax.xml.namespace.QName NETWORKADAPTER$14 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "NetworkAdapter");
    private static final javax.xml.namespace.QName BENCHMARK$16 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Benchmark");
    private static final javax.xml.namespace.QName RUNTIMEENV$18 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "RunTimeEnv");
    private static final javax.xml.namespace.QName STORAGEDEVICE$20 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "StorageDevice");
    private static final javax.xml.namespace.QName STORAGEPARTITION$22 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "StoragePartition");
    private static final javax.xml.namespace.QName LOCALFILESYSTEM$24 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "LocalFileSystem");
    private static final javax.xml.namespace.QName REMOTEFILESYSTEM$26 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "RemoteFileSystem");
    private static final javax.xml.namespace.QName STORAGEDEVICE2STORAGEPARTITION$28 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "StorageDevice2StoragePartition");
    private static final javax.xml.namespace.QName STORAGEPARTITION2FILESYSTEM$30 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "StoragePartition2FileSystem");
    private static final javax.xml.namespace.QName UNIQUEID$32 = 
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
     * Gets the "UpTime" element
     */
    public java.math.BigInteger getUpTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPTIME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "UpTime" element
     */
    public org.apache.xmlbeans.XmlInteger xgetUpTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(UPTIME$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "UpTime" element
     */
    public boolean isSetUpTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UPTIME$2) != 0;
        }
    }
    
    /**
     * Sets the "UpTime" element
     */
    public void setUpTime(java.math.BigInteger upTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPTIME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPTIME$2);
            }
            target.setBigIntegerValue(upTime);
        }
    }
    
    /**
     * Sets (as xml) the "UpTime" element
     */
    public void xsetUpTime(org.apache.xmlbeans.XmlInteger upTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(UPTIME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(UPTIME$2);
            }
            target.set(upTime);
        }
    }
    
    /**
     * Unsets the "UpTime" element
     */
    public void unsetUpTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UPTIME$2, 0);
        }
    }
    
    /**
     * Gets the "Architecture" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.HostArchitectureFullType getArchitecture()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.HostArchitectureFullType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostArchitectureFullType)get_store().find_element_user(ARCHITECTURE$4, 0);
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
            return get_store().count_elements(ARCHITECTURE$4) != 0;
        }
    }
    
    /**
     * Sets the "Architecture" element
     */
    public void setArchitecture(it.infn.cnaf.forge.glueschema.spec.v12.r2.HostArchitectureFullType architecture)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.HostArchitectureFullType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostArchitectureFullType)get_store().find_element_user(ARCHITECTURE$4, 0);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostArchitectureFullType)get_store().add_element_user(ARCHITECTURE$4);
            }
            target.set(architecture);
        }
    }
    
    /**
     * Appends and returns a new empty "Architecture" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.HostArchitectureFullType addNewArchitecture()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.HostArchitectureFullType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostArchitectureFullType)get_store().add_element_user(ARCHITECTURE$4);
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
            get_store().remove_element(ARCHITECTURE$4, 0);
        }
    }
    
    /**
     * Gets the "MainMemory" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.MainMemoryFullType getMainMemory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.MainMemoryFullType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.MainMemoryFullType)get_store().find_element_user(MAINMEMORY$6, 0);
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
            return get_store().count_elements(MAINMEMORY$6) != 0;
        }
    }
    
    /**
     * Sets the "MainMemory" element
     */
    public void setMainMemory(it.infn.cnaf.forge.glueschema.spec.v12.r2.MainMemoryFullType mainMemory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.MainMemoryFullType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.MainMemoryFullType)get_store().find_element_user(MAINMEMORY$6, 0);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.MainMemoryFullType)get_store().add_element_user(MAINMEMORY$6);
            }
            target.set(mainMemory);
        }
    }
    
    /**
     * Appends and returns a new empty "MainMemory" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.MainMemoryFullType addNewMainMemory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.MainMemoryFullType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.MainMemoryFullType)get_store().add_element_user(MAINMEMORY$6);
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
            get_store().remove_element(MAINMEMORY$6, 0);
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
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.OperatingSystemType)get_store().find_element_user(OPERATINGSYSTEM$8, 0);
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
            return get_store().count_elements(OPERATINGSYSTEM$8) != 0;
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
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.OperatingSystemType)get_store().find_element_user(OPERATINGSYSTEM$8, 0);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.OperatingSystemType)get_store().add_element_user(OPERATINGSYSTEM$8);
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
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.OperatingSystemType)get_store().add_element_user(OPERATINGSYSTEM$8);
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
            get_store().remove_element(OPERATINGSYSTEM$8, 0);
        }
    }
    
    /**
     * Gets the "Processor" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType getProcessor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType)get_store().find_element_user(PROCESSOR$10, 0);
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
            return get_store().count_elements(PROCESSOR$10) != 0;
        }
    }
    
    /**
     * Sets the "Processor" element
     */
    public void setProcessor(it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType processor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType)get_store().find_element_user(PROCESSOR$10, 0);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType)get_store().add_element_user(PROCESSOR$10);
            }
            target.set(processor);
        }
    }
    
    /**
     * Appends and returns a new empty "Processor" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType addNewProcessor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorFullType)get_store().add_element_user(PROCESSOR$10);
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
            get_store().remove_element(PROCESSOR$10, 0);
        }
    }
    
    /**
     * Gets the "Load" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.LoadType getLoad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.LoadType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.LoadType)get_store().find_element_user(LOAD$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Load" element
     */
    public boolean isSetLoad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOAD$12) != 0;
        }
    }
    
    /**
     * Sets the "Load" element
     */
    public void setLoad(it.infn.cnaf.forge.glueschema.spec.v12.r2.LoadType load)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.LoadType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.LoadType)get_store().find_element_user(LOAD$12, 0);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.LoadType)get_store().add_element_user(LOAD$12);
            }
            target.set(load);
        }
    }
    
    /**
     * Appends and returns a new empty "Load" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.LoadType addNewLoad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.LoadType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.LoadType)get_store().add_element_user(LOAD$12);
            return target;
        }
    }
    
    /**
     * Unsets the "Load" element
     */
    public void unsetLoad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOAD$12, 0);
        }
    }
    
    /**
     * Gets array of all "NetworkAdapter" elements
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.NetworkAdapterFullType[] getNetworkAdapterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NETWORKADAPTER$14, targetList);
            it.infn.cnaf.forge.glueschema.spec.v12.r2.NetworkAdapterFullType[] result = new it.infn.cnaf.forge.glueschema.spec.v12.r2.NetworkAdapterFullType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "NetworkAdapter" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.NetworkAdapterFullType getNetworkAdapterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.NetworkAdapterFullType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.NetworkAdapterFullType)get_store().find_element_user(NETWORKADAPTER$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "NetworkAdapter" element
     */
    public int sizeOfNetworkAdapterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NETWORKADAPTER$14);
        }
    }
    
    /**
     * Sets array of all "NetworkAdapter" element
     */
    public void setNetworkAdapterArray(it.infn.cnaf.forge.glueschema.spec.v12.r2.NetworkAdapterFullType[] networkAdapterArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(networkAdapterArray, NETWORKADAPTER$14);
        }
    }
    
    /**
     * Sets ith "NetworkAdapter" element
     */
    public void setNetworkAdapterArray(int i, it.infn.cnaf.forge.glueschema.spec.v12.r2.NetworkAdapterFullType networkAdapter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.NetworkAdapterFullType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.NetworkAdapterFullType)get_store().find_element_user(NETWORKADAPTER$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(networkAdapter);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "NetworkAdapter" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.NetworkAdapterFullType insertNewNetworkAdapter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.NetworkAdapterFullType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.NetworkAdapterFullType)get_store().insert_element_user(NETWORKADAPTER$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "NetworkAdapter" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.NetworkAdapterFullType addNewNetworkAdapter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.NetworkAdapterFullType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.NetworkAdapterFullType)get_store().add_element_user(NETWORKADAPTER$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "NetworkAdapter" element
     */
    public void removeNetworkAdapter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NETWORKADAPTER$14, i);
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
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.BenchmarkType)get_store().find_element_user(BENCHMARK$16, 0);
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
            return get_store().count_elements(BENCHMARK$16) != 0;
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
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.BenchmarkType)get_store().find_element_user(BENCHMARK$16, 0);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.BenchmarkType)get_store().add_element_user(BENCHMARK$16);
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
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.BenchmarkType)get_store().add_element_user(BENCHMARK$16);
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
            get_store().remove_element(BENCHMARK$16, 0);
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
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.RunTimeEnvType)get_store().find_element_user(RUNTIMEENV$18, 0);
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
            return get_store().count_elements(RUNTIMEENV$18) != 0;
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
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.RunTimeEnvType)get_store().find_element_user(RUNTIMEENV$18, 0);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.RunTimeEnvType)get_store().add_element_user(RUNTIMEENV$18);
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
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.RunTimeEnvType)get_store().add_element_user(RUNTIMEENV$18);
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
            get_store().remove_element(RUNTIMEENV$18, 0);
        }
    }
    
    /**
     * Gets array of all "StorageDevice" elements
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageDeviceType[] getStorageDeviceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STORAGEDEVICE$20, targetList);
            it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageDeviceType[] result = new it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageDeviceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "StorageDevice" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageDeviceType getStorageDeviceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageDeviceType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageDeviceType)get_store().find_element_user(STORAGEDEVICE$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "StorageDevice" element
     */
    public int sizeOfStorageDeviceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STORAGEDEVICE$20);
        }
    }
    
    /**
     * Sets array of all "StorageDevice" element
     */
    public void setStorageDeviceArray(it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageDeviceType[] storageDeviceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(storageDeviceArray, STORAGEDEVICE$20);
        }
    }
    
    /**
     * Sets ith "StorageDevice" element
     */
    public void setStorageDeviceArray(int i, it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageDeviceType storageDevice)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageDeviceType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageDeviceType)get_store().find_element_user(STORAGEDEVICE$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(storageDevice);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StorageDevice" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageDeviceType insertNewStorageDevice(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageDeviceType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageDeviceType)get_store().insert_element_user(STORAGEDEVICE$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StorageDevice" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageDeviceType addNewStorageDevice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageDeviceType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageDeviceType)get_store().add_element_user(STORAGEDEVICE$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "StorageDevice" element
     */
    public void removeStorageDevice(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STORAGEDEVICE$20, i);
        }
    }
    
    /**
     * Gets array of all "StoragePartition" elements
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.StoragePartitionType[] getStoragePartitionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STORAGEPARTITION$22, targetList);
            it.infn.cnaf.forge.glueschema.spec.v12.r2.StoragePartitionType[] result = new it.infn.cnaf.forge.glueschema.spec.v12.r2.StoragePartitionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "StoragePartition" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.StoragePartitionType getStoragePartitionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.StoragePartitionType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.StoragePartitionType)get_store().find_element_user(STORAGEPARTITION$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "StoragePartition" element
     */
    public int sizeOfStoragePartitionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STORAGEPARTITION$22);
        }
    }
    
    /**
     * Sets array of all "StoragePartition" element
     */
    public void setStoragePartitionArray(it.infn.cnaf.forge.glueschema.spec.v12.r2.StoragePartitionType[] storagePartitionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(storagePartitionArray, STORAGEPARTITION$22);
        }
    }
    
    /**
     * Sets ith "StoragePartition" element
     */
    public void setStoragePartitionArray(int i, it.infn.cnaf.forge.glueschema.spec.v12.r2.StoragePartitionType storagePartition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.StoragePartitionType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.StoragePartitionType)get_store().find_element_user(STORAGEPARTITION$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(storagePartition);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StoragePartition" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.StoragePartitionType insertNewStoragePartition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.StoragePartitionType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.StoragePartitionType)get_store().insert_element_user(STORAGEPARTITION$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StoragePartition" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.StoragePartitionType addNewStoragePartition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.StoragePartitionType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.StoragePartitionType)get_store().add_element_user(STORAGEPARTITION$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "StoragePartition" element
     */
    public void removeStoragePartition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STORAGEPARTITION$22, i);
        }
    }
    
    /**
     * Gets array of all "LocalFileSystem" elements
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType[] getLocalFileSystemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCALFILESYSTEM$24, targetList);
            it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType[] result = new it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "LocalFileSystem" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType getLocalFileSystemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType)get_store().find_element_user(LOCALFILESYSTEM$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "LocalFileSystem" element
     */
    public int sizeOfLocalFileSystemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCALFILESYSTEM$24);
        }
    }
    
    /**
     * Sets array of all "LocalFileSystem" element
     */
    public void setLocalFileSystemArray(it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType[] localFileSystemArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(localFileSystemArray, LOCALFILESYSTEM$24);
        }
    }
    
    /**
     * Sets ith "LocalFileSystem" element
     */
    public void setLocalFileSystemArray(int i, it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType localFileSystem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType)get_store().find_element_user(LOCALFILESYSTEM$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(localFileSystem);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LocalFileSystem" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType insertNewLocalFileSystem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType)get_store().insert_element_user(LOCALFILESYSTEM$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LocalFileSystem" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType addNewLocalFileSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType)get_store().add_element_user(LOCALFILESYSTEM$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "LocalFileSystem" element
     */
    public void removeLocalFileSystem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCALFILESYSTEM$24, i);
        }
    }
    
    /**
     * Gets array of all "RemoteFileSystem" elements
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType[] getRemoteFileSystemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REMOTEFILESYSTEM$26, targetList);
            it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType[] result = new it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "RemoteFileSystem" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType getRemoteFileSystemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType)get_store().find_element_user(REMOTEFILESYSTEM$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "RemoteFileSystem" element
     */
    public int sizeOfRemoteFileSystemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REMOTEFILESYSTEM$26);
        }
    }
    
    /**
     * Sets array of all "RemoteFileSystem" element
     */
    public void setRemoteFileSystemArray(it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType[] remoteFileSystemArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(remoteFileSystemArray, REMOTEFILESYSTEM$26);
        }
    }
    
    /**
     * Sets ith "RemoteFileSystem" element
     */
    public void setRemoteFileSystemArray(int i, it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType remoteFileSystem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType)get_store().find_element_user(REMOTEFILESYSTEM$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(remoteFileSystem);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RemoteFileSystem" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType insertNewRemoteFileSystem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType)get_store().insert_element_user(REMOTEFILESYSTEM$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RemoteFileSystem" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType addNewRemoteFileSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType)get_store().add_element_user(REMOTEFILESYSTEM$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "RemoteFileSystem" element
     */
    public void removeRemoteFileSystem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REMOTEFILESYSTEM$26, i);
        }
    }
    
    /**
     * Gets array of all "StorageDevice2StoragePartition" elements
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StorageDevice2StoragePartition[] getStorageDevice2StoragePartitionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STORAGEDEVICE2STORAGEPARTITION$28, targetList);
            it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StorageDevice2StoragePartition[] result = new it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StorageDevice2StoragePartition[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "StorageDevice2StoragePartition" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StorageDevice2StoragePartition getStorageDevice2StoragePartitionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StorageDevice2StoragePartition target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StorageDevice2StoragePartition)get_store().find_element_user(STORAGEDEVICE2STORAGEPARTITION$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "StorageDevice2StoragePartition" element
     */
    public int sizeOfStorageDevice2StoragePartitionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STORAGEDEVICE2STORAGEPARTITION$28);
        }
    }
    
    /**
     * Sets array of all "StorageDevice2StoragePartition" element
     */
    public void setStorageDevice2StoragePartitionArray(it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StorageDevice2StoragePartition[] storageDevice2StoragePartitionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(storageDevice2StoragePartitionArray, STORAGEDEVICE2STORAGEPARTITION$28);
        }
    }
    
    /**
     * Sets ith "StorageDevice2StoragePartition" element
     */
    public void setStorageDevice2StoragePartitionArray(int i, it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StorageDevice2StoragePartition storageDevice2StoragePartition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StorageDevice2StoragePartition target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StorageDevice2StoragePartition)get_store().find_element_user(STORAGEDEVICE2STORAGEPARTITION$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(storageDevice2StoragePartition);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StorageDevice2StoragePartition" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StorageDevice2StoragePartition insertNewStorageDevice2StoragePartition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StorageDevice2StoragePartition target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StorageDevice2StoragePartition)get_store().insert_element_user(STORAGEDEVICE2STORAGEPARTITION$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StorageDevice2StoragePartition" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StorageDevice2StoragePartition addNewStorageDevice2StoragePartition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StorageDevice2StoragePartition target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StorageDevice2StoragePartition)get_store().add_element_user(STORAGEDEVICE2STORAGEPARTITION$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "StorageDevice2StoragePartition" element
     */
    public void removeStorageDevice2StoragePartition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STORAGEDEVICE2STORAGEPARTITION$28, i);
        }
    }
    
    /**
     * Gets array of all "StoragePartition2FileSystem" elements
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StoragePartition2FileSystem[] getStoragePartition2FileSystemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STORAGEPARTITION2FILESYSTEM$30, targetList);
            it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StoragePartition2FileSystem[] result = new it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StoragePartition2FileSystem[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "StoragePartition2FileSystem" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StoragePartition2FileSystem getStoragePartition2FileSystemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StoragePartition2FileSystem target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StoragePartition2FileSystem)get_store().find_element_user(STORAGEPARTITION2FILESYSTEM$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "StoragePartition2FileSystem" element
     */
    public int sizeOfStoragePartition2FileSystemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STORAGEPARTITION2FILESYSTEM$30);
        }
    }
    
    /**
     * Sets array of all "StoragePartition2FileSystem" element
     */
    public void setStoragePartition2FileSystemArray(it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StoragePartition2FileSystem[] storagePartition2FileSystemArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(storagePartition2FileSystemArray, STORAGEPARTITION2FILESYSTEM$30);
        }
    }
    
    /**
     * Sets ith "StoragePartition2FileSystem" element
     */
    public void setStoragePartition2FileSystemArray(int i, it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StoragePartition2FileSystem storagePartition2FileSystem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StoragePartition2FileSystem target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StoragePartition2FileSystem)get_store().find_element_user(STORAGEPARTITION2FILESYSTEM$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(storagePartition2FileSystem);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StoragePartition2FileSystem" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StoragePartition2FileSystem insertNewStoragePartition2FileSystem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StoragePartition2FileSystem target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StoragePartition2FileSystem)get_store().insert_element_user(STORAGEPARTITION2FILESYSTEM$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StoragePartition2FileSystem" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StoragePartition2FileSystem addNewStoragePartition2FileSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StoragePartition2FileSystem target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StoragePartition2FileSystem)get_store().add_element_user(STORAGEPARTITION2FILESYSTEM$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "StoragePartition2FileSystem" element
     */
    public void removeStoragePartition2FileSystem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STORAGEPARTITION2FILESYSTEM$30, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIQUEID$32);
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
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType)get_store().find_attribute_user(UNIQUEID$32);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIQUEID$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNIQUEID$32);
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
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType)get_store().find_attribute_user(UNIQUEID$32);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType)get_store().add_attribute_user(UNIQUEID$32);
            }
            target.set(uniqueID);
        }
    }
    /**
     * An XML StorageDevice2StoragePartition(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
     *
     * This is a complex type.
     */
    public static class StorageDevice2StoragePartitionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StorageDevice2StoragePartition
    {
        private static final long serialVersionUID = 1L;
        
        public StorageDevice2StoragePartitionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STORAGEDEVICENAME$0 = 
            new javax.xml.namespace.QName("", "StorageDeviceName");
        private static final javax.xml.namespace.QName STORAGEPARTITIONNAME$2 = 
            new javax.xml.namespace.QName("", "StoragePartitionName");
        
        
        /**
         * Gets the "StorageDeviceName" attribute
         */
        public java.lang.String getStorageDeviceName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STORAGEDEVICENAME$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "StorageDeviceName" attribute
         */
        public org.apache.xmlbeans.XmlString xgetStorageDeviceName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STORAGEDEVICENAME$0);
                return target;
            }
        }
        
        /**
         * Sets the "StorageDeviceName" attribute
         */
        public void setStorageDeviceName(java.lang.String storageDeviceName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STORAGEDEVICENAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STORAGEDEVICENAME$0);
                }
                target.setStringValue(storageDeviceName);
            }
        }
        
        /**
         * Sets (as xml) the "StorageDeviceName" attribute
         */
        public void xsetStorageDeviceName(org.apache.xmlbeans.XmlString storageDeviceName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STORAGEDEVICENAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STORAGEDEVICENAME$0);
                }
                target.set(storageDeviceName);
            }
        }
        
        /**
         * Gets the "StoragePartitionName" attribute
         */
        public java.lang.String getStoragePartitionName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STORAGEPARTITIONNAME$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "StoragePartitionName" attribute
         */
        public org.apache.xmlbeans.XmlString xgetStoragePartitionName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STORAGEPARTITIONNAME$2);
                return target;
            }
        }
        
        /**
         * Sets the "StoragePartitionName" attribute
         */
        public void setStoragePartitionName(java.lang.String storagePartitionName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STORAGEPARTITIONNAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STORAGEPARTITIONNAME$2);
                }
                target.setStringValue(storagePartitionName);
            }
        }
        
        /**
         * Sets (as xml) the "StoragePartitionName" attribute
         */
        public void xsetStoragePartitionName(org.apache.xmlbeans.XmlString storagePartitionName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STORAGEPARTITIONNAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STORAGEPARTITIONNAME$2);
                }
                target.set(storagePartitionName);
            }
        }
    }
    /**
     * An XML StoragePartition2FileSystem(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
     *
     * This is a complex type.
     */
    public static class StoragePartition2FileSystemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType.StoragePartition2FileSystem
    {
        private static final long serialVersionUID = 1L;
        
        public StoragePartition2FileSystemImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STORAGEPARTITIONNAME$0 = 
            new javax.xml.namespace.QName("", "StoragePartitionName");
        private static final javax.xml.namespace.QName FILESYSTEMNAME$2 = 
            new javax.xml.namespace.QName("", "FileSystemName");
        
        
        /**
         * Gets the "StoragePartitionName" attribute
         */
        public java.lang.String getStoragePartitionName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STORAGEPARTITIONNAME$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "StoragePartitionName" attribute
         */
        public org.apache.xmlbeans.XmlString xgetStoragePartitionName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STORAGEPARTITIONNAME$0);
                return target;
            }
        }
        
        /**
         * Sets the "StoragePartitionName" attribute
         */
        public void setStoragePartitionName(java.lang.String storagePartitionName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STORAGEPARTITIONNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STORAGEPARTITIONNAME$0);
                }
                target.setStringValue(storagePartitionName);
            }
        }
        
        /**
         * Sets (as xml) the "StoragePartitionName" attribute
         */
        public void xsetStoragePartitionName(org.apache.xmlbeans.XmlString storagePartitionName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STORAGEPARTITIONNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STORAGEPARTITIONNAME$0);
                }
                target.set(storagePartitionName);
            }
        }
        
        /**
         * Gets the "FileSystemName" attribute
         */
        public java.lang.String getFileSystemName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILESYSTEMNAME$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "FileSystemName" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFileSystemName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FILESYSTEMNAME$2);
                return target;
            }
        }
        
        /**
         * Sets the "FileSystemName" attribute
         */
        public void setFileSystemName(java.lang.String fileSystemName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILESYSTEMNAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILESYSTEMNAME$2);
                }
                target.setStringValue(fileSystemName);
            }
        }
        
        /**
         * Sets (as xml) the "FileSystemName" attribute
         */
        public void xsetFileSystemName(org.apache.xmlbeans.XmlString fileSystemName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FILESYSTEMNAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FILESYSTEMNAME$2);
                }
                target.set(fileSystemName);
            }
        }
    }
}
