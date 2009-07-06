/*
 * An XML document type.
 * Localname: Service
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceDocument
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2.impl;
/**
 * A document containing one Service(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2) element.
 *
 * This is a complex type.
 */
public class ServiceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceDocument
{
    private static final long serialVersionUID = 1L;
    
    public ServiceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICE$0 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Service");
    
    
    /**
     * Gets the "Service" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType getService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType)get_store().find_element_user(SERVICE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Service" element
     */
    public void setService(it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType service)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType)get_store().find_element_user(SERVICE$0, 0);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType)get_store().add_element_user(SERVICE$0);
            }
            target.set(service);
        }
    }
    
    /**
     * Appends and returns a new empty "Service" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType addNewService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType)get_store().add_element_user(SERVICE$0);
            return target;
        }
    }
}
