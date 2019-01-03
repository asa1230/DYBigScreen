package com.dayang.newmedia.newscommand.db.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewsTaskQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsTaskQuery() {
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

        public Criteria andCreaterIsNull() {
            addCriterion("Creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("Creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("Creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("Creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("Creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("Creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("Creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("Creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("Creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("Creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("Creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("Creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("Creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("Creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andResourceguidIsNull() {
            addCriterion("ResourceGuid is null");
            return (Criteria) this;
        }

        public Criteria andResourceguidIsNotNull() {
            addCriterion("ResourceGuid is not null");
            return (Criteria) this;
        }

        public Criteria andResourceguidEqualTo(String value) {
            addCriterion("ResourceGuid =", value, "resourceguid");
            return (Criteria) this;
        }

        public Criteria andResourceguidNotEqualTo(String value) {
            addCriterion("ResourceGuid <>", value, "resourceguid");
            return (Criteria) this;
        }

        public Criteria andResourceguidGreaterThan(String value) {
            addCriterion("ResourceGuid >", value, "resourceguid");
            return (Criteria) this;
        }

        public Criteria andResourceguidGreaterThanOrEqualTo(String value) {
            addCriterion("ResourceGuid >=", value, "resourceguid");
            return (Criteria) this;
        }

        public Criteria andResourceguidLessThan(String value) {
            addCriterion("ResourceGuid <", value, "resourceguid");
            return (Criteria) this;
        }

        public Criteria andResourceguidLessThanOrEqualTo(String value) {
            addCriterion("ResourceGuid <=", value, "resourceguid");
            return (Criteria) this;
        }

        public Criteria andResourceguidLike(String value) {
            addCriterion("ResourceGuid like", value, "resourceguid");
            return (Criteria) this;
        }

        public Criteria andResourceguidNotLike(String value) {
            addCriterion("ResourceGuid not like", value, "resourceguid");
            return (Criteria) this;
        }

        public Criteria andResourceguidIn(List<String> values) {
            addCriterion("ResourceGuid in", values, "resourceguid");
            return (Criteria) this;
        }

        public Criteria andResourceguidNotIn(List<String> values) {
            addCriterion("ResourceGuid not in", values, "resourceguid");
            return (Criteria) this;
        }

        public Criteria andResourceguidBetween(String value1, String value2) {
            addCriterion("ResourceGuid between", value1, value2, "resourceguid");
            return (Criteria) this;
        }

        public Criteria andResourceguidNotBetween(String value1, String value2) {
            addCriterion("ResourceGuid not between", value1, value2, "resourceguid");
            return (Criteria) this;
        }

        public Criteria andCreaterguidIsNull() {
            addCriterion("CreaterGuid is null");
            return (Criteria) this;
        }

        public Criteria andCreaterguidIsNotNull() {
            addCriterion("CreaterGuid is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterguidEqualTo(String value) {
            addCriterion("CreaterGuid =", value, "createrguid");
            return (Criteria) this;
        }

        public Criteria andCreaterguidNotEqualTo(String value) {
            addCriterion("CreaterGuid <>", value, "createrguid");
            return (Criteria) this;
        }

        public Criteria andCreaterguidGreaterThan(String value) {
            addCriterion("CreaterGuid >", value, "createrguid");
            return (Criteria) this;
        }

        public Criteria andCreaterguidGreaterThanOrEqualTo(String value) {
            addCriterion("CreaterGuid >=", value, "createrguid");
            return (Criteria) this;
        }

        public Criteria andCreaterguidLessThan(String value) {
            addCriterion("CreaterGuid <", value, "createrguid");
            return (Criteria) this;
        }

        public Criteria andCreaterguidLessThanOrEqualTo(String value) {
            addCriterion("CreaterGuid <=", value, "createrguid");
            return (Criteria) this;
        }

        public Criteria andCreaterguidLike(String value) {
            addCriterion("CreaterGuid like", value, "createrguid");
            return (Criteria) this;
        }

        public Criteria andCreaterguidNotLike(String value) {
            addCriterion("CreaterGuid not like", value, "createrguid");
            return (Criteria) this;
        }

        public Criteria andCreaterguidIn(List<String> values) {
            addCriterion("CreaterGuid in", values, "createrguid");
            return (Criteria) this;
        }

        public Criteria andCreaterguidNotIn(List<String> values) {
            addCriterion("CreaterGuid not in", values, "createrguid");
            return (Criteria) this;
        }

        public Criteria andCreaterguidBetween(String value1, String value2) {
            addCriterion("CreaterGuid between", value1, value2, "createrguid");
            return (Criteria) this;
        }

        public Criteria andCreaterguidNotBetween(String value1, String value2) {
            addCriterion("CreaterGuid not between", value1, value2, "createrguid");
            return (Criteria) this;
        }

        public Criteria andOwncolumnIsNull() {
            addCriterion("OwnColumn is null");
            return (Criteria) this;
        }

        public Criteria andOwncolumnIsNotNull() {
            addCriterion("OwnColumn is not null");
            return (Criteria) this;
        }

        public Criteria andOwncolumnEqualTo(String value) {
            addCriterion("OwnColumn =", value, "owncolumn");
            return (Criteria) this;
        }

        public Criteria andOwncolumnNotEqualTo(String value) {
            addCriterion("OwnColumn <>", value, "owncolumn");
            return (Criteria) this;
        }

        public Criteria andOwncolumnGreaterThan(String value) {
            addCriterion("OwnColumn >", value, "owncolumn");
            return (Criteria) this;
        }

        public Criteria andOwncolumnGreaterThanOrEqualTo(String value) {
            addCriterion("OwnColumn >=", value, "owncolumn");
            return (Criteria) this;
        }

        public Criteria andOwncolumnLessThan(String value) {
            addCriterion("OwnColumn <", value, "owncolumn");
            return (Criteria) this;
        }

        public Criteria andOwncolumnLessThanOrEqualTo(String value) {
            addCriterion("OwnColumn <=", value, "owncolumn");
            return (Criteria) this;
        }

        public Criteria andOwncolumnLike(String value) {
            addCriterion("OwnColumn like", value, "owncolumn");
            return (Criteria) this;
        }

        public Criteria andOwncolumnNotLike(String value) {
            addCriterion("OwnColumn not like", value, "owncolumn");
            return (Criteria) this;
        }

        public Criteria andOwncolumnIn(List<String> values) {
            addCriterion("OwnColumn in", values, "owncolumn");
            return (Criteria) this;
        }

        public Criteria andOwncolumnNotIn(List<String> values) {
            addCriterion("OwnColumn not in", values, "owncolumn");
            return (Criteria) this;
        }

        public Criteria andOwncolumnBetween(String value1, String value2) {
            addCriterion("OwnColumn between", value1, value2, "owncolumn");
            return (Criteria) this;
        }

        public Criteria andOwncolumnNotBetween(String value1, String value2) {
            addCriterion("OwnColumn not between", value1, value2, "owncolumn");
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

        public Criteria andModifytimeIsNull() {
            addCriterion("ModifyTime is null");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNotNull() {
            addCriterion("ModifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andModifytimeEqualTo(Date value) {
            addCriterion("ModifyTime =", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotEqualTo(Date value) {
            addCriterion("ModifyTime <>", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThan(Date value) {
            addCriterion("ModifyTime >", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ModifyTime >=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThan(Date value) {
            addCriterion("ModifyTime <", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThanOrEqualTo(Date value) {
            addCriterion("ModifyTime <=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeIn(List<Date> values) {
            addCriterion("ModifyTime in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotIn(List<Date> values) {
            addCriterion("ModifyTime not in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeBetween(Date value1, Date value2) {
            addCriterion("ModifyTime between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotBetween(Date value1, Date value2) {
            addCriterion("ModifyTime not between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andTasktitleIsNull() {
            addCriterion("TaskTitle is null");
            return (Criteria) this;
        }

        public Criteria andTasktitleIsNotNull() {
            addCriterion("TaskTitle is not null");
            return (Criteria) this;
        }

        public Criteria andTasktitleEqualTo(String value) {
            addCriterion("TaskTitle =", value, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleNotEqualTo(String value) {
            addCriterion("TaskTitle <>", value, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleGreaterThan(String value) {
            addCriterion("TaskTitle >", value, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleGreaterThanOrEqualTo(String value) {
            addCriterion("TaskTitle >=", value, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleLessThan(String value) {
            addCriterion("TaskTitle <", value, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleLessThanOrEqualTo(String value) {
            addCriterion("TaskTitle <=", value, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleLike(String value) {
            addCriterion("TaskTitle like", value, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleNotLike(String value) {
            addCriterion("TaskTitle not like", value, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleIn(List<String> values) {
            addCriterion("TaskTitle in", values, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleNotIn(List<String> values) {
            addCriterion("TaskTitle not in", values, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleBetween(String value1, String value2) {
            addCriterion("TaskTitle between", value1, value2, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleNotBetween(String value1, String value2) {
            addCriterion("TaskTitle not between", value1, value2, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTaskplaceIsNull() {
            addCriterion("TaskPlace is null");
            return (Criteria) this;
        }

        public Criteria andTaskplaceIsNotNull() {
            addCriterion("TaskPlace is not null");
            return (Criteria) this;
        }

        public Criteria andTaskplaceEqualTo(String value) {
            addCriterion("TaskPlace =", value, "taskplace");
            return (Criteria) this;
        }

        public Criteria andTaskplaceNotEqualTo(String value) {
            addCriterion("TaskPlace <>", value, "taskplace");
            return (Criteria) this;
        }

        public Criteria andTaskplaceGreaterThan(String value) {
            addCriterion("TaskPlace >", value, "taskplace");
            return (Criteria) this;
        }

        public Criteria andTaskplaceGreaterThanOrEqualTo(String value) {
            addCriterion("TaskPlace >=", value, "taskplace");
            return (Criteria) this;
        }

        public Criteria andTaskplaceLessThan(String value) {
            addCriterion("TaskPlace <", value, "taskplace");
            return (Criteria) this;
        }

        public Criteria andTaskplaceLessThanOrEqualTo(String value) {
            addCriterion("TaskPlace <=", value, "taskplace");
            return (Criteria) this;
        }

        public Criteria andTaskplaceLike(String value) {
            addCriterion("TaskPlace like", value, "taskplace");
            return (Criteria) this;
        }

        public Criteria andTaskplaceNotLike(String value) {
            addCriterion("TaskPlace not like", value, "taskplace");
            return (Criteria) this;
        }

        public Criteria andTaskplaceIn(List<String> values) {
            addCriterion("TaskPlace in", values, "taskplace");
            return (Criteria) this;
        }

        public Criteria andTaskplaceNotIn(List<String> values) {
            addCriterion("TaskPlace not in", values, "taskplace");
            return (Criteria) this;
        }

        public Criteria andTaskplaceBetween(String value1, String value2) {
            addCriterion("TaskPlace between", value1, value2, "taskplace");
            return (Criteria) this;
        }

        public Criteria andTaskplaceNotBetween(String value1, String value2) {
            addCriterion("TaskPlace not between", value1, value2, "taskplace");
            return (Criteria) this;
        }

        public Criteria andTaskremarkIsNull() {
            addCriterion("TaskRemark is null");
            return (Criteria) this;
        }

        public Criteria andTaskremarkIsNotNull() {
            addCriterion("TaskRemark is not null");
            return (Criteria) this;
        }

        public Criteria andTaskremarkEqualTo(String value) {
            addCriterion("TaskRemark =", value, "taskremark");
            return (Criteria) this;
        }

        public Criteria andTaskremarkNotEqualTo(String value) {
            addCriterion("TaskRemark <>", value, "taskremark");
            return (Criteria) this;
        }

        public Criteria andTaskremarkGreaterThan(String value) {
            addCriterion("TaskRemark >", value, "taskremark");
            return (Criteria) this;
        }

        public Criteria andTaskremarkGreaterThanOrEqualTo(String value) {
            addCriterion("TaskRemark >=", value, "taskremark");
            return (Criteria) this;
        }

        public Criteria andTaskremarkLessThan(String value) {
            addCriterion("TaskRemark <", value, "taskremark");
            return (Criteria) this;
        }

        public Criteria andTaskremarkLessThanOrEqualTo(String value) {
            addCriterion("TaskRemark <=", value, "taskremark");
            return (Criteria) this;
        }

        public Criteria andTaskremarkLike(String value) {
            addCriterion("TaskRemark like", value, "taskremark");
            return (Criteria) this;
        }

        public Criteria andTaskremarkNotLike(String value) {
            addCriterion("TaskRemark not like", value, "taskremark");
            return (Criteria) this;
        }

        public Criteria andTaskremarkIn(List<String> values) {
            addCriterion("TaskRemark in", values, "taskremark");
            return (Criteria) this;
        }

        public Criteria andTaskremarkNotIn(List<String> values) {
            addCriterion("TaskRemark not in", values, "taskremark");
            return (Criteria) this;
        }

        public Criteria andTaskremarkBetween(String value1, String value2) {
            addCriterion("TaskRemark between", value1, value2, "taskremark");
            return (Criteria) this;
        }

        public Criteria andTaskremarkNotBetween(String value1, String value2) {
            addCriterion("TaskRemark not between", value1, value2, "taskremark");
            return (Criteria) this;
        }

        public Criteria andTaskkeyworkIsNull() {
            addCriterion("TaskKeyWork is null");
            return (Criteria) this;
        }

        public Criteria andTaskkeyworkIsNotNull() {
            addCriterion("TaskKeyWork is not null");
            return (Criteria) this;
        }

        public Criteria andTaskkeyworkEqualTo(String value) {
            addCriterion("TaskKeyWork =", value, "taskkeywork");
            return (Criteria) this;
        }

        public Criteria andTaskkeyworkNotEqualTo(String value) {
            addCriterion("TaskKeyWork <>", value, "taskkeywork");
            return (Criteria) this;
        }

        public Criteria andTaskkeyworkGreaterThan(String value) {
            addCriterion("TaskKeyWork >", value, "taskkeywork");
            return (Criteria) this;
        }

        public Criteria andTaskkeyworkGreaterThanOrEqualTo(String value) {
            addCriterion("TaskKeyWork >=", value, "taskkeywork");
            return (Criteria) this;
        }

        public Criteria andTaskkeyworkLessThan(String value) {
            addCriterion("TaskKeyWork <", value, "taskkeywork");
            return (Criteria) this;
        }

        public Criteria andTaskkeyworkLessThanOrEqualTo(String value) {
            addCriterion("TaskKeyWork <=", value, "taskkeywork");
            return (Criteria) this;
        }

        public Criteria andTaskkeyworkLike(String value) {
            addCriterion("TaskKeyWork like", value, "taskkeywork");
            return (Criteria) this;
        }

        public Criteria andTaskkeyworkNotLike(String value) {
            addCriterion("TaskKeyWork not like", value, "taskkeywork");
            return (Criteria) this;
        }

        public Criteria andTaskkeyworkIn(List<String> values) {
            addCriterion("TaskKeyWork in", values, "taskkeywork");
            return (Criteria) this;
        }

        public Criteria andTaskkeyworkNotIn(List<String> values) {
            addCriterion("TaskKeyWork not in", values, "taskkeywork");
            return (Criteria) this;
        }

        public Criteria andTaskkeyworkBetween(String value1, String value2) {
            addCriterion("TaskKeyWork between", value1, value2, "taskkeywork");
            return (Criteria) this;
        }

        public Criteria andTaskkeyworkNotBetween(String value1, String value2) {
            addCriterion("TaskKeyWork not between", value1, value2, "taskkeywork");
            return (Criteria) this;
        }

        public Criteria andTaskstateIsNull() {
            addCriterion("TaskState is null");
            return (Criteria) this;
        }

        public Criteria andTaskstateIsNotNull() {
            addCriterion("TaskState is not null");
            return (Criteria) this;
        }

        public Criteria andTaskstateEqualTo(Integer value) {
            addCriterion("TaskState =", value, "taskstate");
            return (Criteria) this;
        }

        public Criteria andTaskstateNotEqualTo(Integer value) {
            addCriterion("TaskState <>", value, "taskstate");
            return (Criteria) this;
        }

        public Criteria andTaskstateGreaterThan(Integer value) {
            addCriterion("TaskState >", value, "taskstate");
            return (Criteria) this;
        }

        public Criteria andTaskstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("TaskState >=", value, "taskstate");
            return (Criteria) this;
        }

        public Criteria andTaskstateLessThan(Integer value) {
            addCriterion("TaskState <", value, "taskstate");
            return (Criteria) this;
        }

        public Criteria andTaskstateLessThanOrEqualTo(Integer value) {
            addCriterion("TaskState <=", value, "taskstate");
            return (Criteria) this;
        }

        public Criteria andTaskstateIn(List<Integer> values) {
            addCriterion("TaskState in", values, "taskstate");
            return (Criteria) this;
        }

        public Criteria andTaskstateNotIn(List<Integer> values) {
            addCriterion("TaskState not in", values, "taskstate");
            return (Criteria) this;
        }

        public Criteria andTaskstateBetween(Integer value1, Integer value2) {
            addCriterion("TaskState between", value1, value2, "taskstate");
            return (Criteria) this;
        }

        public Criteria andTaskstateNotBetween(Integer value1, Integer value2) {
            addCriterion("TaskState not between", value1, value2, "taskstate");
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

        public Criteria andTasktypeEqualTo(String value) {
            addCriterion("TaskType =", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeNotEqualTo(String value) {
            addCriterion("TaskType <>", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeGreaterThan(String value) {
            addCriterion("TaskType >", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeGreaterThanOrEqualTo(String value) {
            addCriterion("TaskType >=", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeLessThan(String value) {
            addCriterion("TaskType <", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeLessThanOrEqualTo(String value) {
            addCriterion("TaskType <=", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeLike(String value) {
            addCriterion("TaskType like", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeNotLike(String value) {
            addCriterion("TaskType not like", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeIn(List<String> values) {
            addCriterion("TaskType in", values, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeNotIn(List<String> values) {
            addCriterion("TaskType not in", values, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeBetween(String value1, String value2) {
            addCriterion("TaskType between", value1, value2, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeNotBetween(String value1, String value2) {
            addCriterion("TaskType not between", value1, value2, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasklevelIsNull() {
            addCriterion("TaskLevel is null");
            return (Criteria) this;
        }

        public Criteria andTasklevelIsNotNull() {
            addCriterion("TaskLevel is not null");
            return (Criteria) this;
        }

        public Criteria andTasklevelEqualTo(String value) {
            addCriterion("TaskLevel =", value, "tasklevel");
            return (Criteria) this;
        }

        public Criteria andTasklevelNotEqualTo(String value) {
            addCriterion("TaskLevel <>", value, "tasklevel");
            return (Criteria) this;
        }

        public Criteria andTasklevelGreaterThan(String value) {
            addCriterion("TaskLevel >", value, "tasklevel");
            return (Criteria) this;
        }

        public Criteria andTasklevelGreaterThanOrEqualTo(String value) {
            addCriterion("TaskLevel >=", value, "tasklevel");
            return (Criteria) this;
        }

        public Criteria andTasklevelLessThan(String value) {
            addCriterion("TaskLevel <", value, "tasklevel");
            return (Criteria) this;
        }

        public Criteria andTasklevelLessThanOrEqualTo(String value) {
            addCriterion("TaskLevel <=", value, "tasklevel");
            return (Criteria) this;
        }

        public Criteria andTasklevelLike(String value) {
            addCriterion("TaskLevel like", value, "tasklevel");
            return (Criteria) this;
        }

        public Criteria andTasklevelNotLike(String value) {
            addCriterion("TaskLevel not like", value, "tasklevel");
            return (Criteria) this;
        }

        public Criteria andTasklevelIn(List<String> values) {
            addCriterion("TaskLevel in", values, "tasklevel");
            return (Criteria) this;
        }

        public Criteria andTasklevelNotIn(List<String> values) {
            addCriterion("TaskLevel not in", values, "tasklevel");
            return (Criteria) this;
        }

        public Criteria andTasklevelBetween(String value1, String value2) {
            addCriterion("TaskLevel between", value1, value2, "tasklevel");
            return (Criteria) this;
        }

        public Criteria andTasklevelNotBetween(String value1, String value2) {
            addCriterion("TaskLevel not between", value1, value2, "tasklevel");
            return (Criteria) this;
        }

        public Criteria andProgramcodeIsNull() {
            addCriterion("ProgramCode is null");
            return (Criteria) this;
        }

        public Criteria andProgramcodeIsNotNull() {
            addCriterion("ProgramCode is not null");
            return (Criteria) this;
        }

        public Criteria andProgramcodeEqualTo(String value) {
            addCriterion("ProgramCode =", value, "programcode");
            return (Criteria) this;
        }

        public Criteria andProgramcodeNotEqualTo(String value) {
            addCriterion("ProgramCode <>", value, "programcode");
            return (Criteria) this;
        }

        public Criteria andProgramcodeGreaterThan(String value) {
            addCriterion("ProgramCode >", value, "programcode");
            return (Criteria) this;
        }

        public Criteria andProgramcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ProgramCode >=", value, "programcode");
            return (Criteria) this;
        }

        public Criteria andProgramcodeLessThan(String value) {
            addCriterion("ProgramCode <", value, "programcode");
            return (Criteria) this;
        }

        public Criteria andProgramcodeLessThanOrEqualTo(String value) {
            addCriterion("ProgramCode <=", value, "programcode");
            return (Criteria) this;
        }

        public Criteria andProgramcodeLike(String value) {
            addCriterion("ProgramCode like", value, "programcode");
            return (Criteria) this;
        }

        public Criteria andProgramcodeNotLike(String value) {
            addCriterion("ProgramCode not like", value, "programcode");
            return (Criteria) this;
        }

        public Criteria andProgramcodeIn(List<String> values) {
            addCriterion("ProgramCode in", values, "programcode");
            return (Criteria) this;
        }

        public Criteria andProgramcodeNotIn(List<String> values) {
            addCriterion("ProgramCode not in", values, "programcode");
            return (Criteria) this;
        }

        public Criteria andProgramcodeBetween(String value1, String value2) {
            addCriterion("ProgramCode between", value1, value2, "programcode");
            return (Criteria) this;
        }

        public Criteria andProgramcodeNotBetween(String value1, String value2) {
            addCriterion("ProgramCode not between", value1, value2, "programcode");
            return (Criteria) this;
        }

        public Criteria andProgramnameIsNull() {
            addCriterion("ProgramName is null");
            return (Criteria) this;
        }

        public Criteria andProgramnameIsNotNull() {
            addCriterion("ProgramName is not null");
            return (Criteria) this;
        }

        public Criteria andProgramnameEqualTo(String value) {
            addCriterion("ProgramName =", value, "programname");
            return (Criteria) this;
        }

        public Criteria andProgramnameNotEqualTo(String value) {
            addCriterion("ProgramName <>", value, "programname");
            return (Criteria) this;
        }

        public Criteria andProgramnameGreaterThan(String value) {
            addCriterion("ProgramName >", value, "programname");
            return (Criteria) this;
        }

        public Criteria andProgramnameGreaterThanOrEqualTo(String value) {
            addCriterion("ProgramName >=", value, "programname");
            return (Criteria) this;
        }

        public Criteria andProgramnameLessThan(String value) {
            addCriterion("ProgramName <", value, "programname");
            return (Criteria) this;
        }

        public Criteria andProgramnameLessThanOrEqualTo(String value) {
            addCriterion("ProgramName <=", value, "programname");
            return (Criteria) this;
        }

        public Criteria andProgramnameLike(String value) {
            addCriterion("ProgramName like", value, "programname");
            return (Criteria) this;
        }

        public Criteria andProgramnameNotLike(String value) {
            addCriterion("ProgramName not like", value, "programname");
            return (Criteria) this;
        }

        public Criteria andProgramnameIn(List<String> values) {
            addCriterion("ProgramName in", values, "programname");
            return (Criteria) this;
        }

        public Criteria andProgramnameNotIn(List<String> values) {
            addCriterion("ProgramName not in", values, "programname");
            return (Criteria) this;
        }

        public Criteria andProgramnameBetween(String value1, String value2) {
            addCriterion("ProgramName between", value1, value2, "programname");
            return (Criteria) this;
        }

        public Criteria andProgramnameNotBetween(String value1, String value2) {
            addCriterion("ProgramName not between", value1, value2, "programname");
            return (Criteria) this;
        }

        public Criteria andIsspecialIsNull() {
            addCriterion("IsSpecial is null");
            return (Criteria) this;
        }

        public Criteria andIsspecialIsNotNull() {
            addCriterion("IsSpecial is not null");
            return (Criteria) this;
        }

        public Criteria andIsspecialEqualTo(Integer value) {
            addCriterion("IsSpecial =", value, "isspecial");
            return (Criteria) this;
        }

        public Criteria andIsspecialNotEqualTo(Integer value) {
            addCriterion("IsSpecial <>", value, "isspecial");
            return (Criteria) this;
        }

        public Criteria andIsspecialGreaterThan(Integer value) {
            addCriterion("IsSpecial >", value, "isspecial");
            return (Criteria) this;
        }

        public Criteria andIsspecialGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsSpecial >=", value, "isspecial");
            return (Criteria) this;
        }

        public Criteria andIsspecialLessThan(Integer value) {
            addCriterion("IsSpecial <", value, "isspecial");
            return (Criteria) this;
        }

        public Criteria andIsspecialLessThanOrEqualTo(Integer value) {
            addCriterion("IsSpecial <=", value, "isspecial");
            return (Criteria) this;
        }

        public Criteria andIsspecialIn(List<Integer> values) {
            addCriterion("IsSpecial in", values, "isspecial");
            return (Criteria) this;
        }

        public Criteria andIsspecialNotIn(List<Integer> values) {
            addCriterion("IsSpecial not in", values, "isspecial");
            return (Criteria) this;
        }

        public Criteria andIsspecialBetween(Integer value1, Integer value2) {
            addCriterion("IsSpecial between", value1, value2, "isspecial");
            return (Criteria) this;
        }

        public Criteria andIsspecialNotBetween(Integer value1, Integer value2) {
            addCriterion("IsSpecial not between", value1, value2, "isspecial");
            return (Criteria) this;
        }

        public Criteria andSourcetypeIsNull() {
            addCriterion("SourceType is null");
            return (Criteria) this;
        }

        public Criteria andSourcetypeIsNotNull() {
            addCriterion("SourceType is not null");
            return (Criteria) this;
        }

        public Criteria andSourcetypeEqualTo(String value) {
            addCriterion("SourceType =", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeNotEqualTo(String value) {
            addCriterion("SourceType <>", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeGreaterThan(String value) {
            addCriterion("SourceType >", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeGreaterThanOrEqualTo(String value) {
            addCriterion("SourceType >=", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeLessThan(String value) {
            addCriterion("SourceType <", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeLessThanOrEqualTo(String value) {
            addCriterion("SourceType <=", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeLike(String value) {
            addCriterion("SourceType like", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeNotLike(String value) {
            addCriterion("SourceType not like", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeIn(List<String> values) {
            addCriterion("SourceType in", values, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeNotIn(List<String> values) {
            addCriterion("SourceType not in", values, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeBetween(String value1, String value2) {
            addCriterion("SourceType between", value1, value2, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeNotBetween(String value1, String value2) {
            addCriterion("SourceType not between", value1, value2, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andPasserIsNull() {
            addCriterion("Passer is null");
            return (Criteria) this;
        }

        public Criteria andPasserIsNotNull() {
            addCriterion("Passer is not null");
            return (Criteria) this;
        }

        public Criteria andPasserEqualTo(String value) {
            addCriterion("Passer =", value, "passer");
            return (Criteria) this;
        }

        public Criteria andPasserNotEqualTo(String value) {
            addCriterion("Passer <>", value, "passer");
            return (Criteria) this;
        }

        public Criteria andPasserGreaterThan(String value) {
            addCriterion("Passer >", value, "passer");
            return (Criteria) this;
        }

        public Criteria andPasserGreaterThanOrEqualTo(String value) {
            addCriterion("Passer >=", value, "passer");
            return (Criteria) this;
        }

        public Criteria andPasserLessThan(String value) {
            addCriterion("Passer <", value, "passer");
            return (Criteria) this;
        }

        public Criteria andPasserLessThanOrEqualTo(String value) {
            addCriterion("Passer <=", value, "passer");
            return (Criteria) this;
        }

        public Criteria andPasserLike(String value) {
            addCriterion("Passer like", value, "passer");
            return (Criteria) this;
        }

        public Criteria andPasserNotLike(String value) {
            addCriterion("Passer not like", value, "passer");
            return (Criteria) this;
        }

        public Criteria andPasserIn(List<String> values) {
            addCriterion("Passer in", values, "passer");
            return (Criteria) this;
        }

        public Criteria andPasserNotIn(List<String> values) {
            addCriterion("Passer not in", values, "passer");
            return (Criteria) this;
        }

        public Criteria andPasserBetween(String value1, String value2) {
            addCriterion("Passer between", value1, value2, "passer");
            return (Criteria) this;
        }

        public Criteria andPasserNotBetween(String value1, String value2) {
            addCriterion("Passer not between", value1, value2, "passer");
            return (Criteria) this;
        }

        public Criteria andPassadviceIsNull() {
            addCriterion("Passadvice is null");
            return (Criteria) this;
        }

        public Criteria andPassadviceIsNotNull() {
            addCriterion("Passadvice is not null");
            return (Criteria) this;
        }

        public Criteria andPassadviceEqualTo(String value) {
            addCriterion("Passadvice =", value, "passadvice");
            return (Criteria) this;
        }

        public Criteria andPassadviceNotEqualTo(String value) {
            addCriterion("Passadvice <>", value, "passadvice");
            return (Criteria) this;
        }

        public Criteria andPassadviceGreaterThan(String value) {
            addCriterion("Passadvice >", value, "passadvice");
            return (Criteria) this;
        }

        public Criteria andPassadviceGreaterThanOrEqualTo(String value) {
            addCriterion("Passadvice >=", value, "passadvice");
            return (Criteria) this;
        }

        public Criteria andPassadviceLessThan(String value) {
            addCriterion("Passadvice <", value, "passadvice");
            return (Criteria) this;
        }

        public Criteria andPassadviceLessThanOrEqualTo(String value) {
            addCriterion("Passadvice <=", value, "passadvice");
            return (Criteria) this;
        }

        public Criteria andPassadviceLike(String value) {
            addCriterion("Passadvice like", value, "passadvice");
            return (Criteria) this;
        }

        public Criteria andPassadviceNotLike(String value) {
            addCriterion("Passadvice not like", value, "passadvice");
            return (Criteria) this;
        }

        public Criteria andPassadviceIn(List<String> values) {
            addCriterion("Passadvice in", values, "passadvice");
            return (Criteria) this;
        }

        public Criteria andPassadviceNotIn(List<String> values) {
            addCriterion("Passadvice not in", values, "passadvice");
            return (Criteria) this;
        }

        public Criteria andPassadviceBetween(String value1, String value2) {
            addCriterion("Passadvice between", value1, value2, "passadvice");
            return (Criteria) this;
        }

        public Criteria andPassadviceNotBetween(String value1, String value2) {
            addCriterion("Passadvice not between", value1, value2, "passadvice");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("EndTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("EndTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("EndTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("EndTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("EndTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("EndTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("EndTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("EndTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("EndTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("EndTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("EndTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("EndTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andChargemanIsNull() {
            addCriterion("ChargeMan is null");
            return (Criteria) this;
        }

        public Criteria andChargemanIsNotNull() {
            addCriterion("ChargeMan is not null");
            return (Criteria) this;
        }

        public Criteria andChargemanEqualTo(String value) {
            addCriterion("ChargeMan =", value, "chargeman");
            return (Criteria) this;
        }

        public Criteria andChargemanNotEqualTo(String value) {
            addCriterion("ChargeMan <>", value, "chargeman");
            return (Criteria) this;
        }

        public Criteria andChargemanGreaterThan(String value) {
            addCriterion("ChargeMan >", value, "chargeman");
            return (Criteria) this;
        }

        public Criteria andChargemanGreaterThanOrEqualTo(String value) {
            addCriterion("ChargeMan >=", value, "chargeman");
            return (Criteria) this;
        }

        public Criteria andChargemanLessThan(String value) {
            addCriterion("ChargeMan <", value, "chargeman");
            return (Criteria) this;
        }

        public Criteria andChargemanLessThanOrEqualTo(String value) {
            addCriterion("ChargeMan <=", value, "chargeman");
            return (Criteria) this;
        }

        public Criteria andChargemanLike(String value) {
            addCriterion("ChargeMan like", value, "chargeman");
            return (Criteria) this;
        }

        public Criteria andChargemanNotLike(String value) {
            addCriterion("ChargeMan not like", value, "chargeman");
            return (Criteria) this;
        }

        public Criteria andChargemanIn(List<String> values) {
            addCriterion("ChargeMan in", values, "chargeman");
            return (Criteria) this;
        }

        public Criteria andChargemanNotIn(List<String> values) {
            addCriterion("ChargeMan not in", values, "chargeman");
            return (Criteria) this;
        }

        public Criteria andChargemanBetween(String value1, String value2) {
            addCriterion("ChargeMan between", value1, value2, "chargeman");
            return (Criteria) this;
        }

        public Criteria andChargemanNotBetween(String value1, String value2) {
            addCriterion("ChargeMan not between", value1, value2, "chargeman");
            return (Criteria) this;
        }

        public Criteria andIscaifangIsNull() {
            addCriterion("IsCaifang is null");
            return (Criteria) this;
        }

        public Criteria andIscaifangIsNotNull() {
            addCriterion("IsCaifang is not null");
            return (Criteria) this;
        }

        public Criteria andIscaifangEqualTo(Integer value) {
            addCriterion("IsCaifang =", value, "iscaifang");
            return (Criteria) this;
        }

        public Criteria andIscaifangNotEqualTo(Integer value) {
            addCriterion("IsCaifang <>", value, "iscaifang");
            return (Criteria) this;
        }

        public Criteria andIscaifangGreaterThan(Integer value) {
            addCriterion("IsCaifang >", value, "iscaifang");
            return (Criteria) this;
        }

        public Criteria andIscaifangGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsCaifang >=", value, "iscaifang");
            return (Criteria) this;
        }

        public Criteria andIscaifangLessThan(Integer value) {
            addCriterion("IsCaifang <", value, "iscaifang");
            return (Criteria) this;
        }

        public Criteria andIscaifangLessThanOrEqualTo(Integer value) {
            addCriterion("IsCaifang <=", value, "iscaifang");
            return (Criteria) this;
        }

        public Criteria andIscaifangIn(List<Integer> values) {
            addCriterion("IsCaifang in", values, "iscaifang");
            return (Criteria) this;
        }

        public Criteria andIscaifangNotIn(List<Integer> values) {
            addCriterion("IsCaifang not in", values, "iscaifang");
            return (Criteria) this;
        }

        public Criteria andIscaifangBetween(Integer value1, Integer value2) {
            addCriterion("IsCaifang between", value1, value2, "iscaifang");
            return (Criteria) this;
        }

        public Criteria andIscaifangNotBetween(Integer value1, Integer value2) {
            addCriterion("IsCaifang not between", value1, value2, "iscaifang");
            return (Criteria) this;
        }

        public Criteria andReporterIsNull() {
            addCriterion("Reporter is null");
            return (Criteria) this;
        }

        public Criteria andReporterIsNotNull() {
            addCriterion("Reporter is not null");
            return (Criteria) this;
        }

        public Criteria andReporterEqualTo(String value) {
            addCriterion("Reporter =", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterNotEqualTo(String value) {
            addCriterion("Reporter <>", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterGreaterThan(String value) {
            addCriterion("Reporter >", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterGreaterThanOrEqualTo(String value) {
            addCriterion("Reporter >=", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterLessThan(String value) {
            addCriterion("Reporter <", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterLessThanOrEqualTo(String value) {
            addCriterion("Reporter <=", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterLike(String value) {
            addCriterion("Reporter like", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterNotLike(String value) {
            addCriterion("Reporter not like", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterIn(List<String> values) {
            addCriterion("Reporter in", values, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterNotIn(List<String> values) {
            addCriterion("Reporter not in", values, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterBetween(String value1, String value2) {
            addCriterion("Reporter between", value1, value2, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterNotBetween(String value1, String value2) {
            addCriterion("Reporter not between", value1, value2, "reporter");
            return (Criteria) this;
        }

        public Criteria andLinkguidIsNull() {
            addCriterion("Linkguid is null");
            return (Criteria) this;
        }

        public Criteria andLinkguidIsNotNull() {
            addCriterion("Linkguid is not null");
            return (Criteria) this;
        }

        public Criteria andLinkguidEqualTo(String value) {
            addCriterion("Linkguid =", value, "linkguid");
            return (Criteria) this;
        }

        public Criteria andLinkguidNotEqualTo(String value) {
            addCriterion("Linkguid <>", value, "linkguid");
            return (Criteria) this;
        }

        public Criteria andLinkguidGreaterThan(String value) {
            addCriterion("Linkguid >", value, "linkguid");
            return (Criteria) this;
        }

        public Criteria andLinkguidGreaterThanOrEqualTo(String value) {
            addCriterion("Linkguid >=", value, "linkguid");
            return (Criteria) this;
        }

        public Criteria andLinkguidLessThan(String value) {
            addCriterion("Linkguid <", value, "linkguid");
            return (Criteria) this;
        }

        public Criteria andLinkguidLessThanOrEqualTo(String value) {
            addCriterion("Linkguid <=", value, "linkguid");
            return (Criteria) this;
        }

        public Criteria andLinkguidLike(String value) {
            addCriterion("Linkguid like", value, "linkguid");
            return (Criteria) this;
        }

        public Criteria andLinkguidNotLike(String value) {
            addCriterion("Linkguid not like", value, "linkguid");
            return (Criteria) this;
        }

        public Criteria andLinkguidIn(List<String> values) {
            addCriterion("Linkguid in", values, "linkguid");
            return (Criteria) this;
        }

        public Criteria andLinkguidNotIn(List<String> values) {
            addCriterion("Linkguid not in", values, "linkguid");
            return (Criteria) this;
        }

        public Criteria andLinkguidBetween(String value1, String value2) {
            addCriterion("Linkguid between", value1, value2, "linkguid");
            return (Criteria) this;
        }

        public Criteria andLinkguidNotBetween(String value1, String value2) {
            addCriterion("Linkguid not between", value1, value2, "linkguid");
            return (Criteria) this;
        }

        public Criteria andLinktitleIsNull() {
            addCriterion("LinkTitle is null");
            return (Criteria) this;
        }

        public Criteria andLinktitleIsNotNull() {
            addCriterion("LinkTitle is not null");
            return (Criteria) this;
        }

        public Criteria andLinktitleEqualTo(String value) {
            addCriterion("LinkTitle =", value, "linktitle");
            return (Criteria) this;
        }

        public Criteria andLinktitleNotEqualTo(String value) {
            addCriterion("LinkTitle <>", value, "linktitle");
            return (Criteria) this;
        }

        public Criteria andLinktitleGreaterThan(String value) {
            addCriterion("LinkTitle >", value, "linktitle");
            return (Criteria) this;
        }

        public Criteria andLinktitleGreaterThanOrEqualTo(String value) {
            addCriterion("LinkTitle >=", value, "linktitle");
            return (Criteria) this;
        }

        public Criteria andLinktitleLessThan(String value) {
            addCriterion("LinkTitle <", value, "linktitle");
            return (Criteria) this;
        }

        public Criteria andLinktitleLessThanOrEqualTo(String value) {
            addCriterion("LinkTitle <=", value, "linktitle");
            return (Criteria) this;
        }

        public Criteria andLinktitleLike(String value) {
            addCriterion("LinkTitle like", value, "linktitle");
            return (Criteria) this;
        }

        public Criteria andLinktitleNotLike(String value) {
            addCriterion("LinkTitle not like", value, "linktitle");
            return (Criteria) this;
        }

        public Criteria andLinktitleIn(List<String> values) {
            addCriterion("LinkTitle in", values, "linktitle");
            return (Criteria) this;
        }

        public Criteria andLinktitleNotIn(List<String> values) {
            addCriterion("LinkTitle not in", values, "linktitle");
            return (Criteria) this;
        }

        public Criteria andLinktitleBetween(String value1, String value2) {
            addCriterion("LinkTitle between", value1, value2, "linktitle");
            return (Criteria) this;
        }

        public Criteria andLinktitleNotBetween(String value1, String value2) {
            addCriterion("LinkTitle not between", value1, value2, "linktitle");
            return (Criteria) this;
        }

        public Criteria andCaifangremarkIsNull() {
            addCriterion("CaifangRemark is null");
            return (Criteria) this;
        }

        public Criteria andCaifangremarkIsNotNull() {
            addCriterion("CaifangRemark is not null");
            return (Criteria) this;
        }

        public Criteria andCaifangremarkEqualTo(String value) {
            addCriterion("CaifangRemark =", value, "caifangremark");
            return (Criteria) this;
        }

        public Criteria andCaifangremarkNotEqualTo(String value) {
            addCriterion("CaifangRemark <>", value, "caifangremark");
            return (Criteria) this;
        }

        public Criteria andCaifangremarkGreaterThan(String value) {
            addCriterion("CaifangRemark >", value, "caifangremark");
            return (Criteria) this;
        }

        public Criteria andCaifangremarkGreaterThanOrEqualTo(String value) {
            addCriterion("CaifangRemark >=", value, "caifangremark");
            return (Criteria) this;
        }

        public Criteria andCaifangremarkLessThan(String value) {
            addCriterion("CaifangRemark <", value, "caifangremark");
            return (Criteria) this;
        }

        public Criteria andCaifangremarkLessThanOrEqualTo(String value) {
            addCriterion("CaifangRemark <=", value, "caifangremark");
            return (Criteria) this;
        }

        public Criteria andCaifangremarkLike(String value) {
            addCriterion("CaifangRemark like", value, "caifangremark");
            return (Criteria) this;
        }

        public Criteria andCaifangremarkNotLike(String value) {
            addCriterion("CaifangRemark not like", value, "caifangremark");
            return (Criteria) this;
        }

        public Criteria andCaifangremarkIn(List<String> values) {
            addCriterion("CaifangRemark in", values, "caifangremark");
            return (Criteria) this;
        }

        public Criteria andCaifangremarkNotIn(List<String> values) {
            addCriterion("CaifangRemark not in", values, "caifangremark");
            return (Criteria) this;
        }

        public Criteria andCaifangremarkBetween(String value1, String value2) {
            addCriterion("CaifangRemark between", value1, value2, "caifangremark");
            return (Criteria) this;
        }

        public Criteria andCaifangremarkNotBetween(String value1, String value2) {
            addCriterion("CaifangRemark not between", value1, value2, "caifangremark");
            return (Criteria) this;
        }

        public Criteria andIsopenIsNull() {
            addCriterion("IsOpen is null");
            return (Criteria) this;
        }

        public Criteria andIsopenIsNotNull() {
            addCriterion("IsOpen is not null");
            return (Criteria) this;
        }

        public Criteria andIsopenEqualTo(Integer value) {
            addCriterion("IsOpen =", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenNotEqualTo(Integer value) {
            addCriterion("IsOpen <>", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenGreaterThan(Integer value) {
            addCriterion("IsOpen >", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsOpen >=", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenLessThan(Integer value) {
            addCriterion("IsOpen <", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenLessThanOrEqualTo(Integer value) {
            addCriterion("IsOpen <=", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenIn(List<Integer> values) {
            addCriterion("IsOpen in", values, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenNotIn(List<Integer> values) {
            addCriterion("IsOpen not in", values, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenBetween(Integer value1, Integer value2) {
            addCriterion("IsOpen between", value1, value2, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenNotBetween(Integer value1, Integer value2) {
            addCriterion("IsOpen not between", value1, value2, "isopen");
            return (Criteria) this;
        }

        public Criteria andDeviceidsIsNull() {
            addCriterion("DeviceIDs is null");
            return (Criteria) this;
        }

        public Criteria andDeviceidsIsNotNull() {
            addCriterion("DeviceIDs is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceidsEqualTo(String value) {
            addCriterion("DeviceIDs =", value, "deviceids");
            return (Criteria) this;
        }

        public Criteria andDeviceidsNotEqualTo(String value) {
            addCriterion("DeviceIDs <>", value, "deviceids");
            return (Criteria) this;
        }

        public Criteria andDeviceidsGreaterThan(String value) {
            addCriterion("DeviceIDs >", value, "deviceids");
            return (Criteria) this;
        }

        public Criteria andDeviceidsGreaterThanOrEqualTo(String value) {
            addCriterion("DeviceIDs >=", value, "deviceids");
            return (Criteria) this;
        }

        public Criteria andDeviceidsLessThan(String value) {
            addCriterion("DeviceIDs <", value, "deviceids");
            return (Criteria) this;
        }

        public Criteria andDeviceidsLessThanOrEqualTo(String value) {
            addCriterion("DeviceIDs <=", value, "deviceids");
            return (Criteria) this;
        }

        public Criteria andDeviceidsLike(String value) {
            addCriterion("DeviceIDs like", value, "deviceids");
            return (Criteria) this;
        }

        public Criteria andDeviceidsNotLike(String value) {
            addCriterion("DeviceIDs not like", value, "deviceids");
            return (Criteria) this;
        }

        public Criteria andDeviceidsIn(List<String> values) {
            addCriterion("DeviceIDs in", values, "deviceids");
            return (Criteria) this;
        }

        public Criteria andDeviceidsNotIn(List<String> values) {
            addCriterion("DeviceIDs not in", values, "deviceids");
            return (Criteria) this;
        }

        public Criteria andDeviceidsBetween(String value1, String value2) {
            addCriterion("DeviceIDs between", value1, value2, "deviceids");
            return (Criteria) this;
        }

        public Criteria andDeviceidsNotBetween(String value1, String value2) {
            addCriterion("DeviceIDs not between", value1, value2, "deviceids");
            return (Criteria) this;
        }

        public Criteria andBanmiantypeIsNull() {
            addCriterion("BANMIANTYPE is null");
            return (Criteria) this;
        }

        public Criteria andBanmiantypeIsNotNull() {
            addCriterion("BANMIANTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBanmiantypeEqualTo(String value) {
            addCriterion("BANMIANTYPE =", value, "banmiantype");
            return (Criteria) this;
        }

        public Criteria andBanmiantypeNotEqualTo(String value) {
            addCriterion("BANMIANTYPE <>", value, "banmiantype");
            return (Criteria) this;
        }

        public Criteria andBanmiantypeGreaterThan(String value) {
            addCriterion("BANMIANTYPE >", value, "banmiantype");
            return (Criteria) this;
        }

        public Criteria andBanmiantypeGreaterThanOrEqualTo(String value) {
            addCriterion("BANMIANTYPE >=", value, "banmiantype");
            return (Criteria) this;
        }

        public Criteria andBanmiantypeLessThan(String value) {
            addCriterion("BANMIANTYPE <", value, "banmiantype");
            return (Criteria) this;
        }

        public Criteria andBanmiantypeLessThanOrEqualTo(String value) {
            addCriterion("BANMIANTYPE <=", value, "banmiantype");
            return (Criteria) this;
        }

        public Criteria andBanmiantypeLike(String value) {
            addCriterion("BANMIANTYPE like", value, "banmiantype");
            return (Criteria) this;
        }

        public Criteria andBanmiantypeNotLike(String value) {
            addCriterion("BANMIANTYPE not like", value, "banmiantype");
            return (Criteria) this;
        }

        public Criteria andBanmiantypeIn(List<String> values) {
            addCriterion("BANMIANTYPE in", values, "banmiantype");
            return (Criteria) this;
        }

        public Criteria andBanmiantypeNotIn(List<String> values) {
            addCriterion("BANMIANTYPE not in", values, "banmiantype");
            return (Criteria) this;
        }

        public Criteria andBanmiantypeBetween(String value1, String value2) {
            addCriterion("BANMIANTYPE between", value1, value2, "banmiantype");
            return (Criteria) this;
        }

        public Criteria andBanmiantypeNotBetween(String value1, String value2) {
            addCriterion("BANMIANTYPE not between", value1, value2, "banmiantype");
            return (Criteria) this;
        }

        public Criteria andBanmianguidIsNull() {
            addCriterion("BANMIANGUID is null");
            return (Criteria) this;
        }

        public Criteria andBanmianguidIsNotNull() {
            addCriterion("BANMIANGUID is not null");
            return (Criteria) this;
        }

        public Criteria andBanmianguidEqualTo(String value) {
            addCriterion("BANMIANGUID =", value, "banmianguid");
            return (Criteria) this;
        }

        public Criteria andBanmianguidNotEqualTo(String value) {
            addCriterion("BANMIANGUID <>", value, "banmianguid");
            return (Criteria) this;
        }

        public Criteria andBanmianguidGreaterThan(String value) {
            addCriterion("BANMIANGUID >", value, "banmianguid");
            return (Criteria) this;
        }

        public Criteria andBanmianguidGreaterThanOrEqualTo(String value) {
            addCriterion("BANMIANGUID >=", value, "banmianguid");
            return (Criteria) this;
        }

        public Criteria andBanmianguidLessThan(String value) {
            addCriterion("BANMIANGUID <", value, "banmianguid");
            return (Criteria) this;
        }

        public Criteria andBanmianguidLessThanOrEqualTo(String value) {
            addCriterion("BANMIANGUID <=", value, "banmianguid");
            return (Criteria) this;
        }

        public Criteria andBanmianguidLike(String value) {
            addCriterion("BANMIANGUID like", value, "banmianguid");
            return (Criteria) this;
        }

        public Criteria andBanmianguidNotLike(String value) {
            addCriterion("BANMIANGUID not like", value, "banmianguid");
            return (Criteria) this;
        }

        public Criteria andBanmianguidIn(List<String> values) {
            addCriterion("BANMIANGUID in", values, "banmianguid");
            return (Criteria) this;
        }

        public Criteria andBanmianguidNotIn(List<String> values) {
            addCriterion("BANMIANGUID not in", values, "banmianguid");
            return (Criteria) this;
        }

        public Criteria andBanmianguidBetween(String value1, String value2) {
            addCriterion("BANMIANGUID between", value1, value2, "banmianguid");
            return (Criteria) this;
        }

        public Criteria andBanmianguidNotBetween(String value1, String value2) {
            addCriterion("BANMIANGUID not between", value1, value2, "banmianguid");
            return (Criteria) this;
        }

        public Criteria andInpeopleIsNull() {
            addCriterion("INPEOPLE is null");
            return (Criteria) this;
        }

        public Criteria andInpeopleIsNotNull() {
            addCriterion("INPEOPLE is not null");
            return (Criteria) this;
        }

        public Criteria andInpeopleEqualTo(String value) {
            addCriterion("INPEOPLE =", value, "inpeople");
            return (Criteria) this;
        }

        public Criteria andInpeopleNotEqualTo(String value) {
            addCriterion("INPEOPLE <>", value, "inpeople");
            return (Criteria) this;
        }

        public Criteria andInpeopleGreaterThan(String value) {
            addCriterion("INPEOPLE >", value, "inpeople");
            return (Criteria) this;
        }

        public Criteria andInpeopleGreaterThanOrEqualTo(String value) {
            addCriterion("INPEOPLE >=", value, "inpeople");
            return (Criteria) this;
        }

        public Criteria andInpeopleLessThan(String value) {
            addCriterion("INPEOPLE <", value, "inpeople");
            return (Criteria) this;
        }

        public Criteria andInpeopleLessThanOrEqualTo(String value) {
            addCriterion("INPEOPLE <=", value, "inpeople");
            return (Criteria) this;
        }

        public Criteria andInpeopleLike(String value) {
            addCriterion("INPEOPLE like", value, "inpeople");
            return (Criteria) this;
        }

        public Criteria andInpeopleNotLike(String value) {
            addCriterion("INPEOPLE not like", value, "inpeople");
            return (Criteria) this;
        }

        public Criteria andInpeopleIn(List<String> values) {
            addCriterion("INPEOPLE in", values, "inpeople");
            return (Criteria) this;
        }

        public Criteria andInpeopleNotIn(List<String> values) {
            addCriterion("INPEOPLE not in", values, "inpeople");
            return (Criteria) this;
        }

        public Criteria andInpeopleBetween(String value1, String value2) {
            addCriterion("INPEOPLE between", value1, value2, "inpeople");
            return (Criteria) this;
        }

        public Criteria andInpeopleNotBetween(String value1, String value2) {
            addCriterion("INPEOPLE not between", value1, value2, "inpeople");
            return (Criteria) this;
        }

        public Criteria andAllinpeopleIsNull() {
            addCriterion("ALLINPEOPLE is null");
            return (Criteria) this;
        }

        public Criteria andAllinpeopleIsNotNull() {
            addCriterion("ALLINPEOPLE is not null");
            return (Criteria) this;
        }

        public Criteria andAllinpeopleEqualTo(String value) {
            addCriterion("ALLINPEOPLE =", value, "allinpeople");
            return (Criteria) this;
        }

        public Criteria andAllinpeopleNotEqualTo(String value) {
            addCriterion("ALLINPEOPLE <>", value, "allinpeople");
            return (Criteria) this;
        }

        public Criteria andAllinpeopleGreaterThan(String value) {
            addCriterion("ALLINPEOPLE >", value, "allinpeople");
            return (Criteria) this;
        }

        public Criteria andAllinpeopleGreaterThanOrEqualTo(String value) {
            addCriterion("ALLINPEOPLE >=", value, "allinpeople");
            return (Criteria) this;
        }

        public Criteria andAllinpeopleLessThan(String value) {
            addCriterion("ALLINPEOPLE <", value, "allinpeople");
            return (Criteria) this;
        }

        public Criteria andAllinpeopleLessThanOrEqualTo(String value) {
            addCriterion("ALLINPEOPLE <=", value, "allinpeople");
            return (Criteria) this;
        }

        public Criteria andAllinpeopleLike(String value) {
            addCriterion("ALLINPEOPLE like", value, "allinpeople");
            return (Criteria) this;
        }

        public Criteria andAllinpeopleNotLike(String value) {
            addCriterion("ALLINPEOPLE not like", value, "allinpeople");
            return (Criteria) this;
        }

        public Criteria andAllinpeopleIn(List<String> values) {
            addCriterion("ALLINPEOPLE in", values, "allinpeople");
            return (Criteria) this;
        }

        public Criteria andAllinpeopleNotIn(List<String> values) {
            addCriterion("ALLINPEOPLE not in", values, "allinpeople");
            return (Criteria) this;
        }

        public Criteria andAllinpeopleBetween(String value1, String value2) {
            addCriterion("ALLINPEOPLE between", value1, value2, "allinpeople");
            return (Criteria) this;
        }

        public Criteria andAllinpeopleNotBetween(String value1, String value2) {
            addCriterion("ALLINPEOPLE not between", value1, value2, "allinpeople");
            return (Criteria) this;
        }

        public Criteria andUsecolumnIsNull() {
            addCriterion("USECOLUMN is null");
            return (Criteria) this;
        }

        public Criteria andUsecolumnIsNotNull() {
            addCriterion("USECOLUMN is not null");
            return (Criteria) this;
        }

        public Criteria andUsecolumnEqualTo(String value) {
            addCriterion("USECOLUMN =", value, "usecolumn");
            return (Criteria) this;
        }

        public Criteria andUsecolumnNotEqualTo(String value) {
            addCriterion("USECOLUMN <>", value, "usecolumn");
            return (Criteria) this;
        }

        public Criteria andUsecolumnGreaterThan(String value) {
            addCriterion("USECOLUMN >", value, "usecolumn");
            return (Criteria) this;
        }

        public Criteria andUsecolumnGreaterThanOrEqualTo(String value) {
            addCriterion("USECOLUMN >=", value, "usecolumn");
            return (Criteria) this;
        }

        public Criteria andUsecolumnLessThan(String value) {
            addCriterion("USECOLUMN <", value, "usecolumn");
            return (Criteria) this;
        }

        public Criteria andUsecolumnLessThanOrEqualTo(String value) {
            addCriterion("USECOLUMN <=", value, "usecolumn");
            return (Criteria) this;
        }

        public Criteria andUsecolumnLike(String value) {
            addCriterion("USECOLUMN like", value, "usecolumn");
            return (Criteria) this;
        }

        public Criteria andUsecolumnNotLike(String value) {
            addCriterion("USECOLUMN not like", value, "usecolumn");
            return (Criteria) this;
        }

        public Criteria andUsecolumnIn(List<String> values) {
            addCriterion("USECOLUMN in", values, "usecolumn");
            return (Criteria) this;
        }

        public Criteria andUsecolumnNotIn(List<String> values) {
            addCriterion("USECOLUMN not in", values, "usecolumn");
            return (Criteria) this;
        }

        public Criteria andUsecolumnBetween(String value1, String value2) {
            addCriterion("USECOLUMN between", value1, value2, "usecolumn");
            return (Criteria) this;
        }

        public Criteria andUsecolumnNotBetween(String value1, String value2) {
            addCriterion("USECOLUMN not between", value1, value2, "usecolumn");
            return (Criteria) this;
        }

        public Criteria andXuantistateIsNull() {
            addCriterion("XUANTISTATE is null");
            return (Criteria) this;
        }

        public Criteria andXuantistateIsNotNull() {
            addCriterion("XUANTISTATE is not null");
            return (Criteria) this;
        }

        public Criteria andXuantistateEqualTo(BigDecimal value) {
            addCriterion("XUANTISTATE =", value, "xuantistate");
            return (Criteria) this;
        }

        public Criteria andXuantistateNotEqualTo(BigDecimal value) {
            addCriterion("XUANTISTATE <>", value, "xuantistate");
            return (Criteria) this;
        }

        public Criteria andXuantistateGreaterThan(BigDecimal value) {
            addCriterion("XUANTISTATE >", value, "xuantistate");
            return (Criteria) this;
        }

        public Criteria andXuantistateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XUANTISTATE >=", value, "xuantistate");
            return (Criteria) this;
        }

        public Criteria andXuantistateLessThan(BigDecimal value) {
            addCriterion("XUANTISTATE <", value, "xuantistate");
            return (Criteria) this;
        }

        public Criteria andXuantistateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XUANTISTATE <=", value, "xuantistate");
            return (Criteria) this;
        }

        public Criteria andXuantistateIn(List<BigDecimal> values) {
            addCriterion("XUANTISTATE in", values, "xuantistate");
            return (Criteria) this;
        }

        public Criteria andXuantistateNotIn(List<BigDecimal> values) {
            addCriterion("XUANTISTATE not in", values, "xuantistate");
            return (Criteria) this;
        }

        public Criteria andXuantistateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XUANTISTATE between", value1, value2, "xuantistate");
            return (Criteria) this;
        }

        public Criteria andXuantistateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XUANTISTATE not between", value1, value2, "xuantistate");
            return (Criteria) this;
        }

        public Criteria andIslockedIsNull() {
            addCriterion("ISLOCKED is null");
            return (Criteria) this;
        }

        public Criteria andIslockedIsNotNull() {
            addCriterion("ISLOCKED is not null");
            return (Criteria) this;
        }

        public Criteria andIslockedEqualTo(BigDecimal value) {
            addCriterion("ISLOCKED =", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedNotEqualTo(BigDecimal value) {
            addCriterion("ISLOCKED <>", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedGreaterThan(BigDecimal value) {
            addCriterion("ISLOCKED >", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISLOCKED >=", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedLessThan(BigDecimal value) {
            addCriterion("ISLOCKED <", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISLOCKED <=", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedIn(List<BigDecimal> values) {
            addCriterion("ISLOCKED in", values, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedNotIn(List<BigDecimal> values) {
            addCriterion("ISLOCKED not in", values, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISLOCKED between", value1, value2, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISLOCKED not between", value1, value2, "islocked");
            return (Criteria) this;
        }

        public Criteria andLockerIsNull() {
            addCriterion("LOCKER is null");
            return (Criteria) this;
        }

        public Criteria andLockerIsNotNull() {
            addCriterion("LOCKER is not null");
            return (Criteria) this;
        }

        public Criteria andLockerEqualTo(String value) {
            addCriterion("LOCKER =", value, "locker");
            return (Criteria) this;
        }

        public Criteria andLockerNotEqualTo(String value) {
            addCriterion("LOCKER <>", value, "locker");
            return (Criteria) this;
        }

        public Criteria andLockerGreaterThan(String value) {
            addCriterion("LOCKER >", value, "locker");
            return (Criteria) this;
        }

        public Criteria andLockerGreaterThanOrEqualTo(String value) {
            addCriterion("LOCKER >=", value, "locker");
            return (Criteria) this;
        }

        public Criteria andLockerLessThan(String value) {
            addCriterion("LOCKER <", value, "locker");
            return (Criteria) this;
        }

        public Criteria andLockerLessThanOrEqualTo(String value) {
            addCriterion("LOCKER <=", value, "locker");
            return (Criteria) this;
        }

        public Criteria andLockerLike(String value) {
            addCriterion("LOCKER like", value, "locker");
            return (Criteria) this;
        }

        public Criteria andLockerNotLike(String value) {
            addCriterion("LOCKER not like", value, "locker");
            return (Criteria) this;
        }

        public Criteria andLockerIn(List<String> values) {
            addCriterion("LOCKER in", values, "locker");
            return (Criteria) this;
        }

        public Criteria andLockerNotIn(List<String> values) {
            addCriterion("LOCKER not in", values, "locker");
            return (Criteria) this;
        }

        public Criteria andLockerBetween(String value1, String value2) {
            addCriterion("LOCKER between", value1, value2, "locker");
            return (Criteria) this;
        }

        public Criteria andLockerNotBetween(String value1, String value2) {
            addCriterion("LOCKER not between", value1, value2, "locker");
            return (Criteria) this;
        }

        public Criteria andLocktimeIsNull() {
            addCriterion("LOCKTIME is null");
            return (Criteria) this;
        }

        public Criteria andLocktimeIsNotNull() {
            addCriterion("LOCKTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLocktimeEqualTo(Date value) {
            addCriterion("LOCKTIME =", value, "locktime");
            return (Criteria) this;
        }

        public Criteria andLocktimeNotEqualTo(Date value) {
            addCriterion("LOCKTIME <>", value, "locktime");
            return (Criteria) this;
        }

        public Criteria andLocktimeGreaterThan(Date value) {
            addCriterion("LOCKTIME >", value, "locktime");
            return (Criteria) this;
        }

        public Criteria andLocktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LOCKTIME >=", value, "locktime");
            return (Criteria) this;
        }

        public Criteria andLocktimeLessThan(Date value) {
            addCriterion("LOCKTIME <", value, "locktime");
            return (Criteria) this;
        }

        public Criteria andLocktimeLessThanOrEqualTo(Date value) {
            addCriterion("LOCKTIME <=", value, "locktime");
            return (Criteria) this;
        }

        public Criteria andLocktimeIn(List<Date> values) {
            addCriterion("LOCKTIME in", values, "locktime");
            return (Criteria) this;
        }

        public Criteria andLocktimeNotIn(List<Date> values) {
            addCriterion("LOCKTIME not in", values, "locktime");
            return (Criteria) this;
        }

        public Criteria andLocktimeBetween(Date value1, Date value2) {
            addCriterion("LOCKTIME between", value1, value2, "locktime");
            return (Criteria) this;
        }

        public Criteria andLocktimeNotBetween(Date value1, Date value2) {
            addCriterion("LOCKTIME not between", value1, value2, "locktime");
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