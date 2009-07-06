/*
 * An XML document type.
 * Localname: Cluster
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterDocument
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2.impl;
/**
 * A document containing one Cluster(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2) element.
 *
 * This is a complex type.
 */
public class ClusterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterDocument
{
    private static final long serialVersionUID = 1L;
    
    public ClusterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLUSTER$0 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Cluster");
    
    
    /**
     * Gets the "Cluster" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType getCluster()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType)get_store().find_element_user(CLUSTER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Cluster" element
     */
    public void setCluster(it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType cluster)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType)get_store().find_element_user(CLUSTER$0, 0);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType)get_store().add_element_user(CLUSTER$0);
            }
            target.set(cluster);
        }
    }
    
    /**
     * Appends and returns a new empty "Cluster" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType addNewCluster()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType)get_store().add_element_user(CLUSTER$0);
            return target;
        }
    }
}
