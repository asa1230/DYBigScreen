package com.dayang.newmedia.newscommand.db.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskSettingsQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskSettingsQuery() {
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

        public Criteria andGuidIsNull() {
            addCriterion("guid is null");
            return (Criteria) this;
        }

        public Criteria andGuidIsNotNull() {
            addCriterion("guid is not null");
            return (Criteria) this;
        }

        public Criteria andGuidEqualTo(String value) {
            addCriterion("guid =", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotEqualTo(String value) {
            addCriterion("guid <>", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidGreaterThan(String value) {
            addCriterion("guid >", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidGreaterThanOrEqualTo(String value) {
            addCriterion("guid >=", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidLessThan(String value) {
            addCriterion("guid <", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidLessThanOrEqualTo(String value) {
            addCriterion("guid <=", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidLike(String value) {
            addCriterion("guid like", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotLike(String value) {
            addCriterion("guid not like", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidIn(List<String> values) {
            addCriterion("guid in", values, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotIn(List<String> values) {
            addCriterion("guid not in", values, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidBetween(String value1, String value2) {
            addCriterion("guid between", value1, value2, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotBetween(String value1, String value2) {
            addCriterion("guid not between", value1, value2, "guid");
            return (Criteria) this;
        }

        public Criteria andTaskguidIsNull() {
            addCriterion("TaskGuid is null");
            return (Criteria) this;
        }

        public Criteria andTaskguidIsNotNull() {
            addCriterion("TaskGuid is not null");
            return (Criteria) this;
        }

        public Criteria andTaskguidEqualTo(String value) {
            addCriterion("TaskGuid =", value, "taskguid");
            return (Criteria) this;
        }

        public Criteria andTaskguidNotEqualTo(String value) {
            addCriterion("TaskGuid <>", value, "taskguid");
            return (Criteria) this;
        }

        public Criteria andTaskguidGreaterThan(String value) {
            addCriterion("TaskGuid >", value, "taskguid");
            return (Criteria) this;
        }

        public Criteria andTaskguidGreaterThanOrEqualTo(String value) {
            addCriterion("TaskGuid >=", value, "taskguid");
            return (Criteria) this;
        }

        public Criteria andTaskguidLessThan(String value) {
            addCriterion("TaskGuid <", value, "taskguid");
            return (Criteria) this;
        }

        public Criteria andTaskguidLessThanOrEqualTo(String value) {
            addCriterion("TaskGuid <=", value, "taskguid");
            return (Criteria) this;
        }

        public Criteria andTaskguidLike(String value) {
            addCriterion("TaskGuid like", value, "taskguid");
            return (Criteria) this;
        }

        public Criteria andTaskguidNotLike(String value) {
            addCriterion("TaskGuid not like", value, "taskguid");
            return (Criteria) this;
        }

        public Criteria andTaskguidIn(List<String> values) {
            addCriterion("TaskGuid in", values, "taskguid");
            return (Criteria) this;
        }

        public Criteria andTaskguidNotIn(List<String> values) {
            addCriterion("TaskGuid not in", values, "taskguid");
            return (Criteria) this;
        }

        public Criteria andTaskguidBetween(String value1, String value2) {
            addCriterion("TaskGuid between", value1, value2, "taskguid");
            return (Criteria) this;
        }

        public Criteria andTaskguidNotBetween(String value1, String value2) {
            addCriterion("TaskGuid not between", value1, value2, "taskguid");
            return (Criteria) this;
        }

        public Criteria andMguidIsNull() {
            addCriterion("mguid is null");
            return (Criteria) this;
        }

        public Criteria andMguidIsNotNull() {
            addCriterion("mguid is not null");
            return (Criteria) this;
        }

        public Criteria andMguidEqualTo(String value) {
            addCriterion("mguid =", value, "mguid");
            return (Criteria) this;
        }

        public Criteria andMguidNotEqualTo(String value) {
            addCriterion("mguid <>", value, "mguid");
            return (Criteria) this;
        }

        public Criteria andMguidGreaterThan(String value) {
            addCriterion("mguid >", value, "mguid");
            return (Criteria) this;
        }

        public Criteria andMguidGreaterThanOrEqualTo(String value) {
            addCriterion("mguid >=", value, "mguid");
            return (Criteria) this;
        }

        public Criteria andMguidLessThan(String value) {
            addCriterion("mguid <", value, "mguid");
            return (Criteria) this;
        }

        public Criteria andMguidLessThanOrEqualTo(String value) {
            addCriterion("mguid <=", value, "mguid");
            return (Criteria) this;
        }

        public Criteria andMguidLike(String value) {
            addCriterion("mguid like", value, "mguid");
            return (Criteria) this;
        }

        public Criteria andMguidNotLike(String value) {
            addCriterion("mguid not like", value, "mguid");
            return (Criteria) this;
        }

        public Criteria andMguidIn(List<String> values) {
            addCriterion("mguid in", values, "mguid");
            return (Criteria) this;
        }

        public Criteria andMguidNotIn(List<String> values) {
            addCriterion("mguid not in", values, "mguid");
            return (Criteria) this;
        }

        public Criteria andMguidBetween(String value1, String value2) {
            addCriterion("mguid between", value1, value2, "mguid");
            return (Criteria) this;
        }

        public Criteria andMguidNotBetween(String value1, String value2) {
            addCriterion("mguid not between", value1, value2, "mguid");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CreateTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CreateTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CreateTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CreateTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CreateTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CreateTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CreateTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CreateTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CreateTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andTasktypeIsNull() {
            addCriterion("TaskType is null");
            return (Criteria) this;
        }

        public Criteria andTasktypeIsNotNull() {
            addCriterion("TaskType is not null");
            return (Criteria) this;
        }

        public Criteria andTasktypeEqualTo(Integer value) {
            addCriterion("TaskType =", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeNotEqualTo(Integer value) {
            addCriterion("TaskType <>", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeGreaterThan(Integer value) {
            addCriterion("TaskType >", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("TaskType >=", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeLessThan(Integer value) {
            addCriterion("TaskType <", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeLessThanOrEqualTo(Integer value) {
            addCriterion("TaskType <=", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeIn(List<Integer> values) {
            addCriterion("TaskType in", values, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeNotIn(List<Integer> values) {
            addCriterion("TaskType not in", values, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeBetween(Integer value1, Integer value2) {
            addCriterion("TaskType between", value1, value2, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeNotBetween(Integer value1, Integer value2) {
            addCriterion("TaskType not between", value1, value2, "tasktype");
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