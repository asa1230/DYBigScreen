/**
 * MREMLMREMLRequestEntityRequestExtendMSGQueryValidateRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkg;

public class MREMLMREMLRequestEntityRequestExtendMSGQueryValidateRequest  implements java.io.Serializable {
    private java.lang.Integer isLockItem;

    private java.lang.Integer type;

    public MREMLMREMLRequestEntityRequestExtendMSGQueryValidateRequest() {
    }

    public MREMLMREMLRequestEntityRequestExtendMSGQueryValidateRequest(
           java.lang.Integer isLockItem,
           java.lang.Integer type) {
           this.isLockItem = isLockItem;
           this.type = type;
    }


    /**
     * Gets the isLockItem value for this MREMLMREMLRequestEntityRequestExtendMSGQueryValidateRequest.
     * 
     * @return isLockItem
     */
    public java.lang.Integer getIsLockItem() {
        return isLockItem;
    }


    /**
     * Sets the isLockItem value for this MREMLMREMLRequestEntityRequestExtendMSGQueryValidateRequest.
     * 
     * @param isLockItem
     */
    public void setIsLockItem(java.lang.Integer isLockItem) {
        this.isLockItem = isLockItem;
    }


    /**
     * Gets the type value for this MREMLMREMLRequestEntityRequestExtendMSGQueryValidateRequest.
     * 
     * @return type
     */
    public java.lang.Integer getType() {
        return type;
    }


    /**
     * Sets the type value for this MREMLMREMLRequestEntityRequestExtendMSGQueryValidateRequest.
     * 
     * @param type
     */
    public void setType(java.lang.Integer type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MREMLMREMLRequestEntityRequestExtendMSGQueryValidateRequest)) return false;
        MREMLMREMLRequestEntityRequestExtendMSGQueryValidateRequest other = (MREMLMREMLRequestEntityRequestExtendMSGQueryValidateRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isLockItem==null && other.getIsLockItem()==null) || 
             (this.isLockItem!=null &&
              this.isLockItem.equals(other.getIsLockItem()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getIsLockItem() != null) {
            _hashCode += getIsLockItem().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MREMLMREMLRequestEntityRequestExtendMSGQueryValidateRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>>>MREML>MREML>RequestEntity>RequestExtendMSG>QueryValidateRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isLockItem");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "IsLockItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "type"));
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
