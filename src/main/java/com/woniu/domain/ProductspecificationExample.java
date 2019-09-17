package com.woniu.domain;

import java.util.ArrayList;
import java.util.List;

public class ProductspecificationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductspecificationExample() {
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

        public Criteria andPsidIsNull() {
            addCriterion("PSID is null");
            return (Criteria) this;
        }

        public Criteria andPsidIsNotNull() {
            addCriterion("PSID is not null");
            return (Criteria) this;
        }

        public Criteria andPsidEqualTo(Integer value) {
            addCriterion("PSID =", value, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidNotEqualTo(Integer value) {
            addCriterion("PSID <>", value, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidGreaterThan(Integer value) {
            addCriterion("PSID >", value, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PSID >=", value, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidLessThan(Integer value) {
            addCriterion("PSID <", value, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidLessThanOrEqualTo(Integer value) {
            addCriterion("PSID <=", value, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidIn(List<Integer> values) {
            addCriterion("PSID in", values, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidNotIn(List<Integer> values) {
            addCriterion("PSID not in", values, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidBetween(Integer value1, Integer value2) {
            addCriterion("PSID between", value1, value2, "psid");
            return (Criteria) this;
        }

        public Criteria andPsidNotBetween(Integer value1, Integer value2) {
            addCriterion("PSID not between", value1, value2, "psid");
            return (Criteria) this;
        }

        public Criteria andPsnameIsNull() {
            addCriterion("PSName is null");
            return (Criteria) this;
        }

        public Criteria andPsnameIsNotNull() {
            addCriterion("PSName is not null");
            return (Criteria) this;
        }

        public Criteria andPsnameEqualTo(String value) {
            addCriterion("PSName =", value, "psname");
            return (Criteria) this;
        }

        public Criteria andPsnameNotEqualTo(String value) {
            addCriterion("PSName <>", value, "psname");
            return (Criteria) this;
        }

        public Criteria andPsnameGreaterThan(String value) {
            addCriterion("PSName >", value, "psname");
            return (Criteria) this;
        }

        public Criteria andPsnameGreaterThanOrEqualTo(String value) {
            addCriterion("PSName >=", value, "psname");
            return (Criteria) this;
        }

        public Criteria andPsnameLessThan(String value) {
            addCriterion("PSName <", value, "psname");
            return (Criteria) this;
        }

        public Criteria andPsnameLessThanOrEqualTo(String value) {
            addCriterion("PSName <=", value, "psname");
            return (Criteria) this;
        }

        public Criteria andPsnameLike(String value) {
            addCriterion("PSName like", value, "psname");
            return (Criteria) this;
        }

        public Criteria andPsnameNotLike(String value) {
            addCriterion("PSName not like", value, "psname");
            return (Criteria) this;
        }

        public Criteria andPsnameIn(List<String> values) {
            addCriterion("PSName in", values, "psname");
            return (Criteria) this;
        }

        public Criteria andPsnameNotIn(List<String> values) {
            addCriterion("PSName not in", values, "psname");
            return (Criteria) this;
        }

        public Criteria andPsnameBetween(String value1, String value2) {
            addCriterion("PSName between", value1, value2, "psname");
            return (Criteria) this;
        }

        public Criteria andPsnameNotBetween(String value1, String value2) {
            addCriterion("PSName not between", value1, value2, "psname");
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