/**
 * ChannelType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;


/**
 * 频道信息(复杂类型)
 */
public class ChannelType  implements java.io.Serializable {
    /* 频道ID */
    private java.lang.String channelID;

    /* 频道名称 */
    private java.lang.String name;

    /* 信号源信�? */
    private MREML_pkq.ChannelTypeSignal[] signal;

    public ChannelType() {
    }

    public ChannelType(
           java.lang.String channelID,
           java.lang.String name,
           MREML_pkq.ChannelTypeSignal[] signal) {
           this.channelID = channelID;
           this.name = name;
           this.signal = signal;
    }


    /**
     * Gets the channelID value for this ChannelType.
     * 
     * @return channelID   * 频道ID
     */
    public java.lang.String getChannelID() {
        return channelID;
    }


    /**
     * Sets the channelID value for this ChannelType.
     * 
     * @param channelID   * 频道ID
     */
    public void setChannelID(java.lang.String channelID) {
        this.channelID = channelID;
    }


    /**
     * Gets the name value for this ChannelType.
     * 
     * @return name   * 频道名称
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ChannelType.
     * 
     * @param name   * 频道名称
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the signal value for this ChannelType.
     * 
     * @return signal   * 信号源信�?
     */
    public MREML_pkq.ChannelTypeSignal[] getSignal() {
        return signal;
    }


    /**
     * Sets the signal value for this ChannelType.
     * 
     * @param signal   * 信号源信�?
     */
    public void setSignal(MREML_pkq.ChannelTypeSignal[] signal) {
        this.signal = signal;
    }

    public MREML_pkq.ChannelTypeSignal getSignal(int i) {
        return this.signal[i];
    }

    public void setSignal(int i, MREML_pkq.ChannelTypeSignal _value) {
        this.signal[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChannelType)) return false;
        ChannelType other = (ChannelType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.channelID==null && other.getChannelID()==null) || 
             (this.channelID!=null &&
              this.channelID.equals(other.getChannelID()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.signal==null && other.getSignal()==null) || 
             (this.signal!=null &&
              java.util.Arrays.equals(this.signal, other.getSignal())));
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
        if (getChannelID() != null) {
            _hashCode += getChannelID().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getSignal() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSignal());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSignal(), i);
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
        new org.apache.axis.description.TypeDesc(ChannelType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", "ChannelType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelID");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ChannelID"));
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
        elemField.setFieldName("signal");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Signal"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">ChannelType>Signal"));
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
