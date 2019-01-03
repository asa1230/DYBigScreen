/**
 * ResourceEntityResourceMetaDataInfoResponsibility.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class ResourceEntityResourceMetaDataInfoResponsibility  implements java.io.Serializable {
    /* 责任者名�? */
    private java.lang.String name;

    /* 责任方式 */
    private java.lang.String role;

    /* 其他信息 */
    private java.lang.String otherInformation;

    public ResourceEntityResourceMetaDataInfoResponsibility() {
    }

    public ResourceEntityResourceMetaDataInfoResponsibility(
           java.lang.String name,
           java.lang.String role,
           java.lang.String otherInformation) {
           this.name = name;
           this.role = role;
           this.otherInformation = otherInformation;
    }


    /**
     * Gets the name value for this ResourceEntityResourceMetaDataInfoResponsibility.
     * 
     * @return name   * 责任者名�?
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ResourceEntityResourceMetaDataInfoResponsibility.
     * 
     * @param name   * 责任者名�?
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the role value for this ResourceEntityResourceMetaDataInfoResponsibility.
     * 
     * @return role   * 责任方式
     */
    public java.lang.String getRole() {
        return role;
    }


    /**
     * Sets the role value for this ResourceEntityResourceMetaDataInfoResponsibility.
     * 
     * @param role   * 责任方式
     */
    public void setRole(java.lang.String role) {
        this.role = role;
    }


    /**
     * Gets the otherInformation value for this ResourceEntityResourceMetaDataInfoResponsibility.
     * 
     * @return otherInformation   * 其他信息
     */
    public java.lang.String getOtherInformation() {
        return otherInformation;
    }


    /**
     * Sets the otherInformation value for this ResourceEntityResourceMetaDataInfoResponsibility.
     * 
     * @param otherInformation   * 其他信息
     */
    public void setOtherInformation(java.lang.String otherInformation) {
        this.otherInformation = otherInformation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResourceEntityResourceMetaDataInfoResponsibility)) return false;
        ResourceEntityResourceMetaDataInfoResponsibility other = (ResourceEntityResourceMetaDataInfoResponsibility) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.role==null && other.getRole()==null) || 
             (this.role!=null &&
              this.role.equals(other.getRole()))) &&
            ((this.otherInformation==null && other.getOtherInformation()==null) || 
             (this.otherInformation!=null &&
              this.otherInformation.equals(other.getOtherInformation())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getRole() != null) {
            _hashCode += getRole().hashCode();
        }
        if (getOtherInformation() != null) {
            _hashCode += getOtherInformation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResourceEntityResourceMetaDataInfoResponsibility.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>>ResourceEntity>ResourceMetaDataInfo>Responsibility"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Role"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "OtherInformation"));
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
