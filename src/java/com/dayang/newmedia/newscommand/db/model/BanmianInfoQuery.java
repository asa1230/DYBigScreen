package com.dayang.newmedia.newscommand.db.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BanmianInfoQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BanmianInfoQuery() {
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

        public Criteria andBguidIsNull() {
            addCriterion("bguid is null");
            return (Criteria) this;
        }

        public Criteria andBguidIsNotNull() {
            addCriterion("bguid is not null");
            return (Criteria) this;
        }

        public Criteria andBguidEqualTo(String value) {
            addCriterion("bguid =", value, "bguid");
            return (Criteria) this;
        }

        public Criteria andBguidNotEqualTo(String value) {
            addCriterion("bguid <>", value, "bguid");
            return (Criteria) this;
        }

        public Criteria andBguidGreaterThan(String value) {
            addCriterion("bguid >", value, "bguid");
            return (Criteria) this;
        }

        public Criteria andBguidGreaterThanOrEqualTo(String value) {
            addCriterion("bguid >=", value, "bguid");
            return (Criteria) this;
        }

        public Criteria andBguidLessThan(String value) {
            addCriterion("bguid <", value, "bguid");
            return (Criteria) this;
        }

        public Criteria andBguidLessThanOrEqualTo(String value) {
            addCriterion("bguid <=", value, "bguid");
            return (Criteria) this;
        }

        public Criteria andBguidLike(String value) {
            addCriterion("bguid like", value, "bguid");
            return (Criteria) this;
        }

        public Criteria andBguidNotLike(String value) {
            addCriterion("bguid not like", value, "bguid");
            return (Criteria) this;
        }

        public Criteria andBguidIn(List<String> values) {
            addCriterion("bguid in", values, "bguid");
            return (Criteria) this;
        }

        public Criteria andBguidNotIn(List<String> values) {
            addCriterion("bguid not in", values, "bguid");
            return (Criteria) this;
        }

        public Criteria andBguidBetween(String value1, String value2) {
            addCriterion("bguid between", value1, value2, "bguid");
            return (Criteria) this;
        }

        public Criteria andBguidNotBetween(String value1, String value2) {
            addCriterion("bguid not between", value1, value2, "bguid");
            return (Criteria) this;
        }

        public Criteria andBnameIsNull() {
            addCriterion("bname is null");
            return (Criteria) this;
        }

        public Criteria andBnameIsNotNull() {
            addCriterion("bname is not null");
            return (Criteria) this;
        }

        public Criteria andBnameEqualTo(String value) {
            addCriterion("bname =", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotEqualTo(String value) {
            addCriterion("bname <>", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameGreaterThan(String value) {
            addCriterion("bname >", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameGreaterThanOrEqualTo(String value) {
            addCriterion("bname >=", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLessThan(String value) {
            addCriterion("bname <", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLessThanOrEqualTo(String value) {
            addCriterion("bname <=", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLike(String value) {
            addCriterion("bname like", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotLike(String value) {
            addCriterion("bname not like", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameIn(List<String> values) {
            addCriterion("bname in", values, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotIn(List<String> values) {
            addCriterion("bname not in", values, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameBetween(String value1, String value2) {
            addCriterion("bname between", value1, value2, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotBetween(String value1, String value2) {
            addCriterion("bname not between", value1, value2, "bname");
            return (Criteria) this;
        }

        public Criteria andBdescriptionIsNull() {
            addCriterion("bdescription is null");
            return (Criteria) this;
        }

        public Criteria andBdescriptionIsNotNull() {
            addCriterion("bdescription is not null");
            return (Criteria) this;
        }

        public Criteria andBdescriptionEqualTo(String value) {
            addCriterion("bdescription =", value, "bdescription");
            return (Criteria) this;
        }

        public Criteria andBdescriptionNotEqualTo(String value) {
            addCriterion("bdescription <>", value, "bdescription");
            return (Criteria) this;
        }

        public Criteria andBdescriptionGreaterThan(String value) {
            addCriterion("bdescription >", value, "bdescription");
            return (Criteria) this;
        }

        public Criteria andBdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("bdescription >=", value, "bdescription");
            return (Criteria) this;
        }

        public Criteria andBdescriptionLessThan(String value) {
            addCriterion("bdescription <", value, "bdescription");
            return (Criteria) this;
        }

        public Criteria andBdescriptionLessThanOrEqualTo(String value) {
            addCriterion("bdescription <=", value, "bdescription");
            return (Criteria) this;
        }

        public Criteria andBdescriptionLike(String value) {
            addCriterion("bdescription like", value, "bdescription");
            return (Criteria) this;
        }

        public Criteria andBdescriptionNotLike(String value) {
            addCriterion("bdescription not like", value, "bdescription");
            return (Criteria) this;
        }

        public Criteria andBdescriptionIn(List<String> values) {
            addCriterion("bdescription in", values, "bdescription");
            return (Criteria) this;
        }

        public Criteria andBdescriptionNotIn(List<String> values) {
            addCriterion("bdescription not in", values, "bdescription");
            return (Criteria) this;
        }

        public Criteria andBdescriptionBetween(String value1, String value2) {
            addCriterion("bdescription between", value1, value2, "bdescription");
            return (Criteria) this;
        }

        public Criteria andBdescriptionNotBetween(String value1, String value2) {
            addCriterion("bdescription not between", value1, value2, "bdescription");
            return (Criteria) this;
        }

        public Criteria andBcolumnIsNull() {
            addCriterion("BCOLUMN is null");
            return (Criteria) this;
        }

        public Criteria andBcolumnIsNotNull() {
            addCriterion("BCOLUMN is not null");
            return (Criteria) this;
        }

        public Criteria andBcolumnEqualTo(String value) {
            addCriterion("BCOLUMN =", value, "bcolumn");
            return (Criteria) this;
        }

        public Criteria andBcolumnNotEqualTo(String value) {
            addCriterion("BCOLUMN <>", value, "bcolumn");
            return (Criteria) this;
        }

        public Criteria andBcolumnGreaterThan(String value) {
            addCriterion("BCOLUMN >", value, "bcolumn");
            return (Criteria) this;
        }

        public Criteria andBcolumnGreaterThanOrEqualTo(String value) {
            addCriterion("BCOLUMN >=", value, "bcolumn");
            return (Criteria) this;
        }

        public Criteria andBcolumnLessThan(String value) {
            addCriterion("BCOLUMN <", value, "bcolumn");
            return (Criteria) this;
        }

        public Criteria andBcolumnLessThanOrEqualTo(String value) {
            addCriterion("BCOLUMN <=", value, "bcolumn");
            return (Criteria) this;
        }

        public Criteria andBcolumnLike(String value) {
            addCriterion("BCOLUMN like", value, "bcolumn");
            return (Criteria) this;
        }

        public Criteria andBcolumnNotLike(String value) {
            addCriterion("BCOLUMN not like", value, "bcolumn");
            return (Criteria) this;
        }

        public Criteria andBcolumnIn(List<String> values) {
            addCriterion("BCOLUMN in", values, "bcolumn");
            return (Criteria) this;
        }

        public Criteria andBcolumnNotIn(List<String> values) {
            addCriterion("BCOLUMN not in", values, "bcolumn");
            return (Criteria) this;
        }

        public Criteria andBcolumnBetween(String value1, String value2) {
            addCriterion("BCOLUMN between", value1, value2, "bcolumn");
            return (Criteria) this;
        }

        public Criteria andBcolumnNotBetween(String value1, String value2) {
            addCriterion("BCOLUMN not between", value1, value2, "bcolumn");
            return (Criteria) this;
        }

        public Criteria andBurlIsNull() {
            addCriterion("BURL is null");
            return (Criteria) this;
        }

        public Criteria andBurlIsNotNull() {
            addCriterion("BURL is not null");
            return (Criteria) this;
        }

        public Criteria andBurlEqualTo(String value) {
            addCriterion("BURL =", value, "burl");
            return (Criteria) this;
        }

        public Criteria andBurlNotEqualTo(String value) {
            addCriterion("BURL <>", value, "burl");
            return (Criteria) this;
        }

        public Criteria andBurlGreaterThan(String value) {
            addCriterion("BURL >", value, "burl");
            return (Criteria) this;
        }

        public Criteria andBurlGreaterThanOrEqualTo(String value) {
            addCriterion("BURL >=", value, "burl");
            return (Criteria) this;
        }

        public Criteria andBurlLessThan(String value) {
            addCriterion("BURL <", value, "burl");
            return (Criteria) this;
        }

        public Criteria andBurlLessThanOrEqualTo(String value) {
            addCriterion("BURL <=", value, "burl");
            return (Criteria) this;
        }

        public Criteria andBurlLike(String value) {
            addCriterion("BURL like", value, "burl");
            return (Criteria) this;
        }

        public Criteria andBurlNotLike(String value) {
            addCriterion("BURL not like", value, "burl");
            return (Criteria) this;
        }

        public Criteria andBurlIn(List<String> values) {
            addCriterion("BURL in", values, "burl");
            return (Criteria) this;
        }

        public Criteria andBurlNotIn(List<String> values) {
            addCriterion("BURL not in", values, "burl");
            return (Criteria) this;
        }

        public Criteria andBurlBetween(String value1, String value2) {
            addCriterion("BURL between", value1, value2, "burl");
            return (Criteria) this;
        }

        public Criteria andBurlNotBetween(String value1, String value2) {
            addCriterion("BURL not between", value1, value2, "burl");
            return (Criteria) this;
        }

        public Criteria andBcolumnguidIsNull() {
            addCriterion("BCOLUMNGUID is null");
            return (Criteria) this;
        }

        public Criteria andBcolumnguidIsNotNull() {
            addCriterion("BCOLUMNGUID is not null");
            return (Criteria) this;
        }

        public Criteria andBcolumnguidEqualTo(String value) {
            addCriterion("BCOLUMNGUID =", value, "bcolumnguid");
            return (Criteria) this;
        }

        public Criteria andBcolumnguidNotEqualTo(String value) {
            addCriterion("BCOLUMNGUID <>", value, "bcolumnguid");
            return (Criteria) this;
        }

        public Criteria andBcolumnguidGreaterThan(String value) {
            addCriterion("BCOLUMNGUID >", value, "bcolumnguid");
            return (Criteria) this;
        }

        public Criteria andBcolumnguidGreaterThanOrEqualTo(String value) {
            addCriterion("BCOLUMNGUID >=", value, "bcolumnguid");
            return (Criteria) this;
        }

        public Criteria andBcolumnguidLessThan(String value) {
            addCriterion("BCOLUMNGUID <", value, "bcolumnguid");
            return (Criteria) this;
        }

        public Criteria andBcolumnguidLessThanOrEqualTo(String value) {
            addCriterion("BCOLUMNGUID <=", value, "bcolumnguid");
            return (Criteria) this;
        }

        public Criteria andBcolumnguidLike(String value) {
            addCriterion("BCOLUMNGUID like", value, "bcolumnguid");
            return (Criteria) this;
        }

        public Criteria andBcolumnguidNotLike(String value) {
            addCriterion("BCOLUMNGUID not like", value, "bcolumnguid");
            return (Criteria) this;
        }

        public Criteria andBcolumnguidIn(List<String> values) {
            addCriterion("BCOLUMNGUID in", values, "bcolumnguid");
            return (Criteria) this;
        }

        public Criteria andBcolumnguidNotIn(List<String> values) {
            addCriterion("BCOLUMNGUID not in", values, "bcolumnguid");
            return (Criteria) this;
        }

        public Criteria andBcolumnguidBetween(String value1, String value2) {
            addCriterion("BCOLUMNGUID between", value1, value2, "bcolumnguid");
            return (Criteria) this;
        }

        public Criteria andBcolumnguidNotBetween(String value1, String value2) {
            addCriterion("BCOLUMNGUID not between", value1, value2, "bcolumnguid");
            return (Criteria) this;
        }

        public Criteria andBextmsgIsNull() {
            addCriterion("BEXTMSG is null");
            return (Criteria) this;
        }

        public Criteria andBextmsgIsNotNull() {
            addCriterion("BEXTMSG is not null");
            return (Criteria) this;
        }

        public Criteria andBextmsgEqualTo(String value) {
            addCriterion("BEXTMSG =", value, "bextmsg");
            return (Criteria) this;
        }

        public Criteria andBextmsgNotEqualTo(String value) {
            addCriterion("BEXTMSG <>", value, "bextmsg");
            return (Criteria) this;
        }

        public Criteria andBextmsgGreaterThan(String value) {
            addCriterion("BEXTMSG >", value, "bextmsg");
            return (Criteria) this;
        }

        public Criteria andBextmsgGreaterThanOrEqualTo(String value) {
            addCriterion("BEXTMSG >=", value, "bextmsg");
            return (Criteria) this;
        }

        public Criteria andBextmsgLessThan(String value) {
            addCriterion("BEXTMSG <", value, "bextmsg");
            return (Criteria) this;
        }

        public Criteria andBextmsgLessThanOrEqualTo(String value) {
            addCriterion("BEXTMSG <=", value, "bextmsg");
            return (Criteria) this;
        }

        public Criteria andBextmsgLike(String value) {
            addCriterion("BEXTMSG like", value, "bextmsg");
            return (Criteria) this;
        }

        public Criteria andBextmsgNotLike(String value) {
            addCriterion("BEXTMSG not like", value, "bextmsg");
            return (Criteria) this;
        }

        public Criteria andBextmsgIn(List<String> values) {
            addCriterion("BEXTMSG in", values, "bextmsg");
            return (Criteria) this;
        }

        public Criteria andBextmsgNotIn(List<String> values) {
            addCriterion("BEXTMSG not in", values, "bextmsg");
            return (Criteria) this;
        }

        public Criteria andBextmsgBetween(String value1, String value2) {
            addCriterion("BEXTMSG between", value1, value2, "bextmsg");
            return (Criteria) this;
        }

        public Criteria andBextmsgNotBetween(String value1, String value2) {
            addCriterion("BEXTMSG not between", value1, value2, "bextmsg");
            return (Criteria) this;
        }

        public Criteria andBaddtimeIsNull() {
            addCriterion("BADDTIME is null");
            return (Criteria) this;
        }

        public Criteria andBaddtimeIsNotNull() {
            addCriterion("BADDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andBaddtimeEqualTo(Date value) {
            addCriterion("BADDTIME =", value, "baddtime");
            return (Criteria) this;
        }

        public Criteria andBaddtimeNotEqualTo(Date value) {
            addCriterion("BADDTIME <>", value, "baddtime");
            return (Criteria) this;
        }

        public Criteria andBaddtimeGreaterThan(Date value) {
            addCriterion("BADDTIME >", value, "baddtime");
            return (Criteria) this;
        }

        public Criteria andBaddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BADDTIME >=", value, "baddtime");
            return (Criteria) this;
        }

        public Criteria andBaddtimeLessThan(Date value) {
            addCriterion("BADDTIME <", value, "baddtime");
            return (Criteria) this;
        }

        public Criteria andBaddtimeLessThanOrEqualTo(Date value) {
            addCriterion("BADDTIME <=", value, "baddtime");
            return (Criteria) this;
        }

        public Criteria andBaddtimeIn(List<Date> values) {
            addCriterion("BADDTIME in", values, "baddtime");
            return (Criteria) this;
        }

        public Criteria andBaddtimeNotIn(List<Date> values) {
            addCriterion("BADDTIME not in", values, "baddtime");
            return (Criteria) this;
        }

        public Criteria andBaddtimeBetween(Date value1, Date value2) {
            addCriterion("BADDTIME between", value1, value2, "baddtime");
            return (Criteria) this;
        }

        public Criteria andBaddtimeNotBetween(Date value1, Date value2) {
            addCriterion("BADDTIME not between", value1, value2, "baddtime");
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