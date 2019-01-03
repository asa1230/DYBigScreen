/**
 * RequestEntityRequestExtendMSGAddTCCopyTaskRequestLogoInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class RequestEntityRequestExtendMSGAddTCCopyTaskRequestLogoInfo  implements java.io.Serializable {
    /* 图象文件名字,可以是TAG或BMP32位图 */
    private java.lang.String picFileName;

    /* 叠加的开始位�? */
    private java.lang.Integer startPointX;

    /* 叠加的开始位�? */
    private java.lang.Integer startPointY;

    /* 叠加的大�?(像素单位) */
    private java.lang.Integer sizeX;

    /* 叠加的大�?(像素单位) */
    private java.lang.Integer sizeY;

    /* 是否使用输入的Alpha�? */
    private java.lang.Integer bUseAlpha;

    /* 输入的Alpha�? */
    private java.lang.Integer alpha;

    public RequestEntityRequestExtendMSGAddTCCopyTaskRequestLogoInfo() {
    }

    public RequestEntityRequestExtendMSGAddTCCopyTaskRequestLogoInfo(
           java.lang.String picFileName,
           java.lang.Integer startPointX,
           java.lang.Integer startPointY,
           java.lang.Integer sizeX,
           java.lang.Integer sizeY,
           java.lang.Integer bUseAlpha,
           java.lang.Integer alpha) {
           this.picFileName = picFileName;
           this.startPointX = startPointX;
           this.startPointY = startPointY;
           this.sizeX = sizeX;
           this.sizeY = sizeY;
           this.bUseAlpha = bUseAlpha;
           this.alpha = alpha;
    }


    /**
     * Gets the picFileName value for this RequestEntityRequestExtendMSGAddTCCopyTaskRequestLogoInfo.
     * 
     * @return picFileName   * 图象文件名字,可以是TAG或BMP32位图
     */
    public java.lang.String getPicFileName() {
        return picFileName;
    }


    /**
     * Sets the picFileName value for this RequestEntityRequestExtendMSGAddTCCopyTaskRequestLogoInfo.
     * 
     * @param picFileName   * 图象文件名字,可以是TAG或BMP32位图
     */
    public void setPicFileName(java.lang.String picFileName) {
        this.picFileName = picFileName;
    }


    /**
     * Gets the startPointX value for this RequestEntityRequestExtendMSGAddTCCopyTaskRequestLogoInfo.
     * 
     * @return startPointX   * 叠加的开始位�?
     */
    public java.lang.Integer getStartPointX() {
        return startPointX;
    }


    /**
     * Sets the startPointX value for this RequestEntityRequestExtendMSGAddTCCopyTaskRequestLogoInfo.
     * 
     * @param startPointX   * 叠加的开始位�?
     */
    public void setStartPointX(java.lang.Integer startPointX) {
        this.startPointX = startPointX;
    }


    /**
     * Gets the startPointY value for this RequestEntityRequestExtendMSGAddTCCopyTaskRequestLogoInfo.
     * 
     * @return startPointY   * 叠加的开始位�?
     */
    public java.lang.Integer getStartPointY() {
        return startPointY;
    }


    /**
     * Sets the startPointY value for this RequestEntityRequestExtendMSGAddTCCopyTaskRequestLogoInfo.
     * 
     * @param startPointY   * 叠加的开始位�?
     */
    public void setStartPointY(java.lang.Integer startPointY) {
        this.startPointY = startPointY;
    }


    /**
     * Gets the sizeX value for this RequestEntityRequestExtendMSGAddTCCopyTaskRequestLogoInfo.
     * 
     * @return sizeX   * 叠加的大�?(像素单位)
     */
    public java.lang.Integer getSizeX() {
        return sizeX;
    }


    /**
     * Sets the sizeX value for this RequestEntityRequestExtendMSGAddTCCopyTaskRequestLogoInfo.
     * 
     * @param sizeX   * 叠加的大�?(像素单位)
     */
    public void setSizeX(java.lang.Integer sizeX) {
        this.sizeX = sizeX;
    }


    /**
     * Gets the sizeY value for this RequestEntityRequestExtendMSGAddTCCopyTaskRequestLogoInfo.
     * 
     * @return sizeY   * 叠加的大�?(像素单位)
     */
    public java.lang.Integer getSizeY() {
        return sizeY;
    }


    /**
     * Sets the sizeY value for this RequestEntityRequestExtendMSGAddTCCopyTaskRequestLogoInfo.
     * 
     * @param sizeY   * 叠加的大�?(像素单位)
     */
    public void setSizeY(java.lang.Integer sizeY) {
        this.sizeY = sizeY;
    }


    /**
     * Gets the bUseAlpha value for this RequestEntityRequestExtendMSGAddTCCopyTaskRequestLogoInfo.
     * 
     * @return bUseAlpha   * 是否使用输入的Alpha�?
     */
    public java.lang.Integer getBUseAlpha() {
        return bUseAlpha;
    }


    /**
     * Sets the bUseAlpha value for this RequestEntityRequestExtendMSGAddTCCopyTaskRequestLogoInfo.
     * 
     * @param bUseAlpha   * 是否使用输入的Alpha�?
     */
    public void setBUseAlpha(java.lang.Integer bUseAlpha) {
        this.bUseAlpha = bUseAlpha;
    }


    /**
     * Gets the alpha value for this RequestEntityRequestExtendMSGAddTCCopyTaskRequestLogoInfo.
     * 
     * @return alpha   * 输入的Alpha�?
     */
    public java.lang.Integer getAlpha() {
        return alpha;
    }


    /**
     * Sets the alpha value for this RequestEntityRequestExtendMSGAddTCCopyTaskRequestLogoInfo.
     * 
     * @param alpha   * 输入的Alpha�?
     */
    public void setAlpha(java.lang.Integer alpha) {
        this.alpha = alpha;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestEntityRequestExtendMSGAddTCCopyTaskRequestLogoInfo)) return false;
        RequestEntityRequestExtendMSGAddTCCopyTaskRequestLogoInfo other = (RequestEntityRequestExtendMSGAddTCCopyTaskRequestLogoInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.picFileName==null && other.getPicFileName()==null) || 
             (this.picFileName!=null &&
              this.picFileName.equals(other.getPicFileName()))) &&
            ((this.startPointX==null && other.getStartPointX()==null) || 
             (this.startPointX!=null &&
              this.startPointX.equals(other.getStartPointX()))) &&
            ((this.startPointY==null && other.getStartPointY()==null) || 
             (this.startPointY!=null &&
              this.startPointY.equals(other.getStartPointY()))) &&
            ((this.sizeX==null && other.getSizeX()==null) || 
             (this.sizeX!=null &&
              this.sizeX.equals(other.getSizeX()))) &&
            ((this.sizeY==null && other.getSizeY()==null) || 
             (this.sizeY!=null &&
              this.sizeY.equals(other.getSizeY()))) &&
            ((this.bUseAlpha==null && other.getBUseAlpha()==null) || 
             (this.bUseAlpha!=null &&
              this.bUseAlpha.equals(other.getBUseAlpha()))) &&
            ((this.alpha==null && other.getAlpha()==null) || 
             (this.alpha!=null &&
              this.alpha.equals(other.getAlpha())));
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
        if (getPicFileName() != null) {
            _hashCode += getPicFileName().hashCode();
        }
        if (getStartPointX() != null) {
            _hashCode += getStartPointX().hashCode();
        }
        if (getStartPointY() != null) {
            _hashCode += getStartPointY().hashCode();
        }
        if (getSizeX() != null) {
            _hashCode += getSizeX().hashCode();
        }
        if (getSizeY() != null) {
            _hashCode += getSizeY().hashCode();
        }
        if (getBUseAlpha() != null) {
            _hashCode += getBUseAlpha().hashCode();
        }
        if (getAlpha() != null) {
            _hashCode += getAlpha().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestEntityRequestExtendMSGAddTCCopyTaskRequestLogoInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>>>RequestEntity>RequestExtendMSG>AddTCCopyTaskRequest>LogoInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("picFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "PicFileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startPointX");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "StartPointX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startPointY");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "StartPointY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sizeX");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "SizeX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sizeY");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "SizeY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BUseAlpha");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "bUseAlpha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alpha");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Alpha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
