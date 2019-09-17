package com.woniu.domain;

import java.util.ArrayList;
import java.util.List;

public class TreeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TreeExample() {
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

        public Criteria andTreeidIsNull() {
            addCriterion("treeID is null");
            return (Criteria) this;
        }

        public Criteria andTreeidIsNotNull() {
            addCriterion("treeID is not null");
            return (Criteria) this;
        }

        public Criteria andTreeidEqualTo(Integer value) {
            addCriterion("treeID =", value, "treeid");
            return (Criteria) this;
        }

        public Criteria andTreeidNotEqualTo(Integer value) {
            addCriterion("treeID <>", value, "treeid");
            return (Criteria) this;
        }

        public Criteria andTreeidGreaterThan(Integer value) {
            addCriterion("treeID >", value, "treeid");
            return (Criteria) this;
        }

        public Criteria andTreeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("treeID >=", value, "treeid");
            return (Criteria) this;
        }

        public Criteria andTreeidLessThan(Integer value) {
            addCriterion("treeID <", value, "treeid");
            return (Criteria) this;
        }

        public Criteria andTreeidLessThanOrEqualTo(Integer value) {
            addCriterion("treeID <=", value, "treeid");
            return (Criteria) this;
        }

        public Criteria andTreeidIn(List<Integer> values) {
            addCriterion("treeID in", values, "treeid");
            return (Criteria) this;
        }

        public Criteria andTreeidNotIn(List<Integer> values) {
            addCriterion("treeID not in", values, "treeid");
            return (Criteria) this;
        }

        public Criteria andTreeidBetween(Integer value1, Integer value2) {
            addCriterion("treeID between", value1, value2, "treeid");
            return (Criteria) this;
        }

        public Criteria andTreeidNotBetween(Integer value1, Integer value2) {
            addCriterion("treeID not between", value1, value2, "treeid");
            return (Criteria) this;
        }

        public Criteria andTreenameIsNull() {
            addCriterion("treeName is null");
            return (Criteria) this;
        }

        public Criteria andTreenameIsNotNull() {
            addCriterion("treeName is not null");
            return (Criteria) this;
        }

        public Criteria andTreenameEqualTo(String value) {
            addCriterion("treeName =", value, "treename");
            return (Criteria) this;
        }

        public Criteria andTreenameNotEqualTo(String value) {
            addCriterion("treeName <>", value, "treename");
            return (Criteria) this;
        }

        public Criteria andTreenameGreaterThan(String value) {
            addCriterion("treeName >", value, "treename");
            return (Criteria) this;
        }

        public Criteria andTreenameGreaterThanOrEqualTo(String value) {
            addCriterion("treeName >=", value, "treename");
            return (Criteria) this;
        }

        public Criteria andTreenameLessThan(String value) {
            addCriterion("treeName <", value, "treename");
            return (Criteria) this;
        }

        public Criteria andTreenameLessThanOrEqualTo(String value) {
            addCriterion("treeName <=", value, "treename");
            return (Criteria) this;
        }

        public Criteria andTreenameLike(String value) {
            addCriterion("treeName like", value, "treename");
            return (Criteria) this;
        }

        public Criteria andTreenameNotLike(String value) {
            addCriterion("treeName not like", value, "treename");
            return (Criteria) this;
        }

        public Criteria andTreenameIn(List<String> values) {
            addCriterion("treeName in", values, "treename");
            return (Criteria) this;
        }

        public Criteria andTreenameNotIn(List<String> values) {
            addCriterion("treeName not in", values, "treename");
            return (Criteria) this;
        }

        public Criteria andTreenameBetween(String value1, String value2) {
            addCriterion("treeName between", value1, value2, "treename");
            return (Criteria) this;
        }

        public Criteria andTreenameNotBetween(String value1, String value2) {
            addCriterion("treeName not between", value1, value2, "treename");
            return (Criteria) this;
        }

        public Criteria andTothersIsNull() {
            addCriterion("tOthers is null");
            return (Criteria) this;
        }

        public Criteria andTothersIsNotNull() {
            addCriterion("tOthers is not null");
            return (Criteria) this;
        }

        public Criteria andTothersEqualTo(String value) {
            addCriterion("tOthers =", value, "tothers");
            return (Criteria) this;
        }

        public Criteria andTothersNotEqualTo(String value) {
            addCriterion("tOthers <>", value, "tothers");
            return (Criteria) this;
        }

        public Criteria andTothersGreaterThan(String value) {
            addCriterion("tOthers >", value, "tothers");
            return (Criteria) this;
        }

        public Criteria andTothersGreaterThanOrEqualTo(String value) {
            addCriterion("tOthers >=", value, "tothers");
            return (Criteria) this;
        }

        public Criteria andTothersLessThan(String value) {
            addCriterion("tOthers <", value, "tothers");
            return (Criteria) this;
        }

        public Criteria andTothersLessThanOrEqualTo(String value) {
            addCriterion("tOthers <=", value, "tothers");
            return (Criteria) this;
        }

        public Criteria andTothersLike(String value) {
            addCriterion("tOthers like", value, "tothers");
            return (Criteria) this;
        }

        public Criteria andTothersNotLike(String value) {
            addCriterion("tOthers not like", value, "tothers");
            return (Criteria) this;
        }

        public Criteria andTothersIn(List<String> values) {
            addCriterion("tOthers in", values, "tothers");
            return (Criteria) this;
        }

        public Criteria andTothersNotIn(List<String> values) {
            addCriterion("tOthers not in", values, "tothers");
            return (Criteria) this;
        }

        public Criteria andTothersBetween(String value1, String value2) {
            addCriterion("tOthers between", value1, value2, "tothers");
            return (Criteria) this;
        }

        public Criteria andTothersNotBetween(String value1, String value2) {
            addCriterion("tOthers not between", value1, value2, "tothers");
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