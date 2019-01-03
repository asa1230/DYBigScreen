/**
 * ResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class ResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo  implements java.io.Serializable {
    /* 卫星信号GUID */
    private java.lang.String signalID;

    /* 卫星信号名称 */
    private java.lang.String name;

    /* 信号组GUID */
    private java.lang.String groupID;

    /* 卫星信号分组名称 */
    private java.lang.String groupName;

    /* 是否有优先级配置 */
    private int isHavePriority;

    /* 优先�? */
    private java.lang.Integer priority;

    public ResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo() {
    }

    public ResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo(
           java.lang.String signalID,
           java.lang.String name,
           java.lang.String groupID,
           java.lang.String groupName,
           int isHavePriority,
           java.lang.Integer priority) {
           this.signalID = signalID;
           this.name = name;
           this.groupID = groupID;
           this.groupName = groupName;
           this.isHavePriority = isHavePriority;
           this.priority = priority;
    }


    /**
     * Gets the signalID value for this ResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo.
     * 
     * @return signalID   * 卫星信号GUID
     */
    public java.lang.String getSignalID() {
        return signalID;
    }


    /**
     * Sets the signalID value for this ResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo.
     * 
     * @param signalID   * 卫星信号GUID
     */
    public void setSignalID(java.lang.String signalID) {
        this.signalID = signalID;
    }


    /**
     * Gets the name value for this ResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo.
     * 
     * @return name   * 卫星信号名称
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo.
     * 
     * @param name   * 卫星信号名称
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the groupID value for this ResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo.
     * 
     * @return groupID   * 信号组GUID
     */
    public java.lang.String getGroupID() {
        return groupID;
    }


    /**
     * Sets the groupID value for this ResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo.
     * 
     * @param groupID   * 信号组GUID
     */
    public void setGroupID(java.lang.String groupID) {
        this.groupID = groupID;
    }


    /**
     * Gets the groupName value for this ResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo.
     * 
     * @return groupName   * 卫星信号分组名称
     */
    public java.lang.String getGroupName() {
        return groupName;
    }


    /**
     * Sets the groupName value for this ResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo.
     * 
     * @param groupName   * 卫星信号分组名称
     */
    public void setGroupName(java.lang.String groupName) {
        this.groupName = groupName;
    }


    /**
     * Gets the isHavePriority value for this ResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo.
     * 
     * @return isHavePriority   * 是否有优先级配置
     */
    public int getIsHavePriority() {
        return isHavePriority;
    }


    /**
     * Sets the isHavePriority value for this ResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo.
     * 
     * @param isHavePriority   * 是否有优先级配置
     */
    public void setIsHavePriority(int isHavePriority) {
        this.isHavePriority = isHavePriority;
    }


    /**
     * Gets the priority value for this ResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo.
     * 
     * @return priority   * 优先�?
     */
    public java.lang.Integer getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this ResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo.
     * 
     * @param priority   * 优先�?
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo)) return false;
        ResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo other = (ResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.signalID==null && other.getSignalID()==null) || 
             (this.signalID!=null &&
              this.signalID.equals(other.getSignalID()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.groupID==null && other.getGroupID()==null) || 
             (this.groupID!=null &&
              this.groupID.equals(other.getGroupID()))) &&
            ((this.groupName==null && other.getGroupName()==null) || 
             (this.groupName!=null &&
              this.groupName.equals(other.getGroupName()))) &&
            this.isHavePriority == other.getIsHavePriority() &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority())));
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
        if (getSignalID() != null) {
            _hashCode += getSignalID().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getGroupID() != null) {
            _hashCode += getGroupID().hashCode();
        }
        if (getGroupName() != null) {
            _hashCode += getGroupName().hashCode();
        }
        _hashCode += getIsHavePriority();
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>>>ResponseEntity>ResponseExtendMSG>QueryULBaseData>SignalSourceInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signalID");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "SignalID"));
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
        elemField.setFieldName("groupID");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "GroupID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupName");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "GroupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isHavePriority");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "IsHavePriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
