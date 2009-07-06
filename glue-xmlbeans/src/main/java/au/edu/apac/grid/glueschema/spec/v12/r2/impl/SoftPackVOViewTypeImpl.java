/*
 * XML Type:  SoftPackVOViewType
 * Namespace: http://grid.apac.edu.au/glueschema/Spec/V12/R2
 * Java type: au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType
 *
 * Automatically generated - do not modify.
 */
package au.edu.apac.grid.glueschema.spec.v12.r2.impl;
/**
 * An XML SoftPackVOViewType(@http://grid.apac.edu.au/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public class SoftPackVOViewTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.edu.apac.grid.glueschema.spec.v12.r2.SoftPackVOViewType
{
    private static final long serialVersionUID = 1L;
    
    public SoftPackVOViewTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACL$0 = 
        new javax.xml.namespace.QName("http://grid.apac.edu.au/glueschema/Spec/V12/R2", "ACL");
    private static final javax.xml.namespace.QName TOTALCPUSEATS$2 = 
        new javax.xml.namespace.QName("http://grid.apac.edu.au/glueschema/Spec/V12/R2", "TotalCPUSeats");
    private static final javax.xml.namespace.QName FREECPUSEATS$4 = 
        new javax.xml.namespace.QName("http://grid.apac.edu.au/glueschema/Spec/V12/R2", "FreeCPUSeats");
    private static final javax.xml.namespace.QName TOTALJOBSEATS$6 = 
        new javax.xml.namespace.QName("http://grid.apac.edu.au/glueschema/Spec/V12/R2", "TotalJobSeats");
    private static final javax.xml.namespace.QName FREEJOBSEATS$8 = 
        new javax.xml.namespace.QName("http://grid.apac.edu.au/glueschema/Spec/V12/R2", "FreeJobSeats");
    private static final javax.xml.namespace.QName TOTALUSERSEATS$10 = 
        new javax.xml.namespace.QName("http://grid.apac.edu.au/glueschema/Spec/V12/R2", "TotalUserSeats");
    private static final javax.xml.namespace.QName FREEUSERSEATS$12 = 
        new javax.xml.namespace.QName("http://grid.apac.edu.au/glueschema/Spec/V12/R2", "FreeUserSeats");
    private static final javax.xml.namespace.QName LOCALID$14 = 
        new javax.xml.namespace.QName("", "LocalID");
    
    
    /**
     * Gets the "ACL" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.ACLType getACL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.ACLType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ACLType)get_store().find_element_user(ACL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ACL" element
     */
    public boolean isSetACL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACL$0) != 0;
        }
    }
    
    /**
     * Sets the "ACL" element
     */
    public void setACL(it.infn.cnaf.forge.glueschema.spec.v12.r2.ACLType acl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.ACLType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ACLType)get_store().find_element_user(ACL$0, 0);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ACLType)get_store().add_element_user(ACL$0);
            }
            target.set(acl);
        }
    }
    
    /**
     * Appends and returns a new empty "ACL" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.ACLType addNewACL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.ACLType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ACLType)get_store().add_element_user(ACL$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ACL" element
     */
    public void unsetACL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACL$0, 0);
        }
    }
    
    /**
     * Gets the "TotalCPUSeats" element
     */
    public java.math.BigInteger getTotalCPUSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALCPUSEATS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "TotalCPUSeats" element
     */
    public org.apache.xmlbeans.XmlInteger xgetTotalCPUSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TOTALCPUSEATS$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "TotalCPUSeats" element
     */
    public boolean isSetTotalCPUSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALCPUSEATS$2) != 0;
        }
    }
    
    /**
     * Sets the "TotalCPUSeats" element
     */
    public void setTotalCPUSeats(java.math.BigInteger totalCPUSeats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALCPUSEATS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALCPUSEATS$2);
            }
            target.setBigIntegerValue(totalCPUSeats);
        }
    }
    
    /**
     * Sets (as xml) the "TotalCPUSeats" element
     */
    public void xsetTotalCPUSeats(org.apache.xmlbeans.XmlInteger totalCPUSeats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TOTALCPUSEATS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(TOTALCPUSEATS$2);
            }
            target.set(totalCPUSeats);
        }
    }
    
    /**
     * Unsets the "TotalCPUSeats" element
     */
    public void unsetTotalCPUSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALCPUSEATS$2, 0);
        }
    }
    
    /**
     * Gets the "FreeCPUSeats" element
     */
    public java.math.BigInteger getFreeCPUSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FREECPUSEATS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "FreeCPUSeats" element
     */
    public org.apache.xmlbeans.XmlInteger xgetFreeCPUSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(FREECPUSEATS$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "FreeCPUSeats" element
     */
    public boolean isSetFreeCPUSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FREECPUSEATS$4) != 0;
        }
    }
    
    /**
     * Sets the "FreeCPUSeats" element
     */
    public void setFreeCPUSeats(java.math.BigInteger freeCPUSeats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FREECPUSEATS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FREECPUSEATS$4);
            }
            target.setBigIntegerValue(freeCPUSeats);
        }
    }
    
    /**
     * Sets (as xml) the "FreeCPUSeats" element
     */
    public void xsetFreeCPUSeats(org.apache.xmlbeans.XmlInteger freeCPUSeats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(FREECPUSEATS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(FREECPUSEATS$4);
            }
            target.set(freeCPUSeats);
        }
    }
    
    /**
     * Unsets the "FreeCPUSeats" element
     */
    public void unsetFreeCPUSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FREECPUSEATS$4, 0);
        }
    }
    
    /**
     * Gets the "TotalJobSeats" element
     */
    public java.math.BigInteger getTotalJobSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALJOBSEATS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "TotalJobSeats" element
     */
    public org.apache.xmlbeans.XmlInteger xgetTotalJobSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TOTALJOBSEATS$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "TotalJobSeats" element
     */
    public boolean isSetTotalJobSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALJOBSEATS$6) != 0;
        }
    }
    
    /**
     * Sets the "TotalJobSeats" element
     */
    public void setTotalJobSeats(java.math.BigInteger totalJobSeats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALJOBSEATS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALJOBSEATS$6);
            }
            target.setBigIntegerValue(totalJobSeats);
        }
    }
    
    /**
     * Sets (as xml) the "TotalJobSeats" element
     */
    public void xsetTotalJobSeats(org.apache.xmlbeans.XmlInteger totalJobSeats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TOTALJOBSEATS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(TOTALJOBSEATS$6);
            }
            target.set(totalJobSeats);
        }
    }
    
    /**
     * Unsets the "TotalJobSeats" element
     */
    public void unsetTotalJobSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALJOBSEATS$6, 0);
        }
    }
    
    /**
     * Gets the "FreeJobSeats" element
     */
    public java.math.BigInteger getFreeJobSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FREEJOBSEATS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "FreeJobSeats" element
     */
    public org.apache.xmlbeans.XmlInteger xgetFreeJobSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(FREEJOBSEATS$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "FreeJobSeats" element
     */
    public boolean isSetFreeJobSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FREEJOBSEATS$8) != 0;
        }
    }
    
    /**
     * Sets the "FreeJobSeats" element
     */
    public void setFreeJobSeats(java.math.BigInteger freeJobSeats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FREEJOBSEATS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FREEJOBSEATS$8);
            }
            target.setBigIntegerValue(freeJobSeats);
        }
    }
    
    /**
     * Sets (as xml) the "FreeJobSeats" element
     */
    public void xsetFreeJobSeats(org.apache.xmlbeans.XmlInteger freeJobSeats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(FREEJOBSEATS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(FREEJOBSEATS$8);
            }
            target.set(freeJobSeats);
        }
    }
    
    /**
     * Unsets the "FreeJobSeats" element
     */
    public void unsetFreeJobSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FREEJOBSEATS$8, 0);
        }
    }
    
    /**
     * Gets the "TotalUserSeats" element
     */
    public java.math.BigInteger getTotalUserSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALUSERSEATS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "TotalUserSeats" element
     */
    public org.apache.xmlbeans.XmlInteger xgetTotalUserSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TOTALUSERSEATS$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "TotalUserSeats" element
     */
    public boolean isSetTotalUserSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALUSERSEATS$10) != 0;
        }
    }
    
    /**
     * Sets the "TotalUserSeats" element
     */
    public void setTotalUserSeats(java.math.BigInteger totalUserSeats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALUSERSEATS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALUSERSEATS$10);
            }
            target.setBigIntegerValue(totalUserSeats);
        }
    }
    
    /**
     * Sets (as xml) the "TotalUserSeats" element
     */
    public void xsetTotalUserSeats(org.apache.xmlbeans.XmlInteger totalUserSeats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TOTALUSERSEATS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(TOTALUSERSEATS$10);
            }
            target.set(totalUserSeats);
        }
    }
    
    /**
     * Unsets the "TotalUserSeats" element
     */
    public void unsetTotalUserSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALUSERSEATS$10, 0);
        }
    }
    
    /**
     * Gets the "FreeUserSeats" element
     */
    public java.math.BigInteger getFreeUserSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FREEUSERSEATS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "FreeUserSeats" element
     */
    public org.apache.xmlbeans.XmlInteger xgetFreeUserSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(FREEUSERSEATS$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "FreeUserSeats" element
     */
    public boolean isSetFreeUserSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FREEUSERSEATS$12) != 0;
        }
    }
    
    /**
     * Sets the "FreeUserSeats" element
     */
    public void setFreeUserSeats(java.math.BigInteger freeUserSeats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FREEUSERSEATS$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FREEUSERSEATS$12);
            }
            target.setBigIntegerValue(freeUserSeats);
        }
    }
    
    /**
     * Sets (as xml) the "FreeUserSeats" element
     */
    public void xsetFreeUserSeats(org.apache.xmlbeans.XmlInteger freeUserSeats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(FREEUSERSEATS$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(FREEUSERSEATS$12);
            }
            target.set(freeUserSeats);
        }
    }
    
    /**
     * Unsets the "FreeUserSeats" element
     */
    public void unsetFreeUserSeats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FREEUSERSEATS$12, 0);
        }
    }
    
    /**
     * Gets the "LocalID" attribute
     */
    public java.lang.String getLocalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCALID$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LocalID" attribute
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.LocalIDType xgetLocalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.LocalIDType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.LocalIDType)get_store().find_attribute_user(LOCALID$14);
            return target;
        }
    }
    
    /**
     * Sets the "LocalID" attribute
     */
    public void setLocalID(java.lang.String localID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCALID$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCALID$14);
            }
            target.setStringValue(localID);
        }
    }
    
    /**
     * Sets (as xml) the "LocalID" attribute
     */
    public void xsetLocalID(it.infn.cnaf.forge.glueschema.spec.v12.r2.LocalIDType localID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.LocalIDType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.LocalIDType)get_store().find_attribute_user(LOCALID$14);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.LocalIDType)get_store().add_attribute_user(LOCALID$14);
            }
            target.set(localID);
        }
    }
}
