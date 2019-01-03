/**
 * FileEntityAudioCHInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class FileEntityAudioCHInfo  implements java.io.Serializable {
    /* 声道�? */
    private int audioCH;

    /* 声道语种 */
    private java.lang.String audioLang;

    /* 声道内容 */
    private java.lang.String audioDescription;

    public FileEntityAudioCHInfo() {
    }

    public FileEntityAudioCHInfo(
           int audioCH,
           java.lang.String audioLang,
           java.lang.String audioDescription) {
           this.audioCH = audioCH;
           this.audioLang = audioLang;
           this.audioDescription = audioDescription;
    }


    /**
     * Gets the audioCH value for this FileEntityAudioCHInfo.
     * 
     * @return audioCH   * 声道�?
     */
    public int getAudioCH() {
        return audioCH;
    }


    /**
     * Sets the audioCH value for this FileEntityAudioCHInfo.
     * 
     * @param audioCH   * 声道�?
     */
    public void setAudioCH(int audioCH) {
        this.audioCH = audioCH;
    }


    /**
     * Gets the audioLang value for this FileEntityAudioCHInfo.
     * 
     * @return audioLang   * 声道语种
     */
    public java.lang.String getAudioLang() {
        return audioLang;
    }


    /**
     * Sets the audioLang value for this FileEntityAudioCHInfo.
     * 
     * @param audioLang   * 声道语种
     */
    public void setAudioLang(java.lang.String audioLang) {
        this.audioLang = audioLang;
    }


    /**
     * Gets the audioDescription value for this FileEntityAudioCHInfo.
     * 
     * @return audioDescription   * 声道内容
     */
    public java.lang.String getAudioDescription() {
        return audioDescription;
    }


    /**
     * Sets the audioDescription value for this FileEntityAudioCHInfo.
     * 
     * @param audioDescription   * 声道内容
     */
    public void setAudioDescription(java.lang.String audioDescription) {
        this.audioDescription = audioDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FileEntityAudioCHInfo)) return false;
        FileEntityAudioCHInfo other = (FileEntityAudioCHInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.audioCH == other.getAudioCH() &&
            ((this.audioLang==null && other.getAudioLang()==null) || 
             (this.audioLang!=null &&
              this.audioLang.equals(other.getAudioLang()))) &&
            ((this.audioDescription==null && other.getAudioDescription()==null) || 
             (this.audioDescription!=null &&
              this.audioDescription.equals(other.getAudioDescription())));
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
        _hashCode += getAudioCH();
        if (getAudioLang() != null) {
            _hashCode += getAudioLang().hashCode();
        }
        if (getAudioDescription() != null) {
            _hashCode += getAudioDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FileEntityAudioCHInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>FileEntity>AudioCHInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audioCH");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "AudioCH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audioLang");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "AudioLang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audioDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "AudioDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
