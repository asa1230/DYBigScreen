/**
 * MREMLMREMLEnvelopEntity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkg;

public class MREMLMREMLEnvelopEntity  implements java.io.Serializable {
    private java.lang.String envelopVersion;

    private java.lang.String exchangeTime;

    private java.lang.String sendFrom;

    private java.lang.String[] sendTo;

    private java.lang.Integer priority;

    private MREML_pkg.MREMLMREMLEnvelopEntityRouter[] router;

    private MREML_pkg.ExtendAttribute[] extendAttribute;

    public MREMLMREMLEnvelopEntity() {
    }

    public MREMLMREMLEnvelopEntity(
           java.lang.String envelopVersion,
           java.lang.String exchangeTime,
           java.lang.String sendFrom,
           java.lang.String[] sendTo,
           java.lang.Integer priority,
           MREML_pkg.MREMLMREMLEnvelopEntityRouter[] router,
           MREML_pkg.ExtendAttribute[] extendAttribute) {
           this.envelopVersion = envelopVersion;
           this.exchangeTime = exchangeTime;
           this.sendFrom = sendFrom;
           this.sendTo = sendTo;
           this.priority = priority;
           this.router = router;
           this.extendAttribute = extendAttribute;
    }


    /**
     * Gets the envelopVersion value for this MREMLMREMLEnvelopEntity.
     * 
     * @return envelopVersion
     */
    public java.lang.String getEnvelopVersion() {
        return envelopVersion;
    }


    /**
     * Sets the envelopVersion value for this MREMLMREMLEnvelopEntity.
     * 
     * @param envelopVersion
     */
    public void setEnvelopVersion(java.lang.String envelopVersion) {
        this.envelopVersion = envelopVersion;
    }


    /**
     * Gets the exchangeTime value for this MREMLMREMLEnvelopEntity.
     * 
     * @return exchangeTime
     */
    public java.lang.String getExchangeTime() {
        return exchangeTime;
    }


    /**
     * Sets the exchangeTime value for this MREMLMREMLEnvelopEntity.
     * 
     * @param exchangeTime
     */
    public void setExchangeTime(java.lang.String exchangeTime) {
        this.exchangeTime = exchangeTime;
    }


    /**
     * Gets the sendFrom value for this MREMLMREMLEnvelopEntity.
     * 
     * @return sendFrom
     */
    public java.lang.String getSendFrom() {
        return sendFrom;
    }


    /**
     * Sets the sendFrom value for this MREMLMREMLEnvelopEntity.
     * 
     * @param sendFrom
     */
    public void setSendFrom(java.lang.String sendFrom) {
        this.sendFrom = sendFrom;
    }


    /**
     * Gets the sendTo value for this MREMLMREMLEnvelopEntity.
     * 
     * @return sendTo
     */
    public java.lang.String[] getSendTo() {
        return sendTo;
    }


    /**
     * Sets the sendTo value for this MREMLMREMLEnvelopEntity.
     * 
     * @param sendTo
     */
    public void setSendTo(java.lang.String[] sendTo) {
        this.sendTo = sendTo;
    }

    public java.lang.String getSendTo(int i) {
        return this.sendTo[i];
    }

    public void setSendTo(int i, java.lang.String _value) {
        this.sendTo[i] = _value;
    }


    /**
     * Gets the priority value for this MREMLMREMLEnvelopEntity.
     * 
     * @return priority
     */
    public java.lang.Integer getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this MREMLMREMLEnvelopEntity.
     * 
     * @param priority
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }


    /**
     * Gets the router value for this MREMLMREMLEnvelopEntity.
     * 
     * @return router
     */
    public MREML_pkg.MREMLMREMLEnvelopEntityRouter[] getRouter() {
        return router;
    }


    /**
     * Sets the router value for this MREMLMREMLEnvelopEntity.
     * 
     * @param router
     */
    public void setRouter(MREML_pkg.MREMLMREMLEnvelopEntityRouter[] router) {
        this.router = router;
    }

    public MREML_pkg.MREMLMREMLEnvelopEntityRouter getRouter(int i) {
        return this.router[i];
    }

    public void setRouter(int i, MREML_pkg.MREMLMREMLEnvelopEntityRouter _value) {
        this.router[i] = _value;
    }


    /**
     * Gets the extendAttribute value for this MREMLMREMLEnvelopEntity.
     * 
     * @return extendAttribute
     */
    public MREML_pkg.ExtendAttribute[] getExtendAttribute() {
        return extendAttribute;
    }


    /**
     * Sets the extendAttribute value for this MREMLMREMLEnvelopEntity.
     * 
     * @param extendAttribute
     */
    public void setExtendAttribute(MREML_pkg.ExtendAttribute[] extendAttribute) {
        this.extendAttribute = extendAttribute;
    }

    public MREML_pkg.ExtendAttribute getExtendAttribute(int i) {
        return this.extendAttribute[i];
    }

    public void setExtendAttribute(int i, MREML_pkg.ExtendAttribute _value) {
        this.extendAttribute[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MREMLMREMLEnvelopEntity)) return false;
        MREMLMREMLEnvelopEntity other = (MREMLMREMLEnvelopEntity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.envelopVersion==null && other.getEnvelopVersion()==null) || 
             (this.envelopVersion!=null &&
              this.envelopVersion.equals(other.getEnvelopVersion()))) &&
            ((this.exchangeTime==null && other.getExchangeTime()==null) || 
             (this.exchangeTime!=null &&
              this.exchangeTime.equals(other.getExchangeTime()))) &&
            ((this.sendFrom==null && other.getSendFrom()==null) || 
             (this.sendFrom!=null &&
              this.sendFrom.equals(other.getSendFrom()))) &&
            ((this.sendTo==null && other.getSendTo()==null) || 
             (this.sendTo!=null &&
              java.util.Arrays.equals(this.sendTo, other.getSendTo()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.router==null && other.getRouter()==null) || 
             (this.router!=null &&
              java.util.Arrays.equals(this.router, other.getRouter()))) &&
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
        if (getEnvelopVersion() != null) {
            _hashCode += getEnvelopVersion().hashCode();
        }
        if (getExchangeTime() != null) {
            _hashCode += getExchangeTime().hashCode();
        }
        if (getSendFrom() != null) {
            _hashCode += getSendFrom().hashCode();
        }
        if (getSendTo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSendTo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSendTo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getRouter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRouter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRouter(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(MREMLMREMLEnvelopEntity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>MREML>MREML>EnvelopEntity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envelopVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "EnvelopVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeTime");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ExchangeTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "SendFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendTo");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "SendTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("router");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Router"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>>MREML>MREML>EnvelopEntity>Router"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extendAttribute");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ExtendAttribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", "ExtendAttribute"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
