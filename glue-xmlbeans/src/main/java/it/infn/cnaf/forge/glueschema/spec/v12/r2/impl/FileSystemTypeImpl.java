/*
 * XML Type:  FileSystemType
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2.impl;
/**
 * An XML FileSystemType(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public class FileSystemTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.infn.cnaf.forge.glueschema.spec.v12.r2.FileSystemType
{
    private static final long serialVersionUID = 1L;
    
    public FileSystemTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("", "Name");
    private static final javax.xml.namespace.QName ROOT$2 = 
        new javax.xml.namespace.QName("", "Root");
    private static final javax.xml.namespace.QName SIZE$4 = 
        new javax.xml.namespace.QName("", "Size");
    private static final javax.xml.namespace.QName AVAILABLESPACE$6 = 
        new javax.xml.namespace.QName("", "AvailableSpace");
    private static final javax.xml.namespace.QName READONLY$8 = 
        new javax.xml.namespace.QName("", "ReadOnly");
    private static final javax.xml.namespace.QName TYPE$10 = 
        new javax.xml.namespace.QName("", "Type");
    
    
    /**
     * Gets the "Name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
            return target;
        }
    }
    
    /**
     * True if has "Name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$0) != null;
        }
    }
    
    /**
     * Sets the "Name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "Name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "Name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$0);
        }
    }
    
    /**
     * Gets the "Root" attribute
     */
    public java.lang.String getRoot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROOT$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Root" attribute
     */
    public org.apache.xmlbeans.XmlString xgetRoot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ROOT$2);
            return target;
        }
    }
    
    /**
     * True if has "Root" attribute
     */
    public boolean isSetRoot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ROOT$2) != null;
        }
    }
    
    /**
     * Sets the "Root" attribute
     */
    public void setRoot(java.lang.String root)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROOT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROOT$2);
            }
            target.setStringValue(root);
        }
    }
    
    /**
     * Sets (as xml) the "Root" attribute
     */
    public void xsetRoot(org.apache.xmlbeans.XmlString root)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ROOT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ROOT$2);
            }
            target.set(root);
        }
    }
    
    /**
     * Unsets the "Root" attribute
     */
    public void unsetRoot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ROOT$2);
        }
    }
    
    /**
     * Gets the "Size" attribute
     */
    public java.math.BigInteger getSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIZE$4);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "Size" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SIZE$4);
            return target;
        }
    }
    
    /**
     * True if has "Size" attribute
     */
    public boolean isSetSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SIZE$4) != null;
        }
    }
    
    /**
     * Sets the "Size" attribute
     */
    public void setSize(java.math.BigInteger size)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIZE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SIZE$4);
            }
            target.setBigIntegerValue(size);
        }
    }
    
    /**
     * Sets (as xml) the "Size" attribute
     */
    public void xsetSize(org.apache.xmlbeans.XmlInteger size)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SIZE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SIZE$4);
            }
            target.set(size);
        }
    }
    
    /**
     * Unsets the "Size" attribute
     */
    public void unsetSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SIZE$4);
        }
    }
    
    /**
     * Gets the "AvailableSpace" attribute
     */
    public java.math.BigInteger getAvailableSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AVAILABLESPACE$6);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "AvailableSpace" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetAvailableSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(AVAILABLESPACE$6);
            return target;
        }
    }
    
    /**
     * True if has "AvailableSpace" attribute
     */
    public boolean isSetAvailableSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AVAILABLESPACE$6) != null;
        }
    }
    
    /**
     * Sets the "AvailableSpace" attribute
     */
    public void setAvailableSpace(java.math.BigInteger availableSpace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AVAILABLESPACE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AVAILABLESPACE$6);
            }
            target.setBigIntegerValue(availableSpace);
        }
    }
    
    /**
     * Sets (as xml) the "AvailableSpace" attribute
     */
    public void xsetAvailableSpace(org.apache.xmlbeans.XmlInteger availableSpace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(AVAILABLESPACE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(AVAILABLESPACE$6);
            }
            target.set(availableSpace);
        }
    }
    
    /**
     * Unsets the "AvailableSpace" attribute
     */
    public void unsetAvailableSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AVAILABLESPACE$6);
        }
    }
    
    /**
     * Gets the "ReadOnly" attribute
     */
    public boolean getReadOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(READONLY$8);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReadOnly" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetReadOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(READONLY$8);
            return target;
        }
    }
    
    /**
     * True if has "ReadOnly" attribute
     */
    public boolean isSetReadOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(READONLY$8) != null;
        }
    }
    
    /**
     * Sets the "ReadOnly" attribute
     */
    public void setReadOnly(boolean readOnly)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(READONLY$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(READONLY$8);
            }
            target.setBooleanValue(readOnly);
        }
    }
    
    /**
     * Sets (as xml) the "ReadOnly" attribute
     */
    public void xsetReadOnly(org.apache.xmlbeans.XmlBoolean readOnly)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(READONLY$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(READONLY$8);
            }
            target.set(readOnly);
        }
    }
    
    /**
     * Unsets the "ReadOnly" attribute
     */
    public void unsetReadOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(READONLY$8);
        }
    }
    
    /**
     * Gets the "Type" attribute
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Type" attribute
     */
    public org.apache.xmlbeans.XmlString xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$10);
            return target;
        }
    }
    
    /**
     * True if has "Type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$10) != null;
        }
    }
    
    /**
     * Sets the "Type" attribute
     */
    public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$10);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "Type" attribute
     */
    public void xsetType(org.apache.xmlbeans.XmlString type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$10);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "Type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$10);
        }
    }
}
