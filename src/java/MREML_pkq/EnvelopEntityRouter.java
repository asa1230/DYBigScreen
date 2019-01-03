/**
 * EnvelopEntityRouter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class EnvelopEntityRouter  implements java.io.Serializable {
    /* 处理节点标识 */
    private java.lang.String routerID;

    /* 处理时间 */
    private java.lang.String routerTime;

    public EnvelopEntityRouter() {
    }

    public EnvelopEntityRouter(
           java.lang.String routerID,
           java.lang.String routerTime) {
           this.routerID = routerID;
           this.routerTime = routerTime;
    }


    /**
     * Gets the routerID value for this EnvelopEntityRouter.
     * 
     * @return routerID   * 处理节点标识
     */
    public java.lang.String getRouterID() {
        return routerID;
    }


    /**
     * Sets the routerID value for this EnvelopEntityRouter.
     * 
     * @param routerID   * 处理节点标识
     */
    public void setRouterID(java.lang.String routerID) {
        this.routerID = routerID;
    }


    /**
     * Gets the routerTime value for this EnvelopEntityRouter.
     * 
     * @return routerTime   * 处理时间
     */
    public java.lang.String getRouterTime() {
        return routerTime;
    }


    /**
     * Sets the routerTime value for this EnvelopEntityRouter.
     * 
     * @param routerTime   * 处理时间
     */
    public void setRouterTime(java.lang.String routerTime) {
        this.routerTime = routerTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnvelopEntityRouter)) return false;
        EnvelopEntityRouter other = (EnvelopEntityRouter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.routerID==null && other.getRouterID()==null) || 
             (this.routerID!=null &&
              this.routerID.equals(other.getRouterID()))) &&
            ((this.routerTime==null && other.getRouterTime()==null) || 
             (this.routerTime!=null &&
              this.routerTime.equals(other.getRouterTime())));
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
        if (getRouterID() != null) {
            _hashCode += getRouterID().hashCode();
        }
        if (getRouterTime() != null) {
            _hashCode += getRouterTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnvelopEntityRouter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>EnvelopEntity>Router"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routerID");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "RouterID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routerTime");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "RouterTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
