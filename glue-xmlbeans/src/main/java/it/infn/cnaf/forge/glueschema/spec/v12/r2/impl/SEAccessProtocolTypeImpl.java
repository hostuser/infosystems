/*
 * XML Type:  SEAccessProtocolType
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.SEAccessProtocolType
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2.impl;
/**
 * An XML SEAccessProtocolType(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public class SEAccessProtocolTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.infn.cnaf.forge.glueschema.spec.v12.r2.SEAccessProtocolType
{
    private static final long serialVersionUID = 1L;
    
    public SEAccessProtocolTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENDPOINT$0 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Endpoint");
    private static final javax.xml.namespace.QName TYPE$2 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Type");
    private static final javax.xml.namespace.QName VERSION$4 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Version");
    private static final javax.xml.namespace.QName CAPABILITY$6 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Capability");
    private static final javax.xml.namespace.QName LOCALID$8 = 
        new javax.xml.namespace.QName("", "LocalID");
    
    
    /**
     * Gets the "Endpoint" element
     */
    public java.lang.String getEndpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDPOINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Endpoint" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetEndpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ENDPOINT$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Endpoint" element
     */
    public boolean isSetEndpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDPOINT$0) != 0;
        }
    }
    
    /**
     * Sets the "Endpoint" element
     */
    public void setEndpoint(java.lang.String endpoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDPOINT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDPOINT$0);
            }
            target.setStringValue(endpoint);
        }
    }
    
    /**
     * Sets (as xml) the "Endpoint" element
     */
    public void xsetEndpoint(org.apache.xmlbeans.XmlAnyURI endpoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ENDPOINT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(ENDPOINT$0);
            }
            target.set(endpoint);
        }
    }
    
    /**
     * Unsets the "Endpoint" element
     */
    public void unsetEndpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDPOINT$0, 0);
        }
    }
    
    /**
     * Gets the "Type" element
     */
    public java.lang.String getType()
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
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Type" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.SEAccessProtocolOpenEnum xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.SEAccessProtocolOpenEnum target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.SEAccessProtocolOpenEnum)get_store().find_element_user(TYPE$2, 0);
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
    public void setType(java.lang.String type)
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
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "Type" element
     */
    public void xsetType(it.infn.cnaf.forge.glueschema.spec.v12.r2.SEAccessProtocolOpenEnum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.SEAccessProtocolOpenEnum target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.SEAccessProtocolOpenEnum)get_store().find_element_user(TYPE$2, 0);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.SEAccessProtocolOpenEnum)get_store().add_element_user(TYPE$2);
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
     * Gets the "Version" element
     */
    public java.lang.String getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$4, 0);
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
            return get_store().count_elements(VERSION$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSION$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERSION$4);
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
            get_store().remove_element(VERSION$4, 0);
        }
    }
    
    /**
     * Gets array of all "Capability" elements
     */
    public java.lang.String[] getCapabilityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CAPABILITY$6, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "Capability" element
     */
    public java.lang.String getCapabilityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAPABILITY$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "Capability" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetCapabilityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CAPABILITY$6, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "Capability" element
     */
    public org.apache.xmlbeans.XmlString xgetCapabilityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CAPABILITY$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "Capability" element
     */
    public int sizeOfCapabilityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CAPABILITY$6);
        }
    }
    
    /**
     * Sets array of all "Capability" element
     */
    public void setCapabilityArray(java.lang.String[] capabilityArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(capabilityArray, CAPABILITY$6);
        }
    }
    
    /**
     * Sets ith "Capability" element
     */
    public void setCapabilityArray(int i, java.lang.String capability)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAPABILITY$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(capability);
        }
    }
    
    /**
     * Sets (as xml) array of all "Capability" element
     */
    public void xsetCapabilityArray(org.apache.xmlbeans.XmlString[]capabilityArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(capabilityArray, CAPABILITY$6);
        }
    }
    
    /**
     * Sets (as xml) ith "Capability" element
     */
    public void xsetCapabilityArray(int i, org.apache.xmlbeans.XmlString capability)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CAPABILITY$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(capability);
        }
    }
    
    /**
     * Inserts the value as the ith "Capability" element
     */
    public void insertCapability(int i, java.lang.String capability)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CAPABILITY$6, i);
            target.setStringValue(capability);
        }
    }
    
    /**
     * Appends the value as the last "Capability" element
     */
    public void addCapability(java.lang.String capability)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAPABILITY$6);
            target.setStringValue(capability);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Capability" element
     */
    public org.apache.xmlbeans.XmlString insertNewCapability(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(CAPABILITY$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Capability" element
     */
    public org.apache.xmlbeans.XmlString addNewCapability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CAPABILITY$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "Capability" element
     */
    public void removeCapability(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CAPABILITY$6, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCALID$8);
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
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.LocalIDType)get_store().find_attribute_user(LOCALID$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCALID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCALID$8);
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
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.LocalIDType)get_store().find_attribute_user(LOCALID$8);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.LocalIDType)get_store().add_attribute_user(LOCALID$8);
            }
            target.set(localID);
        }
    }
}
