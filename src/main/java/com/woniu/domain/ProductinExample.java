package com.woniu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProductinExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductinExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andPiidIsNull() {
            addCriterion("PIID is null");
            return (Criteria) this;
        }

        public Criteria andPiidIsNotNull() {
            addCriterion("PIID is not null");
            return (Criteria) this;
        }

        public Criteria andPiidEqualTo(Integer value) {
            addCriterion("PIID =", value, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidNotEqualTo(Integer value) {
            addCriterion("PIID <>", value, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidGreaterThan(Integer value) {
            addCriterion("PIID >", value, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PIID >=", value, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidLessThan(Integer value) {
            addCriterion("PIID <", value, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidLessThanOrEqualTo(Integer value) {
            addCriterion("PIID <=", value, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidIn(List<Integer> values) {
            addCriterion("PIID in", values, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidNotIn(List<Integer> values) {
            addCriterion("PIID not in", values, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidBetween(Integer value1, Integer value2) {
            addCriterion("PIID between", value1, value2, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidNotBetween(Integer value1, Integer value2) {
            addCriterion("PIID not between", value1, value2, "piid");
            return (Criteria) this;
        }

        public Criteria andPiindateIsNull() {
            addCriterion("PIInDate is null");
            return (Criteria) this;
        }

        public Criteria andPiindateIsNotNull() {
            addCriterion("PIInDate is not null");
            return (Criteria) this;
        }

        public Criteria andPiindateEqualTo(Date value) {
            addCriterionForJDBCDate("PIInDate =", value, "piindate");
            return (Criteria) this;
        }

        public Criteria andPiindateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PIInDate <>", value, "piindate");
            return (Criteria) this;
        }

        public Criteria andPiindateGreaterThan(Date value) {
            addCriterionForJDBCDate("PIInDate >", value, "piindate");
            return (Criteria) this;
        }

        public Criteria andPiindateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PIInDate >=", value, "piindate");
            return (Criteria) this;
        }

        public Criteria andPiindateLessThan(Date value) {
            addCriterionForJDBCDate("PIInDate <", value, "piindate");
            return (Criteria) this;
        }

        public Criteria andPiindateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PIInDate <=", value, "piindate");
            return (Criteria) this;
        }

        public Criteria andPiindateIn(List<Date> values) {
            addCriterionForJDBCDate("PIInDate in", values, "piindate");
            return (Criteria) this;
        }

        public Criteria andPiindateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PIInDate not in", values, "piindate");
            return (Criteria) this;
        }

        public Criteria andPiindateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PIInDate between", value1, value2, "piindate");
            return (Criteria) this;
        }

        public Criteria andPiindateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PIInDate not between", value1, value2, "piindate");
            return (Criteria) this;
        }

        public Criteria andPiallpriceIsNull() {
            addCriterion("PIAllPrice is null");
            return (Criteria) this;
        }

        public Criteria andPiallpriceIsNotNull() {
            addCriterion("PIAllPrice is not null");
            return (Criteria) this;
        }

        public Criteria andPiallpriceEqualTo(Float value) {
            addCriterion("PIAllPrice =", value, "piallprice");
            return (Criteria) this;
        }

        public Criteria andPiallpriceNotEqualTo(Float value) {
            addCriterion("PIAllPrice <>", value, "piallprice");
            return (Criteria) this;
        }

        public Criteria andPiallpriceGreaterThan(Float value) {
            addCriterion("PIAllPrice >", value, "piallprice");
            return (Criteria) this;
        }

        public Criteria andPiallpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("PIAllPrice >=", value, "piallprice");
            return (Criteria) this;
        }

        public Criteria andPiallpriceLessThan(Float value) {
            addCriterion("PIAllPrice <", value, "piallprice");
            return (Criteria) this;
        }

        public Criteria andPiallpriceLessThanOrEqualTo(Float value) {
            addCriterion("PIAllPrice <=", value, "piallprice");
            return (Criteria) this;
        }

        public Criteria andPiallpriceIn(List<Float> values) {
            addCriterion("PIAllPrice in", values, "piallprice");
            return (Criteria) this;
        }

        public Criteria andPiallpriceNotIn(List<Float> values) {
            addCriterion("PIAllPrice not in", values, "piallprice");
            return (Criteria) this;
        }

        public Criteria andPiallpriceBetween(Float value1, Float value2) {
            addCriterion("PIAllPrice between", value1, value2, "piallprice");
            return (Criteria) this;
        }

        public Criteria andPiallpriceNotBetween(Float value1, Float value2) {
            addCriterion("PIAllPrice not between", value1, value2, "piallprice");
            return (Criteria) this;
        }

        public Criteria andPipaywayIsNull() {
            addCriterion("PIPayWay is null");
            return (Criteria) this;
        }

        public Criteria andPipaywayIsNotNull() {
            addCriterion("PIPayWay is not null");
            return (Criteria) this;
        }

        public Criteria andPipaywayEqualTo(String value) {
            addCriterion("PIPayWay =", value, "pipayway");
            return (Criteria) this;
        }

        public Criteria andPipaywayNotEqualTo(String value) {
            addCriterion("PIPayWay <>", value, "pipayway");
            return (Criteria) this;
        }

        public Criteria andPipaywayGreaterThan(String value) {
            addCriterion("PIPayWay >", value, "pipayway");
            return (Criteria) this;
        }

        public Criteria andPipaywayGreaterThanOrEqualTo(String value) {
            addCriterion("PIPayWay >=", value, "pipayway");
            return (Criteria) this;
        }

        public Criteria andPipaywayLessThan(String value) {
            addCriterion("PIPayWay <", value, "pipayway");
            return (Criteria) this;
        }

        public Criteria andPipaywayLessThanOrEqualTo(String value) {
            addCriterion("PIPayWay <=", value, "pipayway");
            return (Criteria) this;
        }

        public Criteria andPipaywayLike(String value) {
            addCriterion("PIPayWay like", value, "pipayway");
            return (Criteria) this;
        }

        public Criteria andPipaywayNotLike(String value) {
            addCriterion("PIPayWay not like", value, "pipayway");
            return (Criteria) this;
        }

        public Criteria andPipaywayIn(List<String> values) {
            addCriterion("PIPayWay in", values, "pipayway");
            return (Criteria) this;
        }

        public Criteria andPipaywayNotIn(List<String> values) {
            addCriterion("PIPayWay not in", values, "pipayway");
            return (Criteria) this;
        }

        public Criteria andPipaywayBetween(String value1, String value2) {
            addCriterion("PIPayWay between", value1, value2, "pipayway");
            return (Criteria) this;
        }

        public Criteria andPipaywayNotBetween(String value1, String value2) {
            addCriterion("PIPayWay not between", value1, value2, "pipayway");
            return (Criteria) this;
        }

        public Criteria andPipayIsNull() {
            addCriterion("PIPay is null");
            return (Criteria) this;
        }

        public Criteria andPipayIsNotNull() {
            addCriterion("PIPay is not null");
            return (Criteria) this;
        }

        public Criteria andPipayEqualTo(String value) {
            addCriterion("PIPay =", value, "pipay");
            return (Criteria) this;
        }

        public Criteria andPipayNotEqualTo(String value) {
            addCriterion("PIPay <>", value, "pipay");
            return (Criteria) this;
        }

        public Criteria andPipayGreaterThan(String value) {
            addCriterion("PIPay >", value, "pipay");
            return (Criteria) this;
        }

        public Criteria andPipayGreaterThanOrEqualTo(String value) {
            addCriterion("PIPay >=", value, "pipay");
            return (Criteria) this;
        }

        public Criteria andPipayLessThan(String value) {
            addCriterion("PIPay <", value, "pipay");
            return (Criteria) this;
        }

        public Criteria andPipayLessThanOrEqualTo(String value) {
            addCriterion("PIPay <=", value, "pipay");
            return (Criteria) this;
        }

        public Criteria andPipayLike(String value) {
            addCriterion("PIPay like", value, "pipay");
            return (Criteria) this;
        }

        public Criteria andPipayNotLike(String value) {
            addCriterion("PIPay not like", value, "pipay");
            return (Criteria) this;
        }

        public Criteria andPipayIn(List<String> values) {
            addCriterion("PIPay in", values, "pipay");
            return (Criteria) this;
        }

        public Criteria andPipayNotIn(List<String> values) {
            addCriterion("PIPay not in", values, "pipay");
            return (Criteria) this;
        }

        public Criteria andPipayBetween(String value1, String value2) {
            addCriterion("PIPay between", value1, value2, "pipay");
            return (Criteria) this;
        }

        public Criteria andPipayNotBetween(String value1, String value2) {
            addCriterion("PIPay not between", value1, value2, "pipay");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andPiothersIsNull() {
            addCriterion("PIOthers is null");
            return (Criteria) this;
        }

        public Criteria andPiothersIsNotNull() {
            addCriterion("PIOthers is not null");
            return (Criteria) this;
        }

        public Criteria andPiothersEqualTo(String value) {
            addCriterion("PIOthers =", value, "piothers");
            return (Criteria) this;
        }

        public Criteria andPiothersNotEqualTo(String value) {
            addCriterion("PIOthers <>", value, "piothers");
            return (Criteria) this;
        }

        public Criteria andPiothersGreaterThan(String value) {
            addCriterion("PIOthers >", value, "piothers");
            return (Criteria) this;
        }

        public Criteria andPiothersGreaterThanOrEqualTo(String value) {
            addCriterion("PIOthers >=", value, "piothers");
            return (Criteria) this;
        }

        public Criteria andPiothersLessThan(String value) {
            addCriterion("PIOthers <", value, "piothers");
            return (Criteria) this;
        }

        public Criteria andPiothersLessThanOrEqualTo(String value) {
            addCriterion("PIOthers <=", value, "piothers");
            return (Criteria) this;
        }

        public Criteria andPiothersLike(String value) {
            addCriterion("PIOthers like", value, "piothers");
            return (Criteria) this;
        }

        public Criteria andPiothersNotLike(String value) {
            addCriterion("PIOthers not like", value, "piothers");
            return (Criteria) this;
        }

        public Criteria andPiothersIn(List<String> values) {
            addCriterion("PIOthers in", values, "piothers");
            return (Criteria) this;
        }

        public Criteria andPiothersNotIn(List<String> values) {
            addCriterion("PIOthers not in", values, "piothers");
            return (Criteria) this;
        }

        public Criteria andPiothersBetween(String value1, String value2) {
            addCriterion("PIOthers between", value1, value2, "piothers");
            return (Criteria) this;
        }

        public Criteria andPiothersNotBetween(String value1, String value2) {
            addCriterion("PIOthers not between", value1, value2, "piothers");
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