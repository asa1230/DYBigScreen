/**
 * RequestEntityRequestExtendMSGQueryRequestAdvanceCondtion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class RequestEntityRequestExtendMSGQueryRequestAdvanceCondtion  implements java.io.Serializable {
    /* 要查询的是那个类型的实体 */
    private java.lang.String entityType;

    /* 属�?�条�? */
    private MREML_pkq.RequestEntityRequestExtendMSGQueryRequestAdvanceCondtionAttributeCondition[] attributeCondition;

    /* 条件之间的关系，AND或�?�OR */
    private java.lang.String relation;

    public RequestEntityRequestExtendMSGQueryRequestAdvanceCondtion() {
    }

    public RequestEntityRequestExtendMSGQueryRequestAdvanceCondtion(
           java.lang.String entityType,
           MREML_pkq.RequestEntityRequestExtendMSGQueryRequestAdvanceCondtionAttributeCondition[] attributeCondition,
           java.lang.String relation) {
           this.entityType = entityType;
           this.attributeCondition = attributeCondition;
           this.relation = relation;
    }


    /**
     * Gets the entityType value for this RequestEntityRequestExtendMSGQueryRequestAdvanceCondtion.
     * 
     * @return entityType   * 要查询的是那个类型的实体
     */
    public java.lang.String getEntityType() {
        return entityType;
    }


    /**
     * Sets the entityType value for this RequestEntityRequestExtendMSGQueryRequestAdvanceCondtion.
     * 
     * @param entityType   * 要查询的是那个类型的实体
     */
    public void setEntityType(java.lang.String entityType) {
        this.entityType = entityType;
    }


    /**
     * Gets the attributeCondition value for this RequestEntityRequestExtendMSGQueryRequestAdvanceCondtion.
     * 
     * @return attributeCondition   * 属�?�条�?
     */
    public MREML_pkq.RequestEntityRequestExtendMSGQueryRequestAdvanceCondtionAttributeCondition[] getAttributeCondition() {
        return attributeCondition;
    }


    /**
     * Sets the attributeCondition value for this RequestEntityRequestExtendMSGQueryRequestAdvanceCondtion.
     * 
     * @param attributeCondition   * 属�?�条�?
     */
    public void setAttributeCondition(MREML_pkq.RequestEntityRequestExtendMSGQueryRequestAdvanceCondtionAttributeCondition[] attributeCondition) {
        this.attributeCondition = attributeCondition;
    }

    public MREML_pkq.RequestEntityRequestExtendMSGQueryRequestAdvanceCondtionAttributeCondition getAttributeCondition(int i) {
        return this.attributeCondition[i];
    }

    public void setAttributeCondition(int i, MREML_pkq.RequestEntityRequestExtendMSGQueryRequestAdvanceCondtionAttributeCondition _value) {
        this.attributeCondition[i] = _value;
    }


    /**
     * Gets the relation value for this RequestEntityRequestExtendMSGQueryRequestAdvanceCondtion.
     * 
     * @return relation   * 条件之间的关系，AND或�?�OR
     */
    public java.lang.String getRelation() {
        return relation;
    }


    /**
     * Sets the relation value for this RequestEntityRequestExtendMSGQueryRequestAdvanceCondtion.
     * 
     * @param relation   * 条件之间的关系，AND或�?�OR
     */
    public void setRelation(java.lang.String relation) {
        this.relation = relation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestEntityRequestExtendMSGQueryRequestAdvanceCondtion)) return false;
        RequestEntityRequestExtendMSGQueryRequestAdvanceCondtion other = (RequestEntityRequestExtendMSGQueryRequestAdvanceCondtion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entityType==null && other.getEntityType()==null) || 
             (this.entityType!=null &&
              this.entityType.equals(other.getEntityType()))) &&
            ((this.attributeCondition==null && other.getAttributeCondition()==null) || 
             (this.attributeCondition!=null &&
              java.util.Arrays.equals(this.attributeCondition, other.getAttributeCondition()))) &&
            ((this.relation==null && other.getRelation()==null) || 
             (this.relation!=null &&
              this.relation.equals(other.getRelation())));
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
        if (getEntityType() != null) {
            _hashCode += getEntityType().hashCode();
        }
        if (getAttributeCondition() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttributeCondition());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttributeCondition(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRelation() != null) {
            _hashCode += getRelation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestEntityRequestExtendMSGQueryRequestAdvanceCondtion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>>>RequestEntity>RequestExtendMSG>QueryRequest>AdvanceCondtion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityType");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "EntityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeCondition");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "AttributeCondition"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>>>>RequestEntity>RequestExtendMSG>QueryRequest>AdvanceCondtion>AttributeCondition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relation");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Relation"));
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
