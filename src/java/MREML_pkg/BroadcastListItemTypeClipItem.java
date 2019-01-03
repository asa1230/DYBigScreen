/**
 * BroadcastListItemTypeClipItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkg;

public class BroadcastListItemTypeClipItem  implements java.io.Serializable {
    private java.lang.String clipID;

    private java.lang.String clipName;

    private long inPoint;

    private long outPoint;

    private java.lang.String signalSource;

    private java.lang.String typeCode;

    private java.lang.String programType;

    public BroadcastListItemTypeClipItem() {
    }

    public BroadcastListItemTypeClipItem(
           java.lang.String clipID,
           java.lang.String clipName,
           long inPoint,
           long outPoint,
           java.lang.String signalSource,
           java.lang.String typeCode,
           java.lang.String programType) {
           this.clipID = clipID;
           this.clipName = clipName;
           this.inPoint = inPoint;
           this.outPoint = outPoint;
           this.signalSource = signalSource;
           this.typeCode = typeCode;
           this.programType = programType;
    }


    /**
     * Gets the clipID value for this BroadcastListItemTypeClipItem.
     * 
     * @return clipID
     */
    public java.lang.String getClipID() {
        return clipID;
    }


    /**
     * Sets the clipID value for this BroadcastListItemTypeClipItem.
     * 
     * @param clipID
     */
    public void setClipID(java.lang.String clipID) {
        this.clipID = clipID;
    }


    /**
     * Gets the clipName value for this BroadcastListItemTypeClipItem.
     * 
     * @return clipName
     */
    public java.lang.String getClipName() {
        return clipName;
    }


    /**
     * Sets the clipName value for this BroadcastListItemTypeClipItem.
     * 
     * @param clipName
     */
    public void setClipName(java.lang.String clipName) {
        this.clipName = clipName;
    }


    /**
     * Gets the inPoint value for this BroadcastListItemTypeClipItem.
     * 
     * @return inPoint
     */
    public long getInPoint() {
        return inPoint;
    }


    /**
     * Sets the inPoint value for this BroadcastListItemTypeClipItem.
     * 
     * @param inPoint
     */
    public void setInPoint(long inPoint) {
        this.inPoint = inPoint;
    }


    /**
     * Gets the outPoint value for this BroadcastListItemTypeClipItem.
     * 
     * @return outPoint
     */
    public long getOutPoint() {
        return outPoint;
    }


    /**
     * Sets the outPoint value for this BroadcastListItemTypeClipItem.
     * 
     * @param outPoint
     */
    public void setOutPoint(long outPoint) {
        this.outPoint = outPoint;
    }


    /**
     * Gets the signalSource value for this BroadcastListItemTypeClipItem.
     * 
     * @return signalSource
     */
    public java.lang.String getSignalSource() {
        return signalSource;
    }


    /**
     * Sets the signalSource value for this BroadcastListItemTypeClipItem.
     * 
     * @param signalSource
     */
    public void setSignalSource(java.lang.String signalSource) {
        this.signalSource = signalSource;
    }


    /**
     * Gets the typeCode value for this BroadcastListItemTypeClipItem.
     * 
     * @return typeCode
     */
    public java.lang.String getTypeCode() {
        return typeCode;
    }


    /**
     * Sets the typeCode value for this BroadcastListItemTypeClipItem.
     * 
     * @param typeCode
     */
    public void setTypeCode(java.lang.String typeCode) {
        this.typeCode = typeCode;
    }


    /**
     * Gets the programType value for this BroadcastListItemTypeClipItem.
     * 
     * @return programType
     */
    public java.lang.String getProgramType() {
        return programType;
    }


    /**
     * Sets the programType value for this BroadcastListItemTypeClipItem.
     * 
     * @param programType
     */
    public void setProgramType(java.lang.String programType) {
        this.programType = programType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BroadcastListItemTypeClipItem)) return false;
        BroadcastListItemTypeClipItem other = (BroadcastListItemTypeClipItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clipID==null && other.getClipID()==null) || 
             (this.clipID!=null &&
              this.clipID.equals(other.getClipID()))) &&
            ((this.clipName==null && other.getClipName()==null) || 
             (this.clipName!=null &&
              this.clipName.equals(other.getClipName()))) &&
            this.inPoint == other.getInPoint() &&
            this.outPoint == other.getOutPoint() &&
            ((this.signalSource==null && other.getSignalSource()==null) || 
             (this.signalSource!=null &&
              this.signalSource.equals(other.getSignalSource()))) &&
            ((this.typeCode==null && other.getTypeCode()==null) || 
             (this.typeCode!=null &&
              this.typeCode.equals(other.getTypeCode()))) &&
            ((this.programType==null && other.getProgramType()==null) || 
             (this.programType!=null &&
              this.programType.equals(other.getProgramType())));
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
        if (getClipID() != null) {
            _hashCode += getClipID().hashCode();
        }
        if (getClipName() != null) {
            _hashCode += getClipName().hashCode();
        }
        _hashCode += new Long(getInPoint()).hashCode();
        _hashCode += new Long(getOutPoint()).hashCode();
        if (getSignalSource() != null) {
            _hashCode += getSignalSource().hashCode();
        }
        if (getTypeCode() != null) {
            _hashCode += getTypeCode().hashCode();
        }
        if (getProgramType() != null) {
            _hashCode += getProgramType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BroadcastListItemTypeClipItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">BroadcastListItemType>ClipItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clipID");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ClipID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clipName");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ClipName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "InPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "OutPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signalSource");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "SignalSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "TypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("programType");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ProgramType"));
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
