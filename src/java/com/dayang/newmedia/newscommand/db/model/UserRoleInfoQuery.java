package com.dayang.newmedia.newscommand.db.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserRoleInfoQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserRoleInfoQuery() {
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

        public Criteria andUserroleguidIsNull() {
            addCriterion("userroleguid is null");
            return (Criteria) this;
        }

        public Criteria andUserroleguidIsNotNull() {
            addCriterion("userroleguid is not null");
            return (Criteria) this;
        }

        public Criteria andUserroleguidEqualTo(String value) {
            addCriterion("userroleguid =", value, "userroleguid");
            return (Criteria) this;
        }

        public Criteria andUserroleguidNotEqualTo(String value) {
            addCriterion("userroleguid <>", value, "userroleguid");
            return (Criteria) this;
        }

        public Criteria andUserroleguidGreaterThan(String value) {
            addCriterion("userroleguid >", value, "userroleguid");
            return (Criteria) this;
        }

        public Criteria andUserroleguidGreaterThanOrEqualTo(String value) {
            addCriterion("userroleguid >=", value, "userroleguid");
            return (Criteria) this;
        }

        public Criteria andUserroleguidLessThan(String value) {
            addCriterion("userroleguid <", value, "userroleguid");
            return (Criteria) this;
        }

        public Criteria andUserroleguidLessThanOrEqualTo(String value) {
            addCriterion("userroleguid <=", value, "userroleguid");
            return (Criteria) this;
        }

        public Criteria andUserroleguidLike(String value) {
            addCriterion("userroleguid like", value, "userroleguid");
            return (Criteria) this;
        }

        public Criteria andUserroleguidNotLike(String value) {
            addCriterion("userroleguid not like", value, "userroleguid");
            return (Criteria) this;
        }

        public Criteria andUserroleguidIn(List<String> values) {
            addCriterion("userroleguid in", values, "userroleguid");
            return (Criteria) this;
        }

        public Criteria andUserroleguidNotIn(List<String> values) {
            addCriterion("userroleguid not in", values, "userroleguid");
            return (Criteria) this;
        }

        public Criteria andUserroleguidBetween(String value1, String value2) {
            addCriterion("userroleguid between", value1, value2, "userroleguid");
            return (Criteria) this;
        }

        public Criteria andUserroleguidNotBetween(String value1, String value2) {
            addCriterion("userroleguid not between", value1, value2, "userroleguid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
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

        public Criteria andRoleguidIsNull() {
            addCriterion("roleguid is null");
            return (Criteria) this;
        }

        public Criteria andRoleguidIsNotNull() {
            addCriterion("roleguid is not null");
            return (Criteria) this;
        }

        public Criteria andRoleguidEqualTo(String value) {
            addCriterion("roleguid =", value, "roleguid");
            return (Criteria) this;
        }

        public Criteria andRoleguidNotEqualTo(String value) {
            addCriterion("roleguid <>", value, "roleguid");
            return (Criteria) this;
        }

        public Criteria andRoleguidGreaterThan(String value) {
            addCriterion("roleguid >", value, "roleguid");
            return (Criteria) this;
        }

        public Criteria andRoleguidGreaterThanOrEqualTo(String value) {
            addCriterion("roleguid >=", value, "roleguid");
            return (Criteria) this;
        }

        public Criteria andRoleguidLessThan(String value) {
            addCriterion("roleguid <", value, "roleguid");
            return (Criteria) this;
        }

        public Criteria andRoleguidLessThanOrEqualTo(String value) {
            addCriterion("roleguid <=", value, "roleguid");
            return (Criteria) this;
        }

        public Criteria andRoleguidLike(String value) {
            addCriterion("roleguid like", value, "roleguid");
            return (Criteria) this;
        }

        public Criteria andRoleguidNotLike(String value) {
            addCriterion("roleguid not like", value, "roleguid");
            return (Criteria) this;
        }

        public Criteria andRoleguidIn(List<String> values) {
            addCriterion("roleguid in", values, "roleguid");
            return (Criteria) this;
        }

        public Criteria andRoleguidNotIn(List<String> values) {
            addCriterion("roleguid not in", values, "roleguid");
            return (Criteria) this;
        }

        public Criteria andRoleguidBetween(String value1, String value2) {
            addCriterion("roleguid between", value1, value2, "roleguid");
            return (Criteria) this;
        }

        public Criteria andRoleguidNotBetween(String value1, String value2) {
            addCriterion("roleguid not between", value1, value2, "roleguid");
            return (Criteria) this;
        }

        public Criteria andCanuseIsNull() {
            addCriterion("canuse is null");
            return (Criteria) this;
        }

        public Criteria andCanuseIsNotNull() {
            addCriterion("canuse is not null");
            return (Criteria) this;
        }

        public Criteria andCanuseEqualTo(Integer value) {
            addCriterion("canuse =", value, "canuse");
            return (Criteria) this;
        }

        public Criteria andCanuseNotEqualTo(Integer value) {
            addCriterion("canuse <>", value, "canuse");
            return (Criteria) this;
        }

        public Criteria andCanuseGreaterThan(Integer value) {
            addCriterion("canuse >", value, "canuse");
            return (Criteria) this;
        }

        public Criteria andCanuseGreaterThanOrEqualTo(Integer value) {
            addCriterion("canuse >=", value, "canuse");
            return (Criteria) this;
        }

        public Criteria andCanuseLessThan(Integer value) {
            addCriterion("canuse <", value, "canuse");
            return (Criteria) this;
        }

        public Criteria andCanuseLessThanOrEqualTo(Integer value) {
            addCriterion("canuse <=", value, "canuse");
            return (Criteria) this;
        }

        public Criteria andCanuseIn(List<Integer> values) {
            addCriterion("canuse in", values, "canuse");
            return (Criteria) this;
        }

        public Criteria andCanuseNotIn(List<Integer> values) {
            addCriterion("canuse not in", values, "canuse");
            return (Criteria) this;
        }

        public Criteria andCanuseBetween(Integer value1, Integer value2) {
            addCriterion("canuse between", value1, value2, "canuse");
            return (Criteria) this;
        }

        public Criteria andCanuseNotBetween(Integer value1, Integer value2) {
            addCriterion("canuse not between", value1, value2, "canuse");
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