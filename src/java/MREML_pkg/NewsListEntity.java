/**
 * NewsListEntity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkg;

public class NewsListEntity  implements java.io.Serializable {
    private java.lang.String billID;

    private java.lang.String columnDate;

    private java.lang.String columnName;

    private java.lang.String editor;

    private java.lang.String prenote;

    private java.lang.String superViser;

    private java.lang.String dutyEditor;

    private java.lang.String announcer;

    private java.lang.String dubMan;

    private java.lang.String camerist;

    private java.lang.String caption;

    private java.lang.String lighter;

    private int state;

    private java.lang.String programCode;

    private java.lang.String programName;

    private java.lang.String title;

    private java.lang.String channelName;

    private java.lang.String studioName;

    private java.lang.String remark;

    private java.lang.String passNote;

    private java.lang.String afterPlay;

    private java.lang.Integer afterPlayMark;

    private MREML_pkg.NewsListEntityNewsListItem[] newsListItem;

    private MREML_pkg.ExtendAttribute[] extendAttribute;

    public NewsListEntity() {
    }

    public NewsListEntity(
           java.lang.String billID,
           java.lang.String columnDate,
           java.lang.String columnName,
           java.lang.String editor,
           java.lang.String prenote,
           java.lang.String superViser,
           java.lang.String dutyEditor,
           java.lang.String announcer,
           java.lang.String dubMan,
           java.lang.String camerist,
           java.lang.String caption,
           java.lang.String lighter,
           int state,
           java.lang.String programCode,
           java.lang.String programName,
           java.lang.String title,
           java.lang.String channelName,
           java.lang.String studioName,
           java.lang.String remark,
           java.lang.String passNote,
           java.lang.String afterPlay,
           java.lang.Integer afterPlayMark,
           MREML_pkg.NewsListEntityNewsListItem[] newsListItem,
           MREML_pkg.ExtendAttribute[] extendAttribute) {
           this.billID = billID;
           this.columnDate = columnDate;
           this.columnName = columnName;
           this.editor = editor;
           this.prenote = prenote;
           this.superViser = superViser;
           this.dutyEditor = dutyEditor;
           this.announcer = announcer;
           this.dubMan = dubMan;
           this.camerist = camerist;
           this.caption = caption;
           this.lighter = lighter;
           this.state = state;
           this.programCode = programCode;
           this.programName = programName;
           this.title = title;
           this.channelName = channelName;
           this.studioName = studioName;
           this.remark = remark;
           this.passNote = passNote;
           this.afterPlay = afterPlay;
           this.afterPlayMark = afterPlayMark;
           this.newsListItem = newsListItem;
           this.extendAttribute = extendAttribute;
    }


    /**
     * Gets the billID value for this NewsListEntity.
     * 
     * @return billID
     */
    public java.lang.String getBillID() {
        return billID;
    }


    /**
     * Sets the billID value for this NewsListEntity.
     * 
     * @param billID
     */
    public void setBillID(java.lang.String billID) {
        this.billID = billID;
    }


    /**
     * Gets the columnDate value for this NewsListEntity.
     * 
     * @return columnDate
     */
    public java.lang.String getColumnDate() {
        return columnDate;
    }


    /**
     * Sets the columnDate value for this NewsListEntity.
     * 
     * @param columnDate
     */
    public void setColumnDate(java.lang.String columnDate) {
        this.columnDate = columnDate;
    }


    /**
     * Gets the columnName value for this NewsListEntity.
     * 
     * @return columnName
     */
    public java.lang.String getColumnName() {
        return columnName;
    }


    /**
     * Sets the columnName value for this NewsListEntity.
     * 
     * @param columnName
     */
    public void setColumnName(java.lang.String columnName) {
        this.columnName = columnName;
    }


    /**
     * Gets the editor value for this NewsListEntity.
     * 
     * @return editor
     */
    public java.lang.String getEditor() {
        return editor;
    }


    /**
     * Sets the editor value for this NewsListEntity.
     * 
     * @param editor
     */
    public void setEditor(java.lang.String editor) {
        this.editor = editor;
    }


    /**
     * Gets the prenote value for this NewsListEntity.
     * 
     * @return prenote
     */
    public java.lang.String getPrenote() {
        return prenote;
    }


    /**
     * Sets the prenote value for this NewsListEntity.
     * 
     * @param prenote
     */
    public void setPrenote(java.lang.String prenote) {
        this.prenote = prenote;
    }


    /**
     * Gets the superViser value for this NewsListEntity.
     * 
     * @return superViser
     */
    public java.lang.String getSuperViser() {
        return superViser;
    }


    /**
     * Sets the superViser value for this NewsListEntity.
     * 
     * @param superViser
     */
    public void setSuperViser(java.lang.String superViser) {
        this.superViser = superViser;
    }


    /**
     * Gets the dutyEditor value for this NewsListEntity.
     * 
     * @return dutyEditor
     */
    public java.lang.String getDutyEditor() {
        return dutyEditor;
    }


    /**
     * Sets the dutyEditor value for this NewsListEntity.
     * 
     * @param dutyEditor
     */
    public void setDutyEditor(java.lang.String dutyEditor) {
        this.dutyEditor = dutyEditor;
    }


    /**
     * Gets the announcer value for this NewsListEntity.
     * 
     * @return announcer
     */
    public java.lang.String getAnnouncer() {
        return announcer;
    }


    /**
     * Sets the announcer value for this NewsListEntity.
     * 
     * @param announcer
     */
    public void setAnnouncer(java.lang.String announcer) {
        this.announcer = announcer;
    }


    /**
     * Gets the dubMan value for this NewsListEntity.
     * 
     * @return dubMan
     */
    public java.lang.String getDubMan() {
        return dubMan;
    }


    /**
     * Sets the dubMan value for this NewsListEntity.
     * 
     * @param dubMan
     */
    public void setDubMan(java.lang.String dubMan) {
        this.dubMan = dubMan;
    }


    /**
     * Gets the camerist value for this NewsListEntity.
     * 
     * @return camerist
     */
    public java.lang.String getCamerist() {
        return camerist;
    }


    /**
     * Sets the camerist value for this NewsListEntity.
     * 
     * @param camerist
     */
    public void setCamerist(java.lang.String camerist) {
        this.camerist = camerist;
    }


    /**
     * Gets the caption value for this NewsListEntity.
     * 
     * @return caption
     */
    public java.lang.String getCaption() {
        return caption;
    }


    /**
     * Sets the caption value for this NewsListEntity.
     * 
     * @param caption
     */
    public void setCaption(java.lang.String caption) {
        this.caption = caption;
    }


    /**
     * Gets the lighter value for this NewsListEntity.
     * 
     * @return lighter
     */
    public java.lang.String getLighter() {
        return lighter;
    }


    /**
     * Sets the lighter value for this NewsListEntity.
     * 
     * @param lighter
     */
    public void setLighter(java.lang.String lighter) {
        this.lighter = lighter;
    }


    /**
     * Gets the state value for this NewsListEntity.
     * 
     * @return state
     */
    public int getState() {
        return state;
    }


    /**
     * Sets the state value for this NewsListEntity.
     * 
     * @param state
     */
    public void setState(int state) {
        this.state = state;
    }


    /**
     * Gets the programCode value for this NewsListEntity.
     * 
     * @return programCode
     */
    public java.lang.String getProgramCode() {
        return programCode;
    }


    /**
     * Sets the programCode value for this NewsListEntity.
     * 
     * @param programCode
     */
    public void setProgramCode(java.lang.String programCode) {
        this.programCode = programCode;
    }


    /**
     * Gets the programName value for this NewsListEntity.
     * 
     * @return programName
     */
    public java.lang.String getProgramName() {
        return programName;
    }


    /**
     * Sets the programName value for this NewsListEntity.
     * 
     * @param programName
     */
    public void setProgramName(java.lang.String programName) {
        this.programName = programName;
    }


    /**
     * Gets the title value for this NewsListEntity.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this NewsListEntity.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the channelName value for this NewsListEntity.
     * 
     * @return channelName
     */
    public java.lang.String getChannelName() {
        return channelName;
    }


    /**
     * Sets the channelName value for this NewsListEntity.
     * 
     * @param channelName
     */
    public void setChannelName(java.lang.String channelName) {
        this.channelName = channelName;
    }


    /**
     * Gets the studioName value for this NewsListEntity.
     * 
     * @return studioName
     */
    public java.lang.String getStudioName() {
        return studioName;
    }


    /**
     * Sets the studioName value for this NewsListEntity.
     * 
     * @param studioName
     */
    public void setStudioName(java.lang.String studioName) {
        this.studioName = studioName;
    }


    /**
     * Gets the remark value for this NewsListEntity.
     * 
     * @return remark
     */
    public java.lang.String getRemark() {
        return remark;
    }


    /**
     * Sets the remark value for this NewsListEntity.
     * 
     * @param remark
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }


    /**
     * Gets the passNote value for this NewsListEntity.
     * 
     * @return passNote
     */
    public java.lang.String getPassNote() {
        return passNote;
    }


    /**
     * Sets the passNote value for this NewsListEntity.
     * 
     * @param passNote
     */
    public void setPassNote(java.lang.String passNote) {
        this.passNote = passNote;
    }


    /**
     * Gets the afterPlay value for this NewsListEntity.
     * 
     * @return afterPlay
     */
    public java.lang.String getAfterPlay() {
        return afterPlay;
    }


    /**
     * Sets the afterPlay value for this NewsListEntity.
     * 
     * @param afterPlay
     */
    public void setAfterPlay(java.lang.String afterPlay) {
        this.afterPlay = afterPlay;
    }


    /**
     * Gets the afterPlayMark value for this NewsListEntity.
     * 
     * @return afterPlayMark
     */
    public java.lang.Integer getAfterPlayMark() {
        return afterPlayMark;
    }


    /**
     * Sets the afterPlayMark value for this NewsListEntity.
     * 
     * @param afterPlayMark
     */
    public void setAfterPlayMark(java.lang.Integer afterPlayMark) {
        this.afterPlayMark = afterPlayMark;
    }


    /**
     * Gets the newsListItem value for this NewsListEntity.
     * 
     * @return newsListItem
     */
    public MREML_pkg.NewsListEntityNewsListItem[] getNewsListItem() {
        return newsListItem;
    }


    /**
     * Sets the newsListItem value for this NewsListEntity.
     * 
     * @param newsListItem
     */
    public void setNewsListItem(MREML_pkg.NewsListEntityNewsListItem[] newsListItem) {
        this.newsListItem = newsListItem;
    }

    public MREML_pkg.NewsListEntityNewsListItem getNewsListItem(int i) {
        return this.newsListItem[i];
    }

    public void setNewsListItem(int i, MREML_pkg.NewsListEntityNewsListItem _value) {
        this.newsListItem[i] = _value;
    }


    /**
     * Gets the extendAttribute value for this NewsListEntity.
     * 
     * @return extendAttribute
     */
    public MREML_pkg.ExtendAttribute[] getExtendAttribute() {
        return extendAttribute;
    }


    /**
     * Sets the extendAttribute value for this NewsListEntity.
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
        if (!(obj instanceof NewsListEntity)) return false;
        NewsListEntity other = (NewsListEntity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billID==null && other.getBillID()==null) || 
             (this.billID!=null &&
              this.billID.equals(other.getBillID()))) &&
            ((this.columnDate==null && other.getColumnDate()==null) || 
             (this.columnDate!=null &&
              this.columnDate.equals(other.getColumnDate()))) &&
            ((this.columnName==null && other.getColumnName()==null) || 
             (this.columnName!=null &&
              this.columnName.equals(other.getColumnName()))) &&
            ((this.editor==null && other.getEditor()==null) || 
             (this.editor!=null &&
              this.editor.equals(other.getEditor()))) &&
            ((this.prenote==null && other.getPrenote()==null) || 
             (this.prenote!=null &&
              this.prenote.equals(other.getPrenote()))) &&
            ((this.superViser==null && other.getSuperViser()==null) || 
             (this.superViser!=null &&
              this.superViser.equals(other.getSuperViser()))) &&
            ((this.dutyEditor==null && other.getDutyEditor()==null) || 
             (this.dutyEditor!=null &&
              this.dutyEditor.equals(other.getDutyEditor()))) &&
            ((this.announcer==null && other.getAnnouncer()==null) || 
             (this.announcer!=null &&
              this.announcer.equals(other.getAnnouncer()))) &&
            ((this.dubMan==null && other.getDubMan()==null) || 
             (this.dubMan!=null &&
              this.dubMan.equals(other.getDubMan()))) &&
            ((this.camerist==null && other.getCamerist()==null) || 
             (this.camerist!=null &&
              this.camerist.equals(other.getCamerist()))) &&
            ((this.caption==null && other.getCaption()==null) || 
             (this.caption!=null &&
              this.caption.equals(other.getCaption()))) &&
            ((this.lighter==null && other.getLighter()==null) || 
             (this.lighter!=null &&
              this.lighter.equals(other.getLighter()))) &&
            this.state == other.getState() &&
            ((this.programCode==null && other.getProgramCode()==null) || 
             (this.programCode!=null &&
              this.programCode.equals(other.getProgramCode()))) &&
            ((this.programName==null && other.getProgramName()==null) || 
             (this.programName!=null &&
              this.programName.equals(other.getProgramName()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.channelName==null && other.getChannelName()==null) || 
             (this.channelName!=null &&
              this.channelName.equals(other.getChannelName()))) &&
            ((this.studioName==null && other.getStudioName()==null) || 
             (this.studioName!=null &&
              this.studioName.equals(other.getStudioName()))) &&
            ((this.remark==null && other.getRemark()==null) || 
             (this.remark!=null &&
              this.remark.equals(other.getRemark()))) &&
            ((this.passNote==null && other.getPassNote()==null) || 
             (this.passNote!=null &&
              this.passNote.equals(other.getPassNote()))) &&
            ((this.afterPlay==null && other.getAfterPlay()==null) || 
             (this.afterPlay!=null &&
              this.afterPlay.equals(other.getAfterPlay()))) &&
            ((this.afterPlayMark==null && other.getAfterPlayMark()==null) || 
             (this.afterPlayMark!=null &&
              this.afterPlayMark.equals(other.getAfterPlayMark()))) &&
            ((this.newsListItem==null && other.getNewsListItem()==null) || 
             (this.newsListItem!=null &&
              java.util.Arrays.equals(this.newsListItem, other.getNewsListItem()))) &&
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
        if (getBillID() != null) {
            _hashCode += getBillID().hashCode();
        }
        if (getColumnDate() != null) {
            _hashCode += getColumnDate().hashCode();
        }
        if (getColumnName() != null) {
            _hashCode += getColumnName().hashCode();
        }
        if (getEditor() != null) {
            _hashCode += getEditor().hashCode();
        }
        if (getPrenote() != null) {
            _hashCode += getPrenote().hashCode();
        }
        if (getSuperViser() != null) {
            _hashCode += getSuperViser().hashCode();
        }
        if (getDutyEditor() != null) {
            _hashCode += getDutyEditor().hashCode();
        }
        if (getAnnouncer() != null) {
            _hashCode += getAnnouncer().hashCode();
        }
        if (getDubMan() != null) {
            _hashCode += getDubMan().hashCode();
        }
        if (getCamerist() != null) {
            _hashCode += getCamerist().hashCode();
        }
        if (getCaption() != null) {
            _hashCode += getCaption().hashCode();
        }
        if (getLighter() != null) {
            _hashCode += getLighter().hashCode();
        }
        _hashCode += getState();
        if (getProgramCode() != null) {
            _hashCode += getProgramCode().hashCode();
        }
        if (getProgramName() != null) {
            _hashCode += getProgramName().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getChannelName() != null) {
            _hashCode += getChannelName().hashCode();
        }
        if (getStudioName() != null) {
            _hashCode += getStudioName().hashCode();
        }
        if (getRemark() != null) {
            _hashCode += getRemark().hashCode();
        }
        if (getPassNote() != null) {
            _hashCode += getPassNote().hashCode();
        }
        if (getAfterPlay() != null) {
            _hashCode += getAfterPlay().hashCode();
        }
        if (getAfterPlayMark() != null) {
            _hashCode += getAfterPlayMark().hashCode();
        }
        if (getNewsListItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNewsListItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNewsListItem(), i);
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NewsListEntity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", "NewsListEntity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billID");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "BillID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columnDate");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ColumnDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columnName");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ColumnName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editor");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Editor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prenote");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Prenote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("superViser");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "SuperViser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dutyEditor");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "DutyEditor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("announcer");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Announcer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dubMan");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "DubMan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("camerist");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Camerist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caption");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Caption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lighter");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Lighter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("programCode");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ProgramCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("programName");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ProgramName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelName");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ChannelName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("studioName");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "StudioName"));
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
        elemField.setFieldName("passNote");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "PassNote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("afterPlay");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "AfterPlay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("afterPlayMark");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "AfterPlayMark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newsListItem");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "NewsListItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("MREML", ">NewsListEntity>NewsListItem"));
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
