/**
 * MREMLMREMLRequestEntityRequestExtendMSGAddTCCopyTaskRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class MREMLMREMLRequestEntityRequestExtendMSGAddTCCopyTaskRequest  implements java.io.Serializable {
    private java.lang.Integer TCAbility;

    private java.lang.Integer isDelSrc;

    private java.lang.Integer fileValidateMode;

    private java.lang.Integer targetNetType;

    private java.lang.String audioMixerInfo;

    private java.lang.Integer forceTranscode;

    private java.lang.Integer isAddLogoInfo;

    private MREML_pkq.MREMLMREMLRequestEntityRequestExtendMSGAddTCCopyTaskRequestLogoInfo logoInfo;

    public MREMLMREMLRequestEntityRequestExtendMSGAddTCCopyTaskRequest() {
    }

    public MREMLMREMLRequestEntityRequestExtendMSGAddTCCopyTaskRequest(
           java.lang.Integer TCAbility,
           java.lang.Integer isDelSrc,
           java.lang.Integer fileValidateMode,
           java.lang.Integer targetNetType,
           java.lang.String audioMixerInfo,
           java.lang.Integer forceTranscode,
           java.lang.Integer isAddLogoInfo,
           MREML_pkq.MREMLMREMLRequestEntityRequestExtendMSGAddTCCopyTaskRequestLogoInfo logoInfo) {
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
     * Gets the TCAbility value for this MREMLMREMLRequestEntityRequestExtendMSGAddTCCopyTaskRequest.
     * 
     * @return TCAbility
     */
    public java.lang.Integer getTCAbility() {
        return TCAbility;
    }


    /**
     * Sets the TCAbility value for this MREMLMREMLRequestEntityRequestExtendMSGAddTCCopyTaskRequest.
     * 
     * @param TCAbility
     */
    public void setTCAbility(java.lang.Integer TCAbility) {
        this.TCAbility = TCAbility;
    }


    /**
     * Gets the isDelSrc value for this MREMLMREMLRequestEntityRequestExtendMSGAddTCCopyTaskRequest.
     * 
     * @return isDelSrc
     */
    public java.lang.Integer getIsDelSrc() {
        return isDelSrc;
    }


    /**
     * Sets the isDelSrc value for this MREMLMREMLRequestEntityRequestExtendMSGAddTCCopyTaskRequest.
     * 
     * @param isDelSrc
     */
    public void setIsDelSrc(java.lang.Integer isDelSrc) {
        this.isDelSrc = isDelSrc;
    }


    /**
     * Gets the fileValidateMode value for this MREMLMREMLRequestEntityRequestExtendMSGAddTCCopyTaskRequest.
     * 
     * @return fileValidateMode
     */
    public java.lang.Integer getFileValidateMode() {
        return fileValidateMode;
    }


    /**
     * Sets the fileValidateMode value for this MREMLMREMLRequestEntityRequestExtendMSGAddTCCopyTaskRequest.
     * 
     * @param fileValidateMode
     */
    public void setFileValidateMode(java.lang.Integer fileValidateMode) {
        this.fileValidateMode = fileValidateMode;
    }


    /**
     * Gets the targetNetType value for this MREMLMREMLRequestEntityRequestExtendMSGAddTCCopyTaskRequest.
     * 
     * @return targetNetType
     */
    public java.lang.Integer getTargetNetType() {
        return targetNetType;
    }


    /**
     * Sets the targetNetType value for this MREMLMREMLRequestEntityRequestExtendMSGAddTCCopyTaskRequest.
     * 
     * @param targetNetType
     */
    public void setTargetNetType(java.lang.Integer targetNetType) {
        this.targetNetType = targetNetType;
    }


    /**
     * Gets the audioMixerInfo value for this MREMLMREMLRequestEntityRequestExtendMSGAddTCCopyTaskRequest.
     * 
     * @return audioMixerInfo
     */
    public java.lang.String getAudioMixerInfo() {
        return audioMixerInfo;
    }


    /**
     * Sets the audioMixerInfo value for this MREMLMREMLRequestEntityRequestExtendMSGAddTCCopyTaskRequest.
     * 
     * @param audioMixerInfo
     */
    public void setAudioMixerInfo(java.lang.String audioMixerInfo) {
        this.audioMixerInfo = audioMixerInfo;
    }


    /**
     * Gets the forceTranscode value for this MREMLMREMLRequestEntityRequestExtendMSGAddTCCopyTaskRequest.
     * 
     * @return forceTranscode
     */
    public java.lang.Integer getForceTranscode() {
        return forceTranscode;
    }


    /**
     * Sets the forceTranscode value for this MREMLMREMLRequestEntityRequestExtendMSGAddTCCopyTaskRequest.
     * 
     * @param forceTranscode
     */
    public void setForceTranscode(java.lang.Integer forceTranscode) {
        this.forceTranscode = forceTranscode;
    }


    /**
     * Gets the isAddLogoInfo value for this MREMLMREMLRequestEntityRequestExtendMSGAddTCCopyTaskRequest.
     * 
     * @return isAddLogoInfo
     */
    public java.lang.Integer getIsAddLogoInfo() {
        return isAddLogoInfo;
    }


    /**
     * Sets the isAddLogoInfo value for this MREMLMREMLRequestEntityRequestExtendMSGAddTCCopyTaskRequest.
     * 
     * @param isAddLogoInfo
     */
    public void setIsAddLogoInfo(java.lang.Integer isAddLogoInfo) {
        this.isAddLogoInfo = isAddLogoInfo;
    }


    /**
     * Gets the logoInfo value for this MREMLMREMLRequestEntityRequestExtendMSGAddTCCopyTaskRequest.
     * 
     * @return logoInfo
     */
    public MREML_pkq.MREMLMREMLRequestEntityRequestExtendMSGAddTCCopyTaskRequestLogoInfo getLogoInfo() {
        return logoInfo;
    }


    /**
     * Sets the logoInfo value for this MREMLMREMLRequestEntityRequestExtendMSGAddTCCopyTaskRequest.
     * 
     * @param logoInfo
     */
    public void setLogoInfo(MREML_pkq.MREMLMREMLRequestEntityRequestExtendMSGAddTCCopyTaskRequestLogoInfo logoInfo) {
        this.logoInfo = logoInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MREMLMREMLRequestEntityRequestExtendMSGAddTCCopyTaskRequest)) return false;
        MREMLMREMLRequestEntityRequestExtendMSGAddTCCopyTaskRequest other = (MREMLMREMLRequestEntityRequestExtendMSGAddTCCopyTaskRequest) obj;
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
        new org.apache.axis.description.TypeDesc(MREMLMREMLRequestEntityRequestExtendMSGAddTCCopyTaskRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>>>MREML>MREML>RequestEntity>RequestExtendMSG>AddTCCopyTaskRequest"));
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
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileValidateMode");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "FileValidateMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetNetType");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "TargetNetType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audioMixerInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "AudioMixerInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forceTranscode");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ForceTranscode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAddLogoInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "IsAddLogoInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logoInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "LogoInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>>>>MREML>MREML>RequestEntity>RequestExtendMSG>AddTCCopyTaskRequest>LogoInfo"));
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
