package com.dayang.newmedia.newscommand.db.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserLogInfoQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserLogInfoQuery() {
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

        public Criteria andLogguidIsNull() {
            addCriterion("LOGGUID is null");
            return (Criteria) this;
        }

        public Criteria andLogguidIsNotNull() {
            addCriterion("LOGGUID is not null");
            return (Criteria) this;
        }

        public Criteria andLogguidEqualTo(String value) {
            addCriterion("LOGGUID =", value, "logguid");
            return (Criteria) this;
        }

        public Criteria andLogguidNotEqualTo(String value) {
            addCriterion("LOGGUID <>", value, "logguid");
            return (Criteria) this;
        }

        public Criteria andLogguidGreaterThan(String value) {
            addCriterion("LOGGUID >", value, "logguid");
            return (Criteria) this;
        }

        public Criteria andLogguidGreaterThanOrEqualTo(String value) {
            addCriterion("LOGGUID >=", value, "logguid");
            return (Criteria) this;
        }

        public Criteria andLogguidLessThan(String value) {
            addCriterion("LOGGUID <", value, "logguid");
            return (Criteria) this;
        }

        public Criteria andLogguidLessThanOrEqualTo(String value) {
            addCriterion("LOGGUID <=", value, "logguid");
            return (Criteria) this;
        }

        public Criteria andLogguidLike(String value) {
            addCriterion("LOGGUID like", value, "logguid");
            return (Criteria) this;
        }

        public Criteria andLogguidNotLike(String value) {
            addCriterion("LOGGUID not like", value, "logguid");
            return (Criteria) this;
        }

        public Criteria andLogguidIn(List<String> values) {
            addCriterion("LOGGUID in", values, "logguid");
            return (Criteria) this;
        }

        public Criteria andLogguidNotIn(List<String> values) {
            addCriterion("LOGGUID not in", values, "logguid");
            return (Criteria) this;
        }

        public Criteria andLogguidBetween(String value1, String value2) {
            addCriterion("LOGGUID between", value1, value2, "logguid");
            return (Criteria) this;
        }

        public Criteria andLogguidNotBetween(String value1, String value2) {
            addCriterion("LOGGUID not between", value1, value2, "logguid");
            return (Criteria) this;
        }

        public Criteria andLogusernameIsNull() {
            addCriterion("LOGUSERNAME is null");
            return (Criteria) this;
        }

        public Criteria andLogusernameIsNotNull() {
            addCriterion("LOGUSERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andLogusernameEqualTo(String value) {
            addCriterion("LOGUSERNAME =", value, "logusername");
            return (Criteria) this;
        }

        public Criteria andLogusernameNotEqualTo(String value) {
            addCriterion("LOGUSERNAME <>", value, "logusername");
            return (Criteria) this;
        }

        public Criteria andLogusernameGreaterThan(String value) {
            addCriterion("LOGUSERNAME >", value, "logusername");
            return (Criteria) this;
        }

        public Criteria andLogusernameGreaterThanOrEqualTo(String value) {
            addCriterion("LOGUSERNAME >=", value, "logusername");
            return (Criteria) this;
        }

        public Criteria andLogusernameLessThan(String value) {
            addCriterion("LOGUSERNAME <", value, "logusername");
            return (Criteria) this;
        }

        public Criteria andLogusernameLessThanOrEqualTo(String value) {
            addCriterion("LOGUSERNAME <=", value, "logusername");
            return (Criteria) this;
        }

        public Criteria andLogusernameLike(String value) {
            addCriterion("LOGUSERNAME like", value, "logusername");
            return (Criteria) this;
        }

        public Criteria andLogusernameNotLike(String value) {
            addCriterion("LOGUSERNAME not like", value, "logusername");
            return (Criteria) this;
        }

        public Criteria andLogusernameIn(List<String> values) {
            addCriterion("LOGUSERNAME in", values, "logusername");
            return (Criteria) this;
        }

        public Criteria andLogusernameNotIn(List<String> values) {
            addCriterion("LOGUSERNAME not in", values, "logusername");
            return (Criteria) this;
        }

        public Criteria andLogusernameBetween(String value1, String value2) {
            addCriterion("LOGUSERNAME between", value1, value2, "logusername");
            return (Criteria) this;
        }

        public Criteria andLogusernameNotBetween(String value1, String value2) {
            addCriterion("LOGUSERNAME not between", value1, value2, "logusername");
            return (Criteria) this;
        }

        public Criteria andLoguseridIsNull() {
            addCriterion("LOGUSERID is null");
            return (Criteria) this;
        }

        public Criteria andLoguseridIsNotNull() {
            addCriterion("LOGUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andLoguseridEqualTo(String value) {
            addCriterion("LOGUSERID =", value, "loguserid");
            return (Criteria) this;
        }

        public Criteria andLoguseridNotEqualTo(String value) {
            addCriterion("LOGUSERID <>", value, "loguserid");
            return (Criteria) this;
        }

        public Criteria andLoguseridGreaterThan(String value) {
            addCriterion("LOGUSERID >", value, "loguserid");
            return (Criteria) this;
        }

        public Criteria andLoguseridGreaterThanOrEqualTo(String value) {
            addCriterion("LOGUSERID >=", value, "loguserid");
            return (Criteria) this;
        }

        public Criteria andLoguseridLessThan(String value) {
            addCriterion("LOGUSERID <", value, "loguserid");
            return (Criteria) this;
        }

        public Criteria andLoguseridLessThanOrEqualTo(String value) {
            addCriterion("LOGUSERID <=", value, "loguserid");
            return (Criteria) this;
        }

        public Criteria andLoguseridLike(String value) {
            addCriterion("LOGUSERID like", value, "loguserid");
            return (Criteria) this;
        }

        public Criteria andLoguseridNotLike(String value) {
            addCriterion("LOGUSERID not like", value, "loguserid");
            return (Criteria) this;
        }

        public Criteria andLoguseridIn(List<String> values) {
            addCriterion("LOGUSERID in", values, "loguserid");
            return (Criteria) this;
        }

        public Criteria andLoguseridNotIn(List<String> values) {
            addCriterion("LOGUSERID not in", values, "loguserid");
            return (Criteria) this;
        }

        public Criteria andLoguseridBetween(String value1, String value2) {
            addCriterion("LOGUSERID between", value1, value2, "loguserid");
            return (Criteria) this;
        }

        public Criteria andLoguseridNotBetween(String value1, String value2) {
            addCriterion("LOGUSERID not between", value1, value2, "loguserid");
            return (Criteria) this;
        }

        public Criteria andLogstateIsNull() {
            addCriterion("LOGSTATE is null");
            return (Criteria) this;
        }

        public Criteria andLogstateIsNotNull() {
            addCriterion("LOGSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andLogstateEqualTo(BigDecimal value) {
            addCriterion("LOGSTATE =", value, "logstate");
            return (Criteria) this;
        }

        public Criteria andLogstateNotEqualTo(BigDecimal value) {
            addCriterion("LOGSTATE <>", value, "logstate");
            return (Criteria) this;
        }

        public Criteria andLogstateGreaterThan(BigDecimal value) {
            addCriterion("LOGSTATE >", value, "logstate");
            return (Criteria) this;
        }

        public Criteria andLogstateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LOGSTATE >=", value, "logstate");
            return (Criteria) this;
        }

        public Criteria andLogstateLessThan(BigDecimal value) {
            addCriterion("LOGSTATE <", value, "logstate");
            return (Criteria) this;
        }

        public Criteria andLogstateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LOGSTATE <=", value, "logstate");
            return (Criteria) this;
        }

        public Criteria andLogstateIn(List<BigDecimal> values) {
            addCriterion("LOGSTATE in", values, "logstate");
            return (Criteria) this;
        }

        public Criteria andLogstateNotIn(List<BigDecimal> values) {
            addCriterion("LOGSTATE not in", values, "logstate");
            return (Criteria) this;
        }

        public Criteria andLogstateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOGSTATE between", value1, value2, "logstate");
            return (Criteria) this;
        }

        public Criteria andLogstateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOGSTATE not between", value1, value2, "logstate");
            return (Criteria) this;
        }

        public Criteria andLogintimeIsNull() {
            addCriterion("LOGINTIME is null");
            return (Criteria) this;
        }

        public Criteria andLogintimeIsNotNull() {
            addCriterion("LOGINTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLogintimeEqualTo(Date value) {
            addCriterion("LOGINTIME =", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotEqualTo(Date value) {
            addCriterion("LOGINTIME <>", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeGreaterThan(Date value) {
            addCriterion("LOGINTIME >", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LOGINTIME >=", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeLessThan(Date value) {
            addCriterion("LOGINTIME <", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeLessThanOrEqualTo(Date value) {
            addCriterion("LOGINTIME <=", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeIn(List<Date> values) {
            addCriterion("LOGINTIME in", values, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotIn(List<Date> values) {
            addCriterion("LOGINTIME not in", values, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeBetween(Date value1, Date value2) {
            addCriterion("LOGINTIME between", value1, value2, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotBetween(Date value1, Date value2) {
            addCriterion("LOGINTIME not between", value1, value2, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogouttimeIsNull() {
            addCriterion("LOGOUTTIME is null");
            return (Criteria) this;
        }

        public Criteria andLogouttimeIsNotNull() {
            addCriterion("LOGOUTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLogouttimeEqualTo(Date value) {
            addCriterion("LOGOUTTIME =", value, "logouttime");
            return (Criteria) this;
        }

        public Criteria andLogouttimeNotEqualTo(Date value) {
            addCriterion("LOGOUTTIME <>", value, "logouttime");
            return (Criteria) this;
        }

        public Criteria andLogouttimeGreaterThan(Date value) {
            addCriterion("LOGOUTTIME >", value, "logouttime");
            return (Criteria) this;
        }

        public Criteria andLogouttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LOGOUTTIME >=", value, "logouttime");
            return (Criteria) this;
        }

        public Criteria andLogouttimeLessThan(Date value) {
            addCriterion("LOGOUTTIME <", value, "logouttime");
            return (Criteria) this;
        }

        public Criteria andLogouttimeLessThanOrEqualTo(Date value) {
            addCriterion("LOGOUTTIME <=", value, "logouttime");
            return (Criteria) this;
        }

        public Criteria andLogouttimeIn(List<Date> values) {
            addCriterion("LOGOUTTIME in", values, "logouttime");
            return (Criteria) this;
        }

        public Criteria andLogouttimeNotIn(List<Date> values) {
            addCriterion("LOGOUTTIME not in", values, "logouttime");
            return (Criteria) this;
        }

        public Criteria andLogouttimeBetween(Date value1, Date value2) {
            addCriterion("LOGOUTTIME between", value1, value2, "logouttime");
            return (Criteria) this;
        }

        public Criteria andLogouttimeNotBetween(Date value1, Date value2) {
            addCriterion("LOGOUTTIME not between", value1, value2, "logouttime");
            return (Criteria) this;
        }

        public Criteria andLivingtimeIsNull() {
            addCriterion("LIVINGTIME is null");
            return (Criteria) this;
        }

        public Criteria andLivingtimeIsNotNull() {
            addCriterion("LIVINGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLivingtimeEqualTo(Date value) {
            addCriterion("LIVINGTIME =", value, "livingtime");
            return (Criteria) this;
        }

        public Criteria andLivingtimeNotEqualTo(Date value) {
            addCriterion("LIVINGTIME <>", value, "livingtime");
            return (Criteria) this;
        }

        public Criteria andLivingtimeGreaterThan(Date value) {
            addCriterion("LIVINGTIME >", value, "livingtime");
            return (Criteria) this;
        }

        public Criteria andLivingtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LIVINGTIME >=", value, "livingtime");
            return (Criteria) this;
        }

        public Criteria andLivingtimeLessThan(Date value) {
            addCriterion("LIVINGTIME <", value, "livingtime");
            return (Criteria) this;
        }

        public Criteria andLivingtimeLessThanOrEqualTo(Date value) {
            addCriterion("LIVINGTIME <=", value, "livingtime");
            return (Criteria) this;
        }

        public Criteria andLivingtimeIn(List<Date> values) {
            addCriterion("LIVINGTIME in", values, "livingtime");
            return (Criteria) this;
        }

        public Criteria andLivingtimeNotIn(List<Date> values) {
            addCriterion("LIVINGTIME not in", values, "livingtime");
            return (Criteria) this;
        }

        public Criteria andLivingtimeBetween(Date value1, Date value2) {
            addCriterion("LIVINGTIME between", value1, value2, "livingtime");
            return (Criteria) this;
        }

        public Criteria andLivingtimeNotBetween(Date value1, Date value2) {
            addCriterion("LIVINGTIME not between", value1, value2, "livingtime");
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