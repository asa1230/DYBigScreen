/**
 * QueryULTaskResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;


/**
 * 查询收录任务响应(复杂类型)
 */
public class QueryULTaskResponseType  implements java.io.Serializable {
    private MREML_pkq.ULTaskInfoType ULTaskInfo;

    public QueryULTaskResponseType() {
    }

    public QueryULTaskResponseType(
           MREML_pkq.ULTaskInfoType ULTaskInfo) {
           this.ULTaskInfo = ULTaskInfo;
    }


    /**
     * Gets the ULTaskInfo value for this QueryULTaskResponseType.
     * 
     * @return ULTaskInfo
     */
    public MREML_pkq.ULTaskInfoType getULTaskInfo() {
        return ULTaskInfo;
    }


    /**
     * Sets the ULTaskInfo value for this QueryULTaskResponseType.
     * 
     * @param ULTaskInfo
     */
    public void setULTaskInfo(MREML_pkq.ULTaskInfoType ULTaskInfo) {
        this.ULTaskInfo = ULTaskInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryULTaskResponseType)) return false;
        QueryULTaskResponseType other = (QueryULTaskResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ULTaskInfo==null && other.getULTaskInfo()==null) || 
             (this.ULTaskInfo!=null &&
              this.ULTaskInfo.equals(other.getULTaskInfo())));
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
        if (getULTaskInfo() != null) {
            _hashCode += getULTaskInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryULTaskResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", "QueryULTaskResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ULTaskInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ULTaskInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", "ULTaskInfoType"));
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
