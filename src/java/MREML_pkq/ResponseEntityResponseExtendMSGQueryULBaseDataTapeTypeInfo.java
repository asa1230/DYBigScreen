/**
 * ResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class ResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeInfo  implements java.io.Serializable {
    /* 磁带类型GUID */
    private java.lang.String typeID;

    /* /磁带类型名称 */
    private java.lang.String name;

    /* 磁带类型组GUID */
    private java.lang.String groupID;

    /* 是否未默认磁带类�? */
    private java.lang.Integer isDefault;

    public ResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeInfo() {
    }

    public ResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeInfo(
           java.lang.String typeID,
           java.lang.String name,
           java.lang.String groupID,
           java.lang.Integer isDefault) {
           this.typeID = typeID;
           this.name = name;
           this.groupID = groupID;
           this.isDefault = isDefault;
    }


    /**
     * Gets the typeID value for this ResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeInfo.
     * 
     * @return typeID   * 磁带类型GUID
     */
    public java.lang.String getTypeID() {
        return typeID;
    }


    /**
     * Sets the typeID value for this ResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeInfo.
     * 
     * @param typeID   * 磁带类型GUID
     */
    public void setTypeID(java.lang.String typeID) {
        this.typeID = typeID;
    }


    /**
     * Gets the name value for this ResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeInfo.
     * 
     * @return name   * /磁带类型名称
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeInfo.
     * 
     * @param name   * /磁带类型名称
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the groupID value for this ResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeInfo.
     * 
     * @return groupID   * 磁带类型组GUID
     */
    public java.lang.String getGroupID() {
        return groupID;
    }


    /**
     * Sets the groupID value for this ResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeInfo.
     * 
     * @param groupID   * 磁带类型组GUID
     */
    public void setGroupID(java.lang.String groupID) {
        this.groupID = groupID;
    }


    /**
     * Gets the isDefault value for this ResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeInfo.
     * 
     * @return isDefault   * 是否未默认磁带类�?
     */
    public java.lang.Integer getIsDefault() {
        return isDefault;
    }


    /**
     * Sets the isDefault value for this ResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeInfo.
     * 
     * @param isDefault   * 是否未默认磁带类�?
     */
    public void setIsDefault(java.lang.Integer isDefault) {
        this.isDefault = isDefault;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeInfo)) return false;
        ResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeInfo other = (ResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.typeID==null && other.getTypeID()==null) || 
             (this.typeID!=null &&
              this.typeID.equals(other.getTypeID()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.groupID==null && other.getGroupID()==null) || 
             (this.groupID!=null &&
              this.groupID.equals(other.getGroupID()))) &&
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
        if (getTypeID() != null) {
            _hashCode += getTypeID().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getGroupID() != null) {
            _hashCode += getGroupID().hashCode();
        }
        if (getIsDefault() != null) {
            _hashCode += getIsDefault().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>>>ResponseEntity>ResponseExtendMSG>QueryULBaseData>TapeTypeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeID");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "TypeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupID");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "GroupID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "IsDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
