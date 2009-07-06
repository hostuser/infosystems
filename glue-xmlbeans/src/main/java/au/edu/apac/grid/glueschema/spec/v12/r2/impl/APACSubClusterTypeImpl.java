/*
 * XML Type:  APACSubClusterType
 * Namespace: http://grid.apac.edu.au/glueschema/Spec/V12/R2
 * Java type: au.edu.apac.grid.glueschema.spec.v12.r2.APACSubClusterType
 *
 * Automatically generated - do not modify.
 */
package au.edu.apac.grid.glueschema.spec.v12.r2.impl;
/**
 * An XML APACSubClusterType(@http://grid.apac.edu.au/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public class APACSubClusterTypeImpl extends it.infn.cnaf.forge.glueschema.spec.v12.r2.impl.SubClusterTypeImpl implements au.edu.apac.grid.glueschema.spec.v12.r2.APACSubClusterType
{
    private static final long serialVersionUID = 1L;
    
    public APACSubClusterTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOFTWAREPACKAGE$0 = 
        new javax.xml.namespace.QName("http://grid.apac.edu.au/glueschema/Spec/V12/R2", "SoftwarePackage");
    
    
    /**
     * Gets array of all "SoftwarePackage" elements
     */
    public au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType[] getSoftwarePackageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SOFTWAREPACKAGE$0, targetList);
            au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType[] result = new au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SoftwarePackage" element
     */
    public au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType getSoftwarePackageArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType target = null;
            target = (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType)get_store().find_element_user(SOFTWAREPACKAGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SoftwarePackage" element
     */
    public int sizeOfSoftwarePackageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOFTWAREPACKAGE$0);
        }
    }
    
    /**
     * Sets array of all "SoftwarePackage" element
     */
    public void setSoftwarePackageArray(au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType[] softwarePackageArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(softwarePackageArray, SOFTWAREPACKAGE$0);
        }
    }
    
    /**
     * Sets ith "SoftwarePackage" element
     */
    public void setSoftwarePackageArray(int i, au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType softwarePackage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType target = null;
            target = (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType)get_store().find_element_user(SOFTWAREPACKAGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(softwarePackage);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SoftwarePackage" element
     */
    public au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType insertNewSoftwarePackage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType target = null;
            target = (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType)get_store().insert_element_user(SOFTWAREPACKAGE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SoftwarePackage" element
     */
    public au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType addNewSoftwarePackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType target = null;
            target = (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType)get_store().add_element_user(SOFTWAREPACKAGE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "SoftwarePackage" element
     */
    public void removeSoftwarePackage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOFTWAREPACKAGE$0, i);
        }
    }
}
