/*
 * An XML document type.
 * Localname: SoftwarePackage
 * Namespace: http://grid.apac.edu.au/glueschema/Spec/V12/R2
 * Java type: au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageDocument
 *
 * Automatically generated - do not modify.
 */
package au.edu.apac.grid.glueschema.spec.v12.r2.impl;
/**
 * A document containing one SoftwarePackage(@http://grid.apac.edu.au/glueschema/Spec/V12/R2) element.
 *
 * This is a complex type.
 */
public class SoftwarePackageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageDocument
{
    private static final long serialVersionUID = 1L;
    
    public SoftwarePackageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOFTWAREPACKAGE$0 = 
        new javax.xml.namespace.QName("http://grid.apac.edu.au/glueschema/Spec/V12/R2", "SoftwarePackage");
    
    
    /**
     * Gets the "SoftwarePackage" element
     */
    public au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType getSoftwarePackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType target = null;
            target = (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType)get_store().find_element_user(SOFTWAREPACKAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SoftwarePackage" element
     */
    public void setSoftwarePackage(au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType softwarePackage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType target = null;
            target = (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType)get_store().find_element_user(SOFTWAREPACKAGE$0, 0);
            if (target == null)
            {
                target = (au.edu.apac.grid.glueschema.spec.v12.r2.SoftwarePackageType)get_store().add_element_user(SOFTWAREPACKAGE$0);
            }
            target.set(softwarePackage);
        }
    }
    
    /**
     * Appends and returns a new empty "SoftwarePackage" element
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
}
