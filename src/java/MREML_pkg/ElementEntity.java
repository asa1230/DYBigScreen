/**
 * ElementEntity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkg;

public class ElementEntity  implements java.io.Serializable {
    private MREML_pkg.ElementEntityElementMetadata elementMetadata;

    private MREML_pkg.FileEntity[] fileEntity;

    public ElementEntity() {
    }

    public ElementEntity(
           MREML_pkg.ElementEntityElementMetadata elementMetadata,
           MREML_pkg.FileEntity[] fileEntity) {
           this.elementMetadata = elementMetadata;
           this.fileEntity = fileEntity;
    }


    /**
     * Gets the elementMetadata value for this ElementEntity.
     * 
     * @return elementMetadata
     */
    public MREML_pkg.ElementEntityElementMetadata getElementMetadata() {
        return elementMetadata;
    }


    /**
     * Sets the elementMetadata value for this ElementEntity.
     * 
     * @param elementMetadata
     */
    public void setElementMetadata(MREML_pkg.ElementEntityElementMetadata elementMetadata) {
        this.elementMetadata = elementMetadata;
    }


    /**
     * Gets the fileEntity value for this ElementEntity.
     * 
     * @return fileEntity
     */
    public MREML_pkg.FileEntity[] getFileEntity() {
        return fileEntity;
    }


    /**
     * Sets the fileEntity value for this ElementEntity.
     * 
     * @param fileEntity
     */
    public void setFileEntity(MREML_pkg.FileEntity[] fileEntity) {
        this.fileEntity = fileEntity;
    }

    public MREML_pkg.FileEntity getFileEntity(int i) {
        return this.fileEntity[i];
    }

    public void setFileEntity(int i, MREML_pkg.FileEntity _value) {
        this.fileEntity[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ElementEntity)) return false;
        ElementEntity other = (ElementEntity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.elementMetadata==null && other.getElementMetadata()==null) || 
             (this.elementMetadata!=null &&
              this.elementMetadata.equals(other.getElementMetadata()))) &&
            ((this.fileEntity==null && other.getFileEntity()==null) || 
             (this.fileEntity!=null &&
              java.util.Arrays.equals(this.fileEntity, other.getFileEntity())));
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
        if (getElementMetadata() != null) {
            _hashCode += getElementMetadata().hashCode();
        }
        if (getFileEntity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFileEntity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFileEntity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ElementEntity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", "ElementEntity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elementMetadata");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ElementMetadata"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">ElementEntity>ElementMetadata"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "FileEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", "FileEntity"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
