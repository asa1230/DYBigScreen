/**
 * NotifyEntity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class NotifyEntity  implements java.io.Serializable {
    /* 通知信息实体ID */
    private java.lang.String notifyID;

    /* 通知信息的名�? */
    private java.lang.String notifyName;

    /* 通知信息类型 */
    private int notifyType;

    /* 通知信息实体 */
    private java.lang.String notifyMSG;

    private MREML_pkq.ExtendAttribute[] extendAttribute;

    public NotifyEntity() {
    }

    public NotifyEntity(
           java.lang.String notifyID,
           java.lang.String notifyName,
           int notifyType,
           java.lang.String notifyMSG,
           MREML_pkq.ExtendAttribute[] extendAttribute) {
           this.notifyID = notifyID;
           this.notifyName = notifyName;
           this.notifyType = notifyType;
           this.notifyMSG = notifyMSG;
           this.extendAttribute = extendAttribute;
    }


    /**
     * Gets the notifyID value for this NotifyEntity.
     * 
     * @return notifyID   * 通知信息实体ID
     */
    public java.lang.String getNotifyID() {
        return notifyID;
    }


    /**
     * Sets the notifyID value for this NotifyEntity.
     * 
     * @param notifyID   * 通知信息实体ID
     */
    public void setNotifyID(java.lang.String notifyID) {
        this.notifyID = notifyID;
    }


    /**
     * Gets the notifyName value for this NotifyEntity.
     * 
     * @return notifyName   * 通知信息的名�?
     */
    public java.lang.String getNotifyName() {
        return notifyName;
    }


    /**
     * Sets the notifyName value for this NotifyEntity.
     * 
     * @param notifyName   * 通知信息的名�?
     */
    public void setNotifyName(java.lang.String notifyName) {
        this.notifyName = notifyName;
    }


    /**
     * Gets the notifyType value for this NotifyEntity.
     * 
     * @return notifyType   * 通知信息类型
     */
    public int getNotifyType() {
        return notifyType;
    }


    /**
     * Sets the notifyType value for this NotifyEntity.
     * 
     * @param notifyType   * 通知信息类型
     */
    public void setNotifyType(int notifyType) {
        this.notifyType = notifyType;
    }


    /**
     * Gets the notifyMSG value for this NotifyEntity.
     * 
     * @return notifyMSG   * 通知信息实体
     */
    public java.lang.String getNotifyMSG() {
        return notifyMSG;
    }


    /**
     * Sets the notifyMSG value for this NotifyEntity.
     * 
     * @param notifyMSG   * 通知信息实体
     */
    public void setNotifyMSG(java.lang.String notifyMSG) {
        this.notifyMSG = notifyMSG;
    }


    /**
     * Gets the extendAttribute value for this NotifyEntity.
     * 
     * @return extendAttribute
     */
    public MREML_pkq.ExtendAttribute[] getExtendAttribute() {
        return extendAttribute;
    }


    /**
     * Sets the extendAttribute value for this NotifyEntity.
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
        if (!(obj instanceof NotifyEntity)) return false;
        NotifyEntity other = (NotifyEntity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.notifyID==null && other.getNotifyID()==null) || 
             (this.notifyID!=null &&
              this.notifyID.equals(other.getNotifyID()))) &&
            ((this.notifyName==null && other.getNotifyName()==null) || 
             (this.notifyName!=null &&
              this.notifyName.equals(other.getNotifyName()))) &&
            this.notifyType == other.getNotifyType() &&
            ((this.notifyMSG==null && other.getNotifyMSG()==null) || 
             (this.notifyMSG!=null &&
              this.notifyMSG.equals(other.getNotifyMSG()))) &&
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
        if (getNotifyID() != null) {
            _hashCode += getNotifyID().hashCode();
        }
        if (getNotifyName() != null) {
            _hashCode += getNotifyName().hashCode();
        }
        _hashCode += getNotifyType();
        if (getNotifyMSG() != null) {
            _hashCode += getNotifyMSG().hashCode();
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
        new org.apache.axis.description.TypeDesc(NotifyEntity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">NotifyEntity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifyID");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "NotifyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifyName");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "NotifyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifyType");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "NotifyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifyMSG");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "NotifyMSG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
