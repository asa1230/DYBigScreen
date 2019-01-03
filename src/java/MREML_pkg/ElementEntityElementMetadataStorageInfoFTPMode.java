/**
 * ElementEntityElementMetadataStorageInfoFTPMode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkg;

public class ElementEntityElementMetadataStorageInfoFTPMode  implements java.io.Serializable {
    private java.lang.String FTPServer;

    private int FTPPort;

    private java.lang.String FTPPath;

    private java.lang.String FTPUser;

    private java.lang.String FTPPsd;

    private java.lang.Integer FTPServerType;

    public ElementEntityElementMetadataStorageInfoFTPMode() {
    }

    public ElementEntityElementMetadataStorageInfoFTPMode(
           java.lang.String FTPServer,
           int FTPPort,
           java.lang.String FTPPath,
           java.lang.String FTPUser,
           java.lang.String FTPPsd,
           java.lang.Integer FTPServerType) {
           this.FTPServer = FTPServer;
           this.FTPPort = FTPPort;
           this.FTPPath = FTPPath;
           this.FTPUser = FTPUser;
           this.FTPPsd = FTPPsd;
           this.FTPServerType = FTPServerType;
    }


    /**
     * Gets the FTPServer value for this ElementEntityElementMetadataStorageInfoFTPMode.
     * 
     * @return FTPServer
     */
    public java.lang.String getFTPServer() {
        return FTPServer;
    }


    /**
     * Sets the FTPServer value for this ElementEntityElementMetadataStorageInfoFTPMode.
     * 
     * @param FTPServer
     */
    public void setFTPServer(java.lang.String FTPServer) {
        this.FTPServer = FTPServer;
    }


    /**
     * Gets the FTPPort value for this ElementEntityElementMetadataStorageInfoFTPMode.
     * 
     * @return FTPPort
     */
    public int getFTPPort() {
        return FTPPort;
    }


    /**
     * Sets the FTPPort value for this ElementEntityElementMetadataStorageInfoFTPMode.
     * 
     * @param FTPPort
     */
    public void setFTPPort(int FTPPort) {
        this.FTPPort = FTPPort;
    }


    /**
     * Gets the FTPPath value for this ElementEntityElementMetadataStorageInfoFTPMode.
     * 
     * @return FTPPath
     */
    public java.lang.String getFTPPath() {
        return FTPPath;
    }


    /**
     * Sets the FTPPath value for this ElementEntityElementMetadataStorageInfoFTPMode.
     * 
     * @param FTPPath
     */
    public void setFTPPath(java.lang.String FTPPath) {
        this.FTPPath = FTPPath;
    }


    /**
     * Gets the FTPUser value for this ElementEntityElementMetadataStorageInfoFTPMode.
     * 
     * @return FTPUser
     */
    public java.lang.String getFTPUser() {
        return FTPUser;
    }


    /**
     * Sets the FTPUser value for this ElementEntityElementMetadataStorageInfoFTPMode.
     * 
     * @param FTPUser
     */
    public void setFTPUser(java.lang.String FTPUser) {
        this.FTPUser = FTPUser;
    }


    /**
     * Gets the FTPPsd value for this ElementEntityElementMetadataStorageInfoFTPMode.
     * 
     * @return FTPPsd
     */
    public java.lang.String getFTPPsd() {
        return FTPPsd;
    }


    /**
     * Sets the FTPPsd value for this ElementEntityElementMetadataStorageInfoFTPMode.
     * 
     * @param FTPPsd
     */
    public void setFTPPsd(java.lang.String FTPPsd) {
        this.FTPPsd = FTPPsd;
    }


    /**
     * Gets the FTPServerType value for this ElementEntityElementMetadataStorageInfoFTPMode.
     * 
     * @return FTPServerType
     */
    public java.lang.Integer getFTPServerType() {
        return FTPServerType;
    }


    /**
     * Sets the FTPServerType value for this ElementEntityElementMetadataStorageInfoFTPMode.
     * 
     * @param FTPServerType
     */
    public void setFTPServerType(java.lang.Integer FTPServerType) {
        this.FTPServerType = FTPServerType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ElementEntityElementMetadataStorageInfoFTPMode)) return false;
        ElementEntityElementMetadataStorageInfoFTPMode other = (ElementEntityElementMetadataStorageInfoFTPMode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.FTPServer==null && other.getFTPServer()==null) || 
             (this.FTPServer!=null &&
              this.FTPServer.equals(other.getFTPServer()))) &&
            this.FTPPort == other.getFTPPort() &&
            ((this.FTPPath==null && other.getFTPPath()==null) || 
             (this.FTPPath!=null &&
              this.FTPPath.equals(other.getFTPPath()))) &&
            ((this.FTPUser==null && other.getFTPUser()==null) || 
             (this.FTPUser!=null &&
              this.FTPUser.equals(other.getFTPUser()))) &&
            ((this.FTPPsd==null && other.getFTPPsd()==null) || 
             (this.FTPPsd!=null &&
              this.FTPPsd.equals(other.getFTPPsd()))) &&
            ((this.FTPServerType==null && other.getFTPServerType()==null) || 
             (this.FTPServerType!=null &&
              this.FTPServerType.equals(other.getFTPServerType())));
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
        if (getFTPServer() != null) {
            _hashCode += getFTPServer().hashCode();
        }
        _hashCode += getFTPPort();
        if (getFTPPath() != null) {
            _hashCode += getFTPPath().hashCode();
        }
        if (getFTPUser() != null) {
            _hashCode += getFTPUser().hashCode();
        }
        if (getFTPPsd() != null) {
            _hashCode += getFTPPsd().hashCode();
        }
        if (getFTPServerType() != null) {
            _hashCode += getFTPServerType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ElementEntityElementMetadataStorageInfoFTPMode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>>ElementEntity>ElementMetadata>StorageInfo>FTPMode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FTPServer");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "FTPServer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FTPPort");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "FTPPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FTPPath");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "FTPPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FTPUser");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "FTPUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FTPPsd");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "FTPPsd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FTPServerType");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "FTPServerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
