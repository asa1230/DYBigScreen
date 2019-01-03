package com.dayang.newmedia.newscommand.db.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomSettingsQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomSettingsQuery() {
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

        public Criteria andCuguidIsNull() {
            addCriterion("cuguid is null");
            return (Criteria) this;
        }

        public Criteria andCuguidIsNotNull() {
            addCriterion("cuguid is not null");
            return (Criteria) this;
        }

        public Criteria andCuguidEqualTo(String value) {
            addCriterion("cuguid =", value, "cuguid");
            return (Criteria) this;
        }

        public Criteria andCuguidNotEqualTo(String value) {
            addCriterion("cuguid <>", value, "cuguid");
            return (Criteria) this;
        }

        public Criteria andCuguidGreaterThan(String value) {
            addCriterion("cuguid >", value, "cuguid");
            return (Criteria) this;
        }

        public Criteria andCuguidGreaterThanOrEqualTo(String value) {
            addCriterion("cuguid >=", value, "cuguid");
            return (Criteria) this;
        }

        public Criteria andCuguidLessThan(String value) {
            addCriterion("cuguid <", value, "cuguid");
            return (Criteria) this;
        }

        public Criteria andCuguidLessThanOrEqualTo(String value) {
            addCriterion("cuguid <=", value, "cuguid");
            return (Criteria) this;
        }

        public Criteria andCuguidLike(String value) {
            addCriterion("cuguid like", value, "cuguid");
            return (Criteria) this;
        }

        public Criteria andCuguidNotLike(String value) {
            addCriterion("cuguid not like", value, "cuguid");
            return (Criteria) this;
        }

        public Criteria andCuguidIn(List<String> values) {
            addCriterion("cuguid in", values, "cuguid");
            return (Criteria) this;
        }

        public Criteria andCuguidNotIn(List<String> values) {
            addCriterion("cuguid not in", values, "cuguid");
            return (Criteria) this;
        }

        public Criteria andCuguidBetween(String value1, String value2) {
            addCriterion("cuguid between", value1, value2, "cuguid");
            return (Criteria) this;
        }

        public Criteria andCuguidNotBetween(String value1, String value2) {
            addCriterion("cuguid not between", value1, value2, "cuguid");
            return (Criteria) this;
        }

        public Criteria andCutypeIsNull() {
            addCriterion("cutype is null");
            return (Criteria) this;
        }

        public Criteria andCutypeIsNotNull() {
            addCriterion("cutype is not null");
            return (Criteria) this;
        }

        public Criteria andCutypeEqualTo(String value) {
            addCriterion("cutype =", value, "cutype");
            return (Criteria) this;
        }

        public Criteria andCutypeNotEqualTo(String value) {
            addCriterion("cutype <>", value, "cutype");
            return (Criteria) this;
        }

        public Criteria andCutypeGreaterThan(String value) {
            addCriterion("cutype >", value, "cutype");
            return (Criteria) this;
        }

        public Criteria andCutypeGreaterThanOrEqualTo(String value) {
            addCriterion("cutype >=", value, "cutype");
            return (Criteria) this;
        }

        public Criteria andCutypeLessThan(String value) {
            addCriterion("cutype <", value, "cutype");
            return (Criteria) this;
        }

        public Criteria andCutypeLessThanOrEqualTo(String value) {
            addCriterion("cutype <=", value, "cutype");
            return (Criteria) this;
        }

        public Criteria andCutypeLike(String value) {
            addCriterion("cutype like", value, "cutype");
            return (Criteria) this;
        }

        public Criteria andCutypeNotLike(String value) {
            addCriterion("cutype not like", value, "cutype");
            return (Criteria) this;
        }

        public Criteria andCutypeIn(List<String> values) {
            addCriterion("cutype in", values, "cutype");
            return (Criteria) this;
        }

        public Criteria andCutypeNotIn(List<String> values) {
            addCriterion("cutype not in", values, "cutype");
            return (Criteria) this;
        }

        public Criteria andCutypeBetween(String value1, String value2) {
            addCriterion("cutype between", value1, value2, "cutype");
            return (Criteria) this;
        }

        public Criteria andCutypeNotBetween(String value1, String value2) {
            addCriterion("cutype not between", value1, value2, "cutype");
            return (Criteria) this;
        }

        public Criteria andCuvalueIsNull() {
            addCriterion("cuvalue is null");
            return (Criteria) this;
        }

        public Criteria andCuvalueIsNotNull() {
            addCriterion("cuvalue is not null");
            return (Criteria) this;
        }

        public Criteria andCuvalueEqualTo(String value) {
            addCriterion("cuvalue =", value, "cuvalue");
            return (Criteria) this;
        }

        public Criteria andCuvalueNotEqualTo(String value) {
            addCriterion("cuvalue <>", value, "cuvalue");
            return (Criteria) this;
        }

        public Criteria andCuvalueGreaterThan(String value) {
            addCriterion("cuvalue >", value, "cuvalue");
            return (Criteria) this;
        }

        public Criteria andCuvalueGreaterThanOrEqualTo(String value) {
            addCriterion("cuvalue >=", value, "cuvalue");
            return (Criteria) this;
        }

        public Criteria andCuvalueLessThan(String value) {
            addCriterion("cuvalue <", value, "cuvalue");
            return (Criteria) this;
        }

        public Criteria andCuvalueLessThanOrEqualTo(String value) {
            addCriterion("cuvalue <=", value, "cuvalue");
            return (Criteria) this;
        }

        public Criteria andCuvalueLike(String value) {
            addCriterion("cuvalue like", value, "cuvalue");
            return (Criteria) this;
        }

        public Criteria andCuvalueNotLike(String value) {
            addCriterion("cuvalue not like", value, "cuvalue");
            return (Criteria) this;
        }

        public Criteria andCuvalueIn(List<String> values) {
            addCriterion("cuvalue in", values, "cuvalue");
            return (Criteria) this;
        }

        public Criteria andCuvalueNotIn(List<String> values) {
            addCriterion("cuvalue not in", values, "cuvalue");
            return (Criteria) this;
        }

        public Criteria andCuvalueBetween(String value1, String value2) {
            addCriterion("cuvalue between", value1, value2, "cuvalue");
            return (Criteria) this;
        }

        public Criteria andCuvalueNotBetween(String value1, String value2) {
            addCriterion("cuvalue not between", value1, value2, "cuvalue");
            return (Criteria) this;
        }

        public Criteria andCunameIsNull() {
            addCriterion("cuname is null");
            return (Criteria) this;
        }

        public Criteria andCunameIsNotNull() {
            addCriterion("cuname is not null");
            return (Criteria) this;
        }

        public Criteria andCunameEqualTo(String value) {
            addCriterion("cuname =", value, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameNotEqualTo(String value) {
            addCriterion("cuname <>", value, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameGreaterThan(String value) {
            addCriterion("cuname >", value, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameGreaterThanOrEqualTo(String value) {
            addCriterion("cuname >=", value, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameLessThan(String value) {
            addCriterion("cuname <", value, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameLessThanOrEqualTo(String value) {
            addCriterion("cuname <=", value, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameLike(String value) {
            addCriterion("cuname like", value, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameNotLike(String value) {
            addCriterion("cuname not like", value, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameIn(List<String> values) {
            addCriterion("cuname in", values, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameNotIn(List<String> values) {
            addCriterion("cuname not in", values, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameBetween(String value1, String value2) {
            addCriterion("cuname between", value1, value2, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameNotBetween(String value1, String value2) {
            addCriterion("cuname not between", value1, value2, "cuname");
            return (Criteria) this;
        }

        public Criteria andCutimeIsNull() {
            addCriterion("cutime is null");
            return (Criteria) this;
        }

        public Criteria andCutimeIsNotNull() {
            addCriterion("cutime is not null");
            return (Criteria) this;
        }

        public Criteria andCutimeEqualTo(Date value) {
            addCriterion("cutime =", value, "cutime");
            return (Criteria) this;
        }

        public Criteria andCutimeNotEqualTo(Date value) {
            addCriterion("cutime <>", value, "cutime");
            return (Criteria) this;
        }

        public Criteria andCutimeGreaterThan(Date value) {
            addCriterion("cutime >", value, "cutime");
            return (Criteria) this;
        }

        public Criteria andCutimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cutime >=", value, "cutime");
            return (Criteria) this;
        }

        public Criteria andCutimeLessThan(Date value) {
            addCriterion("cutime <", value, "cutime");
            return (Criteria) this;
        }

        public Criteria andCutimeLessThanOrEqualTo(Date value) {
            addCriterion("cutime <=", value, "cutime");
            return (Criteria) this;
        }

        public Criteria andCutimeIn(List<Date> values) {
            addCriterion("cutime in", values, "cutime");
            return (Criteria) this;
        }

        public Criteria andCutimeNotIn(List<Date> values) {
            addCriterion("cutime not in", values, "cutime");
            return (Criteria) this;
        }

        public Criteria andCutimeBetween(Date value1, Date value2) {
            addCriterion("cutime between", value1, value2, "cutime");
            return (Criteria) this;
        }

        public Criteria andCutimeNotBetween(Date value1, Date value2) {
            addCriterion("cutime not between", value1, value2, "cutime");
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