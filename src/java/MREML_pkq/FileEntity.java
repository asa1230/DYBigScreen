/**
 * FileEntity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class FileEntity  implements java.io.Serializable {
    /* 资源文件信息 */
    private MREML_pkq.FileEntityFileInfo fileInfo;

    private MREML_pkq.FileEntityAudioCHInfo[] audioCHInfo;

    private MREML_pkq.FileEntityCGInfo[] CGInfo;

    private MREML_pkq.ExtendAttribute[] extendAttribute;

    public FileEntity() {
    }

    public FileEntity(
           MREML_pkq.FileEntityFileInfo fileInfo,
           MREML_pkq.FileEntityAudioCHInfo[] audioCHInfo,
           MREML_pkq.FileEntityCGInfo[] CGInfo,
           MREML_pkq.ExtendAttribute[] extendAttribute) {
           this.fileInfo = fileInfo;
           this.audioCHInfo = audioCHInfo;
           this.CGInfo = CGInfo;
           this.extendAttribute = extendAttribute;
    }


    /**
     * Gets the fileInfo value for this FileEntity.
     * 
     * @return fileInfo   * 资源文件信息
     */
    public MREML_pkq.FileEntityFileInfo getFileInfo() {
        return fileInfo;
    }


    /**
     * Sets the fileInfo value for this FileEntity.
     * 
     * @param fileInfo   * 资源文件信息
     */
    public void setFileInfo(MREML_pkq.FileEntityFileInfo fileInfo) {
        this.fileInfo = fileInfo;
    }


    /**
     * Gets the audioCHInfo value for this FileEntity.
     * 
     * @return audioCHInfo
     */
    public MREML_pkq.FileEntityAudioCHInfo[] getAudioCHInfo() {
        return audioCHInfo;
    }


    /**
     * Sets the audioCHInfo value for this FileEntity.
     * 
     * @param audioCHInfo
     */
    public void setAudioCHInfo(MREML_pkq.FileEntityAudioCHInfo[] audioCHInfo) {
        this.audioCHInfo = audioCHInfo;
    }

    public MREML_pkq.FileEntityAudioCHInfo getAudioCHInfo(int i) {
        return this.audioCHInfo[i];
    }

    public void setAudioCHInfo(int i, MREML_pkq.FileEntityAudioCHInfo _value) {
        this.audioCHInfo[i] = _value;
    }


    /**
     * Gets the CGInfo value for this FileEntity.
     * 
     * @return CGInfo
     */
    public MREML_pkq.FileEntityCGInfo[] getCGInfo() {
        return CGInfo;
    }


    /**
     * Sets the CGInfo value for this FileEntity.
     * 
     * @param CGInfo
     */
    public void setCGInfo(MREML_pkq.FileEntityCGInfo[] CGInfo) {
        this.CGInfo = CGInfo;
    }

    public MREML_pkq.FileEntityCGInfo getCGInfo(int i) {
        return this.CGInfo[i];
    }

    public void setCGInfo(int i, MREML_pkq.FileEntityCGInfo _value) {
        this.CGInfo[i] = _value;
    }


    /**
     * Gets the extendAttribute value for this FileEntity.
     * 
     * @return extendAttribute
     */
    public MREML_pkq.ExtendAttribute[] getExtendAttribute() {
        return extendAttribute;
    }


    /**
     * Sets the extendAttribute value for this FileEntity.
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
        if (!(obj instanceof FileEntity)) return false;
        FileEntity other = (FileEntity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fileInfo==null && other.getFileInfo()==null) || 
             (this.fileInfo!=null &&
              this.fileInfo.equals(other.getFileInfo()))) &&
            ((this.audioCHInfo==null && other.getAudioCHInfo()==null) || 
             (this.audioCHInfo!=null &&
              java.util.Arrays.equals(this.audioCHInfo, other.getAudioCHInfo()))) &&
            ((this.CGInfo==null && other.getCGInfo()==null) || 
             (this.CGInfo!=null &&
              java.util.Arrays.equals(this.CGInfo, other.getCGInfo()))) &&
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
        if (getFileInfo() != null) {
            _hashCode += getFileInfo().hashCode();
        }
        if (getAudioCHInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAudioCHInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAudioCHInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCGInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCGInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCGInfo(), i);
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
        new org.apache.axis.description.TypeDesc(FileEntity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">FileEntity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "FileInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>FileEntity>FileInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audioCHInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "AudioCHInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>FileEntity>AudioCHInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CGInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "CGInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>FileEntity>CGInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
