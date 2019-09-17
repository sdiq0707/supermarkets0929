package com.woniu.domain;

import java.util.ArrayList;
import java.util.List;

public class BackdetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BackdetailExample() {
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

        public Criteria andBdidIsNull() {
            addCriterion("BDID is null");
            return (Criteria) this;
        }

        public Criteria andBdidIsNotNull() {
            addCriterion("BDID is not null");
            return (Criteria) this;
        }

        public Criteria andBdidEqualTo(Integer value) {
            addCriterion("BDID =", value, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidNotEqualTo(Integer value) {
            addCriterion("BDID <>", value, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidGreaterThan(Integer value) {
            addCriterion("BDID >", value, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BDID >=", value, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidLessThan(Integer value) {
            addCriterion("BDID <", value, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidLessThanOrEqualTo(Integer value) {
            addCriterion("BDID <=", value, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidIn(List<Integer> values) {
            addCriterion("BDID in", values, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidNotIn(List<Integer> values) {
            addCriterion("BDID not in", values, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidBetween(Integer value1, Integer value2) {
            addCriterion("BDID between", value1, value2, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidNotBetween(Integer value1, Integer value2) {
            addCriterion("BDID not between", value1, value2, "bdid");
            return (Criteria) this;
        }

        public Criteria andProductidIsNull() {
            addCriterion("ProductID is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("ProductID is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(Integer value) {
            addCriterion("ProductID =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(Integer value) {
            addCriterion("ProductID <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(Integer value) {
            addCriterion("ProductID >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProductID >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(Integer value) {
            addCriterion("ProductID <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(Integer value) {
            addCriterion("ProductID <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<Integer> values) {
            addCriterion("ProductID in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<Integer> values) {
            addCriterion("ProductID not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(Integer value1, Integer value2) {
            addCriterion("ProductID between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(Integer value1, Integer value2) {
            addCriterion("ProductID not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andPunitIsNull() {
            addCriterion("Punit is null");
            return (Criteria) this;
        }

        public Criteria andPunitIsNotNull() {
            addCriterion("Punit is not null");
            return (Criteria) this;
        }

        public Criteria andPunitEqualTo(String value) {
            addCriterion("Punit =", value, "punit");
            return (Criteria) this;
        }

        public Criteria andPunitNotEqualTo(String value) {
            addCriterion("Punit <>", value, "punit");
            return (Criteria) this;
        }

        public Criteria andPunitGreaterThan(String value) {
            addCriterion("Punit >", value, "punit");
            return (Criteria) this;
        }

        public Criteria andPunitGreaterThanOrEqualTo(String value) {
            addCriterion("Punit >=", value, "punit");
            return (Criteria) this;
        }

        public Criteria andPunitLessThan(String value) {
            addCriterion("Punit <", value, "punit");
            return (Criteria) this;
        }

        public Criteria andPunitLessThanOrEqualTo(String value) {
            addCriterion("Punit <=", value, "punit");
            return (Criteria) this;
        }

        public Criteria andPunitLike(String value) {
            addCriterion("Punit like", value, "punit");
            return (Criteria) this;
        }

        public Criteria andPunitNotLike(String value) {
            addCriterion("Punit not like", value, "punit");
            return (Criteria) this;
        }

        public Criteria andPunitIn(List<String> values) {
            addCriterion("Punit in", values, "punit");
            return (Criteria) this;
        }

        public Criteria andPunitNotIn(List<String> values) {
            addCriterion("Punit not in", values, "punit");
            return (Criteria) this;
        }

        public Criteria andPunitBetween(String value1, String value2) {
            addCriterion("Punit between", value1, value2, "punit");
            return (Criteria) this;
        }

        public Criteria andPunitNotBetween(String value1, String value2) {
            addCriterion("Punit not between", value1, value2, "punit");
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