package com.dayang.newmedia.newscommand.db.model;

import java.util.ArrayList;
import java.util.List;

public class UserExtraInfoQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExtraInfoQuery() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andExtraidIsNull() {
            addCriterion("ExtraID is null");
            return (Criteria) this;
        }

        public Criteria andExtraidIsNotNull() {
            addCriterion("ExtraID is not null");
            return (Criteria) this;
        }

        public Criteria andExtraidEqualTo(String value) {
            addCriterion("ExtraID =", value, "extraid");
            return (Criteria) this;
        }

        public Criteria andExtraidNotEqualTo(String value) {
            addCriterion("ExtraID <>", value, "extraid");
            return (Criteria) this;
        }

        public Criteria andExtraidGreaterThan(String value) {
            addCriterion("ExtraID >", value, "extraid");
            return (Criteria) this;
        }

        public Criteria andExtraidGreaterThanOrEqualTo(String value) {
            addCriterion("ExtraID >=", value, "extraid");
            return (Criteria) this;
        }

        public Criteria andExtraidLessThan(String value) {
            addCriterion("ExtraID <", value, "extraid");
            return (Criteria) this;
        }

        public Criteria andExtraidLessThanOrEqualTo(String value) {
            addCriterion("ExtraID <=", value, "extraid");
            return (Criteria) this;
        }

        public Criteria andExtraidLike(String value) {
            addCriterion("ExtraID like", value, "extraid");
            return (Criteria) this;
        }

        public Criteria andExtraidNotLike(String value) {
            addCriterion("ExtraID not like", value, "extraid");
            return (Criteria) this;
        }

        public Criteria andExtraidIn(List<String> values) {
            addCriterion("ExtraID in", values, "extraid");
            return (Criteria) this;
        }

        public Criteria andExtraidNotIn(List<String> values) {
            addCriterion("ExtraID not in", values, "extraid");
            return (Criteria) this;
        }

        public Criteria andExtraidBetween(String value1, String value2) {
            addCriterion("ExtraID between", value1, value2, "extraid");
            return (Criteria) this;
        }

        public Criteria andExtraidNotBetween(String value1, String value2) {
            addCriterion("ExtraID not between", value1, value2, "extraid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("UserName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("UserName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("UserName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("UserName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("UserName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("UserName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("UserName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("UserName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("UserName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("UserName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("UserName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("UserName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("UserName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("UserName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("UserID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("UserID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("UserID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("UserID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("UserID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("UserID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("UserID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("UserID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("UserID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("UserID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("UserID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("UserID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("UserID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andGpsdeviceidIsNull() {
            addCriterion("GPSDeviceID is null");
            return (Criteria) this;
        }

        public Criteria andGpsdeviceidIsNotNull() {
            addCriterion("GPSDeviceID is not null");
            return (Criteria) this;
        }

        public Criteria andGpsdeviceidEqualTo(String value) {
            addCriterion("GPSDeviceID =", value, "gpsdeviceid");
            return (Criteria) this;
        }

        public Criteria andGpsdeviceidNotEqualTo(String value) {
            addCriterion("GPSDeviceID <>", value, "gpsdeviceid");
            return (Criteria) this;
        }

        public Criteria andGpsdeviceidGreaterThan(String value) {
            addCriterion("GPSDeviceID >", value, "gpsdeviceid");
            return (Criteria) this;
        }

        public Criteria andGpsdeviceidGreaterThanOrEqualTo(String value) {
            addCriterion("GPSDeviceID >=", value, "gpsdeviceid");
            return (Criteria) this;
        }

        public Criteria andGpsdeviceidLessThan(String value) {
            addCriterion("GPSDeviceID <", value, "gpsdeviceid");
            return (Criteria) this;
        }

        public Criteria andGpsdeviceidLessThanOrEqualTo(String value) {
            addCriterion("GPSDeviceID <=", value, "gpsdeviceid");
            return (Criteria) this;
        }

        public Criteria andGpsdeviceidLike(String value) {
            addCriterion("GPSDeviceID like", value, "gpsdeviceid");
            return (Criteria) this;
        }

        public Criteria andGpsdeviceidNotLike(String value) {
            addCriterion("GPSDeviceID not like", value, "gpsdeviceid");
            return (Criteria) this;
        }

        public Criteria andGpsdeviceidIn(List<String> values) {
            addCriterion("GPSDeviceID in", values, "gpsdeviceid");
            return (Criteria) this;
        }

        public Criteria andGpsdeviceidNotIn(List<String> values) {
            addCriterion("GPSDeviceID not in", values, "gpsdeviceid");
            return (Criteria) this;
        }

        public Criteria andGpsdeviceidBetween(String value1, String value2) {
            addCriterion("GPSDeviceID between", value1, value2, "gpsdeviceid");
            return (Criteria) this;
        }

        public Criteria andGpsdeviceidNotBetween(String value1, String value2) {
            addCriterion("GPSDeviceID not between", value1, value2, "gpsdeviceid");
            return (Criteria) this;
        }

        public Criteria andGpsdevicetypeIsNull() {
            addCriterion("GPSDeviceType is null");
            return (Criteria) this;
        }

        public Criteria andGpsdevicetypeIsNotNull() {
            addCriterion("GPSDeviceType is not null");
            return (Criteria) this;
        }

        public Criteria andGpsdevicetypeEqualTo(Integer value) {
            addCriterion("GPSDeviceType =", value, "gpsdevicetype");
            return (Criteria) this;
        }

        public Criteria andGpsdevicetypeNotEqualTo(Integer value) {
            addCriterion("GPSDeviceType <>", value, "gpsdevicetype");
            return (Criteria) this;
        }

        public Criteria andGpsdevicetypeGreaterThan(Integer value) {
            addCriterion("GPSDeviceType >", value, "gpsdevicetype");
            return (Criteria) this;
        }

        public Criteria andGpsdevicetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("GPSDeviceType >=", value, "gpsdevicetype");
            return (Criteria) this;
        }

        public Criteria andGpsdevicetypeLessThan(Integer value) {
            addCriterion("GPSDeviceType <", value, "gpsdevicetype");
            return (Criteria) this;
        }

        public Criteria andGpsdevicetypeLessThanOrEqualTo(Integer value) {
            addCriterion("GPSDeviceType <=", value, "gpsdevicetype");
            return (Criteria) this;
        }

        public Criteria andGpsdevicetypeIn(List<Integer> values) {
            addCriterion("GPSDeviceType in", values, "gpsdevicetype");
            return (Criteria) this;
        }

        public Criteria andGpsdevicetypeNotIn(List<Integer> values) {
            addCriterion("GPSDeviceType not in", values, "gpsdevicetype");
            return (Criteria) this;
        }

        public Criteria andGpsdevicetypeBetween(Integer value1, Integer value2) {
            addCriterion("GPSDeviceType between", value1, value2, "gpsdevicetype");
            return (Criteria) this;
        }

        public Criteria andGpsdevicetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("GPSDeviceType not between", value1, value2, "gpsdevicetype");
            return (Criteria) this;
        }

        public Criteria andRelatetypeIsNull() {
            addCriterion("RelateType is null");
            return (Criteria) this;
        }

        public Criteria andRelatetypeIsNotNull() {
            addCriterion("RelateType is not null");
            return (Criteria) this;
        }

        public Criteria andRelatetypeEqualTo(Integer value) {
            addCriterion("RelateType =", value, "relatetype");
            return (Criteria) this;
        }

        public Criteria andRelatetypeNotEqualTo(Integer value) {
            addCriterion("RelateType <>", value, "relatetype");
            return (Criteria) this;
        }

        public Criteria andRelatetypeGreaterThan(Integer value) {
            addCriterion("RelateType >", value, "relatetype");
            return (Criteria) this;
        }

        public Criteria andRelatetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("RelateType >=", value, "relatetype");
            return (Criteria) this;
        }

        public Criteria andRelatetypeLessThan(Integer value) {
            addCriterion("RelateType <", value, "relatetype");
            return (Criteria) this;
        }

        public Criteria andRelatetypeLessThanOrEqualTo(Integer value) {
            addCriterion("RelateType <=", value, "relatetype");
            return (Criteria) this;
        }

        public Criteria andRelatetypeIn(List<Integer> values) {
            addCriterion("RelateType in", values, "relatetype");
            return (Criteria) this;
        }

        public Criteria andRelatetypeNotIn(List<Integer> values) {
            addCriterion("RelateType not in", values, "relatetype");
            return (Criteria) this;
        }

        public Criteria andRelatetypeBetween(Integer value1, Integer value2) {
            addCriterion("RelateType between", value1, value2, "relatetype");
            return (Criteria) this;
        }

        public Criteria andRelatetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("RelateType not between", value1, value2, "relatetype");
            return (Criteria) this;
        }

        public Criteria andUserweixinidIsNull() {
            addCriterion("UserWeixinID is null");
            return (Criteria) this;
        }

        public Criteria andUserweixinidIsNotNull() {
            addCriterion("UserWeixinID is not null");
            return (Criteria) this;
        }

        public Criteria andUserweixinidEqualTo(String value) {
            addCriterion("UserWeixinID =", value, "userweixinid");
            return (Criteria) this;
        }

        public Criteria andUserweixinidNotEqualTo(String value) {
            addCriterion("UserWeixinID <>", value, "userweixinid");
            return (Criteria) this;
        }

        public Criteria andUserweixinidGreaterThan(String value) {
            addCriterion("UserWeixinID >", value, "userweixinid");
            return (Criteria) this;
        }

        public Criteria andUserweixinidGreaterThanOrEqualTo(String value) {
            addCriterion("UserWeixinID >=", value, "userweixinid");
            return (Criteria) this;
        }

        public Criteria andUserweixinidLessThan(String value) {
            addCriterion("UserWeixinID <", value, "userweixinid");
            return (Criteria) this;
        }

        public Criteria andUserweixinidLessThanOrEqualTo(String value) {
            addCriterion("UserWeixinID <=", value, "userweixinid");
            return (Criteria) this;
        }

        public Criteria andUserweixinidLike(String value) {
            addCriterion("UserWeixinID like", value, "userweixinid");
            return (Criteria) this;
        }

        public Criteria andUserweixinidNotLike(String value) {
            addCriterion("UserWeixinID not like", value, "userweixinid");
            return (Criteria) this;
        }

        public Criteria andUserweixinidIn(List<String> values) {
            addCriterion("UserWeixinID in", values, "userweixinid");
            return (Criteria) this;
        }

        public Criteria andUserweixinidNotIn(List<String> values) {
            addCriterion("UserWeixinID not in", values, "userweixinid");
            return (Criteria) this;
        }

        public Criteria andUserweixinidBetween(String value1, String value2) {
            addCriterion("UserWeixinID between", value1, value2, "userweixinid");
            return (Criteria) this;
        }

        public Criteria andUserweixinidNotBetween(String value1, String value2) {
            addCriterion("UserWeixinID not between", value1, value2, "userweixinid");
            return (Criteria) this;
        }

        public Criteria andUserimagefileIsNull() {
            addCriterion("UserImageFile is null");
            return (Criteria) this;
        }

        public Criteria andUserimagefileIsNotNull() {
            addCriterion("UserImageFile is not null");
            return (Criteria) this;
        }

        public Criteria andUserimagefileEqualTo(String value) {
            addCriterion("UserImageFile =", value, "userimagefile");
            return (Criteria) this;
        }

        public Criteria andUserimagefileNotEqualTo(String value) {
            addCriterion("UserImageFile <>", value, "userimagefile");
            return (Criteria) this;
        }

        public Criteria andUserimagefileGreaterThan(String value) {
            addCriterion("UserImageFile >", value, "userimagefile");
            return (Criteria) this;
        }

        public Criteria andUserimagefileGreaterThanOrEqualTo(String value) {
            addCriterion("UserImageFile >=", value, "userimagefile");
            return (Criteria) this;
        }

        public Criteria andUserimagefileLessThan(String value) {
            addCriterion("UserImageFile <", value, "userimagefile");
            return (Criteria) this;
        }

        public Criteria andUserimagefileLessThanOrEqualTo(String value) {
            addCriterion("UserImageFile <=", value, "userimagefile");
            return (Criteria) this;
        }

        public Criteria andUserimagefileLike(String value) {
            addCriterion("UserImageFile like", value, "userimagefile");
            return (Criteria) this;
        }

        public Criteria andUserimagefileNotLike(String value) {
            addCriterion("UserImageFile not like", value, "userimagefile");
            return (Criteria) this;
        }

        public Criteria andUserimagefileIn(List<String> values) {
            addCriterion("UserImageFile in", values, "userimagefile");
            return (Criteria) this;
        }

        public Criteria andUserimagefileNotIn(List<String> values) {
            addCriterion("UserImageFile not in", values, "userimagefile");
            return (Criteria) this;
        }

        public Criteria andUserimagefileBetween(String value1, String value2) {
            addCriterion("UserImageFile between", value1, value2, "userimagefile");
            return (Criteria) this;
        }

        public Criteria andUserimagefileNotBetween(String value1, String value2) {
            addCriterion("UserImageFile not between", value1, value2, "userimagefile");
            return (Criteria) this;
        }

        public Criteria andUserbusyiconIsNull() {
            addCriterion("UserBusyIcon is null");
            return (Criteria) this;
        }

        public Criteria andUserbusyiconIsNotNull() {
            addCriterion("UserBusyIcon is not null");
            return (Criteria) this;
        }

        public Criteria andUserbusyiconEqualTo(String value) {
            addCriterion("UserBusyIcon =", value, "userbusyicon");
            return (Criteria) this;
        }

        public Criteria andUserbusyiconNotEqualTo(String value) {
            addCriterion("UserBusyIcon <>", value, "userbusyicon");
            return (Criteria) this;
        }

        public Criteria andUserbusyiconGreaterThan(String value) {
            addCriterion("UserBusyIcon >", value, "userbusyicon");
            return (Criteria) this;
        }

        public Criteria andUserbusyiconGreaterThanOrEqualTo(String value) {
            addCriterion("UserBusyIcon >=", value, "userbusyicon");
            return (Criteria) this;
        }

        public Criteria andUserbusyiconLessThan(String value) {
            addCriterion("UserBusyIcon <", value, "userbusyicon");
            return (Criteria) this;
        }

        public Criteria andUserbusyiconLessThanOrEqualTo(String value) {
            addCriterion("UserBusyIcon <=", value, "userbusyicon");
            return (Criteria) this;
        }

        public Criteria andUserbusyiconLike(String value) {
            addCriterion("UserBusyIcon like", value, "userbusyicon");
            return (Criteria) this;
        }

        public Criteria andUserbusyiconNotLike(String value) {
            addCriterion("UserBusyIcon not like", value, "userbusyicon");
            return (Criteria) this;
        }

        public Criteria andUserbusyiconIn(List<String> values) {
            addCriterion("UserBusyIcon in", values, "userbusyicon");
            return (Criteria) this;
        }

        public Criteria andUserbusyiconNotIn(List<String> values) {
            addCriterion("UserBusyIcon not in", values, "userbusyicon");
            return (Criteria) this;
        }

        public Criteria andUserbusyiconBetween(String value1, String value2) {
            addCriterion("UserBusyIcon between", value1, value2, "userbusyicon");
            return (Criteria) this;
        }

        public Criteria andUserbusyiconNotBetween(String value1, String value2) {
            addCriterion("UserBusyIcon not between", value1, value2, "userbusyicon");
            return (Criteria) this;
        }

        public Criteria andUserfreeiconIsNull() {
            addCriterion("UserFreeIcon is null");
            return (Criteria) this;
        }

        public Criteria andUserfreeiconIsNotNull() {
            addCriterion("UserFreeIcon is not null");
            return (Criteria) this;
        }

        public Criteria andUserfreeiconEqualTo(String value) {
            addCriterion("UserFreeIcon =", value, "userfreeicon");
            return (Criteria) this;
        }

        public Criteria andUserfreeiconNotEqualTo(String value) {
            addCriterion("UserFreeIcon <>", value, "userfreeicon");
            return (Criteria) this;
        }

        public Criteria andUserfreeiconGreaterThan(String value) {
            addCriterion("UserFreeIcon >", value, "userfreeicon");
            return (Criteria) this;
        }

        public Criteria andUserfreeiconGreaterThanOrEqualTo(String value) {
            addCriterion("UserFreeIcon >=", value, "userfreeicon");
            return (Criteria) this;
        }

        public Criteria andUserfreeiconLessThan(String value) {
            addCriterion("UserFreeIcon <", value, "userfreeicon");
            return (Criteria) this;
        }

        public Criteria andUserfreeiconLessThanOrEqualTo(String value) {
            addCriterion("UserFreeIcon <=", value, "userfreeicon");
            return (Criteria) this;
        }

        public Criteria andUserfreeiconLike(String value) {
            addCriterion("UserFreeIcon like", value, "userfreeicon");
            return (Criteria) this;
        }

        public Criteria andUserfreeiconNotLike(String value) {
            addCriterion("UserFreeIcon not like", value, "userfreeicon");
            return (Criteria) this;
        }

        public Criteria andUserfreeiconIn(List<String> values) {
            addCriterion("UserFreeIcon in", values, "userfreeicon");
            return (Criteria) this;
        }

        public Criteria andUserfreeiconNotIn(List<String> values) {
            addCriterion("UserFreeIcon not in", values, "userfreeicon");
            return (Criteria) this;
        }

        public Criteria andUserfreeiconBetween(String value1, String value2) {
            addCriterion("UserFreeIcon between", value1, value2, "userfreeicon");
            return (Criteria) this;
        }

        public Criteria andUserfreeiconNotBetween(String value1, String value2) {
            addCriterion("UserFreeIcon not between", value1, value2, "userfreeicon");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}