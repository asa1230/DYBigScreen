/**
 * MREMLMREMLRequestEntityRequestExtendMSGQueryRequestBasicCondition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class MREMLMREMLRequestEntityRequestExtendMSGQueryRequestBasicCondition  implements java.io.Serializable {
    private java.lang.String keyword;

    private MREML_pkq.MREMLMREMLRequestEntityRequestExtendMSGQueryRequestBasicConditionTitle title;

    public MREMLMREMLRequestEntityRequestExtendMSGQueryRequestBasicCondition() {
    }

    public MREMLMREMLRequestEntityRequestExtendMSGQueryRequestBasicCondition(
           java.lang.String keyword,
           MREML_pkq.MREMLMREMLRequestEntityRequestExtendMSGQueryRequestBasicConditionTitle title) {
           this.keyword = keyword;
           this.title = title;
    }


    /**
     * Gets the keyword value for this MREMLMREMLRequestEntityRequestExtendMSGQueryRequestBasicCondition.
     * 
     * @return keyword
     */
    public java.lang.String getKeyword() {
        return keyword;
    }


    /**
     * Sets the keyword value for this MREMLMREMLRequestEntityRequestExtendMSGQueryRequestBasicCondition.
     * 
     * @param keyword
     */
    public void setKeyword(java.lang.String keyword) {
        this.keyword = keyword;
    }


    /**
     * Gets the title value for this MREMLMREMLRequestEntityRequestExtendMSGQueryRequestBasicCondition.
     * 
     * @return title
     */
    public MREML_pkq.MREMLMREMLRequestEntityRequestExtendMSGQueryRequestBasicConditionTitle getTitle() {
        return title;
    }


    /**
     * Sets the title value for this MREMLMREMLRequestEntityRequestExtendMSGQueryRequestBasicCondition.
     * 
     * @param title
     */
    public void setTitle(MREML_pkq.MREMLMREMLRequestEntityRequestExtendMSGQueryRequestBasicConditionTitle title) {
        this.title = title;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MREMLMREMLRequestEntityRequestExtendMSGQueryRequestBasicCondition)) return false;
        MREMLMREMLRequestEntityRequestExtendMSGQueryRequestBasicCondition other = (MREMLMREMLRequestEntityRequestExtendMSGQueryRequestBasicCondition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.keyword==null && other.getKeyword()==null) || 
             (this.keyword!=null &&
              this.keyword.equals(other.getKeyword()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle())));
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
        if (getKeyword() != null) {
            _hashCode += getKeyword().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MREMLMREMLRequestEntityRequestExtendMSGQueryRequestBasicCondition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>>>>MREML>MREML>RequestEntity>RequestExtendMSG>QueryRequest>BasicCondition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyword");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Keyword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>>>>>MREML>MREML>RequestEntity>RequestExtendMSG>QueryRequest>BasicCondition>Title"));
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
