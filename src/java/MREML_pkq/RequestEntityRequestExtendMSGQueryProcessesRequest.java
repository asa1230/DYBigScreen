/**
 * RequestEntityRequestExtendMSGQueryProcessesRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class RequestEntityRequestExtendMSGQueryProcessesRequest  implements java.io.Serializable {
    /* 应用的ID，可以�?�过这个过滤只和某个应用有关的流程�?? */
    private java.lang.String applicationID;

    public RequestEntityRequestExtendMSGQueryProcessesRequest() {
    }

    public RequestEntityRequestExtendMSGQueryProcessesRequest(
           java.lang.String applicationID) {
           this.applicationID = applicationID;
    }


    /**
     * Gets the applicationID value for this RequestEntityRequestExtendMSGQueryProcessesRequest.
     * 
     * @return applicationID   * 应用的ID，可以�?�过这个过滤只和某个应用有关的流程�??
     */
    public java.lang.String getApplicationID() {
        return applicationID;
    }


    /**
     * Sets the applicationID value for this RequestEntityRequestExtendMSGQueryProcessesRequest.
     * 
     * @param applicationID   * 应用的ID，可以�?�过这个过滤只和某个应用有关的流程�??
     */
    public void setApplicationID(java.lang.String applicationID) {
        this.applicationID = applicationID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestEntityRequestExtendMSGQueryProcessesRequest)) return false;
        RequestEntityRequestExtendMSGQueryProcessesRequest other = (RequestEntityRequestExtendMSGQueryProcessesRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.applicationID==null && other.getApplicationID()==null) || 
             (this.applicationID!=null &&
              this.applicationID.equals(other.getApplicationID())));
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
        if (getApplicationID() != null) {
            _hashCode += getApplicationID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestEntityRequestExtendMSGQueryProcessesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>>RequestEntity>RequestExtendMSG>QueryProcessesRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationID");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ApplicationID"));
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
