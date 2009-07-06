/*
 * XML Type:  ServiceType
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2.impl;
/**
 * An XML ServiceType(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public class ServiceTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType
{
    private static final long serialVersionUID = 1L;
    
    public ServiceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Name");
    private static final javax.xml.namespace.QName TYPE$2 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Type");
    private static final javax.xml.namespace.QName VERSION$4 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Version");
    private static final javax.xml.namespace.QName ENDPOINT$6 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Endpoint");
    private static final javax.xml.namespace.QName STATUS$8 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Status");
    private static final javax.xml.namespace.QName STATUSINFO$10 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "StatusInfo");
    private static final javax.xml.namespace.QName WSDL$12 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "WSDL");
    private static final javax.xml.namespace.QName SEMANTICS$14 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Semantics");
    private static final javax.xml.namespace.QName STARTTIME$16 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "StartTime");
    private static final javax.xml.namespace.QName OWNER$18 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Owner");
    private static final javax.xml.namespace.QName DATA$20 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Data");
    private static final javax.xml.namespace.QName UNIQUEID$22 = 
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
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeOpenEnum xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeOpenEnum target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeOpenEnum)get_store().find_element_user(TYPE$2, 0);
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
    public void xsetType(it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeOpenEnum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeOpenEnum target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeOpenEnum)get_store().find_element_user(TYPE$2, 0);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceTypeOpenEnum)get_store().add_element_user(TYPE$2);
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
     * Gets the "Endpoint" element
     */
    public java.lang.String getEndpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDPOINT$6, 0);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ENDPOINT$6, 0);
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
            return get_store().count_elements(ENDPOINT$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDPOINT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDPOINT$6);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ENDPOINT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(ENDPOINT$6);
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
            get_store().remove_element(ENDPOINT$6, 0);
        }
    }
    
    /**
     * Gets the "Status" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceStatusEnum.Enum getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$8, 0);
            if (target == null)
            {
                return null;
            }
            return (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceStatusEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Status" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceStatusEnum xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceStatusEnum target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceStatusEnum)get_store().find_element_user(STATUS$8, 0);
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
            return get_store().count_elements(STATUS$8) != 0;
        }
    }
    
    /**
     * Sets the "Status" element
     */
    public void setStatus(it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceStatusEnum.Enum status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$8);
            }
            target.setEnumValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "Status" element
     */
    public void xsetStatus(it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceStatusEnum status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceStatusEnum target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceStatusEnum)get_store().find_element_user(STATUS$8, 0);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceStatusEnum)get_store().add_element_user(STATUS$8);
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
            get_store().remove_element(STATUS$8, 0);
        }
    }
    
    /**
     * Gets the "StatusInfo" element
     */
    public java.lang.String getStatusInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSINFO$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "StatusInfo" element
     */
    public org.apache.xmlbeans.XmlString xgetStatusInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSINFO$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "StatusInfo" element
     */
    public boolean isSetStatusInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUSINFO$10) != 0;
        }
    }
    
    /**
     * Sets the "StatusInfo" element
     */
    public void setStatusInfo(java.lang.String statusInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSINFO$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUSINFO$10);
            }
            target.setStringValue(statusInfo);
        }
    }
    
    /**
     * Sets (as xml) the "StatusInfo" element
     */
    public void xsetStatusInfo(org.apache.xmlbeans.XmlString statusInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSINFO$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUSINFO$10);
            }
            target.set(statusInfo);
        }
    }
    
    /**
     * Unsets the "StatusInfo" element
     */
    public void unsetStatusInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUSINFO$10, 0);
        }
    }
    
    /**
     * Gets the "WSDL" element
     */
    public java.lang.String getWSDL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WSDL$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "WSDL" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetWSDL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(WSDL$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "WSDL" element
     */
    public boolean isSetWSDL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WSDL$12) != 0;
        }
    }
    
    /**
     * Sets the "WSDL" element
     */
    public void setWSDL(java.lang.String wsdl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WSDL$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WSDL$12);
            }
            target.setStringValue(wsdl);
        }
    }
    
    /**
     * Sets (as xml) the "WSDL" element
     */
    public void xsetWSDL(org.apache.xmlbeans.XmlAnyURI wsdl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(WSDL$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(WSDL$12);
            }
            target.set(wsdl);
        }
    }
    
    /**
     * Unsets the "WSDL" element
     */
    public void unsetWSDL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WSDL$12, 0);
        }
    }
    
    /**
     * Gets the "Semantics" element
     */
    public java.lang.String getSemantics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEMANTICS$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Semantics" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetSemantics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(SEMANTICS$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "Semantics" element
     */
    public boolean isSetSemantics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEMANTICS$14) != 0;
        }
    }
    
    /**
     * Sets the "Semantics" element
     */
    public void setSemantics(java.lang.String semantics)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEMANTICS$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEMANTICS$14);
            }
            target.setStringValue(semantics);
        }
    }
    
    /**
     * Sets (as xml) the "Semantics" element
     */
    public void xsetSemantics(org.apache.xmlbeans.XmlAnyURI semantics)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(SEMANTICS$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(SEMANTICS$14);
            }
            target.set(semantics);
        }
    }
    
    /**
     * Unsets the "Semantics" element
     */
    public void unsetSemantics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEMANTICS$14, 0);
        }
    }
    
    /**
     * Gets the "StartTime" element
     */
    public java.util.Calendar getStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTTIME$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "StartTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(STARTTIME$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "StartTime" element
     */
    public boolean isSetStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STARTTIME$16) != 0;
        }
    }
    
    /**
     * Sets the "StartTime" element
     */
    public void setStartTime(java.util.Calendar startTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTTIME$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTTIME$16);
            }
            target.setCalendarValue(startTime);
        }
    }
    
    /**
     * Sets (as xml) the "StartTime" element
     */
    public void xsetStartTime(org.apache.xmlbeans.XmlDateTime startTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(STARTTIME$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(STARTTIME$16);
            }
            target.set(startTime);
        }
    }
    
    /**
     * Unsets the "StartTime" element
     */
    public void unsetStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STARTTIME$16, 0);
        }
    }
    
    /**
     * Gets array of all "Owner" elements
     */
    public java.lang.String[] getOwnerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OWNER$18, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "Owner" element
     */
    public java.lang.String getOwnerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNER$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "Owner" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetOwnerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OWNER$18, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "Owner" element
     */
    public org.apache.xmlbeans.XmlString xgetOwnerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OWNER$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "Owner" element
     */
    public int sizeOfOwnerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OWNER$18);
        }
    }
    
    /**
     * Sets array of all "Owner" element
     */
    public void setOwnerArray(java.lang.String[] ownerArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ownerArray, OWNER$18);
        }
    }
    
    /**
     * Sets ith "Owner" element
     */
    public void setOwnerArray(int i, java.lang.String owner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNER$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(owner);
        }
    }
    
    /**
     * Sets (as xml) array of all "Owner" element
     */
    public void xsetOwnerArray(org.apache.xmlbeans.XmlString[]ownerArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ownerArray, OWNER$18);
        }
    }
    
    /**
     * Sets (as xml) ith "Owner" element
     */
    public void xsetOwnerArray(int i, org.apache.xmlbeans.XmlString owner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OWNER$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(owner);
        }
    }
    
    /**
     * Inserts the value as the ith "Owner" element
     */
    public void insertOwner(int i, java.lang.String owner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(OWNER$18, i);
            target.setStringValue(owner);
        }
    }
    
    /**
     * Appends the value as the last "Owner" element
     */
    public void addOwner(java.lang.String owner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OWNER$18);
            target.setStringValue(owner);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Owner" element
     */
    public org.apache.xmlbeans.XmlString insertNewOwner(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(OWNER$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Owner" element
     */
    public org.apache.xmlbeans.XmlString addNewOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OWNER$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "Owner" element
     */
    public void removeOwner(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OWNER$18, i);
        }
    }
    
    /**
     * Gets array of all "Data" elements
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType.Data[] getDataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATA$20, targetList);
            it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType.Data[] result = new it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType.Data[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Data" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType.Data getDataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType.Data target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType.Data)get_store().find_element_user(DATA$20, i);
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
            return get_store().count_elements(DATA$20);
        }
    }
    
    /**
     * Sets array of all "Data" element
     */
    public void setDataArray(it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType.Data[] dataArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataArray, DATA$20);
        }
    }
    
    /**
     * Sets ith "Data" element
     */
    public void setDataArray(int i, it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType.Data data)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType.Data target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType.Data)get_store().find_element_user(DATA$20, i);
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
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType.Data insertNewData(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType.Data target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType.Data)get_store().insert_element_user(DATA$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Data" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType.Data addNewData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType.Data target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType.Data)get_store().add_element_user(DATA$20);
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
            get_store().remove_element(DATA$20, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIQUEID$22);
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
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType)get_store().find_attribute_user(UNIQUEID$22);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIQUEID$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNIQUEID$22);
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
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType)get_store().find_attribute_user(UNIQUEID$22);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType)get_store().add_attribute_user(UNIQUEID$22);
            }
            target.set(uniqueID);
        }
    }
    /**
     * An XML Data(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
     *
     * This is a complex type.
     */
    public static class DataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType.Data
    {
        private static final long serialVersionUID = 1L;
        
        public DataImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName KEY$0 = 
            new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Key");
        private static final javax.xml.namespace.QName VALUE$2 = 
            new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Value");
        
        
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
