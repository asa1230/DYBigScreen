/**
 * MREMLMREMLResponseEntityResponseExtendMSGQueryProcessStatusResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class MREMLMREMLResponseEntityResponseExtendMSGQueryProcessStatusResponse  implements java.io.Serializable {
    private int status;

    private java.lang.String currentActivity;

    private java.lang.Integer progress;

    private java.lang.String errorActivity;

    private java.lang.String errorDescription;

    public MREMLMREMLResponseEntityResponseExtendMSGQueryProcessStatusResponse() {
    }

    public MREMLMREMLResponseEntityResponseExtendMSGQueryProcessStatusResponse(
           int status,
           java.lang.String currentActivity,
           java.lang.Integer progress,
           java.lang.String errorActivity,
           java.lang.String errorDescription) {
           this.status = status;
           this.currentActivity = currentActivity;
           this.progress = progress;
           this.errorActivity = errorActivity;
           this.errorDescription = errorDescription;
    }


    /**
     * Gets the status value for this MREMLMREMLResponseEntityResponseExtendMSGQueryProcessStatusResponse.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this MREMLMREMLResponseEntityResponseExtendMSGQueryProcessStatusResponse.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the currentActivity value for this MREMLMREMLResponseEntityResponseExtendMSGQueryProcessStatusResponse.
     * 
     * @return currentActivity
     */
    public java.lang.String getCurrentActivity() {
        return currentActivity;
    }


    /**
     * Sets the currentActivity value for this MREMLMREMLResponseEntityResponseExtendMSGQueryProcessStatusResponse.
     * 
     * @param currentActivity
     */
    public void setCurrentActivity(java.lang.String currentActivity) {
        this.currentActivity = currentActivity;
    }


    /**
     * Gets the progress value for this MREMLMREMLResponseEntityResponseExtendMSGQueryProcessStatusResponse.
     * 
     * @return progress
     */
    public java.lang.Integer getProgress() {
        return progress;
    }


    /**
     * Sets the progress value for this MREMLMREMLResponseEntityResponseExtendMSGQueryProcessStatusResponse.
     * 
     * @param progress
     */
    public void setProgress(java.lang.Integer progress) {
        this.progress = progress;
    }


    /**
     * Gets the errorActivity value for this MREMLMREMLResponseEntityResponseExtendMSGQueryProcessStatusResponse.
     * 
     * @return errorActivity
     */
    public java.lang.String getErrorActivity() {
        return errorActivity;
    }


    /**
     * Sets the errorActivity value for this MREMLMREMLResponseEntityResponseExtendMSGQueryProcessStatusResponse.
     * 
     * @param errorActivity
     */
    public void setErrorActivity(java.lang.String errorActivity) {
        this.errorActivity = errorActivity;
    }


    /**
     * Gets the errorDescription value for this MREMLMREMLResponseEntityResponseExtendMSGQueryProcessStatusResponse.
     * 
     * @return errorDescription
     */
    public java.lang.String getErrorDescription() {
        return errorDescription;
    }


    /**
     * Sets the errorDescription value for this MREMLMREMLResponseEntityResponseExtendMSGQueryProcessStatusResponse.
     * 
     * @param errorDescription
     */
    public void setErrorDescription(java.lang.String errorDescription) {
        this.errorDescription = errorDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MREMLMREMLResponseEntityResponseExtendMSGQueryProcessStatusResponse)) return false;
        MREMLMREMLResponseEntityResponseExtendMSGQueryProcessStatusResponse other = (MREMLMREMLResponseEntityResponseExtendMSGQueryProcessStatusResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.status == other.getStatus() &&
            ((this.currentActivity==null && other.getCurrentActivity()==null) || 
             (this.currentActivity!=null &&
              this.currentActivity.equals(other.getCurrentActivity()))) &&
            ((this.progress==null && other.getProgress()==null) || 
             (this.progress!=null &&
              this.progress.equals(other.getProgress()))) &&
            ((this.errorActivity==null && other.getErrorActivity()==null) || 
             (this.errorActivity!=null &&
              this.errorActivity.equals(other.getErrorActivity()))) &&
            ((this.errorDescription==null && other.getErrorDescription()==null) || 
             (this.errorDescription!=null &&
              this.errorDescription.equals(other.getErrorDescription())));
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
        _hashCode += getStatus();
        if (getCurrentActivity() != null) {
            _hashCode += getCurrentActivity().hashCode();
        }
        if (getProgress() != null) {
            _hashCode += getProgress().hashCode();
        }
        if (getErrorActivity() != null) {
            _hashCode += getErrorActivity().hashCode();
        }
        if (getErrorDescription() != null) {
            _hashCode += getErrorDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MREMLMREMLResponseEntityResponseExtendMSGQueryProcessStatusResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>>>MREML>MREML>ResponseEntity>ResponseExtendMSG>QueryProcessStatusResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentActivity");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "CurrentActivity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("progress");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Progress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorActivity");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ErrorActivity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ErrorDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
