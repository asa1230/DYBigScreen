/**
 * ResponseEntityResponseExtendMSGQueryULBaseDataTaskClassInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class ResponseEntityResponseExtendMSGQueryULBaseDataTaskClassInfo  implements java.io.Serializable {
    /* 任务分类guid */
    private java.lang.String classID;

    /* 任务分类名称 */
    private java.lang.String name;

    /* 任务分类唯一名称(全大�?) */
    private java.lang.String CFName;

    public ResponseEntityResponseExtendMSGQueryULBaseDataTaskClassInfo() {
    }

    public ResponseEntityResponseExtendMSGQueryULBaseDataTaskClassInfo(
           java.lang.String classID,
           java.lang.String name,
           java.lang.String CFName) {
           this.classID = classID;
           this.name = name;
           this.CFName = CFName;
    }


    /**
     * Gets the classID value for this ResponseEntityResponseExtendMSGQueryULBaseDataTaskClassInfo.
     * 
     * @return classID   * 任务分类guid
     */
    public java.lang.String getClassID() {
        return classID;
    }


    /**
     * Sets the classID value for this ResponseEntityResponseExtendMSGQueryULBaseDataTaskClassInfo.
     * 
     * @param classID   * 任务分类guid
     */
    public void setClassID(java.lang.String classID) {
        this.classID = classID;
    }


    /**
     * Gets the name value for this ResponseEntityResponseExtendMSGQueryULBaseDataTaskClassInfo.
     * 
     * @return name   * 任务分类名称
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ResponseEntityResponseExtendMSGQueryULBaseDataTaskClassInfo.
     * 
     * @param name   * 任务分类名称
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the CFName value for this ResponseEntityResponseExtendMSGQueryULBaseDataTaskClassInfo.
     * 
     * @return CFName   * 任务分类唯一名称(全大�?)
     */
    public java.lang.String getCFName() {
        return CFName;
    }


    /**
     * Sets the CFName value for this ResponseEntityResponseExtendMSGQueryULBaseDataTaskClassInfo.
     * 
     * @param CFName   * 任务分类唯一名称(全大�?)
     */
    public void setCFName(java.lang.String CFName) {
        this.CFName = CFName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseEntityResponseExtendMSGQueryULBaseDataTaskClassInfo)) return false;
        ResponseEntityResponseExtendMSGQueryULBaseDataTaskClassInfo other = (ResponseEntityResponseExtendMSGQueryULBaseDataTaskClassInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.classID==null && other.getClassID()==null) || 
             (this.classID!=null &&
              this.classID.equals(other.getClassID()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.CFName==null && other.getCFName()==null) || 
             (this.CFName!=null &&
              this.CFName.equals(other.getCFName())));
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
        if (getClassID() != null) {
            _hashCode += getClassID().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getCFName() != null) {
            _hashCode += getCFName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseEntityResponseExtendMSGQueryULBaseDataTaskClassInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>>>ResponseEntity>ResponseExtendMSG>QueryULBaseData>TaskClassInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classID");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ClassID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CFName");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "CFName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
