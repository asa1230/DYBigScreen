/**
 * ULTaskInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkg;

public class ULTaskInfoType  implements java.io.Serializable {
    private java.lang.String taskID;

    private java.lang.String name;

    private java.lang.String hint;

    private int priority;

    private int loopStyle;

    private int ownerType;

    private java.lang.String ownerID;

    private int editStatus;

    private java.lang.String sponser;

    private java.lang.String prepareDate;

    private java.lang.String endAuditDate;

    private java.lang.String auditorName;

    private int sourceType;

    private int duration;

    private java.lang.String VTRTapeTypeSource;

    private java.lang.String VTRTapeNameSource;

    private int isSetTrimInOutSource;

    private int VTRTrimInSource;

    private int VTRTrimOutSource;

    private java.lang.String VTRTapeReady;

    private java.lang.String VTRRecFinish;

    private java.lang.String signalID;

    private java.lang.String signalStartRec;

    private java.lang.String signalStopRec;

    private java.lang.String VTRTapeTypeNameSource;

    private java.lang.String signalName;

    private int isPassGateWay;

    private int isNeedDecode;

    private int isNeedEncode;

    private int isNeedChangeRate;

    private float targetRate;

    private int targetType;

    private java.lang.String VTRTapeTypeTarget;

    private java.lang.String VTRTapeNameTarget;

    private int isSetTrimInOutTarget;

    private int VTRTrimInTarget;

    private int VTRTrimOutTarget;

    private int recordDevice;

    private java.lang.String clipName;

    private java.lang.String keyWords;

    private java.lang.String remark;

    private java.lang.String elementInfoGropuID;

    private int isRemoteTDIR;

    private double secFlushFrequency;

    private int isRunVideoFrameAnalysis;

    private java.lang.String tapeTypeName;

    private int isNeedDAOutbed;

    private int isNeedADInbed;

    private java.lang.String taskClassID;

    private int isBackUp;

    private java.lang.String ORGTask;

    private java.lang.String orgTaskName;

    private java.lang.String cycleID;

    private java.lang.String cycleReadyTime;

    private java.lang.String cycleFinishTime;

    private java.lang.String startTime;

    private java.lang.String endTime;

    private int loopType;

    private int intervalTime;

    private int actDayInWeek;

    private int actDayInMonth;

    private int actDayInYear;

    private int isConflict;

    private java.lang.String linkNewsID;

    public ULTaskInfoType() {
    }

    public ULTaskInfoType(
           java.lang.String taskID,
           java.lang.String name,
           java.lang.String hint,
           int priority,
           int loopStyle,
           int ownerType,
           java.lang.String ownerID,
           int editStatus,
           java.lang.String sponser,
           java.lang.String prepareDate,
           java.lang.String endAuditDate,
           java.lang.String auditorName,
           int sourceType,
           int duration,
           java.lang.String VTRTapeTypeSource,
           java.lang.String VTRTapeNameSource,
           int isSetTrimInOutSource,
           int VTRTrimInSource,
           int VTRTrimOutSource,
           java.lang.String VTRTapeReady,
           java.lang.String VTRRecFinish,
           java.lang.String signalID,
           java.lang.String signalStartRec,
           java.lang.String signalStopRec,
           java.lang.String VTRTapeTypeNameSource,
           java.lang.String signalName,
           int isPassGateWay,
           int isNeedDecode,
           int isNeedEncode,
           int isNeedChangeRate,
           float targetRate,
           int targetType,
           java.lang.String VTRTapeTypeTarget,
           java.lang.String VTRTapeNameTarget,
           int isSetTrimInOutTarget,
           int VTRTrimInTarget,
           int VTRTrimOutTarget,
           int recordDevice,
           java.lang.String clipName,
           java.lang.String keyWords,
           java.lang.String remark,
           java.lang.String elementInfoGropuID,
           int isRemoteTDIR,
           double secFlushFrequency,
           int isRunVideoFrameAnalysis,
           java.lang.String tapeTypeName,
           int isNeedDAOutbed,
           int isNeedADInbed,
           java.lang.String taskClassID,
           int isBackUp,
           java.lang.String ORGTask,
           java.lang.String orgTaskName,
           java.lang.String cycleID,
           java.lang.String cycleReadyTime,
           java.lang.String cycleFinishTime,
           java.lang.String startTime,
           java.lang.String endTime,
           int loopType,
           int intervalTime,
           int actDayInWeek,
           int actDayInMonth,
           int actDayInYear,
           int isConflict,
           java.lang.String linkNewsID) {
           this.taskID = taskID;
           this.name = name;
           this.hint = hint;
           this.priority = priority;
           this.loopStyle = loopStyle;
           this.ownerType = ownerType;
           this.ownerID = ownerID;
           this.editStatus = editStatus;
           this.sponser = sponser;
           this.prepareDate = prepareDate;
           this.endAuditDate = endAuditDate;
           this.auditorName = auditorName;
           this.sourceType = sourceType;
           this.duration = duration;
           this.VTRTapeTypeSource = VTRTapeTypeSource;
           this.VTRTapeNameSource = VTRTapeNameSource;
           this.isSetTrimInOutSource = isSetTrimInOutSource;
           this.VTRTrimInSource = VTRTrimInSource;
           this.VTRTrimOutSource = VTRTrimOutSource;
           this.VTRTapeReady = VTRTapeReady;
           this.VTRRecFinish = VTRRecFinish;
           this.signalID = signalID;
           this.signalStartRec = signalStartRec;
           this.signalStopRec = signalStopRec;
           this.VTRTapeTypeNameSource = VTRTapeTypeNameSource;
           this.signalName = signalName;
           this.isPassGateWay = isPassGateWay;
           this.isNeedDecode = isNeedDecode;
           this.isNeedEncode = isNeedEncode;
           this.isNeedChangeRate = isNeedChangeRate;
           this.targetRate = targetRate;
           this.targetType = targetType;
           this.VTRTapeTypeTarget = VTRTapeTypeTarget;
           this.VTRTapeNameTarget = VTRTapeNameTarget;
           this.isSetTrimInOutTarget = isSetTrimInOutTarget;
           this.VTRTrimInTarget = VTRTrimInTarget;
           this.VTRTrimOutTarget = VTRTrimOutTarget;
           this.recordDevice = recordDevice;
           this.clipName = clipName;
           this.keyWords = keyWords;
           this.remark = remark;
           this.elementInfoGropuID = elementInfoGropuID;
           this.isRemoteTDIR = isRemoteTDIR;
           this.secFlushFrequency = secFlushFrequency;
           this.isRunVideoFrameAnalysis = isRunVideoFrameAnalysis;
           this.tapeTypeName = tapeTypeName;
           this.isNeedDAOutbed = isNeedDAOutbed;
           this.isNeedADInbed = isNeedADInbed;
           this.taskClassID = taskClassID;
           this.isBackUp = isBackUp;
           this.ORGTask = ORGTask;
           this.orgTaskName = orgTaskName;
           this.cycleID = cycleID;
           this.cycleReadyTime = cycleReadyTime;
           this.cycleFinishTime = cycleFinishTime;
           this.startTime = startTime;
           this.endTime = endTime;
           this.loopType = loopType;
           this.intervalTime = intervalTime;
           this.actDayInWeek = actDayInWeek;
           this.actDayInMonth = actDayInMonth;
           this.actDayInYear = actDayInYear;
           this.isConflict = isConflict;
           this.linkNewsID = linkNewsID;
    }


    /**
     * Gets the taskID value for this ULTaskInfoType.
     * 
     * @return taskID
     */
    public java.lang.String getTaskID() {
        return taskID;
    }


    /**
     * Sets the taskID value for this ULTaskInfoType.
     * 
     * @param taskID
     */
    public void setTaskID(java.lang.String taskID) {
        this.taskID = taskID;
    }


    /**
     * Gets the name value for this ULTaskInfoType.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ULTaskInfoType.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the hint value for this ULTaskInfoType.
     * 
     * @return hint
     */
    public java.lang.String getHint() {
        return hint;
    }


    /**
     * Sets the hint value for this ULTaskInfoType.
     * 
     * @param hint
     */
    public void setHint(java.lang.String hint) {
        this.hint = hint;
    }


    /**
     * Gets the priority value for this ULTaskInfoType.
     * 
     * @return priority
     */
    public int getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this ULTaskInfoType.
     * 
     * @param priority
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }


    /**
     * Gets the loopStyle value for this ULTaskInfoType.
     * 
     * @return loopStyle
     */
    public int getLoopStyle() {
        return loopStyle;
    }


    /**
     * Sets the loopStyle value for this ULTaskInfoType.
     * 
     * @param loopStyle
     */
    public void setLoopStyle(int loopStyle) {
        this.loopStyle = loopStyle;
    }


    /**
     * Gets the ownerType value for this ULTaskInfoType.
     * 
     * @return ownerType
     */
    public int getOwnerType() {
        return ownerType;
    }


    /**
     * Sets the ownerType value for this ULTaskInfoType.
     * 
     * @param ownerType
     */
    public void setOwnerType(int ownerType) {
        this.ownerType = ownerType;
    }


    /**
     * Gets the ownerID value for this ULTaskInfoType.
     * 
     * @return ownerID
     */
    public java.lang.String getOwnerID() {
        return ownerID;
    }


    /**
     * Sets the ownerID value for this ULTaskInfoType.
     * 
     * @param ownerID
     */
    public void setOwnerID(java.lang.String ownerID) {
        this.ownerID = ownerID;
    }


    /**
     * Gets the editStatus value for this ULTaskInfoType.
     * 
     * @return editStatus
     */
    public int getEditStatus() {
        return editStatus;
    }


    /**
     * Sets the editStatus value for this ULTaskInfoType.
     * 
     * @param editStatus
     */
    public void setEditStatus(int editStatus) {
        this.editStatus = editStatus;
    }


    /**
     * Gets the sponser value for this ULTaskInfoType.
     * 
     * @return sponser
     */
    public java.lang.String getSponser() {
        return sponser;
    }


    /**
     * Sets the sponser value for this ULTaskInfoType.
     * 
     * @param sponser
     */
    public void setSponser(java.lang.String sponser) {
        this.sponser = sponser;
    }


    /**
     * Gets the prepareDate value for this ULTaskInfoType.
     * 
     * @return prepareDate
     */
    public java.lang.String getPrepareDate() {
        return prepareDate;
    }


    /**
     * Sets the prepareDate value for this ULTaskInfoType.
     * 
     * @param prepareDate
     */
    public void setPrepareDate(java.lang.String prepareDate) {
        this.prepareDate = prepareDate;
    }


    /**
     * Gets the endAuditDate value for this ULTaskInfoType.
     * 
     * @return endAuditDate
     */
    public java.lang.String getEndAuditDate() {
        return endAuditDate;
    }


    /**
     * Sets the endAuditDate value for this ULTaskInfoType.
     * 
     * @param endAuditDate
     */
    public void setEndAuditDate(java.lang.String endAuditDate) {
        this.endAuditDate = endAuditDate;
    }


    /**
     * Gets the auditorName value for this ULTaskInfoType.
     * 
     * @return auditorName
     */
    public java.lang.String getAuditorName() {
        return auditorName;
    }


    /**
     * Sets the auditorName value for this ULTaskInfoType.
     * 
     * @param auditorName
     */
    public void setAuditorName(java.lang.String auditorName) {
        this.auditorName = auditorName;
    }


    /**
     * Gets the sourceType value for this ULTaskInfoType.
     * 
     * @return sourceType
     */
    public int getSourceType() {
        return sourceType;
    }


    /**
     * Sets the sourceType value for this ULTaskInfoType.
     * 
     * @param sourceType
     */
    public void setSourceType(int sourceType) {
        this.sourceType = sourceType;
    }


    /**
     * Gets the duration value for this ULTaskInfoType.
     * 
     * @return duration
     */
    public int getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this ULTaskInfoType.
     * 
     * @param duration
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }


    /**
     * Gets the VTRTapeTypeSource value for this ULTaskInfoType.
     * 
     * @return VTRTapeTypeSource
     */
    public java.lang.String getVTRTapeTypeSource() {
        return VTRTapeTypeSource;
    }


    /**
     * Sets the VTRTapeTypeSource value for this ULTaskInfoType.
     * 
     * @param VTRTapeTypeSource
     */
    public void setVTRTapeTypeSource(java.lang.String VTRTapeTypeSource) {
        this.VTRTapeTypeSource = VTRTapeTypeSource;
    }


    /**
     * Gets the VTRTapeNameSource value for this ULTaskInfoType.
     * 
     * @return VTRTapeNameSource
     */
    public java.lang.String getVTRTapeNameSource() {
        return VTRTapeNameSource;
    }


    /**
     * Sets the VTRTapeNameSource value for this ULTaskInfoType.
     * 
     * @param VTRTapeNameSource
     */
    public void setVTRTapeNameSource(java.lang.String VTRTapeNameSource) {
        this.VTRTapeNameSource = VTRTapeNameSource;
    }


    /**
     * Gets the isSetTrimInOutSource value for this ULTaskInfoType.
     * 
     * @return isSetTrimInOutSource
     */
    public int getIsSetTrimInOutSource() {
        return isSetTrimInOutSource;
    }


    /**
     * Sets the isSetTrimInOutSource value for this ULTaskInfoType.
     * 
     * @param isSetTrimInOutSource
     */
    public void setIsSetTrimInOutSource(int isSetTrimInOutSource) {
        this.isSetTrimInOutSource = isSetTrimInOutSource;
    }


    /**
     * Gets the VTRTrimInSource value for this ULTaskInfoType.
     * 
     * @return VTRTrimInSource
     */
    public int getVTRTrimInSource() {
        return VTRTrimInSource;
    }


    /**
     * Sets the VTRTrimInSource value for this ULTaskInfoType.
     * 
     * @param VTRTrimInSource
     */
    public void setVTRTrimInSource(int VTRTrimInSource) {
        this.VTRTrimInSource = VTRTrimInSource;
    }


    /**
     * Gets the VTRTrimOutSource value for this ULTaskInfoType.
     * 
     * @return VTRTrimOutSource
     */
    public int getVTRTrimOutSource() {
        return VTRTrimOutSource;
    }


    /**
     * Sets the VTRTrimOutSource value for this ULTaskInfoType.
     * 
     * @param VTRTrimOutSource
     */
    public void setVTRTrimOutSource(int VTRTrimOutSource) {
        this.VTRTrimOutSource = VTRTrimOutSource;
    }


    /**
     * Gets the VTRTapeReady value for this ULTaskInfoType.
     * 
     * @return VTRTapeReady
     */
    public java.lang.String getVTRTapeReady() {
        return VTRTapeReady;
    }


    /**
     * Sets the VTRTapeReady value for this ULTaskInfoType.
     * 
     * @param VTRTapeReady
     */
    public void setVTRTapeReady(java.lang.String VTRTapeReady) {
        this.VTRTapeReady = VTRTapeReady;
    }


    /**
     * Gets the VTRRecFinish value for this ULTaskInfoType.
     * 
     * @return VTRRecFinish
     */
    public java.lang.String getVTRRecFinish() {
        return VTRRecFinish;
    }


    /**
     * Sets the VTRRecFinish value for this ULTaskInfoType.
     * 
     * @param VTRRecFinish
     */
    public void setVTRRecFinish(java.lang.String VTRRecFinish) {
        this.VTRRecFinish = VTRRecFinish;
    }


    /**
     * Gets the signalID value for this ULTaskInfoType.
     * 
     * @return signalID
     */
    public java.lang.String getSignalID() {
        return signalID;
    }


    /**
     * Sets the signalID value for this ULTaskInfoType.
     * 
     * @param signalID
     */
    public void setSignalID(java.lang.String signalID) {
        this.signalID = signalID;
    }


    /**
     * Gets the signalStartRec value for this ULTaskInfoType.
     * 
     * @return signalStartRec
     */
    public java.lang.String getSignalStartRec() {
        return signalStartRec;
    }


    /**
     * Sets the signalStartRec value for this ULTaskInfoType.
     * 
     * @param signalStartRec
     */
    public void setSignalStartRec(java.lang.String signalStartRec) {
        this.signalStartRec = signalStartRec;
    }


    /**
     * Gets the signalStopRec value for this ULTaskInfoType.
     * 
     * @return signalStopRec
     */
    public java.lang.String getSignalStopRec() {
        return signalStopRec;
    }


    /**
     * Sets the signalStopRec value for this ULTaskInfoType.
     * 
     * @param signalStopRec
     */
    public void setSignalStopRec(java.lang.String signalStopRec) {
        this.signalStopRec = signalStopRec;
    }


    /**
     * Gets the VTRTapeTypeNameSource value for this ULTaskInfoType.
     * 
     * @return VTRTapeTypeNameSource
     */
    public java.lang.String getVTRTapeTypeNameSource() {
        return VTRTapeTypeNameSource;
    }


    /**
     * Sets the VTRTapeTypeNameSource value for this ULTaskInfoType.
     * 
     * @param VTRTapeTypeNameSource
     */
    public void setVTRTapeTypeNameSource(java.lang.String VTRTapeTypeNameSource) {
        this.VTRTapeTypeNameSource = VTRTapeTypeNameSource;
    }


    /**
     * Gets the signalName value for this ULTaskInfoType.
     * 
     * @return signalName
     */
    public java.lang.String getSignalName() {
        return signalName;
    }


    /**
     * Sets the signalName value for this ULTaskInfoType.
     * 
     * @param signalName
     */
    public void setSignalName(java.lang.String signalName) {
        this.signalName = signalName;
    }


    /**
     * Gets the isPassGateWay value for this ULTaskInfoType.
     * 
     * @return isPassGateWay
     */
    public int getIsPassGateWay() {
        return isPassGateWay;
    }


    /**
     * Sets the isPassGateWay value for this ULTaskInfoType.
     * 
     * @param isPassGateWay
     */
    public void setIsPassGateWay(int isPassGateWay) {
        this.isPassGateWay = isPassGateWay;
    }


    /**
     * Gets the isNeedDecode value for this ULTaskInfoType.
     * 
     * @return isNeedDecode
     */
    public int getIsNeedDecode() {
        return isNeedDecode;
    }


    /**
     * Sets the isNeedDecode value for this ULTaskInfoType.
     * 
     * @param isNeedDecode
     */
    public void setIsNeedDecode(int isNeedDecode) {
        this.isNeedDecode = isNeedDecode;
    }


    /**
     * Gets the isNeedEncode value for this ULTaskInfoType.
     * 
     * @return isNeedEncode
     */
    public int getIsNeedEncode() {
        return isNeedEncode;
    }


    /**
     * Sets the isNeedEncode value for this ULTaskInfoType.
     * 
     * @param isNeedEncode
     */
    public void setIsNeedEncode(int isNeedEncode) {
        this.isNeedEncode = isNeedEncode;
    }


    /**
     * Gets the isNeedChangeRate value for this ULTaskInfoType.
     * 
     * @return isNeedChangeRate
     */
    public int getIsNeedChangeRate() {
        return isNeedChangeRate;
    }


    /**
     * Sets the isNeedChangeRate value for this ULTaskInfoType.
     * 
     * @param isNeedChangeRate
     */
    public void setIsNeedChangeRate(int isNeedChangeRate) {
        this.isNeedChangeRate = isNeedChangeRate;
    }


    /**
     * Gets the targetRate value for this ULTaskInfoType.
     * 
     * @return targetRate
     */
    public float getTargetRate() {
        return targetRate;
    }


    /**
     * Sets the targetRate value for this ULTaskInfoType.
     * 
     * @param targetRate
     */
    public void setTargetRate(float targetRate) {
        this.targetRate = targetRate;
    }


    /**
     * Gets the targetType value for this ULTaskInfoType.
     * 
     * @return targetType
     */
    public int getTargetType() {
        return targetType;
    }


    /**
     * Sets the targetType value for this ULTaskInfoType.
     * 
     * @param targetType
     */
    public void setTargetType(int targetType) {
        this.targetType = targetType;
    }


    /**
     * Gets the VTRTapeTypeTarget value for this ULTaskInfoType.
     * 
     * @return VTRTapeTypeTarget
     */
    public java.lang.String getVTRTapeTypeTarget() {
        return VTRTapeTypeTarget;
    }


    /**
     * Sets the VTRTapeTypeTarget value for this ULTaskInfoType.
     * 
     * @param VTRTapeTypeTarget
     */
    public void setVTRTapeTypeTarget(java.lang.String VTRTapeTypeTarget) {
        this.VTRTapeTypeTarget = VTRTapeTypeTarget;
    }


    /**
     * Gets the VTRTapeNameTarget value for this ULTaskInfoType.
     * 
     * @return VTRTapeNameTarget
     */
    public java.lang.String getVTRTapeNameTarget() {
        return VTRTapeNameTarget;
    }


    /**
     * Sets the VTRTapeNameTarget value for this ULTaskInfoType.
     * 
     * @param VTRTapeNameTarget
     */
    public void setVTRTapeNameTarget(java.lang.String VTRTapeNameTarget) {
        this.VTRTapeNameTarget = VTRTapeNameTarget;
    }


    /**
     * Gets the isSetTrimInOutTarget value for this ULTaskInfoType.
     * 
     * @return isSetTrimInOutTarget
     */
    public int getIsSetTrimInOutTarget() {
        return isSetTrimInOutTarget;
    }


    /**
     * Sets the isSetTrimInOutTarget value for this ULTaskInfoType.
     * 
     * @param isSetTrimInOutTarget
     */
    public void setIsSetTrimInOutTarget(int isSetTrimInOutTarget) {
        this.isSetTrimInOutTarget = isSetTrimInOutTarget;
    }


    /**
     * Gets the VTRTrimInTarget value for this ULTaskInfoType.
     * 
     * @return VTRTrimInTarget
     */
    public int getVTRTrimInTarget() {
        return VTRTrimInTarget;
    }


    /**
     * Sets the VTRTrimInTarget value for this ULTaskInfoType.
     * 
     * @param VTRTrimInTarget
     */
    public void setVTRTrimInTarget(int VTRTrimInTarget) {
        this.VTRTrimInTarget = VTRTrimInTarget;
    }


    /**
     * Gets the VTRTrimOutTarget value for this ULTaskInfoType.
     * 
     * @return VTRTrimOutTarget
     */
    public int getVTRTrimOutTarget() {
        return VTRTrimOutTarget;
    }


    /**
     * Sets the VTRTrimOutTarget value for this ULTaskInfoType.
     * 
     * @param VTRTrimOutTarget
     */
    public void setVTRTrimOutTarget(int VTRTrimOutTarget) {
        this.VTRTrimOutTarget = VTRTrimOutTarget;
    }


    /**
     * Gets the recordDevice value for this ULTaskInfoType.
     * 
     * @return recordDevice
     */
    public int getRecordDevice() {
        return recordDevice;
    }


    /**
     * Sets the recordDevice value for this ULTaskInfoType.
     * 
     * @param recordDevice
     */
    public void setRecordDevice(int recordDevice) {
        this.recordDevice = recordDevice;
    }


    /**
     * Gets the clipName value for this ULTaskInfoType.
     * 
     * @return clipName
     */
    public java.lang.String getClipName() {
        return clipName;
    }


    /**
     * Sets the clipName value for this ULTaskInfoType.
     * 
     * @param clipName
     */
    public void setClipName(java.lang.String clipName) {
        this.clipName = clipName;
    }


    /**
     * Gets the keyWords value for this ULTaskInfoType.
     * 
     * @return keyWords
     */
    public java.lang.String getKeyWords() {
        return keyWords;
    }


    /**
     * Sets the keyWords value for this ULTaskInfoType.
     * 
     * @param keyWords
     */
    public void setKeyWords(java.lang.String keyWords) {
        this.keyWords = keyWords;
    }


    /**
     * Gets the remark value for this ULTaskInfoType.
     * 
     * @return remark
     */
    public java.lang.String getRemark() {
        return remark;
    }


    /**
     * Sets the remark value for this ULTaskInfoType.
     * 
     * @param remark
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }


    /**
     * Gets the elementInfoGropuID value for this ULTaskInfoType.
     * 
     * @return elementInfoGropuID
     */
    public java.lang.String getElementInfoGropuID() {
        return elementInfoGropuID;
    }


    /**
     * Sets the elementInfoGropuID value for this ULTaskInfoType.
     * 
     * @param elementInfoGropuID
     */
    public void setElementInfoGropuID(java.lang.String elementInfoGropuID) {
        this.elementInfoGropuID = elementInfoGropuID;
    }


    /**
     * Gets the isRemoteTDIR value for this ULTaskInfoType.
     * 
     * @return isRemoteTDIR
     */
    public int getIsRemoteTDIR() {
        return isRemoteTDIR;
    }


    /**
     * Sets the isRemoteTDIR value for this ULTaskInfoType.
     * 
     * @param isRemoteTDIR
     */
    public void setIsRemoteTDIR(int isRemoteTDIR) {
        this.isRemoteTDIR = isRemoteTDIR;
    }


    /**
     * Gets the secFlushFrequency value for this ULTaskInfoType.
     * 
     * @return secFlushFrequency
     */
    public double getSecFlushFrequency() {
        return secFlushFrequency;
    }


    /**
     * Sets the secFlushFrequency value for this ULTaskInfoType.
     * 
     * @param secFlushFrequency
     */
    public void setSecFlushFrequency(double secFlushFrequency) {
        this.secFlushFrequency = secFlushFrequency;
    }


    /**
     * Gets the isRunVideoFrameAnalysis value for this ULTaskInfoType.
     * 
     * @return isRunVideoFrameAnalysis
     */
    public int getIsRunVideoFrameAnalysis() {
        return isRunVideoFrameAnalysis;
    }


    /**
     * Sets the isRunVideoFrameAnalysis value for this ULTaskInfoType.
     * 
     * @param isRunVideoFrameAnalysis
     */
    public void setIsRunVideoFrameAnalysis(int isRunVideoFrameAnalysis) {
        this.isRunVideoFrameAnalysis = isRunVideoFrameAnalysis;
    }


    /**
     * Gets the tapeTypeName value for this ULTaskInfoType.
     * 
     * @return tapeTypeName
     */
    public java.lang.String getTapeTypeName() {
        return tapeTypeName;
    }


    /**
     * Sets the tapeTypeName value for this ULTaskInfoType.
     * 
     * @param tapeTypeName
     */
    public void setTapeTypeName(java.lang.String tapeTypeName) {
        this.tapeTypeName = tapeTypeName;
    }


    /**
     * Gets the isNeedDAOutbed value for this ULTaskInfoType.
     * 
     * @return isNeedDAOutbed
     */
    public int getIsNeedDAOutbed() {
        return isNeedDAOutbed;
    }


    /**
     * Sets the isNeedDAOutbed value for this ULTaskInfoType.
     * 
     * @param isNeedDAOutbed
     */
    public void setIsNeedDAOutbed(int isNeedDAOutbed) {
        this.isNeedDAOutbed = isNeedDAOutbed;
    }


    /**
     * Gets the isNeedADInbed value for this ULTaskInfoType.
     * 
     * @return isNeedADInbed
     */
    public int getIsNeedADInbed() {
        return isNeedADInbed;
    }


    /**
     * Sets the isNeedADInbed value for this ULTaskInfoType.
     * 
     * @param isNeedADInbed
     */
    public void setIsNeedADInbed(int isNeedADInbed) {
        this.isNeedADInbed = isNeedADInbed;
    }


    /**
     * Gets the taskClassID value for this ULTaskInfoType.
     * 
     * @return taskClassID
     */
    public java.lang.String getTaskClassID() {
        return taskClassID;
    }


    /**
     * Sets the taskClassID value for this ULTaskInfoType.
     * 
     * @param taskClassID
     */
    public void setTaskClassID(java.lang.String taskClassID) {
        this.taskClassID = taskClassID;
    }


    /**
     * Gets the isBackUp value for this ULTaskInfoType.
     * 
     * @return isBackUp
     */
    public int getIsBackUp() {
        return isBackUp;
    }


    /**
     * Sets the isBackUp value for this ULTaskInfoType.
     * 
     * @param isBackUp
     */
    public void setIsBackUp(int isBackUp) {
        this.isBackUp = isBackUp;
    }


    /**
     * Gets the ORGTask value for this ULTaskInfoType.
     * 
     * @return ORGTask
     */
    public java.lang.String getORGTask() {
        return ORGTask;
    }


    /**
     * Sets the ORGTask value for this ULTaskInfoType.
     * 
     * @param ORGTask
     */
    public void setORGTask(java.lang.String ORGTask) {
        this.ORGTask = ORGTask;
    }


    /**
     * Gets the orgTaskName value for this ULTaskInfoType.
     * 
     * @return orgTaskName
     */
    public java.lang.String getOrgTaskName() {
        return orgTaskName;
    }


    /**
     * Sets the orgTaskName value for this ULTaskInfoType.
     * 
     * @param orgTaskName
     */
    public void setOrgTaskName(java.lang.String orgTaskName) {
        this.orgTaskName = orgTaskName;
    }


    /**
     * Gets the cycleID value for this ULTaskInfoType.
     * 
     * @return cycleID
     */
    public java.lang.String getCycleID() {
        return cycleID;
    }


    /**
     * Sets the cycleID value for this ULTaskInfoType.
     * 
     * @param cycleID
     */
    public void setCycleID(java.lang.String cycleID) {
        this.cycleID = cycleID;
    }


    /**
     * Gets the cycleReadyTime value for this ULTaskInfoType.
     * 
     * @return cycleReadyTime
     */
    public java.lang.String getCycleReadyTime() {
        return cycleReadyTime;
    }


    /**
     * Sets the cycleReadyTime value for this ULTaskInfoType.
     * 
     * @param cycleReadyTime
     */
    public void setCycleReadyTime(java.lang.String cycleReadyTime) {
        this.cycleReadyTime = cycleReadyTime;
    }


    /**
     * Gets the cycleFinishTime value for this ULTaskInfoType.
     * 
     * @return cycleFinishTime
     */
    public java.lang.String getCycleFinishTime() {
        return cycleFinishTime;
    }


    /**
     * Sets the cycleFinishTime value for this ULTaskInfoType.
     * 
     * @param cycleFinishTime
     */
    public void setCycleFinishTime(java.lang.String cycleFinishTime) {
        this.cycleFinishTime = cycleFinishTime;
    }


    /**
     * Gets the startTime value for this ULTaskInfoType.
     * 
     * @return startTime
     */
    public java.lang.String getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this ULTaskInfoType.
     * 
     * @param startTime
     */
    public void setStartTime(java.lang.String startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the endTime value for this ULTaskInfoType.
     * 
     * @return endTime
     */
    public java.lang.String getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this ULTaskInfoType.
     * 
     * @param endTime
     */
    public void setEndTime(java.lang.String endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the loopType value for this ULTaskInfoType.
     * 
     * @return loopType
     */
    public int getLoopType() {
        return loopType;
    }


    /**
     * Sets the loopType value for this ULTaskInfoType.
     * 
     * @param loopType
     */
    public void setLoopType(int loopType) {
        this.loopType = loopType;
    }


    /**
     * Gets the intervalTime value for this ULTaskInfoType.
     * 
     * @return intervalTime
     */
    public int getIntervalTime() {
        return intervalTime;
    }


    /**
     * Sets the intervalTime value for this ULTaskInfoType.
     * 
     * @param intervalTime
     */
    public void setIntervalTime(int intervalTime) {
        this.intervalTime = intervalTime;
    }


    /**
     * Gets the actDayInWeek value for this ULTaskInfoType.
     * 
     * @return actDayInWeek
     */
    public int getActDayInWeek() {
        return actDayInWeek;
    }


    /**
     * Sets the actDayInWeek value for this ULTaskInfoType.
     * 
     * @param actDayInWeek
     */
    public void setActDayInWeek(int actDayInWeek) {
        this.actDayInWeek = actDayInWeek;
    }


    /**
     * Gets the actDayInMonth value for this ULTaskInfoType.
     * 
     * @return actDayInMonth
     */
    public int getActDayInMonth() {
        return actDayInMonth;
    }


    /**
     * Sets the actDayInMonth value for this ULTaskInfoType.
     * 
     * @param actDayInMonth
     */
    public void setActDayInMonth(int actDayInMonth) {
        this.actDayInMonth = actDayInMonth;
    }


    /**
     * Gets the actDayInYear value for this ULTaskInfoType.
     * 
     * @return actDayInYear
     */
    public int getActDayInYear() {
        return actDayInYear;
    }


    /**
     * Sets the actDayInYear value for this ULTaskInfoType.
     * 
     * @param actDayInYear
     */
    public void setActDayInYear(int actDayInYear) {
        this.actDayInYear = actDayInYear;
    }


    /**
     * Gets the isConflict value for this ULTaskInfoType.
     * 
     * @return isConflict
     */
    public int getIsConflict() {
        return isConflict;
    }


    /**
     * Sets the isConflict value for this ULTaskInfoType.
     * 
     * @param isConflict
     */
    public void setIsConflict(int isConflict) {
        this.isConflict = isConflict;
    }


    /**
     * Gets the linkNewsID value for this ULTaskInfoType.
     * 
     * @return linkNewsID
     */
    public java.lang.String getLinkNewsID() {
        return linkNewsID;
    }


    /**
     * Sets the linkNewsID value for this ULTaskInfoType.
     * 
     * @param linkNewsID
     */
    public void setLinkNewsID(java.lang.String linkNewsID) {
        this.linkNewsID = linkNewsID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ULTaskInfoType)) return false;
        ULTaskInfoType other = (ULTaskInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taskID==null && other.getTaskID()==null) || 
             (this.taskID!=null &&
              this.taskID.equals(other.getTaskID()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.hint==null && other.getHint()==null) || 
             (this.hint!=null &&
              this.hint.equals(other.getHint()))) &&
            this.priority == other.getPriority() &&
            this.loopStyle == other.getLoopStyle() &&
            this.ownerType == other.getOwnerType() &&
            ((this.ownerID==null && other.getOwnerID()==null) || 
             (this.ownerID!=null &&
              this.ownerID.equals(other.getOwnerID()))) &&
            this.editStatus == other.getEditStatus() &&
            ((this.sponser==null && other.getSponser()==null) || 
             (this.sponser!=null &&
              this.sponser.equals(other.getSponser()))) &&
            ((this.prepareDate==null && other.getPrepareDate()==null) || 
             (this.prepareDate!=null &&
              this.prepareDate.equals(other.getPrepareDate()))) &&
            ((this.endAuditDate==null && other.getEndAuditDate()==null) || 
             (this.endAuditDate!=null &&
              this.endAuditDate.equals(other.getEndAuditDate()))) &&
            ((this.auditorName==null && other.getAuditorName()==null) || 
             (this.auditorName!=null &&
              this.auditorName.equals(other.getAuditorName()))) &&
            this.sourceType == other.getSourceType() &&
            this.duration == other.getDuration() &&
            ((this.VTRTapeTypeSource==null && other.getVTRTapeTypeSource()==null) || 
             (this.VTRTapeTypeSource!=null &&
              this.VTRTapeTypeSource.equals(other.getVTRTapeTypeSource()))) &&
            ((this.VTRTapeNameSource==null && other.getVTRTapeNameSource()==null) || 
             (this.VTRTapeNameSource!=null &&
              this.VTRTapeNameSource.equals(other.getVTRTapeNameSource()))) &&
            this.isSetTrimInOutSource == other.getIsSetTrimInOutSource() &&
            this.VTRTrimInSource == other.getVTRTrimInSource() &&
            this.VTRTrimOutSource == other.getVTRTrimOutSource() &&
            ((this.VTRTapeReady==null && other.getVTRTapeReady()==null) || 
             (this.VTRTapeReady!=null &&
              this.VTRTapeReady.equals(other.getVTRTapeReady()))) &&
            ((this.VTRRecFinish==null && other.getVTRRecFinish()==null) || 
             (this.VTRRecFinish!=null &&
              this.VTRRecFinish.equals(other.getVTRRecFinish()))) &&
            ((this.signalID==null && other.getSignalID()==null) || 
             (this.signalID!=null &&
              this.signalID.equals(other.getSignalID()))) &&
            ((this.signalStartRec==null && other.getSignalStartRec()==null) || 
             (this.signalStartRec!=null &&
              this.signalStartRec.equals(other.getSignalStartRec()))) &&
            ((this.signalStopRec==null && other.getSignalStopRec()==null) || 
             (this.signalStopRec!=null &&
              this.signalStopRec.equals(other.getSignalStopRec()))) &&
            ((this.VTRTapeTypeNameSource==null && other.getVTRTapeTypeNameSource()==null) || 
             (this.VTRTapeTypeNameSource!=null &&
              this.VTRTapeTypeNameSource.equals(other.getVTRTapeTypeNameSource()))) &&
            ((this.signalName==null && other.getSignalName()==null) || 
             (this.signalName!=null &&
              this.signalName.equals(other.getSignalName()))) &&
            this.isPassGateWay == other.getIsPassGateWay() &&
            this.isNeedDecode == other.getIsNeedDecode() &&
            this.isNeedEncode == other.getIsNeedEncode() &&
            this.isNeedChangeRate == other.getIsNeedChangeRate() &&
            this.targetRate == other.getTargetRate() &&
            this.targetType == other.getTargetType() &&
            ((this.VTRTapeTypeTarget==null && other.getVTRTapeTypeTarget()==null) || 
             (this.VTRTapeTypeTarget!=null &&
              this.VTRTapeTypeTarget.equals(other.getVTRTapeTypeTarget()))) &&
            ((this.VTRTapeNameTarget==null && other.getVTRTapeNameTarget()==null) || 
             (this.VTRTapeNameTarget!=null &&
              this.VTRTapeNameTarget.equals(other.getVTRTapeNameTarget()))) &&
            this.isSetTrimInOutTarget == other.getIsSetTrimInOutTarget() &&
            this.VTRTrimInTarget == other.getVTRTrimInTarget() &&
            this.VTRTrimOutTarget == other.getVTRTrimOutTarget() &&
            this.recordDevice == other.getRecordDevice() &&
            ((this.clipName==null && other.getClipName()==null) || 
             (this.clipName!=null &&
              this.clipName.equals(other.getClipName()))) &&
            ((this.keyWords==null && other.getKeyWords()==null) || 
             (this.keyWords!=null &&
              this.keyWords.equals(other.getKeyWords()))) &&
            ((this.remark==null && other.getRemark()==null) || 
             (this.remark!=null &&
              this.remark.equals(other.getRemark()))) &&
            ((this.elementInfoGropuID==null && other.getElementInfoGropuID()==null) || 
             (this.elementInfoGropuID!=null &&
              this.elementInfoGropuID.equals(other.getElementInfoGropuID()))) &&
            this.isRemoteTDIR == other.getIsRemoteTDIR() &&
            this.secFlushFrequency == other.getSecFlushFrequency() &&
            this.isRunVideoFrameAnalysis == other.getIsRunVideoFrameAnalysis() &&
            ((this.tapeTypeName==null && other.getTapeTypeName()==null) || 
             (this.tapeTypeName!=null &&
              this.tapeTypeName.equals(other.getTapeTypeName()))) &&
            this.isNeedDAOutbed == other.getIsNeedDAOutbed() &&
            this.isNeedADInbed == other.getIsNeedADInbed() &&
            ((this.taskClassID==null && other.getTaskClassID()==null) || 
             (this.taskClassID!=null &&
              this.taskClassID.equals(other.getTaskClassID()))) &&
            this.isBackUp == other.getIsBackUp() &&
            ((this.ORGTask==null && other.getORGTask()==null) || 
             (this.ORGTask!=null &&
              this.ORGTask.equals(other.getORGTask()))) &&
            ((this.orgTaskName==null && other.getOrgTaskName()==null) || 
             (this.orgTaskName!=null &&
              this.orgTaskName.equals(other.getOrgTaskName()))) &&
            ((this.cycleID==null && other.getCycleID()==null) || 
             (this.cycleID!=null &&
              this.cycleID.equals(other.getCycleID()))) &&
            ((this.cycleReadyTime==null && other.getCycleReadyTime()==null) || 
             (this.cycleReadyTime!=null &&
              this.cycleReadyTime.equals(other.getCycleReadyTime()))) &&
            ((this.cycleFinishTime==null && other.getCycleFinishTime()==null) || 
             (this.cycleFinishTime!=null &&
              this.cycleFinishTime.equals(other.getCycleFinishTime()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            this.loopType == other.getLoopType() &&
            this.intervalTime == other.getIntervalTime() &&
            this.actDayInWeek == other.getActDayInWeek() &&
            this.actDayInMonth == other.getActDayInMonth() &&
            this.actDayInYear == other.getActDayInYear() &&
            this.isConflict == other.getIsConflict() &&
            ((this.linkNewsID==null && other.getLinkNewsID()==null) || 
             (this.linkNewsID!=null &&
              this.linkNewsID.equals(other.getLinkNewsID())));
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
        if (getTaskID() != null) {
            _hashCode += getTaskID().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getHint() != null) {
            _hashCode += getHint().hashCode();
        }
        _hashCode += getPriority();
        _hashCode += getLoopStyle();
        _hashCode += getOwnerType();
        if (getOwnerID() != null) {
            _hashCode += getOwnerID().hashCode();
        }
        _hashCode += getEditStatus();
        if (getSponser() != null) {
            _hashCode += getSponser().hashCode();
        }
        if (getPrepareDate() != null) {
            _hashCode += getPrepareDate().hashCode();
        }
        if (getEndAuditDate() != null) {
            _hashCode += getEndAuditDate().hashCode();
        }
        if (getAuditorName() != null) {
            _hashCode += getAuditorName().hashCode();
        }
        _hashCode += getSourceType();
        _hashCode += getDuration();
        if (getVTRTapeTypeSource() != null) {
            _hashCode += getVTRTapeTypeSource().hashCode();
        }
        if (getVTRTapeNameSource() != null) {
            _hashCode += getVTRTapeNameSource().hashCode();
        }
        _hashCode += getIsSetTrimInOutSource();
        _hashCode += getVTRTrimInSource();
        _hashCode += getVTRTrimOutSource();
        if (getVTRTapeReady() != null) {
            _hashCode += getVTRTapeReady().hashCode();
        }
        if (getVTRRecFinish() != null) {
            _hashCode += getVTRRecFinish().hashCode();
        }
        if (getSignalID() != null) {
            _hashCode += getSignalID().hashCode();
        }
        if (getSignalStartRec() != null) {
            _hashCode += getSignalStartRec().hashCode();
        }
        if (getSignalStopRec() != null) {
            _hashCode += getSignalStopRec().hashCode();
        }
        if (getVTRTapeTypeNameSource() != null) {
            _hashCode += getVTRTapeTypeNameSource().hashCode();
        }
        if (getSignalName() != null) {
            _hashCode += getSignalName().hashCode();
        }
        _hashCode += getIsPassGateWay();
        _hashCode += getIsNeedDecode();
        _hashCode += getIsNeedEncode();
        _hashCode += getIsNeedChangeRate();
        _hashCode += new Float(getTargetRate()).hashCode();
        _hashCode += getTargetType();
        if (getVTRTapeTypeTarget() != null) {
            _hashCode += getVTRTapeTypeTarget().hashCode();
        }
        if (getVTRTapeNameTarget() != null) {
            _hashCode += getVTRTapeNameTarget().hashCode();
        }
        _hashCode += getIsSetTrimInOutTarget();
        _hashCode += getVTRTrimInTarget();
        _hashCode += getVTRTrimOutTarget();
        _hashCode += getRecordDevice();
        if (getClipName() != null) {
            _hashCode += getClipName().hashCode();
        }
        if (getKeyWords() != null) {
            _hashCode += getKeyWords().hashCode();
        }
        if (getRemark() != null) {
            _hashCode += getRemark().hashCode();
        }
        if (getElementInfoGropuID() != null) {
            _hashCode += getElementInfoGropuID().hashCode();
        }
        _hashCode += getIsRemoteTDIR();
        _hashCode += new Double(getSecFlushFrequency()).hashCode();
        _hashCode += getIsRunVideoFrameAnalysis();
        if (getTapeTypeName() != null) {
            _hashCode += getTapeTypeName().hashCode();
        }
        _hashCode += getIsNeedDAOutbed();
        _hashCode += getIsNeedADInbed();
        if (getTaskClassID() != null) {
            _hashCode += getTaskClassID().hashCode();
        }
        _hashCode += getIsBackUp();
        if (getORGTask() != null) {
            _hashCode += getORGTask().hashCode();
        }
        if (getOrgTaskName() != null) {
            _hashCode += getOrgTaskName().hashCode();
        }
        if (getCycleID() != null) {
            _hashCode += getCycleID().hashCode();
        }
        if (getCycleReadyTime() != null) {
            _hashCode += getCycleReadyTime().hashCode();
        }
        if (getCycleFinishTime() != null) {
            _hashCode += getCycleFinishTime().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        _hashCode += getLoopType();
        _hashCode += getIntervalTime();
        _hashCode += getActDayInWeek();
        _hashCode += getActDayInMonth();
        _hashCode += getActDayInYear();
        _hashCode += getIsConflict();
        if (getLinkNewsID() != null) {
            _hashCode += getLinkNewsID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ULTaskInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", "ULTaskInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskID");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "TaskID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hint");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Hint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loopStyle");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "LoopStyle"));
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
        elemField.setFieldName("ownerID");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "OwnerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "EditStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sponser");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Sponser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prepareDate");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "PrepareDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endAuditDate");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "EndAuditDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditorName");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "AuditorName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceType");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "SourceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VTRTapeTypeSource");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "VTRTapeTypeSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VTRTapeNameSource");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "VTRTapeNameSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSetTrimInOutSource");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "IsSetTrimInOutSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VTRTrimInSource");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "VTRTrimInSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VTRTrimOutSource");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "VTRTrimOutSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VTRTapeReady");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "VTRTapeReady"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VTRRecFinish");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "VTRRecFinish"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("signalStartRec");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "SignalStartRec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signalStopRec");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "SignalStopRec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VTRTapeTypeNameSource");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "VTRTapeTypeNameSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signalName");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "SignalName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPassGateWay");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "IsPassGateWay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNeedDecode");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "IsNeedDecode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNeedEncode");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "IsNeedEncode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNeedChangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "IsNeedChangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetRate");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "TargetRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetType");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "TargetType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VTRTapeTypeTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "VTRTapeTypeTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VTRTapeNameTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "VTRTapeNameTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSetTrimInOutTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "IsSetTrimInOutTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VTRTrimInTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "VTRTrimInTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VTRTrimOutTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "VTRTrimOutTarget"));
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
        elemField.setFieldName("clipName");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ClipName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyWords");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "KeyWords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remark");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Remark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elementInfoGropuID");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ElementInfoGropuID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isRemoteTDIR");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "IsRemoteTDIR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secFlushFrequency");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Sec-FlushFrequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isRunVideoFrameAnalysis");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "IsRunVideoFrameAnalysis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tapeTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "TapeTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNeedDAOutbed");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "IsNeedDAOutbed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNeedADInbed");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "IsNeedADInbed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskClassID");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "TaskClassID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isBackUp");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "IsBackUp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ORGTask");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ORGTask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgTaskName");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "OrgTaskName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cycleID");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "CycleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cycleReadyTime");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "CycleReadyTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cycleFinishTime");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "CycleFinishTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "StartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "EndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loopType");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "LoopType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intervalTime");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "IntervalTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actDayInWeek");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ActDayInWeek"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actDayInMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ActDayInMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actDayInYear");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ActDayInYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isConflict");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "IsConflict"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkNewsID");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "LinkNewsID"));
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
