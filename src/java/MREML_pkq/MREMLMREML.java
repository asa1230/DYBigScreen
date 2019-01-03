/**
 * MREMLMREML.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class MREMLMREML  implements java.io.Serializable {
    private MREML_pkq.MREMLMREMLEnvelopEntity envelopEntity;

    private MREML_pkq.MREMLMREMLEMIEntity EMIEntity;

    private MREML_pkq.ResourceEntity[] resourceEntity;

    private MREML_pkq.BroadcastListEntity[] broadcastListEntity;

    private MREML_pkq.NewsListEntity[] newsListEntity;

    private MREML_pkq.MREMLMREMLRequestEntity requestEntity;

    private MREML_pkq.MREMLMREMLResponseEntity responseEntity;

    private MREML_pkq.MREMLMREMLNotifyEntity notifyEntity;

    public MREMLMREML() {
    }

    public MREMLMREML(
           MREML_pkq.MREMLMREMLEnvelopEntity envelopEntity,
           MREML_pkq.MREMLMREMLEMIEntity EMIEntity,
           MREML_pkq.ResourceEntity[] resourceEntity,
           MREML_pkq.BroadcastListEntity[] broadcastListEntity,
           MREML_pkq.NewsListEntity[] newsListEntity,
           MREML_pkq.MREMLMREMLRequestEntity requestEntity,
           MREML_pkq.MREMLMREMLResponseEntity responseEntity,
           MREML_pkq.MREMLMREMLNotifyEntity notifyEntity) {
           this.envelopEntity = envelopEntity;
           this.EMIEntity = EMIEntity;
           this.resourceEntity = resourceEntity;
           this.broadcastListEntity = broadcastListEntity;
           this.newsListEntity = newsListEntity;
           this.requestEntity = requestEntity;
           this.responseEntity = responseEntity;
           this.notifyEntity = notifyEntity;
    }


    /**
     * Gets the envelopEntity value for this MREMLMREML.
     * 
     * @return envelopEntity
     */
    public MREML_pkq.MREMLMREMLEnvelopEntity getEnvelopEntity() {
        return envelopEntity;
    }


    /**
     * Sets the envelopEntity value for this MREMLMREML.
     * 
     * @param envelopEntity
     */
    public void setEnvelopEntity(MREML_pkq.MREMLMREMLEnvelopEntity envelopEntity) {
        this.envelopEntity = envelopEntity;
    }


    /**
     * Gets the EMIEntity value for this MREMLMREML.
     * 
     * @return EMIEntity
     */
    public MREML_pkq.MREMLMREMLEMIEntity getEMIEntity() {
        return EMIEntity;
    }


    /**
     * Sets the EMIEntity value for this MREMLMREML.
     * 
     * @param EMIEntity
     */
    public void setEMIEntity(MREML_pkq.MREMLMREMLEMIEntity EMIEntity) {
        this.EMIEntity = EMIEntity;
    }


    /**
     * Gets the resourceEntity value for this MREMLMREML.
     * 
     * @return resourceEntity
     */
    public MREML_pkq.ResourceEntity[] getResourceEntity() {
        return resourceEntity;
    }


    /**
     * Sets the resourceEntity value for this MREMLMREML.
     * 
     * @param resourceEntity
     */
    public void setResourceEntity(MREML_pkq.ResourceEntity[] resourceEntity) {
        this.resourceEntity = resourceEntity;
    }

    public MREML_pkq.ResourceEntity getResourceEntity(int i) {
        return this.resourceEntity[i];
    }

    public void setResourceEntity(int i, MREML_pkq.ResourceEntity _value) {
        this.resourceEntity[i] = _value;
    }


    /**
     * Gets the broadcastListEntity value for this MREMLMREML.
     * 
     * @return broadcastListEntity
     */
    public MREML_pkq.BroadcastListEntity[] getBroadcastListEntity() {
        return broadcastListEntity;
    }


    /**
     * Sets the broadcastListEntity value for this MREMLMREML.
     * 
     * @param broadcastListEntity
     */
    public void setBroadcastListEntity(MREML_pkq.BroadcastListEntity[] broadcastListEntity) {
        this.broadcastListEntity = broadcastListEntity;
    }

    public MREML_pkq.BroadcastListEntity getBroadcastListEntity(int i) {
        return this.broadcastListEntity[i];
    }

    public void setBroadcastListEntity(int i, MREML_pkq.BroadcastListEntity _value) {
        this.broadcastListEntity[i] = _value;
    }


    /**
     * Gets the newsListEntity value for this MREMLMREML.
     * 
     * @return newsListEntity
     */
    public MREML_pkq.NewsListEntity[] getNewsListEntity() {
        return newsListEntity;
    }


    /**
     * Sets the newsListEntity value for this MREMLMREML.
     * 
     * @param newsListEntity
     */
    public void setNewsListEntity(MREML_pkq.NewsListEntity[] newsListEntity) {
        this.newsListEntity = newsListEntity;
    }

    public MREML_pkq.NewsListEntity getNewsListEntity(int i) {
        return this.newsListEntity[i];
    }

    public void setNewsListEntity(int i, MREML_pkq.NewsListEntity _value) {
        this.newsListEntity[i] = _value;
    }


    /**
     * Gets the requestEntity value for this MREMLMREML.
     * 
     * @return requestEntity
     */
    public MREML_pkq.MREMLMREMLRequestEntity getRequestEntity() {
        return requestEntity;
    }


    /**
     * Sets the requestEntity value for this MREMLMREML.
     * 
     * @param requestEntity
     */
    public void setRequestEntity(MREML_pkq.MREMLMREMLRequestEntity requestEntity) {
        this.requestEntity = requestEntity;
    }


    /**
     * Gets the responseEntity value for this MREMLMREML.
     * 
     * @return responseEntity
     */
    public MREML_pkq.MREMLMREMLResponseEntity getResponseEntity() {
        return responseEntity;
    }


    /**
     * Sets the responseEntity value for this MREMLMREML.
     * 
     * @param responseEntity
     */
    public void setResponseEntity(MREML_pkq.MREMLMREMLResponseEntity responseEntity) {
        this.responseEntity = responseEntity;
    }


    /**
     * Gets the notifyEntity value for this MREMLMREML.
     * 
     * @return notifyEntity
     */
    public MREML_pkq.MREMLMREMLNotifyEntity getNotifyEntity() {
        return notifyEntity;
    }


    /**
     * Sets the notifyEntity value for this MREMLMREML.
     * 
     * @param notifyEntity
     */
    public void setNotifyEntity(MREML_pkq.MREMLMREMLNotifyEntity notifyEntity) {
        this.notifyEntity = notifyEntity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MREMLMREML)) return false;
        MREMLMREML other = (MREMLMREML) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.envelopEntity==null && other.getEnvelopEntity()==null) || 
             (this.envelopEntity!=null &&
              this.envelopEntity.equals(other.getEnvelopEntity()))) &&
            ((this.EMIEntity==null && other.getEMIEntity()==null) || 
             (this.EMIEntity!=null &&
              this.EMIEntity.equals(other.getEMIEntity()))) &&
            ((this.resourceEntity==null && other.getResourceEntity()==null) || 
             (this.resourceEntity!=null &&
              java.util.Arrays.equals(this.resourceEntity, other.getResourceEntity()))) &&
            ((this.broadcastListEntity==null && other.getBroadcastListEntity()==null) || 
             (this.broadcastListEntity!=null &&
              java.util.Arrays.equals(this.broadcastListEntity, other.getBroadcastListEntity()))) &&
            ((this.newsListEntity==null && other.getNewsListEntity()==null) || 
             (this.newsListEntity!=null &&
              java.util.Arrays.equals(this.newsListEntity, other.getNewsListEntity()))) &&
            ((this.requestEntity==null && other.getRequestEntity()==null) || 
             (this.requestEntity!=null &&
              this.requestEntity.equals(other.getRequestEntity()))) &&
            ((this.responseEntity==null && other.getResponseEntity()==null) || 
             (this.responseEntity!=null &&
              this.responseEntity.equals(other.getResponseEntity()))) &&
            ((this.notifyEntity==null && other.getNotifyEntity()==null) || 
             (this.notifyEntity!=null &&
              this.notifyEntity.equals(other.getNotifyEntity())));
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
        if (getEnvelopEntity() != null) {
            _hashCode += getEnvelopEntity().hashCode();
        }
        if (getEMIEntity() != null) {
            _hashCode += getEMIEntity().hashCode();
        }
        if (getResourceEntity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResourceEntity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResourceEntity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBroadcastListEntity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBroadcastListEntity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBroadcastListEntity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNewsListEntity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNewsListEntity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNewsListEntity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRequestEntity() != null) {
            _hashCode += getRequestEntity().hashCode();
        }
        if (getResponseEntity() != null) {
            _hashCode += getResponseEntity().hashCode();
        }
        if (getNotifyEntity() != null) {
            _hashCode += getNotifyEntity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MREMLMREML.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">MREML>MREML"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envelopEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "EnvelopEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>MREML>MREML>EnvelopEntity"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMIEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "EMIEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>MREML>MREML>EMIEntity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ResourceEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", "ResourceEntity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("broadcastListEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "BroadcastListEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", "BroadcastListEntity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newsListEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "NewsListEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", "NewsListEntity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "RequestEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>MREML>MREML>RequestEntity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ResponseEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>MREML>MREML>ResponseEntity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifyEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "NotifyEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>MREML>MREML>NotifyEntity"));
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
