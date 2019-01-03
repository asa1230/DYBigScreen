/**
 * BroadcastListItemTypeClipItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class BroadcastListItemTypeClipItem  implements java.io.Serializable {
    /* 素材ID */
    private java.lang.String clipID;

    /* 素材名称 */
    private java.lang.String clipName;

    /* 素材入点 */
    private long inPoint;

    /* 素材出点 */
    private long outPoint;

    /* 信号源，当节目源是信号类型的时�?�起作用 */
    private java.lang.String signalSource;

    /* 磁带条码，当节目源是磁带类型的时候起作用 */
    private java.lang.String typeCode;

    public BroadcastListItemTypeClipItem() {
    }

    public BroadcastListItemTypeClipItem(
           java.lang.String clipID,
           java.lang.String clipName,
           long inPoint,
           long outPoint,
           java.lang.String signalSource,
           java.lang.String typeCode) {
           this.clipID = clipID;
           this.clipName = clipName;
           this.inPoint = inPoint;
           this.outPoint = outPoint;
           this.signalSource = signalSource;
           this.typeCode = typeCode;
    }


    /**
     * Gets the clipID value for this BroadcastListItemTypeClipItem.
     * 
     * @return clipID   * 素材ID
     */
    public java.lang.String getClipID() {
        return clipID;
    }


    /**
     * Sets the clipID value for this BroadcastListItemTypeClipItem.
     * 
     * @param clipID   * 素材ID
     */
    public void setClipID(java.lang.String clipID) {
        this.clipID = clipID;
    }


    /**
     * Gets the clipName value for this BroadcastListItemTypeClipItem.
     * 
     * @return clipName   * 素材名称
     */
    public java.lang.String getClipName() {
        return clipName;
    }


    /**
     * Sets the clipName value for this BroadcastListItemTypeClipItem.
     * 
     * @param clipName   * 素材名称
     */
    public void setClipName(java.lang.String clipName) {
        this.clipName = clipName;
    }


    /**
     * Gets the inPoint value for this BroadcastListItemTypeClipItem.
     * 
     * @return inPoint   * 素材入点
     */
    public long getInPoint() {
        return inPoint;
    }


    /**
     * Sets the inPoint value for this BroadcastListItemTypeClipItem.
     * 
     * @param inPoint   * 素材入点
     */
    public void setInPoint(long inPoint) {
        this.inPoint = inPoint;
    }


    /**
     * Gets the outPoint value for this BroadcastListItemTypeClipItem.
     * 
     * @return outPoint   * 素材出点
     */
    public long getOutPoint() {
        return outPoint;
    }


    /**
     * Sets the outPoint value for this BroadcastListItemTypeClipItem.
     * 
     * @param outPoint   * 素材出点
     */
    public void setOutPoint(long outPoint) {
        this.outPoint = outPoint;
    }


    /**
     * Gets the signalSource value for this BroadcastListItemTypeClipItem.
     * 
     * @return signalSource   * 信号源，当节目源是信号类型的时�?�起作用
     */
    public java.lang.String getSignalSource() {
        return signalSource;
    }


    /**
     * Sets the signalSource value for this BroadcastListItemTypeClipItem.
     * 
     * @param signalSource   * 信号源，当节目源是信号类型的时�?�起作用
     */
    public void setSignalSource(java.lang.String signalSource) {
        this.signalSource = signalSource;
    }


    /**
     * Gets the typeCode value for this BroadcastListItemTypeClipItem.
     * 
     * @return typeCode   * 磁带条码，当节目源是磁带类型的时候起作用
     */
    public java.lang.String getTypeCode() {
        return typeCode;
    }


    /**
     * Sets the typeCode value for this BroadcastListItemTypeClipItem.
     * 
     * @param typeCode   * 磁带条码，当节目源是磁带类型的时候起作用
     */
    public void setTypeCode(java.lang.String typeCode) {
        this.typeCode = typeCode;
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
              this.typeCode.equals(other.getTypeCode())));
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
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clipName");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ClipName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "TypeCode"));
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
