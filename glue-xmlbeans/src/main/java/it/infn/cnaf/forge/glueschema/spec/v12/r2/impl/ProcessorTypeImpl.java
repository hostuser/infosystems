/*
 * XML Type:  ProcessorType
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2.impl;
/**
 * An XML ProcessorType(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public class ProcessorTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.infn.cnaf.forge.glueschema.spec.v12.r2.ProcessorType
{
    private static final long serialVersionUID = 1L;
    
    public ProcessorTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VENDOR$0 = 
        new javax.xml.namespace.QName("", "Vendor");
    private static final javax.xml.namespace.QName MODEL$2 = 
        new javax.xml.namespace.QName("", "Model");
    private static final javax.xml.namespace.QName CLOCKSPEED$4 = 
        new javax.xml.namespace.QName("", "ClockSpeed");
    private static final javax.xml.namespace.QName INSTRUCTIONSET$6 = 
        new javax.xml.namespace.QName("", "InstructionSet");
    private static final javax.xml.namespace.QName OTHERDESCRIPTION$8 = 
        new javax.xml.namespace.QName("", "OtherDescription");
    
    
    /**
     * Gets the "Vendor" attribute
     */
    public java.lang.String getVendor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VENDOR$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Vendor" attribute
     */
    public org.apache.xmlbeans.XmlString xgetVendor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VENDOR$0);
            return target;
        }
    }
    
    /**
     * True if has "Vendor" attribute
     */
    public boolean isSetVendor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VENDOR$0) != null;
        }
    }
    
    /**
     * Sets the "Vendor" attribute
     */
    public void setVendor(java.lang.String vendor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VENDOR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VENDOR$0);
            }
            target.setStringValue(vendor);
        }
    }
    
    /**
     * Sets (as xml) the "Vendor" attribute
     */
    public void xsetVendor(org.apache.xmlbeans.XmlString vendor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VENDOR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VENDOR$0);
            }
            target.set(vendor);
        }
    }
    
    /**
     * Unsets the "Vendor" attribute
     */
    public void unsetVendor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VENDOR$0);
        }
    }
    
    /**
     * Gets the "Model" attribute
     */
    public java.lang.String getModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODEL$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Model" attribute
     */
    public org.apache.xmlbeans.XmlString xgetModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MODEL$2);
            return target;
        }
    }
    
    /**
     * True if has "Model" attribute
     */
    public boolean isSetModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MODEL$2) != null;
        }
    }
    
    /**
     * Sets the "Model" attribute
     */
    public void setModel(java.lang.String model)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODEL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MODEL$2);
            }
            target.setStringValue(model);
        }
    }
    
    /**
     * Sets (as xml) the "Model" attribute
     */
    public void xsetModel(org.apache.xmlbeans.XmlString model)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MODEL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MODEL$2);
            }
            target.set(model);
        }
    }
    
    /**
     * Unsets the "Model" attribute
     */
    public void unsetModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MODEL$2);
        }
    }
    
    /**
     * Gets the "ClockSpeed" attribute
     */
    public java.math.BigInteger getClockSpeed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLOCKSPEED$4);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "ClockSpeed" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetClockSpeed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CLOCKSPEED$4);
            return target;
        }
    }
    
    /**
     * True if has "ClockSpeed" attribute
     */
    public boolean isSetClockSpeed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CLOCKSPEED$4) != null;
        }
    }
    
    /**
     * Sets the "ClockSpeed" attribute
     */
    public void setClockSpeed(java.math.BigInteger clockSpeed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLOCKSPEED$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLOCKSPEED$4);
            }
            target.setBigIntegerValue(clockSpeed);
        }
    }
    
    /**
     * Sets (as xml) the "ClockSpeed" attribute
     */
    public void xsetClockSpeed(org.apache.xmlbeans.XmlInteger clockSpeed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CLOCKSPEED$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(CLOCKSPEED$4);
            }
            target.set(clockSpeed);
        }
    }
    
    /**
     * Unsets the "ClockSpeed" attribute
     */
    public void unsetClockSpeed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CLOCKSPEED$4);
        }
    }
    
    /**
     * Gets the "InstructionSet" attribute
     */
    public java.lang.String getInstructionSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSTRUCTIONSET$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "InstructionSet" attribute
     */
    public org.apache.xmlbeans.XmlString xgetInstructionSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INSTRUCTIONSET$6);
            return target;
        }
    }
    
    /**
     * True if has "InstructionSet" attribute
     */
    public boolean isSetInstructionSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INSTRUCTIONSET$6) != null;
        }
    }
    
    /**
     * Sets the "InstructionSet" attribute
     */
    public void setInstructionSet(java.lang.String instructionSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSTRUCTIONSET$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INSTRUCTIONSET$6);
            }
            target.setStringValue(instructionSet);
        }
    }
    
    /**
     * Sets (as xml) the "InstructionSet" attribute
     */
    public void xsetInstructionSet(org.apache.xmlbeans.XmlString instructionSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INSTRUCTIONSET$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(INSTRUCTIONSET$6);
            }
            target.set(instructionSet);
        }
    }
    
    /**
     * Unsets the "InstructionSet" attribute
     */
    public void unsetInstructionSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INSTRUCTIONSET$6);
        }
    }
    
    /**
     * Gets the "OtherDescription" attribute
     */
    public java.lang.String getOtherDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OTHERDESCRIPTION$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OtherDescription" attribute
     */
    public org.apache.xmlbeans.XmlString xgetOtherDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OTHERDESCRIPTION$8);
            return target;
        }
    }
    
    /**
     * True if has "OtherDescription" attribute
     */
    public boolean isSetOtherDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OTHERDESCRIPTION$8) != null;
        }
    }
    
    /**
     * Sets the "OtherDescription" attribute
     */
    public void setOtherDescription(java.lang.String otherDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OTHERDESCRIPTION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OTHERDESCRIPTION$8);
            }
            target.setStringValue(otherDescription);
        }
    }
    
    /**
     * Sets (as xml) the "OtherDescription" attribute
     */
    public void xsetOtherDescription(org.apache.xmlbeans.XmlString otherDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OTHERDESCRIPTION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OTHERDESCRIPTION$8);
            }
            target.set(otherDescription);
        }
    }
    
    /**
     * Unsets the "OtherDescription" attribute
     */
    public void unsetOtherDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OTHERDESCRIPTION$8);
        }
    }
}
