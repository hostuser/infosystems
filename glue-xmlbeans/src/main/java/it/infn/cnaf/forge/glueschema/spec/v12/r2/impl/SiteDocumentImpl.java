/*
 * An XML document type.
 * Localname: Site
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteDocument
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2.impl;
/**
 * A document containing one Site(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2) element.
 *
 * This is a complex type.
 */
public class SiteDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteDocument
{
    private static final long serialVersionUID = 1L;
    
    public SiteDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SITE$0 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Site");
    
    
    /**
     * Gets the "Site" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType getSite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType)get_store().find_element_user(SITE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Site" element
     */
    public void setSite(it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType site)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType)get_store().find_element_user(SITE$0, 0);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType)get_store().add_element_user(SITE$0);
            }
            target.set(site);
        }
    }
    
    /**
     * Appends and returns a new empty "Site" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType addNewSite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType)get_store().add_element_user(SITE$0);
            return target;
        }
    }
}
