package com.dayang.newmedia.newscommand.db.model;

import java.util.ArrayList;
import java.util.List;

public class ProgramratingQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProgramratingQuery() {
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

        public Criteria andRatingidIsNull() {
            addCriterion("ratingid is null");
            return (Criteria) this;
        }

        public Criteria andRatingidIsNotNull() {
            addCriterion("ratingid is not null");
            return (Criteria) this;
        }

        public Criteria andRatingidEqualTo(String value) {
            addCriterion("ratingid =", value, "ratingid");
            return (Criteria) this;
        }

        public Criteria andRatingidNotEqualTo(String value) {
            addCriterion("ratingid <>", value, "ratingid");
            return (Criteria) this;
        }

        public Criteria andRatingidGreaterThan(String value) {
            addCriterion("ratingid >", value, "ratingid");
            return (Criteria) this;
        }

        public Criteria andRatingidGreaterThanOrEqualTo(String value) {
            addCriterion("ratingid >=", value, "ratingid");
            return (Criteria) this;
        }

        public Criteria andRatingidLessThan(String value) {
            addCriterion("ratingid <", value, "ratingid");
            return (Criteria) this;
        }

        public Criteria andRatingidLessThanOrEqualTo(String value) {
            addCriterion("ratingid <=", value, "ratingid");
            return (Criteria) this;
        }

        public Criteria andRatingidLike(String value) {
            addCriterion("ratingid like", value, "ratingid");
            return (Criteria) this;
        }

        public Criteria andRatingidNotLike(String value) {
            addCriterion("ratingid not like", value, "ratingid");
            return (Criteria) this;
        }

        public Criteria andRatingidIn(List<String> values) {
            addCriterion("ratingid in", values, "ratingid");
            return (Criteria) this;
        }

        public Criteria andRatingidNotIn(List<String> values) {
            addCriterion("ratingid not in", values, "ratingid");
            return (Criteria) this;
        }

        public Criteria andRatingidBetween(String value1, String value2) {
            addCriterion("ratingid between", value1, value2, "ratingid");
            return (Criteria) this;
        }

        public Criteria andRatingidNotBetween(String value1, String value2) {
            addCriterion("ratingid not between", value1, value2, "ratingid");
            return (Criteria) this;
        }

        public Criteria andRatingcodeIsNull() {
            addCriterion("ratingcode is null");
            return (Criteria) this;
        }

        public Criteria andRatingcodeIsNotNull() {
            addCriterion("ratingcode is not null");
            return (Criteria) this;
        }

        public Criteria andRatingcodeEqualTo(String value) {
            addCriterion("ratingcode =", value, "ratingcode");
            return (Criteria) this;
        }

        public Criteria andRatingcodeNotEqualTo(String value) {
            addCriterion("ratingcode <>", value, "ratingcode");
            return (Criteria) this;
        }

        public Criteria andRatingcodeGreaterThan(String value) {
            addCriterion("ratingcode >", value, "ratingcode");
            return (Criteria) this;
        }

        public Criteria andRatingcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ratingcode >=", value, "ratingcode");
            return (Criteria) this;
        }

        public Criteria andRatingcodeLessThan(String value) {
            addCriterion("ratingcode <", value, "ratingcode");
            return (Criteria) this;
        }

        public Criteria andRatingcodeLessThanOrEqualTo(String value) {
            addCriterion("ratingcode <=", value, "ratingcode");
            return (Criteria) this;
        }

        public Criteria andRatingcodeLike(String value) {
            addCriterion("ratingcode like", value, "ratingcode");
            return (Criteria) this;
        }

        public Criteria andRatingcodeNotLike(String value) {
            addCriterion("ratingcode not like", value, "ratingcode");
            return (Criteria) this;
        }

        public Criteria andRatingcodeIn(List<String> values) {
            addCriterion("ratingcode in", values, "ratingcode");
            return (Criteria) this;
        }

        public Criteria andRatingcodeNotIn(List<String> values) {
            addCriterion("ratingcode not in", values, "ratingcode");
            return (Criteria) this;
        }

        public Criteria andRatingcodeBetween(String value1, String value2) {
            addCriterion("ratingcode between", value1, value2, "ratingcode");
            return (Criteria) this;
        }

        public Criteria andRatingcodeNotBetween(String value1, String value2) {
            addCriterion("ratingcode not between", value1, value2, "ratingcode");
            return (Criteria) this;
        }

        public Criteria andRatingkeyIsNull() {
            addCriterion("ratingkey is null");
            return (Criteria) this;
        }

        public Criteria andRatingkeyIsNotNull() {
            addCriterion("ratingkey is not null");
            return (Criteria) this;
        }

        public Criteria andRatingkeyEqualTo(String value) {
            addCriterion("ratingkey =", value, "ratingkey");
            return (Criteria) this;
        }

        public Criteria andRatingkeyNotEqualTo(String value) {
            addCriterion("ratingkey <>", value, "ratingkey");
            return (Criteria) this;
        }

        public Criteria andRatingkeyGreaterThan(String value) {
            addCriterion("ratingkey >", value, "ratingkey");
            return (Criteria) this;
        }

        public Criteria andRatingkeyGreaterThanOrEqualTo(String value) {
            addCriterion("ratingkey >=", value, "ratingkey");
            return (Criteria) this;
        }

        public Criteria andRatingkeyLessThan(String value) {
            addCriterion("ratingkey <", value, "ratingkey");
            return (Criteria) this;
        }

        public Criteria andRatingkeyLessThanOrEqualTo(String value) {
            addCriterion("ratingkey <=", value, "ratingkey");
            return (Criteria) this;
        }

        public Criteria andRatingkeyLike(String value) {
            addCriterion("ratingkey like", value, "ratingkey");
            return (Criteria) this;
        }

        public Criteria andRatingkeyNotLike(String value) {
            addCriterion("ratingkey not like", value, "ratingkey");
            return (Criteria) this;
        }

        public Criteria andRatingkeyIn(List<String> values) {
            addCriterion("ratingkey in", values, "ratingkey");
            return (Criteria) this;
        }

        public Criteria andRatingkeyNotIn(List<String> values) {
            addCriterion("ratingkey not in", values, "ratingkey");
            return (Criteria) this;
        }

        public Criteria andRatingkeyBetween(String value1, String value2) {
            addCriterion("ratingkey between", value1, value2, "ratingkey");
            return (Criteria) this;
        }

        public Criteria andRatingkeyNotBetween(String value1, String value2) {
            addCriterion("ratingkey not between", value1, value2, "ratingkey");
            return (Criteria) this;
        }

        public Criteria andOrderbyIsNull() {
            addCriterion("orderby is null");
            return (Criteria) this;
        }

        public Criteria andOrderbyIsNotNull() {
            addCriterion("orderby is not null");
            return (Criteria) this;
        }

        public Criteria andOrderbyEqualTo(Integer value) {
            addCriterion("orderby =", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyNotEqualTo(Integer value) {
            addCriterion("orderby <>", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyGreaterThan(Integer value) {
            addCriterion("orderby >", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderby >=", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyLessThan(Integer value) {
            addCriterion("orderby <", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyLessThanOrEqualTo(Integer value) {
            addCriterion("orderby <=", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyIn(List<Integer> values) {
            addCriterion("orderby in", values, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyNotIn(List<Integer> values) {
            addCriterion("orderby not in", values, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyBetween(Integer value1, Integer value2) {
            addCriterion("orderby between", value1, value2, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyNotBetween(Integer value1, Integer value2) {
            addCriterion("orderby not between", value1, value2, "orderby");
            return (Criteria) this;
        }

        public Criteria andRatingvalueIsNull() {
            addCriterion("ratingvalue is null");
            return (Criteria) this;
        }

        public Criteria andRatingvalueIsNotNull() {
            addCriterion("ratingvalue is not null");
            return (Criteria) this;
        }

        public Criteria andRatingvalueEqualTo(String value) {
            addCriterion("ratingvalue =", value, "ratingvalue");
            return (Criteria) this;
        }

        public Criteria andRatingvalueNotEqualTo(String value) {
            addCriterion("ratingvalue <>", value, "ratingvalue");
            return (Criteria) this;
        }

        public Criteria andRatingvalueGreaterThan(String value) {
            addCriterion("ratingvalue >", value, "ratingvalue");
            return (Criteria) this;
        }

        public Criteria andRatingvalueGreaterThanOrEqualTo(String value) {
            addCriterion("ratingvalue >=", value, "ratingvalue");
            return (Criteria) this;
        }

        public Criteria andRatingvalueLessThan(String value) {
            addCriterion("ratingvalue <", value, "ratingvalue");
            return (Criteria) this;
        }

        public Criteria andRatingvalueLessThanOrEqualTo(String value) {
            addCriterion("ratingvalue <=", value, "ratingvalue");
            return (Criteria) this;
        }

        public Criteria andRatingvalueLike(String value) {
            addCriterion("ratingvalue like", value, "ratingvalue");
            return (Criteria) this;
        }

        public Criteria andRatingvalueNotLike(String value) {
            addCriterion("ratingvalue not like", value, "ratingvalue");
            return (Criteria) this;
        }

        public Criteria andRatingvalueIn(List<String> values) {
            addCriterion("ratingvalue in", values, "ratingvalue");
            return (Criteria) this;
        }

        public Criteria andRatingvalueNotIn(List<String> values) {
            addCriterion("ratingvalue not in", values, "ratingvalue");
            return (Criteria) this;
        }

        public Criteria andRatingvalueBetween(String value1, String value2) {
            addCriterion("ratingvalue between", value1, value2, "ratingvalue");
            return (Criteria) this;
        }

        public Criteria andRatingvalueNotBetween(String value1, String value2) {
            addCriterion("ratingvalue not between", value1, value2, "ratingvalue");
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