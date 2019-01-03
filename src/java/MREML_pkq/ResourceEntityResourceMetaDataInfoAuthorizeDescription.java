/**
 * ResourceEntityResourceMetaDataInfoAuthorizeDescription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class ResourceEntityResourceMetaDataInfoAuthorizeDescription  implements java.io.Serializable {
    /* 授权起始日期 */
    private java.lang.String startAuthorizedDate;

    /* 授权使用期限 */
    private java.lang.String authorizedDeadline;

    /* 授权使用次数 */
    private java.lang.Integer authorizedTimes;

    public ResourceEntityResourceMetaDataInfoAuthorizeDescription() {
    }

    public ResourceEntityResourceMetaDataInfoAuthorizeDescription(
           java.lang.String startAuthorizedDate,
           java.lang.String authorizedDeadline,
           java.lang.Integer authorizedTimes) {
           this.startAuthorizedDate = startAuthorizedDate;
           this.authorizedDeadline = authorizedDeadline;
           this.authorizedTimes = authorizedTimes;
    }


    /**
     * Gets the startAuthorizedDate value for this ResourceEntityResourceMetaDataInfoAuthorizeDescription.
     * 
     * @return startAuthorizedDate   * 授权起始日期
     */
    public java.lang.String getStartAuthorizedDate() {
        return startAuthorizedDate;
    }


    /**
     * Sets the startAuthorizedDate value for this ResourceEntityResourceMetaDataInfoAuthorizeDescription.
     * 
     * @param startAuthorizedDate   * 授权起始日期
     */
    public void setStartAuthorizedDate(java.lang.String startAuthorizedDate) {
        this.startAuthorizedDate = startAuthorizedDate;
    }


    /**
     * Gets the authorizedDeadline value for this ResourceEntityResourceMetaDataInfoAuthorizeDescription.
     * 
     * @return authorizedDeadline   * 授权使用期限
     */
    public java.lang.String getAuthorizedDeadline() {
        return authorizedDeadline;
    }


    /**
     * Sets the authorizedDeadline value for this ResourceEntityResourceMetaDataInfoAuthorizeDescription.
     * 
     * @param authorizedDeadline   * 授权使用期限
     */
    public void setAuthorizedDeadline(java.lang.String authorizedDeadline) {
        this.authorizedDeadline = authorizedDeadline;
    }


    /**
     * Gets the authorizedTimes value for this ResourceEntityResourceMetaDataInfoAuthorizeDescription.
     * 
     * @return authorizedTimes   * 授权使用次数
     */
    public java.lang.Integer getAuthorizedTimes() {
        return authorizedTimes;
    }


    /**
     * Sets the authorizedTimes value for this ResourceEntityResourceMetaDataInfoAuthorizeDescription.
     * 
     * @param authorizedTimes   * 授权使用次数
     */
    public void setAuthorizedTimes(java.lang.Integer authorizedTimes) {
        this.authorizedTimes = authorizedTimes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResourceEntityResourceMetaDataInfoAuthorizeDescription)) return false;
        ResourceEntityResourceMetaDataInfoAuthorizeDescription other = (ResourceEntityResourceMetaDataInfoAuthorizeDescription) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.startAuthorizedDate==null && other.getStartAuthorizedDate()==null) || 
             (this.startAuthorizedDate!=null &&
              this.startAuthorizedDate.equals(other.getStartAuthorizedDate()))) &&
            ((this.authorizedDeadline==null && other.getAuthorizedDeadline()==null) || 
             (this.authorizedDeadline!=null &&
              this.authorizedDeadline.equals(other.getAuthorizedDeadline()))) &&
            ((this.authorizedTimes==null && other.getAuthorizedTimes()==null) || 
             (this.authorizedTimes!=null &&
              this.authorizedTimes.equals(other.getAuthorizedTimes())));
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
        if (getStartAuthorizedDate() != null) {
            _hashCode += getStartAuthorizedDate().hashCode();
        }
        if (getAuthorizedDeadline() != null) {
            _hashCode += getAuthorizedDeadline().hashCode();
        }
        if (getAuthorizedTimes() != null) {
            _hashCode += getAuthorizedTimes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResourceEntityResourceMetaDataInfoAuthorizeDescription.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>>ResourceEntity>ResourceMetaDataInfo>AuthorizeDescription"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startAuthorizedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "StartAuthorizedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizedDeadline");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "AuthorizedDeadline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizedTimes");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "AuthorizedTimes"));
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
