/*
 * XML Type:  StorageAreaType
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2.impl;
/**
 * An XML StorageAreaType(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public class StorageAreaTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType
{
    private static final long serialVersionUID = 1L;
    
    public StorageAreaTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PATH$0 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Path");
    private static final javax.xml.namespace.QName TYPE$2 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Type");
    private static final javax.xml.namespace.QName QUOTA$4 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Quota");
    private static final javax.xml.namespace.QName MINFILESIZE$6 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "MinFileSize");
    private static final javax.xml.namespace.QName MAXFILESIZE$8 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "MaxFileSize");
    private static final javax.xml.namespace.QName MAXDATA$10 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "MaxData");
    private static final javax.xml.namespace.QName MAXNUMFILES$12 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "MaxNumFiles");
    private static final javax.xml.namespace.QName MAXPINDURATION$14 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "MaxPinDuration");
    private static final javax.xml.namespace.QName USEDSPACE$16 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "UsedSpace");
    private static final javax.xml.namespace.QName AVAILABLESPACE$18 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "AvailableSpace");
    private static final javax.xml.namespace.QName ACL$20 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "ACL");
    private static final javax.xml.namespace.QName LOCALID$22 = 
        new javax.xml.namespace.QName("", "LocalID");
    
    
    /**
     * Gets the "Path" element
     */
    public java.lang.String getPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATH$0, 0);
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
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType xgetPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType)get_store().find_element_user(PATH$0, 0);
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
            return get_store().count_elements(PATH$0) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PATH$0);
            }
            target.setStringValue(path);
        }
    }
    
    /**
     * Sets (as xml) the "Path" element
     */
    public void xsetPath(it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType path)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType)get_store().find_element_user(PATH$0, 0);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType)get_store().add_element_user(PATH$0);
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
            get_store().remove_element(PATH$0, 0);
        }
    }
    
    /**
     * Gets the "Type" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.SATypeEnum.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SATypeEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Type" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.SATypeEnum xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.SATypeEnum target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.SATypeEnum)get_store().find_element_user(TYPE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Type" element
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPE$2) != 0;
        }
    }
    
    /**
     * Sets the "Type" element
     */
    public void setType(it.infn.cnaf.forge.glueschema.spec.v12.r2.SATypeEnum.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$2);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "Type" element
     */
    public void xsetType(it.infn.cnaf.forge.glueschema.spec.v12.r2.SATypeEnum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.SATypeEnum target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.SATypeEnum)get_store().find_element_user(TYPE$2, 0);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.SATypeEnum)get_store().add_element_user(TYPE$2);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "Type" element
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPE$2, 0);
        }
    }
    
    /**
     * Gets the "Quota" element
     */
    public java.math.BigInteger getQuota()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUOTA$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "Quota" element
     */
    public org.apache.xmlbeans.XmlInteger xgetQuota()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(QUOTA$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "Quota" element
     */
    public boolean isSetQuota()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUOTA$4) != 0;
        }
    }
    
    /**
     * Sets the "Quota" element
     */
    public void setQuota(java.math.BigInteger quota)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUOTA$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUOTA$4);
            }
            target.setBigIntegerValue(quota);
        }
    }
    
    /**
     * Sets (as xml) the "Quota" element
     */
    public void xsetQuota(org.apache.xmlbeans.XmlInteger quota)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(QUOTA$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(QUOTA$4);
            }
            target.set(quota);
        }
    }
    
    /**
     * Unsets the "Quota" element
     */
    public void unsetQuota()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUOTA$4, 0);
        }
    }
    
    /**
     * Gets the "MinFileSize" element
     */
    public java.math.BigInteger getMinFileSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINFILESIZE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "MinFileSize" element
     */
    public org.apache.xmlbeans.XmlInteger xgetMinFileSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MINFILESIZE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "MinFileSize" element
     */
    public boolean isSetMinFileSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MINFILESIZE$6) != 0;
        }
    }
    
    /**
     * Sets the "MinFileSize" element
     */
    public void setMinFileSize(java.math.BigInteger minFileSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINFILESIZE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINFILESIZE$6);
            }
            target.setBigIntegerValue(minFileSize);
        }
    }
    
    /**
     * Sets (as xml) the "MinFileSize" element
     */
    public void xsetMinFileSize(org.apache.xmlbeans.XmlInteger minFileSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MINFILESIZE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MINFILESIZE$6);
            }
            target.set(minFileSize);
        }
    }
    
    /**
     * Unsets the "MinFileSize" element
     */
    public void unsetMinFileSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MINFILESIZE$6, 0);
        }
    }
    
    /**
     * Gets the "MaxFileSize" element
     */
    public java.math.BigInteger getMaxFileSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXFILESIZE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "MaxFileSize" element
     */
    public org.apache.xmlbeans.XmlInteger xgetMaxFileSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MAXFILESIZE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "MaxFileSize" element
     */
    public boolean isSetMaxFileSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXFILESIZE$8) != 0;
        }
    }
    
    /**
     * Sets the "MaxFileSize" element
     */
    public void setMaxFileSize(java.math.BigInteger maxFileSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXFILESIZE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXFILESIZE$8);
            }
            target.setBigIntegerValue(maxFileSize);
        }
    }
    
    /**
     * Sets (as xml) the "MaxFileSize" element
     */
    public void xsetMaxFileSize(org.apache.xmlbeans.XmlInteger maxFileSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MAXFILESIZE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MAXFILESIZE$8);
            }
            target.set(maxFileSize);
        }
    }
    
    /**
     * Unsets the "MaxFileSize" element
     */
    public void unsetMaxFileSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXFILESIZE$8, 0);
        }
    }
    
    /**
     * Gets the "MaxData" element
     */
    public java.math.BigInteger getMaxData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXDATA$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "MaxData" element
     */
    public org.apache.xmlbeans.XmlInteger xgetMaxData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MAXDATA$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "MaxData" element
     */
    public boolean isSetMaxData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXDATA$10) != 0;
        }
    }
    
    /**
     * Sets the "MaxData" element
     */
    public void setMaxData(java.math.BigInteger maxData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXDATA$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXDATA$10);
            }
            target.setBigIntegerValue(maxData);
        }
    }
    
    /**
     * Sets (as xml) the "MaxData" element
     */
    public void xsetMaxData(org.apache.xmlbeans.XmlInteger maxData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MAXDATA$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MAXDATA$10);
            }
            target.set(maxData);
        }
    }
    
    /**
     * Unsets the "MaxData" element
     */
    public void unsetMaxData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXDATA$10, 0);
        }
    }
    
    /**
     * Gets the "MaxNumFiles" element
     */
    public java.math.BigInteger getMaxNumFiles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXNUMFILES$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "MaxNumFiles" element
     */
    public org.apache.xmlbeans.XmlInteger xgetMaxNumFiles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MAXNUMFILES$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "MaxNumFiles" element
     */
    public boolean isSetMaxNumFiles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXNUMFILES$12) != 0;
        }
    }
    
    /**
     * Sets the "MaxNumFiles" element
     */
    public void setMaxNumFiles(java.math.BigInteger maxNumFiles)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXNUMFILES$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXNUMFILES$12);
            }
            target.setBigIntegerValue(maxNumFiles);
        }
    }
    
    /**
     * Sets (as xml) the "MaxNumFiles" element
     */
    public void xsetMaxNumFiles(org.apache.xmlbeans.XmlInteger maxNumFiles)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MAXNUMFILES$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MAXNUMFILES$12);
            }
            target.set(maxNumFiles);
        }
    }
    
    /**
     * Unsets the "MaxNumFiles" element
     */
    public void unsetMaxNumFiles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXNUMFILES$12, 0);
        }
    }
    
    /**
     * Gets the "MaxPinDuration" element
     */
    public java.math.BigInteger getMaxPinDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXPINDURATION$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "MaxPinDuration" element
     */
    public org.apache.xmlbeans.XmlInteger xgetMaxPinDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MAXPINDURATION$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "MaxPinDuration" element
     */
    public boolean isSetMaxPinDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXPINDURATION$14) != 0;
        }
    }
    
    /**
     * Sets the "MaxPinDuration" element
     */
    public void setMaxPinDuration(java.math.BigInteger maxPinDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXPINDURATION$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXPINDURATION$14);
            }
            target.setBigIntegerValue(maxPinDuration);
        }
    }
    
    /**
     * Sets (as xml) the "MaxPinDuration" element
     */
    public void xsetMaxPinDuration(org.apache.xmlbeans.XmlInteger maxPinDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MAXPINDURATION$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MAXPINDURATION$14);
            }
            target.set(maxPinDuration);
        }
    }
    
    /**
     * Unsets the "MaxPinDuration" element
     */
    public void unsetMaxPinDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXPINDURATION$14, 0);
        }
    }
    
    /**
     * Gets the "UsedSpace" element
     */
    public java.math.BigInteger getUsedSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USEDSPACE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "UsedSpace" element
     */
    public org.apache.xmlbeans.XmlInteger xgetUsedSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(USEDSPACE$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "UsedSpace" element
     */
    public boolean isSetUsedSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USEDSPACE$16) != 0;
        }
    }
    
    /**
     * Sets the "UsedSpace" element
     */
    public void setUsedSpace(java.math.BigInteger usedSpace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USEDSPACE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USEDSPACE$16);
            }
            target.setBigIntegerValue(usedSpace);
        }
    }
    
    /**
     * Sets (as xml) the "UsedSpace" element
     */
    public void xsetUsedSpace(org.apache.xmlbeans.XmlInteger usedSpace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(USEDSPACE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(USEDSPACE$16);
            }
            target.set(usedSpace);
        }
    }
    
    /**
     * Unsets the "UsedSpace" element
     */
    public void unsetUsedSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USEDSPACE$16, 0);
        }
    }
    
    /**
     * Gets the "AvailableSpace" element
     */
    public java.math.BigInteger getAvailableSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AVAILABLESPACE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "AvailableSpace" element
     */
    public org.apache.xmlbeans.XmlInteger xgetAvailableSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(AVAILABLESPACE$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "AvailableSpace" element
     */
    public boolean isSetAvailableSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AVAILABLESPACE$18) != 0;
        }
    }
    
    /**
     * Sets the "AvailableSpace" element
     */
    public void setAvailableSpace(java.math.BigInteger availableSpace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AVAILABLESPACE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AVAILABLESPACE$18);
            }
            target.setBigIntegerValue(availableSpace);
        }
    }
    
    /**
     * Sets (as xml) the "AvailableSpace" element
     */
    public void xsetAvailableSpace(org.apache.xmlbeans.XmlInteger availableSpace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(AVAILABLESPACE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(AVAILABLESPACE$18);
            }
            target.set(availableSpace);
        }
    }
    
    /**
     * Unsets the "AvailableSpace" element
     */
    public void unsetAvailableSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AVAILABLESPACE$18, 0);
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
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ACLType)get_store().find_element_user(ACL$20, 0);
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
            return get_store().count_elements(ACL$20) != 0;
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
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ACLType)get_store().find_element_user(ACL$20, 0);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ACLType)get_store().add_element_user(ACL$20);
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
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ACLType)get_store().add_element_user(ACL$20);
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
            get_store().remove_element(ACL$20, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCALID$22);
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
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.LocalIDType)get_store().find_attribute_user(LOCALID$22);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCALID$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCALID$22);
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
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.LocalIDType)get_store().find_attribute_user(LOCALID$22);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.LocalIDType)get_store().add_attribute_user(LOCALID$22);
            }
            target.set(localID);
        }
    }
}
