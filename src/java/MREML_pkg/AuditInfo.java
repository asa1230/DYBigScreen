/**
 * AuditInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkg;

public class AuditInfo  implements java.io.Serializable {
    private java.lang.String auditorID;

    private java.lang.String auditorName;

    private java.lang.Integer auditType;

    private java.lang.String auditDate;

    private java.lang.Integer auditStatus;

    private java.lang.String auditDescription;

    private java.lang.String applicantID;

    private java.lang.String applicantName;

    private java.lang.String submitDate;

    private MREML_pkg.ExtendAttribute[] extendAttribute;

    public AuditInfo() {
    }

    public AuditInfo(
           java.lang.String auditorID,
           java.lang.String auditorName,
           java.lang.Integer auditType,
           java.lang.String auditDate,
           java.lang.Integer auditStatus,
           java.lang.String auditDescription,
           java.lang.String applicantID,
           java.lang.String applicantName,
           java.lang.String submitDate,
           MREML_pkg.ExtendAttribute[] extendAttribute) {
           this.auditorID = auditorID;
           this.auditorName = auditorName;
           this.auditType = auditType;
           this.auditDate = auditDate;
           this.auditStatus = auditStatus;
           this.auditDescription = auditDescription;
           this.applicantID = applicantID;
           this.applicantName = applicantName;
           this.submitDate = submitDate;
           this.extendAttribute = extendAttribute;
    }


    /**
     * Gets the auditorID value for this AuditInfo.
     * 
     * @return auditorID
     */
    public java.lang.String getAuditorID() {
        return auditorID;
    }


    /**
     * Sets the auditorID value for this AuditInfo.
     * 
     * @param auditorID
     */
    public void setAuditorID(java.lang.String auditorID) {
        this.auditorID = auditorID;
    }


    /**
     * Gets the auditorName value for this AuditInfo.
     * 
     * @return auditorName
     */
    public java.lang.String getAuditorName() {
        return auditorName;
    }


    /**
     * Sets the auditorName value for this AuditInfo.
     * 
     * @param auditorName
     */
    public void setAuditorName(java.lang.String auditorName) {
        this.auditorName = auditorName;
    }


    /**
     * Gets the auditType value for this AuditInfo.
     * 
     * @return auditType
     */
    public java.lang.Integer getAuditType() {
        return auditType;
    }


    /**
     * Sets the auditType value for this AuditInfo.
     * 
     * @param auditType
     */
    public void setAuditType(java.lang.Integer auditType) {
        this.auditType = auditType;
    }


    /**
     * Gets the auditDate value for this AuditInfo.
     * 
     * @return auditDate
     */
    public java.lang.String getAuditDate() {
        return auditDate;
    }


    /**
     * Sets the auditDate value for this AuditInfo.
     * 
     * @param auditDate
     */
    public void setAuditDate(java.lang.String auditDate) {
        this.auditDate = auditDate;
    }


    /**
     * Gets the auditStatus value for this AuditInfo.
     * 
     * @return auditStatus
     */
    public java.lang.Integer getAuditStatus() {
        return auditStatus;
    }


    /**
     * Sets the auditStatus value for this AuditInfo.
     * 
     * @param auditStatus
     */
    public void setAuditStatus(java.lang.Integer auditStatus) {
        this.auditStatus = auditStatus;
    }


    /**
     * Gets the auditDescription value for this AuditInfo.
     * 
     * @return auditDescription
     */
    public java.lang.String getAuditDescription() {
        return auditDescription;
    }


    /**
     * Sets the auditDescription value for this AuditInfo.
     * 
     * @param auditDescription
     */
    public void setAuditDescription(java.lang.String auditDescription) {
        this.auditDescription = auditDescription;
    }


    /**
     * Gets the applicantID value for this AuditInfo.
     * 
     * @return applicantID
     */
    public java.lang.String getApplicantID() {
        return applicantID;
    }


    /**
     * Sets the applicantID value for this AuditInfo.
     * 
     * @param applicantID
     */
    public void setApplicantID(java.lang.String applicantID) {
        this.applicantID = applicantID;
    }


    /**
     * Gets the applicantName value for this AuditInfo.
     * 
     * @return applicantName
     */
    public java.lang.String getApplicantName() {
        return applicantName;
    }


    /**
     * Sets the applicantName value for this AuditInfo.
     * 
     * @param applicantName
     */
    public void setApplicantName(java.lang.String applicantName) {
        this.applicantName = applicantName;
    }


    /**
     * Gets the submitDate value for this AuditInfo.
     * 
     * @return submitDate
     */
    public java.lang.String getSubmitDate() {
        return submitDate;
    }


    /**
     * Sets the submitDate value for this AuditInfo.
     * 
     * @param submitDate
     */
    public void setSubmitDate(java.lang.String submitDate) {
        this.submitDate = submitDate;
    }


    /**
     * Gets the extendAttribute value for this AuditInfo.
     * 
     * @return extendAttribute
     */
    public MREML_pkg.ExtendAttribute[] getExtendAttribute() {
        return extendAttribute;
    }


    /**
     * Sets the extendAttribute value for this AuditInfo.
     * 
     * @param extendAttribute
     */
    public void setExtendAttribute(MREML_pkg.ExtendAttribute[] extendAttribute) {
        this.extendAttribute = extendAttribute;
    }

    public MREML_pkg.ExtendAttribute getExtendAttribute(int i) {
        return this.extendAttribute[i];
    }

    public void setExtendAttribute(int i, MREML_pkg.ExtendAttribute _value) {
        this.extendAttribute[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuditInfo)) return false;
        AuditInfo other = (AuditInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.auditorID==null && other.getAuditorID()==null) || 
             (this.auditorID!=null &&
              this.auditorID.equals(other.getAuditorID()))) &&
            ((this.auditorName==null && other.getAuditorName()==null) || 
             (this.auditorName!=null &&
              this.auditorName.equals(other.getAuditorName()))) &&
            ((this.auditType==null && other.getAuditType()==null) || 
             (this.auditType!=null &&
              this.auditType.equals(other.getAuditType()))) &&
            ((this.auditDate==null && other.getAuditDate()==null) || 
             (this.auditDate!=null &&
              this.auditDate.equals(other.getAuditDate()))) &&
            ((this.auditStatus==null && other.getAuditStatus()==null) || 
             (this.auditStatus!=null &&
              this.auditStatus.equals(other.getAuditStatus()))) &&
            ((this.auditDescription==null && other.getAuditDescription()==null) || 
             (this.auditDescription!=null &&
              this.auditDescription.equals(other.getAuditDescription()))) &&
            ((this.applicantID==null && other.getApplicantID()==null) || 
             (this.applicantID!=null &&
              this.applicantID.equals(other.getApplicantID()))) &&
            ((this.applicantName==null && other.getApplicantName()==null) || 
             (this.applicantName!=null &&
              this.applicantName.equals(other.getApplicantName()))) &&
            ((this.submitDate==null && other.getSubmitDate()==null) || 
             (this.submitDate!=null &&
              this.submitDate.equals(other.getSubmitDate()))) &&
            ((this.extendAttribute==null && other.getExtendAttribute()==null) || 
             (this.extendAttribute!=null &&
              java.util.Arrays.equals(this.extendAttribute, other.getExtendAttribute())));
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
        if (getAuditorID() != null) {
            _hashCode += getAuditorID().hashCode();
        }
        if (getAuditorName() != null) {
            _hashCode += getAuditorName().hashCode();
        }
        if (getAuditType() != null) {
            _hashCode += getAuditType().hashCode();
        }
        if (getAuditDate() != null) {
            _hashCode += getAuditDate().hashCode();
        }
        if (getAuditStatus() != null) {
            _hashCode += getAuditStatus().hashCode();
        }
        if (getAuditDescription() != null) {
            _hashCode += getAuditDescription().hashCode();
        }
        if (getApplicantID() != null) {
            _hashCode += getApplicantID().hashCode();
        }
        if (getApplicantName() != null) {
            _hashCode += getApplicantName().hashCode();
        }
        if (getSubmitDate() != null) {
            _hashCode += getSubmitDate().hashCode();
        }
        if (getExtendAttribute() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExtendAttribute());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExtendAttribute(), i);
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
        new org.apache.axis.description.TypeDesc(AuditInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", "AuditInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditorID");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "AuditorID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("auditType");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "AuditType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditDate");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "AuditDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "AuditStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "AuditDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicantID");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ApplicantID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicantName");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ApplicantName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitDate");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "SubmitDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extendAttribute");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ExtendAttribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", "ExtendAttribute"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
