/**
 * ResourceEntityResourceMetaDataInfoDescriptionKeyFrameInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class ResourceEntityResourceMetaDataInfoDescriptionKeyFrameInfo  implements java.io.Serializable {
    /* 关键帧帧序号 */
    private int markPoint;

    /* 关键帧类�? */
    private int keyFrameType;

    /* 关键帧描�? */
    private java.lang.String keyframeDescription;

    public ResourceEntityResourceMetaDataInfoDescriptionKeyFrameInfo() {
    }

    public ResourceEntityResourceMetaDataInfoDescriptionKeyFrameInfo(
           int markPoint,
           int keyFrameType,
           java.lang.String keyframeDescription) {
           this.markPoint = markPoint;
           this.keyFrameType = keyFrameType;
           this.keyframeDescription = keyframeDescription;
    }


    /**
     * Gets the markPoint value for this ResourceEntityResourceMetaDataInfoDescriptionKeyFrameInfo.
     * 
     * @return markPoint   * 关键帧帧序号
     */
    public int getMarkPoint() {
        return markPoint;
    }


    /**
     * Sets the markPoint value for this ResourceEntityResourceMetaDataInfoDescriptionKeyFrameInfo.
     * 
     * @param markPoint   * 关键帧帧序号
     */
    public void setMarkPoint(int markPoint) {
        this.markPoint = markPoint;
    }


    /**
     * Gets the keyFrameType value for this ResourceEntityResourceMetaDataInfoDescriptionKeyFrameInfo.
     * 
     * @return keyFrameType   * 关键帧类�?
     */
    public int getKeyFrameType() {
        return keyFrameType;
    }


    /**
     * Sets the keyFrameType value for this ResourceEntityResourceMetaDataInfoDescriptionKeyFrameInfo.
     * 
     * @param keyFrameType   * 关键帧类�?
     */
    public void setKeyFrameType(int keyFrameType) {
        this.keyFrameType = keyFrameType;
    }


    /**
     * Gets the keyframeDescription value for this ResourceEntityResourceMetaDataInfoDescriptionKeyFrameInfo.
     * 
     * @return keyframeDescription   * 关键帧描�?
     */
    public java.lang.String getKeyframeDescription() {
        return keyframeDescription;
    }


    /**
     * Sets the keyframeDescription value for this ResourceEntityResourceMetaDataInfoDescriptionKeyFrameInfo.
     * 
     * @param keyframeDescription   * 关键帧描�?
     */
    public void setKeyframeDescription(java.lang.String keyframeDescription) {
        this.keyframeDescription = keyframeDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResourceEntityResourceMetaDataInfoDescriptionKeyFrameInfo)) return false;
        ResourceEntityResourceMetaDataInfoDescriptionKeyFrameInfo other = (ResourceEntityResourceMetaDataInfoDescriptionKeyFrameInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.markPoint == other.getMarkPoint() &&
            this.keyFrameType == other.getKeyFrameType() &&
            ((this.keyframeDescription==null && other.getKeyframeDescription()==null) || 
             (this.keyframeDescription!=null &&
              this.keyframeDescription.equals(other.getKeyframeDescription())));
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
        _hashCode += getMarkPoint();
        _hashCode += getKeyFrameType();
        if (getKeyframeDescription() != null) {
            _hashCode += getKeyframeDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResourceEntityResourceMetaDataInfoDescriptionKeyFrameInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>>>ResourceEntity>ResourceMetaDataInfo>Description>KeyFrameInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "MarkPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyFrameType");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "KeyFrameType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyframeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "KeyframeDescription"));
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
