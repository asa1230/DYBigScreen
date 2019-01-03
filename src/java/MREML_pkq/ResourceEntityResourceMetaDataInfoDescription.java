/**
 * ResourceEntityResourceMetaDataInfoDescription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class ResourceEntityResourceMetaDataInfoDescription  implements java.io.Serializable {
    /* 内容描述 */
    private java.lang.String contentDescription;

    /* 频道名称 */
    private java.lang.String channelName;

    /* 栏目 */
    private MREML_pkq.ResourceEntityResourceMetaDataInfoDescriptionColumn[] column;

    /* 场记信息 */
    private MREML_pkq.ResourceEntityResourceMetaDataInfoDescriptionSceneDescription[] sceneDescription;

    /* 同期声信�? */
    private java.lang.String naturalSound;

    /* 关键帧信�? */
    private MREML_pkq.ResourceEntityResourceMetaDataInfoDescriptionKeyFrameInfo[] keyFrameInfo;

    /* 图标帧（肖像）所在的Frame */
    private java.lang.Integer frameofIcon;

    public ResourceEntityResourceMetaDataInfoDescription() {
    }

    public ResourceEntityResourceMetaDataInfoDescription(
           java.lang.String contentDescription,
           java.lang.String channelName,
           MREML_pkq.ResourceEntityResourceMetaDataInfoDescriptionColumn[] column,
           MREML_pkq.ResourceEntityResourceMetaDataInfoDescriptionSceneDescription[] sceneDescription,
           java.lang.String naturalSound,
           MREML_pkq.ResourceEntityResourceMetaDataInfoDescriptionKeyFrameInfo[] keyFrameInfo,
           java.lang.Integer frameofIcon) {
           this.contentDescription = contentDescription;
           this.channelName = channelName;
           this.column = column;
           this.sceneDescription = sceneDescription;
           this.naturalSound = naturalSound;
           this.keyFrameInfo = keyFrameInfo;
           this.frameofIcon = frameofIcon;
    }


    /**
     * Gets the contentDescription value for this ResourceEntityResourceMetaDataInfoDescription.
     * 
     * @return contentDescription   * 内容描述
     */
    public java.lang.String getContentDescription() {
        return contentDescription;
    }


    /**
     * Sets the contentDescription value for this ResourceEntityResourceMetaDataInfoDescription.
     * 
     * @param contentDescription   * 内容描述
     */
    public void setContentDescription(java.lang.String contentDescription) {
        this.contentDescription = contentDescription;
    }


    /**
     * Gets the channelName value for this ResourceEntityResourceMetaDataInfoDescription.
     * 
     * @return channelName   * 频道名称
     */
    public java.lang.String getChannelName() {
        return channelName;
    }


    /**
     * Sets the channelName value for this ResourceEntityResourceMetaDataInfoDescription.
     * 
     * @param channelName   * 频道名称
     */
    public void setChannelName(java.lang.String channelName) {
        this.channelName = channelName;
    }


    /**
     * Gets the column value for this ResourceEntityResourceMetaDataInfoDescription.
     * 
     * @return column   * 栏目
     */
    public MREML_pkq.ResourceEntityResourceMetaDataInfoDescriptionColumn[] getColumn() {
        return column;
    }


    /**
     * Sets the column value for this ResourceEntityResourceMetaDataInfoDescription.
     * 
     * @param column   * 栏目
     */
    public void setColumn(MREML_pkq.ResourceEntityResourceMetaDataInfoDescriptionColumn[] column) {
        this.column = column;
    }

    public MREML_pkq.ResourceEntityResourceMetaDataInfoDescriptionColumn getColumn(int i) {
        return this.column[i];
    }

    public void setColumn(int i, MREML_pkq.ResourceEntityResourceMetaDataInfoDescriptionColumn _value) {
        this.column[i] = _value;
    }


    /**
     * Gets the sceneDescription value for this ResourceEntityResourceMetaDataInfoDescription.
     * 
     * @return sceneDescription   * 场记信息
     */
    public MREML_pkq.ResourceEntityResourceMetaDataInfoDescriptionSceneDescription[] getSceneDescription() {
        return sceneDescription;
    }


    /**
     * Sets the sceneDescription value for this ResourceEntityResourceMetaDataInfoDescription.
     * 
     * @param sceneDescription   * 场记信息
     */
    public void setSceneDescription(MREML_pkq.ResourceEntityResourceMetaDataInfoDescriptionSceneDescription[] sceneDescription) {
        this.sceneDescription = sceneDescription;
    }

    public MREML_pkq.ResourceEntityResourceMetaDataInfoDescriptionSceneDescription getSceneDescription(int i) {
        return this.sceneDescription[i];
    }

    public void setSceneDescription(int i, MREML_pkq.ResourceEntityResourceMetaDataInfoDescriptionSceneDescription _value) {
        this.sceneDescription[i] = _value;
    }


    /**
     * Gets the naturalSound value for this ResourceEntityResourceMetaDataInfoDescription.
     * 
     * @return naturalSound   * 同期声信�?
     */
    public java.lang.String getNaturalSound() {
        return naturalSound;
    }


    /**
     * Sets the naturalSound value for this ResourceEntityResourceMetaDataInfoDescription.
     * 
     * @param naturalSound   * 同期声信�?
     */
    public void setNaturalSound(java.lang.String naturalSound) {
        this.naturalSound = naturalSound;
    }


    /**
     * Gets the keyFrameInfo value for this ResourceEntityResourceMetaDataInfoDescription.
     * 
     * @return keyFrameInfo   * 关键帧信�?
     */
    public MREML_pkq.ResourceEntityResourceMetaDataInfoDescriptionKeyFrameInfo[] getKeyFrameInfo() {
        return keyFrameInfo;
    }


    /**
     * Sets the keyFrameInfo value for this ResourceEntityResourceMetaDataInfoDescription.
     * 
     * @param keyFrameInfo   * 关键帧信�?
     */
    public void setKeyFrameInfo(MREML_pkq.ResourceEntityResourceMetaDataInfoDescriptionKeyFrameInfo[] keyFrameInfo) {
        this.keyFrameInfo = keyFrameInfo;
    }

    public MREML_pkq.ResourceEntityResourceMetaDataInfoDescriptionKeyFrameInfo getKeyFrameInfo(int i) {
        return this.keyFrameInfo[i];
    }

    public void setKeyFrameInfo(int i, MREML_pkq.ResourceEntityResourceMetaDataInfoDescriptionKeyFrameInfo _value) {
        this.keyFrameInfo[i] = _value;
    }


    /**
     * Gets the frameofIcon value for this ResourceEntityResourceMetaDataInfoDescription.
     * 
     * @return frameofIcon   * 图标帧（肖像）所在的Frame
     */
    public java.lang.Integer getFrameofIcon() {
        return frameofIcon;
    }


    /**
     * Sets the frameofIcon value for this ResourceEntityResourceMetaDataInfoDescription.
     * 
     * @param frameofIcon   * 图标帧（肖像）所在的Frame
     */
    public void setFrameofIcon(java.lang.Integer frameofIcon) {
        this.frameofIcon = frameofIcon;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResourceEntityResourceMetaDataInfoDescription)) return false;
        ResourceEntityResourceMetaDataInfoDescription other = (ResourceEntityResourceMetaDataInfoDescription) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contentDescription==null && other.getContentDescription()==null) || 
             (this.contentDescription!=null &&
              this.contentDescription.equals(other.getContentDescription()))) &&
            ((this.channelName==null && other.getChannelName()==null) || 
             (this.channelName!=null &&
              this.channelName.equals(other.getChannelName()))) &&
            ((this.column==null && other.getColumn()==null) || 
             (this.column!=null &&
              java.util.Arrays.equals(this.column, other.getColumn()))) &&
            ((this.sceneDescription==null && other.getSceneDescription()==null) || 
             (this.sceneDescription!=null &&
              java.util.Arrays.equals(this.sceneDescription, other.getSceneDescription()))) &&
            ((this.naturalSound==null && other.getNaturalSound()==null) || 
             (this.naturalSound!=null &&
              this.naturalSound.equals(other.getNaturalSound()))) &&
            ((this.keyFrameInfo==null && other.getKeyFrameInfo()==null) || 
             (this.keyFrameInfo!=null &&
              java.util.Arrays.equals(this.keyFrameInfo, other.getKeyFrameInfo()))) &&
            ((this.frameofIcon==null && other.getFrameofIcon()==null) || 
             (this.frameofIcon!=null &&
              this.frameofIcon.equals(other.getFrameofIcon())));
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
        if (getContentDescription() != null) {
            _hashCode += getContentDescription().hashCode();
        }
        if (getChannelName() != null) {
            _hashCode += getChannelName().hashCode();
        }
        if (getColumn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getColumn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getColumn(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSceneDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSceneDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSceneDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNaturalSound() != null) {
            _hashCode += getNaturalSound().hashCode();
        }
        if (getKeyFrameInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeyFrameInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeyFrameInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFrameofIcon() != null) {
            _hashCode += getFrameofIcon().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResourceEntityResourceMetaDataInfoDescription.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>>ResourceEntity>ResourceMetaDataInfo>Description"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ContentDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelName");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ChannelName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("column");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Column"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>>>ResourceEntity>ResourceMetaDataInfo>Description>Column"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sceneDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "SceneDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>>>ResourceEntity>ResourceMetaDataInfo>Description>SceneDescription"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("naturalSound");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "NaturalSound"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyFrameInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "KeyFrameInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>>>ResourceEntity>ResourceMetaDataInfo>Description>KeyFrameInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frameofIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "FrameofIcon"));
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
