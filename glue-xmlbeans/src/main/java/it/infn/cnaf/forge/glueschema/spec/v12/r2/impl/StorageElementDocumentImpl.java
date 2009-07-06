/*
 * An XML document type.
 * Localname: StorageElement
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementDocument
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2.impl;
/**
 * A document containing one StorageElement(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2) element.
 *
 * This is a complex type.
 */
public class StorageElementDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementDocument
{
    private static final long serialVersionUID = 1L;
    
    public StorageElementDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STORAGEELEMENT$0 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "StorageElement");
    
    
    /**
     * Gets the "StorageElement" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType getStorageElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType)get_store().find_element_user(STORAGEELEMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StorageElement" element
     */
    public void setStorageElement(it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType storageElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType)get_store().find_element_user(STORAGEELEMENT$0, 0);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType)get_store().add_element_user(STORAGEELEMENT$0);
            }
            target.set(storageElement);
        }
    }
    
    /**
     * Appends and returns a new empty "StorageElement" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType addNewStorageElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType)get_store().add_element_user(STORAGEELEMENT$0);
            return target;
        }
    }
}
