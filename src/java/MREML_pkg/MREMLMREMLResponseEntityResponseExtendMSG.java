/**
 * MREMLMREMLResponseEntityResponseExtendMSG.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkg;

public class MREMLMREMLResponseEntityResponseExtendMSG  implements java.io.Serializable {
    private MREML_pkg.MREMLMREMLResponseEntityResponseExtendMSGQueryResponse queryResponse;

    private MREML_pkg.MREMLMREMLResponseEntityResponseExtendMSGQueryTaskResponse queryTaskResponse;

    private MREML_pkg.ProcessType[] queryProcessesResponse;

    private MREML_pkg.MREMLMREMLResponseEntityResponseExtendMSGQueryProcessStatusResponse queryProcessStatusResponse;

    private MREML_pkg.QueryULTaskResponseType queryULTaskResponse;

    private MREML_pkg.MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseData queryULBaseData;

    private MREML_pkg.ChannelType[] getBCConfigResponse;

    public MREMLMREMLResponseEntityResponseExtendMSG() {
    }

    public MREMLMREMLResponseEntityResponseExtendMSG(
           MREML_pkg.MREMLMREMLResponseEntityResponseExtendMSGQueryResponse queryResponse,
           MREML_pkg.MREMLMREMLResponseEntityResponseExtendMSGQueryTaskResponse queryTaskResponse,
           MREML_pkg.ProcessType[] queryProcessesResponse,
           MREML_pkg.MREMLMREMLResponseEntityResponseExtendMSGQueryProcessStatusResponse queryProcessStatusResponse,
           MREML_pkg.QueryULTaskResponseType queryULTaskResponse,
           MREML_pkg.MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseData queryULBaseData,
           MREML_pkg.ChannelType[] getBCConfigResponse) {
           this.queryResponse = queryResponse;
           this.queryTaskResponse = queryTaskResponse;
           this.queryProcessesResponse = queryProcessesResponse;
           this.queryProcessStatusResponse = queryProcessStatusResponse;
           this.queryULTaskResponse = queryULTaskResponse;
           this.queryULBaseData = queryULBaseData;
           this.getBCConfigResponse = getBCConfigResponse;
    }


    /**
     * Gets the queryResponse value for this MREMLMREMLResponseEntityResponseExtendMSG.
     * 
     * @return queryResponse
     */
    public MREML_pkg.MREMLMREMLResponseEntityResponseExtendMSGQueryResponse getQueryResponse() {
        return queryResponse;
    }


    /**
     * Sets the queryResponse value for this MREMLMREMLResponseEntityResponseExtendMSG.
     * 
     * @param queryResponse
     */
    public void setQueryResponse(MREML_pkg.MREMLMREMLResponseEntityResponseExtendMSGQueryResponse queryResponse) {
        this.queryResponse = queryResponse;
    }


    /**
     * Gets the queryTaskResponse value for this MREMLMREMLResponseEntityResponseExtendMSG.
     * 
     * @return queryTaskResponse
     */
    public MREML_pkg.MREMLMREMLResponseEntityResponseExtendMSGQueryTaskResponse getQueryTaskResponse() {
        return queryTaskResponse;
    }


    /**
     * Sets the queryTaskResponse value for this MREMLMREMLResponseEntityResponseExtendMSG.
     * 
     * @param queryTaskResponse
     */
    public void setQueryTaskResponse(MREML_pkg.MREMLMREMLResponseEntityResponseExtendMSGQueryTaskResponse queryTaskResponse) {
        this.queryTaskResponse = queryTaskResponse;
    }


    /**
     * Gets the queryProcessesResponse value for this MREMLMREMLResponseEntityResponseExtendMSG.
     * 
     * @return queryProcessesResponse
     */
    public MREML_pkg.ProcessType[] getQueryProcessesResponse() {
        return queryProcessesResponse;
    }


    /**
     * Sets the queryProcessesResponse value for this MREMLMREMLResponseEntityResponseExtendMSG.
     * 
     * @param queryProcessesResponse
     */
    public void setQueryProcessesResponse(MREML_pkg.ProcessType[] queryProcessesResponse) {
        this.queryProcessesResponse = queryProcessesResponse;
    }


    /**
     * Gets the queryProcessStatusResponse value for this MREMLMREMLResponseEntityResponseExtendMSG.
     * 
     * @return queryProcessStatusResponse
     */
    public MREML_pkg.MREMLMREMLResponseEntityResponseExtendMSGQueryProcessStatusResponse getQueryProcessStatusResponse() {
        return queryProcessStatusResponse;
    }


    /**
     * Sets the queryProcessStatusResponse value for this MREMLMREMLResponseEntityResponseExtendMSG.
     * 
     * @param queryProcessStatusResponse
     */
    public void setQueryProcessStatusResponse(MREML_pkg.MREMLMREMLResponseEntityResponseExtendMSGQueryProcessStatusResponse queryProcessStatusResponse) {
        this.queryProcessStatusResponse = queryProcessStatusResponse;
    }


    /**
     * Gets the queryULTaskResponse value for this MREMLMREMLResponseEntityResponseExtendMSG.
     * 
     * @return queryULTaskResponse
     */
    public MREML_pkg.QueryULTaskResponseType getQueryULTaskResponse() {
        return queryULTaskResponse;
    }


    /**
     * Sets the queryULTaskResponse value for this MREMLMREMLResponseEntityResponseExtendMSG.
     * 
     * @param queryULTaskResponse
     */
    public void setQueryULTaskResponse(MREML_pkg.QueryULTaskResponseType queryULTaskResponse) {
        this.queryULTaskResponse = queryULTaskResponse;
    }


    /**
     * Gets the queryULBaseData value for this MREMLMREMLResponseEntityResponseExtendMSG.
     * 
     * @return queryULBaseData
     */
    public MREML_pkg.MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseData getQueryULBaseData() {
        return queryULBaseData;
    }


    /**
     * Sets the queryULBaseData value for this MREMLMREMLResponseEntityResponseExtendMSG.
     * 
     * @param queryULBaseData
     */
    public void setQueryULBaseData(MREML_pkg.MREMLMREMLResponseEntityResponseExtendMSGQueryULBaseData queryULBaseData) {
        this.queryULBaseData = queryULBaseData;
    }


    /**
     * Gets the getBCConfigResponse value for this MREMLMREMLResponseEntityResponseExtendMSG.
     * 
     * @return getBCConfigResponse
     */
    public MREML_pkg.ChannelType[] getGetBCConfigResponse() {
        return getBCConfigResponse;
    }


    /**
     * Sets the getBCConfigResponse value for this MREMLMREMLResponseEntityResponseExtendMSG.
     * 
     * @param getBCConfigResponse
     */
    public void setGetBCConfigResponse(MREML_pkg.ChannelType[] getBCConfigResponse) {
        this.getBCConfigResponse = getBCConfigResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MREMLMREMLResponseEntityResponseExtendMSG)) return false;
        MREMLMREMLResponseEntityResponseExtendMSG other = (MREMLMREMLResponseEntityResponseExtendMSG) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.queryResponse==null && other.getQueryResponse()==null) || 
             (this.queryResponse!=null &&
              this.queryResponse.equals(other.getQueryResponse()))) &&
            ((this.queryTaskResponse==null && other.getQueryTaskResponse()==null) || 
             (this.queryTaskResponse!=null &&
              this.queryTaskResponse.equals(other.getQueryTaskResponse()))) &&
            ((this.queryProcessesResponse==null && other.getQueryProcessesResponse()==null) || 
             (this.queryProcessesResponse!=null &&
              java.util.Arrays.equals(this.queryProcessesResponse, other.getQueryProcessesResponse()))) &&
            ((this.queryProcessStatusResponse==null && other.getQueryProcessStatusResponse()==null) || 
             (this.queryProcessStatusResponse!=null &&
              this.queryProcessStatusResponse.equals(other.getQueryProcessStatusResponse()))) &&
            ((this.queryULTaskResponse==null && other.getQueryULTaskResponse()==null) || 
             (this.queryULTaskResponse!=null &&
              this.queryULTaskResponse.equals(other.getQueryULTaskResponse()))) &&
            ((this.queryULBaseData==null && other.getQueryULBaseData()==null) || 
             (this.queryULBaseData!=null &&
              this.queryULBaseData.equals(other.getQueryULBaseData()))) &&
            ((this.getBCConfigResponse==null && other.getGetBCConfigResponse()==null) || 
             (this.getBCConfigResponse!=null &&
              java.util.Arrays.equals(this.getBCConfigResponse, other.getGetBCConfigResponse())));
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
        if (getQueryResponse() != null) {
            _hashCode += getQueryResponse().hashCode();
        }
        if (getQueryTaskResponse() != null) {
            _hashCode += getQueryTaskResponse().hashCode();
        }
        if (getQueryProcessesResponse() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQueryProcessesResponse());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQueryProcessesResponse(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQueryProcessStatusResponse() != null) {
            _hashCode += getQueryProcessStatusResponse().hashCode();
        }
        if (getQueryULTaskResponse() != null) {
            _hashCode += getQueryULTaskResponse().hashCode();
        }
        if (getQueryULBaseData() != null) {
            _hashCode += getQueryULBaseData().hashCode();
        }
        if (getGetBCConfigResponse() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetBCConfigResponse());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetBCConfigResponse(), i);
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
        new org.apache.axis.description.TypeDesc(MREMLMREMLResponseEntityResponseExtendMSG.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>>MREML>MREML>ResponseEntity>ResponseExtendMSG"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "QueryResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>>>MREML>MREML>ResponseEntity>ResponseExtendMSG>QueryResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryTaskResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "QueryTaskResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>>>MREML>MREML>ResponseEntity>ResponseExtendMSG>QueryTaskResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryProcessesResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "QueryProcessesResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", "ProcessType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryProcessStatusResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "QueryProcessStatusResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>>>MREML>MREML>ResponseEntity>ResponseExtendMSG>QueryProcessStatusResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryULTaskResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "QueryULTaskResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", "QueryULTaskResponseType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryULBaseData");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "QueryULBaseData"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>>>MREML>MREML>ResponseEntity>ResponseExtendMSG>QueryULBaseData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getBCConfigResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "GetBCConfigResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", "ChannelType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
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
