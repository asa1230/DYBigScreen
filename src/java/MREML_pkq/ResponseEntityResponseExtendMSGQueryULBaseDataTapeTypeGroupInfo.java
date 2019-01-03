/**
 * ResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeGroupInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class ResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeGroupInfo  implements java.io.Serializable {
    /* 磁带类型组GUID */
    private java.lang.String groupID;

    /* 磁带类型组名�? */
    private java.lang.String groupName;

    public ResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeGroupInfo() {
    }

    public ResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeGroupInfo(
           java.lang.String groupID,
           java.lang.String groupName) {
           this.groupID = groupID;
           this.groupName = groupName;
    }


    /**
     * Gets the groupID value for this ResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeGroupInfo.
     * 
     * @return groupID   * 磁带类型组GUID
     */
    public java.lang.String getGroupID() {
        return groupID;
    }


    /**
     * Sets the groupID value for this ResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeGroupInfo.
     * 
     * @param groupID   * 磁带类型组GUID
     */
    public void setGroupID(java.lang.String groupID) {
        this.groupID = groupID;
    }


    /**
     * Gets the groupName value for this ResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeGroupInfo.
     * 
     * @return groupName   * 磁带类型组名�?
     */
    public java.lang.String getGroupName() {
        return groupName;
    }


    /**
     * Sets the groupName value for this ResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeGroupInfo.
     * 
     * @param groupName   * 磁带类型组名�?
     */
    public void setGroupName(java.lang.String groupName) {
        this.groupName = groupName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeGroupInfo)) return false;
        ResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeGroupInfo other = (ResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeGroupInfo) obj;
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
              this.groupName.equals(other.getGroupName())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeGroupInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>>>ResponseEntity>ResponseExtendMSG>QueryULBaseData>TapeTypeGroupInfo"));
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
