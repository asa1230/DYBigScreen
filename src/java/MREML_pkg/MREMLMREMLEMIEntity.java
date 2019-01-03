/**
 * MREMLMREMLEMIEntity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkg;

public class MREMLMREMLEMIEntity  implements java.io.Serializable {
    private MREML_pkg.AuditInfo[] auditInfo;

    private MREML_pkg.ExtendAttribute[] extendAttribute;

    public MREMLMREMLEMIEntity() {
    }

    public MREMLMREMLEMIEntity(
           MREML_pkg.AuditInfo[] auditInfo,
           MREML_pkg.ExtendAttribute[] extendAttribute) {
           this.auditInfo = auditInfo;
           this.extendAttribute = extendAttribute;
    }


    /**
     * Gets the auditInfo value for this MREMLMREMLEMIEntity.
     * 
     * @return auditInfo
     */
    public MREML_pkg.AuditInfo[] getAuditInfo() {
        return auditInfo;
    }


    /**
     * Sets the auditInfo value for this MREMLMREMLEMIEntity.
     * 
     * @param auditInfo
     */
    public void setAuditInfo(MREML_pkg.AuditInfo[] auditInfo) {
        this.auditInfo = auditInfo;
    }

    public MREML_pkg.AuditInfo getAuditInfo(int i) {
        return this.auditInfo[i];
    }

    public void setAuditInfo(int i, MREML_pkg.AuditInfo _value) {
        this.auditInfo[i] = _value;
    }


    /**
     * Gets the extendAttribute value for this MREMLMREMLEMIEntity.
     * 
     * @return extendAttribute
     */
    public MREML_pkg.ExtendAttribute[] getExtendAttribute() {
        return extendAttribute;
    }


    /**
     * Sets the extendAttribute value for this MREMLMREMLEMIEntity.
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
        if (!(obj instanceof MREMLMREMLEMIEntity)) return false;
        MREMLMREMLEMIEntity other = (MREMLMREMLEMIEntity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.auditInfo==null && other.getAuditInfo()==null) || 
             (this.auditInfo!=null &&
              java.util.Arrays.equals(this.auditInfo, other.getAuditInfo()))) &&
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
        if (getAuditInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuditInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuditInfo(), i);
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
        new org.apache.axis.description.TypeDesc(MREMLMREMLEMIEntity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>MREML>MREML>EMIEntity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "AuditInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", "AuditInfo"));
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
