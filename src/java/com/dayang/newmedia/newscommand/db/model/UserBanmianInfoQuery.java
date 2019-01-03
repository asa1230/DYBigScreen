package com.dayang.newmedia.newscommand.db.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserBanmianInfoQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserBanmianInfoQuery() {
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

        public Criteria andUbguidIsNull() {
            addCriterion("ubguid is null");
            return (Criteria) this;
        }

        public Criteria andUbguidIsNotNull() {
            addCriterion("ubguid is not null");
            return (Criteria) this;
        }

        public Criteria andUbguidEqualTo(String value) {
            addCriterion("ubguid =", value, "ubguid");
            return (Criteria) this;
        }

        public Criteria andUbguidNotEqualTo(String value) {
            addCriterion("ubguid <>", value, "ubguid");
            return (Criteria) this;
        }

        public Criteria andUbguidGreaterThan(String value) {
            addCriterion("ubguid >", value, "ubguid");
            return (Criteria) this;
        }

        public Criteria andUbguidGreaterThanOrEqualTo(String value) {
            addCriterion("ubguid >=", value, "ubguid");
            return (Criteria) this;
        }

        public Criteria andUbguidLessThan(String value) {
            addCriterion("ubguid <", value, "ubguid");
            return (Criteria) this;
        }

        public Criteria andUbguidLessThanOrEqualTo(String value) {
            addCriterion("ubguid <=", value, "ubguid");
            return (Criteria) this;
        }

        public Criteria andUbguidLike(String value) {
            addCriterion("ubguid like", value, "ubguid");
            return (Criteria) this;
        }

        public Criteria andUbguidNotLike(String value) {
            addCriterion("ubguid not like", value, "ubguid");
            return (Criteria) this;
        }

        public Criteria andUbguidIn(List<String> values) {
            addCriterion("ubguid in", values, "ubguid");
            return (Criteria) this;
        }

        public Criteria andUbguidNotIn(List<String> values) {
            addCriterion("ubguid not in", values, "ubguid");
            return (Criteria) this;
        }

        public Criteria andUbguidBetween(String value1, String value2) {
            addCriterion("ubguid between", value1, value2, "ubguid");
            return (Criteria) this;
        }

        public Criteria andUbguidNotBetween(String value1, String value2) {
            addCriterion("ubguid not between", value1, value2, "ubguid");
            return (Criteria) this;
        }

        public Criteria andUserguidIsNull() {
            addCriterion("userguid is null");
            return (Criteria) this;
        }

        public Criteria andUserguidIsNotNull() {
            addCriterion("userguid is not null");
            return (Criteria) this;
        }

        public Criteria andUserguidEqualTo(String value) {
            addCriterion("userguid =", value, "userguid");
            return (Criteria) this;
        }

        public Criteria andUserguidNotEqualTo(String value) {
            addCriterion("userguid <>", value, "userguid");
            return (Criteria) this;
        }

        public Criteria andUserguidGreaterThan(String value) {
            addCriterion("userguid >", value, "userguid");
            return (Criteria) this;
        }

        public Criteria andUserguidGreaterThanOrEqualTo(String value) {
            addCriterion("userguid >=", value, "userguid");
            return (Criteria) this;
        }

        public Criteria andUserguidLessThan(String value) {
            addCriterion("userguid <", value, "userguid");
            return (Criteria) this;
        }

        public Criteria andUserguidLessThanOrEqualTo(String value) {
            addCriterion("userguid <=", value, "userguid");
            return (Criteria) this;
        }

        public Criteria andUserguidLike(String value) {
            addCriterion("userguid like", value, "userguid");
            return (Criteria) this;
        }

        public Criteria andUserguidNotLike(String value) {
            addCriterion("userguid not like", value, "userguid");
            return (Criteria) this;
        }

        public Criteria andUserguidIn(List<String> values) {
            addCriterion("userguid in", values, "userguid");
            return (Criteria) this;
        }

        public Criteria andUserguidNotIn(List<String> values) {
            addCriterion("userguid not in", values, "userguid");
            return (Criteria) this;
        }

        public Criteria andUserguidBetween(String value1, String value2) {
            addCriterion("userguid between", value1, value2, "userguid");
            return (Criteria) this;
        }

        public Criteria andUserguidNotBetween(String value1, String value2) {
            addCriterion("userguid not between", value1, value2, "userguid");
            return (Criteria) this;
        }

        public Criteria andUguidIsNull() {
            addCriterion("uguid is null");
            return (Criteria) this;
        }

        public Criteria andUguidIsNotNull() {
            addCriterion("uguid is not null");
            return (Criteria) this;
        }

        public Criteria andUguidEqualTo(String value) {
            addCriterion("uguid =", value, "uguid");
            return (Criteria) this;
        }

        public Criteria andUguidNotEqualTo(String value) {
            addCriterion("uguid <>", value, "uguid");
            return (Criteria) this;
        }

        public Criteria andUguidGreaterThan(String value) {
            addCriterion("uguid >", value, "uguid");
            return (Criteria) this;
        }

        public Criteria andUguidGreaterThanOrEqualTo(String value) {
            addCriterion("uguid >=", value, "uguid");
            return (Criteria) this;
        }

        public Criteria andUguidLessThan(String value) {
            addCriterion("uguid <", value, "uguid");
            return (Criteria) this;
        }

        public Criteria andUguidLessThanOrEqualTo(String value) {
            addCriterion("uguid <=", value, "uguid");
            return (Criteria) this;
        }

        public Criteria andUguidLike(String value) {
            addCriterion("uguid like", value, "uguid");
            return (Criteria) this;
        }

        public Criteria andUguidNotLike(String value) {
            addCriterion("uguid not like", value, "uguid");
            return (Criteria) this;
        }

        public Criteria andUguidIn(List<String> values) {
            addCriterion("uguid in", values, "uguid");
            return (Criteria) this;
        }

        public Criteria andUguidNotIn(List<String> values) {
            addCriterion("uguid not in", values, "uguid");
            return (Criteria) this;
        }

        public Criteria andUguidBetween(String value1, String value2) {
            addCriterion("uguid between", value1, value2, "uguid");
            return (Criteria) this;
        }

        public Criteria andUguidNotBetween(String value1, String value2) {
            addCriterion("uguid not between", value1, value2, "uguid");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("addtime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addtime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterion("addtime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterion("addtime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterion("addtime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("addtime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("addtime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterion("addtime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterion("addtime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterion("addtime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("addtime not between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andBguidIsNull() {
            addCriterion("BGUID is null");
            return (Criteria) this;
        }

        public Criteria andBguidIsNotNull() {
            addCriterion("BGUID is not null");
            return (Criteria) this;
        }

        public Criteria andBguidEqualTo(String value) {
            addCriterion("BGUID =", value, "bguid");
            return (Criteria) this;
        }

        public Criteria andBguidNotEqualTo(String value) {
            addCriterion("BGUID <>", value, "bguid");
            return (Criteria) this;
        }

        public Criteria andBguidGreaterThan(String value) {
            addCriterion("BGUID >", value, "bguid");
            return (Criteria) this;
        }

        public Criteria andBguidGreaterThanOrEqualTo(String value) {
            addCriterion("BGUID >=", value, "bguid");
            return (Criteria) this;
        }

        public Criteria andBguidLessThan(String value) {
            addCriterion("BGUID <", value, "bguid");
            return (Criteria) this;
        }

        public Criteria andBguidLessThanOrEqualTo(String value) {
            addCriterion("BGUID <=", value, "bguid");
            return (Criteria) this;
        }

        public Criteria andBguidLike(String value) {
            addCriterion("BGUID like", value, "bguid");
            return (Criteria) this;
        }

        public Criteria andBguidNotLike(String value) {
            addCriterion("BGUID not like", value, "bguid");
            return (Criteria) this;
        }

        public Criteria andBguidIn(List<String> values) {
            addCriterion("BGUID in", values, "bguid");
            return (Criteria) this;
        }

        public Criteria andBguidNotIn(List<String> values) {
            addCriterion("BGUID not in", values, "bguid");
            return (Criteria) this;
        }

        public Criteria andBguidBetween(String value1, String value2) {
            addCriterion("BGUID between", value1, value2, "bguid");
            return (Criteria) this;
        }

        public Criteria andBguidNotBetween(String value1, String value2) {
            addCriterion("BGUID not between", value1, value2, "bguid");
            return (Criteria) this;
        }

        public Criteria andBnameIsNull() {
            addCriterion("BNAME is null");
            return (Criteria) this;
        }

        public Criteria andBnameIsNotNull() {
            addCriterion("BNAME is not null");
            return (Criteria) this;
        }

        public Criteria andBnameEqualTo(String value) {
            addCriterion("BNAME =", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotEqualTo(String value) {
            addCriterion("BNAME <>", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameGreaterThan(String value) {
            addCriterion("BNAME >", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameGreaterThanOrEqualTo(String value) {
            addCriterion("BNAME >=", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLessThan(String value) {
            addCriterion("BNAME <", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLessThanOrEqualTo(String value) {
            addCriterion("BNAME <=", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLike(String value) {
            addCriterion("BNAME like", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotLike(String value) {
            addCriterion("BNAME not like", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameIn(List<String> values) {
            addCriterion("BNAME in", values, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotIn(List<String> values) {
            addCriterion("BNAME not in", values, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameBetween(String value1, String value2) {
            addCriterion("BNAME between", value1, value2, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotBetween(String value1, String value2) {
            addCriterion("BNAME not between", value1, value2, "bname");
            return (Criteria) this;
        }

        public Criteria andBtypeIsNull() {
            addCriterion("btype is null");
            return (Criteria) this;
        }

        public Criteria andBtypeIsNotNull() {
            addCriterion("btype is not null");
            return (Criteria) this;
        }

        public Criteria andBtypeEqualTo(String value) {
            addCriterion("btype =", value, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeNotEqualTo(String value) {
            addCriterion("btype <>", value, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeGreaterThan(String value) {
            addCriterion("btype >", value, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeGreaterThanOrEqualTo(String value) {
            addCriterion("btype >=", value, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeLessThan(String value) {
            addCriterion("btype <", value, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeLessThanOrEqualTo(String value) {
            addCriterion("btype <=", value, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeLike(String value) {
            addCriterion("btype like", value, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeNotLike(String value) {
            addCriterion("btype not like", value, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeIn(List<String> values) {
            addCriterion("btype in", values, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeNotIn(List<String> values) {
            addCriterion("btype not in", values, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeBetween(String value1, String value2) {
            addCriterion("btype between", value1, value2, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeNotBetween(String value1, String value2) {
            addCriterion("btype not between", value1, value2, "btype");
            return (Criteria) this;
        }

        public Criteria andColumnguidIsNull() {
            addCriterion("COLUMNGUID is null");
            return (Criteria) this;
        }

        public Criteria andColumnguidIsNotNull() {
            addCriterion("COLUMNGUID is not null");
            return (Criteria) this;
        }

        public Criteria andColumnguidEqualTo(String value) {
            addCriterion("COLUMNGUID =", value, "columnguid");
            return (Criteria) this;
        }

        public Criteria andColumnguidNotEqualTo(String value) {
            addCriterion("COLUMNGUID <>", value, "columnguid");
            return (Criteria) this;
        }

        public Criteria andColumnguidGreaterThan(String value) {
            addCriterion("COLUMNGUID >", value, "columnguid");
            return (Criteria) this;
        }

        public Criteria andColumnguidGreaterThanOrEqualTo(String value) {
            addCriterion("COLUMNGUID >=", value, "columnguid");
            return (Criteria) this;
        }

        public Criteria andColumnguidLessThan(String value) {
            addCriterion("COLUMNGUID <", value, "columnguid");
            return (Criteria) this;
        }

        public Criteria andColumnguidLessThanOrEqualTo(String value) {
            addCriterion("COLUMNGUID <=", value, "columnguid");
            return (Criteria) this;
        }

        public Criteria andColumnguidLike(String value) {
            addCriterion("COLUMNGUID like", value, "columnguid");
            return (Criteria) this;
        }

        public Criteria andColumnguidNotLike(String value) {
            addCriterion("COLUMNGUID not like", value, "columnguid");
            return (Criteria) this;
        }

        public Criteria andColumnguidIn(List<String> values) {
            addCriterion("COLUMNGUID in", values, "columnguid");
            return (Criteria) this;
        }

        public Criteria andColumnguidNotIn(List<String> values) {
            addCriterion("COLUMNGUID not in", values, "columnguid");
            return (Criteria) this;
        }

        public Criteria andColumnguidBetween(String value1, String value2) {
            addCriterion("COLUMNGUID between", value1, value2, "columnguid");
            return (Criteria) this;
        }

        public Criteria andColumnguidNotBetween(String value1, String value2) {
            addCriterion("COLUMNGUID not between", value1, value2, "columnguid");
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