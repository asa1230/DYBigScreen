/**
 * ResponseEntity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;


/**
 * 互联请求响应信息
 */
public class ResponseEntity  implements java.io.Serializable {
    /* 对应的请求实体GUID */
    private java.lang.String requestEntityID;

    /* 请求反馈状�?�，如完成，错误等等 */
    private int status;

    /* 交换请求反馈信息说明 */
    private java.lang.String description;

    /* 具体到每个资源的反馈信息 */
    private MREML_pkq.ResponseEntityResourceStatus[] resourceStatus;

    /* 响应或�?�信�? */
    private MREML_pkq.ResponseEntityResponseExtendMSG responseExtendMSG;

    private MREML_pkq.ExtendAttribute[] extendAttribute;

    public ResponseEntity() {
    }

    public ResponseEntity(
           java.lang.String requestEntityID,
           int status,
           java.lang.String description,
           MREML_pkq.ResponseEntityResourceStatus[] resourceStatus,
           MREML_pkq.ResponseEntityResponseExtendMSG responseExtendMSG,
           MREML_pkq.ExtendAttribute[] extendAttribute) {
           this.requestEntityID = requestEntityID;
           this.status = status;
           this.description = description;
           this.resourceStatus = resourceStatus;
           this.responseExtendMSG = responseExtendMSG;
           this.extendAttribute = extendAttribute;
    }


    /**
     * Gets the requestEntityID value for this ResponseEntity.
     * 
     * @return requestEntityID   * 对应的请求实体GUID
     */
    public java.lang.String getRequestEntityID() {
        return requestEntityID;
    }


    /**
     * Sets the requestEntityID value for this ResponseEntity.
     * 
     * @param requestEntityID   * 对应的请求实体GUID
     */
    public void setRequestEntityID(java.lang.String requestEntityID) {
        this.requestEntityID = requestEntityID;
    }


    /**
     * Gets the status value for this ResponseEntity.
     * 
     * @return status   * 请求反馈状�?�，如完成，错误等等
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ResponseEntity.
     * 
     * @param status   * 请求反馈状�?�，如完成，错误等等
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the description value for this ResponseEntity.
     * 
     * @return description   * 交换请求反馈信息说明
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ResponseEntity.
     * 
     * @param description   * 交换请求反馈信息说明
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the resourceStatus value for this ResponseEntity.
     * 
     * @return resourceStatus   * 具体到每个资源的反馈信息
     */
    public MREML_pkq.ResponseEntityResourceStatus[] getResourceStatus() {
        return resourceStatus;
    }


    /**
     * Sets the resourceStatus value for this ResponseEntity.
     * 
     * @param resourceStatus   * 具体到每个资源的反馈信息
     */
    public void setResourceStatus(MREML_pkq.ResponseEntityResourceStatus[] resourceStatus) {
        this.resourceStatus = resourceStatus;
    }

    public MREML_pkq.ResponseEntityResourceStatus getResourceStatus(int i) {
        return this.resourceStatus[i];
    }

    public void setResourceStatus(int i, MREML_pkq.ResponseEntityResourceStatus _value) {
        this.resourceStatus[i] = _value;
    }


    /**
     * Gets the responseExtendMSG value for this ResponseEntity.
     * 
     * @return responseExtendMSG   * 响应或�?�信�?
     */
    public MREML_pkq.ResponseEntityResponseExtendMSG getResponseExtendMSG() {
        return responseExtendMSG;
    }


    /**
     * Sets the responseExtendMSG value for this ResponseEntity.
     * 
     * @param responseExtendMSG   * 响应或�?�信�?
     */
    public void setResponseExtendMSG(MREML_pkq.ResponseEntityResponseExtendMSG responseExtendMSG) {
        this.responseExtendMSG = responseExtendMSG;
    }


    /**
     * Gets the extendAttribute value for this ResponseEntity.
     * 
     * @return extendAttribute
     */
    public MREML_pkq.ExtendAttribute[] getExtendAttribute() {
        return extendAttribute;
    }


    /**
     * Sets the extendAttribute value for this ResponseEntity.
     * 
     * @param extendAttribute
     */
    public void setExtendAttribute(MREML_pkq.ExtendAttribute[] extendAttribute) {
        this.extendAttribute = extendAttribute;
    }

    public MREML_pkq.ExtendAttribute getExtendAttribute(int i) {
        return this.extendAttribute[i];
    }

    public void setExtendAttribute(int i, MREML_pkq.ExtendAttribute _value) {
        this.extendAttribute[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseEntity)) return false;
        ResponseEntity other = (ResponseEntity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestEntityID==null && other.getRequestEntityID()==null) || 
             (this.requestEntityID!=null &&
              this.requestEntityID.equals(other.getRequestEntityID()))) &&
            this.status == other.getStatus() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.resourceStatus==null && other.getResourceStatus()==null) || 
             (this.resourceStatus!=null &&
              java.util.Arrays.equals(this.resourceStatus, other.getResourceStatus()))) &&
            ((this.responseExtendMSG==null && other.getResponseExtendMSG()==null) || 
             (this.responseExtendMSG!=null &&
              this.responseExtendMSG.equals(other.getResponseExtendMSG()))) &&
            ((this.extendAttribute==null && other.getExtendAttribute()==null) || 
             (this.extendAttribute!=null &&
              java.util.Arrays.equals(this.extendAttribute, other.getExtendAttribute())));
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
        if (getRequestEntityID() != null) {
            _hashCode += getRequestEntityID().hashCode();
        }
        _hashCode += getStatus();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getResourceStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResourceStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResourceStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResponseExtendMSG() != null) {
            _hashCode += getResponseExtendMSG().hashCode();
        }
        if (getExtendAttribute() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExtendAttribute());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExtendAttribute(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseEntity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">ResponseEntity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestEntityID");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "RequestEntityID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ResourceStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>ResponseEntity>ResourceStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseExtendMSG");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ResponseExtendMSG"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>ResponseEntity>ResponseExtendMSG"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extendAttribute");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ExtendAttribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", "ExtendAttribute"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
