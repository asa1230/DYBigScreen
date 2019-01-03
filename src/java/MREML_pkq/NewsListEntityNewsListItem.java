/**
 * NewsListEntityNewsListItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package MREML_pkq;

public class NewsListEntityNewsListItem  implements java.io.Serializable {
    /* 条目ID */
    private java.lang.String itemID;

    /* 是否有效 */
    private java.lang.Integer isValid;

    /* 是否播出 */
    private java.lang.Integer isAired;

    /* 关联的素材ID */
    private java.lang.String clipID;

    /* 素材类型，是哪种类别的内容，比如广告，新闻条目，片花�? */
    private java.lang.String clipType;

    /* 素材入点 */
    private java.lang.Integer inPoint;

    /* 素材出点 */
    private java.lang.Integer outPoint;

    /* 播音�? */
    private java.lang.String announcer;

    /* 模版，是否使用模�? */
    private java.lang.Integer isItemModel;

    /* 来源 */
    private java.lang.String newsSource;

    /* 类别 */
    private java.lang.String newsType;

    /* 等级 */
    private java.lang.String newsGrade;

    /* 等级 */
    private java.lang.String newsLevel;

    /* 播出类别 */
    private java.lang.Integer broadcastType;

    /* 标题 */
    private java.lang.String newsTitle;

    /* 备注 */
    private java.lang.String newsRemark;

    /* 内容 */
    private java.lang.String newsContent;

    /* 记�?? */
    private java.lang.String reporter;

    /* 特约记�?? */
    private java.lang.String guestMan;

    /* 摄像�? */
    private java.lang.String camerist;

    /* 通讯�? */
    private java.lang.String batMan;

    /* 剪辑�? */
    private java.lang.String editor;

    /* 配音�? */
    private java.lang.String dubMan;

    /* 其他人员 */
    private java.lang.String assistant;

    /* 视频长度，单位是�? */
    private java.lang.Integer videoLength;

    /* 文字长度 */
    private java.lang.Integer wordsLength;

    /* 调节长度 */
    private java.lang.Integer adjustLength;

    /* 是否是�?�稿 */
    private java.lang.Integer isTongGao;

    /* 文稿状�?�，枚举 */
    private int state;

    /* 视频状�?? */
    private java.lang.Integer videoState;

    /* 播出�? */
    private java.lang.Integer actualID;

    public NewsListEntityNewsListItem() {
    }

    public NewsListEntityNewsListItem(
           java.lang.String itemID,
           java.lang.Integer isValid,
           java.lang.Integer isAired,
           java.lang.String clipID,
           java.lang.String clipType,
           java.lang.Integer inPoint,
           java.lang.Integer outPoint,
           java.lang.String announcer,
           java.lang.Integer isItemModel,
           java.lang.String newsSource,
           java.lang.String newsType,
           java.lang.String newsGrade,
           java.lang.String newsLevel,
           java.lang.Integer broadcastType,
           java.lang.String newsTitle,
           java.lang.String newsRemark,
           java.lang.String newsContent,
           java.lang.String reporter,
           java.lang.String guestMan,
           java.lang.String camerist,
           java.lang.String batMan,
           java.lang.String editor,
           java.lang.String dubMan,
           java.lang.String assistant,
           java.lang.Integer videoLength,
           java.lang.Integer wordsLength,
           java.lang.Integer adjustLength,
           java.lang.Integer isTongGao,
           int state,
           java.lang.Integer videoState,
           java.lang.Integer actualID) {
           this.itemID = itemID;
           this.isValid = isValid;
           this.isAired = isAired;
           this.clipID = clipID;
           this.clipType = clipType;
           this.inPoint = inPoint;
           this.outPoint = outPoint;
           this.announcer = announcer;
           this.isItemModel = isItemModel;
           this.newsSource = newsSource;
           this.newsType = newsType;
           this.newsGrade = newsGrade;
           this.newsLevel = newsLevel;
           this.broadcastType = broadcastType;
           this.newsTitle = newsTitle;
           this.newsRemark = newsRemark;
           this.newsContent = newsContent;
           this.reporter = reporter;
           this.guestMan = guestMan;
           this.camerist = camerist;
           this.batMan = batMan;
           this.editor = editor;
           this.dubMan = dubMan;
           this.assistant = assistant;
           this.videoLength = videoLength;
           this.wordsLength = wordsLength;
           this.adjustLength = adjustLength;
           this.isTongGao = isTongGao;
           this.state = state;
           this.videoState = videoState;
           this.actualID = actualID;
    }


    /**
     * Gets the itemID value for this NewsListEntityNewsListItem.
     * 
     * @return itemID   * 条目ID
     */
    public java.lang.String getItemID() {
        return itemID;
    }


    /**
     * Sets the itemID value for this NewsListEntityNewsListItem.
     * 
     * @param itemID   * 条目ID
     */
    public void setItemID(java.lang.String itemID) {
        this.itemID = itemID;
    }


    /**
     * Gets the isValid value for this NewsListEntityNewsListItem.
     * 
     * @return isValid   * 是否有效
     */
    public java.lang.Integer getIsValid() {
        return isValid;
    }


    /**
     * Sets the isValid value for this NewsListEntityNewsListItem.
     * 
     * @param isValid   * 是否有效
     */
    public void setIsValid(java.lang.Integer isValid) {
        this.isValid = isValid;
    }


    /**
     * Gets the isAired value for this NewsListEntityNewsListItem.
     * 
     * @return isAired   * 是否播出
     */
    public java.lang.Integer getIsAired() {
        return isAired;
    }


    /**
     * Sets the isAired value for this NewsListEntityNewsListItem.
     * 
     * @param isAired   * 是否播出
     */
    public void setIsAired(java.lang.Integer isAired) {
        this.isAired = isAired;
    }


    /**
     * Gets the clipID value for this NewsListEntityNewsListItem.
     * 
     * @return clipID   * 关联的素材ID
     */
    public java.lang.String getClipID() {
        return clipID;
    }


    /**
     * Sets the clipID value for this NewsListEntityNewsListItem.
     * 
     * @param clipID   * 关联的素材ID
     */
    public void setClipID(java.lang.String clipID) {
        this.clipID = clipID;
    }


    /**
     * Gets the clipType value for this NewsListEntityNewsListItem.
     * 
     * @return clipType   * 素材类型，是哪种类别的内容，比如广告，新闻条目，片花�?
     */
    public java.lang.String getClipType() {
        return clipType;
    }


    /**
     * Sets the clipType value for this NewsListEntityNewsListItem.
     * 
     * @param clipType   * 素材类型，是哪种类别的内容，比如广告，新闻条目，片花�?
     */
    public void setClipType(java.lang.String clipType) {
        this.clipType = clipType;
    }


    /**
     * Gets the inPoint value for this NewsListEntityNewsListItem.
     * 
     * @return inPoint   * 素材入点
     */
    public java.lang.Integer getInPoint() {
        return inPoint;
    }


    /**
     * Sets the inPoint value for this NewsListEntityNewsListItem.
     * 
     * @param inPoint   * 素材入点
     */
    public void setInPoint(java.lang.Integer inPoint) {
        this.inPoint = inPoint;
    }


    /**
     * Gets the outPoint value for this NewsListEntityNewsListItem.
     * 
     * @return outPoint   * 素材出点
     */
    public java.lang.Integer getOutPoint() {
        return outPoint;
    }


    /**
     * Sets the outPoint value for this NewsListEntityNewsListItem.
     * 
     * @param outPoint   * 素材出点
     */
    public void setOutPoint(java.lang.Integer outPoint) {
        this.outPoint = outPoint;
    }


    /**
     * Gets the announcer value for this NewsListEntityNewsListItem.
     * 
     * @return announcer   * 播音�?
     */
    public java.lang.String getAnnouncer() {
        return announcer;
    }


    /**
     * Sets the announcer value for this NewsListEntityNewsListItem.
     * 
     * @param announcer   * 播音�?
     */
    public void setAnnouncer(java.lang.String announcer) {
        this.announcer = announcer;
    }


    /**
     * Gets the isItemModel value for this NewsListEntityNewsListItem.
     * 
     * @return isItemModel   * 模版，是否使用模�?
     */
    public java.lang.Integer getIsItemModel() {
        return isItemModel;
    }


    /**
     * Sets the isItemModel value for this NewsListEntityNewsListItem.
     * 
     * @param isItemModel   * 模版，是否使用模�?
     */
    public void setIsItemModel(java.lang.Integer isItemModel) {
        this.isItemModel = isItemModel;
    }


    /**
     * Gets the newsSource value for this NewsListEntityNewsListItem.
     * 
     * @return newsSource   * 来源
     */
    public java.lang.String getNewsSource() {
        return newsSource;
    }


    /**
     * Sets the newsSource value for this NewsListEntityNewsListItem.
     * 
     * @param newsSource   * 来源
     */
    public void setNewsSource(java.lang.String newsSource) {
        this.newsSource = newsSource;
    }


    /**
     * Gets the newsType value for this NewsListEntityNewsListItem.
     * 
     * @return newsType   * 类别
     */
    public java.lang.String getNewsType() {
        return newsType;
    }


    /**
     * Sets the newsType value for this NewsListEntityNewsListItem.
     * 
     * @param newsType   * 类别
     */
    public void setNewsType(java.lang.String newsType) {
        this.newsType = newsType;
    }


    /**
     * Gets the newsGrade value for this NewsListEntityNewsListItem.
     * 
     * @return newsGrade   * 等级
     */
    public java.lang.String getNewsGrade() {
        return newsGrade;
    }


    /**
     * Sets the newsGrade value for this NewsListEntityNewsListItem.
     * 
     * @param newsGrade   * 等级
     */
    public void setNewsGrade(java.lang.String newsGrade) {
        this.newsGrade = newsGrade;
    }


    /**
     * Gets the newsLevel value for this NewsListEntityNewsListItem.
     * 
     * @return newsLevel   * 等级
     */
    public java.lang.String getNewsLevel() {
        return newsLevel;
    }


    /**
     * Sets the newsLevel value for this NewsListEntityNewsListItem.
     * 
     * @param newsLevel   * 等级
     */
    public void setNewsLevel(java.lang.String newsLevel) {
        this.newsLevel = newsLevel;
    }


    /**
     * Gets the broadcastType value for this NewsListEntityNewsListItem.
     * 
     * @return broadcastType   * 播出类别
     */
    public java.lang.Integer getBroadcastType() {
        return broadcastType;
    }


    /**
     * Sets the broadcastType value for this NewsListEntityNewsListItem.
     * 
     * @param broadcastType   * 播出类别
     */
    public void setBroadcastType(java.lang.Integer broadcastType) {
        this.broadcastType = broadcastType;
    }


    /**
     * Gets the newsTitle value for this NewsListEntityNewsListItem.
     * 
     * @return newsTitle   * 标题
     */
    public java.lang.String getNewsTitle() {
        return newsTitle;
    }


    /**
     * Sets the newsTitle value for this NewsListEntityNewsListItem.
     * 
     * @param newsTitle   * 标题
     */
    public void setNewsTitle(java.lang.String newsTitle) {
        this.newsTitle = newsTitle;
    }


    /**
     * Gets the newsRemark value for this NewsListEntityNewsListItem.
     * 
     * @return newsRemark   * 备注
     */
    public java.lang.String getNewsRemark() {
        return newsRemark;
    }


    /**
     * Sets the newsRemark value for this NewsListEntityNewsListItem.
     * 
     * @param newsRemark   * 备注
     */
    public void setNewsRemark(java.lang.String newsRemark) {
        this.newsRemark = newsRemark;
    }


    /**
     * Gets the newsContent value for this NewsListEntityNewsListItem.
     * 
     * @return newsContent   * 内容
     */
    public java.lang.String getNewsContent() {
        return newsContent;
    }


    /**
     * Sets the newsContent value for this NewsListEntityNewsListItem.
     * 
     * @param newsContent   * 内容
     */
    public void setNewsContent(java.lang.String newsContent) {
        this.newsContent = newsContent;
    }


    /**
     * Gets the reporter value for this NewsListEntityNewsListItem.
     * 
     * @return reporter   * 记�??
     */
    public java.lang.String getReporter() {
        return reporter;
    }


    /**
     * Sets the reporter value for this NewsListEntityNewsListItem.
     * 
     * @param reporter   * 记�??
     */
    public void setReporter(java.lang.String reporter) {
        this.reporter = reporter;
    }


    /**
     * Gets the guestMan value for this NewsListEntityNewsListItem.
     * 
     * @return guestMan   * 特约记�??
     */
    public java.lang.String getGuestMan() {
        return guestMan;
    }


    /**
     * Sets the guestMan value for this NewsListEntityNewsListItem.
     * 
     * @param guestMan   * 特约记�??
     */
    public void setGuestMan(java.lang.String guestMan) {
        this.guestMan = guestMan;
    }


    /**
     * Gets the camerist value for this NewsListEntityNewsListItem.
     * 
     * @return camerist   * 摄像�?
     */
    public java.lang.String getCamerist() {
        return camerist;
    }


    /**
     * Sets the camerist value for this NewsListEntityNewsListItem.
     * 
     * @param camerist   * 摄像�?
     */
    public void setCamerist(java.lang.String camerist) {
        this.camerist = camerist;
    }


    /**
     * Gets the batMan value for this NewsListEntityNewsListItem.
     * 
     * @return batMan   * 通讯�?
     */
    public java.lang.String getBatMan() {
        return batMan;
    }


    /**
     * Sets the batMan value for this NewsListEntityNewsListItem.
     * 
     * @param batMan   * 通讯�?
     */
    public void setBatMan(java.lang.String batMan) {
        this.batMan = batMan;
    }


    /**
     * Gets the editor value for this NewsListEntityNewsListItem.
     * 
     * @return editor   * 剪辑�?
     */
    public java.lang.String getEditor() {
        return editor;
    }


    /**
     * Sets the editor value for this NewsListEntityNewsListItem.
     * 
     * @param editor   * 剪辑�?
     */
    public void setEditor(java.lang.String editor) {
        this.editor = editor;
    }


    /**
     * Gets the dubMan value for this NewsListEntityNewsListItem.
     * 
     * @return dubMan   * 配音�?
     */
    public java.lang.String getDubMan() {
        return dubMan;
    }


    /**
     * Sets the dubMan value for this NewsListEntityNewsListItem.
     * 
     * @param dubMan   * 配音�?
     */
    public void setDubMan(java.lang.String dubMan) {
        this.dubMan = dubMan;
    }


    /**
     * Gets the assistant value for this NewsListEntityNewsListItem.
     * 
     * @return assistant   * 其他人员
     */
    public java.lang.String getAssistant() {
        return assistant;
    }


    /**
     * Sets the assistant value for this NewsListEntityNewsListItem.
     * 
     * @param assistant   * 其他人员
     */
    public void setAssistant(java.lang.String assistant) {
        this.assistant = assistant;
    }


    /**
     * Gets the videoLength value for this NewsListEntityNewsListItem.
     * 
     * @return videoLength   * 视频长度，单位是�?
     */
    public java.lang.Integer getVideoLength() {
        return videoLength;
    }


    /**
     * Sets the videoLength value for this NewsListEntityNewsListItem.
     * 
     * @param videoLength   * 视频长度，单位是�?
     */
    public void setVideoLength(java.lang.Integer videoLength) {
        this.videoLength = videoLength;
    }


    /**
     * Gets the wordsLength value for this NewsListEntityNewsListItem.
     * 
     * @return wordsLength   * 文字长度
     */
    public java.lang.Integer getWordsLength() {
        return wordsLength;
    }


    /**
     * Sets the wordsLength value for this NewsListEntityNewsListItem.
     * 
     * @param wordsLength   * 文字长度
     */
    public void setWordsLength(java.lang.Integer wordsLength) {
        this.wordsLength = wordsLength;
    }


    /**
     * Gets the adjustLength value for this NewsListEntityNewsListItem.
     * 
     * @return adjustLength   * 调节长度
     */
    public java.lang.Integer getAdjustLength() {
        return adjustLength;
    }


    /**
     * Sets the adjustLength value for this NewsListEntityNewsListItem.
     * 
     * @param adjustLength   * 调节长度
     */
    public void setAdjustLength(java.lang.Integer adjustLength) {
        this.adjustLength = adjustLength;
    }


    /**
     * Gets the isTongGao value for this NewsListEntityNewsListItem.
     * 
     * @return isTongGao   * 是否是�?�稿
     */
    public java.lang.Integer getIsTongGao() {
        return isTongGao;
    }


    /**
     * Sets the isTongGao value for this NewsListEntityNewsListItem.
     * 
     * @param isTongGao   * 是否是�?�稿
     */
    public void setIsTongGao(java.lang.Integer isTongGao) {
        this.isTongGao = isTongGao;
    }


    /**
     * Gets the state value for this NewsListEntityNewsListItem.
     * 
     * @return state   * 文稿状�?�，枚举
     */
    public int getState() {
        return state;
    }


    /**
     * Sets the state value for this NewsListEntityNewsListItem.
     * 
     * @param state   * 文稿状�?�，枚举
     */
    public void setState(int state) {
        this.state = state;
    }


    /**
     * Gets the videoState value for this NewsListEntityNewsListItem.
     * 
     * @return videoState   * 视频状�??
     */
    public java.lang.Integer getVideoState() {
        return videoState;
    }


    /**
     * Sets the videoState value for this NewsListEntityNewsListItem.
     * 
     * @param videoState   * 视频状�??
     */
    public void setVideoState(java.lang.Integer videoState) {
        this.videoState = videoState;
    }


    /**
     * Gets the actualID value for this NewsListEntityNewsListItem.
     * 
     * @return actualID   * 播出�?
     */
    public java.lang.Integer getActualID() {
        return actualID;
    }


    /**
     * Sets the actualID value for this NewsListEntityNewsListItem.
     * 
     * @param actualID   * 播出�?
     */
    public void setActualID(java.lang.Integer actualID) {
        this.actualID = actualID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NewsListEntityNewsListItem)) return false;
        NewsListEntityNewsListItem other = (NewsListEntityNewsListItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemID==null && other.getItemID()==null) || 
             (this.itemID!=null &&
              this.itemID.equals(other.getItemID()))) &&
            ((this.isValid==null && other.getIsValid()==null) || 
             (this.isValid!=null &&
              this.isValid.equals(other.getIsValid()))) &&
            ((this.isAired==null && other.getIsAired()==null) || 
             (this.isAired!=null &&
              this.isAired.equals(other.getIsAired()))) &&
            ((this.clipID==null && other.getClipID()==null) || 
             (this.clipID!=null &&
              this.clipID.equals(other.getClipID()))) &&
            ((this.clipType==null && other.getClipType()==null) || 
             (this.clipType!=null &&
              this.clipType.equals(other.getClipType()))) &&
            ((this.inPoint==null && other.getInPoint()==null) || 
             (this.inPoint!=null &&
              this.inPoint.equals(other.getInPoint()))) &&
            ((this.outPoint==null && other.getOutPoint()==null) || 
             (this.outPoint!=null &&
              this.outPoint.equals(other.getOutPoint()))) &&
            ((this.announcer==null && other.getAnnouncer()==null) || 
             (this.announcer!=null &&
              this.announcer.equals(other.getAnnouncer()))) &&
            ((this.isItemModel==null && other.getIsItemModel()==null) || 
             (this.isItemModel!=null &&
              this.isItemModel.equals(other.getIsItemModel()))) &&
            ((this.newsSource==null && other.getNewsSource()==null) || 
             (this.newsSource!=null &&
              this.newsSource.equals(other.getNewsSource()))) &&
            ((this.newsType==null && other.getNewsType()==null) || 
             (this.newsType!=null &&
              this.newsType.equals(other.getNewsType()))) &&
            ((this.newsGrade==null && other.getNewsGrade()==null) || 
             (this.newsGrade!=null &&
              this.newsGrade.equals(other.getNewsGrade()))) &&
            ((this.newsLevel==null && other.getNewsLevel()==null) || 
             (this.newsLevel!=null &&
              this.newsLevel.equals(other.getNewsLevel()))) &&
            ((this.broadcastType==null && other.getBroadcastType()==null) || 
             (this.broadcastType!=null &&
              this.broadcastType.equals(other.getBroadcastType()))) &&
            ((this.newsTitle==null && other.getNewsTitle()==null) || 
             (this.newsTitle!=null &&
              this.newsTitle.equals(other.getNewsTitle()))) &&
            ((this.newsRemark==null && other.getNewsRemark()==null) || 
             (this.newsRemark!=null &&
              this.newsRemark.equals(other.getNewsRemark()))) &&
            ((this.newsContent==null && other.getNewsContent()==null) || 
             (this.newsContent!=null &&
              this.newsContent.equals(other.getNewsContent()))) &&
            ((this.reporter==null && other.getReporter()==null) || 
             (this.reporter!=null &&
              this.reporter.equals(other.getReporter()))) &&
            ((this.guestMan==null && other.getGuestMan()==null) || 
             (this.guestMan!=null &&
              this.guestMan.equals(other.getGuestMan()))) &&
            ((this.camerist==null && other.getCamerist()==null) || 
             (this.camerist!=null &&
              this.camerist.equals(other.getCamerist()))) &&
            ((this.batMan==null && other.getBatMan()==null) || 
             (this.batMan!=null &&
              this.batMan.equals(other.getBatMan()))) &&
            ((this.editor==null && other.getEditor()==null) || 
             (this.editor!=null &&
              this.editor.equals(other.getEditor()))) &&
            ((this.dubMan==null && other.getDubMan()==null) || 
             (this.dubMan!=null &&
              this.dubMan.equals(other.getDubMan()))) &&
            ((this.assistant==null && other.getAssistant()==null) || 
             (this.assistant!=null &&
              this.assistant.equals(other.getAssistant()))) &&
            ((this.videoLength==null && other.getVideoLength()==null) || 
             (this.videoLength!=null &&
              this.videoLength.equals(other.getVideoLength()))) &&
            ((this.wordsLength==null && other.getWordsLength()==null) || 
             (this.wordsLength!=null &&
              this.wordsLength.equals(other.getWordsLength()))) &&
            ((this.adjustLength==null && other.getAdjustLength()==null) || 
             (this.adjustLength!=null &&
              this.adjustLength.equals(other.getAdjustLength()))) &&
            ((this.isTongGao==null && other.getIsTongGao()==null) || 
             (this.isTongGao!=null &&
              this.isTongGao.equals(other.getIsTongGao()))) &&
            this.state == other.getState() &&
            ((this.videoState==null && other.getVideoState()==null) || 
             (this.videoState!=null &&
              this.videoState.equals(other.getVideoState()))) &&
            ((this.actualID==null && other.getActualID()==null) || 
             (this.actualID!=null &&
              this.actualID.equals(other.getActualID())));
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
        if (getItemID() != null) {
            _hashCode += getItemID().hashCode();
        }
        if (getIsValid() != null) {
            _hashCode += getIsValid().hashCode();
        }
        if (getIsAired() != null) {
            _hashCode += getIsAired().hashCode();
        }
        if (getClipID() != null) {
            _hashCode += getClipID().hashCode();
        }
        if (getClipType() != null) {
            _hashCode += getClipType().hashCode();
        }
        if (getInPoint() != null) {
            _hashCode += getInPoint().hashCode();
        }
        if (getOutPoint() != null) {
            _hashCode += getOutPoint().hashCode();
        }
        if (getAnnouncer() != null) {
            _hashCode += getAnnouncer().hashCode();
        }
        if (getIsItemModel() != null) {
            _hashCode += getIsItemModel().hashCode();
        }
        if (getNewsSource() != null) {
            _hashCode += getNewsSource().hashCode();
        }
        if (getNewsType() != null) {
            _hashCode += getNewsType().hashCode();
        }
        if (getNewsGrade() != null) {
            _hashCode += getNewsGrade().hashCode();
        }
        if (getNewsLevel() != null) {
            _hashCode += getNewsLevel().hashCode();
        }
        if (getBroadcastType() != null) {
            _hashCode += getBroadcastType().hashCode();
        }
        if (getNewsTitle() != null) {
            _hashCode += getNewsTitle().hashCode();
        }
        if (getNewsRemark() != null) {
            _hashCode += getNewsRemark().hashCode();
        }
        if (getNewsContent() != null) {
            _hashCode += getNewsContent().hashCode();
        }
        if (getReporter() != null) {
            _hashCode += getReporter().hashCode();
        }
        if (getGuestMan() != null) {
            _hashCode += getGuestMan().hashCode();
        }
        if (getCamerist() != null) {
            _hashCode += getCamerist().hashCode();
        }
        if (getBatMan() != null) {
            _hashCode += getBatMan().hashCode();
        }
        if (getEditor() != null) {
            _hashCode += getEditor().hashCode();
        }
        if (getDubMan() != null) {
            _hashCode += getDubMan().hashCode();
        }
        if (getAssistant() != null) {
            _hashCode += getAssistant().hashCode();
        }
        if (getVideoLength() != null) {
            _hashCode += getVideoLength().hashCode();
        }
        if (getWordsLength() != null) {
            _hashCode += getWordsLength().hashCode();
        }
        if (getAdjustLength() != null) {
            _hashCode += getAdjustLength().hashCode();
        }
        if (getIsTongGao() != null) {
            _hashCode += getIsTongGao().hashCode();
        }
        _hashCode += getState();
        if (getVideoState() != null) {
            _hashCode += getVideoState().hashCode();
        }
        if (getActualID() != null) {
            _hashCode += getActualID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NewsListEntityNewsListItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MREML", ">>NewsListEntity>NewsListItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemID");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ItemID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isValid");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "IsValid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAired");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "IsAired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clipID");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ClipID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clipType");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ClipType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "InPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "OutPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("announcer");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Announcer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isItemModel");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "IsItemModel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newsSource");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "NewsSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newsType");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "NewsType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newsGrade");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "NewsGrade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newsLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "NewsLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("broadcastType");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "BroadcastType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newsTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "NewsTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newsRemark");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "NewsRemark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newsContent");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "NewsContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reporter");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Reporter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guestMan");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "GuestMan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("camerist");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Camerist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batMan");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "BatMan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editor");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Editor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dubMan");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "DubMan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assistant");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "Assistant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoLength");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "VideoLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wordsLength");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "WordsLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustLength");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "AdjustLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTongGao");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "IsTongGao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoState");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "VideoState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualID");
        elemField.setXmlName(new javax.xml.namespace.QName("MREML", "ActualID"));
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
