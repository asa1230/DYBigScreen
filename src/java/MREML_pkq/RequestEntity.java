/**
 * RequestEntity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class RequestEntity  implements java.io.Serializable {
    /* 请求实体GUID */
    private java.lang.String requestEntityID;

    /* 具体交换指令，包括QueryValidate，GetTargetInfo，Import，Download，Query，GetItemDetail等等 */
    private java.lang.String action;

    /* 回调的时候外系统要调用的的webservice的url */
    private java.lang.String responseURL;

    /* 请求扩展信息 */
    private MREML_pkq.RequestEntityRequestExtendMSG requestExtendMSG;

    private MREML_pkq.ExtendAttribute[] extendAttribute;

    public RequestEntity() {
    }

    public RequestEntity(
           java.lang.String requestEntityID,
           java.lang.String action,
           java.lang.String responseURL,
           MREML_pkq.RequestEntityRequestExtendMSG requestExtendMSG,
           MREML_pkq.ExtendAttribute[] extendAttribute) {
           this.requestEntityID = requestEntityID;
           this.action = action;
           this.responseURL = responseURL;
           this.requestExtendMSG = requestExtendMSG;
           this.extendAttribute = extendAttribute;
    }


    /**
     * Gets the requestEntityID value for this RequestEntity.
     * 
     * @return requestEntityID   * 请求实体GUID
     */
    public java.lang.String getRequestEntityID() {
        return requestEntityID;
    }


    /**
     * Sets the requestEntityID value for this RequestEntity.
     * 
     * @param requestEntityID   * 请求实体GUID
     */
    public void setRequestEntityID(java.lang.String requestEntityID) {
        this.requestEntityID = requestEntityID;
    }


    /**
     * Gets the action value for this RequestEntity.
     * 
     * @return action   * 具体交换指令，包括QueryValidate，GetTargetInfo，Import，Download，Query，GetItemDetail等等
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this RequestEntity.
     * 
     * @param action   * 具体交换指令，包括QueryValidate，GetTargetInfo，Import，Download，Query，GetItemDetail等等
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }


    /**
     * Gets the responseURL value for this RequestEntity.
     * 
     * @return responseURL   * 回调的时候外系统要调用的的webservice的url
     */
    public java.lang.String getResponseURL() {
        return responseURL;
    }


    /**
     * Sets the responseURL value for this RequestEntity.
     * 
     * @param responseURL   * 回调的时候外系统要调用的的webservice的url
     */
    public void setResponseURL(java.lang.String responseURL) {
        this.responseURL = responseURL;
    }


    /**
     * Gets the requestExtendMSG value for this RequestEntity.
     * 
     * @return requestExtendMSG   * 请求扩展信息
     */
    public MREML_pkq.RequestEntityRequestExtendMSG getRequestExtendMSG() {
        return requestExtendMSG;
    }


    /**
     * Sets the requestExtendMSG value for this RequestEntity.
     * 
     * @param requestExtendMSG   * 请求扩展信息
     */
    public void setRequestExtendMSG(MREML_pkq.RequestEntityRequestExtendMSG requestExtendMSG) {
        this.requestExtendMSG = requestExtendMSG;
    }


    /**
     * Gets the extendAttribute value for this RequestEntity.
     * 
     * @return extendAttribute
     */
    public MREML_pkq.ExtendAttribute[] getExtendAttribute() {
        return extendAttribute;
    }


    /**
     * Sets the extendAttribute value for this RequestEntity.
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
        if (!(obj instanceof RequestEntity)) return false;
        RequestEntity other = (RequestEntity) obj;
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
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.responseURL==null && other.getResponseURL()==null) || 
             (this.responseURL!=null &&
              this.responseURL.equals(other.getResponseURL()))) &&
            ((this.requestExtendMSG==null && other.getRequestExtendMSG()==null) || 
             (this.requestExtendMSG!=null &&
              this.requestExtendMSG.equals(other.getRequestExtendMSG()))) &&
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
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getResponseURL() != null) {
            _hashCode += getResponseURL().hashCode();
        }
        if (getRequestExtendMSG() != null) {
            _hashCode += getRequestExtendMSG().hashCode();
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
        new org.apache.axis.description.TypeDesc(RequestEntity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">RequestEntity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestEntityID");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "RequestEntityID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseURL");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ResponseURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestExtendMSG");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "RequestExtendMSG"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>RequestEntity>RequestExtendMSG"));
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
