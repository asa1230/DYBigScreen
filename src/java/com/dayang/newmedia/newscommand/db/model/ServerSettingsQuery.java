package com.dayang.newmedia.newscommand.db.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServerSettingsQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServerSettingsQuery() {
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

        public Criteria andUrlguidIsNull() {
            addCriterion("urlguid is null");
            return (Criteria) this;
        }

        public Criteria andUrlguidIsNotNull() {
            addCriterion("urlguid is not null");
            return (Criteria) this;
        }

        public Criteria andUrlguidEqualTo(String value) {
            addCriterion("urlguid =", value, "urlguid");
            return (Criteria) this;
        }

        public Criteria andUrlguidNotEqualTo(String value) {
            addCriterion("urlguid <>", value, "urlguid");
            return (Criteria) this;
        }

        public Criteria andUrlguidGreaterThan(String value) {
            addCriterion("urlguid >", value, "urlguid");
            return (Criteria) this;
        }

        public Criteria andUrlguidGreaterThanOrEqualTo(String value) {
            addCriterion("urlguid >=", value, "urlguid");
            return (Criteria) this;
        }

        public Criteria andUrlguidLessThan(String value) {
            addCriterion("urlguid <", value, "urlguid");
            return (Criteria) this;
        }

        public Criteria andUrlguidLessThanOrEqualTo(String value) {
            addCriterion("urlguid <=", value, "urlguid");
            return (Criteria) this;
        }

        public Criteria andUrlguidLike(String value) {
            addCriterion("urlguid like", value, "urlguid");
            return (Criteria) this;
        }

        public Criteria andUrlguidNotLike(String value) {
            addCriterion("urlguid not like", value, "urlguid");
            return (Criteria) this;
        }

        public Criteria andUrlguidIn(List<String> values) {
            addCriterion("urlguid in", values, "urlguid");
            return (Criteria) this;
        }

        public Criteria andUrlguidNotIn(List<String> values) {
            addCriterion("urlguid not in", values, "urlguid");
            return (Criteria) this;
        }

        public Criteria andUrlguidBetween(String value1, String value2) {
            addCriterion("urlguid between", value1, value2, "urlguid");
            return (Criteria) this;
        }

        public Criteria andUrlguidNotBetween(String value1, String value2) {
            addCriterion("urlguid not between", value1, value2, "urlguid");
            return (Criteria) this;
        }

        public Criteria andUareaIsNull() {
            addCriterion("uarea is null");
            return (Criteria) this;
        }

        public Criteria andUareaIsNotNull() {
            addCriterion("uarea is not null");
            return (Criteria) this;
        }

        public Criteria andUareaEqualTo(String value) {
            addCriterion("uarea =", value, "uarea");
            return (Criteria) this;
        }

        public Criteria andUareaNotEqualTo(String value) {
            addCriterion("uarea <>", value, "uarea");
            return (Criteria) this;
        }

        public Criteria andUareaGreaterThan(String value) {
            addCriterion("uarea >", value, "uarea");
            return (Criteria) this;
        }

        public Criteria andUareaGreaterThanOrEqualTo(String value) {
            addCriterion("uarea >=", value, "uarea");
            return (Criteria) this;
        }

        public Criteria andUareaLessThan(String value) {
            addCriterion("uarea <", value, "uarea");
            return (Criteria) this;
        }

        public Criteria andUareaLessThanOrEqualTo(String value) {
            addCriterion("uarea <=", value, "uarea");
            return (Criteria) this;
        }

        public Criteria andUareaLike(String value) {
            addCriterion("uarea like", value, "uarea");
            return (Criteria) this;
        }

        public Criteria andUareaNotLike(String value) {
            addCriterion("uarea not like", value, "uarea");
            return (Criteria) this;
        }

        public Criteria andUareaIn(List<String> values) {
            addCriterion("uarea in", values, "uarea");
            return (Criteria) this;
        }

        public Criteria andUareaNotIn(List<String> values) {
            addCriterion("uarea not in", values, "uarea");
            return (Criteria) this;
        }

        public Criteria andUareaBetween(String value1, String value2) {
            addCriterion("uarea between", value1, value2, "uarea");
            return (Criteria) this;
        }

        public Criteria andUareaNotBetween(String value1, String value2) {
            addCriterion("uarea not between", value1, value2, "uarea");
            return (Criteria) this;
        }

        public Criteria andUnameIsNull() {
            addCriterion("uname is null");
            return (Criteria) this;
        }

        public Criteria andUnameIsNotNull() {
            addCriterion("uname is not null");
            return (Criteria) this;
        }

        public Criteria andUnameEqualTo(String value) {
            addCriterion("uname =", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotEqualTo(String value) {
            addCriterion("uname <>", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThan(String value) {
            addCriterion("uname >", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThanOrEqualTo(String value) {
            addCriterion("uname >=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThan(String value) {
            addCriterion("uname <", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThanOrEqualTo(String value) {
            addCriterion("uname <=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLike(String value) {
            addCriterion("uname like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotLike(String value) {
            addCriterion("uname not like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameIn(List<String> values) {
            addCriterion("uname in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotIn(List<String> values) {
            addCriterion("uname not in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameBetween(String value1, String value2) {
            addCriterion("uname between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotBetween(String value1, String value2) {
            addCriterion("uname not between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUpathIsNull() {
            addCriterion("upath is null");
            return (Criteria) this;
        }

        public Criteria andUpathIsNotNull() {
            addCriterion("upath is not null");
            return (Criteria) this;
        }

        public Criteria andUpathEqualTo(String value) {
            addCriterion("upath =", value, "upath");
            return (Criteria) this;
        }

        public Criteria andUpathNotEqualTo(String value) {
            addCriterion("upath <>", value, "upath");
            return (Criteria) this;
        }

        public Criteria andUpathGreaterThan(String value) {
            addCriterion("upath >", value, "upath");
            return (Criteria) this;
        }

        public Criteria andUpathGreaterThanOrEqualTo(String value) {
            addCriterion("upath >=", value, "upath");
            return (Criteria) this;
        }

        public Criteria andUpathLessThan(String value) {
            addCriterion("upath <", value, "upath");
            return (Criteria) this;
        }

        public Criteria andUpathLessThanOrEqualTo(String value) {
            addCriterion("upath <=", value, "upath");
            return (Criteria) this;
        }

        public Criteria andUpathLike(String value) {
            addCriterion("upath like", value, "upath");
            return (Criteria) this;
        }

        public Criteria andUpathNotLike(String value) {
            addCriterion("upath not like", value, "upath");
            return (Criteria) this;
        }

        public Criteria andUpathIn(List<String> values) {
            addCriterion("upath in", values, "upath");
            return (Criteria) this;
        }

        public Criteria andUpathNotIn(List<String> values) {
            addCriterion("upath not in", values, "upath");
            return (Criteria) this;
        }

        public Criteria andUpathBetween(String value1, String value2) {
            addCriterion("upath between", value1, value2, "upath");
            return (Criteria) this;
        }

        public Criteria andUpathNotBetween(String value1, String value2) {
            addCriterion("upath not between", value1, value2, "upath");
            return (Criteria) this;
        }

        public Criteria andUtypeIsNull() {
            addCriterion("utype is null");
            return (Criteria) this;
        }

        public Criteria andUtypeIsNotNull() {
            addCriterion("utype is not null");
            return (Criteria) this;
        }

        public Criteria andUtypeEqualTo(Integer value) {
            addCriterion("utype =", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeNotEqualTo(Integer value) {
            addCriterion("utype <>", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeGreaterThan(Integer value) {
            addCriterion("utype >", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("utype >=", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeLessThan(Integer value) {
            addCriterion("utype <", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeLessThanOrEqualTo(Integer value) {
            addCriterion("utype <=", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeIn(List<Integer> values) {
            addCriterion("utype in", values, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeNotIn(List<Integer> values) {
            addCriterion("utype not in", values, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeBetween(Integer value1, Integer value2) {
            addCriterion("utype between", value1, value2, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("utype not between", value1, value2, "utype");
            return (Criteria) this;
        }

        public Criteria andChangetimeIsNull() {
            addCriterion("CHANGETIME is null");
            return (Criteria) this;
        }

        public Criteria andChangetimeIsNotNull() {
            addCriterion("CHANGETIME is not null");
            return (Criteria) this;
        }

        public Criteria andChangetimeEqualTo(Date value) {
            addCriterion("CHANGETIME =", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeNotEqualTo(Date value) {
            addCriterion("CHANGETIME <>", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeGreaterThan(Date value) {
            addCriterion("CHANGETIME >", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CHANGETIME >=", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeLessThan(Date value) {
            addCriterion("CHANGETIME <", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeLessThanOrEqualTo(Date value) {
            addCriterion("CHANGETIME <=", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeIn(List<Date> values) {
            addCriterion("CHANGETIME in", values, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeNotIn(List<Date> values) {
            addCriterion("CHANGETIME not in", values, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeBetween(Date value1, Date value2) {
            addCriterion("CHANGETIME between", value1, value2, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeNotBetween(Date value1, Date value2) {
            addCriterion("CHANGETIME not between", value1, value2, "changetime");
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