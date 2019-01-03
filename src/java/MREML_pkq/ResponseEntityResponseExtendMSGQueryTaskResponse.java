/**
 * ResponseEntityResponseExtendMSGQueryTaskResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class ResponseEntityResponseExtendMSGQueryTaskResponse  implements java.io.Serializable {
    /* 任务ID */
    private java.lang.String taskID;

    /* 任务状�?? */
    private int taskStatus;

    /* 任务进度�?0�?100 */
    private int progress;

    /* 任务处理描述信息 */
    private java.lang.String description;

    public ResponseEntityResponseExtendMSGQueryTaskResponse() {
    }

    public ResponseEntityResponseExtendMSGQueryTaskResponse(
           java.lang.String taskID,
           int taskStatus,
           int progress,
           java.lang.String description) {
           this.taskID = taskID;
           this.taskStatus = taskStatus;
           this.progress = progress;
           this.description = description;
    }


    /**
     * Gets the taskID value for this ResponseEntityResponseExtendMSGQueryTaskResponse.
     * 
     * @return taskID   * 任务ID
     */
    public java.lang.String getTaskID() {
        return taskID;
    }


    /**
     * Sets the taskID value for this ResponseEntityResponseExtendMSGQueryTaskResponse.
     * 
     * @param taskID   * 任务ID
     */
    public void setTaskID(java.lang.String taskID) {
        this.taskID = taskID;
    }


    /**
     * Gets the taskStatus value for this ResponseEntityResponseExtendMSGQueryTaskResponse.
     * 
     * @return taskStatus   * 任务状�??
     */
    public int getTaskStatus() {
        return taskStatus;
    }


    /**
     * Sets the taskStatus value for this ResponseEntityResponseExtendMSGQueryTaskResponse.
     * 
     * @param taskStatus   * 任务状�??
     */
    public void setTaskStatus(int taskStatus) {
        this.taskStatus = taskStatus;
    }


    /**
     * Gets the progress value for this ResponseEntityResponseExtendMSGQueryTaskResponse.
     * 
     * @return progress   * 任务进度�?0�?100
     */
    public int getProgress() {
        return progress;
    }


    /**
     * Sets the progress value for this ResponseEntityResponseExtendMSGQueryTaskResponse.
     * 
     * @param progress   * 任务进度�?0�?100
     */
    public void setProgress(int progress) {
        this.progress = progress;
    }


    /**
     * Gets the description value for this ResponseEntityResponseExtendMSGQueryTaskResponse.
     * 
     * @return description   * 任务处理描述信息
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ResponseEntityResponseExtendMSGQueryTaskResponse.
     * 
     * @param description   * 任务处理描述信息
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseEntityResponseExtendMSGQueryTaskResponse)) return false;
        ResponseEntityResponseExtendMSGQueryTaskResponse other = (ResponseEntityResponseExtendMSGQueryTaskResponse) obj;
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
              this.taskID.equals(other.getTaskID()))) &&
            this.taskStatus == other.getTaskStatus() &&
            this.progress == other.getProgress() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription())));
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
        _hashCode += getTaskStatus();
        _hashCode += getProgress();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseEntityResponseExtendMSGQueryTaskResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>>ResponseEntity>ResponseExtendMSG>QueryTaskResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskID");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "TaskID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "TaskStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("progress");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Progress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Description"));
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
