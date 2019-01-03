/**
 * ElementEntityElementMetadataAVFormatAudioInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkg;

public class ElementEntityElementMetadataAVFormatAudioInfo  implements java.io.Serializable {
    private int audioCodingFormat;

    private int audioSubType;

    private int channels;

    private int audioDataRate;

    private int audioSamplingFreq;

    private int audioBitDepth;

    private int blockAlign;

    public ElementEntityElementMetadataAVFormatAudioInfo() {
    }

    public ElementEntityElementMetadataAVFormatAudioInfo(
           int audioCodingFormat,
           int audioSubType,
           int channels,
           int audioDataRate,
           int audioSamplingFreq,
           int audioBitDepth,
           int blockAlign) {
           this.audioCodingFormat = audioCodingFormat;
           this.audioSubType = audioSubType;
           this.channels = channels;
           this.audioDataRate = audioDataRate;
           this.audioSamplingFreq = audioSamplingFreq;
           this.audioBitDepth = audioBitDepth;
           this.blockAlign = blockAlign;
    }


    /**
     * Gets the audioCodingFormat value for this ElementEntityElementMetadataAVFormatAudioInfo.
     * 
     * @return audioCodingFormat
     */
    public int getAudioCodingFormat() {
        return audioCodingFormat;
    }


    /**
     * Sets the audioCodingFormat value for this ElementEntityElementMetadataAVFormatAudioInfo.
     * 
     * @param audioCodingFormat
     */
    public void setAudioCodingFormat(int audioCodingFormat) {
        this.audioCodingFormat = audioCodingFormat;
    }


    /**
     * Gets the audioSubType value for this ElementEntityElementMetadataAVFormatAudioInfo.
     * 
     * @return audioSubType
     */
    public int getAudioSubType() {
        return audioSubType;
    }


    /**
     * Sets the audioSubType value for this ElementEntityElementMetadataAVFormatAudioInfo.
     * 
     * @param audioSubType
     */
    public void setAudioSubType(int audioSubType) {
        this.audioSubType = audioSubType;
    }


    /**
     * Gets the channels value for this ElementEntityElementMetadataAVFormatAudioInfo.
     * 
     * @return channels
     */
    public int getChannels() {
        return channels;
    }


    /**
     * Sets the channels value for this ElementEntityElementMetadataAVFormatAudioInfo.
     * 
     * @param channels
     */
    public void setChannels(int channels) {
        this.channels = channels;
    }


    /**
     * Gets the audioDataRate value for this ElementEntityElementMetadataAVFormatAudioInfo.
     * 
     * @return audioDataRate
     */
    public int getAudioDataRate() {
        return audioDataRate;
    }


    /**
     * Sets the audioDataRate value for this ElementEntityElementMetadataAVFormatAudioInfo.
     * 
     * @param audioDataRate
     */
    public void setAudioDataRate(int audioDataRate) {
        this.audioDataRate = audioDataRate;
    }


    /**
     * Gets the audioSamplingFreq value for this ElementEntityElementMetadataAVFormatAudioInfo.
     * 
     * @return audioSamplingFreq
     */
    public int getAudioSamplingFreq() {
        return audioSamplingFreq;
    }


    /**
     * Sets the audioSamplingFreq value for this ElementEntityElementMetadataAVFormatAudioInfo.
     * 
     * @param audioSamplingFreq
     */
    public void setAudioSamplingFreq(int audioSamplingFreq) {
        this.audioSamplingFreq = audioSamplingFreq;
    }


    /**
     * Gets the audioBitDepth value for this ElementEntityElementMetadataAVFormatAudioInfo.
     * 
     * @return audioBitDepth
     */
    public int getAudioBitDepth() {
        return audioBitDepth;
    }


    /**
     * Sets the audioBitDepth value for this ElementEntityElementMetadataAVFormatAudioInfo.
     * 
     * @param audioBitDepth
     */
    public void setAudioBitDepth(int audioBitDepth) {
        this.audioBitDepth = audioBitDepth;
    }


    /**
     * Gets the blockAlign value for this ElementEntityElementMetadataAVFormatAudioInfo.
     * 
     * @return blockAlign
     */
    public int getBlockAlign() {
        return blockAlign;
    }


    /**
     * Sets the blockAlign value for this ElementEntityElementMetadataAVFormatAudioInfo.
     * 
     * @param blockAlign
     */
    public void setBlockAlign(int blockAlign) {
        this.blockAlign = blockAlign;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ElementEntityElementMetadataAVFormatAudioInfo)) return false;
        ElementEntityElementMetadataAVFormatAudioInfo other = (ElementEntityElementMetadataAVFormatAudioInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.audioCodingFormat == other.getAudioCodingFormat() &&
            this.audioSubType == other.getAudioSubType() &&
            this.channels == other.getChannels() &&
            this.audioDataRate == other.getAudioDataRate() &&
            this.audioSamplingFreq == other.getAudioSamplingFreq() &&
            this.audioBitDepth == other.getAudioBitDepth() &&
            this.blockAlign == other.getBlockAlign();
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
        _hashCode += getAudioCodingFormat();
        _hashCode += getAudioSubType();
        _hashCode += getChannels();
        _hashCode += getAudioDataRate();
        _hashCode += getAudioSamplingFreq();
        _hashCode += getAudioBitDepth();
        _hashCode += getBlockAlign();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ElementEntityElementMetadataAVFormatAudioInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>>ElementEntity>ElementMetadata>AVFormat>AudioInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audioCodingFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "AudioCodingFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audioSubType");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "AudioSubType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channels");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Channels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audioDataRate");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "AudioDataRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audioSamplingFreq");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "AudioSamplingFreq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audioBitDepth");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "AudioBitDepth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockAlign");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "BlockAlign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
