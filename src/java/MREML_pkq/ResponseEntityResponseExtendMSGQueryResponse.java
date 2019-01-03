/**
 * ResponseEntityResponseExtendMSGQueryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class ResponseEntityResponseExtendMSGQueryResponse  implements java.io.Serializable {
    /* �?有符合条件的节目�? */
    private int totalItems;

    public ResponseEntityResponseExtendMSGQueryResponse() {
    }

    public ResponseEntityResponseExtendMSGQueryResponse(
           int totalItems) {
           this.totalItems = totalItems;
    }


    /**
     * Gets the totalItems value for this ResponseEntityResponseExtendMSGQueryResponse.
     * 
     * @return totalItems   * �?有符合条件的节目�?
     */
    public int getTotalItems() {
        return totalItems;
    }


    /**
     * Sets the totalItems value for this ResponseEntityResponseExtendMSGQueryResponse.
     * 
     * @param totalItems   * �?有符合条件的节目�?
     */
    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseEntityResponseExtendMSGQueryResponse)) return false;
        ResponseEntityResponseExtendMSGQueryResponse other = (ResponseEntityResponseExtendMSGQueryResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.totalItems == other.getTotalItems();
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
        _hashCode += getTotalItems();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseEntityResponseExtendMSGQueryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>>ResponseEntity>ResponseExtendMSG>QueryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalItems");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "TotalItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
