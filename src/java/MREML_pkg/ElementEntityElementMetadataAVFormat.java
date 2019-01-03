/**
 * ElementEntityElementMetadataAVFormat.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkg;

public class ElementEntityElementMetadataAVFormat  implements java.io.Serializable {
    private int streamMediaType;

    private int streamMediaSubType;

    private int isIncludeVideo;

    private int isIncludeAudio;

    private MREML_pkg.ElementEntityElementMetadataAVFormatVideoInfo videoInfo;

    private MREML_pkg.ElementEntityElementMetadataAVFormatAudioInfo audioInfo;

    public ElementEntityElementMetadataAVFormat() {
    }

    public ElementEntityElementMetadataAVFormat(
           int streamMediaType,
           int streamMediaSubType,
           int isIncludeVideo,
           int isIncludeAudio,
           MREML_pkg.ElementEntityElementMetadataAVFormatVideoInfo videoInfo,
           MREML_pkg.ElementEntityElementMetadataAVFormatAudioInfo audioInfo) {
           this.streamMediaType = streamMediaType;
           this.streamMediaSubType = streamMediaSubType;
           this.isIncludeVideo = isIncludeVideo;
           this.isIncludeAudio = isIncludeAudio;
           this.videoInfo = videoInfo;
           this.audioInfo = audioInfo;
    }


    /**
     * Gets the streamMediaType value for this ElementEntityElementMetadataAVFormat.
     * 
     * @return streamMediaType
     */
    public int getStreamMediaType() {
        return streamMediaType;
    }


    /**
     * Sets the streamMediaType value for this ElementEntityElementMetadataAVFormat.
     * 
     * @param streamMediaType
     */
    public void setStreamMediaType(int streamMediaType) {
        this.streamMediaType = streamMediaType;
    }


    /**
     * Gets the streamMediaSubType value for this ElementEntityElementMetadataAVFormat.
     * 
     * @return streamMediaSubType
     */
    public int getStreamMediaSubType() {
        return streamMediaSubType;
    }


    /**
     * Sets the streamMediaSubType value for this ElementEntityElementMetadataAVFormat.
     * 
     * @param streamMediaSubType
     */
    public void setStreamMediaSubType(int streamMediaSubType) {
        this.streamMediaSubType = streamMediaSubType;
    }


    /**
     * Gets the isIncludeVideo value for this ElementEntityElementMetadataAVFormat.
     * 
     * @return isIncludeVideo
     */
    public int getIsIncludeVideo() {
        return isIncludeVideo;
    }


    /**
     * Sets the isIncludeVideo value for this ElementEntityElementMetadataAVFormat.
     * 
     * @param isIncludeVideo
     */
    public void setIsIncludeVideo(int isIncludeVideo) {
        this.isIncludeVideo = isIncludeVideo;
    }


    /**
     * Gets the isIncludeAudio value for this ElementEntityElementMetadataAVFormat.
     * 
     * @return isIncludeAudio
     */
    public int getIsIncludeAudio() {
        return isIncludeAudio;
    }


    /**
     * Sets the isIncludeAudio value for this ElementEntityElementMetadataAVFormat.
     * 
     * @param isIncludeAudio
     */
    public void setIsIncludeAudio(int isIncludeAudio) {
        this.isIncludeAudio = isIncludeAudio;
    }


    /**
     * Gets the videoInfo value for this ElementEntityElementMetadataAVFormat.
     * 
     * @return videoInfo
     */
    public MREML_pkg.ElementEntityElementMetadataAVFormatVideoInfo getVideoInfo() {
        return videoInfo;
    }


    /**
     * Sets the videoInfo value for this ElementEntityElementMetadataAVFormat.
     * 
     * @param videoInfo
     */
    public void setVideoInfo(MREML_pkg.ElementEntityElementMetadataAVFormatVideoInfo videoInfo) {
        this.videoInfo = videoInfo;
    }


    /**
     * Gets the audioInfo value for this ElementEntityElementMetadataAVFormat.
     * 
     * @return audioInfo
     */
    public MREML_pkg.ElementEntityElementMetadataAVFormatAudioInfo getAudioInfo() {
        return audioInfo;
    }


    /**
     * Sets the audioInfo value for this ElementEntityElementMetadataAVFormat.
     * 
     * @param audioInfo
     */
    public void setAudioInfo(MREML_pkg.ElementEntityElementMetadataAVFormatAudioInfo audioInfo) {
        this.audioInfo = audioInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ElementEntityElementMetadataAVFormat)) return false;
        ElementEntityElementMetadataAVFormat other = (ElementEntityElementMetadataAVFormat) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.streamMediaType == other.getStreamMediaType() &&
            this.streamMediaSubType == other.getStreamMediaSubType() &&
            this.isIncludeVideo == other.getIsIncludeVideo() &&
            this.isIncludeAudio == other.getIsIncludeAudio() &&
            ((this.videoInfo==null && other.getVideoInfo()==null) || 
             (this.videoInfo!=null &&
              this.videoInfo.equals(other.getVideoInfo()))) &&
            ((this.audioInfo==null && other.getAudioInfo()==null) || 
             (this.audioInfo!=null &&
              this.audioInfo.equals(other.getAudioInfo())));
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
        _hashCode += getStreamMediaType();
        _hashCode += getStreamMediaSubType();
        _hashCode += getIsIncludeVideo();
        _hashCode += getIsIncludeAudio();
        if (getVideoInfo() != null) {
            _hashCode += getVideoInfo().hashCode();
        }
        if (getAudioInfo() != null) {
            _hashCode += getAudioInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ElementEntityElementMetadataAVFormat.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>ElementEntity>ElementMetadata>AVFormat"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streamMediaType");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "StreamMediaType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streamMediaSubType");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "StreamMediaSubType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isIncludeVideo");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "IsIncludeVideo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isIncludeAudio");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "IsIncludeAudio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "VideoInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>>ElementEntity>ElementMetadata>AVFormat>VideoInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audioInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "AudioInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>>ElementEntity>ElementMetadata>AVFormat>AudioInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
