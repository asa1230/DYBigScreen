/**
 * ResponseEntityResponseExtendMSGQueryULBaseData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class ResponseEntityResponseExtendMSGQueryULBaseData  implements java.io.Serializable {
    /* 项目模式 */
    private int projectMode;

    /* 格式组信�? */
    private MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseDataClipElementGroupInfo[] clipElementGroupInfo;

    /* 磁带类型组信�? */
    private MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeGroupInfo[] tapeTypeGroupInfo;

    /* 磁带类型信息 */
    private MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeInfo[] tapeTypeInfo;

    /* 信号组信�? */
    private MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceGroupInfo[] signalSourceGroupInfo;

    /* 信号源信�? */
    private MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo[] signalSourceInfo;

    /* 任务分类信息 */
    private MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseDataTaskClassInfo[] taskClassInfo;

    public ResponseEntityResponseExtendMSGQueryULBaseData() {
    }

    public ResponseEntityResponseExtendMSGQueryULBaseData(
           int projectMode,
           MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseDataClipElementGroupInfo[] clipElementGroupInfo,
           MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeGroupInfo[] tapeTypeGroupInfo,
           MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeInfo[] tapeTypeInfo,
           MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceGroupInfo[] signalSourceGroupInfo,
           MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo[] signalSourceInfo,
           MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseDataTaskClassInfo[] taskClassInfo) {
           this.projectMode = projectMode;
           this.clipElementGroupInfo = clipElementGroupInfo;
           this.tapeTypeGroupInfo = tapeTypeGroupInfo;
           this.tapeTypeInfo = tapeTypeInfo;
           this.signalSourceGroupInfo = signalSourceGroupInfo;
           this.signalSourceInfo = signalSourceInfo;
           this.taskClassInfo = taskClassInfo;
    }


    /**
     * Gets the projectMode value for this ResponseEntityResponseExtendMSGQueryULBaseData.
     * 
     * @return projectMode   * 项目模式
     */
    public int getProjectMode() {
        return projectMode;
    }


    /**
     * Sets the projectMode value for this ResponseEntityResponseExtendMSGQueryULBaseData.
     * 
     * @param projectMode   * 项目模式
     */
    public void setProjectMode(int projectMode) {
        this.projectMode = projectMode;
    }


    /**
     * Gets the clipElementGroupInfo value for this ResponseEntityResponseExtendMSGQueryULBaseData.
     * 
     * @return clipElementGroupInfo   * 格式组信�?
     */
    public MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseDataClipElementGroupInfo[] getClipElementGroupInfo() {
        return clipElementGroupInfo;
    }


    /**
     * Sets the clipElementGroupInfo value for this ResponseEntityResponseExtendMSGQueryULBaseData.
     * 
     * @param clipElementGroupInfo   * 格式组信�?
     */
    public void setClipElementGroupInfo(MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseDataClipElementGroupInfo[] clipElementGroupInfo) {
        this.clipElementGroupInfo = clipElementGroupInfo;
    }

    public MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseDataClipElementGroupInfo getClipElementGroupInfo(int i) {
        return this.clipElementGroupInfo[i];
    }

    public void setClipElementGroupInfo(int i, MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseDataClipElementGroupInfo _value) {
        this.clipElementGroupInfo[i] = _value;
    }


    /**
     * Gets the tapeTypeGroupInfo value for this ResponseEntityResponseExtendMSGQueryULBaseData.
     * 
     * @return tapeTypeGroupInfo   * 磁带类型组信�?
     */
    public MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeGroupInfo[] getTapeTypeGroupInfo() {
        return tapeTypeGroupInfo;
    }


    /**
     * Sets the tapeTypeGroupInfo value for this ResponseEntityResponseExtendMSGQueryULBaseData.
     * 
     * @param tapeTypeGroupInfo   * 磁带类型组信�?
     */
    public void setTapeTypeGroupInfo(MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeGroupInfo[] tapeTypeGroupInfo) {
        this.tapeTypeGroupInfo = tapeTypeGroupInfo;
    }

    public MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeGroupInfo getTapeTypeGroupInfo(int i) {
        return this.tapeTypeGroupInfo[i];
    }

    public void setTapeTypeGroupInfo(int i, MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeGroupInfo _value) {
        this.tapeTypeGroupInfo[i] = _value;
    }


    /**
     * Gets the tapeTypeInfo value for this ResponseEntityResponseExtendMSGQueryULBaseData.
     * 
     * @return tapeTypeInfo   * 磁带类型信息
     */
    public MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeInfo[] getTapeTypeInfo() {
        return tapeTypeInfo;
    }


    /**
     * Sets the tapeTypeInfo value for this ResponseEntityResponseExtendMSGQueryULBaseData.
     * 
     * @param tapeTypeInfo   * 磁带类型信息
     */
    public void setTapeTypeInfo(MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeInfo[] tapeTypeInfo) {
        this.tapeTypeInfo = tapeTypeInfo;
    }

    public MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeInfo getTapeTypeInfo(int i) {
        return this.tapeTypeInfo[i];
    }

    public void setTapeTypeInfo(int i, MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseDataTapeTypeInfo _value) {
        this.tapeTypeInfo[i] = _value;
    }


    /**
     * Gets the signalSourceGroupInfo value for this ResponseEntityResponseExtendMSGQueryULBaseData.
     * 
     * @return signalSourceGroupInfo   * 信号组信�?
     */
    public MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceGroupInfo[] getSignalSourceGroupInfo() {
        return signalSourceGroupInfo;
    }


    /**
     * Sets the signalSourceGroupInfo value for this ResponseEntityResponseExtendMSGQueryULBaseData.
     * 
     * @param signalSourceGroupInfo   * 信号组信�?
     */
    public void setSignalSourceGroupInfo(MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceGroupInfo[] signalSourceGroupInfo) {
        this.signalSourceGroupInfo = signalSourceGroupInfo;
    }

    public MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceGroupInfo getSignalSourceGroupInfo(int i) {
        return this.signalSourceGroupInfo[i];
    }

    public void setSignalSourceGroupInfo(int i, MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceGroupInfo _value) {
        this.signalSourceGroupInfo[i] = _value;
    }


    /**
     * Gets the signalSourceInfo value for this ResponseEntityResponseExtendMSGQueryULBaseData.
     * 
     * @return signalSourceInfo   * 信号源信�?
     */
    public MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo[] getSignalSourceInfo() {
        return signalSourceInfo;
    }


    /**
     * Sets the signalSourceInfo value for this ResponseEntityResponseExtendMSGQueryULBaseData.
     * 
     * @param signalSourceInfo   * 信号源信�?
     */
    public void setSignalSourceInfo(MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo[] signalSourceInfo) {
        this.signalSourceInfo = signalSourceInfo;
    }

    public MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo getSignalSourceInfo(int i) {
        return this.signalSourceInfo[i];
    }

    public void setSignalSourceInfo(int i, MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseDataSignalSourceInfo _value) {
        this.signalSourceInfo[i] = _value;
    }


    /**
     * Gets the taskClassInfo value for this ResponseEntityResponseExtendMSGQueryULBaseData.
     * 
     * @return taskClassInfo   * 任务分类信息
     */
    public MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseDataTaskClassInfo[] getTaskClassInfo() {
        return taskClassInfo;
    }


    /**
     * Sets the taskClassInfo value for this ResponseEntityResponseExtendMSGQueryULBaseData.
     * 
     * @param taskClassInfo   * 任务分类信息
     */
    public void setTaskClassInfo(MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseDataTaskClassInfo[] taskClassInfo) {
        this.taskClassInfo = taskClassInfo;
    }

    public MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseDataTaskClassInfo getTaskClassInfo(int i) {
        return this.taskClassInfo[i];
    }

    public void setTaskClassInfo(int i, MREML_pkq.ResponseEntityResponseExtendMSGQueryULBaseDataTaskClassInfo _value) {
        this.taskClassInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseEntityResponseExtendMSGQueryULBaseData)) return false;
        ResponseEntityResponseExtendMSGQueryULBaseData other = (ResponseEntityResponseExtendMSGQueryULBaseData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.projectMode == other.getProjectMode() &&
            ((this.clipElementGroupInfo==null && other.getClipElementGroupInfo()==null) || 
             (this.clipElementGroupInfo!=null &&
              java.util.Arrays.equals(this.clipElementGroupInfo, other.getClipElementGroupInfo()))) &&
            ((this.tapeTypeGroupInfo==null && other.getTapeTypeGroupInfo()==null) || 
             (this.tapeTypeGroupInfo!=null &&
              java.util.Arrays.equals(this.tapeTypeGroupInfo, other.getTapeTypeGroupInfo()))) &&
            ((this.tapeTypeInfo==null && other.getTapeTypeInfo()==null) || 
             (this.tapeTypeInfo!=null &&
              java.util.Arrays.equals(this.tapeTypeInfo, other.getTapeTypeInfo()))) &&
            ((this.signalSourceGroupInfo==null && other.getSignalSourceGroupInfo()==null) || 
             (this.signalSourceGroupInfo!=null &&
              java.util.Arrays.equals(this.signalSourceGroupInfo, other.getSignalSourceGroupInfo()))) &&
            ((this.signalSourceInfo==null && other.getSignalSourceInfo()==null) || 
             (this.signalSourceInfo!=null &&
              java.util.Arrays.equals(this.signalSourceInfo, other.getSignalSourceInfo()))) &&
            ((this.taskClassInfo==null && other.getTaskClassInfo()==null) || 
             (this.taskClassInfo!=null &&
              java.util.Arrays.equals(this.taskClassInfo, other.getTaskClassInfo())));
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
        _hashCode += getProjectMode();
        if (getClipElementGroupInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClipElementGroupInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClipElementGroupInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTapeTypeGroupInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTapeTypeGroupInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTapeTypeGroupInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTapeTypeInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTapeTypeInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTapeTypeInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSignalSourceGroupInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSignalSourceGroupInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSignalSourceGroupInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSignalSourceInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSignalSourceInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSignalSourceInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaskClassInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaskClassInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaskClassInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ResponseEntityResponseExtendMSGQueryULBaseData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>>ResponseEntity>ResponseExtendMSG>QueryULBaseData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectMode");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ProjectMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clipElementGroupInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ClipElementGroupInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>>>ResponseEntity>ResponseExtendMSG>QueryULBaseData>ClipElementGroupInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tapeTypeGroupInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "TapeTypeGroupInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>>>ResponseEntity>ResponseExtendMSG>QueryULBaseData>TapeTypeGroupInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tapeTypeInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "TapeTypeInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>>>ResponseEntity>ResponseExtendMSG>QueryULBaseData>TapeTypeInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signalSourceGroupInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "SignalSourceGroupInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>>>ResponseEntity>ResponseExtendMSG>QueryULBaseData>SignalSourceGroupInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signalSourceInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "SignalSourceInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>>>ResponseEntity>ResponseExtendMSG>QueryULBaseData>SignalSourceInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskClassInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "TaskClassInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>>>ResponseEntity>ResponseExtendMSG>QueryULBaseData>TaskClassInfo"));
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
