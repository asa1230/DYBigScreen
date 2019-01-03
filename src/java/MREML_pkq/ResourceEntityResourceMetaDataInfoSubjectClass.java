/**
 * ResourceEntityResourceMetaDataInfoSubjectClass.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class ResourceEntityResourceMetaDataInfoSubjectClass  implements java.io.Serializable {
    /* 鍒嗙被娉? */
    private java.lang.String classification;

    /* 鍒嗙被鍙? */
    private java.lang.String classNumber;

    /* 鍒嗙被璇存槑 */
    private java.lang.String classDescription;

    public ResourceEntityResourceMetaDataInfoSubjectClass() {
    }

    public ResourceEntityResourceMetaDataInfoSubjectClass(
           java.lang.String classification,
           java.lang.String classNumber,
           java.lang.String classDescription) {
           this.classification = classification;
           this.classNumber = classNumber;
           this.classDescription = classDescription;
    }


    /**
     * Gets the classification value for this ResourceEntityResourceMetaDataInfoSubjectClass.
     * 
     * @return classification   * 鍒嗙被娉?
     */
    public java.lang.String getClassification() {
        return classification;
    }


    /**
     * Sets the classification value for this ResourceEntityResourceMetaDataInfoSubjectClass.
     * 
     * @param classification   * 鍒嗙被娉?
     */
    public void setClassification(java.lang.String classification) {
        this.classification = classification;
    }


    /**
     * Gets the classNumber value for this ResourceEntityResourceMetaDataInfoSubjectClass.
     * 
     * @return classNumber   * 鍒嗙被鍙?
     */
    public java.lang.String getClassNumber() {
        return classNumber;
    }


    /**
     * Sets the classNumber value for this ResourceEntityResourceMetaDataInfoSubjectClass.
     * 
     * @param classNumber   * 鍒嗙被鍙?
     */
    public void setClassNumber(java.lang.String classNumber) {
        this.classNumber = classNumber;
    }


    /**
     * Gets the classDescription value for this ResourceEntityResourceMetaDataInfoSubjectClass.
     * 
     * @return classDescription   * 鍒嗙被璇存槑
     */
    public java.lang.String getClassDescription() {
        return classDescription;
    }


    /**
     * Sets the classDescription value for this ResourceEntityResourceMetaDataInfoSubjectClass.
     * 
     * @param classDescription   * 鍒嗙被璇存槑
     */
    public void setClassDescription(java.lang.String classDescription) {
        this.classDescription = classDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResourceEntityResourceMetaDataInfoSubjectClass)) return false;
        ResourceEntityResourceMetaDataInfoSubjectClass other = (ResourceEntityResourceMetaDataInfoSubjectClass) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.classification==null && other.getClassification()==null) || 
             (this.classification!=null &&
              this.classification.equals(other.getClassification()))) &&
            ((this.classNumber==null && other.getClassNumber()==null) || 
             (this.classNumber!=null &&
              this.classNumber.equals(other.getClassNumber()))) &&
            ((this.classDescription==null && other.getClassDescription()==null) || 
             (this.classDescription!=null &&
              this.classDescription.equals(other.getClassDescription())));
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
        if (getClassification() != null) {
            _hashCode += getClassification().hashCode();
        }
        if (getClassNumber() != null) {
            _hashCode += getClassNumber().hashCode();
        }
        if (getClassDescription() != null) {
            _hashCode += getClassDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResourceEntityResourceMetaDataInfoSubjectClass.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>>>ResourceEntity>ResourceMetaDataInfo>Subject>Class"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classification");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Classification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ClassNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ClassDescription"));
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
