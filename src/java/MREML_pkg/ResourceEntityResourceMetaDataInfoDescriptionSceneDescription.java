/**
 * ResourceEntityResourceMetaDataInfoDescriptionSceneDescription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkg;

public class ResourceEntityResourceMetaDataInfoDescriptionSceneDescription  implements java.io.Serializable {
    private int sceneStartPnt;

    private int sceneEndPnt;

    private java.lang.String sceneText;

    public ResourceEntityResourceMetaDataInfoDescriptionSceneDescription() {
    }

    public ResourceEntityResourceMetaDataInfoDescriptionSceneDescription(
           int sceneStartPnt,
           int sceneEndPnt,
           java.lang.String sceneText) {
           this.sceneStartPnt = sceneStartPnt;
           this.sceneEndPnt = sceneEndPnt;
           this.sceneText = sceneText;
    }


    /**
     * Gets the sceneStartPnt value for this ResourceEntityResourceMetaDataInfoDescriptionSceneDescription.
     * 
     * @return sceneStartPnt
     */
    public int getSceneStartPnt() {
        return sceneStartPnt;
    }


    /**
     * Sets the sceneStartPnt value for this ResourceEntityResourceMetaDataInfoDescriptionSceneDescription.
     * 
     * @param sceneStartPnt
     */
    public void setSceneStartPnt(int sceneStartPnt) {
        this.sceneStartPnt = sceneStartPnt;
    }


    /**
     * Gets the sceneEndPnt value for this ResourceEntityResourceMetaDataInfoDescriptionSceneDescription.
     * 
     * @return sceneEndPnt
     */
    public int getSceneEndPnt() {
        return sceneEndPnt;
    }


    /**
     * Sets the sceneEndPnt value for this ResourceEntityResourceMetaDataInfoDescriptionSceneDescription.
     * 
     * @param sceneEndPnt
     */
    public void setSceneEndPnt(int sceneEndPnt) {
        this.sceneEndPnt = sceneEndPnt;
    }


    /**
     * Gets the sceneText value for this ResourceEntityResourceMetaDataInfoDescriptionSceneDescription.
     * 
     * @return sceneText
     */
    public java.lang.String getSceneText() {
        return sceneText;
    }


    /**
     * Sets the sceneText value for this ResourceEntityResourceMetaDataInfoDescriptionSceneDescription.
     * 
     * @param sceneText
     */
    public void setSceneText(java.lang.String sceneText) {
        this.sceneText = sceneText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResourceEntityResourceMetaDataInfoDescriptionSceneDescription)) return false;
        ResourceEntityResourceMetaDataInfoDescriptionSceneDescription other = (ResourceEntityResourceMetaDataInfoDescriptionSceneDescription) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.sceneStartPnt == other.getSceneStartPnt() &&
            this.sceneEndPnt == other.getSceneEndPnt() &&
            ((this.sceneText==null && other.getSceneText()==null) || 
             (this.sceneText!=null &&
              this.sceneText.equals(other.getSceneText())));
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
        _hashCode += getSceneStartPnt();
        _hashCode += getSceneEndPnt();
        if (getSceneText() != null) {
            _hashCode += getSceneText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResourceEntityResourceMetaDataInfoDescriptionSceneDescription.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>>ResourceEntity>ResourceMetaDataInfo>Description>SceneDescription"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sceneStartPnt");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "SceneStartPnt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sceneEndPnt");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "SceneEndPnt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sceneText");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "SceneText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
