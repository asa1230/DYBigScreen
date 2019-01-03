/**
 * ResourceEntityResourceMetaDataInfoTitle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkg;

public class ResourceEntityResourceMetaDataInfoTitle  implements java.io.Serializable {
    private java.lang.String resourceName;

    private java.lang.String nameDescription;

    public ResourceEntityResourceMetaDataInfoTitle() {
    }

    public ResourceEntityResourceMetaDataInfoTitle(
           java.lang.String resourceName,
           java.lang.String nameDescription) {
           this.resourceName = resourceName;
           this.nameDescription = nameDescription;
    }


    /**
     * Gets the resourceName value for this ResourceEntityResourceMetaDataInfoTitle.
     * 
     * @return resourceName
     */
    public java.lang.String getResourceName() {
        return resourceName;
    }


    /**
     * Sets the resourceName value for this ResourceEntityResourceMetaDataInfoTitle.
     * 
     * @param resourceName
     */
    public void setResourceName(java.lang.String resourceName) {
        this.resourceName = resourceName;
    }


    /**
     * Gets the nameDescription value for this ResourceEntityResourceMetaDataInfoTitle.
     * 
     * @return nameDescription
     */
    public java.lang.String getNameDescription() {
        return nameDescription;
    }


    /**
     * Sets the nameDescription value for this ResourceEntityResourceMetaDataInfoTitle.
     * 
     * @param nameDescription
     */
    public void setNameDescription(java.lang.String nameDescription) {
        this.nameDescription = nameDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResourceEntityResourceMetaDataInfoTitle)) return false;
        ResourceEntityResourceMetaDataInfoTitle other = (ResourceEntityResourceMetaDataInfoTitle) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resourceName==null && other.getResourceName()==null) || 
             (this.resourceName!=null &&
              this.resourceName.equals(other.getResourceName()))) &&
            ((this.nameDescription==null && other.getNameDescription()==null) || 
             (this.nameDescription!=null &&
              this.nameDescription.equals(other.getNameDescription())));
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
        if (getResourceName() != null) {
            _hashCode += getResourceName().hashCode();
        }
        if (getNameDescription() != null) {
            _hashCode += getNameDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResourceEntityResourceMetaDataInfoTitle.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>ResourceEntity>ResourceMetaDataInfo>Title"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceName");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ResourceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "NameDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
