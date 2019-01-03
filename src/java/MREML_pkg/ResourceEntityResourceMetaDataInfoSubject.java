/**
 * ResourceEntityResourceMetaDataInfoSubject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkg;

public class ResourceEntityResourceMetaDataInfoSubject  implements java.io.Serializable {
    private MREML_pkg.ResourceEntityResourceMetaDataInfoSubjectClass[] _class;

    private java.lang.String[] keyWords;

    public ResourceEntityResourceMetaDataInfoSubject() {
    }

    public ResourceEntityResourceMetaDataInfoSubject(
           MREML_pkg.ResourceEntityResourceMetaDataInfoSubjectClass[] _class,
           java.lang.String[] keyWords) {
           this._class = _class;
           this.keyWords = keyWords;
    }


    /**
     * Gets the _class value for this ResourceEntityResourceMetaDataInfoSubject.
     * 
     * @return _class
     */
    public MREML_pkg.ResourceEntityResourceMetaDataInfoSubjectClass[] get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this ResourceEntityResourceMetaDataInfoSubject.
     * 
     * @param _class
     */
    public void set_class(MREML_pkg.ResourceEntityResourceMetaDataInfoSubjectClass[] _class) {
        this._class = _class;
    }

    public MREML_pkg.ResourceEntityResourceMetaDataInfoSubjectClass get_class(int i) {
        return this._class[i];
    }

    public void set_class(int i, MREML_pkg.ResourceEntityResourceMetaDataInfoSubjectClass _value) {
        this._class[i] = _value;
    }


    /**
     * Gets the keyWords value for this ResourceEntityResourceMetaDataInfoSubject.
     * 
     * @return keyWords
     */
    public java.lang.String[] getKeyWords() {
        return keyWords;
    }


    /**
     * Sets the keyWords value for this ResourceEntityResourceMetaDataInfoSubject.
     * 
     * @param keyWords
     */
    public void setKeyWords(java.lang.String[] keyWords) {
        this.keyWords = keyWords;
    }

    public java.lang.String getKeyWords(int i) {
        return this.keyWords[i];
    }

    public void setKeyWords(int i, java.lang.String _value) {
        this.keyWords[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResourceEntityResourceMetaDataInfoSubject)) return false;
        ResourceEntityResourceMetaDataInfoSubject other = (ResourceEntityResourceMetaDataInfoSubject) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              java.util.Arrays.equals(this._class, other.get_class()))) &&
            ((this.keyWords==null && other.getKeyWords()==null) || 
             (this.keyWords!=null &&
              java.util.Arrays.equals(this.keyWords, other.getKeyWords())));
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
        if (get_class() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_class());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_class(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKeyWords() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeyWords());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeyWords(), i);
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
        new org.apache.axis.description.TypeDesc(ResourceEntityResourceMetaDataInfoSubject.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>ResourceEntity>ResourceMetaDataInfo>Subject"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Class"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>>ResourceEntity>ResourceMetaDataInfo>Subject>Class"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyWords");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "KeyWords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
