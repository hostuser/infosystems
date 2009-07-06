/*
 * XML Type:  SiteType
 * Namespace: http://forge.cnaf.infn.it/glueschema/Spec/V12/R2
 * Java type: it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType
 *
 * Automatically generated - do not modify.
 */
package it.infn.cnaf.forge.glueschema.spec.v12.r2.impl;
/**
 * An XML SiteType(@http://forge.cnaf.infn.it/glueschema/Spec/V12/R2).
 *
 * This is a complex type.
 */
public class SiteTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.infn.cnaf.forge.glueschema.spec.v12.r2.SiteType
{
    private static final long serialVersionUID = 1L;
    
    public SiteTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Name");
    private static final javax.xml.namespace.QName DESCRIPTION$2 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Description");
    private static final javax.xml.namespace.QName USERSUPPORTCONTACT$4 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "UserSupportContact");
    private static final javax.xml.namespace.QName SYSADMINCONTACT$6 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "SysAdminContact");
    private static final javax.xml.namespace.QName SECURITYCONTACT$8 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "SecurityContact");
    private static final javax.xml.namespace.QName LOCATION$10 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Location");
    private static final javax.xml.namespace.QName LATITUDE$12 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Latitude");
    private static final javax.xml.namespace.QName LONGITUDE$14 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Longitude");
    private static final javax.xml.namespace.QName WEB$16 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Web");
    private static final javax.xml.namespace.QName SPONSOR$18 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Sponsor");
    private static final javax.xml.namespace.QName OTHERINFO$20 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "OtherInfo");
    private static final javax.xml.namespace.QName CLUSTER$22 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Cluster");
    private static final javax.xml.namespace.QName STORAGEELEMENT$24 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "StorageElement");
    private static final javax.xml.namespace.QName SERVICE$26 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Service");
    private static final javax.xml.namespace.QName CESEBIND$28 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "CESEBind");
    private static final javax.xml.namespace.QName SERVICE2SERVICE$30 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Service2Service");
    private static final javax.xml.namespace.QName HOST$32 = 
        new javax.xml.namespace.QName("http://forge.cnaf.infn.it/glueschema/Spec/V12/R2", "Host");
    private static final javax.xml.namespace.QName UNIQUEID$34 = 
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
     * Gets the "Description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$2) != 0;
        }
    }
    
    /**
     * Sets the "Description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$2);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "Description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$2);
            }
            target.set(description);
        }
    }
    
    /**
     * Unsets the "Description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$2, 0);
        }
    }
    
    /**
     * Gets the "UserSupportContact" element
     */
    public java.lang.String getUserSupportContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERSUPPORTCONTACT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "UserSupportContact" element
     */
    public org.apache.xmlbeans.XmlString xgetUserSupportContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERSUPPORTCONTACT$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "UserSupportContact" element
     */
    public boolean isSetUserSupportContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USERSUPPORTCONTACT$4) != 0;
        }
    }
    
    /**
     * Sets the "UserSupportContact" element
     */
    public void setUserSupportContact(java.lang.String userSupportContact)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERSUPPORTCONTACT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERSUPPORTCONTACT$4);
            }
            target.setStringValue(userSupportContact);
        }
    }
    
    /**
     * Sets (as xml) the "UserSupportContact" element
     */
    public void xsetUserSupportContact(org.apache.xmlbeans.XmlString userSupportContact)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERSUPPORTCONTACT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERSUPPORTCONTACT$4);
            }
            target.set(userSupportContact);
        }
    }
    
    /**
     * Unsets the "UserSupportContact" element
     */
    public void unsetUserSupportContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USERSUPPORTCONTACT$4, 0);
        }
    }
    
    /**
     * Gets the "SysAdminContact" element
     */
    public java.lang.String getSysAdminContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYSADMINCONTACT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SysAdminContact" element
     */
    public org.apache.xmlbeans.XmlString xgetSysAdminContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SYSADMINCONTACT$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "SysAdminContact" element
     */
    public boolean isSetSysAdminContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SYSADMINCONTACT$6) != 0;
        }
    }
    
    /**
     * Sets the "SysAdminContact" element
     */
    public void setSysAdminContact(java.lang.String sysAdminContact)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYSADMINCONTACT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SYSADMINCONTACT$6);
            }
            target.setStringValue(sysAdminContact);
        }
    }
    
    /**
     * Sets (as xml) the "SysAdminContact" element
     */
    public void xsetSysAdminContact(org.apache.xmlbeans.XmlString sysAdminContact)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SYSADMINCONTACT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SYSADMINCONTACT$6);
            }
            target.set(sysAdminContact);
        }
    }
    
    /**
     * Unsets the "SysAdminContact" element
     */
    public void unsetSysAdminContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SYSADMINCONTACT$6, 0);
        }
    }
    
    /**
     * Gets the "SecurityContact" element
     */
    public java.lang.String getSecurityContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECURITYCONTACT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SecurityContact" element
     */
    public org.apache.xmlbeans.XmlString xgetSecurityContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SECURITYCONTACT$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "SecurityContact" element
     */
    public boolean isSetSecurityContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECURITYCONTACT$8) != 0;
        }
    }
    
    /**
     * Sets the "SecurityContact" element
     */
    public void setSecurityContact(java.lang.String securityContact)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECURITYCONTACT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECURITYCONTACT$8);
            }
            target.setStringValue(securityContact);
        }
    }
    
    /**
     * Sets (as xml) the "SecurityContact" element
     */
    public void xsetSecurityContact(org.apache.xmlbeans.XmlString securityContact)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SECURITYCONTACT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SECURITYCONTACT$8);
            }
            target.set(securityContact);
        }
    }
    
    /**
     * Unsets the "SecurityContact" element
     */
    public void unsetSecurityContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECURITYCONTACT$8, 0);
        }
    }
    
    /**
     * Gets the "Location" element
     */
    public java.lang.String getLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATION$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Location" element
     */
    public org.apache.xmlbeans.XmlString xgetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCATION$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "Location" element
     */
    public boolean isSetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATION$10) != 0;
        }
    }
    
    /**
     * Sets the "Location" element
     */
    public void setLocation(java.lang.String location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATION$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCATION$10);
            }
            target.setStringValue(location);
        }
    }
    
    /**
     * Sets (as xml) the "Location" element
     */
    public void xsetLocation(org.apache.xmlbeans.XmlString location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCATION$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOCATION$10);
            }
            target.set(location);
        }
    }
    
    /**
     * Unsets the "Location" element
     */
    public void unsetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATION$10, 0);
        }
    }
    
    /**
     * Gets the "Latitude" element
     */
    public double getLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATITUDE$12, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "Latitude" element
     */
    public org.apache.xmlbeans.XmlDouble xgetLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(LATITUDE$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "Latitude" element
     */
    public boolean isSetLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LATITUDE$12) != 0;
        }
    }
    
    /**
     * Sets the "Latitude" element
     */
    public void setLatitude(double latitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATITUDE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LATITUDE$12);
            }
            target.setDoubleValue(latitude);
        }
    }
    
    /**
     * Sets (as xml) the "Latitude" element
     */
    public void xsetLatitude(org.apache.xmlbeans.XmlDouble latitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(LATITUDE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(LATITUDE$12);
            }
            target.set(latitude);
        }
    }
    
    /**
     * Unsets the "Latitude" element
     */
    public void unsetLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LATITUDE$12, 0);
        }
    }
    
    /**
     * Gets the "Longitude" element
     */
    public double getLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGITUDE$14, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "Longitude" element
     */
    public org.apache.xmlbeans.XmlDouble xgetLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(LONGITUDE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "Longitude" element
     */
    public boolean isSetLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LONGITUDE$14) != 0;
        }
    }
    
    /**
     * Sets the "Longitude" element
     */
    public void setLongitude(double longitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGITUDE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LONGITUDE$14);
            }
            target.setDoubleValue(longitude);
        }
    }
    
    /**
     * Sets (as xml) the "Longitude" element
     */
    public void xsetLongitude(org.apache.xmlbeans.XmlDouble longitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(LONGITUDE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(LONGITUDE$14);
            }
            target.set(longitude);
        }
    }
    
    /**
     * Unsets the "Longitude" element
     */
    public void unsetLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LONGITUDE$14, 0);
        }
    }
    
    /**
     * Gets the "Web" element
     */
    public java.lang.String getWeb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEB$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Web" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetWeb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(WEB$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "Web" element
     */
    public boolean isSetWeb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WEB$16) != 0;
        }
    }
    
    /**
     * Sets the "Web" element
     */
    public void setWeb(java.lang.String web)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEB$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WEB$16);
            }
            target.setStringValue(web);
        }
    }
    
    /**
     * Sets (as xml) the "Web" element
     */
    public void xsetWeb(org.apache.xmlbeans.XmlAnyURI web)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(WEB$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(WEB$16);
            }
            target.set(web);
        }
    }
    
    /**
     * Unsets the "Web" element
     */
    public void unsetWeb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WEB$16, 0);
        }
    }
    
    /**
     * Gets array of all "Sponsor" elements
     */
    public java.lang.String[] getSponsorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SPONSOR$18, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "Sponsor" element
     */
    public java.lang.String getSponsorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPONSOR$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "Sponsor" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetSponsorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SPONSOR$18, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "Sponsor" element
     */
    public org.apache.xmlbeans.XmlString xgetSponsorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SPONSOR$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "Sponsor" element
     */
    public int sizeOfSponsorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPONSOR$18);
        }
    }
    
    /**
     * Sets array of all "Sponsor" element
     */
    public void setSponsorArray(java.lang.String[] sponsorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sponsorArray, SPONSOR$18);
        }
    }
    
    /**
     * Sets ith "Sponsor" element
     */
    public void setSponsorArray(int i, java.lang.String sponsor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPONSOR$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(sponsor);
        }
    }
    
    /**
     * Sets (as xml) array of all "Sponsor" element
     */
    public void xsetSponsorArray(org.apache.xmlbeans.XmlString[]sponsorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sponsorArray, SPONSOR$18);
        }
    }
    
    /**
     * Sets (as xml) ith "Sponsor" element
     */
    public void xsetSponsorArray(int i, org.apache.xmlbeans.XmlString sponsor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SPONSOR$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sponsor);
        }
    }
    
    /**
     * Inserts the value as the ith "Sponsor" element
     */
    public void insertSponsor(int i, java.lang.String sponsor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SPONSOR$18, i);
            target.setStringValue(sponsor);
        }
    }
    
    /**
     * Appends the value as the last "Sponsor" element
     */
    public void addSponsor(java.lang.String sponsor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SPONSOR$18);
            target.setStringValue(sponsor);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Sponsor" element
     */
    public org.apache.xmlbeans.XmlString insertNewSponsor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(SPONSOR$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Sponsor" element
     */
    public org.apache.xmlbeans.XmlString addNewSponsor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SPONSOR$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "Sponsor" element
     */
    public void removeSponsor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPONSOR$18, i);
        }
    }
    
    /**
     * Gets array of all "OtherInfo" elements
     */
    public java.lang.String[] getOtherInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OTHERINFO$20, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "OtherInfo" element
     */
    public java.lang.String getOtherInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OTHERINFO$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "OtherInfo" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetOtherInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OTHERINFO$20, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "OtherInfo" element
     */
    public org.apache.xmlbeans.XmlString xgetOtherInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OTHERINFO$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "OtherInfo" element
     */
    public int sizeOfOtherInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OTHERINFO$20);
        }
    }
    
    /**
     * Sets array of all "OtherInfo" element
     */
    public void setOtherInfoArray(java.lang.String[] otherInfoArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(otherInfoArray, OTHERINFO$20);
        }
    }
    
    /**
     * Sets ith "OtherInfo" element
     */
    public void setOtherInfoArray(int i, java.lang.String otherInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OTHERINFO$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(otherInfo);
        }
    }
    
    /**
     * Sets (as xml) array of all "OtherInfo" element
     */
    public void xsetOtherInfoArray(org.apache.xmlbeans.XmlString[]otherInfoArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(otherInfoArray, OTHERINFO$20);
        }
    }
    
    /**
     * Sets (as xml) ith "OtherInfo" element
     */
    public void xsetOtherInfoArray(int i, org.apache.xmlbeans.XmlString otherInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OTHERINFO$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(otherInfo);
        }
    }
    
    /**
     * Inserts the value as the ith "OtherInfo" element
     */
    public void insertOtherInfo(int i, java.lang.String otherInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(OTHERINFO$20, i);
            target.setStringValue(otherInfo);
        }
    }
    
    /**
     * Appends the value as the last "OtherInfo" element
     */
    public void addOtherInfo(java.lang.String otherInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OTHERINFO$20);
            target.setStringValue(otherInfo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OtherInfo" element
     */
    public org.apache.xmlbeans.XmlString insertNewOtherInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(OTHERINFO$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OtherInfo" element
     */
    public org.apache.xmlbeans.XmlString addNewOtherInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OTHERINFO$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "OtherInfo" element
     */
    public void removeOtherInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OTHERINFO$20, i);
        }
    }
    
    /**
     * Gets array of all "Cluster" elements
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType[] getClusterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CLUSTER$22, targetList);
            it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType[] result = new it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Cluster" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType getClusterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType)get_store().find_element_user(CLUSTER$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Cluster" element
     */
    public int sizeOfClusterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLUSTER$22);
        }
    }
    
    /**
     * Sets array of all "Cluster" element
     */
    public void setClusterArray(it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType[] clusterArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(clusterArray, CLUSTER$22);
        }
    }
    
    /**
     * Sets ith "Cluster" element
     */
    public void setClusterArray(int i, it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType cluster)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType)get_store().find_element_user(CLUSTER$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(cluster);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Cluster" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType insertNewCluster(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType)get_store().insert_element_user(CLUSTER$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Cluster" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType addNewCluster()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ClusterType)get_store().add_element_user(CLUSTER$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "Cluster" element
     */
    public void removeCluster(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLUSTER$22, i);
        }
    }
    
    /**
     * Gets array of all "StorageElement" elements
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType[] getStorageElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STORAGEELEMENT$24, targetList);
            it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType[] result = new it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "StorageElement" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType getStorageElementArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType)get_store().find_element_user(STORAGEELEMENT$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "StorageElement" element
     */
    public int sizeOfStorageElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STORAGEELEMENT$24);
        }
    }
    
    /**
     * Sets array of all "StorageElement" element
     */
    public void setStorageElementArray(it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType[] storageElementArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(storageElementArray, STORAGEELEMENT$24);
        }
    }
    
    /**
     * Sets ith "StorageElement" element
     */
    public void setStorageElementArray(int i, it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType storageElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType)get_store().find_element_user(STORAGEELEMENT$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(storageElement);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StorageElement" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType insertNewStorageElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType)get_store().insert_element_user(STORAGEELEMENT$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StorageElement" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType addNewStorageElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.StorageElementType)get_store().add_element_user(STORAGEELEMENT$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "StorageElement" element
     */
    public void removeStorageElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STORAGEELEMENT$24, i);
        }
    }
    
    /**
     * Gets array of all "Service" elements
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType[] getServiceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SERVICE$26, targetList);
            it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType[] result = new it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Service" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType getServiceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType)get_store().find_element_user(SERVICE$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Service" element
     */
    public int sizeOfServiceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICE$26);
        }
    }
    
    /**
     * Sets array of all "Service" element
     */
    public void setServiceArray(it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType[] serviceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(serviceArray, SERVICE$26);
        }
    }
    
    /**
     * Sets ith "Service" element
     */
    public void setServiceArray(int i, it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType service)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType)get_store().find_element_user(SERVICE$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(service);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Service" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType insertNewService(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType)get_store().insert_element_user(SERVICE$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Service" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType addNewService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.ServiceType)get_store().add_element_user(SERVICE$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "Service" element
     */
    public void removeService(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICE$26, i);
        }
    }
    
    /**
     * Gets array of all "CESEBind" elements
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.CESEBindType[] getCESEBindArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CESEBIND$28, targetList);
            it.infn.cnaf.forge.glueschema.spec.v12.r2.CESEBindType[] result = new it.infn.cnaf.forge.glueschema.spec.v12.r2.CESEBindType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CESEBind" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.CESEBindType getCESEBindArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.CESEBindType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.CESEBindType)get_store().find_element_user(CESEBIND$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "CESEBind" element
     */
    public int sizeOfCESEBindArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CESEBIND$28);
        }
    }
    
    /**
     * Sets array of all "CESEBind" element
     */
    public void setCESEBindArray(it.infn.cnaf.forge.glueschema.spec.v12.r2.CESEBindType[] ceseBindArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ceseBindArray, CESEBIND$28);
        }
    }
    
    /**
     * Sets ith "CESEBind" element
     */
    public void setCESEBindArray(int i, it.infn.cnaf.forge.glueschema.spec.v12.r2.CESEBindType ceseBind)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.CESEBindType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.CESEBindType)get_store().find_element_user(CESEBIND$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ceseBind);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CESEBind" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.CESEBindType insertNewCESEBind(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.CESEBindType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.CESEBindType)get_store().insert_element_user(CESEBIND$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CESEBind" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.CESEBindType addNewCESEBind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.CESEBindType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.CESEBindType)get_store().add_element_user(CESEBIND$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "CESEBind" element
     */
    public void removeCESEBind(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CESEBIND$28, i);
        }
    }
    
    /**
     * Gets array of all "Service2Service" elements
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.Service2ServiceType[] getService2ServiceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SERVICE2SERVICE$30, targetList);
            it.infn.cnaf.forge.glueschema.spec.v12.r2.Service2ServiceType[] result = new it.infn.cnaf.forge.glueschema.spec.v12.r2.Service2ServiceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Service2Service" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.Service2ServiceType getService2ServiceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.Service2ServiceType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.Service2ServiceType)get_store().find_element_user(SERVICE2SERVICE$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Service2Service" element
     */
    public int sizeOfService2ServiceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICE2SERVICE$30);
        }
    }
    
    /**
     * Sets array of all "Service2Service" element
     */
    public void setService2ServiceArray(it.infn.cnaf.forge.glueschema.spec.v12.r2.Service2ServiceType[] service2ServiceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(service2ServiceArray, SERVICE2SERVICE$30);
        }
    }
    
    /**
     * Sets ith "Service2Service" element
     */
    public void setService2ServiceArray(int i, it.infn.cnaf.forge.glueschema.spec.v12.r2.Service2ServiceType service2Service)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.Service2ServiceType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.Service2ServiceType)get_store().find_element_user(SERVICE2SERVICE$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(service2Service);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Service2Service" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.Service2ServiceType insertNewService2Service(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.Service2ServiceType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.Service2ServiceType)get_store().insert_element_user(SERVICE2SERVICE$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Service2Service" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.Service2ServiceType addNewService2Service()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.Service2ServiceType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.Service2ServiceType)get_store().add_element_user(SERVICE2SERVICE$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "Service2Service" element
     */
    public void removeService2Service(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICE2SERVICE$30, i);
        }
    }
    
    /**
     * Gets array of all "Host" elements
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType[] getHostArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HOST$32, targetList);
            it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType[] result = new it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Host" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType getHostArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType)get_store().find_element_user(HOST$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Host" element
     */
    public int sizeOfHostArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HOST$32);
        }
    }
    
    /**
     * Sets array of all "Host" element
     */
    public void setHostArray(it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType[] hostArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hostArray, HOST$32);
        }
    }
    
    /**
     * Sets ith "Host" element
     */
    public void setHostArray(int i, it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType host)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType)get_store().find_element_user(HOST$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(host);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Host" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType insertNewHost(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType)get_store().insert_element_user(HOST$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Host" element
     */
    public it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType addNewHost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType target = null;
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.HostType)get_store().add_element_user(HOST$32);
            return target;
        }
    }
    
    /**
     * Removes the ith "Host" element
     */
    public void removeHost(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HOST$32, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIQUEID$34);
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
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType)get_store().find_attribute_user(UNIQUEID$34);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIQUEID$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNIQUEID$34);
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
            target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType)get_store().find_attribute_user(UNIQUEID$34);
            if (target == null)
            {
                target = (it.infn.cnaf.forge.glueschema.spec.v12.r2.UniqueIDType)get_store().add_attribute_user(UNIQUEID$34);
            }
            target.set(uniqueID);
        }
    }
}
