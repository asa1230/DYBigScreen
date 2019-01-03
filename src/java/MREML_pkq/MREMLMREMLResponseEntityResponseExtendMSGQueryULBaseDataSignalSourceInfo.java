/**
 * MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo  implements java.io.Serializable {
    private java.lang.String signalID;

    private java.lang.String name;

    private java.lang.String groupID;

    private java.lang.String groupName;

    private int isHavePriority;

    private java.lang.Integer priority;

    public MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo() {
    }

    public MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo(
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
     * Gets the signalID value for this MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo.
     * 
     * @return signalID
     */
    public java.lang.String getSignalID() {
        return signalID;
    }


    /**
     * Sets the signalID value for this MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo.
     * 
     * @param signalID
     */
    public void setSignalID(java.lang.String signalID) {
        this.signalID = signalID;
    }


    /**
     * Gets the name value for this MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the groupID value for this MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo.
     * 
     * @return groupID
     */
    public java.lang.String getGroupID() {
        return groupID;
    }


    /**
     * Sets the groupID value for this MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo.
     * 
     * @param groupID
     */
    public void setGroupID(java.lang.String groupID) {
        this.groupID = groupID;
    }


    /**
     * Gets the groupName value for this MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo.
     * 
     * @return groupName
     */
    public java.lang.String getGroupName() {
        return groupName;
    }


    /**
     * Sets the groupName value for this MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo.
     * 
     * @param groupName
     */
    public void setGroupName(java.lang.String groupName) {
        this.groupName = groupName;
    }


    /**
     * Gets the isHavePriority value for this MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo.
     * 
     * @return isHavePriority
     */
    public int getIsHavePriority() {
        return isHavePriority;
    }


    /**
     * Sets the isHavePriority value for this MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo.
     * 
     * @param isHavePriority
     */
    public void setIsHavePriority(int isHavePriority) {
        this.isHavePriority = isHavePriority;
    }


    /**
     * Gets the priority value for this MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo.
     * 
     * @return priority
     */
    public java.lang.Integer getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo.
     * 
     * @param priority
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo)) return false;
        MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo other = (MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo) obj;
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
        new org.apache.axis.description.TypeDesc(MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>>>>MREML>MREML>ResponseEntity>ResponseExtendMSG>QueryULBaseData>SignalSourceInfo"));
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
