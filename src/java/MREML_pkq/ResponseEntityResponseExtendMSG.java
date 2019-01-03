/**
 * ResponseEntityResponseExtendMSG.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class ResponseEntityResponseExtendMSG  implements java.io.Serializable {
    /* �?索响应扩�? */
    private MREML_pkq.ResponseEntityResponseExtendMSGQueryResponse queryResponse;

    /* 任务进度查询响应扩展 */
    private MREML_pkq.ResponseEntityResponseExtendMSGQueryTaskResponse queryTaskResponse;

    /* 查询流程响应扩展 */
    private MREML_pkq.ProcessType[] queryProcessesResponse;

    /* 查询流程进度的响应扩�? */
    private MREML_pkq.ResponseEntityResponseExtendMSGQueryProcessStatusResponse queryProcessStatusResponse;

    /* 查询收录任务状�?�响应扩�? */
    private MREML_pkq.QueryULTaskResponseType queryULTaskResponse;

    /* 获取收录系统基础数据 */
    private MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseData queryULBaseData;

    /* 获取播控配置的响应扩�? */
    private MREML_pkq.ChannelType[] getBCConfigResponse;

    public ResponseEntityResponseExtendMSG() {
    }

    public ResponseEntityResponseExtendMSG(
           MREML_pkq.ResponseEntityResponseExtendMSGQueryResponse queryResponse,
           MREML_pkq.ResponseEntityResponseExtendMSGQueryTaskResponse queryTaskResponse,
           MREML_pkq.ProcessType[] queryProcessesResponse,
           MREML_pkq.ResponseEntityResponseExtendMSGQueryProcessStatusResponse queryProcessStatusResponse,
           MREML_pkq.QueryULTaskResponseType queryULTaskResponse,
           MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseData queryULBaseData,
           MREML_pkq.ChannelType[] getBCConfigResponse) {
           this.queryResponse = queryResponse;
           this.queryTaskResponse = queryTaskResponse;
           this.queryProcessesResponse = queryProcessesResponse;
           this.queryProcessStatusResponse = queryProcessStatusResponse;
           this.queryULTaskResponse = queryULTaskResponse;
           this.queryULBaseData = queryULBaseData;
           this.getBCConfigResponse = getBCConfigResponse;
    }


    /**
     * Gets the queryResponse value for this ResponseEntityResponseExtendMSG.
     * 
     * @return queryResponse   * �?索响应扩�?
     */
    public MREML_pkq.ResponseEntityResponseExtendMSGQueryResponse getQueryResponse() {
        return queryResponse;
    }


    /**
     * Sets the queryResponse value for this ResponseEntityResponseExtendMSG.
     * 
     * @param queryResponse   * �?索响应扩�?
     */
    public void setQueryResponse(MREML_pkq.ResponseEntityResponseExtendMSGQueryResponse queryResponse) {
        this.queryResponse = queryResponse;
    }


    /**
     * Gets the queryTaskResponse value for this ResponseEntityResponseExtendMSG.
     * 
     * @return queryTaskResponse   * 任务进度查询响应扩展
     */
    public MREML_pkq.ResponseEntityResponseExtendMSGQueryTaskResponse getQueryTaskResponse() {
        return queryTaskResponse;
    }


    /**
     * Sets the queryTaskResponse value for this ResponseEntityResponseExtendMSG.
     * 
     * @param queryTaskResponse   * 任务进度查询响应扩展
     */
    public void setQueryTaskResponse(MREML_pkq.ResponseEntityResponseExtendMSGQueryTaskResponse queryTaskResponse) {
        this.queryTaskResponse = queryTaskResponse;
    }


    /**
     * Gets the queryProcessesResponse value for this ResponseEntityResponseExtendMSG.
     * 
     * @return queryProcessesResponse   * 查询流程响应扩展
     */
    public MREML_pkq.ProcessType[] getQueryProcessesResponse() {
        return queryProcessesResponse;
    }


    /**
     * Sets the queryProcessesResponse value for this ResponseEntityResponseExtendMSG.
     * 
     * @param queryProcessesResponse   * 查询流程响应扩展
     */
    public void setQueryProcessesResponse(MREML_pkq.ProcessType[] queryProcessesResponse) {
        this.queryProcessesResponse = queryProcessesResponse;
    }


    /**
     * Gets the queryProcessStatusResponse value for this ResponseEntityResponseExtendMSG.
     * 
     * @return queryProcessStatusResponse   * 查询流程进度的响应扩�?
     */
    public MREML_pkq.ResponseEntityResponseExtendMSGQueryProcessStatusResponse getQueryProcessStatusResponse() {
        return queryProcessStatusResponse;
    }


    /**
     * Sets the queryProcessStatusResponse value for this ResponseEntityResponseExtendMSG.
     * 
     * @param queryProcessStatusResponse   * 查询流程进度的响应扩�?
     */
    public void setQueryProcessStatusResponse(MREML_pkq.ResponseEntityResponseExtendMSGQueryProcessStatusResponse queryProcessStatusResponse) {
        this.queryProcessStatusResponse = queryProcessStatusResponse;
    }


    /**
     * Gets the queryULTaskResponse value for this ResponseEntityResponseExtendMSG.
     * 
     * @return queryULTaskResponse   * 查询收录任务状�?�响应扩�?
     */
    public MREML_pkq.QueryULTaskResponseType getQueryULTaskResponse() {
        return queryULTaskResponse;
    }


    /**
     * Sets the queryULTaskResponse value for this ResponseEntityResponseExtendMSG.
     * 
     * @param queryULTaskResponse   * 查询收录任务状�?�响应扩�?
     */
    public void setQueryULTaskResponse(MREML_pkq.QueryULTaskResponseType queryULTaskResponse) {
        this.queryULTaskResponse = queryULTaskResponse;
    }


    /**
     * Gets the queryULBaseData value for this ResponseEntityResponseExtendMSG.
     * 
     * @return queryULBaseData   * 获取收录系统基础数据
     */
    public MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseData getQueryULBaseData() {
        return queryULBaseData;
    }


    /**
     * Sets the queryULBaseData value for this ResponseEntityResponseExtendMSG.
     * 
     * @param queryULBaseData   * 获取收录系统基础数据
     */
    public void setQueryULBaseData(MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseData queryULBaseData) {
        this.queryULBaseData = queryULBaseData;
    }


    /**
     * Gets the getBCConfigResponse value for this ResponseEntityResponseExtendMSG.
     * 
     * @return getBCConfigResponse   * 获取播控配置的响应扩�?
     */
    public MREML_pkq.ChannelType[] getGetBCConfigResponse() {
        return getBCConfigResponse;
    }


    /**
     * Sets the getBCConfigResponse value for this ResponseEntityResponseExtendMSG.
     * 
     * @param getBCConfigResponse   * 获取播控配置的响应扩�?
     */
    public void setGetBCConfigResponse(MREML_pkq.ChannelType[] getBCConfigResponse) {
        this.getBCConfigResponse = getBCConfigResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseEntityResponseExtendMSG)) return false;
        ResponseEntityResponseExtendMSG other = (ResponseEntityResponseExtendMSG) obj;
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
        new org.apache.axis.description.TypeDesc(ResponseEntityResponseExtendMSG.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>ResponseEntity>ResponseExtendMSG"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "QueryResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>>ResponseEntity>ResponseExtendMSG>QueryResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryTaskResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "QueryTaskResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>>ResponseEntity>ResponseExtendMSG>QueryTaskResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryProcessesResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "QueryProcessesResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", "ProcessType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("MREML", "Process"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryProcessStatusResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "QueryProcessStatusResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>>ResponseEntity>ResponseExtendMSG>QueryProcessStatusResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryULTaskResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "QueryULTaskResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", "QueryULTaskResponseType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryULBaseData");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "QueryULBaseData"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>>ResponseEntity>ResponseExtendMSG>QueryULBaseData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getBCConfigResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "GetBCConfigResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", "ChannelType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("MREML", "Channel"));
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
