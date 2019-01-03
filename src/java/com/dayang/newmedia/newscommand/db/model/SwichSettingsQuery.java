package com.dayang.newmedia.newscommand.db.model;

import java.util.ArrayList;
import java.util.List;

public class SwichSettingsQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SwichSettingsQuery() {
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

        public Criteria andSwichguidIsNull() {
            addCriterion("SWICHGUID is null");
            return (Criteria) this;
        }

        public Criteria andSwichguidIsNotNull() {
            addCriterion("SWICHGUID is not null");
            return (Criteria) this;
        }

        public Criteria andSwichguidEqualTo(String value) {
            addCriterion("SWICHGUID =", value, "swichguid");
            return (Criteria) this;
        }

        public Criteria andSwichguidNotEqualTo(String value) {
            addCriterion("SWICHGUID <>", value, "swichguid");
            return (Criteria) this;
        }

        public Criteria andSwichguidGreaterThan(String value) {
            addCriterion("SWICHGUID >", value, "swichguid");
            return (Criteria) this;
        }

        public Criteria andSwichguidGreaterThanOrEqualTo(String value) {
            addCriterion("SWICHGUID >=", value, "swichguid");
            return (Criteria) this;
        }

        public Criteria andSwichguidLessThan(String value) {
            addCriterion("SWICHGUID <", value, "swichguid");
            return (Criteria) this;
        }

        public Criteria andSwichguidLessThanOrEqualTo(String value) {
            addCriterion("SWICHGUID <=", value, "swichguid");
            return (Criteria) this;
        }

        public Criteria andSwichguidIn(List<String> values) {
            addCriterion("SWICHGUID in", values, "swichguid");
            return (Criteria) this;
        }

        public Criteria andSwichguidNotIn(List<String> values) {
            addCriterion("SWICHGUID not in", values, "swichguid");
            return (Criteria) this;
        }

        public Criteria andSwichguidBetween(String value1, String value2) {
            addCriterion("SWICHGUID between", value1, value2, "swichguid");
            return (Criteria) this;
        }

        public Criteria andSwichguidNotBetween(String value1, String value2) {
            addCriterion("SWICHGUID not between", value1, value2, "swichguid");
            return (Criteria) this;
        }

        public Criteria andSwichnameIsNull() {
            addCriterion("SWICHNAME is null");
            return (Criteria) this;
        }

        public Criteria andSwichnameIsNotNull() {
            addCriterion("SWICHNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSwichnameEqualTo(String value) {
            addCriterion("SWICHNAME =", value, "swichname");
            return (Criteria) this;
        }

        public Criteria andSwichnameNotEqualTo(String value) {
            addCriterion("SWICHNAME <>", value, "swichname");
            return (Criteria) this;
        }

        public Criteria andSwichnameGreaterThan(String value) {
            addCriterion("SWICHNAME >", value, "swichname");
            return (Criteria) this;
        }

        public Criteria andSwichnameGreaterThanOrEqualTo(String value) {
            addCriterion("SWICHNAME >=", value, "swichname");
            return (Criteria) this;
        }

        public Criteria andSwichnameLessThan(String value) {
            addCriterion("SWICHNAME <", value, "swichname");
            return (Criteria) this;
        }

        public Criteria andSwichnameLessThanOrEqualTo(String value) {
            addCriterion("SWICHNAME <=", value, "swichname");
            return (Criteria) this;
        }

        public Criteria andSwichnameIn(List<String> values) {
            addCriterion("SWICHNAME in", values, "swichname");
            return (Criteria) this;
        }

        public Criteria andSwichnameNotIn(List<String> values) {
            addCriterion("SWICHNAME not in", values, "swichname");
            return (Criteria) this;
        }

        public Criteria andSwichnameBetween(String value1, String value2) {
            addCriterion("SWICHNAME between", value1, value2, "swichname");
            return (Criteria) this;
        }

        public Criteria andSwichnameNotBetween(String value1, String value2) {
            addCriterion("SWICHNAME not between", value1, value2, "swichname");
            return (Criteria) this;
        }

        public Criteria andSwichvalueIsNull() {
            addCriterion("SWICHVALUE is null");
            return (Criteria) this;
        }

        public Criteria andSwichvalueIsNotNull() {
            addCriterion("SWICHVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andSwichvalueEqualTo(Integer value) {
            addCriterion("SWICHVALUE =", value, "swichvalue");
            return (Criteria) this;
        }

        public Criteria andSwichvalueNotEqualTo(Integer value) {
            addCriterion("SWICHVALUE <>", value, "swichvalue");
            return (Criteria) this;
        }

        public Criteria andSwichvalueGreaterThan(Integer value) {
            addCriterion("SWICHVALUE >", value, "swichvalue");
            return (Criteria) this;
        }

        public Criteria andSwichvalueGreaterThanOrEqualTo(Integer value) {
            addCriterion("SWICHVALUE >=", value, "swichvalue");
            return (Criteria) this;
        }

        public Criteria andSwichvalueLessThan(Integer value) {
            addCriterion("SWICHVALUE <", value, "swichvalue");
            return (Criteria) this;
        }

        public Criteria andSwichvalueLessThanOrEqualTo(Integer value) {
            addCriterion("SWICHVALUE <=", value, "swichvalue");
            return (Criteria) this;
        }

        public Criteria andSwichvalueIn(List<Integer> values) {
            addCriterion("SWICHVALUE in", values, "swichvalue");
            return (Criteria) this;
        }

        public Criteria andSwichvalueNotIn(List<Integer> values) {
            addCriterion("SWICHVALUE not in", values, "swichvalue");
            return (Criteria) this;
        }

        public Criteria andSwichvalueBetween(Integer value1, Integer value2) {
            addCriterion("SWICHVALUE between", value1, value2, "swichvalue");
            return (Criteria) this;
        }

        public Criteria andSwichvalueNotBetween(Integer value1, Integer value2) {
            addCriterion("SWICHVALUE not between", value1, value2, "swichvalue");
            return (Criteria) this;
        }

        public Criteria andSwichtypeIsNull() {
            addCriterion("SWICHTYPE is null");
            return (Criteria) this;
        }

        public Criteria andSwichtypeIsNotNull() {
            addCriterion("SWICHTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSwichtypeEqualTo(Integer value) {
            addCriterion("SWICHTYPE =", value, "swichtype");
            return (Criteria) this;
        }

        public Criteria andSwichtypeNotEqualTo(Integer value) {
            addCriterion("SWICHTYPE <>", value, "swichtype");
            return (Criteria) this;
        }

        public Criteria andSwichtypeGreaterThan(Integer value) {
            addCriterion("SWICHTYPE >", value, "swichtype");
            return (Criteria) this;
        }

        public Criteria andSwichtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("SWICHTYPE >=", value, "swichtype");
            return (Criteria) this;
        }

        public Criteria andSwichtypeLessThan(Integer value) {
            addCriterion("SWICHTYPE <", value, "swichtype");
            return (Criteria) this;
        }

        public Criteria andSwichtypeLessThanOrEqualTo(Integer value) {
            addCriterion("SWICHTYPE <=", value, "swichtype");
            return (Criteria) this;
        }

        public Criteria andSwichtypeIn(List<Integer> values) {
            addCriterion("SWICHTYPE in", values, "swichtype");
            return (Criteria) this;
        }

        public Criteria andSwichtypeNotIn(List<Integer> values) {
            addCriterion("SWICHTYPE not in", values, "swichtype");
            return (Criteria) this;
        }

        public Criteria andSwichtypeBetween(Integer value1, Integer value2) {
            addCriterion("SWICHTYPE between", value1, value2, "swichtype");
            return (Criteria) this;
        }

        public Criteria andSwichtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("SWICHTYPE not between", value1, value2, "swichtype");
            return (Criteria) this;
        }

        public Criteria andSwichparamIsNull() {
            addCriterion("SWICHPARAM is null");
            return (Criteria) this;
        }

        public Criteria andSwichparamIsNotNull() {
            addCriterion("SWICHPARAM is not null");
            return (Criteria) this;
        }

        public Criteria andSwichparamEqualTo(String value) {
            addCriterion("SWICHPARAM =", value, "swichparam");
            return (Criteria) this;
        }

        public Criteria andSwichparamNotEqualTo(String value) {
            addCriterion("SWICHPARAM <>", value, "swichparam");
            return (Criteria) this;
        }

        public Criteria andSwichparamGreaterThan(String value) {
            addCriterion("SWICHPARAM >", value, "swichparam");
            return (Criteria) this;
        }

        public Criteria andSwichparamGreaterThanOrEqualTo(String value) {
            addCriterion("SWICHPARAM >=", value, "swichparam");
            return (Criteria) this;
        }

        public Criteria andSwichparamLessThan(String value) {
            addCriterion("SWICHPARAM <", value, "swichparam");
            return (Criteria) this;
        }

        public Criteria andSwichparamLessThanOrEqualTo(String value) {
            addCriterion("SWICHPARAM <=", value, "swichparam");
            return (Criteria) this;
        }

        public Criteria andSwichparamLike(String value) {
            addCriterion("SWICHPARAM like", value, "swichparam");
            return (Criteria) this;
        }

        public Criteria andSwichparamNotLike(String value) {
            addCriterion("SWICHPARAM not like", value, "swichparam");
            return (Criteria) this;
        }

        public Criteria andSwichparamIn(List<String> values) {
            addCriterion("SWICHPARAM in", values, "swichparam");
            return (Criteria) this;
        }

        public Criteria andSwichparamNotIn(List<String> values) {
            addCriterion("SWICHPARAM not in", values, "swichparam");
            return (Criteria) this;
        }

        public Criteria andSwichparamBetween(String value1, String value2) {
            addCriterion("SWICHPARAM between", value1, value2, "swichparam");
            return (Criteria) this;
        }

        public Criteria andSwichparamNotBetween(String value1, String value2) {
            addCriterion("SWICHPARAM not between", value1, value2, "swichparam");
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