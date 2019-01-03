/**
 * ResourceEntityResourceMetaDataInfoSource.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class ResourceEntityResourceMetaDataInfoSource  implements java.io.Serializable {
    /* 资料获取方式 */
    private java.lang.String acquiringMethod;

    /* 资料提供�? */
    private java.lang.String sourceProvider;

    private java.lang.String sourceHint;

    public ResourceEntityResourceMetaDataInfoSource() {
    }

    public ResourceEntityResourceMetaDataInfoSource(
           java.lang.String acquiringMethod,
           java.lang.String sourceProvider,
           java.lang.String sourceHint) {
           this.acquiringMethod = acquiringMethod;
           this.sourceProvider = sourceProvider;
           this.sourceHint = sourceHint;
    }


    /**
     * Gets the acquiringMethod value for this ResourceEntityResourceMetaDataInfoSource.
     * 
     * @return acquiringMethod   * 资料获取方式
     */
    public java.lang.String getAcquiringMethod() {
        return acquiringMethod;
    }


    /**
     * Sets the acquiringMethod value for this ResourceEntityResourceMetaDataInfoSource.
     * 
     * @param acquiringMethod   * 资料获取方式
     */
    public void setAcquiringMethod(java.lang.String acquiringMethod) {
        this.acquiringMethod = acquiringMethod;
    }


    /**
     * Gets the sourceProvider value for this ResourceEntityResourceMetaDataInfoSource.
     * 
     * @return sourceProvider   * 资料提供�?
     */
    public java.lang.String getSourceProvider() {
        return sourceProvider;
    }


    /**
     * Sets the sourceProvider value for this ResourceEntityResourceMetaDataInfoSource.
     * 
     * @param sourceProvider   * 资料提供�?
     */
    public void setSourceProvider(java.lang.String sourceProvider) {
        this.sourceProvider = sourceProvider;
    }


    /**
     * Gets the sourceHint value for this ResourceEntityResourceMetaDataInfoSource.
     * 
     * @return sourceHint
     */
    public java.lang.String getSourceHint() {
        return sourceHint;
    }


    /**
     * Sets the sourceHint value for this ResourceEntityResourceMetaDataInfoSource.
     * 
     * @param sourceHint
     */
    public void setSourceHint(java.lang.String sourceHint) {
        this.sourceHint = sourceHint;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResourceEntityResourceMetaDataInfoSource)) return false;
        ResourceEntityResourceMetaDataInfoSource other = (ResourceEntityResourceMetaDataInfoSource) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acquiringMethod==null && other.getAcquiringMethod()==null) || 
             (this.acquiringMethod!=null &&
              this.acquiringMethod.equals(other.getAcquiringMethod()))) &&
            ((this.sourceProvider==null && other.getSourceProvider()==null) || 
             (this.sourceProvider!=null &&
              this.sourceProvider.equals(other.getSourceProvider()))) &&
            ((this.sourceHint==null && other.getSourceHint()==null) || 
             (this.sourceHint!=null &&
              this.sourceHint.equals(other.getSourceHint())));
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
        if (getAcquiringMethod() != null) {
            _hashCode += getAcquiringMethod().hashCode();
        }
        if (getSourceProvider() != null) {
            _hashCode += getSourceProvider().hashCode();
        }
        if (getSourceHint() != null) {
            _hashCode += getSourceHint().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResourceEntityResourceMetaDataInfoSource.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>>ResourceEntity>ResourceMetaDataInfo>Source"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acquiringMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "AcquiringMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceProvider");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "SourceProvider"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceHint");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "SourceHint"));
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
