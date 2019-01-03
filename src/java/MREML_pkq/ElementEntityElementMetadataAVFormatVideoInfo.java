/**
 * ElementEntityElementMetadataAVFormatVideoInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class ElementEntityElementMetadataAVFormatVideoInfo  implements java.io.Serializable {
    /* 视频编码类型 */
    private int videoCodingFormat;

    /* 视频编解码的子类�? */
    private int videoSubType;

    /* 画面X尺寸 */
    private int CXSize;

    /* 画面Y尺寸 */
    private int CYSize;

    /* 基本帧频 */
    private int standardRate;

    /* 系数（用于帧序号计算�? */
    private int standardScale;

    /* 扫描模式 */
    private int scanMode;

    /* 视频颜色格式 */
    private int colorFormat;

    /* 视频码率 */
    private int videoBitrate;

    /* 是否为恒定码率编�? */
    private int isConstantRate;

    /* IBP帧压缩类型时的IBP帧组大小 */
    private int GOPSize;

    /* IBP帧压缩类型时IP帧的间隔周期 */
    private int referencePeriod;

    /* 1:Y[16-235]---normal, 0:Y[0-255]---KEY */
    private int isY16_235;

    public ElementEntityElementMetadataAVFormatVideoInfo() {
    }

    public ElementEntityElementMetadataAVFormatVideoInfo(
           int videoCodingFormat,
           int videoSubType,
           int CXSize,
           int CYSize,
           int standardRate,
           int standardScale,
           int scanMode,
           int colorFormat,
           int videoBitrate,
           int isConstantRate,
           int GOPSize,
           int referencePeriod,
           int isY16_235) {
           this.videoCodingFormat = videoCodingFormat;
           this.videoSubType = videoSubType;
           this.CXSize = CXSize;
           this.CYSize = CYSize;
           this.standardRate = standardRate;
           this.standardScale = standardScale;
           this.scanMode = scanMode;
           this.colorFormat = colorFormat;
           this.videoBitrate = videoBitrate;
           this.isConstantRate = isConstantRate;
           this.GOPSize = GOPSize;
           this.referencePeriod = referencePeriod;
           this.isY16_235 = isY16_235;
    }


    /**
     * Gets the videoCodingFormat value for this ElementEntityElementMetadataAVFormatVideoInfo.
     * 
     * @return videoCodingFormat   * 视频编码类型
     */
    public int getVideoCodingFormat() {
        return videoCodingFormat;
    }


    /**
     * Sets the videoCodingFormat value for this ElementEntityElementMetadataAVFormatVideoInfo.
     * 
     * @param videoCodingFormat   * 视频编码类型
     */
    public void setVideoCodingFormat(int videoCodingFormat) {
        this.videoCodingFormat = videoCodingFormat;
    }


    /**
     * Gets the videoSubType value for this ElementEntityElementMetadataAVFormatVideoInfo.
     * 
     * @return videoSubType   * 视频编解码的子类�?
     */
    public int getVideoSubType() {
        return videoSubType;
    }


    /**
     * Sets the videoSubType value for this ElementEntityElementMetadataAVFormatVideoInfo.
     * 
     * @param videoSubType   * 视频编解码的子类�?
     */
    public void setVideoSubType(int videoSubType) {
        this.videoSubType = videoSubType;
    }


    /**
     * Gets the CXSize value for this ElementEntityElementMetadataAVFormatVideoInfo.
     * 
     * @return CXSize   * 画面X尺寸
     */
    public int getCXSize() {
        return CXSize;
    }


    /**
     * Sets the CXSize value for this ElementEntityElementMetadataAVFormatVideoInfo.
     * 
     * @param CXSize   * 画面X尺寸
     */
    public void setCXSize(int CXSize) {
        this.CXSize = CXSize;
    }


    /**
     * Gets the CYSize value for this ElementEntityElementMetadataAVFormatVideoInfo.
     * 
     * @return CYSize   * 画面Y尺寸
     */
    public int getCYSize() {
        return CYSize;
    }


    /**
     * Sets the CYSize value for this ElementEntityElementMetadataAVFormatVideoInfo.
     * 
     * @param CYSize   * 画面Y尺寸
     */
    public void setCYSize(int CYSize) {
        this.CYSize = CYSize;
    }


    /**
     * Gets the standardRate value for this ElementEntityElementMetadataAVFormatVideoInfo.
     * 
     * @return standardRate   * 基本帧频
     */
    public int getStandardRate() {
        return standardRate;
    }


    /**
     * Sets the standardRate value for this ElementEntityElementMetadataAVFormatVideoInfo.
     * 
     * @param standardRate   * 基本帧频
     */
    public void setStandardRate(int standardRate) {
        this.standardRate = standardRate;
    }


    /**
     * Gets the standardScale value for this ElementEntityElementMetadataAVFormatVideoInfo.
     * 
     * @return standardScale   * 系数（用于帧序号计算�?
     */
    public int getStandardScale() {
        return standardScale;
    }


    /**
     * Sets the standardScale value for this ElementEntityElementMetadataAVFormatVideoInfo.
     * 
     * @param standardScale   * 系数（用于帧序号计算�?
     */
    public void setStandardScale(int standardScale) {
        this.standardScale = standardScale;
    }


    /**
     * Gets the scanMode value for this ElementEntityElementMetadataAVFormatVideoInfo.
     * 
     * @return scanMode   * 扫描模式
     */
    public int getScanMode() {
        return scanMode;
    }


    /**
     * Sets the scanMode value for this ElementEntityElementMetadataAVFormatVideoInfo.
     * 
     * @param scanMode   * 扫描模式
     */
    public void setScanMode(int scanMode) {
        this.scanMode = scanMode;
    }


    /**
     * Gets the colorFormat value for this ElementEntityElementMetadataAVFormatVideoInfo.
     * 
     * @return colorFormat   * 视频颜色格式
     */
    public int getColorFormat() {
        return colorFormat;
    }


    /**
     * Sets the colorFormat value for this ElementEntityElementMetadataAVFormatVideoInfo.
     * 
     * @param colorFormat   * 视频颜色格式
     */
    public void setColorFormat(int colorFormat) {
        this.colorFormat = colorFormat;
    }


    /**
     * Gets the videoBitrate value for this ElementEntityElementMetadataAVFormatVideoInfo.
     * 
     * @return videoBitrate   * 视频码率
     */
    public int getVideoBitrate() {
        return videoBitrate;
    }


    /**
     * Sets the videoBitrate value for this ElementEntityElementMetadataAVFormatVideoInfo.
     * 
     * @param videoBitrate   * 视频码率
     */
    public void setVideoBitrate(int videoBitrate) {
        this.videoBitrate = videoBitrate;
    }


    /**
     * Gets the isConstantRate value for this ElementEntityElementMetadataAVFormatVideoInfo.
     * 
     * @return isConstantRate   * 是否为恒定码率编�?
     */
    public int getIsConstantRate() {
        return isConstantRate;
    }


    /**
     * Sets the isConstantRate value for this ElementEntityElementMetadataAVFormatVideoInfo.
     * 
     * @param isConstantRate   * 是否为恒定码率编�?
     */
    public void setIsConstantRate(int isConstantRate) {
        this.isConstantRate = isConstantRate;
    }


    /**
     * Gets the GOPSize value for this ElementEntityElementMetadataAVFormatVideoInfo.
     * 
     * @return GOPSize   * IBP帧压缩类型时的IBP帧组大小
     */
    public int getGOPSize() {
        return GOPSize;
    }


    /**
     * Sets the GOPSize value for this ElementEntityElementMetadataAVFormatVideoInfo.
     * 
     * @param GOPSize   * IBP帧压缩类型时的IBP帧组大小
     */
    public void setGOPSize(int GOPSize) {
        this.GOPSize = GOPSize;
    }


    /**
     * Gets the referencePeriod value for this ElementEntityElementMetadataAVFormatVideoInfo.
     * 
     * @return referencePeriod   * IBP帧压缩类型时IP帧的间隔周期
     */
    public int getReferencePeriod() {
        return referencePeriod;
    }


    /**
     * Sets the referencePeriod value for this ElementEntityElementMetadataAVFormatVideoInfo.
     * 
     * @param referencePeriod   * IBP帧压缩类型时IP帧的间隔周期
     */
    public void setReferencePeriod(int referencePeriod) {
        this.referencePeriod = referencePeriod;
    }


    /**
     * Gets the isY16_235 value for this ElementEntityElementMetadataAVFormatVideoInfo.
     * 
     * @return isY16_235   * 1:Y[16-235]---normal, 0:Y[0-255]---KEY
     */
    public int getIsY16_235() {
        return isY16_235;
    }


    /**
     * Sets the isY16_235 value for this ElementEntityElementMetadataAVFormatVideoInfo.
     * 
     * @param isY16_235   * 1:Y[16-235]---normal, 0:Y[0-255]---KEY
     */
    public void setIsY16_235(int isY16_235) {
        this.isY16_235 = isY16_235;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ElementEntityElementMetadataAVFormatVideoInfo)) return false;
        ElementEntityElementMetadataAVFormatVideoInfo other = (ElementEntityElementMetadataAVFormatVideoInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.videoCodingFormat == other.getVideoCodingFormat() &&
            this.videoSubType == other.getVideoSubType() &&
            this.CXSize == other.getCXSize() &&
            this.CYSize == other.getCYSize() &&
            this.standardRate == other.getStandardRate() &&
            this.standardScale == other.getStandardScale() &&
            this.scanMode == other.getScanMode() &&
            this.colorFormat == other.getColorFormat() &&
            this.videoBitrate == other.getVideoBitrate() &&
            this.isConstantRate == other.getIsConstantRate() &&
            this.GOPSize == other.getGOPSize() &&
            this.referencePeriod == other.getReferencePeriod() &&
            this.isY16_235 == other.getIsY16_235();
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
        _hashCode += getVideoCodingFormat();
        _hashCode += getVideoSubType();
        _hashCode += getCXSize();
        _hashCode += getCYSize();
        _hashCode += getStandardRate();
        _hashCode += getStandardScale();
        _hashCode += getScanMode();
        _hashCode += getColorFormat();
        _hashCode += getVideoBitrate();
        _hashCode += getIsConstantRate();
        _hashCode += getGOPSize();
        _hashCode += getReferencePeriod();
        _hashCode += getIsY16_235();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ElementEntityElementMetadataAVFormatVideoInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>>>ElementEntity>ElementMetadata>AVFormat>VideoInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoCodingFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "VideoCodingFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoSubType");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "VideoSubType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CXSize");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "CXSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CYSize");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "CYSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("standardRate");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "StandardRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("standardScale");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "StandardScale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scanMode");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ScanMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colorFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ColorFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoBitrate");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "VideoBitrate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isConstantRate");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "IsConstantRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GOPSize");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "GOPSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referencePeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ReferencePeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isY16_235");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "IsY16_235"));
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
