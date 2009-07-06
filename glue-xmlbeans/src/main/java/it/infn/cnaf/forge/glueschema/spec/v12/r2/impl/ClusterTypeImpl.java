/*
 * XML Type:  ClusterType
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2.impl;
/**
 * An XML ClusterType(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public class ClusterTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType
{
    private static final long serialVersionUID = 1L;
    
    public ClusterTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Name");
    private static final javax.xml.namespace.QName TMPDIR$2 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "TmpDir");
    private static final javax.xml.namespace.QName WNTMPDIR$4 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "WNTmpDir");
    private static final javax.xml.namespace.QName COMPUTINGELEMENT$6 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "ComputingElement");
    private static final javax.xml.namespace.QName SUBCLUSTER$8 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "SubCluster");
    private static final javax.xml.namespace.QName UNIQUEID$10 = 
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
     * Gets the "TmpDir" element
     */
    public java.lang.String getTmpDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TMPDIR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TmpDir" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType xgetTmpDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType)get_store().find_element_user(TMPDIR$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "TmpDir" element
     */
    public boolean isSetTmpDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TMPDIR$2) != 0;
        }
    }
    
    /**
     * Sets the "TmpDir" element
     */
    public void setTmpDir(java.lang.String tmpDir)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TMPDIR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TMPDIR$2);
            }
            target.setStringValue(tmpDir);
        }
    }
    
    /**
     * Sets (as xml) the "TmpDir" element
     */
    public void xsetTmpDir(it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType tmpDir)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType)get_store().find_element_user(TMPDIR$2, 0);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType)get_store().add_element_user(TMPDIR$2);
            }
            target.set(tmpDir);
        }
    }
    
    /**
     * Unsets the "TmpDir" element
     */
    public void unsetTmpDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TMPDIR$2, 0);
        }
    }
    
    /**
     * Gets the "WNTmpDir" element
     */
    public java.lang.String getWNTmpDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WNTMPDIR$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "WNTmpDir" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType xgetWNTmpDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType)get_store().find_element_user(WNTMPDIR$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "WNTmpDir" element
     */
    public boolean isSetWNTmpDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WNTMPDIR$4) != 0;
        }
    }
    
    /**
     * Sets the "WNTmpDir" element
     */
    public void setWNTmpDir(java.lang.String wnTmpDir)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WNTMPDIR$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WNTMPDIR$4);
            }
            target.setStringValue(wnTmpDir);
        }
    }
    
    /**
     * Sets (as xml) the "WNTmpDir" element
     */
    public void xsetWNTmpDir(it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType wnTmpDir)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType)get_store().find_element_user(WNTMPDIR$4, 0);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.DirType)get_store().add_element_user(WNTMPDIR$4);
            }
            target.set(wnTmpDir);
        }
    }
    
    /**
     * Unsets the "WNTmpDir" element
     */
    public void unsetWNTmpDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WNTMPDIR$4, 0);
        }
    }
    
    /**
     * Gets array of all "ComputingElement" elements
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.ComputingElementType[] getComputingElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMPUTINGELEMENT$6, targetList);
            it.infn.cnaf.forge.glueschema.spec.v12.r2.ComputingElementType[] result = new it.infn.cnaf.forge.glueschema.spec.v12.r2.ComputingElementType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ComputingElement" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.ComputingElementType getComputingElementArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.ComputingElementType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ComputingElementType)get_store().find_element_user(COMPUTINGELEMENT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ComputingElement" element
     */
    public int sizeOfComputingElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPUTINGELEMENT$6);
        }
    }
    
    /**
     * Sets array of all "ComputingElement" element
     */
    public void setComputingElementArray(it.infn.cnaf.forge.glueschema.spec.v12.r2.ComputingElementType[] computingElementArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(computingElementArray, COMPUTINGELEMENT$6);
        }
    }
    
    /**
     * Sets ith "ComputingElement" element
     */
    public void setComputingElementArray(int i, it.infn.cnaf.forge.glueschema.spec.v12.r2.ComputingElementType computingElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.ComputingElementType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ComputingElementType)get_store().find_element_user(COMPUTINGELEMENT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(computingElement);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ComputingElement" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.ComputingElementType insertNewComputingElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.ComputingElementType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ComputingElementType)get_store().insert_element_user(COMPUTINGELEMENT$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ComputingElement" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.ComputingElementType addNewComputingElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.ComputingElementType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ComputingElementType)get_store().add_element_user(COMPUTINGELEMENT$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "ComputingElement" element
     */
    public void removeComputingElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPUTINGELEMENT$6, i);
        }
    }
    
    /**
     * Gets array of all "SubCluster" elements
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType[] getSubClusterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUBCLUSTER$8, targetList);
            it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType[] result = new it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SubCluster" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType getSubClusterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType)get_store().find_element_user(SUBCLUSTER$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SubCluster" element
     */
    public int sizeOfSubClusterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBCLUSTER$8);
        }
    }
    
    /**
     * Sets array of all "SubCluster" element
     */
    public void setSubClusterArray(it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType[] subClusterArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(subClusterArray, SUBCLUSTER$8);
        }
    }
    
    /**
     * Sets ith "SubCluster" element
     */
    public void setSubClusterArray(int i, it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType subCluster)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType)get_store().find_element_user(SUBCLUSTER$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(subCluster);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SubCluster" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType insertNewSubCluster(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType)get_store().insert_element_user(SUBCLUSTER$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SubCluster" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType addNewSubCluster()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.SubClusterType)get_store().add_element_user(SUBCLUSTER$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "SubCluster" element
     */
    public void removeSubCluster(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBCLUSTER$8, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIQUEID$10);
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
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType)get_store().find_attribute_user(UNIQUEID$10);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIQUEID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNIQUEID$10);
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
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType)get_store().find_attribute_user(UNIQUEID$10);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType)get_store().add_attribute_user(UNIQUEID$10);
            }
            target.set(uniqueID);
        }
    }
}
