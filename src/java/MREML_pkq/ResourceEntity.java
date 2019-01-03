/**
 * ResourceEntity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class ResourceEntity  implements java.io.Serializable {
    /* 资源元数据信�? */
    private MREML_pkq.ResourceEntityResourceMetaDataInfo resourceMetaDataInfo;

    private MREML_pkq.ElementEntity[] elementEntity;

    /* 输出目标信息 */
    private MREML_pkq.ResourceEntityExportTargetInfo exportTargetInfo;

    public ResourceEntity() {
    }

    public ResourceEntity(
           MREML_pkq.ResourceEntityResourceMetaDataInfo resourceMetaDataInfo,
           MREML_pkq.ElementEntity[] elementEntity,
           MREML_pkq.ResourceEntityExportTargetInfo exportTargetInfo) {
           this.resourceMetaDataInfo = resourceMetaDataInfo;
           this.elementEntity = elementEntity;
           this.exportTargetInfo = exportTargetInfo;
    }


    /**
     * Gets the resourceMetaDataInfo value for this ResourceEntity.
     * 
     * @return resourceMetaDataInfo   * 资源元数据信�?
     */
    public MREML_pkq.ResourceEntityResourceMetaDataInfo getResourceMetaDataInfo() {
        return resourceMetaDataInfo;
    }


    /**
     * Sets the resourceMetaDataInfo value for this ResourceEntity.
     * 
     * @param resourceMetaDataInfo   * 资源元数据信�?
     */
    public void setResourceMetaDataInfo(MREML_pkq.ResourceEntityResourceMetaDataInfo resourceMetaDataInfo) {
        this.resourceMetaDataInfo = resourceMetaDataInfo;
    }


    /**
     * Gets the elementEntity value for this ResourceEntity.
     * 
     * @return elementEntity
     */
    public MREML_pkq.ElementEntity[] getElementEntity() {
        return elementEntity;
    }


    /**
     * Sets the elementEntity value for this ResourceEntity.
     * 
     * @param elementEntity
     */
    public void setElementEntity(MREML_pkq.ElementEntity[] elementEntity) {
        this.elementEntity = elementEntity;
    }

    public MREML_pkq.ElementEntity getElementEntity(int i) {
        return this.elementEntity[i];
    }

    public void setElementEntity(int i, MREML_pkq.ElementEntity _value) {
        this.elementEntity[i] = _value;
    }


    /**
     * Gets the exportTargetInfo value for this ResourceEntity.
     * 
     * @return exportTargetInfo   * 输出目标信息
     */
    public MREML_pkq.ResourceEntityExportTargetInfo getExportTargetInfo() {
        return exportTargetInfo;
    }


    /**
     * Sets the exportTargetInfo value for this ResourceEntity.
     * 
     * @param exportTargetInfo   * 输出目标信息
     */
    public void setExportTargetInfo(MREML_pkq.ResourceEntityExportTargetInfo exportTargetInfo) {
        this.exportTargetInfo = exportTargetInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResourceEntity)) return false;
        ResourceEntity other = (ResourceEntity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resourceMetaDataInfo==null && other.getResourceMetaDataInfo()==null) || 
             (this.resourceMetaDataInfo!=null &&
              this.resourceMetaDataInfo.equals(other.getResourceMetaDataInfo()))) &&
            ((this.elementEntity==null && other.getElementEntity()==null) || 
             (this.elementEntity!=null &&
              java.util.Arrays.equals(this.elementEntity, other.getElementEntity()))) &&
            ((this.exportTargetInfo==null && other.getExportTargetInfo()==null) || 
             (this.exportTargetInfo!=null &&
              this.exportTargetInfo.equals(other.getExportTargetInfo())));
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
        if (getResourceMetaDataInfo() != null) {
            _hashCode += getResourceMetaDataInfo().hashCode();
        }
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
        if (getExportTargetInfo() != null) {
            _hashCode += getExportTargetInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResourceEntity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">ResourceEntity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceMetaDataInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ResourceMetaDataInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>ResourceEntity>ResourceMetaDataInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elementEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ElementEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", "ElementEntity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exportTargetInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ExportTargetInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>ResourceEntity>ExportTargetInfo"));
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
