/**
 * ExtendAttribute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class ExtendAttribute  implements java.io.Serializable {
    /* å±žæ?§åç§? */
    private java.lang.String broadcastListEntity;

    /* å±žæ?§å?? */
    private java.lang.String attributeValue;

    public ExtendAttribute() {
    }

    public ExtendAttribute(
           java.lang.String broadcastListEntity,
           java.lang.String attributeValue) {
           this.broadcastListEntity = broadcastListEntity;
           this.attributeValue = attributeValue;
    }


    /**
     * Gets the broadcastListEntity value for this ExtendAttribute.
     * 
     * @return broadcastListEntity   * å±žæ?§åç§?
     */
    public java.lang.String getBroadcastListEntity() {
        return broadcastListEntity;
    }


    /**
     * Sets the broadcastListEntity value for this ExtendAttribute.
     * 
     * @param broadcastListEntity   * å±žæ?§åç§?
     */
    public void setBroadcastListEntity(java.lang.String broadcastListEntity) {
        this.broadcastListEntity = broadcastListEntity;
    }


    /**
     * Gets the attributeValue value for this ExtendAttribute.
     * 
     * @return attributeValue   * å±žæ?§å??
     */
    public java.lang.String getAttributeValue() {
        return attributeValue;
    }


    /**
     * Sets the attributeValue value for this ExtendAttribute.
     * 
     * @param attributeValue   * å±žæ?§å??
     */
    public void setAttributeValue(java.lang.String attributeValue) {
        this.attributeValue = attributeValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExtendAttribute)) return false;
        ExtendAttribute other = (ExtendAttribute) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.broadcastListEntity==null && other.getBroadcastListEntity()==null) || 
             (this.broadcastListEntity!=null &&
              this.broadcastListEntity.equals(other.getBroadcastListEntity()))) &&
            ((this.attributeValue==null && other.getAttributeValue()==null) || 
             (this.attributeValue!=null &&
              this.attributeValue.equals(other.getAttributeValue())));
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
        if (getBroadcastListEntity() != null) {
            _hashCode += getBroadcastListEntity().hashCode();
        }
        if (getAttributeValue() != null) {
            _hashCode += getAttributeValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExtendAttribute.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">ExtendAttribute"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("broadcastListEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "BroadcastListEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "AttributeValue"));
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
