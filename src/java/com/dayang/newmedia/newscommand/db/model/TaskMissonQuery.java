package com.dayang.newmedia.newscommand.db.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskMissonQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskMissonQuery() {
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

        public Criteria andMtitleIsNull() {
            addCriterion("mtitle is null");
            return (Criteria) this;
        }

        public Criteria andMtitleIsNotNull() {
            addCriterion("mtitle is not null");
            return (Criteria) this;
        }

        public Criteria andMtitleEqualTo(String value) {
            addCriterion("mtitle =", value, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleNotEqualTo(String value) {
            addCriterion("mtitle <>", value, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleGreaterThan(String value) {
            addCriterion("mtitle >", value, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleGreaterThanOrEqualTo(String value) {
            addCriterion("mtitle >=", value, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleLessThan(String value) {
            addCriterion("mtitle <", value, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleLessThanOrEqualTo(String value) {
            addCriterion("mtitle <=", value, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleLike(String value) {
            addCriterion("mtitle like", value, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleNotLike(String value) {
            addCriterion("mtitle not like", value, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleIn(List<String> values) {
            addCriterion("mtitle in", values, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleNotIn(List<String> values) {
            addCriterion("mtitle not in", values, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleBetween(String value1, String value2) {
            addCriterion("mtitle between", value1, value2, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleNotBetween(String value1, String value2) {
            addCriterion("mtitle not between", value1, value2, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMplaceIsNull() {
            addCriterion("mplace is null");
            return (Criteria) this;
        }

        public Criteria andMplaceIsNotNull() {
            addCriterion("mplace is not null");
            return (Criteria) this;
        }

        public Criteria andMplaceEqualTo(String value) {
            addCriterion("mplace =", value, "mplace");
            return (Criteria) this;
        }

        public Criteria andMplaceNotEqualTo(String value) {
            addCriterion("mplace <>", value, "mplace");
            return (Criteria) this;
        }

        public Criteria andMplaceGreaterThan(String value) {
            addCriterion("mplace >", value, "mplace");
            return (Criteria) this;
        }

        public Criteria andMplaceGreaterThanOrEqualTo(String value) {
            addCriterion("mplace >=", value, "mplace");
            return (Criteria) this;
        }

        public Criteria andMplaceLessThan(String value) {
            addCriterion("mplace <", value, "mplace");
            return (Criteria) this;
        }

        public Criteria andMplaceLessThanOrEqualTo(String value) {
            addCriterion("mplace <=", value, "mplace");
            return (Criteria) this;
        }

        public Criteria andMplaceLike(String value) {
            addCriterion("mplace like", value, "mplace");
            return (Criteria) this;
        }

        public Criteria andMplaceNotLike(String value) {
            addCriterion("mplace not like", value, "mplace");
            return (Criteria) this;
        }

        public Criteria andMplaceIn(List<String> values) {
            addCriterion("mplace in", values, "mplace");
            return (Criteria) this;
        }

        public Criteria andMplaceNotIn(List<String> values) {
            addCriterion("mplace not in", values, "mplace");
            return (Criteria) this;
        }

        public Criteria andMplaceBetween(String value1, String value2) {
            addCriterion("mplace between", value1, value2, "mplace");
            return (Criteria) this;
        }

        public Criteria andMplaceNotBetween(String value1, String value2) {
            addCriterion("mplace not between", value1, value2, "mplace");
            return (Criteria) this;
        }

        public Criteria andMcreaterIsNull() {
            addCriterion("mcreater is null");
            return (Criteria) this;
        }

        public Criteria andMcreaterIsNotNull() {
            addCriterion("mcreater is not null");
            return (Criteria) this;
        }

        public Criteria andMcreaterEqualTo(String value) {
            addCriterion("mcreater =", value, "mcreater");
            return (Criteria) this;
        }

        public Criteria andMcreaterNotEqualTo(String value) {
            addCriterion("mcreater <>", value, "mcreater");
            return (Criteria) this;
        }

        public Criteria andMcreaterGreaterThan(String value) {
            addCriterion("mcreater >", value, "mcreater");
            return (Criteria) this;
        }

        public Criteria andMcreaterGreaterThanOrEqualTo(String value) {
            addCriterion("mcreater >=", value, "mcreater");
            return (Criteria) this;
        }

        public Criteria andMcreaterLessThan(String value) {
            addCriterion("mcreater <", value, "mcreater");
            return (Criteria) this;
        }

        public Criteria andMcreaterLessThanOrEqualTo(String value) {
            addCriterion("mcreater <=", value, "mcreater");
            return (Criteria) this;
        }

        public Criteria andMcreaterLike(String value) {
            addCriterion("mcreater like", value, "mcreater");
            return (Criteria) this;
        }

        public Criteria andMcreaterNotLike(String value) {
            addCriterion("mcreater not like", value, "mcreater");
            return (Criteria) this;
        }

        public Criteria andMcreaterIn(List<String> values) {
            addCriterion("mcreater in", values, "mcreater");
            return (Criteria) this;
        }

        public Criteria andMcreaterNotIn(List<String> values) {
            addCriterion("mcreater not in", values, "mcreater");
            return (Criteria) this;
        }

        public Criteria andMcreaterBetween(String value1, String value2) {
            addCriterion("mcreater between", value1, value2, "mcreater");
            return (Criteria) this;
        }

        public Criteria andMcreaterNotBetween(String value1, String value2) {
            addCriterion("mcreater not between", value1, value2, "mcreater");
            return (Criteria) this;
        }

        public Criteria andMcreaterguidIsNull() {
            addCriterion("mcreaterguid is null");
            return (Criteria) this;
        }

        public Criteria andMcreaterguidIsNotNull() {
            addCriterion("mcreaterguid is not null");
            return (Criteria) this;
        }

        public Criteria andMcreaterguidEqualTo(String value) {
            addCriterion("mcreaterguid =", value, "mcreaterguid");
            return (Criteria) this;
        }

        public Criteria andMcreaterguidNotEqualTo(String value) {
            addCriterion("mcreaterguid <>", value, "mcreaterguid");
            return (Criteria) this;
        }

        public Criteria andMcreaterguidGreaterThan(String value) {
            addCriterion("mcreaterguid >", value, "mcreaterguid");
            return (Criteria) this;
        }

        public Criteria andMcreaterguidGreaterThanOrEqualTo(String value) {
            addCriterion("mcreaterguid >=", value, "mcreaterguid");
            return (Criteria) this;
        }

        public Criteria andMcreaterguidLessThan(String value) {
            addCriterion("mcreaterguid <", value, "mcreaterguid");
            return (Criteria) this;
        }

        public Criteria andMcreaterguidLessThanOrEqualTo(String value) {
            addCriterion("mcreaterguid <=", value, "mcreaterguid");
            return (Criteria) this;
        }

        public Criteria andMcreaterguidLike(String value) {
            addCriterion("mcreaterguid like", value, "mcreaterguid");
            return (Criteria) this;
        }

        public Criteria andMcreaterguidNotLike(String value) {
            addCriterion("mcreaterguid not like", value, "mcreaterguid");
            return (Criteria) this;
        }

        public Criteria andMcreaterguidIn(List<String> values) {
            addCriterion("mcreaterguid in", values, "mcreaterguid");
            return (Criteria) this;
        }

        public Criteria andMcreaterguidNotIn(List<String> values) {
            addCriterion("mcreaterguid not in", values, "mcreaterguid");
            return (Criteria) this;
        }

        public Criteria andMcreaterguidBetween(String value1, String value2) {
            addCriterion("mcreaterguid between", value1, value2, "mcreaterguid");
            return (Criteria) this;
        }

        public Criteria andMcreaterguidNotBetween(String value1, String value2) {
            addCriterion("mcreaterguid not between", value1, value2, "mcreaterguid");
            return (Criteria) this;
        }

        public Criteria andMchargemanIsNull() {
            addCriterion("mchargeman is null");
            return (Criteria) this;
        }

        public Criteria andMchargemanIsNotNull() {
            addCriterion("mchargeman is not null");
            return (Criteria) this;
        }

        public Criteria andMchargemanEqualTo(String value) {
            addCriterion("mchargeman =", value, "mchargeman");
            return (Criteria) this;
        }

        public Criteria andMchargemanNotEqualTo(String value) {
            addCriterion("mchargeman <>", value, "mchargeman");
            return (Criteria) this;
        }

        public Criteria andMchargemanGreaterThan(String value) {
            addCriterion("mchargeman >", value, "mchargeman");
            return (Criteria) this;
        }

        public Criteria andMchargemanGreaterThanOrEqualTo(String value) {
            addCriterion("mchargeman >=", value, "mchargeman");
            return (Criteria) this;
        }

        public Criteria andMchargemanLessThan(String value) {
            addCriterion("mchargeman <", value, "mchargeman");
            return (Criteria) this;
        }

        public Criteria andMchargemanLessThanOrEqualTo(String value) {
            addCriterion("mchargeman <=", value, "mchargeman");
            return (Criteria) this;
        }

        public Criteria andMchargemanLike(String value) {
            addCriterion("mchargeman like", value, "mchargeman");
            return (Criteria) this;
        }

        public Criteria andMchargemanNotLike(String value) {
            addCriterion("mchargeman not like", value, "mchargeman");
            return (Criteria) this;
        }

        public Criteria andMchargemanIn(List<String> values) {
            addCriterion("mchargeman in", values, "mchargeman");
            return (Criteria) this;
        }

        public Criteria andMchargemanNotIn(List<String> values) {
            addCriterion("mchargeman not in", values, "mchargeman");
            return (Criteria) this;
        }

        public Criteria andMchargemanBetween(String value1, String value2) {
            addCriterion("mchargeman between", value1, value2, "mchargeman");
            return (Criteria) this;
        }

        public Criteria andMchargemanNotBetween(String value1, String value2) {
            addCriterion("mchargeman not between", value1, value2, "mchargeman");
            return (Criteria) this;
        }

        public Criteria andMpasserIsNull() {
            addCriterion("mpasser is null");
            return (Criteria) this;
        }

        public Criteria andMpasserIsNotNull() {
            addCriterion("mpasser is not null");
            return (Criteria) this;
        }

        public Criteria andMpasserEqualTo(String value) {
            addCriterion("mpasser =", value, "mpasser");
            return (Criteria) this;
        }

        public Criteria andMpasserNotEqualTo(String value) {
            addCriterion("mpasser <>", value, "mpasser");
            return (Criteria) this;
        }

        public Criteria andMpasserGreaterThan(String value) {
            addCriterion("mpasser >", value, "mpasser");
            return (Criteria) this;
        }

        public Criteria andMpasserGreaterThanOrEqualTo(String value) {
            addCriterion("mpasser >=", value, "mpasser");
            return (Criteria) this;
        }

        public Criteria andMpasserLessThan(String value) {
            addCriterion("mpasser <", value, "mpasser");
            return (Criteria) this;
        }

        public Criteria andMpasserLessThanOrEqualTo(String value) {
            addCriterion("mpasser <=", value, "mpasser");
            return (Criteria) this;
        }

        public Criteria andMpasserLike(String value) {
            addCriterion("mpasser like", value, "mpasser");
            return (Criteria) this;
        }

        public Criteria andMpasserNotLike(String value) {
            addCriterion("mpasser not like", value, "mpasser");
            return (Criteria) this;
        }

        public Criteria andMpasserIn(List<String> values) {
            addCriterion("mpasser in", values, "mpasser");
            return (Criteria) this;
        }

        public Criteria andMpasserNotIn(List<String> values) {
            addCriterion("mpasser not in", values, "mpasser");
            return (Criteria) this;
        }

        public Criteria andMpasserBetween(String value1, String value2) {
            addCriterion("mpasser between", value1, value2, "mpasser");
            return (Criteria) this;
        }

        public Criteria andMpasserNotBetween(String value1, String value2) {
            addCriterion("mpasser not between", value1, value2, "mpasser");
            return (Criteria) this;
        }

        public Criteria andMpasseradviceIsNull() {
            addCriterion("mpasseradvice is null");
            return (Criteria) this;
        }

        public Criteria andMpasseradviceIsNotNull() {
            addCriterion("mpasseradvice is not null");
            return (Criteria) this;
        }

        public Criteria andMpasseradviceEqualTo(String value) {
            addCriterion("mpasseradvice =", value, "mpasseradvice");
            return (Criteria) this;
        }

        public Criteria andMpasseradviceNotEqualTo(String value) {
            addCriterion("mpasseradvice <>", value, "mpasseradvice");
            return (Criteria) this;
        }

        public Criteria andMpasseradviceGreaterThan(String value) {
            addCriterion("mpasseradvice >", value, "mpasseradvice");
            return (Criteria) this;
        }

        public Criteria andMpasseradviceGreaterThanOrEqualTo(String value) {
            addCriterion("mpasseradvice >=", value, "mpasseradvice");
            return (Criteria) this;
        }

        public Criteria andMpasseradviceLessThan(String value) {
            addCriterion("mpasseradvice <", value, "mpasseradvice");
            return (Criteria) this;
        }

        public Criteria andMpasseradviceLessThanOrEqualTo(String value) {
            addCriterion("mpasseradvice <=", value, "mpasseradvice");
            return (Criteria) this;
        }

        public Criteria andMpasseradviceLike(String value) {
            addCriterion("mpasseradvice like", value, "mpasseradvice");
            return (Criteria) this;
        }

        public Criteria andMpasseradviceNotLike(String value) {
            addCriterion("mpasseradvice not like", value, "mpasseradvice");
            return (Criteria) this;
        }

        public Criteria andMpasseradviceIn(List<String> values) {
            addCriterion("mpasseradvice in", values, "mpasseradvice");
            return (Criteria) this;
        }

        public Criteria andMpasseradviceNotIn(List<String> values) {
            addCriterion("mpasseradvice not in", values, "mpasseradvice");
            return (Criteria) this;
        }

        public Criteria andMpasseradviceBetween(String value1, String value2) {
            addCriterion("mpasseradvice between", value1, value2, "mpasseradvice");
            return (Criteria) this;
        }

        public Criteria andMpasseradviceNotBetween(String value1, String value2) {
            addCriterion("mpasseradvice not between", value1, value2, "mpasseradvice");
            return (Criteria) this;
        }

        public Criteria andMstateIsNull() {
            addCriterion("mstate is null");
            return (Criteria) this;
        }

        public Criteria andMstateIsNotNull() {
            addCriterion("mstate is not null");
            return (Criteria) this;
        }

        public Criteria andMstateEqualTo(Integer value) {
            addCriterion("mstate =", value, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateNotEqualTo(Integer value) {
            addCriterion("mstate <>", value, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateGreaterThan(Integer value) {
            addCriterion("mstate >", value, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("mstate >=", value, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateLessThan(Integer value) {
            addCriterion("mstate <", value, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateLessThanOrEqualTo(Integer value) {
            addCriterion("mstate <=", value, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateIn(List<Integer> values) {
            addCriterion("mstate in", values, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateNotIn(List<Integer> values) {
            addCriterion("mstate not in", values, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateBetween(Integer value1, Integer value2) {
            addCriterion("mstate between", value1, value2, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateNotBetween(Integer value1, Integer value2) {
            addCriterion("mstate not between", value1, value2, "mstate");
            return (Criteria) this;
        }

        public Criteria andMowncolumnIsNull() {
            addCriterion("mowncolumn is null");
            return (Criteria) this;
        }

        public Criteria andMowncolumnIsNotNull() {
            addCriterion("mowncolumn is not null");
            return (Criteria) this;
        }

        public Criteria andMowncolumnEqualTo(String value) {
            addCriterion("mowncolumn =", value, "mowncolumn");
            return (Criteria) this;
        }

        public Criteria andMowncolumnNotEqualTo(String value) {
            addCriterion("mowncolumn <>", value, "mowncolumn");
            return (Criteria) this;
        }

        public Criteria andMowncolumnGreaterThan(String value) {
            addCriterion("mowncolumn >", value, "mowncolumn");
            return (Criteria) this;
        }

        public Criteria andMowncolumnGreaterThanOrEqualTo(String value) {
            addCriterion("mowncolumn >=", value, "mowncolumn");
            return (Criteria) this;
        }

        public Criteria andMowncolumnLessThan(String value) {
            addCriterion("mowncolumn <", value, "mowncolumn");
            return (Criteria) this;
        }

        public Criteria andMowncolumnLessThanOrEqualTo(String value) {
            addCriterion("mowncolumn <=", value, "mowncolumn");
            return (Criteria) this;
        }

        public Criteria andMowncolumnLike(String value) {
            addCriterion("mowncolumn like", value, "mowncolumn");
            return (Criteria) this;
        }

        public Criteria andMowncolumnNotLike(String value) {
            addCriterion("mowncolumn not like", value, "mowncolumn");
            return (Criteria) this;
        }

        public Criteria andMowncolumnIn(List<String> values) {
            addCriterion("mowncolumn in", values, "mowncolumn");
            return (Criteria) this;
        }

        public Criteria andMowncolumnNotIn(List<String> values) {
            addCriterion("mowncolumn not in", values, "mowncolumn");
            return (Criteria) this;
        }

        public Criteria andMowncolumnBetween(String value1, String value2) {
            addCriterion("mowncolumn between", value1, value2, "mowncolumn");
            return (Criteria) this;
        }

        public Criteria andMowncolumnNotBetween(String value1, String value2) {
            addCriterion("mowncolumn not between", value1, value2, "mowncolumn");
            return (Criteria) this;
        }

        public Criteria andMrepoterIsNull() {
            addCriterion("mrepoter is null");
            return (Criteria) this;
        }

        public Criteria andMrepoterIsNotNull() {
            addCriterion("mrepoter is not null");
            return (Criteria) this;
        }

        public Criteria andMrepoterEqualTo(String value) {
            addCriterion("mrepoter =", value, "mrepoter");
            return (Criteria) this;
        }

        public Criteria andMrepoterNotEqualTo(String value) {
            addCriterion("mrepoter <>", value, "mrepoter");
            return (Criteria) this;
        }

        public Criteria andMrepoterGreaterThan(String value) {
            addCriterion("mrepoter >", value, "mrepoter");
            return (Criteria) this;
        }

        public Criteria andMrepoterGreaterThanOrEqualTo(String value) {
            addCriterion("mrepoter >=", value, "mrepoter");
            return (Criteria) this;
        }

        public Criteria andMrepoterLessThan(String value) {
            addCriterion("mrepoter <", value, "mrepoter");
            return (Criteria) this;
        }

        public Criteria andMrepoterLessThanOrEqualTo(String value) {
            addCriterion("mrepoter <=", value, "mrepoter");
            return (Criteria) this;
        }

        public Criteria andMrepoterLike(String value) {
            addCriterion("mrepoter like", value, "mrepoter");
            return (Criteria) this;
        }

        public Criteria andMrepoterNotLike(String value) {
            addCriterion("mrepoter not like", value, "mrepoter");
            return (Criteria) this;
        }

        public Criteria andMrepoterIn(List<String> values) {
            addCriterion("mrepoter in", values, "mrepoter");
            return (Criteria) this;
        }

        public Criteria andMrepoterNotIn(List<String> values) {
            addCriterion("mrepoter not in", values, "mrepoter");
            return (Criteria) this;
        }

        public Criteria andMrepoterBetween(String value1, String value2) {
            addCriterion("mrepoter between", value1, value2, "mrepoter");
            return (Criteria) this;
        }

        public Criteria andMrepoterNotBetween(String value1, String value2) {
            addCriterion("mrepoter not between", value1, value2, "mrepoter");
            return (Criteria) this;
        }

        public Criteria andMtypeIsNull() {
            addCriterion("mtype is null");
            return (Criteria) this;
        }

        public Criteria andMtypeIsNotNull() {
            addCriterion("mtype is not null");
            return (Criteria) this;
        }

        public Criteria andMtypeEqualTo(String value) {
            addCriterion("mtype =", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeNotEqualTo(String value) {
            addCriterion("mtype <>", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeGreaterThan(String value) {
            addCriterion("mtype >", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeGreaterThanOrEqualTo(String value) {
            addCriterion("mtype >=", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeLessThan(String value) {
            addCriterion("mtype <", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeLessThanOrEqualTo(String value) {
            addCriterion("mtype <=", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeLike(String value) {
            addCriterion("mtype like", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeNotLike(String value) {
            addCriterion("mtype not like", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeIn(List<String> values) {
            addCriterion("mtype in", values, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeNotIn(List<String> values) {
            addCriterion("mtype not in", values, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeBetween(String value1, String value2) {
            addCriterion("mtype between", value1, value2, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeNotBetween(String value1, String value2) {
            addCriterion("mtype not between", value1, value2, "mtype");
            return (Criteria) this;
        }

        public Criteria andMfinishtimeIsNull() {
            addCriterion("mfinishtime is null");
            return (Criteria) this;
        }

        public Criteria andMfinishtimeIsNotNull() {
            addCriterion("mfinishtime is not null");
            return (Criteria) this;
        }

        public Criteria andMfinishtimeEqualTo(Date value) {
            addCriterion("mfinishtime =", value, "mfinishtime");
            return (Criteria) this;
        }

        public Criteria andMfinishtimeNotEqualTo(Date value) {
            addCriterion("mfinishtime <>", value, "mfinishtime");
            return (Criteria) this;
        }

        public Criteria andMfinishtimeGreaterThan(Date value) {
            addCriterion("mfinishtime >", value, "mfinishtime");
            return (Criteria) this;
        }

        public Criteria andMfinishtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("mfinishtime >=", value, "mfinishtime");
            return (Criteria) this;
        }

        public Criteria andMfinishtimeLessThan(Date value) {
            addCriterion("mfinishtime <", value, "mfinishtime");
            return (Criteria) this;
        }

        public Criteria andMfinishtimeLessThanOrEqualTo(Date value) {
            addCriterion("mfinishtime <=", value, "mfinishtime");
            return (Criteria) this;
        }

        public Criteria andMfinishtimeIn(List<Date> values) {
            addCriterion("mfinishtime in", values, "mfinishtime");
            return (Criteria) this;
        }

        public Criteria andMfinishtimeNotIn(List<Date> values) {
            addCriterion("mfinishtime not in", values, "mfinishtime");
            return (Criteria) this;
        }

        public Criteria andMfinishtimeBetween(Date value1, Date value2) {
            addCriterion("mfinishtime between", value1, value2, "mfinishtime");
            return (Criteria) this;
        }

        public Criteria andMfinishtimeNotBetween(Date value1, Date value2) {
            addCriterion("mfinishtime not between", value1, value2, "mfinishtime");
            return (Criteria) this;
        }

        public Criteria andMcreatetimeIsNull() {
            addCriterion("mcreatetime is null");
            return (Criteria) this;
        }

        public Criteria andMcreatetimeIsNotNull() {
            addCriterion("mcreatetime is not null");
            return (Criteria) this;
        }

        public Criteria andMcreatetimeEqualTo(Date value) {
            addCriterion("mcreatetime =", value, "mcreatetime");
            return (Criteria) this;
        }

        public Criteria andMcreatetimeNotEqualTo(Date value) {
            addCriterion("mcreatetime <>", value, "mcreatetime");
            return (Criteria) this;
        }

        public Criteria andMcreatetimeGreaterThan(Date value) {
            addCriterion("mcreatetime >", value, "mcreatetime");
            return (Criteria) this;
        }

        public Criteria andMcreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("mcreatetime >=", value, "mcreatetime");
            return (Criteria) this;
        }

        public Criteria andMcreatetimeLessThan(Date value) {
            addCriterion("mcreatetime <", value, "mcreatetime");
            return (Criteria) this;
        }

        public Criteria andMcreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("mcreatetime <=", value, "mcreatetime");
            return (Criteria) this;
        }

        public Criteria andMcreatetimeIn(List<Date> values) {
            addCriterion("mcreatetime in", values, "mcreatetime");
            return (Criteria) this;
        }

        public Criteria andMcreatetimeNotIn(List<Date> values) {
            addCriterion("mcreatetime not in", values, "mcreatetime");
            return (Criteria) this;
        }

        public Criteria andMcreatetimeBetween(Date value1, Date value2) {
            addCriterion("mcreatetime between", value1, value2, "mcreatetime");
            return (Criteria) this;
        }

        public Criteria andMcreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("mcreatetime not between", value1, value2, "mcreatetime");
            return (Criteria) this;
        }

        public Criteria andTaskguidIsNull() {
            addCriterion("taskguid is null");
            return (Criteria) this;
        }

        public Criteria andTaskguidIsNotNull() {
            addCriterion("taskguid is not null");
            return (Criteria) this;
        }

        public Criteria andTaskguidEqualTo(String value) {
            addCriterion("taskguid =", value, "taskguid");
            return (Criteria) this;
        }

        public Criteria andTaskguidNotEqualTo(String value) {
            addCriterion("taskguid <>", value, "taskguid");
            return (Criteria) this;
        }

        public Criteria andTaskguidGreaterThan(String value) {
            addCriterion("taskguid >", value, "taskguid");
            return (Criteria) this;
        }

        public Criteria andTaskguidGreaterThanOrEqualTo(String value) {
            addCriterion("taskguid >=", value, "taskguid");
            return (Criteria) this;
        }

        public Criteria andTaskguidLessThan(String value) {
            addCriterion("taskguid <", value, "taskguid");
            return (Criteria) this;
        }

        public Criteria andTaskguidLessThanOrEqualTo(String value) {
            addCriterion("taskguid <=", value, "taskguid");
            return (Criteria) this;
        }

        public Criteria andTaskguidLike(String value) {
            addCriterion("taskguid like", value, "taskguid");
            return (Criteria) this;
        }

        public Criteria andTaskguidNotLike(String value) {
            addCriterion("taskguid not like", value, "taskguid");
            return (Criteria) this;
        }

        public Criteria andTaskguidIn(List<String> values) {
            addCriterion("taskguid in", values, "taskguid");
            return (Criteria) this;
        }

        public Criteria andTaskguidNotIn(List<String> values) {
            addCriterion("taskguid not in", values, "taskguid");
            return (Criteria) this;
        }

        public Criteria andTaskguidBetween(String value1, String value2) {
            addCriterion("taskguid between", value1, value2, "taskguid");
            return (Criteria) this;
        }

        public Criteria andTaskguidNotBetween(String value1, String value2) {
            addCriterion("taskguid not between", value1, value2, "taskguid");
            return (Criteria) this;
        }

        public Criteria andMremarkIsNull() {
            addCriterion("mremark is null");
            return (Criteria) this;
        }

        public Criteria andMremarkIsNotNull() {
            addCriterion("mremark is not null");
            return (Criteria) this;
        }

        public Criteria andMremarkEqualTo(String value) {
            addCriterion("mremark =", value, "mremark");
            return (Criteria) this;
        }

        public Criteria andMremarkNotEqualTo(String value) {
            addCriterion("mremark <>", value, "mremark");
            return (Criteria) this;
        }

        public Criteria andMremarkGreaterThan(String value) {
            addCriterion("mremark >", value, "mremark");
            return (Criteria) this;
        }

        public Criteria andMremarkGreaterThanOrEqualTo(String value) {
            addCriterion("mremark >=", value, "mremark");
            return (Criteria) this;
        }

        public Criteria andMremarkLessThan(String value) {
            addCriterion("mremark <", value, "mremark");
            return (Criteria) this;
        }

        public Criteria andMremarkLessThanOrEqualTo(String value) {
            addCriterion("mremark <=", value, "mremark");
            return (Criteria) this;
        }

        public Criteria andMremarkLike(String value) {
            addCriterion("mremark like", value, "mremark");
            return (Criteria) this;
        }

        public Criteria andMremarkNotLike(String value) {
            addCriterion("mremark not like", value, "mremark");
            return (Criteria) this;
        }

        public Criteria andMremarkIn(List<String> values) {
            addCriterion("mremark in", values, "mremark");
            return (Criteria) this;
        }

        public Criteria andMremarkNotIn(List<String> values) {
            addCriterion("mremark not in", values, "mremark");
            return (Criteria) this;
        }

        public Criteria andMremarkBetween(String value1, String value2) {
            addCriterion("mremark between", value1, value2, "mremark");
            return (Criteria) this;
        }

        public Criteria andMremarkNotBetween(String value1, String value2) {
            addCriterion("mremark not between", value1, value2, "mremark");
            return (Criteria) this;
        }

        public Criteria andTasktitleIsNull() {
            addCriterion("tasktitle is null");
            return (Criteria) this;
        }

        public Criteria andTasktitleIsNotNull() {
            addCriterion("tasktitle is not null");
            return (Criteria) this;
        }

        public Criteria andTasktitleEqualTo(String value) {
            addCriterion("tasktitle =", value, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleNotEqualTo(String value) {
            addCriterion("tasktitle <>", value, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleGreaterThan(String value) {
            addCriterion("tasktitle >", value, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleGreaterThanOrEqualTo(String value) {
            addCriterion("tasktitle >=", value, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleLessThan(String value) {
            addCriterion("tasktitle <", value, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleLessThanOrEqualTo(String value) {
            addCriterion("tasktitle <=", value, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleLike(String value) {
            addCriterion("tasktitle like", value, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleNotLike(String value) {
            addCriterion("tasktitle not like", value, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleIn(List<String> values) {
            addCriterion("tasktitle in", values, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleNotIn(List<String> values) {
            addCriterion("tasktitle not in", values, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleBetween(String value1, String value2) {
            addCriterion("tasktitle between", value1, value2, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleNotBetween(String value1, String value2) {
            addCriterion("tasktitle not between", value1, value2, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andMlevelIsNull() {
            addCriterion("mlevel is null");
            return (Criteria) this;
        }

        public Criteria andMlevelIsNotNull() {
            addCriterion("mlevel is not null");
            return (Criteria) this;
        }

        public Criteria andMlevelEqualTo(Integer value) {
            addCriterion("mlevel =", value, "mlevel");
            return (Criteria) this;
        }

        public Criteria andMlevelNotEqualTo(Integer value) {
            addCriterion("mlevel <>", value, "mlevel");
            return (Criteria) this;
        }

        public Criteria andMlevelGreaterThan(Integer value) {
            addCriterion("mlevel >", value, "mlevel");
            return (Criteria) this;
        }

        public Criteria andMlevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("mlevel >=", value, "mlevel");
            return (Criteria) this;
        }

        public Criteria andMlevelLessThan(Integer value) {
            addCriterion("mlevel <", value, "mlevel");
            return (Criteria) this;
        }

        public Criteria andMlevelLessThanOrEqualTo(Integer value) {
            addCriterion("mlevel <=", value, "mlevel");
            return (Criteria) this;
        }

        public Criteria andMlevelIn(List<Integer> values) {
            addCriterion("mlevel in", values, "mlevel");
            return (Criteria) this;
        }

        public Criteria andMlevelNotIn(List<Integer> values) {
            addCriterion("mlevel not in", values, "mlevel");
            return (Criteria) this;
        }

        public Criteria andMlevelBetween(Integer value1, Integer value2) {
            addCriterion("mlevel between", value1, value2, "mlevel");
            return (Criteria) this;
        }

        public Criteria andMlevelNotBetween(Integer value1, Integer value2) {
            addCriterion("mlevel not between", value1, value2, "mlevel");
            return (Criteria) this;
        }

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(String value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(String value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(String value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(String value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(String value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(String value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLike(String value) {
            addCriterion("mid like", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotLike(String value) {
            addCriterion("mid not like", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<String> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<String> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(String value1, String value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(String value1, String value2) {
            addCriterion("mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMnameIsNull() {
            addCriterion("mname is null");
            return (Criteria) this;
        }

        public Criteria andMnameIsNotNull() {
            addCriterion("mname is not null");
            return (Criteria) this;
        }

        public Criteria andMnameEqualTo(String value) {
            addCriterion("mname =", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotEqualTo(String value) {
            addCriterion("mname <>", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThan(String value) {
            addCriterion("mname >", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThanOrEqualTo(String value) {
            addCriterion("mname >=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThan(String value) {
            addCriterion("mname <", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThanOrEqualTo(String value) {
            addCriterion("mname <=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLike(String value) {
            addCriterion("mname like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotLike(String value) {
            addCriterion("mname not like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameIn(List<String> values) {
            addCriterion("mname in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotIn(List<String> values) {
            addCriterion("mname not in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameBetween(String value1, String value2) {
            addCriterion("mname between", value1, value2, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotBetween(String value1, String value2) {
            addCriterion("mname not between", value1, value2, "mname");
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

        public Criteria andTaskchangemanIsNull() {
            addCriterion("TASKCHANGEMAN is null");
            return (Criteria) this;
        }

        public Criteria andTaskchangemanIsNotNull() {
            addCriterion("TASKCHANGEMAN is not null");
            return (Criteria) this;
        }

        public Criteria andTaskchangemanEqualTo(String value) {
            addCriterion("TASKCHANGEMAN =", value, "taskchangeman");
            return (Criteria) this;
        }

        public Criteria andTaskchangemanNotEqualTo(String value) {
            addCriterion("TASKCHANGEMAN <>", value, "taskchangeman");
            return (Criteria) this;
        }

        public Criteria andTaskchangemanGreaterThan(String value) {
            addCriterion("TASKCHANGEMAN >", value, "taskchangeman");
            return (Criteria) this;
        }

        public Criteria andTaskchangemanGreaterThanOrEqualTo(String value) {
            addCriterion("TASKCHANGEMAN >=", value, "taskchangeman");
            return (Criteria) this;
        }

        public Criteria andTaskchangemanLessThan(String value) {
            addCriterion("TASKCHANGEMAN <", value, "taskchangeman");
            return (Criteria) this;
        }

        public Criteria andTaskchangemanLessThanOrEqualTo(String value) {
            addCriterion("TASKCHANGEMAN <=", value, "taskchangeman");
            return (Criteria) this;
        }

        public Criteria andTaskchangemanLike(String value) {
            addCriterion("TASKCHANGEMAN like", value, "taskchangeman");
            return (Criteria) this;
        }

        public Criteria andTaskchangemanNotLike(String value) {
            addCriterion("TASKCHANGEMAN not like", value, "taskchangeman");
            return (Criteria) this;
        }

        public Criteria andTaskchangemanIn(List<String> values) {
            addCriterion("TASKCHANGEMAN in", values, "taskchangeman");
            return (Criteria) this;
        }

        public Criteria andTaskchangemanNotIn(List<String> values) {
            addCriterion("TASKCHANGEMAN not in", values, "taskchangeman");
            return (Criteria) this;
        }

        public Criteria andTaskchangemanBetween(String value1, String value2) {
            addCriterion("TASKCHANGEMAN between", value1, value2, "taskchangeman");
            return (Criteria) this;
        }

        public Criteria andTaskchangemanNotBetween(String value1, String value2) {
            addCriterion("TASKCHANGEMAN not between", value1, value2, "taskchangeman");
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