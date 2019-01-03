/**
 * MREMLMREMLRequestEntityRequestExtendMSGQueryRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class MREMLMREMLRequestEntityRequestExtendMSGQueryRequest  implements java.io.Serializable {
    private MREML_pkq.MREMLMREMLRequestEntityRequestExtendMSGQueryRequestBasicCondition basicCondition;

    private MREML_pkq.MREMLMREMLRequestEntityRequestExtendMSGQueryRequestAdvanceCondtion advanceCondtion;

    private java.lang.String orderBy;

    private MREML_pkq.MREMLMREMLRequestEntityRequestExtendMSGQueryRequestLimitation limitation;

    public MREMLMREMLRequestEntityRequestExtendMSGQueryRequest() {
    }

    public MREMLMREMLRequestEntityRequestExtendMSGQueryRequest(
           MREML_pkq.MREMLMREMLRequestEntityRequestExtendMSGQueryRequestBasicCondition basicCondition,
           MREML_pkq.MREMLMREMLRequestEntityRequestExtendMSGQueryRequestAdvanceCondtion advanceCondtion,
           java.lang.String orderBy,
           MREML_pkq.MREMLMREMLRequestEntityRequestExtendMSGQueryRequestLimitation limitation) {
           this.basicCondition = basicCondition;
           this.advanceCondtion = advanceCondtion;
           this.orderBy = orderBy;
           this.limitation = limitation;
    }


    /**
     * Gets the basicCondition value for this MREMLMREMLRequestEntityRequestExtendMSGQueryRequest.
     * 
     * @return basicCondition
     */
    public MREML_pkq.MREMLMREMLRequestEntityRequestExtendMSGQueryRequestBasicCondition getBasicCondition() {
        return basicCondition;
    }


    /**
     * Sets the basicCondition value for this MREMLMREMLRequestEntityRequestExtendMSGQueryRequest.
     * 
     * @param basicCondition
     */
    public void setBasicCondition(MREML_pkq.MREMLMREMLRequestEntityRequestExtendMSGQueryRequestBasicCondition basicCondition) {
        this.basicCondition = basicCondition;
    }


    /**
     * Gets the advanceCondtion value for this MREMLMREMLRequestEntityRequestExtendMSGQueryRequest.
     * 
     * @return advanceCondtion
     */
    public MREML_pkq.MREMLMREMLRequestEntityRequestExtendMSGQueryRequestAdvanceCondtion getAdvanceCondtion() {
        return advanceCondtion;
    }


    /**
     * Sets the advanceCondtion value for this MREMLMREMLRequestEntityRequestExtendMSGQueryRequest.
     * 
     * @param advanceCondtion
     */
    public void setAdvanceCondtion(MREML_pkq.MREMLMREMLRequestEntityRequestExtendMSGQueryRequestAdvanceCondtion advanceCondtion) {
        this.advanceCondtion = advanceCondtion;
    }


    /**
     * Gets the orderBy value for this MREMLMREMLRequestEntityRequestExtendMSGQueryRequest.
     * 
     * @return orderBy
     */
    public java.lang.String getOrderBy() {
        return orderBy;
    }


    /**
     * Sets the orderBy value for this MREMLMREMLRequestEntityRequestExtendMSGQueryRequest.
     * 
     * @param orderBy
     */
    public void setOrderBy(java.lang.String orderBy) {
        this.orderBy = orderBy;
    }


    /**
     * Gets the limitation value for this MREMLMREMLRequestEntityRequestExtendMSGQueryRequest.
     * 
     * @return limitation
     */
    public MREML_pkq.MREMLMREMLRequestEntityRequestExtendMSGQueryRequestLimitation getLimitation() {
        return limitation;
    }


    /**
     * Sets the limitation value for this MREMLMREMLRequestEntityRequestExtendMSGQueryRequest.
     * 
     * @param limitation
     */
    public void setLimitation(MREML_pkq.MREMLMREMLRequestEntityRequestExtendMSGQueryRequestLimitation limitation) {
        this.limitation = limitation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MREMLMREMLRequestEntityRequestExtendMSGQueryRequest)) return false;
        MREMLMREMLRequestEntityRequestExtendMSGQueryRequest other = (MREMLMREMLRequestEntityRequestExtendMSGQueryRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.basicCondition==null && other.getBasicCondition()==null) || 
             (this.basicCondition!=null &&
              this.basicCondition.equals(other.getBasicCondition()))) &&
            ((this.advanceCondtion==null && other.getAdvanceCondtion()==null) || 
             (this.advanceCondtion!=null &&
              this.advanceCondtion.equals(other.getAdvanceCondtion()))) &&
            ((this.orderBy==null && other.getOrderBy()==null) || 
             (this.orderBy!=null &&
              this.orderBy.equals(other.getOrderBy()))) &&
            ((this.limitation==null && other.getLimitation()==null) || 
             (this.limitation!=null &&
              this.limitation.equals(other.getLimitation())));
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
        if (getBasicCondition() != null) {
            _hashCode += getBasicCondition().hashCode();
        }
        if (getAdvanceCondtion() != null) {
            _hashCode += getAdvanceCondtion().hashCode();
        }
        if (getOrderBy() != null) {
            _hashCode += getOrderBy().hashCode();
        }
        if (getLimitation() != null) {
            _hashCode += getLimitation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MREMLMREMLRequestEntityRequestExtendMSGQueryRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>>>MREML>MREML>RequestEntity>RequestExtendMSG>QueryRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basicCondition");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "BasicCondition"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>>>>MREML>MREML>RequestEntity>RequestExtendMSG>QueryRequest>BasicCondition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advanceCondtion");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "AdvanceCondtion"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>>>>MREML>MREML>RequestEntity>RequestExtendMSG>QueryRequest>AdvanceCondtion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderBy");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "OrderBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitation");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Limitation"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>>>>MREML>MREML>RequestEntity>RequestExtendMSG>QueryRequest>Limitation"));
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
