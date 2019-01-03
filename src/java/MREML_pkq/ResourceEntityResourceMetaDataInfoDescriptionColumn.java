/**
 * ResourceEntityResourceMetaDataInfoDescriptionColumn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class ResourceEntityResourceMetaDataInfoDescriptionColumn  implements java.io.Serializable {
    /* 栏目名称 */
    private java.lang.String columnName;

    /* 期次 */
    private java.lang.String issueNumber;

    /* 年度 */
    private java.lang.String issueYear;

    public ResourceEntityResourceMetaDataInfoDescriptionColumn() {
    }

    public ResourceEntityResourceMetaDataInfoDescriptionColumn(
           java.lang.String columnName,
           java.lang.String issueNumber,
           java.lang.String issueYear) {
           this.columnName = columnName;
           this.issueNumber = issueNumber;
           this.issueYear = issueYear;
    }


    /**
     * Gets the columnName value for this ResourceEntityResourceMetaDataInfoDescriptionColumn.
     * 
     * @return columnName   * 栏目名称
     */
    public java.lang.String getColumnName() {
        return columnName;
    }


    /**
     * Sets the columnName value for this ResourceEntityResourceMetaDataInfoDescriptionColumn.
     * 
     * @param columnName   * 栏目名称
     */
    public void setColumnName(java.lang.String columnName) {
        this.columnName = columnName;
    }


    /**
     * Gets the issueNumber value for this ResourceEntityResourceMetaDataInfoDescriptionColumn.
     * 
     * @return issueNumber   * 期次
     */
    public java.lang.String getIssueNumber() {
        return issueNumber;
    }


    /**
     * Sets the issueNumber value for this ResourceEntityResourceMetaDataInfoDescriptionColumn.
     * 
     * @param issueNumber   * 期次
     */
    public void setIssueNumber(java.lang.String issueNumber) {
        this.issueNumber = issueNumber;
    }


    /**
     * Gets the issueYear value for this ResourceEntityResourceMetaDataInfoDescriptionColumn.
     * 
     * @return issueYear   * 年度
     */
    public java.lang.String getIssueYear() {
        return issueYear;
    }


    /**
     * Sets the issueYear value for this ResourceEntityResourceMetaDataInfoDescriptionColumn.
     * 
     * @param issueYear   * 年度
     */
    public void setIssueYear(java.lang.String issueYear) {
        this.issueYear = issueYear;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResourceEntityResourceMetaDataInfoDescriptionColumn)) return false;
        ResourceEntityResourceMetaDataInfoDescriptionColumn other = (ResourceEntityResourceMetaDataInfoDescriptionColumn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.columnName==null && other.getColumnName()==null) || 
             (this.columnName!=null &&
              this.columnName.equals(other.getColumnName()))) &&
            ((this.issueNumber==null && other.getIssueNumber()==null) || 
             (this.issueNumber!=null &&
              this.issueNumber.equals(other.getIssueNumber()))) &&
            ((this.issueYear==null && other.getIssueYear()==null) || 
             (this.issueYear!=null &&
              this.issueYear.equals(other.getIssueYear())));
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
        if (getColumnName() != null) {
            _hashCode += getColumnName().hashCode();
        }
        if (getIssueNumber() != null) {
            _hashCode += getIssueNumber().hashCode();
        }
        if (getIssueYear() != null) {
            _hashCode += getIssueYear().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResourceEntityResourceMetaDataInfoDescriptionColumn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>>>ResourceEntity>ResourceMetaDataInfo>Description>Column"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columnName");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ColumnName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "IssueNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueYear");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "IssueYear"));
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
