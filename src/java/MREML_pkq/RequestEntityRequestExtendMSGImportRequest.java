/**
 * RequestEntityRequestExtendMSGImportRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class RequestEntityRequestExtendMSGImportRequest  implements java.io.Serializable {
    /* 节目已存在时的处理方式：覆盖、返回错误还是创建新节目 */
    private java.lang.Integer duplicatedItemProcessMode;

    public RequestEntityRequestExtendMSGImportRequest() {
    }

    public RequestEntityRequestExtendMSGImportRequest(
           java.lang.Integer duplicatedItemProcessMode) {
           this.duplicatedItemProcessMode = duplicatedItemProcessMode;
    }


    /**
     * Gets the duplicatedItemProcessMode value for this RequestEntityRequestExtendMSGImportRequest.
     * 
     * @return duplicatedItemProcessMode   * 节目已存在时的处理方式：覆盖、返回错误还是创建新节目
     */
    public java.lang.Integer getDuplicatedItemProcessMode() {
        return duplicatedItemProcessMode;
    }


    /**
     * Sets the duplicatedItemProcessMode value for this RequestEntityRequestExtendMSGImportRequest.
     * 
     * @param duplicatedItemProcessMode   * 节目已存在时的处理方式：覆盖、返回错误还是创建新节目
     */
    public void setDuplicatedItemProcessMode(java.lang.Integer duplicatedItemProcessMode) {
        this.duplicatedItemProcessMode = duplicatedItemProcessMode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestEntityRequestExtendMSGImportRequest)) return false;
        RequestEntityRequestExtendMSGImportRequest other = (RequestEntityRequestExtendMSGImportRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.duplicatedItemProcessMode==null && other.getDuplicatedItemProcessMode()==null) || 
             (this.duplicatedItemProcessMode!=null &&
              this.duplicatedItemProcessMode.equals(other.getDuplicatedItemProcessMode())));
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
        if (getDuplicatedItemProcessMode() != null) {
            _hashCode += getDuplicatedItemProcessMode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestEntityRequestExtendMSGImportRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>>RequestEntity>RequestExtendMSG>ImportRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duplicatedItemProcessMode");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "DuplicatedItemProcessMode"));
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
