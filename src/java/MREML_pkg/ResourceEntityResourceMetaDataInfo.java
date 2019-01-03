/**
 * ResourceEntityResourceMetaDataInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkg;

public class ResourceEntityResourceMetaDataInfo  implements java.io.Serializable {
    private MREML_pkg.ResourceEntityResourceMetaDataInfoResourceID resourceID;

    private MREML_pkg.ResourceEntityResourceMetaDataInfoTitle title;

    private java.lang.Integer resourceType;

    private java.lang.String programType;

    private java.lang.String secretLevel;

    private MREML_pkg.ResourceEntityResourceMetaDataInfoSubject subject;

    private MREML_pkg.ResourceEntityResourceMetaDataInfoDescription description;

    private MREML_pkg.ResourceEntityResourceMetaDataInfoResponsibility[] responsibility;

    private MREML_pkg.ResourceEntityResourceMetaDataInfoDate date;

    private MREML_pkg.AuditInfo[] auditInfo;

    private MREML_pkg.ResourceEntityResourceMetaDataInfoFormat format;

    private MREML_pkg.ResourceEntityResourceMetaDataInfoSource[] source;

    private MREML_pkg.ResourceEntityResourceMetaDataInfoRelations relations;

    private MREML_pkg.ResourceEntityResourceMetaDataInfoAuthorizeDescription[] authorizeDescription;

    private MREML_pkg.ExtendAttribute[] extendAttribute;

    private MREML_pkg.ExtendAttrGrp[] extendAttrGrp;

    public ResourceEntityResourceMetaDataInfo() {
    }

    public ResourceEntityResourceMetaDataInfo(
           MREML_pkg.ResourceEntityResourceMetaDataInfoResourceID resourceID,
           MREML_pkg.ResourceEntityResourceMetaDataInfoTitle title,
           java.lang.Integer resourceType,
           java.lang.String programType,
           java.lang.String secretLevel,
           MREML_pkg.ResourceEntityResourceMetaDataInfoSubject subject,
           MREML_pkg.ResourceEntityResourceMetaDataInfoDescription description,
           MREML_pkg.ResourceEntityResourceMetaDataInfoResponsibility[] responsibility,
           MREML_pkg.ResourceEntityResourceMetaDataInfoDate date,
           MREML_pkg.AuditInfo[] auditInfo,
           MREML_pkg.ResourceEntityResourceMetaDataInfoFormat format,
           MREML_pkg.ResourceEntityResourceMetaDataInfoSource[] source,
           MREML_pkg.ResourceEntityResourceMetaDataInfoRelations relations,
           MREML_pkg.ResourceEntityResourceMetaDataInfoAuthorizeDescription[] authorizeDescription,
           MREML_pkg.ExtendAttribute[] extendAttribute,
           MREML_pkg.ExtendAttrGrp[] extendAttrGrp) {
           this.resourceID = resourceID;
           this.title = title;
           this.resourceType = resourceType;
           this.programType = programType;
           this.secretLevel = secretLevel;
           this.subject = subject;
           this.description = description;
           this.responsibility = responsibility;
           this.date = date;
           this.auditInfo = auditInfo;
           this.format = format;
           this.source = source;
           this.relations = relations;
           this.authorizeDescription = authorizeDescription;
           this.extendAttribute = extendAttribute;
           this.extendAttrGrp = extendAttrGrp;
    }


    /**
     * Gets the resourceID value for this ResourceEntityResourceMetaDataInfo.
     * 
     * @return resourceID
     */
    public MREML_pkg.ResourceEntityResourceMetaDataInfoResourceID getResourceID() {
        return resourceID;
    }


    /**
     * Sets the resourceID value for this ResourceEntityResourceMetaDataInfo.
     * 
     * @param resourceID
     */
    public void setResourceID(MREML_pkg.ResourceEntityResourceMetaDataInfoResourceID resourceID) {
        this.resourceID = resourceID;
    }


    /**
     * Gets the title value for this ResourceEntityResourceMetaDataInfo.
     * 
     * @return title
     */
    public MREML_pkg.ResourceEntityResourceMetaDataInfoTitle getTitle() {
        return title;
    }


    /**
     * Sets the title value for this ResourceEntityResourceMetaDataInfo.
     * 
     * @param title
     */
    public void setTitle(MREML_pkg.ResourceEntityResourceMetaDataInfoTitle title) {
        this.title = title;
    }


    /**
     * Gets the resourceType value for this ResourceEntityResourceMetaDataInfo.
     * 
     * @return resourceType
     */
    public java.lang.Integer getResourceType() {
        return resourceType;
    }


    /**
     * Sets the resourceType value for this ResourceEntityResourceMetaDataInfo.
     * 
     * @param resourceType
     */
    public void setResourceType(java.lang.Integer resourceType) {
        this.resourceType = resourceType;
    }


    /**
     * Gets the programType value for this ResourceEntityResourceMetaDataInfo.
     * 
     * @return programType
     */
    public java.lang.String getProgramType() {
        return programType;
    }


    /**
     * Sets the programType value for this ResourceEntityResourceMetaDataInfo.
     * 
     * @param programType
     */
    public void setProgramType(java.lang.String programType) {
        this.programType = programType;
    }


    /**
     * Gets the secretLevel value for this ResourceEntityResourceMetaDataInfo.
     * 
     * @return secretLevel
     */
    public java.lang.String getSecretLevel() {
        return secretLevel;
    }


    /**
     * Sets the secretLevel value for this ResourceEntityResourceMetaDataInfo.
     * 
     * @param secretLevel
     */
    public void setSecretLevel(java.lang.String secretLevel) {
        this.secretLevel = secretLevel;
    }


    /**
     * Gets the subject value for this ResourceEntityResourceMetaDataInfo.
     * 
     * @return subject
     */
    public MREML_pkg.ResourceEntityResourceMetaDataInfoSubject getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this ResourceEntityResourceMetaDataInfo.
     * 
     * @param subject
     */
    public void setSubject(MREML_pkg.ResourceEntityResourceMetaDataInfoSubject subject) {
        this.subject = subject;
    }


    /**
     * Gets the description value for this ResourceEntityResourceMetaDataInfo.
     * 
     * @return description
     */
    public MREML_pkg.ResourceEntityResourceMetaDataInfoDescription getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ResourceEntityResourceMetaDataInfo.
     * 
     * @param description
     */
    public void setDescription(MREML_pkg.ResourceEntityResourceMetaDataInfoDescription description) {
        this.description = description;
    }


    /**
     * Gets the responsibility value for this ResourceEntityResourceMetaDataInfo.
     * 
     * @return responsibility
     */
    public MREML_pkg.ResourceEntityResourceMetaDataInfoResponsibility[] getResponsibility() {
        return responsibility;
    }


    /**
     * Sets the responsibility value for this ResourceEntityResourceMetaDataInfo.
     * 
     * @param responsibility
     */
    public void setResponsibility(MREML_pkg.ResourceEntityResourceMetaDataInfoResponsibility[] responsibility) {
        this.responsibility = responsibility;
    }

    public MREML_pkg.ResourceEntityResourceMetaDataInfoResponsibility getResponsibility(int i) {
        return this.responsibility[i];
    }

    public void setResponsibility(int i, MREML_pkg.ResourceEntityResourceMetaDataInfoResponsibility _value) {
        this.responsibility[i] = _value;
    }


    /**
     * Gets the date value for this ResourceEntityResourceMetaDataInfo.
     * 
     * @return date
     */
    public MREML_pkg.ResourceEntityResourceMetaDataInfoDate getDate() {
        return date;
    }


    /**
     * Sets the date value for this ResourceEntityResourceMetaDataInfo.
     * 
     * @param date
     */
    public void setDate(MREML_pkg.ResourceEntityResourceMetaDataInfoDate date) {
        this.date = date;
    }


    /**
     * Gets the auditInfo value for this ResourceEntityResourceMetaDataInfo.
     * 
     * @return auditInfo
     */
    public MREML_pkg.AuditInfo[] getAuditInfo() {
        return auditInfo;
    }


    /**
     * Sets the auditInfo value for this ResourceEntityResourceMetaDataInfo.
     * 
     * @param auditInfo
     */
    public void setAuditInfo(MREML_pkg.AuditInfo[] auditInfo) {
        this.auditInfo = auditInfo;
    }

    public MREML_pkg.AuditInfo getAuditInfo(int i) {
        return this.auditInfo[i];
    }

    public void setAuditInfo(int i, MREML_pkg.AuditInfo _value) {
        this.auditInfo[i] = _value;
    }


    /**
     * Gets the format value for this ResourceEntityResourceMetaDataInfo.
     * 
     * @return format
     */
    public MREML_pkg.ResourceEntityResourceMetaDataInfoFormat getFormat() {
        return format;
    }


    /**
     * Sets the format value for this ResourceEntityResourceMetaDataInfo.
     * 
     * @param format
     */
    public void setFormat(MREML_pkg.ResourceEntityResourceMetaDataInfoFormat format) {
        this.format = format;
    }


    /**
     * Gets the source value for this ResourceEntityResourceMetaDataInfo.
     * 
     * @return source
     */
    public MREML_pkg.ResourceEntityResourceMetaDataInfoSource[] getSource() {
        return source;
    }


    /**
     * Sets the source value for this ResourceEntityResourceMetaDataInfo.
     * 
     * @param source
     */
    public void setSource(MREML_pkg.ResourceEntityResourceMetaDataInfoSource[] source) {
        this.source = source;
    }

    public MREML_pkg.ResourceEntityResourceMetaDataInfoSource getSource(int i) {
        return this.source[i];
    }

    public void setSource(int i, MREML_pkg.ResourceEntityResourceMetaDataInfoSource _value) {
        this.source[i] = _value;
    }


    /**
     * Gets the relations value for this ResourceEntityResourceMetaDataInfo.
     * 
     * @return relations
     */
    public MREML_pkg.ResourceEntityResourceMetaDataInfoRelations getRelations() {
        return relations;
    }


    /**
     * Sets the relations value for this ResourceEntityResourceMetaDataInfo.
     * 
     * @param relations
     */
    public void setRelations(MREML_pkg.ResourceEntityResourceMetaDataInfoRelations relations) {
        this.relations = relations;
    }


    /**
     * Gets the authorizeDescription value for this ResourceEntityResourceMetaDataInfo.
     * 
     * @return authorizeDescription
     */
    public MREML_pkg.ResourceEntityResourceMetaDataInfoAuthorizeDescription[] getAuthorizeDescription() {
        return authorizeDescription;
    }


    /**
     * Sets the authorizeDescription value for this ResourceEntityResourceMetaDataInfo.
     * 
     * @param authorizeDescription
     */
    public void setAuthorizeDescription(MREML_pkg.ResourceEntityResourceMetaDataInfoAuthorizeDescription[] authorizeDescription) {
        this.authorizeDescription = authorizeDescription;
    }

    public MREML_pkg.ResourceEntityResourceMetaDataInfoAuthorizeDescription getAuthorizeDescription(int i) {
        return this.authorizeDescription[i];
    }

    public void setAuthorizeDescription(int i, MREML_pkg.ResourceEntityResourceMetaDataInfoAuthorizeDescription _value) {
        this.authorizeDescription[i] = _value;
    }


    /**
     * Gets the extendAttribute value for this ResourceEntityResourceMetaDataInfo.
     * 
     * @return extendAttribute
     */
    public MREML_pkg.ExtendAttribute[] getExtendAttribute() {
        return extendAttribute;
    }


    /**
     * Sets the extendAttribute value for this ResourceEntityResourceMetaDataInfo.
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


    /**
     * Gets the extendAttrGrp value for this ResourceEntityResourceMetaDataInfo.
     * 
     * @return extendAttrGrp
     */
    public MREML_pkg.ExtendAttrGrp[] getExtendAttrGrp() {
        return extendAttrGrp;
    }


    /**
     * Sets the extendAttrGrp value for this ResourceEntityResourceMetaDataInfo.
     * 
     * @param extendAttrGrp
     */
    public void setExtendAttrGrp(MREML_pkg.ExtendAttrGrp[] extendAttrGrp) {
        this.extendAttrGrp = extendAttrGrp;
    }

    public MREML_pkg.ExtendAttrGrp getExtendAttrGrp(int i) {
        return this.extendAttrGrp[i];
    }

    public void setExtendAttrGrp(int i, MREML_pkg.ExtendAttrGrp _value) {
        this.extendAttrGrp[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResourceEntityResourceMetaDataInfo)) return false;
        ResourceEntityResourceMetaDataInfo other = (ResourceEntityResourceMetaDataInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resourceID==null && other.getResourceID()==null) || 
             (this.resourceID!=null &&
              this.resourceID.equals(other.getResourceID()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.resourceType==null && other.getResourceType()==null) || 
             (this.resourceType!=null &&
              this.resourceType.equals(other.getResourceType()))) &&
            ((this.programType==null && other.getProgramType()==null) || 
             (this.programType!=null &&
              this.programType.equals(other.getProgramType()))) &&
            ((this.secretLevel==null && other.getSecretLevel()==null) || 
             (this.secretLevel!=null &&
              this.secretLevel.equals(other.getSecretLevel()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.responsibility==null && other.getResponsibility()==null) || 
             (this.responsibility!=null &&
              java.util.Arrays.equals(this.responsibility, other.getResponsibility()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.auditInfo==null && other.getAuditInfo()==null) || 
             (this.auditInfo!=null &&
              java.util.Arrays.equals(this.auditInfo, other.getAuditInfo()))) &&
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              this.format.equals(other.getFormat()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              java.util.Arrays.equals(this.source, other.getSource()))) &&
            ((this.relations==null && other.getRelations()==null) || 
             (this.relations!=null &&
              this.relations.equals(other.getRelations()))) &&
            ((this.authorizeDescription==null && other.getAuthorizeDescription()==null) || 
             (this.authorizeDescription!=null &&
              java.util.Arrays.equals(this.authorizeDescription, other.getAuthorizeDescription()))) &&
            ((this.extendAttribute==null && other.getExtendAttribute()==null) || 
             (this.extendAttribute!=null &&
              java.util.Arrays.equals(this.extendAttribute, other.getExtendAttribute()))) &&
            ((this.extendAttrGrp==null && other.getExtendAttrGrp()==null) || 
             (this.extendAttrGrp!=null &&
              java.util.Arrays.equals(this.extendAttrGrp, other.getExtendAttrGrp())));
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
        if (getResourceID() != null) {
            _hashCode += getResourceID().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getResourceType() != null) {
            _hashCode += getResourceType().hashCode();
        }
        if (getProgramType() != null) {
            _hashCode += getProgramType().hashCode();
        }
        if (getSecretLevel() != null) {
            _hashCode += getSecretLevel().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getResponsibility() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResponsibility());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResponsibility(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getAuditInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuditInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuditInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        if (getSource() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSource());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSource(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRelations() != null) {
            _hashCode += getRelations().hashCode();
        }
        if (getAuthorizeDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuthorizeDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuthorizeDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getExtendAttrGrp() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExtendAttrGrp());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExtendAttrGrp(), i);
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
        new org.apache.axis.description.TypeDesc(ResourceEntityResourceMetaDataInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">ResourceEntity>ResourceMetaDataInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ResourceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>ResourceEntity>ResourceMetaDataInfo>ResourceID"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>ResourceEntity>ResourceMetaDataInfo>Title"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceType");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ResourceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("programType");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ProgramType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secretLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "SecretLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>ResourceEntity>ResourceMetaDataInfo>Subject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>ResourceEntity>ResourceMetaDataInfo>Description"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsibility");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Responsibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>ResourceEntity>ResourceMetaDataInfo>Responsibility"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>ResourceEntity>ResourceMetaDataInfo>Date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "AuditInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", "AuditInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Format"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>ResourceEntity>ResourceMetaDataInfo>Format"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Source"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>ResourceEntity>ResourceMetaDataInfo>Source"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relations");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Relations"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>ResourceEntity>ResourceMetaDataInfo>Relations"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "AuthorizeDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">>ResourceEntity>ResourceMetaDataInfo>AuthorizeDescription"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extendAttribute");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ExtendAttribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", "ExtendAttribute"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extendAttrGrp");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ExtendAttrGrp"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", "ExtendAttrGrp"));
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
