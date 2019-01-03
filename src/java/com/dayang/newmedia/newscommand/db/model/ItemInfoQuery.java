package com.dayang.newmedia.newscommand.db.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItemInfoQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemInfoQuery() {
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

        public Criteria andItemnameIsNull() {
            addCriterion("itemname is null");
            return (Criteria) this;
        }

        public Criteria andItemnameIsNotNull() {
            addCriterion("itemname is not null");
            return (Criteria) this;
        }

        public Criteria andItemnameEqualTo(String value) {
            addCriterion("itemname =", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotEqualTo(String value) {
            addCriterion("itemname <>", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameGreaterThan(String value) {
            addCriterion("itemname >", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameGreaterThanOrEqualTo(String value) {
            addCriterion("itemname >=", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameLessThan(String value) {
            addCriterion("itemname <", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameLessThanOrEqualTo(String value) {
            addCriterion("itemname <=", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameLike(String value) {
            addCriterion("itemname like", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotLike(String value) {
            addCriterion("itemname not like", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameIn(List<String> values) {
            addCriterion("itemname in", values, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotIn(List<String> values) {
            addCriterion("itemname not in", values, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameBetween(String value1, String value2) {
            addCriterion("itemname between", value1, value2, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotBetween(String value1, String value2) {
            addCriterion("itemname not between", value1, value2, "itemname");
            return (Criteria) this;
        }

        public Criteria andParentguidIsNull() {
            addCriterion("parentguid is null");
            return (Criteria) this;
        }

        public Criteria andParentguidIsNotNull() {
            addCriterion("parentguid is not null");
            return (Criteria) this;
        }

        public Criteria andParentguidEqualTo(String value) {
            addCriterion("parentguid =", value, "parentguid");
            return (Criteria) this;
        }

        public Criteria andParentguidNotEqualTo(String value) {
            addCriterion("parentguid <>", value, "parentguid");
            return (Criteria) this;
        }

        public Criteria andParentguidGreaterThan(String value) {
            addCriterion("parentguid >", value, "parentguid");
            return (Criteria) this;
        }

        public Criteria andParentguidGreaterThanOrEqualTo(String value) {
            addCriterion("parentguid >=", value, "parentguid");
            return (Criteria) this;
        }

        public Criteria andParentguidLessThan(String value) {
            addCriterion("parentguid <", value, "parentguid");
            return (Criteria) this;
        }

        public Criteria andParentguidLessThanOrEqualTo(String value) {
            addCriterion("parentguid <=", value, "parentguid");
            return (Criteria) this;
        }

        public Criteria andParentguidLike(String value) {
            addCriterion("parentguid like", value, "parentguid");
            return (Criteria) this;
        }

        public Criteria andParentguidNotLike(String value) {
            addCriterion("parentguid not like", value, "parentguid");
            return (Criteria) this;
        }

        public Criteria andParentguidIn(List<String> values) {
            addCriterion("parentguid in", values, "parentguid");
            return (Criteria) this;
        }

        public Criteria andParentguidNotIn(List<String> values) {
            addCriterion("parentguid not in", values, "parentguid");
            return (Criteria) this;
        }

        public Criteria andParentguidBetween(String value1, String value2) {
            addCriterion("parentguid between", value1, value2, "parentguid");
            return (Criteria) this;
        }

        public Criteria andParentguidNotBetween(String value1, String value2) {
            addCriterion("parentguid not between", value1, value2, "parentguid");
            return (Criteria) this;
        }

        public Criteria andItemurlIsNull() {
            addCriterion("itemurl is null");
            return (Criteria) this;
        }

        public Criteria andItemurlIsNotNull() {
            addCriterion("itemurl is not null");
            return (Criteria) this;
        }

        public Criteria andItemurlEqualTo(String value) {
            addCriterion("itemurl =", value, "itemurl");
            return (Criteria) this;
        }

        public Criteria andItemurlNotEqualTo(String value) {
            addCriterion("itemurl <>", value, "itemurl");
            return (Criteria) this;
        }

        public Criteria andItemurlGreaterThan(String value) {
            addCriterion("itemurl >", value, "itemurl");
            return (Criteria) this;
        }

        public Criteria andItemurlGreaterThanOrEqualTo(String value) {
            addCriterion("itemurl >=", value, "itemurl");
            return (Criteria) this;
        }

        public Criteria andItemurlLessThan(String value) {
            addCriterion("itemurl <", value, "itemurl");
            return (Criteria) this;
        }

        public Criteria andItemurlLessThanOrEqualTo(String value) {
            addCriterion("itemurl <=", value, "itemurl");
            return (Criteria) this;
        }

        public Criteria andItemurlLike(String value) {
            addCriterion("itemurl like", value, "itemurl");
            return (Criteria) this;
        }

        public Criteria andItemurlNotLike(String value) {
            addCriterion("itemurl not like", value, "itemurl");
            return (Criteria) this;
        }

        public Criteria andItemurlIn(List<String> values) {
            addCriterion("itemurl in", values, "itemurl");
            return (Criteria) this;
        }

        public Criteria andItemurlNotIn(List<String> values) {
            addCriterion("itemurl not in", values, "itemurl");
            return (Criteria) this;
        }

        public Criteria andItemurlBetween(String value1, String value2) {
            addCriterion("itemurl between", value1, value2, "itemurl");
            return (Criteria) this;
        }

        public Criteria andItemurlNotBetween(String value1, String value2) {
            addCriterion("itemurl not between", value1, value2, "itemurl");
            return (Criteria) this;
        }

        public Criteria andItemtargetIsNull() {
            addCriterion("itemtarget is null");
            return (Criteria) this;
        }

        public Criteria andItemtargetIsNotNull() {
            addCriterion("itemtarget is not null");
            return (Criteria) this;
        }

        public Criteria andItemtargetEqualTo(String value) {
            addCriterion("itemtarget =", value, "itemtarget");
            return (Criteria) this;
        }

        public Criteria andItemtargetNotEqualTo(String value) {
            addCriterion("itemtarget <>", value, "itemtarget");
            return (Criteria) this;
        }

        public Criteria andItemtargetGreaterThan(String value) {
            addCriterion("itemtarget >", value, "itemtarget");
            return (Criteria) this;
        }

        public Criteria andItemtargetGreaterThanOrEqualTo(String value) {
            addCriterion("itemtarget >=", value, "itemtarget");
            return (Criteria) this;
        }

        public Criteria andItemtargetLessThan(String value) {
            addCriterion("itemtarget <", value, "itemtarget");
            return (Criteria) this;
        }

        public Criteria andItemtargetLessThanOrEqualTo(String value) {
            addCriterion("itemtarget <=", value, "itemtarget");
            return (Criteria) this;
        }

        public Criteria andItemtargetLike(String value) {
            addCriterion("itemtarget like", value, "itemtarget");
            return (Criteria) this;
        }

        public Criteria andItemtargetNotLike(String value) {
            addCriterion("itemtarget not like", value, "itemtarget");
            return (Criteria) this;
        }

        public Criteria andItemtargetIn(List<String> values) {
            addCriterion("itemtarget in", values, "itemtarget");
            return (Criteria) this;
        }

        public Criteria andItemtargetNotIn(List<String> values) {
            addCriterion("itemtarget not in", values, "itemtarget");
            return (Criteria) this;
        }

        public Criteria andItemtargetBetween(String value1, String value2) {
            addCriterion("itemtarget between", value1, value2, "itemtarget");
            return (Criteria) this;
        }

        public Criteria andItemtargetNotBetween(String value1, String value2) {
            addCriterion("itemtarget not between", value1, value2, "itemtarget");
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