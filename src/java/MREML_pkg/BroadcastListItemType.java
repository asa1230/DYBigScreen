/**
 * BroadcastListItemType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkg;

public class BroadcastListItemType  implements java.io.Serializable {
    private java.lang.String itemID;

    private java.lang.String itemName;

    private java.lang.String playDate;

    private java.lang.String playTime;

    private int playMode;

    private long duration;

    private int sourceType;

    private java.lang.Integer index;

    private MREML_pkg.BroadcastListItemTypeClipItem[] clipItem;

    private MREML_pkg.ExtendAttribute[] extendAttribute;

    public BroadcastListItemType() {
    }

    public BroadcastListItemType(
           java.lang.String itemID,
           java.lang.String itemName,
           java.lang.String playDate,
           java.lang.String playTime,
           int playMode,
           long duration,
           int sourceType,
           java.lang.Integer index,
           MREML_pkg.BroadcastListItemTypeClipItem[] clipItem,
           MREML_pkg.ExtendAttribute[] extendAttribute) {
           this.itemID = itemID;
           this.itemName = itemName;
           this.playDate = playDate;
           this.playTime = playTime;
           this.playMode = playMode;
           this.duration = duration;
           this.sourceType = sourceType;
           this.index = index;
           this.clipItem = clipItem;
           this.extendAttribute = extendAttribute;
    }


    /**
     * Gets the itemID value for this BroadcastListItemType.
     * 
     * @return itemID
     */
    public java.lang.String getItemID() {
        return itemID;
    }


    /**
     * Sets the itemID value for this BroadcastListItemType.
     * 
     * @param itemID
     */
    public void setItemID(java.lang.String itemID) {
        this.itemID = itemID;
    }


    /**
     * Gets the itemName value for this BroadcastListItemType.
     * 
     * @return itemName
     */
    public java.lang.String getItemName() {
        return itemName;
    }


    /**
     * Sets the itemName value for this BroadcastListItemType.
     * 
     * @param itemName
     */
    public void setItemName(java.lang.String itemName) {
        this.itemName = itemName;
    }


    /**
     * Gets the playDate value for this BroadcastListItemType.
     * 
     * @return playDate
     */
    public java.lang.String getPlayDate() {
        return playDate;
    }


    /**
     * Sets the playDate value for this BroadcastListItemType.
     * 
     * @param playDate
     */
    public void setPlayDate(java.lang.String playDate) {
        this.playDate = playDate;
    }


    /**
     * Gets the playTime value for this BroadcastListItemType.
     * 
     * @return playTime
     */
    public java.lang.String getPlayTime() {
        return playTime;
    }


    /**
     * Sets the playTime value for this BroadcastListItemType.
     * 
     * @param playTime
     */
    public void setPlayTime(java.lang.String playTime) {
        this.playTime = playTime;
    }


    /**
     * Gets the playMode value for this BroadcastListItemType.
     * 
     * @return playMode
     */
    public int getPlayMode() {
        return playMode;
    }


    /**
     * Sets the playMode value for this BroadcastListItemType.
     * 
     * @param playMode
     */
    public void setPlayMode(int playMode) {
        this.playMode = playMode;
    }


    /**
     * Gets the duration value for this BroadcastListItemType.
     * 
     * @return duration
     */
    public long getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this BroadcastListItemType.
     * 
     * @param duration
     */
    public void setDuration(long duration) {
        this.duration = duration;
    }


    /**
     * Gets the sourceType value for this BroadcastListItemType.
     * 
     * @return sourceType
     */
    public int getSourceType() {
        return sourceType;
    }


    /**
     * Sets the sourceType value for this BroadcastListItemType.
     * 
     * @param sourceType
     */
    public void setSourceType(int sourceType) {
        this.sourceType = sourceType;
    }


    /**
     * Gets the index value for this BroadcastListItemType.
     * 
     * @return index
     */
    public java.lang.Integer getIndex() {
        return index;
    }


    /**
     * Sets the index value for this BroadcastListItemType.
     * 
     * @param index
     */
    public void setIndex(java.lang.Integer index) {
        this.index = index;
    }


    /**
     * Gets the clipItem value for this BroadcastListItemType.
     * 
     * @return clipItem
     */
    public MREML_pkg.BroadcastListItemTypeClipItem[] getClipItem() {
        return clipItem;
    }


    /**
     * Sets the clipItem value for this BroadcastListItemType.
     * 
     * @param clipItem
     */
    public void setClipItem(MREML_pkg.BroadcastListItemTypeClipItem[] clipItem) {
        this.clipItem = clipItem;
    }

    public MREML_pkg.BroadcastListItemTypeClipItem getClipItem(int i) {
        return this.clipItem[i];
    }

    public void setClipItem(int i, MREML_pkg.BroadcastListItemTypeClipItem _value) {
        this.clipItem[i] = _value;
    }


    /**
     * Gets the extendAttribute value for this BroadcastListItemType.
     * 
     * @return extendAttribute
     */
    public MREML_pkg.ExtendAttribute[] getExtendAttribute() {
        return extendAttribute;
    }


    /**
     * Sets the extendAttribute value for this BroadcastListItemType.
     * 
     * @param extendAttribute
     */
    public void setExtendAttribute(MREML_pkg.ExtendAttribute[] extendAttribute) {
        this.extendAttribute = extendAttribute;
    }

    public MREML_pkg.ExtendAttribute getExtendAttribute(int i) {
        return this.extendAttribute[i];
    }

    public void setExtendAttribute(int i, MREML_pkg.ExtendAttribute _value) {
        this.extendAttribute[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BroadcastListItemType)) return false;
        BroadcastListItemType other = (BroadcastListItemType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemID==null && other.getItemID()==null) || 
             (this.itemID!=null &&
              this.itemID.equals(other.getItemID()))) &&
            ((this.itemName==null && other.getItemName()==null) || 
             (this.itemName!=null &&
              this.itemName.equals(other.getItemName()))) &&
            ((this.playDate==null && other.getPlayDate()==null) || 
             (this.playDate!=null &&
              this.playDate.equals(other.getPlayDate()))) &&
            ((this.playTime==null && other.getPlayTime()==null) || 
             (this.playTime!=null &&
              this.playTime.equals(other.getPlayTime()))) &&
            this.playMode == other.getPlayMode() &&
            this.duration == other.getDuration() &&
            this.sourceType == other.getSourceType() &&
            ((this.index==null && other.getIndex()==null) || 
             (this.index!=null &&
              this.index.equals(other.getIndex()))) &&
            ((this.clipItem==null && other.getClipItem()==null) || 
             (this.clipItem!=null &&
              java.util.Arrays.equals(this.clipItem, other.getClipItem()))) &&
            ((this.extendAttribute==null && other.getExtendAttribute()==null) || 
             (this.extendAttribute!=null &&
              java.util.Arrays.equals(this.extendAttribute, other.getExtendAttribute())));
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
        if (getItemID() != null) {
            _hashCode += getItemID().hashCode();
        }
        if (getItemName() != null) {
            _hashCode += getItemName().hashCode();
        }
        if (getPlayDate() != null) {
            _hashCode += getPlayDate().hashCode();
        }
        if (getPlayTime() != null) {
            _hashCode += getPlayTime().hashCode();
        }
        _hashCode += getPlayMode();
        _hashCode += new Long(getDuration()).hashCode();
        _hashCode += getSourceType();
        if (getIndex() != null) {
            _hashCode += getIndex().hashCode();
        }
        if (getClipItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClipItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClipItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExtendAttribute() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExtendAttribute());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExtendAttribute(), i);
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
        new org.apache.axis.description.TypeDesc(BroadcastListItemType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", "BroadcastListItemType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemID");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ItemID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemName");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ItemName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("playDate");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "PlayDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("playTime");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "PlayTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("playMode");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "PlayMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceType");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "SourceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("index");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Index"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clipItem");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ClipItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">BroadcastListItemType>ClipItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extendAttribute");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ExtendAttribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", "ExtendAttribute"));
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
