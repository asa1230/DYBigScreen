/**
 * BroadcastListEntity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class BroadcastListEntity  implements java.io.Serializable {
    /* 播出单ID */
    private java.lang.String listID;

    /* 串联单名�? */
    private java.lang.String name;

    /* 串联单创建时�? */
    private java.lang.String created;

    /* 播出时间 */
    private java.lang.String playDate;

    /* 频道代码 */
    private java.lang.String channelCode;

    /* 频道名称 */
    private java.lang.String channelName;

    /* 串联单条�? */
    private MREML_pkq.BroadcastListItemType[] LISTITEM;

    public BroadcastListEntity() {
    }

    public BroadcastListEntity(
           java.lang.String listID,
           java.lang.String name,
           java.lang.String created,
           java.lang.String playDate,
           java.lang.String channelCode,
           java.lang.String channelName,
           MREML_pkq.BroadcastListItemType[] LISTITEM) {
           this.listID = listID;
           this.name = name;
           this.created = created;
           this.playDate = playDate;
           this.channelCode = channelCode;
           this.channelName = channelName;
           this.LISTITEM = LISTITEM;
    }


    /**
     * Gets the listID value for this BroadcastListEntity.
     * 
     * @return listID   * 播出单ID
     */
    public java.lang.String getListID() {
        return listID;
    }


    /**
     * Sets the listID value for this BroadcastListEntity.
     * 
     * @param listID   * 播出单ID
     */
    public void setListID(java.lang.String listID) {
        this.listID = listID;
    }


    /**
     * Gets the name value for this BroadcastListEntity.
     * 
     * @return name   * 串联单名�?
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this BroadcastListEntity.
     * 
     * @param name   * 串联单名�?
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the created value for this BroadcastListEntity.
     * 
     * @return created   * 串联单创建时�?
     */
    public java.lang.String getCreated() {
        return created;
    }


    /**
     * Sets the created value for this BroadcastListEntity.
     * 
     * @param created   * 串联单创建时�?
     */
    public void setCreated(java.lang.String created) {
        this.created = created;
    }


    /**
     * Gets the playDate value for this BroadcastListEntity.
     * 
     * @return playDate   * 播出时间
     */
    public java.lang.String getPlayDate() {
        return playDate;
    }


    /**
     * Sets the playDate value for this BroadcastListEntity.
     * 
     * @param playDate   * 播出时间
     */
    public void setPlayDate(java.lang.String playDate) {
        this.playDate = playDate;
    }


    /**
     * Gets the channelCode value for this BroadcastListEntity.
     * 
     * @return channelCode   * 频道代码
     */
    public java.lang.String getChannelCode() {
        return channelCode;
    }


    /**
     * Sets the channelCode value for this BroadcastListEntity.
     * 
     * @param channelCode   * 频道代码
     */
    public void setChannelCode(java.lang.String channelCode) {
        this.channelCode = channelCode;
    }


    /**
     * Gets the channelName value for this BroadcastListEntity.
     * 
     * @return channelName   * 频道名称
     */
    public java.lang.String getChannelName() {
        return channelName;
    }


    /**
     * Sets the channelName value for this BroadcastListEntity.
     * 
     * @param channelName   * 频道名称
     */
    public void setChannelName(java.lang.String channelName) {
        this.channelName = channelName;
    }


    /**
     * Gets the LISTITEM value for this BroadcastListEntity.
     * 
     * @return LISTITEM   * 串联单条�?
     */
    public MREML_pkq.BroadcastListItemType[] getLISTITEM() {
        return LISTITEM;
    }


    /**
     * Sets the LISTITEM value for this BroadcastListEntity.
     * 
     * @param LISTITEM   * 串联单条�?
     */
    public void setLISTITEM(MREML_pkq.BroadcastListItemType[] LISTITEM) {
        this.LISTITEM = LISTITEM;
    }

    public MREML_pkq.BroadcastListItemType getLISTITEM(int i) {
        return this.LISTITEM[i];
    }

    public void setLISTITEM(int i, MREML_pkq.BroadcastListItemType _value) {
        this.LISTITEM[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BroadcastListEntity)) return false;
        BroadcastListEntity other = (BroadcastListEntity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.listID==null && other.getListID()==null) || 
             (this.listID!=null &&
              this.listID.equals(other.getListID()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.playDate==null && other.getPlayDate()==null) || 
             (this.playDate!=null &&
              this.playDate.equals(other.getPlayDate()))) &&
            ((this.channelCode==null && other.getChannelCode()==null) || 
             (this.channelCode!=null &&
              this.channelCode.equals(other.getChannelCode()))) &&
            ((this.channelName==null && other.getChannelName()==null) || 
             (this.channelName!=null &&
              this.channelName.equals(other.getChannelName()))) &&
            ((this.LISTITEM==null && other.getLISTITEM()==null) || 
             (this.LISTITEM!=null &&
              java.util.Arrays.equals(this.LISTITEM, other.getLISTITEM())));
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
        if (getListID() != null) {
            _hashCode += getListID().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getPlayDate() != null) {
            _hashCode += getPlayDate().hashCode();
        }
        if (getChannelCode() != null) {
            _hashCode += getChannelCode().hashCode();
        }
        if (getChannelName() != null) {
            _hashCode += getChannelName().hashCode();
        }
        if (getLISTITEM() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLISTITEM());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLISTITEM(), i);
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
        new org.apache.axis.description.TypeDesc(BroadcastListEntity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">BroadcastListEntity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listID");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ListID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Created"));
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
        elemField.setFieldName("channelCode");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ChannelCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelName");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ChannelName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LISTITEM");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "LISTITEM"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", "BroadcastListItemType"));
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
