package com.woniu.domain;

import java.util.ArrayList;
import java.util.List;

public class ProducttypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProducttypeExample() {
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

        public Criteria andPtypeidIsNull() {
            addCriterion("PTypeID is null");
            return (Criteria) this;
        }

        public Criteria andPtypeidIsNotNull() {
            addCriterion("PTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andPtypeidEqualTo(Integer value) {
            addCriterion("PTypeID =", value, "ptypeid");
            return (Criteria) this;
        }

        public Criteria andPtypeidNotEqualTo(Integer value) {
            addCriterion("PTypeID <>", value, "ptypeid");
            return (Criteria) this;
        }

        public Criteria andPtypeidGreaterThan(Integer value) {
            addCriterion("PTypeID >", value, "ptypeid");
            return (Criteria) this;
        }

        public Criteria andPtypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PTypeID >=", value, "ptypeid");
            return (Criteria) this;
        }

        public Criteria andPtypeidLessThan(Integer value) {
            addCriterion("PTypeID <", value, "ptypeid");
            return (Criteria) this;
        }

        public Criteria andPtypeidLessThanOrEqualTo(Integer value) {
            addCriterion("PTypeID <=", value, "ptypeid");
            return (Criteria) this;
        }

        public Criteria andPtypeidIn(List<Integer> values) {
            addCriterion("PTypeID in", values, "ptypeid");
            return (Criteria) this;
        }

        public Criteria andPtypeidNotIn(List<Integer> values) {
            addCriterion("PTypeID not in", values, "ptypeid");
            return (Criteria) this;
        }

        public Criteria andPtypeidBetween(Integer value1, Integer value2) {
            addCriterion("PTypeID between", value1, value2, "ptypeid");
            return (Criteria) this;
        }

        public Criteria andPtypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("PTypeID not between", value1, value2, "ptypeid");
            return (Criteria) this;
        }

        public Criteria andPtypenameIsNull() {
            addCriterion("PTypename is null");
            return (Criteria) this;
        }

        public Criteria andPtypenameIsNotNull() {
            addCriterion("PTypename is not null");
            return (Criteria) this;
        }

        public Criteria andPtypenameEqualTo(String value) {
            addCriterion("PTypename =", value, "ptypename");
            return (Criteria) this;
        }

        public Criteria andPtypenameNotEqualTo(String value) {
            addCriterion("PTypename <>", value, "ptypename");
            return (Criteria) this;
        }

        public Criteria andPtypenameGreaterThan(String value) {
            addCriterion("PTypename >", value, "ptypename");
            return (Criteria) this;
        }

        public Criteria andPtypenameGreaterThanOrEqualTo(String value) {
            addCriterion("PTypename >=", value, "ptypename");
            return (Criteria) this;
        }

        public Criteria andPtypenameLessThan(String value) {
            addCriterion("PTypename <", value, "ptypename");
            return (Criteria) this;
        }

        public Criteria andPtypenameLessThanOrEqualTo(String value) {
            addCriterion("PTypename <=", value, "ptypename");
            return (Criteria) this;
        }

        public Criteria andPtypenameLike(String value) {
            addCriterion("PTypename like", value, "ptypename");
            return (Criteria) this;
        }

        public Criteria andPtypenameNotLike(String value) {
            addCriterion("PTypename not like", value, "ptypename");
            return (Criteria) this;
        }

        public Criteria andPtypenameIn(List<String> values) {
            addCriterion("PTypename in", values, "ptypename");
            return (Criteria) this;
        }

        public Criteria andPtypenameNotIn(List<String> values) {
            addCriterion("PTypename not in", values, "ptypename");
            return (Criteria) this;
        }

        public Criteria andPtypenameBetween(String value1, String value2) {
            addCriterion("PTypename between", value1, value2, "ptypename");
            return (Criteria) this;
        }

        public Criteria andPtypenameNotBetween(String value1, String value2) {
            addCriterion("PTypename not between", value1, value2, "ptypename");
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