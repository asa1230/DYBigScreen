/**
 * ResourceEntityResourceMetaDataInfoDate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkg;

public class ResourceEntityResourceMetaDataInfoDate  implements java.io.Serializable {
    private java.lang.String createDate;

    private java.lang.String producedDate;

    private java.lang.String debutDate;

    public ResourceEntityResourceMetaDataInfoDate() {
    }

    public ResourceEntityResourceMetaDataInfoDate(
           java.lang.String createDate,
           java.lang.String producedDate,
           java.lang.String debutDate) {
           this.createDate = createDate;
           this.producedDate = producedDate;
           this.debutDate = debutDate;
    }


    /**
     * Gets the createDate value for this ResourceEntityResourceMetaDataInfoDate.
     * 
     * @return createDate
     */
    public java.lang.String getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this ResourceEntityResourceMetaDataInfoDate.
     * 
     * @param createDate
     */
    public void setCreateDate(java.lang.String createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the producedDate value for this ResourceEntityResourceMetaDataInfoDate.
     * 
     * @return producedDate
     */
    public java.lang.String getProducedDate() {
        return producedDate;
    }


    /**
     * Sets the producedDate value for this ResourceEntityResourceMetaDataInfoDate.
     * 
     * @param producedDate
     */
    public void setProducedDate(java.lang.String producedDate) {
        this.producedDate = producedDate;
    }


    /**
     * Gets the debutDate value for this ResourceEntityResourceMetaDataInfoDate.
     * 
     * @return debutDate
     */
    public java.lang.String getDebutDate() {
        return debutDate;
    }


    /**
     * Sets the debutDate value for this ResourceEntityResourceMetaDataInfoDate.
     * 
     * @param debutDate
     */
    public void setDebutDate(java.lang.String debutDate) {
        this.debutDate = debutDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResourceEntityResourceMetaDataInfoDate)) return false;
        ResourceEntityResourceMetaDataInfoDate other = (ResourceEntityResourceMetaDataInfoDate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.producedDate==null && other.getProducedDate()==null) || 
             (this.producedDate!=null &&
              this.producedDate.equals(other.getProducedDate()))) &&
            ((this.debutDate==null && other.getDebutDate()==null) || 
             (this.debutDate!=null &&
              this.debutDate.equals(other.getDebutDate())));
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
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getProducedDate() != null) {
            _hashCode += getProducedDate().hashCode();
        }
        if (getDebutDate() != null) {
            _hashCode += getDebutDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResourceEntityResourceMetaDataInfoDate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>ResourceEntity>ResourceMetaDataInfo>Date"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "CreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("producedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ProducedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debutDate");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "DebutDate"));
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
