/**
 * BroadcastListItemType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;


/**
 * 播出串联单条�?(复杂类型)
 */
public class BroadcastListItemType  implements java.io.Serializable {
    /* 串联单条目ID */
    private java.lang.String itemID;

    /* 串联单条目名�? */
    private java.lang.String itemName;

    /* 播出日期，播出条目中还需要播出日期是因为�?个播出单中有可能有跨天的条目 */
    private java.lang.String playDate;

    /* 播出时间 */
    private java.lang.String playTime;

    /* 播出模式，顺序�?�定时�?�插播等 */
    private int playMode;

    /* 条目时长 */
    private long duration;

    /* 节目源类型，硬盘，直播延播信号，磁带，录象机�? */
    private int sourceType;

    /* 条目序号 */
    private java.lang.Integer index;

    /* 串联单条目对应的素材条目，一个串联单条目可能对应多个素材 */
    private MREML_pkq.BroadcastListItemTypeClipItem[] clipItem;

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
           MREML_pkq.BroadcastListItemTypeClipItem[] clipItem) {
           this.itemID = itemID;
           this.itemName = itemName;
           this.playDate = playDate;
           this.playTime = playTime;
           this.playMode = playMode;
           this.duration = duration;
           this.sourceType = sourceType;
           this.index = index;
           this.clipItem = clipItem;
    }


    /**
     * Gets the itemID value for this BroadcastListItemType.
     * 
     * @return itemID   * 串联单条目ID
     */
    public java.lang.String getItemID() {
        return itemID;
    }


    /**
     * Sets the itemID value for this BroadcastListItemType.
     * 
     * @param itemID   * 串联单条目ID
     */
    public void setItemID(java.lang.String itemID) {
        this.itemID = itemID;
    }


    /**
     * Gets the itemName value for this BroadcastListItemType.
     * 
     * @return itemName   * 串联单条目名�?
     */
    public java.lang.String getItemName() {
        return itemName;
    }


    /**
     * Sets the itemName value for this BroadcastListItemType.
     * 
     * @param itemName   * 串联单条目名�?
     */
    public void setItemName(java.lang.String itemName) {
        this.itemName = itemName;
    }


    /**
     * Gets the playDate value for this BroadcastListItemType.
     * 
     * @return playDate   * 播出日期，播出条目中还需要播出日期是因为�?个播出单中有可能有跨天的条目
     */
    public java.lang.String getPlayDate() {
        return playDate;
    }


    /**
     * Sets the playDate value for this BroadcastListItemType.
     * 
     * @param playDate   * 播出日期，播出条目中还需要播出日期是因为�?个播出单中有可能有跨天的条目
     */
    public void setPlayDate(java.lang.String playDate) {
        this.playDate = playDate;
    }


    /**
     * Gets the playTime value for this BroadcastListItemType.
     * 
     * @return playTime   * 播出时间
     */
    public java.lang.String getPlayTime() {
        return playTime;
    }


    /**
     * Sets the playTime value for this BroadcastListItemType.
     * 
     * @param playTime   * 播出时间
     */
    public void setPlayTime(java.lang.String playTime) {
        this.playTime = playTime;
    }


    /**
     * Gets the playMode value for this BroadcastListItemType.
     * 
     * @return playMode   * 播出模式，顺序�?�定时�?�插播等
     */
    public int getPlayMode() {
        return playMode;
    }


    /**
     * Sets the playMode value for this BroadcastListItemType.
     * 
     * @param playMode   * 播出模式，顺序�?�定时�?�插播等
     */
    public void setPlayMode(int playMode) {
        this.playMode = playMode;
    }


    /**
     * Gets the duration value for this BroadcastListItemType.
     * 
     * @return duration   * 条目时长
     */
    public long getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this BroadcastListItemType.
     * 
     * @param duration   * 条目时长
     */
    public void setDuration(long duration) {
        this.duration = duration;
    }


    /**
     * Gets the sourceType value for this BroadcastListItemType.
     * 
     * @return sourceType   * 节目源类型，硬盘，直播延播信号，磁带，录象机�?
     */
    public int getSourceType() {
        return sourceType;
    }


    /**
     * Sets the sourceType value for this BroadcastListItemType.
     * 
     * @param sourceType   * 节目源类型，硬盘，直播延播信号，磁带，录象机�?
     */
    public void setSourceType(int sourceType) {
        this.sourceType = sourceType;
    }


    /**
     * Gets the index value for this BroadcastListItemType.
     * 
     * @return index   * 条目序号
     */
    public java.lang.Integer getIndex() {
        return index;
    }


    /**
     * Sets the index value for this BroadcastListItemType.
     * 
     * @param index   * 条目序号
     */
    public void setIndex(java.lang.Integer index) {
        this.index = index;
    }


    /**
     * Gets the clipItem value for this BroadcastListItemType.
     * 
     * @return clipItem   * 串联单条目对应的素材条目，一个串联单条目可能对应多个素材
     */
    public MREML_pkq.BroadcastListItemTypeClipItem[] getClipItem() {
        return clipItem;
    }


    /**
     * Sets the clipItem value for this BroadcastListItemType.
     * 
     * @param clipItem   * 串联单条目对应的素材条目，一个串联单条目可能对应多个素材
     */
    public void setClipItem(MREML_pkq.BroadcastListItemTypeClipItem[] clipItem) {
        this.clipItem = clipItem;
    }

    public MREML_pkq.BroadcastListItemTypeClipItem getClipItem(int i) {
        return this.clipItem[i];
    }

    public void setClipItem(int i, MREML_pkq.BroadcastListItemTypeClipItem _value) {
        this.clipItem[i] = _value;
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
              java.util.Arrays.equals(this.clipItem, other.getClipItem())));
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
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemName");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ItemName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("playDate");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "PlayDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("playTime");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "PlayTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
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
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clipItem");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ClipItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">BroadcastListItemType>ClipItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
