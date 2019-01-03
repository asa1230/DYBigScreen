/**
 * ResourceEntityResourceMetaDataInfoResourceID.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class ResourceEntityResourceMetaDataInfoResourceID  implements java.io.Serializable {
    /* 资源唯一标识代码 */
    private java.lang.String resourceUniqueID;

    /* 给各业务系统和用户预留的资源ID标识 */
    private java.lang.String userDefID;

    public ResourceEntityResourceMetaDataInfoResourceID() {
    }

    public ResourceEntityResourceMetaDataInfoResourceID(
           java.lang.String resourceUniqueID,
           java.lang.String userDefID) {
           this.resourceUniqueID = resourceUniqueID;
           this.userDefID = userDefID;
    }


    /**
     * Gets the resourceUniqueID value for this ResourceEntityResourceMetaDataInfoResourceID.
     * 
     * @return resourceUniqueID   * 资源唯一标识代码
     */
    public java.lang.String getResourceUniqueID() {
        return resourceUniqueID;
    }


    /**
     * Sets the resourceUniqueID value for this ResourceEntityResourceMetaDataInfoResourceID.
     * 
     * @param resourceUniqueID   * 资源唯一标识代码
     */
    public void setResourceUniqueID(java.lang.String resourceUniqueID) {
        this.resourceUniqueID = resourceUniqueID;
    }


    /**
     * Gets the userDefID value for this ResourceEntityResourceMetaDataInfoResourceID.
     * 
     * @return userDefID   * 给各业务系统和用户预留的资源ID标识
     */
    public java.lang.String getUserDefID() {
        return userDefID;
    }


    /**
     * Sets the userDefID value for this ResourceEntityResourceMetaDataInfoResourceID.
     * 
     * @param userDefID   * 给各业务系统和用户预留的资源ID标识
     */
    public void setUserDefID(java.lang.String userDefID) {
        this.userDefID = userDefID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResourceEntityResourceMetaDataInfoResourceID)) return false;
        ResourceEntityResourceMetaDataInfoResourceID other = (ResourceEntityResourceMetaDataInfoResourceID) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resourceUniqueID==null && other.getResourceUniqueID()==null) || 
             (this.resourceUniqueID!=null &&
              this.resourceUniqueID.equals(other.getResourceUniqueID()))) &&
            ((this.userDefID==null && other.getUserDefID()==null) || 
             (this.userDefID!=null &&
              this.userDefID.equals(other.getUserDefID())));
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
        if (getResourceUniqueID() != null) {
            _hashCode += getResourceUniqueID().hashCode();
        }
        if (getUserDefID() != null) {
            _hashCode += getUserDefID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResourceEntityResourceMetaDataInfoResourceID.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>>ResourceEntity>ResourceMetaDataInfo>ResourceID"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceUniqueID");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ResourceUniqueID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefID");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "UserDefID"));
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
