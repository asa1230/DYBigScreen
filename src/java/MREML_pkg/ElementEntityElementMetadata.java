/**
 * ElementEntityElementMetadata.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkg;

public class ElementEntityElementMetadata  implements java.io.Serializable {
    private java.lang.String elementName;

    private int elementType;

    private java.lang.String elementHint;

    private java.lang.Integer elementFrameOffset;

    private MREML_pkg.ElementEntityElementMetadataStorageInfo[] storageInfo;

    private MREML_pkg.ElementEntityElementMetadataAVFormat AVFormat;

    private MREML_pkg.ElementEntityElementMetadataMediaInfo mediaInfo;

    private MREML_pkg.ExtendAttribute[] extendAttribute;

    public ElementEntityElementMetadata() {
    }

    public ElementEntityElementMetadata(
           java.lang.String elementName,
           int elementType,
           java.lang.String elementHint,
           java.lang.Integer elementFrameOffset,
           MREML_pkg.ElementEntityElementMetadataStorageInfo[] storageInfo,
           MREML_pkg.ElementEntityElementMetadataAVFormat AVFormat,
           MREML_pkg.ElementEntityElementMetadataMediaInfo mediaInfo,
           MREML_pkg.ExtendAttribute[] extendAttribute) {
           this.elementName = elementName;
           this.elementType = elementType;
           this.elementHint = elementHint;
           this.elementFrameOffset = elementFrameOffset;
           this.storageInfo = storageInfo;
           this.AVFormat = AVFormat;
           this.mediaInfo = mediaInfo;
           this.extendAttribute = extendAttribute;
    }


    /**
     * Gets the elementName value for this ElementEntityElementMetadata.
     * 
     * @return elementName
     */
    public java.lang.String getElementName() {
        return elementName;
    }


    /**
     * Sets the elementName value for this ElementEntityElementMetadata.
     * 
     * @param elementName
     */
    public void setElementName(java.lang.String elementName) {
        this.elementName = elementName;
    }


    /**
     * Gets the elementType value for this ElementEntityElementMetadata.
     * 
     * @return elementType
     */
    public int getElementType() {
        return elementType;
    }


    /**
     * Sets the elementType value for this ElementEntityElementMetadata.
     * 
     * @param elementType
     */
    public void setElementType(int elementType) {
        this.elementType = elementType;
    }


    /**
     * Gets the elementHint value for this ElementEntityElementMetadata.
     * 
     * @return elementHint
     */
    public java.lang.String getElementHint() {
        return elementHint;
    }


    /**
     * Sets the elementHint value for this ElementEntityElementMetadata.
     * 
     * @param elementHint
     */
    public void setElementHint(java.lang.String elementHint) {
        this.elementHint = elementHint;
    }


    /**
     * Gets the elementFrameOffset value for this ElementEntityElementMetadata.
     * 
     * @return elementFrameOffset
     */
    public java.lang.Integer getElementFrameOffset() {
        return elementFrameOffset;
    }


    /**
     * Sets the elementFrameOffset value for this ElementEntityElementMetadata.
     * 
     * @param elementFrameOffset
     */
    public void setElementFrameOffset(java.lang.Integer elementFrameOffset) {
        this.elementFrameOffset = elementFrameOffset;
    }


    /**
     * Gets the storageInfo value for this ElementEntityElementMetadata.
     * 
     * @return storageInfo
     */
    public MREML_pkg.ElementEntityElementMetadataStorageInfo[] getStorageInfo() {
        return storageInfo;
    }


    /**
     * Sets the storageInfo value for this ElementEntityElementMetadata.
     * 
     * @param storageInfo
     */
    public void setStorageInfo(MREML_pkg.ElementEntityElementMetadataStorageInfo[] storageInfo) {
        this.storageInfo = storageInfo;
    }

    public MREML_pkg.ElementEntityElementMetadataStorageInfo getStorageInfo(int i) {
        return this.storageInfo[i];
    }

    public void setStorageInfo(int i, MREML_pkg.ElementEntityElementMetadataStorageInfo _value) {
        this.storageInfo[i] = _value;
    }


    /**
     * Gets the AVFormat value for this ElementEntityElementMetadata.
     * 
     * @return AVFormat
     */
    public MREML_pkg.ElementEntityElementMetadataAVFormat getAVFormat() {
        return AVFormat;
    }


    /**
     * Sets the AVFormat value for this ElementEntityElementMetadata.
     * 
     * @param AVFormat
     */
    public void setAVFormat(MREML_pkg.ElementEntityElementMetadataAVFormat AVFormat) {
        this.AVFormat = AVFormat;
    }


    /**
     * Gets the mediaInfo value for this ElementEntityElementMetadata.
     * 
     * @return mediaInfo
     */
    public MREML_pkg.ElementEntityElementMetadataMediaInfo getMediaInfo() {
        return mediaInfo;
    }


    /**
     * Sets the mediaInfo value for this ElementEntityElementMetadata.
     * 
     * @param mediaInfo
     */
    public void setMediaInfo(MREML_pkg.ElementEntityElementMetadataMediaInfo mediaInfo) {
        this.mediaInfo = mediaInfo;
    }


    /**
     * Gets the extendAttribute value for this ElementEntityElementMetadata.
     * 
     * @return extendAttribute
     */
    public MREML_pkg.ExtendAttribute[] getExtendAttribute() {
        return extendAttribute;
    }


    /**
     * Sets the extendAttribute value for this ElementEntityElementMetadata.
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
        if (!(obj instanceof ElementEntityElementMetadata)) return false;
        ElementEntityElementMetadata other = (ElementEntityElementMetadata) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.elementName==null && other.getElementName()==null) || 
             (this.elementName!=null &&
              this.elementName.equals(other.getElementName()))) &&
            this.elementType == other.getElementType() &&
            ((this.elementHint==null && other.getElementHint()==null) || 
             (this.elementHint!=null &&
              this.elementHint.equals(other.getElementHint()))) &&
            ((this.elementFrameOffset==null && other.getElementFrameOffset()==null) || 
             (this.elementFrameOffset!=null &&
              this.elementFrameOffset.equals(other.getElementFrameOffset()))) &&
            ((this.storageInfo==null && other.getStorageInfo()==null) || 
             (this.storageInfo!=null &&
              java.util.Arrays.equals(this.storageInfo, other.getStorageInfo()))) &&
            ((this.AVFormat==null && other.getAVFormat()==null) || 
             (this.AVFormat!=null &&
              this.AVFormat.equals(other.getAVFormat()))) &&
            ((this.mediaInfo==null && other.getMediaInfo()==null) || 
             (this.mediaInfo!=null &&
              this.mediaInfo.equals(other.getMediaInfo()))) &&
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
        if (getElementName() != null) {
            _hashCode += getElementName().hashCode();
        }
        _hashCode += getElementType();
        if (getElementHint() != null) {
            _hashCode += getElementHint().hashCode();
        }
        if (getElementFrameOffset() != null) {
            _hashCode += getElementFrameOffset().hashCode();
        }
        if (getStorageInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStorageInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStorageInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAVFormat() != null) {
            _hashCode += getAVFormat().hashCode();
        }
        if (getMediaInfo() != null) {
            _hashCode += getMediaInfo().hashCode();
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
        new org.apache.axis.description.TypeDesc(ElementEntityElementMetadata.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">ElementEntity>ElementMetadata"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elementName");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ElementName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elementType");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ElementType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elementHint");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ElementHint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elementFrameOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ElementFrameOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storageInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "StorageInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>ElementEntity>ElementMetadata>StorageInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AVFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "AVFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>ElementEntity>ElementMetadata>AVFormat"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediaInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "MediaInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>ElementEntity>ElementMetadata>MediaInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
