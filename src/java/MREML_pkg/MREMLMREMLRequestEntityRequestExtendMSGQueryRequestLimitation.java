/**
 * MREMLMREMLRequestEntityRequestExtendMSGQueryRequestLimitation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkg;

public class MREMLMREMLRequestEntityRequestExtendMSGQueryRequestLimitation  implements java.io.Serializable {
    private int beginIndex;

    private int countPerPage;

    public MREMLMREMLRequestEntityRequestExtendMSGQueryRequestLimitation() {
    }

    public MREMLMREMLRequestEntityRequestExtendMSGQueryRequestLimitation(
           int beginIndex,
           int countPerPage) {
           this.beginIndex = beginIndex;
           this.countPerPage = countPerPage;
    }


    /**
     * Gets the beginIndex value for this MREMLMREMLRequestEntityRequestExtendMSGQueryRequestLimitation.
     * 
     * @return beginIndex
     */
    public int getBeginIndex() {
        return beginIndex;
    }


    /**
     * Sets the beginIndex value for this MREMLMREMLRequestEntityRequestExtendMSGQueryRequestLimitation.
     * 
     * @param beginIndex
     */
    public void setBeginIndex(int beginIndex) {
        this.beginIndex = beginIndex;
    }


    /**
     * Gets the countPerPage value for this MREMLMREMLRequestEntityRequestExtendMSGQueryRequestLimitation.
     * 
     * @return countPerPage
     */
    public int getCountPerPage() {
        return countPerPage;
    }


    /**
     * Sets the countPerPage value for this MREMLMREMLRequestEntityRequestExtendMSGQueryRequestLimitation.
     * 
     * @param countPerPage
     */
    public void setCountPerPage(int countPerPage) {
        this.countPerPage = countPerPage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MREMLMREMLRequestEntityRequestExtendMSGQueryRequestLimitation)) return false;
        MREMLMREMLRequestEntityRequestExtendMSGQueryRequestLimitation other = (MREMLMREMLRequestEntityRequestExtendMSGQueryRequestLimitation) obj;
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
        new org.apache.axis.description.TypeDesc(MREMLMREMLRequestEntityRequestExtendMSGQueryRequestLimitation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>>>>MREML>MREML>RequestEntity>RequestExtendMSG>QueryRequest>Limitation"));
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
