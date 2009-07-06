/*
 * XML Type:  ACLType
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.ACLType
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2.impl;
/**
 * An XML ACLType(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public class ACLTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.infn.cnaf.forge.glueschema.spec.v12.r2.ACLType
{
    private static final long serialVersionUID = 1L;
    
    public ACLTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RULE$0 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Rule");
    
    
    /**
     * Gets array of all "Rule" elements
     */
    public java.lang.String[] getRuleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RULE$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "Rule" element
     */
    public java.lang.String getRuleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RULE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "Rule" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetRuleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RULE$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "Rule" element
     */
    public org.apache.xmlbeans.XmlString xgetRuleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RULE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "Rule" element
     */
    public int sizeOfRuleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RULE$0);
        }
    }
    
    /**
     * Sets array of all "Rule" element
     */
    public void setRuleArray(java.lang.String[] ruleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ruleArray, RULE$0);
        }
    }
    
    /**
     * Sets ith "Rule" element
     */
    public void setRuleArray(int i, java.lang.String rule)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RULE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(rule);
        }
    }
    
    /**
     * Sets (as xml) array of all "Rule" element
     */
    public void xsetRuleArray(org.apache.xmlbeans.XmlString[]ruleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ruleArray, RULE$0);
        }
    }
    
    /**
     * Sets (as xml) ith "Rule" element
     */
    public void xsetRuleArray(int i, org.apache.xmlbeans.XmlString rule)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RULE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rule);
        }
    }
    
    /**
     * Inserts the value as the ith "Rule" element
     */
    public void insertRule(int i, java.lang.String rule)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(RULE$0, i);
            target.setStringValue(rule);
        }
    }
    
    /**
     * Appends the value as the last "Rule" element
     */
    public void addRule(java.lang.String rule)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RULE$0);
            target.setStringValue(rule);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Rule" element
     */
    public org.apache.xmlbeans.XmlString insertNewRule(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(RULE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Rule" element
     */
    public org.apache.xmlbeans.XmlString addNewRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RULE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Rule" element
     */
    public void removeRule(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RULE$0, i);
        }
    }
}
