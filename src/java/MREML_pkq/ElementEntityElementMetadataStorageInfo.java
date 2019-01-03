/**
 * ElementEntityElementMetadataStorageInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class ElementEntityElementMetadataStorageInfo  implements java.io.Serializable {
    /* 存储类型 */
    private int storageType;

    /* FTP模式 */
    private MREML_pkq.ElementEntityElementMetadataStorageInfoFTPMode FTPMode;

    private MREML_pkq.ElementEntityElementMetadataStorageInfoUNCMode UNCMode;

    public ElementEntityElementMetadataStorageInfo() {
    }

    public ElementEntityElementMetadataStorageInfo(
           int storageType,
           MREML_pkq.ElementEntityElementMetadataStorageInfoFTPMode FTPMode,
           MREML_pkq.ElementEntityElementMetadataStorageInfoUNCMode UNCMode) {
           this.storageType = storageType;
           this.FTPMode = FTPMode;
           this.UNCMode = UNCMode;
    }


    /**
     * Gets the storageType value for this ElementEntityElementMetadataStorageInfo.
     * 
     * @return storageType   * 存储类型
     */
    public int getStorageType() {
        return storageType;
    }


    /**
     * Sets the storageType value for this ElementEntityElementMetadataStorageInfo.
     * 
     * @param storageType   * 存储类型
     */
    public void setStorageType(int storageType) {
        this.storageType = storageType;
    }


    /**
     * Gets the FTPMode value for this ElementEntityElementMetadataStorageInfo.
     * 
     * @return FTPMode   * FTP模式
     */
    public MREML_pkq.ElementEntityElementMetadataStorageInfoFTPMode getFTPMode() {
        return FTPMode;
    }


    /**
     * Sets the FTPMode value for this ElementEntityElementMetadataStorageInfo.
     * 
     * @param FTPMode   * FTP模式
     */
    public void setFTPMode(MREML_pkq.ElementEntityElementMetadataStorageInfoFTPMode FTPMode) {
        this.FTPMode = FTPMode;
    }


    /**
     * Gets the UNCMode value for this ElementEntityElementMetadataStorageInfo.
     * 
     * @return UNCMode
     */
    public MREML_pkq.ElementEntityElementMetadataStorageInfoUNCMode getUNCMode() {
        return UNCMode;
    }


    /**
     * Sets the UNCMode value for this ElementEntityElementMetadataStorageInfo.
     * 
     * @param UNCMode
     */
    public void setUNCMode(MREML_pkq.ElementEntityElementMetadataStorageInfoUNCMode UNCMode) {
        this.UNCMode = UNCMode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ElementEntityElementMetadataStorageInfo)) return false;
        ElementEntityElementMetadataStorageInfo other = (ElementEntityElementMetadataStorageInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.storageType == other.getStorageType() &&
            ((this.FTPMode==null && other.getFTPMode()==null) || 
             (this.FTPMode!=null &&
              this.FTPMode.equals(other.getFTPMode()))) &&
            ((this.UNCMode==null && other.getUNCMode()==null) || 
             (this.UNCMode!=null &&
              this.UNCMode.equals(other.getUNCMode())));
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
        _hashCode += getStorageType();
        if (getFTPMode() != null) {
            _hashCode += getFTPMode().hashCode();
        }
        if (getUNCMode() != null) {
            _hashCode += getUNCMode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ElementEntityElementMetadataStorageInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>>ElementEntity>ElementMetadata>StorageInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storageType");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "StorageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FTPMode");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "FTPMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>>>ElementEntity>ElementMetadata>StorageInfo>FTPMode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UNCMode");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "UNCMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>>>ElementEntity>ElementMetadata>StorageInfo>UNCMode"));
        elemField.setMinOccurs(0);
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
