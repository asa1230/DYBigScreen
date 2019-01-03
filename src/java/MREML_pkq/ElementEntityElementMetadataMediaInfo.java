/**
 * ElementEntityElementMetadataMediaInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class ElementEntityElementMetadataMediaInfo  implements java.io.Serializable {
    /* 载体类型 */
    private java.lang.String mediaType;

    /* 载体入点 */
    private java.lang.String mediaSTPoint;

    /* 载体出点 */
    private java.lang.String mediaEDPoint;

    /* 载体标识 */
    private java.lang.String mediaID;

    /* 载体附加说明 */
    private java.lang.String mediaDescription;

    public ElementEntityElementMetadataMediaInfo() {
    }

    public ElementEntityElementMetadataMediaInfo(
           java.lang.String mediaType,
           java.lang.String mediaSTPoint,
           java.lang.String mediaEDPoint,
           java.lang.String mediaID,
           java.lang.String mediaDescription) {
           this.mediaType = mediaType;
           this.mediaSTPoint = mediaSTPoint;
           this.mediaEDPoint = mediaEDPoint;
           this.mediaID = mediaID;
           this.mediaDescription = mediaDescription;
    }


    /**
     * Gets the mediaType value for this ElementEntityElementMetadataMediaInfo.
     * 
     * @return mediaType   * 载体类型
     */
    public java.lang.String getMediaType() {
        return mediaType;
    }


    /**
     * Sets the mediaType value for this ElementEntityElementMetadataMediaInfo.
     * 
     * @param mediaType   * 载体类型
     */
    public void setMediaType(java.lang.String mediaType) {
        this.mediaType = mediaType;
    }


    /**
     * Gets the mediaSTPoint value for this ElementEntityElementMetadataMediaInfo.
     * 
     * @return mediaSTPoint   * 载体入点
     */
    public java.lang.String getMediaSTPoint() {
        return mediaSTPoint;
    }


    /**
     * Sets the mediaSTPoint value for this ElementEntityElementMetadataMediaInfo.
     * 
     * @param mediaSTPoint   * 载体入点
     */
    public void setMediaSTPoint(java.lang.String mediaSTPoint) {
        this.mediaSTPoint = mediaSTPoint;
    }


    /**
     * Gets the mediaEDPoint value for this ElementEntityElementMetadataMediaInfo.
     * 
     * @return mediaEDPoint   * 载体出点
     */
    public java.lang.String getMediaEDPoint() {
        return mediaEDPoint;
    }


    /**
     * Sets the mediaEDPoint value for this ElementEntityElementMetadataMediaInfo.
     * 
     * @param mediaEDPoint   * 载体出点
     */
    public void setMediaEDPoint(java.lang.String mediaEDPoint) {
        this.mediaEDPoint = mediaEDPoint;
    }


    /**
     * Gets the mediaID value for this ElementEntityElementMetadataMediaInfo.
     * 
     * @return mediaID   * 载体标识
     */
    public java.lang.String getMediaID() {
        return mediaID;
    }


    /**
     * Sets the mediaID value for this ElementEntityElementMetadataMediaInfo.
     * 
     * @param mediaID   * 载体标识
     */
    public void setMediaID(java.lang.String mediaID) {
        this.mediaID = mediaID;
    }


    /**
     * Gets the mediaDescription value for this ElementEntityElementMetadataMediaInfo.
     * 
     * @return mediaDescription   * 载体附加说明
     */
    public java.lang.String getMediaDescription() {
        return mediaDescription;
    }


    /**
     * Sets the mediaDescription value for this ElementEntityElementMetadataMediaInfo.
     * 
     * @param mediaDescription   * 载体附加说明
     */
    public void setMediaDescription(java.lang.String mediaDescription) {
        this.mediaDescription = mediaDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ElementEntityElementMetadataMediaInfo)) return false;
        ElementEntityElementMetadataMediaInfo other = (ElementEntityElementMetadataMediaInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mediaType==null && other.getMediaType()==null) || 
             (this.mediaType!=null &&
              this.mediaType.equals(other.getMediaType()))) &&
            ((this.mediaSTPoint==null && other.getMediaSTPoint()==null) || 
             (this.mediaSTPoint!=null &&
              this.mediaSTPoint.equals(other.getMediaSTPoint()))) &&
            ((this.mediaEDPoint==null && other.getMediaEDPoint()==null) || 
             (this.mediaEDPoint!=null &&
              this.mediaEDPoint.equals(other.getMediaEDPoint()))) &&
            ((this.mediaID==null && other.getMediaID()==null) || 
             (this.mediaID!=null &&
              this.mediaID.equals(other.getMediaID()))) &&
            ((this.mediaDescription==null && other.getMediaDescription()==null) || 
             (this.mediaDescription!=null &&
              this.mediaDescription.equals(other.getMediaDescription())));
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
        if (getMediaType() != null) {
            _hashCode += getMediaType().hashCode();
        }
        if (getMediaSTPoint() != null) {
            _hashCode += getMediaSTPoint().hashCode();
        }
        if (getMediaEDPoint() != null) {
            _hashCode += getMediaEDPoint().hashCode();
        }
        if (getMediaID() != null) {
            _hashCode += getMediaID().hashCode();
        }
        if (getMediaDescription() != null) {
            _hashCode += getMediaDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ElementEntityElementMetadataMediaInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>>ElementEntity>ElementMetadata>MediaInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediaType");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "MediaType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediaSTPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "MediaSTPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediaEDPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "MediaEDPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediaID");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "MediaID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediaDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "MediaDescription"));
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
