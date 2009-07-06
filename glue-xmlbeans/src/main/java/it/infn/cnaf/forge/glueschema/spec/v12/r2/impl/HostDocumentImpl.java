/*
 * An XML document type.
 * Localname: Host
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.HostDocument
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2.impl;
/**
 * A document containing one Host(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2) element.
 *
 * This is a complex type.
 */
public class HostDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.infn.cnaf.forge.glueschema.spec.v12.r2.HostDocument
{
    private static final long serialVersionUID = 1L;
    
    public HostDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HOST$0 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Host");
    
    
    /**
     * Gets the "Host" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType getHost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType)get_store().find_element_user(HOST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Host" element
     */
    public void setHost(it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType host)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType)get_store().find_element_user(HOST$0, 0);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType)get_store().add_element_user(HOST$0);
            }
            target.set(host);
        }
    }
    
    /**
     * Appends and returns a new empty "Host" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType addNewHost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType)get_store().add_element_user(HOST$0);
            return target;
        }
    }
}
