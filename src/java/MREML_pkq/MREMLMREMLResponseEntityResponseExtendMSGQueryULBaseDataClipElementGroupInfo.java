/**
 * MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseDataClipElementGroupInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseDataClipElementGroupInfo  implements java.io.Serializable {
    private java.lang.String groupID;

    private java.lang.String groupName;

    private java.lang.Integer isDefault;

    public MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseDataClipElementGroupInfo() {
    }

    public MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseDataClipElementGroupInfo(
           java.lang.String groupID,
           java.lang.String groupName,
           java.lang.Integer isDefault) {
           this.groupID = groupID;
           this.groupName = groupName;
           this.isDefault = isDefault;
    }


    /**
     * Gets the groupID value for this MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseDataClipElementGroupInfo.
     * 
     * @return groupID
     */
    public java.lang.String getGroupID() {
        return groupID;
    }


    /**
     * Sets the groupID value for this MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseDataClipElementGroupInfo.
     * 
     * @param groupID
     */
    public void setGroupID(java.lang.String groupID) {
        this.groupID = groupID;
    }


    /**
     * Gets the groupName value for this MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseDataClipElementGroupInfo.
     * 
     * @return groupName
     */
    public java.lang.String getGroupName() {
        return groupName;
    }


    /**
     * Sets the groupName value for this MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseDataClipElementGroupInfo.
     * 
     * @param groupName
     */
    public void setGroupName(java.lang.String groupName) {
        this.groupName = groupName;
    }


    /**
     * Gets the isDefault value for this MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseDataClipElementGroupInfo.
     * 
     * @return isDefault
     */
    public java.lang.Integer getIsDefault() {
        return isDefault;
    }


    /**
     * Sets the isDefault value for this MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseDataClipElementGroupInfo.
     * 
     * @param isDefault
     */
    public void setIsDefault(java.lang.Integer isDefault) {
        this.isDefault = isDefault;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseDataClipElementGroupInfo)) return false;
        MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseDataClipElementGroupInfo other = (MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseDataClipElementGroupInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.groupID==null && other.getGroupID()==null) || 
             (this.groupID!=null &&
              this.groupID.equals(other.getGroupID()))) &&
            ((this.groupName==null && other.getGroupName()==null) || 
             (this.groupName!=null &&
              this.groupName.equals(other.getGroupName()))) &&
            ((this.isDefault==null && other.getIsDefault()==null) || 
             (this.isDefault!=null &&
              this.isDefault.equals(other.getIsDefault())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getGroupID() != null) {
            _hashCode += getGroupID().hashCode();
        }
        if (getGroupName() != null) {
            _hashCode += getGroupName().hashCode();
        }
        if (getIsDefault() != null) {
            _hashCode += getIsDefault().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseDataClipElementGroupInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>>>>MREML>MREML>ResponseEntity>ResponseExtendMSG>QueryULBaseData>ClipElementGroupInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupID");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "GroupID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupName");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "GroupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "IsDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
