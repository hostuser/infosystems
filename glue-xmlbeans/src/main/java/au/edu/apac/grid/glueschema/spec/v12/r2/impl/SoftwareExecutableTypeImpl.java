/*
 * XML Type:  SoftwareExecutableType
 * Namespace: http://grid.apac.edu.au/glueschema/Spec/V12/R2
 * Java type: au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType
 *
 * Automatically generated - do not modify.
 */
package au.edu.apac.grid.glueschema.spec.v12.r2.impl;
/**
 * An XML SoftwareExecutableType(@http://grid.apac.edu.au/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public class SoftwareExecutableTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.edu.apac.grid.glueschema.spec.v12.r2.SoftwareExecutableType
{
    private static final long serialVersionUID = 1L;
    
    public SoftwareExecutableTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://grid.apac.edu.au/glueschema/Spec/V12/R2", "Name");
    private static final javax.xml.namespace.QName PATH$2 = 
        new javax.xml.namespace.QName("http://grid.apac.edu.au/glueschema/Spec/V12/R2", "Path");
    private static final javax.xml.namespace.QName SERIALAVAIL$4 = 
        new javax.xml.namespace.QName("http://grid.apac.edu.au/glueschema/Spec/V12/R2", "SerialAvail");
    private static final javax.xml.namespace.QName PARALLELAVAIL$6 = 
        new javax.xml.namespace.QName("http://grid.apac.edu.au/glueschema/Spec/V12/R2", "ParallelAvail");
    private static final javax.xml.namespace.QName PARALLELMAXCPUS$8 = 
        new javax.xml.namespace.QName("http://grid.apac.edu.au/glueschema/Spec/V12/R2", "ParallelMaxCPUs");
    private static final javax.xml.namespace.QName PARALLELTYPE$10 = 
        new javax.xml.namespace.QName("http://grid.apac.edu.au/glueschema/Spec/V12/R2", "ParallelType");
    private static final javax.xml.namespace.QName LOCALID$12 = 
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
     * Gets the "Path" element
     */
    public java.lang.String getPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATH$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PATH$2, 0);
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
            return get_store().count_elements(PATH$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATH$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PATH$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PATH$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PATH$2);
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
            get_store().remove_element(PATH$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERIALAVAIL$4, 0);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SERIALAVAIL$4, 0);
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
            return get_store().count_elements(SERIALAVAIL$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERIALAVAIL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERIALAVAIL$4);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SERIALAVAIL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SERIALAVAIL$4);
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
            get_store().remove_element(SERIALAVAIL$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARALLELAVAIL$6, 0);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PARALLELAVAIL$6, 0);
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
            return get_store().count_elements(PARALLELAVAIL$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARALLELAVAIL$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARALLELAVAIL$6);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PARALLELAVAIL$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PARALLELAVAIL$6);
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
            get_store().remove_element(PARALLELAVAIL$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARALLELMAXCPUS$8, 0);
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
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PARALLELMAXCPUS$8, 0);
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
            return get_store().count_elements(PARALLELMAXCPUS$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARALLELMAXCPUS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARALLELMAXCPUS$8);
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
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PARALLELMAXCPUS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PARALLELMAXCPUS$8);
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
            get_store().remove_element(PARALLELMAXCPUS$8, 0);
        }
    }
    
    /**
     * Gets the "ParallelType" element
     */
    public java.lang.String getParallelType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARALLELTYPE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ParallelType" element
     */
    public org.apache.xmlbeans.XmlString xgetParallelType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARALLELTYPE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "ParallelType" element
     */
    public boolean isSetParallelType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARALLELTYPE$10) != 0;
        }
    }
    
    /**
     * Sets the "ParallelType" element
     */
    public void setParallelType(java.lang.String parallelType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARALLELTYPE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARALLELTYPE$10);
            }
            target.setStringValue(parallelType);
        }
    }
    
    /**
     * Sets (as xml) the "ParallelType" element
     */
    public void xsetParallelType(org.apache.xmlbeans.XmlString parallelType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARALLELTYPE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARALLELTYPE$10);
            }
            target.set(parallelType);
        }
    }
    
    /**
     * Unsets the "ParallelType" element
     */
    public void unsetParallelType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARALLELTYPE$10, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCALID$12);
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
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.LocalIDType)get_store().find_attribute_user(LOCALID$12);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCALID$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCALID$12);
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
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.LocalIDType)get_store().find_attribute_user(LOCALID$12);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.LocalIDType)get_store().add_attribute_user(LOCALID$12);
            }
            target.set(localID);
        }
    }
}
