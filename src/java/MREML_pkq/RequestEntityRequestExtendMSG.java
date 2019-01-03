/**
 * RequestEntityRequestExtendMSG.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class RequestEntityRequestExtendMSG  implements java.io.Serializable {
    /* 入库请求扩展 */
    private MREML_pkq.RequestEntityRequestExtendMSGImportRequest importRequest;

    /* 节目查询验证请求扩展 */
    private MREML_pkq.RequestEntityRequestExtendMSGQueryValidateRequest queryValidateRequest;

    /* 媒资查询条件实体 */
    private MREML_pkq.RequestEntityRequestExtendMSGQueryRequest queryRequest;

    /* 查询任务进度请求扩展 */
    private MREML_pkq.RequestEntityRequestExtendMSGQueryTaskRequest queryTaskRequest;

    /* 查询串联单的请求扩展 */
    private MREML_pkq.RequestEntityRequestExtendMSGQueryBCListRequest queryBCListRequest;

    /* 查询流程的扩�? */
    private MREML_pkq.RequestEntityRequestExtendMSGQueryProcessesRequest queryProcessesRequest;

    /* 查询流程状�?�的请求扩展 */
    private MREML_pkq.RequestEntityRequestExtendMSGQueryProcessStatusRequest queryProcessStatusRequest;

    /* 添加转码拷贝任务请求扩展 */
    private MREML_pkq.RequestEntityRequestExtendMSGAddTCCopyTaskRequest addTCCopyTaskRequest;

    /* 添加收录任务请求扩展 */
    private MREML_pkq.RequestEntityRequestExtendMSGAddULTaskRequest addULTaskRequest;

    /* 更新收录任务请求扩展 */
    private MREML_pkq.RequestEntityRequestExtendMSGUpdateULTaskRequest updateULTaskRequest;

    /* 删除任务的请求扩�? */
    private MREML_pkq.RequestEntityRequestExtendMSGDeleteTaskRequest deleteTaskRequest;

    /* 查询收录任务的请求扩�? */
    private MREML_pkq.RequestEntityRequestExtendMSGQueryULTaskRequest queryULTaskRequest;

    public RequestEntityRequestExtendMSG() {
    }

    public RequestEntityRequestExtendMSG(
           MREML_pkq.RequestEntityRequestExtendMSGImportRequest importRequest,
           MREML_pkq.RequestEntityRequestExtendMSGQueryValidateRequest queryValidateRequest,
           MREML_pkq.RequestEntityRequestExtendMSGQueryRequest queryRequest,
           MREML_pkq.RequestEntityRequestExtendMSGQueryTaskRequest queryTaskRequest,
           MREML_pkq.RequestEntityRequestExtendMSGQueryBCListRequest queryBCListRequest,
           MREML_pkq.RequestEntityRequestExtendMSGQueryProcessesRequest queryProcessesRequest,
           MREML_pkq.RequestEntityRequestExtendMSGQueryProcessStatusRequest queryProcessStatusRequest,
           MREML_pkq.RequestEntityRequestExtendMSGAddTCCopyTaskRequest addTCCopyTaskRequest,
           MREML_pkq.RequestEntityRequestExtendMSGAddULTaskRequest addULTaskRequest,
           MREML_pkq.RequestEntityRequestExtendMSGUpdateULTaskRequest updateULTaskRequest,
           MREML_pkq.RequestEntityRequestExtendMSGDeleteTaskRequest deleteTaskRequest,
           MREML_pkq.RequestEntityRequestExtendMSGQueryULTaskRequest queryULTaskRequest) {
           this.importRequest = importRequest;
           this.queryValidateRequest = queryValidateRequest;
           this.queryRequest = queryRequest;
           this.queryTaskRequest = queryTaskRequest;
           this.queryBCListRequest = queryBCListRequest;
           this.queryProcessesRequest = queryProcessesRequest;
           this.queryProcessStatusRequest = queryProcessStatusRequest;
           this.addTCCopyTaskRequest = addTCCopyTaskRequest;
           this.addULTaskRequest = addULTaskRequest;
           this.updateULTaskRequest = updateULTaskRequest;
           this.deleteTaskRequest = deleteTaskRequest;
           this.queryULTaskRequest = queryULTaskRequest;
    }


    /**
     * Gets the importRequest value for this RequestEntityRequestExtendMSG.
     * 
     * @return importRequest   * 入库请求扩展
     */
    public MREML_pkq.RequestEntityRequestExtendMSGImportRequest getImportRequest() {
        return importRequest;
    }


    /**
     * Sets the importRequest value for this RequestEntityRequestExtendMSG.
     * 
     * @param importRequest   * 入库请求扩展
     */
    public void setImportRequest(MREML_pkq.RequestEntityRequestExtendMSGImportRequest importRequest) {
        this.importRequest = importRequest;
    }


    /**
     * Gets the queryValidateRequest value for this RequestEntityRequestExtendMSG.
     * 
     * @return queryValidateRequest   * 节目查询验证请求扩展
     */
    public MREML_pkq.RequestEntityRequestExtendMSGQueryValidateRequest getQueryValidateRequest() {
        return queryValidateRequest;
    }


    /**
     * Sets the queryValidateRequest value for this RequestEntityRequestExtendMSG.
     * 
     * @param queryValidateRequest   * 节目查询验证请求扩展
     */
    public void setQueryValidateRequest(MREML_pkq.RequestEntityRequestExtendMSGQueryValidateRequest queryValidateRequest) {
        this.queryValidateRequest = queryValidateRequest;
    }


    /**
     * Gets the queryRequest value for this RequestEntityRequestExtendMSG.
     * 
     * @return queryRequest   * 媒资查询条件实体
     */
    public MREML_pkq.RequestEntityRequestExtendMSGQueryRequest getQueryRequest() {
        return queryRequest;
    }


    /**
     * Sets the queryRequest value for this RequestEntityRequestExtendMSG.
     * 
     * @param queryRequest   * 媒资查询条件实体
     */
    public void setQueryRequest(MREML_pkq.RequestEntityRequestExtendMSGQueryRequest queryRequest) {
        this.queryRequest = queryRequest;
    }


    /**
     * Gets the queryTaskRequest value for this RequestEntityRequestExtendMSG.
     * 
     * @return queryTaskRequest   * 查询任务进度请求扩展
     */
    public MREML_pkq.RequestEntityRequestExtendMSGQueryTaskRequest getQueryTaskRequest() {
        return queryTaskRequest;
    }


    /**
     * Sets the queryTaskRequest value for this RequestEntityRequestExtendMSG.
     * 
     * @param queryTaskRequest   * 查询任务进度请求扩展
     */
    public void setQueryTaskRequest(MREML_pkq.RequestEntityRequestExtendMSGQueryTaskRequest queryTaskRequest) {
        this.queryTaskRequest = queryTaskRequest;
    }


    /**
     * Gets the queryBCListRequest value for this RequestEntityRequestExtendMSG.
     * 
     * @return queryBCListRequest   * 查询串联单的请求扩展
     */
    public MREML_pkq.RequestEntityRequestExtendMSGQueryBCListRequest getQueryBCListRequest() {
        return queryBCListRequest;
    }


    /**
     * Sets the queryBCListRequest value for this RequestEntityRequestExtendMSG.
     * 
     * @param queryBCListRequest   * 查询串联单的请求扩展
     */
    public void setQueryBCListRequest(MREML_pkq.RequestEntityRequestExtendMSGQueryBCListRequest queryBCListRequest) {
        this.queryBCListRequest = queryBCListRequest;
    }


    /**
     * Gets the queryProcessesRequest value for this RequestEntityRequestExtendMSG.
     * 
     * @return queryProcessesRequest   * 查询流程的扩�?
     */
    public MREML_pkq.RequestEntityRequestExtendMSGQueryProcessesRequest getQueryProcessesRequest() {
        return queryProcessesRequest;
    }


    /**
     * Sets the queryProcessesRequest value for this RequestEntityRequestExtendMSG.
     * 
     * @param queryProcessesRequest   * 查询流程的扩�?
     */
    public void setQueryProcessesRequest(MREML_pkq.RequestEntityRequestExtendMSGQueryProcessesRequest queryProcessesRequest) {
        this.queryProcessesRequest = queryProcessesRequest;
    }


    /**
     * Gets the queryProcessStatusRequest value for this RequestEntityRequestExtendMSG.
     * 
     * @return queryProcessStatusRequest   * 查询流程状�?�的请求扩展
     */
    public MREML_pkq.RequestEntityRequestExtendMSGQueryProcessStatusRequest getQueryProcessStatusRequest() {
        return queryProcessStatusRequest;
    }


    /**
     * Sets the queryProcessStatusRequest value for this RequestEntityRequestExtendMSG.
     * 
     * @param queryProcessStatusRequest   * 查询流程状�?�的请求扩展
     */
    public void setQueryProcessStatusRequest(MREML_pkq.RequestEntityRequestExtendMSGQueryProcessStatusRequest queryProcessStatusRequest) {
        this.queryProcessStatusRequest = queryProcessStatusRequest;
    }


    /**
     * Gets the addTCCopyTaskRequest value for this RequestEntityRequestExtendMSG.
     * 
     * @return addTCCopyTaskRequest   * 添加转码拷贝任务请求扩展
     */
    public MREML_pkq.RequestEntityRequestExtendMSGAddTCCopyTaskRequest getAddTCCopyTaskRequest() {
        return addTCCopyTaskRequest;
    }


    /**
     * Sets the addTCCopyTaskRequest value for this RequestEntityRequestExtendMSG.
     * 
     * @param addTCCopyTaskRequest   * 添加转码拷贝任务请求扩展
     */
    public void setAddTCCopyTaskRequest(MREML_pkq.RequestEntityRequestExtendMSGAddTCCopyTaskRequest addTCCopyTaskRequest) {
        this.addTCCopyTaskRequest = addTCCopyTaskRequest;
    }


    /**
     * Gets the addULTaskRequest value for this RequestEntityRequestExtendMSG.
     * 
     * @return addULTaskRequest   * 添加收录任务请求扩展
     */
    public MREML_pkq.RequestEntityRequestExtendMSGAddULTaskRequest getAddULTaskRequest() {
        return addULTaskRequest;
    }


    /**
     * Sets the addULTaskRequest value for this RequestEntityRequestExtendMSG.
     * 
     * @param addULTaskRequest   * 添加收录任务请求扩展
     */
    public void setAddULTaskRequest(MREML_pkq.RequestEntityRequestExtendMSGAddULTaskRequest addULTaskRequest) {
        this.addULTaskRequest = addULTaskRequest;
    }


    /**
     * Gets the updateULTaskRequest value for this RequestEntityRequestExtendMSG.
     * 
     * @return updateULTaskRequest   * 更新收录任务请求扩展
     */
    public MREML_pkq.RequestEntityRequestExtendMSGUpdateULTaskRequest getUpdateULTaskRequest() {
        return updateULTaskRequest;
    }


    /**
     * Sets the updateULTaskRequest value for this RequestEntityRequestExtendMSG.
     * 
     * @param updateULTaskRequest   * 更新收录任务请求扩展
     */
    public void setUpdateULTaskRequest(MREML_pkq.RequestEntityRequestExtendMSGUpdateULTaskRequest updateULTaskRequest) {
        this.updateULTaskRequest = updateULTaskRequest;
    }


    /**
     * Gets the deleteTaskRequest value for this RequestEntityRequestExtendMSG.
     * 
     * @return deleteTaskRequest   * 删除任务的请求扩�?
     */
    public MREML_pkq.RequestEntityRequestExtendMSGDeleteTaskRequest getDeleteTaskRequest() {
        return deleteTaskRequest;
    }


    /**
     * Sets the deleteTaskRequest value for this RequestEntityRequestExtendMSG.
     * 
     * @param deleteTaskRequest   * 删除任务的请求扩�?
     */
    public void setDeleteTaskRequest(MREML_pkq.RequestEntityRequestExtendMSGDeleteTaskRequest deleteTaskRequest) {
        this.deleteTaskRequest = deleteTaskRequest;
    }


    /**
     * Gets the queryULTaskRequest value for this RequestEntityRequestExtendMSG.
     * 
     * @return queryULTaskRequest   * 查询收录任务的请求扩�?
     */
    public MREML_pkq.RequestEntityRequestExtendMSGQueryULTaskRequest getQueryULTaskRequest() {
        return queryULTaskRequest;
    }


    /**
     * Sets the queryULTaskRequest value for this RequestEntityRequestExtendMSG.
     * 
     * @param queryULTaskRequest   * 查询收录任务的请求扩�?
     */
    public void setQueryULTaskRequest(MREML_pkq.RequestEntityRequestExtendMSGQueryULTaskRequest queryULTaskRequest) {
        this.queryULTaskRequest = queryULTaskRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestEntityRequestExtendMSG)) return false;
        RequestEntityRequestExtendMSG other = (RequestEntityRequestExtendMSG) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.importRequest==null && other.getImportRequest()==null) || 
             (this.importRequest!=null &&
              this.importRequest.equals(other.getImportRequest()))) &&
            ((this.queryValidateRequest==null && other.getQueryValidateRequest()==null) || 
             (this.queryValidateRequest!=null &&
              this.queryValidateRequest.equals(other.getQueryValidateRequest()))) &&
            ((this.queryRequest==null && other.getQueryRequest()==null) || 
             (this.queryRequest!=null &&
              this.queryRequest.equals(other.getQueryRequest()))) &&
            ((this.queryTaskRequest==null && other.getQueryTaskRequest()==null) || 
             (this.queryTaskRequest!=null &&
              this.queryTaskRequest.equals(other.getQueryTaskRequest()))) &&
            ((this.queryBCListRequest==null && other.getQueryBCListRequest()==null) || 
             (this.queryBCListRequest!=null &&
              this.queryBCListRequest.equals(other.getQueryBCListRequest()))) &&
            ((this.queryProcessesRequest==null && other.getQueryProcessesRequest()==null) || 
             (this.queryProcessesRequest!=null &&
              this.queryProcessesRequest.equals(other.getQueryProcessesRequest()))) &&
            ((this.queryProcessStatusRequest==null && other.getQueryProcessStatusRequest()==null) || 
             (this.queryProcessStatusRequest!=null &&
              this.queryProcessStatusRequest.equals(other.getQueryProcessStatusRequest()))) &&
            ((this.addTCCopyTaskRequest==null && other.getAddTCCopyTaskRequest()==null) || 
             (this.addTCCopyTaskRequest!=null &&
              this.addTCCopyTaskRequest.equals(other.getAddTCCopyTaskRequest()))) &&
            ((this.addULTaskRequest==null && other.getAddULTaskRequest()==null) || 
             (this.addULTaskRequest!=null &&
              this.addULTaskRequest.equals(other.getAddULTaskRequest()))) &&
            ((this.updateULTaskRequest==null && other.getUpdateULTaskRequest()==null) || 
             (this.updateULTaskRequest!=null &&
              this.updateULTaskRequest.equals(other.getUpdateULTaskRequest()))) &&
            ((this.deleteTaskRequest==null && other.getDeleteTaskRequest()==null) || 
             (this.deleteTaskRequest!=null &&
              this.deleteTaskRequest.equals(other.getDeleteTaskRequest()))) &&
            ((this.queryULTaskRequest==null && other.getQueryULTaskRequest()==null) || 
             (this.queryULTaskRequest!=null &&
              this.queryULTaskRequest.equals(other.getQueryULTaskRequest())));
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
        if (getImportRequest() != null) {
            _hashCode += getImportRequest().hashCode();
        }
        if (getQueryValidateRequest() != null) {
            _hashCode += getQueryValidateRequest().hashCode();
        }
        if (getQueryRequest() != null) {
            _hashCode += getQueryRequest().hashCode();
        }
        if (getQueryTaskRequest() != null) {
            _hashCode += getQueryTaskRequest().hashCode();
        }
        if (getQueryBCListRequest() != null) {
            _hashCode += getQueryBCListRequest().hashCode();
        }
        if (getQueryProcessesRequest() != null) {
            _hashCode += getQueryProcessesRequest().hashCode();
        }
        if (getQueryProcessStatusRequest() != null) {
            _hashCode += getQueryProcessStatusRequest().hashCode();
        }
        if (getAddTCCopyTaskRequest() != null) {
            _hashCode += getAddTCCopyTaskRequest().hashCode();
        }
        if (getAddULTaskRequest() != null) {
            _hashCode += getAddULTaskRequest().hashCode();
        }
        if (getUpdateULTaskRequest() != null) {
            _hashCode += getUpdateULTaskRequest().hashCode();
        }
        if (getDeleteTaskRequest() != null) {
            _hashCode += getDeleteTaskRequest().hashCode();
        }
        if (getQueryULTaskRequest() != null) {
            _hashCode += getQueryULTaskRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestEntityRequestExtendMSG.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>RequestEntity>RequestExtendMSG"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ImportRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>>RequestEntity>RequestExtendMSG>ImportRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryValidateRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "QueryValidateRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>>RequestEntity>RequestExtendMSG>QueryValidateRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "QueryRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>>RequestEntity>RequestExtendMSG>QueryRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryTaskRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "QueryTaskRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>>RequestEntity>RequestExtendMSG>QueryTaskRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryBCListRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "QueryBCListRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>>RequestEntity>RequestExtendMSG>QueryBCListRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryProcessesRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "QueryProcessesRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>>RequestEntity>RequestExtendMSG>QueryProcessesRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryProcessStatusRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "QueryProcessStatusRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>>RequestEntity>RequestExtendMSG>QueryProcessStatusRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addTCCopyTaskRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "AddTCCopyTaskRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>>RequestEntity>RequestExtendMSG>AddTCCopyTaskRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addULTaskRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "AddULTaskRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>>RequestEntity>RequestExtendMSG>AddULTaskRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateULTaskRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "UpdateULTaskRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>>RequestEntity>RequestExtendMSG>UpdateULTaskRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteTaskRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "DeleteTaskRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>>RequestEntity>RequestExtendMSG>DeleteTaskRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryULTaskRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "QueryULTaskRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>>RequestEntity>RequestExtendMSG>QueryULTaskRequest"));
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
