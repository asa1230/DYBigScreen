/**
 * ElementEntityElementMetadataStorageInfoUNCMode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class ElementEntityElementMetadataStorageInfoUNCMode  implements java.io.Serializable {
    /* UNC路径 */
    private java.lang.String UNCPath;

    public ElementEntityElementMetadataStorageInfoUNCMode() {
    }

    public ElementEntityElementMetadataStorageInfoUNCMode(
           java.lang.String UNCPath) {
           this.UNCPath = UNCPath;
    }


    /**
     * Gets the UNCPath value for this ElementEntityElementMetadataStorageInfoUNCMode.
     * 
     * @return UNCPath   * UNC路径
     */
    public java.lang.String getUNCPath() {
        return UNCPath;
    }


    /**
     * Sets the UNCPath value for this ElementEntityElementMetadataStorageInfoUNCMode.
     * 
     * @param UNCPath   * UNC路径
     */
    public void setUNCPath(java.lang.String UNCPath) {
        this.UNCPath = UNCPath;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ElementEntityElementMetadataStorageInfoUNCMode)) return false;
        ElementEntityElementMetadataStorageInfoUNCMode other = (ElementEntityElementMetadataStorageInfoUNCMode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.UNCPath==null && other.getUNCPath()==null) || 
             (this.UNCPath!=null &&
              this.UNCPath.equals(other.getUNCPath())));
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
        if (getUNCPath() != null) {
            _hashCode += getUNCPath().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ElementEntityElementMetadataStorageInfoUNCMode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>>>ElementEntity>ElementMetadata>StorageInfo>UNCMode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UNCPath");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "UNCPath"));
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
