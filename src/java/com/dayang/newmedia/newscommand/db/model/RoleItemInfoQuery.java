package com.dayang.newmedia.newscommand.db.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoleItemInfoQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoleItemInfoQuery() {
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

        public Criteria andRoleitemguidIsNull() {
            addCriterion("roleitemguid is null");
            return (Criteria) this;
        }

        public Criteria andRoleitemguidIsNotNull() {
            addCriterion("roleitemguid is not null");
            return (Criteria) this;
        }

        public Criteria andRoleitemguidEqualTo(String value) {
            addCriterion("roleitemguid =", value, "roleitemguid");
            return (Criteria) this;
        }

        public Criteria andRoleitemguidNotEqualTo(String value) {
            addCriterion("roleitemguid <>", value, "roleitemguid");
            return (Criteria) this;
        }

        public Criteria andRoleitemguidGreaterThan(String value) {
            addCriterion("roleitemguid >", value, "roleitemguid");
            return (Criteria) this;
        }

        public Criteria andRoleitemguidGreaterThanOrEqualTo(String value) {
            addCriterion("roleitemguid >=", value, "roleitemguid");
            return (Criteria) this;
        }

        public Criteria andRoleitemguidLessThan(String value) {
            addCriterion("roleitemguid <", value, "roleitemguid");
            return (Criteria) this;
        }

        public Criteria andRoleitemguidLessThanOrEqualTo(String value) {
            addCriterion("roleitemguid <=", value, "roleitemguid");
            return (Criteria) this;
        }

        public Criteria andRoleitemguidLike(String value) {
            addCriterion("roleitemguid like", value, "roleitemguid");
            return (Criteria) this;
        }

        public Criteria andRoleitemguidNotLike(String value) {
            addCriterion("roleitemguid not like", value, "roleitemguid");
            return (Criteria) this;
        }

        public Criteria andRoleitemguidIn(List<String> values) {
            addCriterion("roleitemguid in", values, "roleitemguid");
            return (Criteria) this;
        }

        public Criteria andRoleitemguidNotIn(List<String> values) {
            addCriterion("roleitemguid not in", values, "roleitemguid");
            return (Criteria) this;
        }

        public Criteria andRoleitemguidBetween(String value1, String value2) {
            addCriterion("roleitemguid between", value1, value2, "roleitemguid");
            return (Criteria) this;
        }

        public Criteria andRoleitemguidNotBetween(String value1, String value2) {
            addCriterion("roleitemguid not between", value1, value2, "roleitemguid");
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

        public Criteria andItemguidIsNull() {
            addCriterion("itemguid is null");
            return (Criteria) this;
        }

        public Criteria andItemguidIsNotNull() {
            addCriterion("itemguid is not null");
            return (Criteria) this;
        }

        public Criteria andItemguidEqualTo(String value) {
            addCriterion("itemguid =", value, "itemguid");
            return (Criteria) this;
        }

        public Criteria andItemguidNotEqualTo(String value) {
            addCriterion("itemguid <>", value, "itemguid");
            return (Criteria) this;
        }

        public Criteria andItemguidGreaterThan(String value) {
            addCriterion("itemguid >", value, "itemguid");
            return (Criteria) this;
        }

        public Criteria andItemguidGreaterThanOrEqualTo(String value) {
            addCriterion("itemguid >=", value, "itemguid");
            return (Criteria) this;
        }

        public Criteria andItemguidLessThan(String value) {
            addCriterion("itemguid <", value, "itemguid");
            return (Criteria) this;
        }

        public Criteria andItemguidLessThanOrEqualTo(String value) {
            addCriterion("itemguid <=", value, "itemguid");
            return (Criteria) this;
        }

        public Criteria andItemguidLike(String value) {
            addCriterion("itemguid like", value, "itemguid");
            return (Criteria) this;
        }

        public Criteria andItemguidNotLike(String value) {
            addCriterion("itemguid not like", value, "itemguid");
            return (Criteria) this;
        }

        public Criteria andItemguidIn(List<String> values) {
            addCriterion("itemguid in", values, "itemguid");
            return (Criteria) this;
        }

        public Criteria andItemguidNotIn(List<String> values) {
            addCriterion("itemguid not in", values, "itemguid");
            return (Criteria) this;
        }

        public Criteria andItemguidBetween(String value1, String value2) {
            addCriterion("itemguid between", value1, value2, "itemguid");
            return (Criteria) this;
        }

        public Criteria andItemguidNotBetween(String value1, String value2) {
            addCriterion("itemguid not between", value1, value2, "itemguid");
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