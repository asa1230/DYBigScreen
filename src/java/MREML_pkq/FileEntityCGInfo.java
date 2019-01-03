/**
 * FileEntityCGInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class FileEntityCGInfo  implements java.io.Serializable {
    /* 字幕编号 */
    private int CGIndex;

    /* 字幕语种 */
    private java.lang.String CGLanguage;

    public FileEntityCGInfo() {
    }

    public FileEntityCGInfo(
           int CGIndex,
           java.lang.String CGLanguage) {
           this.CGIndex = CGIndex;
           this.CGLanguage = CGLanguage;
    }


    /**
     * Gets the CGIndex value for this FileEntityCGInfo.
     * 
     * @return CGIndex   * 字幕编号
     */
    public int getCGIndex() {
        return CGIndex;
    }


    /**
     * Sets the CGIndex value for this FileEntityCGInfo.
     * 
     * @param CGIndex   * 字幕编号
     */
    public void setCGIndex(int CGIndex) {
        this.CGIndex = CGIndex;
    }


    /**
     * Gets the CGLanguage value for this FileEntityCGInfo.
     * 
     * @return CGLanguage   * 字幕语种
     */
    public java.lang.String getCGLanguage() {
        return CGLanguage;
    }


    /**
     * Sets the CGLanguage value for this FileEntityCGInfo.
     * 
     * @param CGLanguage   * 字幕语种
     */
    public void setCGLanguage(java.lang.String CGLanguage) {
        this.CGLanguage = CGLanguage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FileEntityCGInfo)) return false;
        FileEntityCGInfo other = (FileEntityCGInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.CGIndex == other.getCGIndex() &&
            ((this.CGLanguage==null && other.getCGLanguage()==null) || 
             (this.CGLanguage!=null &&
              this.CGLanguage.equals(other.getCGLanguage())));
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
        _hashCode += getCGIndex();
        if (getCGLanguage() != null) {
            _hashCode += getCGLanguage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FileEntityCGInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>FileEntity>CGInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CGIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "CGIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CGLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "CGLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
