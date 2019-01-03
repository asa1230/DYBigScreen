/**
 * RequestEntityRequestExtendMSGQueryRequestAdvanceCondtionAttributeCondition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class RequestEntityRequestExtendMSGQueryRequestAdvanceCondtionAttributeCondition  implements java.io.Serializable {
    /* 属�?�ID */
    private java.lang.String attributeID;

    /* 逻辑，等于，大于，小于等，枚举见枚举的说明文�? */
    private java.lang.String logic;

    /* 属�?�的值，如果逻辑关系是BETWEEN等需要一个以上�?�的，各个�?�之间用逗号隔开�? */
    private java.lang.String value;

    public RequestEntityRequestExtendMSGQueryRequestAdvanceCondtionAttributeCondition() {
    }

    public RequestEntityRequestExtendMSGQueryRequestAdvanceCondtionAttributeCondition(
           java.lang.String attributeID,
           java.lang.String logic,
           java.lang.String value) {
           this.attributeID = attributeID;
           this.logic = logic;
           this.value = value;
    }


    /**
     * Gets the attributeID value for this RequestEntityRequestExtendMSGQueryRequestAdvanceCondtionAttributeCondition.
     * 
     * @return attributeID   * 属�?�ID
     */
    public java.lang.String getAttributeID() {
        return attributeID;
    }


    /**
     * Sets the attributeID value for this RequestEntityRequestExtendMSGQueryRequestAdvanceCondtionAttributeCondition.
     * 
     * @param attributeID   * 属�?�ID
     */
    public void setAttributeID(java.lang.String attributeID) {
        this.attributeID = attributeID;
    }


    /**
     * Gets the logic value for this RequestEntityRequestExtendMSGQueryRequestAdvanceCondtionAttributeCondition.
     * 
     * @return logic   * 逻辑，等于，大于，小于等，枚举见枚举的说明文�?
     */
    public java.lang.String getLogic() {
        return logic;
    }


    /**
     * Sets the logic value for this RequestEntityRequestExtendMSGQueryRequestAdvanceCondtionAttributeCondition.
     * 
     * @param logic   * 逻辑，等于，大于，小于等，枚举见枚举的说明文�?
     */
    public void setLogic(java.lang.String logic) {
        this.logic = logic;
    }


    /**
     * Gets the value value for this RequestEntityRequestExtendMSGQueryRequestAdvanceCondtionAttributeCondition.
     * 
     * @return value   * 属�?�的值，如果逻辑关系是BETWEEN等需要一个以上�?�的，各个�?�之间用逗号隔开�?
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this RequestEntityRequestExtendMSGQueryRequestAdvanceCondtionAttributeCondition.
     * 
     * @param value   * 属�?�的值，如果逻辑关系是BETWEEN等需要一个以上�?�的，各个�?�之间用逗号隔开�?
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestEntityRequestExtendMSGQueryRequestAdvanceCondtionAttributeCondition)) return false;
        RequestEntityRequestExtendMSGQueryRequestAdvanceCondtionAttributeCondition other = (RequestEntityRequestExtendMSGQueryRequestAdvanceCondtionAttributeCondition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.attributeID==null && other.getAttributeID()==null) || 
             (this.attributeID!=null &&
              this.attributeID.equals(other.getAttributeID()))) &&
            ((this.logic==null && other.getLogic()==null) || 
             (this.logic!=null &&
              this.logic.equals(other.getLogic()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getAttributeID() != null) {
            _hashCode += getAttributeID().hashCode();
        }
        if (getLogic() != null) {
            _hashCode += getLogic().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestEntityRequestExtendMSGQueryRequestAdvanceCondtionAttributeCondition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>>>>RequestEntity>RequestExtendMSG>QueryRequest>AdvanceCondtion>AttributeCondition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeID");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "AttributeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logic");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Logic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
