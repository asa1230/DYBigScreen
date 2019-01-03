/**
 * FileEntityFileInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkg;

public class FileEntityFileInfo  implements java.io.Serializable {
    private java.lang.String fileName;

    private java.lang.String fileID;

    private java.lang.Long fileSize;

    private java.lang.String fileVerifyCode;

    private java.lang.Integer isFileVerifyOK;

    private java.lang.String fileHint;

    private java.lang.Integer inPoint;

    private java.lang.Integer outPoint;

    private java.lang.Integer channelIndex;

    private java.lang.String originalFileName;

    public FileEntityFileInfo() {
    }

    public FileEntityFileInfo(
           java.lang.String fileName,
           java.lang.String fileID,
           java.lang.Long fileSize,
           java.lang.String fileVerifyCode,
           java.lang.Integer isFileVerifyOK,
           java.lang.String fileHint,
           java.lang.Integer inPoint,
           java.lang.Integer outPoint,
           java.lang.Integer channelIndex,
           java.lang.String originalFileName) {
           this.fileName = fileName;
           this.fileID = fileID;
           this.fileSize = fileSize;
           this.fileVerifyCode = fileVerifyCode;
           this.isFileVerifyOK = isFileVerifyOK;
           this.fileHint = fileHint;
           this.inPoint = inPoint;
           this.outPoint = outPoint;
           this.channelIndex = channelIndex;
           this.originalFileName = originalFileName;
    }


    /**
     * Gets the fileName value for this FileEntityFileInfo.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this FileEntityFileInfo.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the fileID value for this FileEntityFileInfo.
     * 
     * @return fileID
     */
    public java.lang.String getFileID() {
        return fileID;
    }


    /**
     * Sets the fileID value for this FileEntityFileInfo.
     * 
     * @param fileID
     */
    public void setFileID(java.lang.String fileID) {
        this.fileID = fileID;
    }


    /**
     * Gets the fileSize value for this FileEntityFileInfo.
     * 
     * @return fileSize
     */
    public java.lang.Long getFileSize() {
        return fileSize;
    }


    /**
     * Sets the fileSize value for this FileEntityFileInfo.
     * 
     * @param fileSize
     */
    public void setFileSize(java.lang.Long fileSize) {
        this.fileSize = fileSize;
    }


    /**
     * Gets the fileVerifyCode value for this FileEntityFileInfo.
     * 
     * @return fileVerifyCode
     */
    public java.lang.String getFileVerifyCode() {
        return fileVerifyCode;
    }


    /**
     * Sets the fileVerifyCode value for this FileEntityFileInfo.
     * 
     * @param fileVerifyCode
     */
    public void setFileVerifyCode(java.lang.String fileVerifyCode) {
        this.fileVerifyCode = fileVerifyCode;
    }


    /**
     * Gets the isFileVerifyOK value for this FileEntityFileInfo.
     * 
     * @return isFileVerifyOK
     */
    public java.lang.Integer getIsFileVerifyOK() {
        return isFileVerifyOK;
    }


    /**
     * Sets the isFileVerifyOK value for this FileEntityFileInfo.
     * 
     * @param isFileVerifyOK
     */
    public void setIsFileVerifyOK(java.lang.Integer isFileVerifyOK) {
        this.isFileVerifyOK = isFileVerifyOK;
    }


    /**
     * Gets the fileHint value for this FileEntityFileInfo.
     * 
     * @return fileHint
     */
    public java.lang.String getFileHint() {
        return fileHint;
    }


    /**
     * Sets the fileHint value for this FileEntityFileInfo.
     * 
     * @param fileHint
     */
    public void setFileHint(java.lang.String fileHint) {
        this.fileHint = fileHint;
    }


    /**
     * Gets the inPoint value for this FileEntityFileInfo.
     * 
     * @return inPoint
     */
    public java.lang.Integer getInPoint() {
        return inPoint;
    }


    /**
     * Sets the inPoint value for this FileEntityFileInfo.
     * 
     * @param inPoint
     */
    public void setInPoint(java.lang.Integer inPoint) {
        this.inPoint = inPoint;
    }


    /**
     * Gets the outPoint value for this FileEntityFileInfo.
     * 
     * @return outPoint
     */
    public java.lang.Integer getOutPoint() {
        return outPoint;
    }


    /**
     * Sets the outPoint value for this FileEntityFileInfo.
     * 
     * @param outPoint
     */
    public void setOutPoint(java.lang.Integer outPoint) {
        this.outPoint = outPoint;
    }


    /**
     * Gets the channelIndex value for this FileEntityFileInfo.
     * 
     * @return channelIndex
     */
    public java.lang.Integer getChannelIndex() {
        return channelIndex;
    }


    /**
     * Sets the channelIndex value for this FileEntityFileInfo.
     * 
     * @param channelIndex
     */
    public void setChannelIndex(java.lang.Integer channelIndex) {
        this.channelIndex = channelIndex;
    }


    /**
     * Gets the originalFileName value for this FileEntityFileInfo.
     * 
     * @return originalFileName
     */
    public java.lang.String getOriginalFileName() {
        return originalFileName;
    }


    /**
     * Sets the originalFileName value for this FileEntityFileInfo.
     * 
     * @param originalFileName
     */
    public void setOriginalFileName(java.lang.String originalFileName) {
        this.originalFileName = originalFileName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FileEntityFileInfo)) return false;
        FileEntityFileInfo other = (FileEntityFileInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            ((this.fileID==null && other.getFileID()==null) || 
             (this.fileID!=null &&
              this.fileID.equals(other.getFileID()))) &&
            ((this.fileSize==null && other.getFileSize()==null) || 
             (this.fileSize!=null &&
              this.fileSize.equals(other.getFileSize()))) &&
            ((this.fileVerifyCode==null && other.getFileVerifyCode()==null) || 
             (this.fileVerifyCode!=null &&
              this.fileVerifyCode.equals(other.getFileVerifyCode()))) &&
            ((this.isFileVerifyOK==null && other.getIsFileVerifyOK()==null) || 
             (this.isFileVerifyOK!=null &&
              this.isFileVerifyOK.equals(other.getIsFileVerifyOK()))) &&
            ((this.fileHint==null && other.getFileHint()==null) || 
             (this.fileHint!=null &&
              this.fileHint.equals(other.getFileHint()))) &&
            ((this.inPoint==null && other.getInPoint()==null) || 
             (this.inPoint!=null &&
              this.inPoint.equals(other.getInPoint()))) &&
            ((this.outPoint==null && other.getOutPoint()==null) || 
             (this.outPoint!=null &&
              this.outPoint.equals(other.getOutPoint()))) &&
            ((this.channelIndex==null && other.getChannelIndex()==null) || 
             (this.channelIndex!=null &&
              this.channelIndex.equals(other.getChannelIndex()))) &&
            ((this.originalFileName==null && other.getOriginalFileName()==null) || 
             (this.originalFileName!=null &&
              this.originalFileName.equals(other.getOriginalFileName())));
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
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        if (getFileID() != null) {
            _hashCode += getFileID().hashCode();
        }
        if (getFileSize() != null) {
            _hashCode += getFileSize().hashCode();
        }
        if (getFileVerifyCode() != null) {
            _hashCode += getFileVerifyCode().hashCode();
        }
        if (getIsFileVerifyOK() != null) {
            _hashCode += getIsFileVerifyOK().hashCode();
        }
        if (getFileHint() != null) {
            _hashCode += getFileHint().hashCode();
        }
        if (getInPoint() != null) {
            _hashCode += getInPoint().hashCode();
        }
        if (getOutPoint() != null) {
            _hashCode += getOutPoint().hashCode();
        }
        if (getChannelIndex() != null) {
            _hashCode += getChannelIndex().hashCode();
        }
        if (getOriginalFileName() != null) {
            _hashCode += getOriginalFileName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FileEntityFileInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">FileEntity>FileInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "FileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileID");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "FileID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSize");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "FileSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileVerifyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "FileVerifyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFileVerifyOK");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "IsFileVerifyOK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileHint");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "FileHint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "InPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "OutPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ChannelIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "OriginalFileName"));
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
