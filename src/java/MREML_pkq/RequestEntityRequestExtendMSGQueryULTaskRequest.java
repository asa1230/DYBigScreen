/**
 * RequestEntityRequestExtendMSGQueryULTaskRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class RequestEntityRequestExtendMSGQueryULTaskRequest  implements java.io.Serializable {
    /* 起始时间 */
    private java.lang.String beginDateTime;

    /* 结束时间 */
    private java.lang.String endDateTime;

    /* 是否查询任务拥有�? */
    private int isFindOwner;

    /* 任务拥有者类�? */
    private int ownerType;

    /* 任务拥有者ID */
    private java.lang.String strOwnerID;

    /* 是否查询优先级别 */
    private int isFindPriority;

    /* 任务优先�? 0:�?�? 1:较低 2:正常 3:较高 4:�?�? */
    private int priority;

    /* 是否查询编辑状�?? */
    private int isFindEditStatus;

    /* 任务编辑状�?? 0:未提�? 1:已提�? 2:已审�? 3:审核失败 */
    private int editStatus;

    /* 是否查询任务执行状�?? */
    private int isFindRunStatus;

    /* 任务执行状�?? 0:休眠 1:等待执行 2:正在执行 3:执行完毕 4:发生错误 5:取消 6:已分�? */
    private int runStatus;

    /* 是否查询任务备注 */
    private int isFindTaskMemo;

    /* 任务备注 */
    private java.lang.String strTaskMemo;

    /* 是否查询目标 */
    private int isFindDest;

    /* 目标类型�?1: VTR TAPE    2: DATA FILES */
    private int targetType;

    /* 收录设备。enumTargetType==2时填�?, 3: 采集工作�? 4: 视频服务�? */
    private int recordDevice;

    /* 目标素材名称。enumTargetType==2时填写，可以为空 */
    private java.lang.String findClipName;

    /* 目标磁带名称。enumTargetType==1时填写，可以为空 */
    private java.lang.String targetTapeName;

    /* enumTargetType==1时填写，不能为空，任务目标磁带类型guid */
    private java.lang.String targetVTRTapeType;

    /* 是否查找信号�? */
    private int isFindSrc;

    /* 信号源类型�??1:VTR TAPE  2:信号 */
    private int sourceType;

    /* enumSourceType==2时不能为空，信号guid */
    private java.lang.String signalID;

    /* 源磁带名称�?�enumSourceType==1时填写，可以为空 */
    private java.lang.String sourceTapeName;

    /* enumSourceType==1时填写，不能为空，源磁带类型guid */
    private java.lang.String srcVTRTapeType;

    public RequestEntityRequestExtendMSGQueryULTaskRequest() {
    }

    public RequestEntityRequestExtendMSGQueryULTaskRequest(
           java.lang.String beginDateTime,
           java.lang.String endDateTime,
           int isFindOwner,
           int ownerType,
           java.lang.String strOwnerID,
           int isFindPriority,
           int priority,
           int isFindEditStatus,
           int editStatus,
           int isFindRunStatus,
           int runStatus,
           int isFindTaskMemo,
           java.lang.String strTaskMemo,
           int isFindDest,
           int targetType,
           int recordDevice,
           java.lang.String findClipName,
           java.lang.String targetTapeName,
           java.lang.String targetVTRTapeType,
           int isFindSrc,
           int sourceType,
           java.lang.String signalID,
           java.lang.String sourceTapeName,
           java.lang.String srcVTRTapeType) {
           this.beginDateTime = beginDateTime;
           this.endDateTime = endDateTime;
           this.isFindOwner = isFindOwner;
           this.ownerType = ownerType;
           this.strOwnerID = strOwnerID;
           this.isFindPriority = isFindPriority;
           this.priority = priority;
           this.isFindEditStatus = isFindEditStatus;
           this.editStatus = editStatus;
           this.isFindRunStatus = isFindRunStatus;
           this.runStatus = runStatus;
           this.isFindTaskMemo = isFindTaskMemo;
           this.strTaskMemo = strTaskMemo;
           this.isFindDest = isFindDest;
           this.targetType = targetType;
           this.recordDevice = recordDevice;
           this.findClipName = findClipName;
           this.targetTapeName = targetTapeName;
           this.targetVTRTapeType = targetVTRTapeType;
           this.isFindSrc = isFindSrc;
           this.sourceType = sourceType;
           this.signalID = signalID;
           this.sourceTapeName = sourceTapeName;
           this.srcVTRTapeType = srcVTRTapeType;
    }


    /**
     * Gets the beginDateTime value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @return beginDateTime   * 起始时间
     */
    public java.lang.String getBeginDateTime() {
        return beginDateTime;
    }


    /**
     * Sets the beginDateTime value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @param beginDateTime   * 起始时间
     */
    public void setBeginDateTime(java.lang.String beginDateTime) {
        this.beginDateTime = beginDateTime;
    }


    /**
     * Gets the endDateTime value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @return endDateTime   * 结束时间
     */
    public java.lang.String getEndDateTime() {
        return endDateTime;
    }


    /**
     * Sets the endDateTime value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @param endDateTime   * 结束时间
     */
    public void setEndDateTime(java.lang.String endDateTime) {
        this.endDateTime = endDateTime;
    }


    /**
     * Gets the isFindOwner value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @return isFindOwner   * 是否查询任务拥有�?
     */
    public int getIsFindOwner() {
        return isFindOwner;
    }


    /**
     * Sets the isFindOwner value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @param isFindOwner   * 是否查询任务拥有�?
     */
    public void setIsFindOwner(int isFindOwner) {
        this.isFindOwner = isFindOwner;
    }


    /**
     * Gets the ownerType value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @return ownerType   * 任务拥有者类�?
     */
    public int getOwnerType() {
        return ownerType;
    }


    /**
     * Sets the ownerType value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @param ownerType   * 任务拥有者类�?
     */
    public void setOwnerType(int ownerType) {
        this.ownerType = ownerType;
    }


    /**
     * Gets the strOwnerID value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @return strOwnerID   * 任务拥有者ID
     */
    public java.lang.String getStrOwnerID() {
        return strOwnerID;
    }


    /**
     * Sets the strOwnerID value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @param strOwnerID   * 任务拥有者ID
     */
    public void setStrOwnerID(java.lang.String strOwnerID) {
        this.strOwnerID = strOwnerID;
    }


    /**
     * Gets the isFindPriority value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @return isFindPriority   * 是否查询优先级别
     */
    public int getIsFindPriority() {
        return isFindPriority;
    }


    /**
     * Sets the isFindPriority value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @param isFindPriority   * 是否查询优先级别
     */
    public void setIsFindPriority(int isFindPriority) {
        this.isFindPriority = isFindPriority;
    }


    /**
     * Gets the priority value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @return priority   * 任务优先�? 0:�?�? 1:较低 2:正常 3:较高 4:�?�?
     */
    public int getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @param priority   * 任务优先�? 0:�?�? 1:较低 2:正常 3:较高 4:�?�?
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }


    /**
     * Gets the isFindEditStatus value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @return isFindEditStatus   * 是否查询编辑状�??
     */
    public int getIsFindEditStatus() {
        return isFindEditStatus;
    }


    /**
     * Sets the isFindEditStatus value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @param isFindEditStatus   * 是否查询编辑状�??
     */
    public void setIsFindEditStatus(int isFindEditStatus) {
        this.isFindEditStatus = isFindEditStatus;
    }


    /**
     * Gets the editStatus value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @return editStatus   * 任务编辑状�?? 0:未提�? 1:已提�? 2:已审�? 3:审核失败
     */
    public int getEditStatus() {
        return editStatus;
    }


    /**
     * Sets the editStatus value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @param editStatus   * 任务编辑状�?? 0:未提�? 1:已提�? 2:已审�? 3:审核失败
     */
    public void setEditStatus(int editStatus) {
        this.editStatus = editStatus;
    }


    /**
     * Gets the isFindRunStatus value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @return isFindRunStatus   * 是否查询任务执行状�??
     */
    public int getIsFindRunStatus() {
        return isFindRunStatus;
    }


    /**
     * Sets the isFindRunStatus value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @param isFindRunStatus   * 是否查询任务执行状�??
     */
    public void setIsFindRunStatus(int isFindRunStatus) {
        this.isFindRunStatus = isFindRunStatus;
    }


    /**
     * Gets the runStatus value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @return runStatus   * 任务执行状�?? 0:休眠 1:等待执行 2:正在执行 3:执行完毕 4:发生错误 5:取消 6:已分�?
     */
    public int getRunStatus() {
        return runStatus;
    }


    /**
     * Sets the runStatus value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @param runStatus   * 任务执行状�?? 0:休眠 1:等待执行 2:正在执行 3:执行完毕 4:发生错误 5:取消 6:已分�?
     */
    public void setRunStatus(int runStatus) {
        this.runStatus = runStatus;
    }


    /**
     * Gets the isFindTaskMemo value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @return isFindTaskMemo   * 是否查询任务备注
     */
    public int getIsFindTaskMemo() {
        return isFindTaskMemo;
    }


    /**
     * Sets the isFindTaskMemo value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @param isFindTaskMemo   * 是否查询任务备注
     */
    public void setIsFindTaskMemo(int isFindTaskMemo) {
        this.isFindTaskMemo = isFindTaskMemo;
    }


    /**
     * Gets the strTaskMemo value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @return strTaskMemo   * 任务备注
     */
    public java.lang.String getStrTaskMemo() {
        return strTaskMemo;
    }


    /**
     * Sets the strTaskMemo value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @param strTaskMemo   * 任务备注
     */
    public void setStrTaskMemo(java.lang.String strTaskMemo) {
        this.strTaskMemo = strTaskMemo;
    }


    /**
     * Gets the isFindDest value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @return isFindDest   * 是否查询目标
     */
    public int getIsFindDest() {
        return isFindDest;
    }


    /**
     * Sets the isFindDest value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @param isFindDest   * 是否查询目标
     */
    public void setIsFindDest(int isFindDest) {
        this.isFindDest = isFindDest;
    }


    /**
     * Gets the targetType value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @return targetType   * 目标类型�?1: VTR TAPE    2: DATA FILES
     */
    public int getTargetType() {
        return targetType;
    }


    /**
     * Sets the targetType value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @param targetType   * 目标类型�?1: VTR TAPE    2: DATA FILES
     */
    public void setTargetType(int targetType) {
        this.targetType = targetType;
    }


    /**
     * Gets the recordDevice value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @return recordDevice   * 收录设备。enumTargetType==2时填�?, 3: 采集工作�? 4: 视频服务�?
     */
    public int getRecordDevice() {
        return recordDevice;
    }


    /**
     * Sets the recordDevice value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @param recordDevice   * 收录设备。enumTargetType==2时填�?, 3: 采集工作�? 4: 视频服务�?
     */
    public void setRecordDevice(int recordDevice) {
        this.recordDevice = recordDevice;
    }


    /**
     * Gets the findClipName value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @return findClipName   * 目标素材名称。enumTargetType==2时填写，可以为空
     */
    public java.lang.String getFindClipName() {
        return findClipName;
    }


    /**
     * Sets the findClipName value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @param findClipName   * 目标素材名称。enumTargetType==2时填写，可以为空
     */
    public void setFindClipName(java.lang.String findClipName) {
        this.findClipName = findClipName;
    }


    /**
     * Gets the targetTapeName value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @return targetTapeName   * 目标磁带名称。enumTargetType==1时填写，可以为空
     */
    public java.lang.String getTargetTapeName() {
        return targetTapeName;
    }


    /**
     * Sets the targetTapeName value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @param targetTapeName   * 目标磁带名称。enumTargetType==1时填写，可以为空
     */
    public void setTargetTapeName(java.lang.String targetTapeName) {
        this.targetTapeName = targetTapeName;
    }


    /**
     * Gets the targetVTRTapeType value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @return targetVTRTapeType   * enumTargetType==1时填写，不能为空，任务目标磁带类型guid
     */
    public java.lang.String getTargetVTRTapeType() {
        return targetVTRTapeType;
    }


    /**
     * Sets the targetVTRTapeType value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @param targetVTRTapeType   * enumTargetType==1时填写，不能为空，任务目标磁带类型guid
     */
    public void setTargetVTRTapeType(java.lang.String targetVTRTapeType) {
        this.targetVTRTapeType = targetVTRTapeType;
    }


    /**
     * Gets the isFindSrc value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @return isFindSrc   * 是否查找信号�?
     */
    public int getIsFindSrc() {
        return isFindSrc;
    }


    /**
     * Sets the isFindSrc value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @param isFindSrc   * 是否查找信号�?
     */
    public void setIsFindSrc(int isFindSrc) {
        this.isFindSrc = isFindSrc;
    }


    /**
     * Gets the sourceType value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @return sourceType   * 信号源类型�??1:VTR TAPE  2:信号
     */
    public int getSourceType() {
        return sourceType;
    }


    /**
     * Sets the sourceType value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @param sourceType   * 信号源类型�??1:VTR TAPE  2:信号
     */
    public void setSourceType(int sourceType) {
        this.sourceType = sourceType;
    }


    /**
     * Gets the signalID value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @return signalID   * enumSourceType==2时不能为空，信号guid
     */
    public java.lang.String getSignalID() {
        return signalID;
    }


    /**
     * Sets the signalID value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @param signalID   * enumSourceType==2时不能为空，信号guid
     */
    public void setSignalID(java.lang.String signalID) {
        this.signalID = signalID;
    }


    /**
     * Gets the sourceTapeName value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @return sourceTapeName   * 源磁带名称�?�enumSourceType==1时填写，可以为空
     */
    public java.lang.String getSourceTapeName() {
        return sourceTapeName;
    }


    /**
     * Sets the sourceTapeName value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @param sourceTapeName   * 源磁带名称�?�enumSourceType==1时填写，可以为空
     */
    public void setSourceTapeName(java.lang.String sourceTapeName) {
        this.sourceTapeName = sourceTapeName;
    }


    /**
     * Gets the srcVTRTapeType value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @return srcVTRTapeType   * enumSourceType==1时填写，不能为空，源磁带类型guid
     */
    public java.lang.String getSrcVTRTapeType() {
        return srcVTRTapeType;
    }


    /**
     * Sets the srcVTRTapeType value for this RequestEntityRequestExtendMSGQueryULTaskRequest.
     * 
     * @param srcVTRTapeType   * enumSourceType==1时填写，不能为空，源磁带类型guid
     */
    public void setSrcVTRTapeType(java.lang.String srcVTRTapeType) {
        this.srcVTRTapeType = srcVTRTapeType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestEntityRequestExtendMSGQueryULTaskRequest)) return false;
        RequestEntityRequestExtendMSGQueryULTaskRequest other = (RequestEntityRequestExtendMSGQueryULTaskRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.beginDateTime==null && other.getBeginDateTime()==null) || 
             (this.beginDateTime!=null &&
              this.beginDateTime.equals(other.getBeginDateTime()))) &&
            ((this.endDateTime==null && other.getEndDateTime()==null) || 
             (this.endDateTime!=null &&
              this.endDateTime.equals(other.getEndDateTime()))) &&
            this.isFindOwner == other.getIsFindOwner() &&
            this.ownerType == other.getOwnerType() &&
            ((this.strOwnerID==null && other.getStrOwnerID()==null) || 
             (this.strOwnerID!=null &&
              this.strOwnerID.equals(other.getStrOwnerID()))) &&
            this.isFindPriority == other.getIsFindPriority() &&
            this.priority == other.getPriority() &&
            this.isFindEditStatus == other.getIsFindEditStatus() &&
            this.editStatus == other.getEditStatus() &&
            this.isFindRunStatus == other.getIsFindRunStatus() &&
            this.runStatus == other.getRunStatus() &&
            this.isFindTaskMemo == other.getIsFindTaskMemo() &&
            ((this.strTaskMemo==null && other.getStrTaskMemo()==null) || 
             (this.strTaskMemo!=null &&
              this.strTaskMemo.equals(other.getStrTaskMemo()))) &&
            this.isFindDest == other.getIsFindDest() &&
            this.targetType == other.getTargetType() &&
            this.recordDevice == other.getRecordDevice() &&
            ((this.findClipName==null && other.getFindClipName()==null) || 
             (this.findClipName!=null &&
              this.findClipName.equals(other.getFindClipName()))) &&
            ((this.targetTapeName==null && other.getTargetTapeName()==null) || 
             (this.targetTapeName!=null &&
              this.targetTapeName.equals(other.getTargetTapeName()))) &&
            ((this.targetVTRTapeType==null && other.getTargetVTRTapeType()==null) || 
             (this.targetVTRTapeType!=null &&
              this.targetVTRTapeType.equals(other.getTargetVTRTapeType()))) &&
            this.isFindSrc == other.getIsFindSrc() &&
            this.sourceType == other.getSourceType() &&
            ((this.signalID==null && other.getSignalID()==null) || 
             (this.signalID!=null &&
              this.signalID.equals(other.getSignalID()))) &&
            ((this.sourceTapeName==null && other.getSourceTapeName()==null) || 
             (this.sourceTapeName!=null &&
              this.sourceTapeName.equals(other.getSourceTapeName()))) &&
            ((this.srcVTRTapeType==null && other.getSrcVTRTapeType()==null) || 
             (this.srcVTRTapeType!=null &&
              this.srcVTRTapeType.equals(other.getSrcVTRTapeType())));
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
        if (getBeginDateTime() != null) {
            _hashCode += getBeginDateTime().hashCode();
        }
        if (getEndDateTime() != null) {
            _hashCode += getEndDateTime().hashCode();
        }
        _hashCode += getIsFindOwner();
        _hashCode += getOwnerType();
        if (getStrOwnerID() != null) {
            _hashCode += getStrOwnerID().hashCode();
        }
        _hashCode += getIsFindPriority();
        _hashCode += getPriority();
        _hashCode += getIsFindEditStatus();
        _hashCode += getEditStatus();
        _hashCode += getIsFindRunStatus();
        _hashCode += getRunStatus();
        _hashCode += getIsFindTaskMemo();
        if (getStrTaskMemo() != null) {
            _hashCode += getStrTaskMemo().hashCode();
        }
        _hashCode += getIsFindDest();
        _hashCode += getTargetType();
        _hashCode += getRecordDevice();
        if (getFindClipName() != null) {
            _hashCode += getFindClipName().hashCode();
        }
        if (getTargetTapeName() != null) {
            _hashCode += getTargetTapeName().hashCode();
        }
        if (getTargetVTRTapeType() != null) {
            _hashCode += getTargetVTRTapeType().hashCode();
        }
        _hashCode += getIsFindSrc();
        _hashCode += getSourceType();
        if (getSignalID() != null) {
            _hashCode += getSignalID().hashCode();
        }
        if (getSourceTapeName() != null) {
            _hashCode += getSourceTapeName().hashCode();
        }
        if (getSrcVTRTapeType() != null) {
            _hashCode += getSrcVTRTapeType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestEntityRequestExtendMSGQueryULTaskRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>>RequestEntity>RequestExtendMSG>QueryULTaskRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beginDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "beginDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "endDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFindOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "IsFindOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerType");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "OwnerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strOwnerID");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "strOwnerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFindPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "IsFindPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFindEditStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "IsFindEditStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "EditStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFindRunStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "IsFindRunStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "RunStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFindTaskMemo");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "IsFindTaskMemo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strTaskMemo");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "strTaskMemo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFindDest");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "IsFindDest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetType");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "TargetType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordDevice");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "RecordDevice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("findClipName");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "FindClipName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetTapeName");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "TargetTapeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetVTRTapeType");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "TargetVTRTapeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFindSrc");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "IsFindSrc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceType");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "SourceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signalID");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "SignalID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceTapeName");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "SourceTapeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srcVTRTapeType");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "SrcVTRTapeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
