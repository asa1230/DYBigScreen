/**
 * RequestEntityRequestExtendMSGDeleteTaskRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class RequestEntityRequestExtendMSGDeleteTaskRequest  implements java.io.Serializable {
    /* 要删除的任务的ID */
    private java.lang.String taskID;

    public RequestEntityRequestExtendMSGDeleteTaskRequest() {
    }

    public RequestEntityRequestExtendMSGDeleteTaskRequest(
           java.lang.String taskID) {
           this.taskID = taskID;
    }


    /**
     * Gets the taskID value for this RequestEntityRequestExtendMSGDeleteTaskRequest.
     * 
     * @return taskID   * 要删除的任务的ID
     */
    public java.lang.String getTaskID() {
        return taskID;
    }


    /**
     * Sets the taskID value for this RequestEntityRequestExtendMSGDeleteTaskRequest.
     * 
     * @param taskID   * 要删除的任务的ID
     */
    public void setTaskID(java.lang.String taskID) {
        this.taskID = taskID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestEntityRequestExtendMSGDeleteTaskRequest)) return false;
        RequestEntityRequestExtendMSGDeleteTaskRequest other = (RequestEntityRequestExtendMSGDeleteTaskRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taskID==null && other.getTaskID()==null) || 
             (this.taskID!=null &&
              this.taskID.equals(other.getTaskID())));
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
        if (getTaskID() != null) {
            _hashCode += getTaskID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestEntityRequestExtendMSGDeleteTaskRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>>RequestEntity>RequestExtendMSG>DeleteTaskRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskID");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "TaskID"));
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
