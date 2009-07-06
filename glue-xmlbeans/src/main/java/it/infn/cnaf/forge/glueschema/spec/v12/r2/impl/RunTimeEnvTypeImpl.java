/*
 * XML Type:  RunTimeEnvType
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.RunTimeEnvType
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2.impl;
/**
 * An XML RunTimeEnvType(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public class RunTimeEnvTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.infn.cnaf.forge.glueschema.spec.v12.r2.RunTimeEnvType
{
    private static final long serialVersionUID = 1L;
    
    public RunTimeEnvTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VARIABLE$0 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Variable");
    
    
    /**
     * Gets array of all "Variable" elements
     */
    public java.lang.String[] getVariableArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VARIABLE$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "Variable" element
     */
    public java.lang.String getVariableArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VARIABLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "Variable" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetVariableArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VARIABLE$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "Variable" element
     */
    public org.apache.xmlbeans.XmlString xgetVariableArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VARIABLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "Variable" element
     */
    public int sizeOfVariableArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VARIABLE$0);
        }
    }
    
    /**
     * Sets array of all "Variable" element
     */
    public void setVariableArray(java.lang.String[] variableArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(variableArray, VARIABLE$0);
        }
    }
    
    /**
     * Sets ith "Variable" element
     */
    public void setVariableArray(int i, java.lang.String variable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VARIABLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(variable);
        }
    }
    
    /**
     * Sets (as xml) array of all "Variable" element
     */
    public void xsetVariableArray(org.apache.xmlbeans.XmlString[]variableArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(variableArray, VARIABLE$0);
        }
    }
    
    /**
     * Sets (as xml) ith "Variable" element
     */
    public void xsetVariableArray(int i, org.apache.xmlbeans.XmlString variable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VARIABLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(variable);
        }
    }
    
    /**
     * Inserts the value as the ith "Variable" element
     */
    public void insertVariable(int i, java.lang.String variable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(VARIABLE$0, i);
            target.setStringValue(variable);
        }
    }
    
    /**
     * Appends the value as the last "Variable" element
     */
    public void addVariable(java.lang.String variable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VARIABLE$0);
            target.setStringValue(variable);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Variable" element
     */
    public org.apache.xmlbeans.XmlString insertNewVariable(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(VARIABLE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Variable" element
     */
    public org.apache.xmlbeans.XmlString addNewVariable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VARIABLE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Variable" element
     */
    public void removeVariable(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VARIABLE$0, i);
        }
    }
}
