/**
 * RequestEntityRequestExtendMSGQueryRequestLimitation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class RequestEntityRequestExtendMSGQueryRequestLimitation  implements java.io.Serializable {
    /* 返回记录的开始序�? */
    private int beginIndex;

    /* 返回记录每页的记录数 */
    private int countPerPage;

    public RequestEntityRequestExtendMSGQueryRequestLimitation() {
    }

    public RequestEntityRequestExtendMSGQueryRequestLimitation(
           int beginIndex,
           int countPerPage) {
           this.beginIndex = beginIndex;
           this.countPerPage = countPerPage;
    }


    /**
     * Gets the beginIndex value for this RequestEntityRequestExtendMSGQueryRequestLimitation.
     * 
     * @return beginIndex   * 返回记录的开始序�?
     */
    public int getBeginIndex() {
        return beginIndex;
    }


    /**
     * Sets the beginIndex value for this RequestEntityRequestExtendMSGQueryRequestLimitation.
     * 
     * @param beginIndex   * 返回记录的开始序�?
     */
    public void setBeginIndex(int beginIndex) {
        this.beginIndex = beginIndex;
    }


    /**
     * Gets the countPerPage value for this RequestEntityRequestExtendMSGQueryRequestLimitation.
     * 
     * @return countPerPage   * 返回记录每页的记录数
     */
    public int getCountPerPage() {
        return countPerPage;
    }


    /**
     * Sets the countPerPage value for this RequestEntityRequestExtendMSGQueryRequestLimitation.
     * 
     * @param countPerPage   * 返回记录每页的记录数
     */
    public void setCountPerPage(int countPerPage) {
        this.countPerPage = countPerPage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestEntityRequestExtendMSGQueryRequestLimitation)) return false;
        RequestEntityRequestExtendMSGQueryRequestLimitation other = (RequestEntityRequestExtendMSGQueryRequestLimitation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.beginIndex == other.getBeginIndex() &&
            this.countPerPage == other.getCountPerPage();
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
        _hashCode += getBeginIndex();
        _hashCode += getCountPerPage();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestEntityRequestExtendMSGQueryRequestLimitation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>>>RequestEntity>RequestExtendMSG>QueryRequest>Limitation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beginIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "BeginIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countPerPage");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "CountPerPage"));
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
