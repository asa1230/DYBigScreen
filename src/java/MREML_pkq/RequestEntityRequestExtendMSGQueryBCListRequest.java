/**
 * RequestEntityRequestExtendMSGQueryBCListRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class RequestEntityRequestExtendMSGQueryBCListRequest  implements java.io.Serializable {
    /* 播出日期 */
    private java.lang.String playDate;

    /* 播出频道 */
    private java.lang.String channelCode;

    public RequestEntityRequestExtendMSGQueryBCListRequest() {
    }

    public RequestEntityRequestExtendMSGQueryBCListRequest(
           java.lang.String playDate,
           java.lang.String channelCode) {
           this.playDate = playDate;
           this.channelCode = channelCode;
    }


    /**
     * Gets the playDate value for this RequestEntityRequestExtendMSGQueryBCListRequest.
     * 
     * @return playDate   * 播出日期
     */
    public java.lang.String getPlayDate() {
        return playDate;
    }


    /**
     * Sets the playDate value for this RequestEntityRequestExtendMSGQueryBCListRequest.
     * 
     * @param playDate   * 播出日期
     */
    public void setPlayDate(java.lang.String playDate) {
        this.playDate = playDate;
    }


    /**
     * Gets the channelCode value for this RequestEntityRequestExtendMSGQueryBCListRequest.
     * 
     * @return channelCode   * 播出频道
     */
    public java.lang.String getChannelCode() {
        return channelCode;
    }


    /**
     * Sets the channelCode value for this RequestEntityRequestExtendMSGQueryBCListRequest.
     * 
     * @param channelCode   * 播出频道
     */
    public void setChannelCode(java.lang.String channelCode) {
        this.channelCode = channelCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestEntityRequestExtendMSGQueryBCListRequest)) return false;
        RequestEntityRequestExtendMSGQueryBCListRequest other = (RequestEntityRequestExtendMSGQueryBCListRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.playDate==null && other.getPlayDate()==null) || 
             (this.playDate!=null &&
              this.playDate.equals(other.getPlayDate()))) &&
            ((this.channelCode==null && other.getChannelCode()==null) || 
             (this.channelCode!=null &&
              this.channelCode.equals(other.getChannelCode())));
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
        if (getPlayDate() != null) {
            _hashCode += getPlayDate().hashCode();
        }
        if (getChannelCode() != null) {
            _hashCode += getChannelCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestEntityRequestExtendMSGQueryBCListRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>>RequestEntity>RequestExtendMSG>QueryBCListRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("playDate");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "PlayDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelCode");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ChannelCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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