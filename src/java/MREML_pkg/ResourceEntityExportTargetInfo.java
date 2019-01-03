/**
 * ResourceEntityExportTargetInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkg;

public class ResourceEntityExportTargetInfo  implements java.io.Serializable {
    private MREML_pkg.ElementEntity[] elementEntity;

    private java.lang.String exportTargetDesc;

    private java.lang.Integer directToTarget;

    public ResourceEntityExportTargetInfo() {
    }

    public ResourceEntityExportTargetInfo(
           MREML_pkg.ElementEntity[] elementEntity,
           java.lang.String exportTargetDesc,
           java.lang.Integer directToTarget) {
           this.elementEntity = elementEntity;
           this.exportTargetDesc = exportTargetDesc;
           this.directToTarget = directToTarget;
    }


    /**
     * Gets the elementEntity value for this ResourceEntityExportTargetInfo.
     * 
     * @return elementEntity
     */
    public MREML_pkg.ElementEntity[] getElementEntity() {
        return elementEntity;
    }


    /**
     * Sets the elementEntity value for this ResourceEntityExportTargetInfo.
     * 
     * @param elementEntity
     */
    public void setElementEntity(MREML_pkg.ElementEntity[] elementEntity) {
        this.elementEntity = elementEntity;
    }

    public MREML_pkg.ElementEntity getElementEntity(int i) {
        return this.elementEntity[i];
    }

    public void setElementEntity(int i, MREML_pkg.ElementEntity _value) {
        this.elementEntity[i] = _value;
    }


    /**
     * Gets the exportTargetDesc value for this ResourceEntityExportTargetInfo.
     * 
     * @return exportTargetDesc
     */
    public java.lang.String getExportTargetDesc() {
        return exportTargetDesc;
    }


    /**
     * Sets the exportTargetDesc value for this ResourceEntityExportTargetInfo.
     * 
     * @param exportTargetDesc
     */
    public void setExportTargetDesc(java.lang.String exportTargetDesc) {
        this.exportTargetDesc = exportTargetDesc;
    }


    /**
     * Gets the directToTarget value for this ResourceEntityExportTargetInfo.
     * 
     * @return directToTarget
     */
    public java.lang.Integer getDirectToTarget() {
        return directToTarget;
    }


    /**
     * Sets the directToTarget value for this ResourceEntityExportTargetInfo.
     * 
     * @param directToTarget
     */
    public void setDirectToTarget(java.lang.Integer directToTarget) {
        this.directToTarget = directToTarget;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResourceEntityExportTargetInfo)) return false;
        ResourceEntityExportTargetInfo other = (ResourceEntityExportTargetInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.elementEntity==null && other.getElementEntity()==null) || 
             (this.elementEntity!=null &&
              java.util.Arrays.equals(this.elementEntity, other.getElementEntity()))) &&
            ((this.exportTargetDesc==null && other.getExportTargetDesc()==null) || 
             (this.exportTargetDesc!=null &&
              this.exportTargetDesc.equals(other.getExportTargetDesc()))) &&
            ((this.directToTarget==null && other.getDirectToTarget()==null) || 
             (this.directToTarget!=null &&
              this.directToTarget.equals(other.getDirectToTarget())));
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
        if (getElementEntity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getElementEntity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getElementEntity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExportTargetDesc() != null) {
            _hashCode += getExportTargetDesc().hashCode();
        }
        if (getDirectToTarget() != null) {
            _hashCode += getDirectToTarget().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResourceEntityExportTargetInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">ResourceEntity>ExportTargetInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elementEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ElementEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", "ElementEntity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exportTargetDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ExportTargetDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directToTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "DirectToTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
