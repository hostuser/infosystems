/*
 * XML Type:  StorageElementType
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2.impl;
/**
 * An XML StorageElementType(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public class StorageElementTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType
{
    private static final long serialVersionUID = 1L;
    
    public StorageElementTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INFORMATIONSERVICEURL$0 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "InformationServiceURL");
    private static final javax.xml.namespace.QName SIZETOTAL$2 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "SizeTotal");
    private static final javax.xml.namespace.QName SIZEFREE$4 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "SizeFree");
    private static final javax.xml.namespace.QName ARCHITECTURE$6 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Architecture");
    private static final javax.xml.namespace.QName STORAGEAREA$8 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "StorageArea");
    private static final javax.xml.namespace.QName ACCESSPROTOCOL$10 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "AccessProtocol");
    private static final javax.xml.namespace.QName CONTROLPROTOCOL$12 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "ControlProtocol");
    private static final javax.xml.namespace.QName UNIQUEID$14 = 
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
     * Gets the "SizeTotal" element
     */
    public java.math.BigInteger getSizeTotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIZETOTAL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "SizeTotal" element
     */
    public org.apache.xmlbeans.XmlInteger xgetSizeTotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SIZETOTAL$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "SizeTotal" element
     */
    public boolean isSetSizeTotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SIZETOTAL$2) != 0;
        }
    }
    
    /**
     * Sets the "SizeTotal" element
     */
    public void setSizeTotal(java.math.BigInteger sizeTotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIZETOTAL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIZETOTAL$2);
            }
            target.setBigIntegerValue(sizeTotal);
        }
    }
    
    /**
     * Sets (as xml) the "SizeTotal" element
     */
    public void xsetSizeTotal(org.apache.xmlbeans.XmlInteger sizeTotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SIZETOTAL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(SIZETOTAL$2);
            }
            target.set(sizeTotal);
        }
    }
    
    /**
     * Unsets the "SizeTotal" element
     */
    public void unsetSizeTotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SIZETOTAL$2, 0);
        }
    }
    
    /**
     * Gets the "SizeFree" element
     */
    public java.math.BigInteger getSizeFree()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIZEFREE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "SizeFree" element
     */
    public org.apache.xmlbeans.XmlInteger xgetSizeFree()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SIZEFREE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "SizeFree" element
     */
    public boolean isSetSizeFree()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SIZEFREE$4) != 0;
        }
    }
    
    /**
     * Sets the "SizeFree" element
     */
    public void setSizeFree(java.math.BigInteger sizeFree)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIZEFREE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIZEFREE$4);
            }
            target.setBigIntegerValue(sizeFree);
        }
    }
    
    /**
     * Sets (as xml) the "SizeFree" element
     */
    public void xsetSizeFree(org.apache.xmlbeans.XmlInteger sizeFree)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SIZEFREE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(SIZEFREE$4);
            }
            target.set(sizeFree);
        }
    }
    
    /**
     * Unsets the "SizeFree" element
     */
    public void unsetSizeFree()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SIZEFREE$4, 0);
        }
    }
    
    /**
     * Gets the "Architecture" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.SEArchitectureEnum.Enum getArchitecture()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARCHITECTURE$6, 0);
            if (target == null)
            {
                return null;
            }
            return (it.infn.cnaf.forge.glueschema.spec.v12.r2.SEArchitectureEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Architecture" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.SEArchitectureEnum xgetArchitecture()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.SEArchitectureEnum target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.SEArchitectureEnum)get_store().find_element_user(ARCHITECTURE$6, 0);
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
            return get_store().count_elements(ARCHITECTURE$6) != 0;
        }
    }
    
    /**
     * Sets the "Architecture" element
     */
    public void setArchitecture(it.infn.cnaf.forge.glueschema.spec.v12.r2.SEArchitectureEnum.Enum architecture)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARCHITECTURE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARCHITECTURE$6);
            }
            target.setEnumValue(architecture);
        }
    }
    
    /**
     * Sets (as xml) the "Architecture" element
     */
    public void xsetArchitecture(it.infn.cnaf.forge.glueschema.spec.v12.r2.SEArchitectureEnum architecture)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.SEArchitectureEnum target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.SEArchitectureEnum)get_store().find_element_user(ARCHITECTURE$6, 0);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.SEArchitectureEnum)get_store().add_element_user(ARCHITECTURE$6);
            }
            target.set(architecture);
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
            get_store().remove_element(ARCHITECTURE$6, 0);
        }
    }
    
    /**
     * Gets array of all "StorageArea" elements
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType[] getStorageAreaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STORAGEAREA$8, targetList);
            it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType[] result = new it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "StorageArea" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType getStorageAreaArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType)get_store().find_element_user(STORAGEAREA$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "StorageArea" element
     */
    public int sizeOfStorageAreaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STORAGEAREA$8);
        }
    }
    
    /**
     * Sets array of all "StorageArea" element
     */
    public void setStorageAreaArray(it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType[] storageAreaArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(storageAreaArray, STORAGEAREA$8);
        }
    }
    
    /**
     * Sets ith "StorageArea" element
     */
    public void setStorageAreaArray(int i, it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType storageArea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType)get_store().find_element_user(STORAGEAREA$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(storageArea);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StorageArea" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType insertNewStorageArea(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType)get_store().insert_element_user(STORAGEAREA$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StorageArea" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType addNewStorageArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageAreaType)get_store().add_element_user(STORAGEAREA$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "StorageArea" element
     */
    public void removeStorageArea(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STORAGEAREA$8, i);
        }
    }
    
    /**
     * Gets array of all "AccessProtocol" elements
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.SEAccessProtocolType[] getAccessProtocolArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ACCESSPROTOCOL$10, targetList);
            it.infn.cnaf.forge.glueschema.spec.v12.r2.SEAccessProtocolType[] result = new it.infn.cnaf.forge.glueschema.spec.v12.r2.SEAccessProtocolType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AccessProtocol" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.SEAccessProtocolType getAccessProtocolArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.SEAccessProtocolType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.SEAccessProtocolType)get_store().find_element_user(ACCESSPROTOCOL$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AccessProtocol" element
     */
    public int sizeOfAccessProtocolArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACCESSPROTOCOL$10);
        }
    }
    
    /**
     * Sets array of all "AccessProtocol" element
     */
    public void setAccessProtocolArray(it.infn.cnaf.forge.glueschema.spec.v12.r2.SEAccessProtocolType[] accessProtocolArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(accessProtocolArray, ACCESSPROTOCOL$10);
        }
    }
    
    /**
     * Sets ith "AccessProtocol" element
     */
    public void setAccessProtocolArray(int i, it.infn.cnaf.forge.glueschema.spec.v12.r2.SEAccessProtocolType accessProtocol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.SEAccessProtocolType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.SEAccessProtocolType)get_store().find_element_user(ACCESSPROTOCOL$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(accessProtocol);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AccessProtocol" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.SEAccessProtocolType insertNewAccessProtocol(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.SEAccessProtocolType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.SEAccessProtocolType)get_store().insert_element_user(ACCESSPROTOCOL$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AccessProtocol" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.SEAccessProtocolType addNewAccessProtocol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.SEAccessProtocolType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.SEAccessProtocolType)get_store().add_element_user(ACCESSPROTOCOL$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "AccessProtocol" element
     */
    public void removeAccessProtocol(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACCESSPROTOCOL$10, i);
        }
    }
    
    /**
     * Gets array of all "ControlProtocol" elements
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType[] getControlProtocolArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTROLPROTOCOL$12, targetList);
            it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType[] result = new it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ControlProtocol" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType getControlProtocolArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType)get_store().find_element_user(CONTROLPROTOCOL$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ControlProtocol" element
     */
    public int sizeOfControlProtocolArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTROLPROTOCOL$12);
        }
    }
    
    /**
     * Sets array of all "ControlProtocol" element
     */
    public void setControlProtocolArray(it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType[] controlProtocolArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(controlProtocolArray, CONTROLPROTOCOL$12);
        }
    }
    
    /**
     * Sets ith "ControlProtocol" element
     */
    public void setControlProtocolArray(int i, it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType controlProtocol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType)get_store().find_element_user(CONTROLPROTOCOL$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(controlProtocol);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ControlProtocol" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType insertNewControlProtocol(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType)get_store().insert_element_user(CONTROLPROTOCOL$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ControlProtocol" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType addNewControlProtocol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.SEControlProtocolType)get_store().add_element_user(CONTROLPROTOCOL$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "ControlProtocol" element
     */
    public void removeControlProtocol(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTROLPROTOCOL$12, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIQUEID$14);
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
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType)get_store().find_attribute_user(UNIQUEID$14);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIQUEID$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNIQUEID$14);
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
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType)get_store().find_attribute_user(UNIQUEID$14);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType)get_store().add_attribute_user(UNIQUEID$14);
            }
            target.set(uniqueID);
        }
    }
}
