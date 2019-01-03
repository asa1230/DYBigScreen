/**
 * GetServiceInfoResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dayang.www.ESB.schema.Monitor._0_1;

public class GetServiceInfoResponseType  implements java.io.Serializable {
    private java.lang.String responseInfo;

    public GetServiceInfoResponseType() {
    }

    public GetServiceInfoResponseType(
           java.lang.String responseInfo) {
           this.responseInfo = responseInfo;
    }


    /**
     * Gets the responseInfo value for this GetServiceInfoResponseType.
     * 
     * @return responseInfo
     */
    public java.lang.String getResponseInfo() {
        return responseInfo;
    }


    /**
     * Sets the responseInfo value for this GetServiceInfoResponseType.
     * 
     * @param responseInfo
     */
    public void setResponseInfo(java.lang.String responseInfo) {
        this.responseInfo = responseInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetServiceInfoResponseType)) return false;
        GetServiceInfoResponseType other = (GetServiceInfoResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.responseInfo==null && other.getResponseInfo()==null) || 
             (this.responseInfo!=null &&
              this.responseInfo.equals(other.getResponseInfo())));
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
        if (getResponseInfo() != null) {
            _hashCode += getResponseInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetServiceInfoResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.dayang.com/ESB/schema/Monitor/0.1", "GetServiceInfoResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.dayang.com/ESB/schema/Monitor/0.1", "ResponseInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
