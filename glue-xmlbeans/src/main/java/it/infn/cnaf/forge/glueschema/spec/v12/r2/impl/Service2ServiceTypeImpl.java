/*
 * XML Type:  Service2ServiceType
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.Service2ServiceType
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2.impl;
/**
 * An XML Service2ServiceType(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public class Service2ServiceTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.infn.cnaf.forge.glueschema.spec.v12.r2.Service2ServiceType
{
    private static final long serialVersionUID = 1L;
    
    public Service2ServiceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICE1UNIQUEID$0 = 
        new javax.xml.namespace.QName("", "Service1UniqueID");
    private static final javax.xml.namespace.QName SERVICE2UNIQUEID$2 = 
        new javax.xml.namespace.QName("", "Service2UniqueID");
    
    
    /**
     * Gets the "Service1UniqueID" attribute
     */
    public java.lang.String getService1UniqueID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVICE1UNIQUEID$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Service1UniqueID" attribute
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType xgetService1UniqueID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType)get_store().find_attribute_user(SERVICE1UNIQUEID$0);
            return target;
        }
    }
    
    /**
     * Sets the "Service1UniqueID" attribute
     */
    public void setService1UniqueID(java.lang.String service1UniqueID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVICE1UNIQUEID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERVICE1UNIQUEID$0);
            }
            target.setStringValue(service1UniqueID);
        }
    }
    
    /**
     * Sets (as xml) the "Service1UniqueID" attribute
     */
    public void xsetService1UniqueID(it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType service1UniqueID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType)get_store().find_attribute_user(SERVICE1UNIQUEID$0);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType)get_store().add_attribute_user(SERVICE1UNIQUEID$0);
            }
            target.set(service1UniqueID);
        }
    }
    
    /**
     * Gets the "Service2UniqueID" attribute
     */
    public java.lang.String getService2UniqueID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVICE2UNIQUEID$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Service2UniqueID" attribute
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType xgetService2UniqueID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType)get_store().find_attribute_user(SERVICE2UNIQUEID$2);
            return target;
        }
    }
    
    /**
     * Sets the "Service2UniqueID" attribute
     */
    public void setService2UniqueID(java.lang.String service2UniqueID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVICE2UNIQUEID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERVICE2UNIQUEID$2);
            }
            target.setStringValue(service2UniqueID);
        }
    }
    
    /**
     * Sets (as xml) the "Service2UniqueID" attribute
     */
    public void xsetService2UniqueID(it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType service2UniqueID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType)get_store().find_attribute_user(SERVICE2UNIQUEID$2);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType)get_store().add_attribute_user(SERVICE2UNIQUEID$2);
            }
            target.set(service2UniqueID);
        }
    }
}
