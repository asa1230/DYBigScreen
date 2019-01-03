/**
 * RequestEntityRequestExtendMSGAddTCCopyTaskRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class RequestEntityRequestExtendMSGAddTCCopyTaskRequest  implements java.io.Serializable {
    /* 转码能力 int 值用户自定义，用来实现不同机器转不同的任务类�? */
    private java.lang.Integer TCAbility;

    /* 转码成功后是否删除源文件 */
    private java.lang.Integer isDelSrc;

    /* 转码或拷贝后文件验证方式.0:不验证；1：验证时�? 2：验证文件大�? */
    private java.lang.Integer fileValidateMode;

    /* 目标文件�?在设备的网络连接类型�?0x0000//未知 0x0001//以太�? 0x0002//FC网络 0x0003//本地计算�? */
    private java.lang.Integer targetNetType;

    /* 音频混音信息。每个目标声道对应一个整数混音�?�，多个混音值之�?","分割�?
     * 	混音值的每个二进制位，代表源音频�?个声�?,�?低位代表0声道�?
     * 	比如1代表0声道�?4代表2声道�?5代表0�?2声道的混音�??
     * 	5,10代表目标有两个声道，分别�?0�?2声道�?1�?3声道的混音�?? */
    private java.lang.String audioMixerInfo;

    /* 源和目标格式�?致时是否进行重新编码 */
    private java.lang.Integer forceTranscode;

    /* 是否�?要生成台�? */
    private java.lang.Integer isAddLogoInfo;

    private MREML_pkq.RequestEntityRequestExtendMSGAddTCCopyTaskRequestLogoInfo logoInfo;

    public RequestEntityRequestExtendMSGAddTCCopyTaskRequest() {
    }

    public RequestEntityRequestExtendMSGAddTCCopyTaskRequest(
           java.lang.Integer TCAbility,
           java.lang.Integer isDelSrc,
           java.lang.Integer fileValidateMode,
           java.lang.Integer targetNetType,
           java.lang.String audioMixerInfo,
           java.lang.Integer forceTranscode,
           java.lang.Integer isAddLogoInfo,
           MREML_pkq.RequestEntityRequestExtendMSGAddTCCopyTaskRequestLogoInfo logoInfo) {
           this.TCAbility = TCAbility;
           this.isDelSrc = isDelSrc;
           this.fileValidateMode = fileValidateMode;
           this.targetNetType = targetNetType;
           this.audioMixerInfo = audioMixerInfo;
           this.forceTranscode = forceTranscode;
           this.isAddLogoInfo = isAddLogoInfo;
           this.logoInfo = logoInfo;
    }


    /**
     * Gets the TCAbility value for this RequestEntityRequestExtendMSGAddTCCopyTaskRequest.
     * 
     * @return TCAbility   * 转码能力 int 值用户自定义，用来实现不同机器转不同的任务类�?
     */
    public java.lang.Integer getTCAbility() {
        return TCAbility;
    }


    /**
     * Sets the TCAbility value for this RequestEntityRequestExtendMSGAddTCCopyTaskRequest.
     * 
     * @param TCAbility   * 转码能力 int 值用户自定义，用来实现不同机器转不同的任务类�?
     */
    public void setTCAbility(java.lang.Integer TCAbility) {
        this.TCAbility = TCAbility;
    }


    /**
     * Gets the isDelSrc value for this RequestEntityRequestExtendMSGAddTCCopyTaskRequest.
     * 
     * @return isDelSrc   * 转码成功后是否删除源文件
     */
    public java.lang.Integer getIsDelSrc() {
        return isDelSrc;
    }


    /**
     * Sets the isDelSrc value for this RequestEntityRequestExtendMSGAddTCCopyTaskRequest.
     * 
     * @param isDelSrc   * 转码成功后是否删除源文件
     */
    public void setIsDelSrc(java.lang.Integer isDelSrc) {
        this.isDelSrc = isDelSrc;
    }


    /**
     * Gets the fileValidateMode value for this RequestEntityRequestExtendMSGAddTCCopyTaskRequest.
     * 
     * @return fileValidateMode   * 转码或拷贝后文件验证方式.0:不验证；1：验证时�? 2：验证文件大�?
     */
    public java.lang.Integer getFileValidateMode() {
        return fileValidateMode;
    }


    /**
     * Sets the fileValidateMode value for this RequestEntityRequestExtendMSGAddTCCopyTaskRequest.
     * 
     * @param fileValidateMode   * 转码或拷贝后文件验证方式.0:不验证；1：验证时�? 2：验证文件大�?
     */
    public void setFileValidateMode(java.lang.Integer fileValidateMode) {
        this.fileValidateMode = fileValidateMode;
    }


    /**
     * Gets the targetNetType value for this RequestEntityRequestExtendMSGAddTCCopyTaskRequest.
     * 
     * @return targetNetType   * 目标文件�?在设备的网络连接类型�?0x0000//未知 0x0001//以太�? 0x0002//FC网络 0x0003//本地计算�?
     */
    public java.lang.Integer getTargetNetType() {
        return targetNetType;
    }


    /**
     * Sets the targetNetType value for this RequestEntityRequestExtendMSGAddTCCopyTaskRequest.
     * 
     * @param targetNetType   * 目标文件�?在设备的网络连接类型�?0x0000//未知 0x0001//以太�? 0x0002//FC网络 0x0003//本地计算�?
     */
    public void setTargetNetType(java.lang.Integer targetNetType) {
        this.targetNetType = targetNetType;
    }


    /**
     * Gets the audioMixerInfo value for this RequestEntityRequestExtendMSGAddTCCopyTaskRequest.
     * 
     * @return audioMixerInfo   * 音频混音信息。每个目标声道对应一个整数混音�?�，多个混音值之�?","分割�?
     * 	混音值的每个二进制位，代表源音频�?个声�?,�?低位代表0声道�?
     * 	比如1代表0声道�?4代表2声道�?5代表0�?2声道的混音�??
     * 	5,10代表目标有两个声道，分别�?0�?2声道�?1�?3声道的混音�??
     */
    public java.lang.String getAudioMixerInfo() {
        return audioMixerInfo;
    }


    /**
     * Sets the audioMixerInfo value for this RequestEntityRequestExtendMSGAddTCCopyTaskRequest.
     * 
     * @param audioMixerInfo   * 音频混音信息。每个目标声道对应一个整数混音�?�，多个混音值之�?","分割�?
     * 	混音值的每个二进制位，代表源音频�?个声�?,�?低位代表0声道�?
     * 	比如1代表0声道�?4代表2声道�?5代表0�?2声道的混音�??
     * 	5,10代表目标有两个声道，分别�?0�?2声道�?1�?3声道的混音�??
     */
    public void setAudioMixerInfo(java.lang.String audioMixerInfo) {
        this.audioMixerInfo = audioMixerInfo;
    }


    /**
     * Gets the forceTranscode value for this RequestEntityRequestExtendMSGAddTCCopyTaskRequest.
     * 
     * @return forceTranscode   * 源和目标格式�?致时是否进行重新编码
     */
    public java.lang.Integer getForceTranscode() {
        return forceTranscode;
    }


    /**
     * Sets the forceTranscode value for this RequestEntityRequestExtendMSGAddTCCopyTaskRequest.
     * 
     * @param forceTranscode   * 源和目标格式�?致时是否进行重新编码
     */
    public void setForceTranscode(java.lang.Integer forceTranscode) {
        this.forceTranscode = forceTranscode;
    }


    /**
     * Gets the isAddLogoInfo value for this RequestEntityRequestExtendMSGAddTCCopyTaskRequest.
     * 
     * @return isAddLogoInfo   * 是否�?要生成台�?
     */
    public java.lang.Integer getIsAddLogoInfo() {
        return isAddLogoInfo;
    }


    /**
     * Sets the isAddLogoInfo value for this RequestEntityRequestExtendMSGAddTCCopyTaskRequest.
     * 
     * @param isAddLogoInfo   * 是否�?要生成台�?
     */
    public void setIsAddLogoInfo(java.lang.Integer isAddLogoInfo) {
        this.isAddLogoInfo = isAddLogoInfo;
    }


    /**
     * Gets the logoInfo value for this RequestEntityRequestExtendMSGAddTCCopyTaskRequest.
     * 
     * @return logoInfo
     */
    public MREML_pkq.RequestEntityRequestExtendMSGAddTCCopyTaskRequestLogoInfo getLogoInfo() {
        return logoInfo;
    }


    /**
     * Sets the logoInfo value for this RequestEntityRequestExtendMSGAddTCCopyTaskRequest.
     * 
     * @param logoInfo
     */
    public void setLogoInfo(MREML_pkq.RequestEntityRequestExtendMSGAddTCCopyTaskRequestLogoInfo logoInfo) {
        this.logoInfo = logoInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestEntityRequestExtendMSGAddTCCopyTaskRequest)) return false;
        RequestEntityRequestExtendMSGAddTCCopyTaskRequest other = (RequestEntityRequestExtendMSGAddTCCopyTaskRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.TCAbility==null && other.getTCAbility()==null) || 
             (this.TCAbility!=null &&
              this.TCAbility.equals(other.getTCAbility()))) &&
            ((this.isDelSrc==null && other.getIsDelSrc()==null) || 
             (this.isDelSrc!=null &&
              this.isDelSrc.equals(other.getIsDelSrc()))) &&
            ((this.fileValidateMode==null && other.getFileValidateMode()==null) || 
             (this.fileValidateMode!=null &&
              this.fileValidateMode.equals(other.getFileValidateMode()))) &&
            ((this.targetNetType==null && other.getTargetNetType()==null) || 
             (this.targetNetType!=null &&
              this.targetNetType.equals(other.getTargetNetType()))) &&
            ((this.audioMixerInfo==null && other.getAudioMixerInfo()==null) || 
             (this.audioMixerInfo!=null &&
              this.audioMixerInfo.equals(other.getAudioMixerInfo()))) &&
            ((this.forceTranscode==null && other.getForceTranscode()==null) || 
             (this.forceTranscode!=null &&
              this.forceTranscode.equals(other.getForceTranscode()))) &&
            ((this.isAddLogoInfo==null && other.getIsAddLogoInfo()==null) || 
             (this.isAddLogoInfo!=null &&
              this.isAddLogoInfo.equals(other.getIsAddLogoInfo()))) &&
            ((this.logoInfo==null && other.getLogoInfo()==null) || 
             (this.logoInfo!=null &&
              this.logoInfo.equals(other.getLogoInfo())));
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
        if (getTCAbility() != null) {
            _hashCode += getTCAbility().hashCode();
        }
        if (getIsDelSrc() != null) {
            _hashCode += getIsDelSrc().hashCode();
        }
        if (getFileValidateMode() != null) {
            _hashCode += getFileValidateMode().hashCode();
        }
        if (getTargetNetType() != null) {
            _hashCode += getTargetNetType().hashCode();
        }
        if (getAudioMixerInfo() != null) {
            _hashCode += getAudioMixerInfo().hashCode();
        }
        if (getForceTranscode() != null) {
            _hashCode += getForceTranscode().hashCode();
        }
        if (getIsAddLogoInfo() != null) {
            _hashCode += getIsAddLogoInfo().hashCode();
        }
        if (getLogoInfo() != null) {
            _hashCode += getLogoInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestEntityRequestExtendMSGAddTCCopyTaskRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>>RequestEntity>RequestExtendMSG>AddTCCopyTaskRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCAbility");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "TCAbility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDelSrc");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "IsDelSrc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileValidateMode");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "FileValidateMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetNetType");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "TargetNetType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audioMixerInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "AudioMixerInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forceTranscode");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ForceTranscode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAddLogoInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "IsAddLogoInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logoInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "LogoInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>>>RequestEntity>RequestExtendMSG>AddTCCopyTaskRequest>LogoInfo"));
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
