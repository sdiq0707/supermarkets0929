package com.woniu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProductbackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductbackExample() {
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

        public Criteria andPbidIsNull() {
            addCriterion("PBID is null");
            return (Criteria) this;
        }

        public Criteria andPbidIsNotNull() {
            addCriterion("PBID is not null");
            return (Criteria) this;
        }

        public Criteria andPbidEqualTo(Integer value) {
            addCriterion("PBID =", value, "pbid");
            return (Criteria) this;
        }

        public Criteria andPbidNotEqualTo(Integer value) {
            addCriterion("PBID <>", value, "pbid");
            return (Criteria) this;
        }

        public Criteria andPbidGreaterThan(Integer value) {
            addCriterion("PBID >", value, "pbid");
            return (Criteria) this;
        }

        public Criteria andPbidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PBID >=", value, "pbid");
            return (Criteria) this;
        }

        public Criteria andPbidLessThan(Integer value) {
            addCriterion("PBID <", value, "pbid");
            return (Criteria) this;
        }

        public Criteria andPbidLessThanOrEqualTo(Integer value) {
            addCriterion("PBID <=", value, "pbid");
            return (Criteria) this;
        }

        public Criteria andPbidIn(List<Integer> values) {
            addCriterion("PBID in", values, "pbid");
            return (Criteria) this;
        }

        public Criteria andPbidNotIn(List<Integer> values) {
            addCriterion("PBID not in", values, "pbid");
            return (Criteria) this;
        }

        public Criteria andPbidBetween(Integer value1, Integer value2) {
            addCriterion("PBID between", value1, value2, "pbid");
            return (Criteria) this;
        }

        public Criteria andPbidNotBetween(Integer value1, Integer value2) {
            addCriterion("PBID not between", value1, value2, "pbid");
            return (Criteria) this;
        }

        public Criteria andPballpriceIsNull() {
            addCriterion("PBAllPrice is null");
            return (Criteria) this;
        }

        public Criteria andPballpriceIsNotNull() {
            addCriterion("PBAllPrice is not null");
            return (Criteria) this;
        }

        public Criteria andPballpriceEqualTo(Float value) {
            addCriterion("PBAllPrice =", value, "pballprice");
            return (Criteria) this;
        }

        public Criteria andPballpriceNotEqualTo(Float value) {
            addCriterion("PBAllPrice <>", value, "pballprice");
            return (Criteria) this;
        }

        public Criteria andPballpriceGreaterThan(Float value) {
            addCriterion("PBAllPrice >", value, "pballprice");
            return (Criteria) this;
        }

        public Criteria andPballpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("PBAllPrice >=", value, "pballprice");
            return (Criteria) this;
        }

        public Criteria andPballpriceLessThan(Float value) {
            addCriterion("PBAllPrice <", value, "pballprice");
            return (Criteria) this;
        }

        public Criteria andPballpriceLessThanOrEqualTo(Float value) {
            addCriterion("PBAllPrice <=", value, "pballprice");
            return (Criteria) this;
        }

        public Criteria andPballpriceIn(List<Float> values) {
            addCriterion("PBAllPrice in", values, "pballprice");
            return (Criteria) this;
        }

        public Criteria andPballpriceNotIn(List<Float> values) {
            addCriterion("PBAllPrice not in", values, "pballprice");
            return (Criteria) this;
        }

        public Criteria andPballpriceBetween(Float value1, Float value2) {
            addCriterion("PBAllPrice between", value1, value2, "pballprice");
            return (Criteria) this;
        }

        public Criteria andPballpriceNotBetween(Float value1, Float value2) {
            addCriterion("PBAllPrice not between", value1, value2, "pballprice");
            return (Criteria) this;
        }

        public Criteria andPbdateIsNull() {
            addCriterion("PBDate is null");
            return (Criteria) this;
        }

        public Criteria andPbdateIsNotNull() {
            addCriterion("PBDate is not null");
            return (Criteria) this;
        }

        public Criteria andPbdateEqualTo(Date value) {
            addCriterionForJDBCDate("PBDate =", value, "pbdate");
            return (Criteria) this;
        }

        public Criteria andPbdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PBDate <>", value, "pbdate");
            return (Criteria) this;
        }

        public Criteria andPbdateGreaterThan(Date value) {
            addCriterionForJDBCDate("PBDate >", value, "pbdate");
            return (Criteria) this;
        }

        public Criteria andPbdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PBDate >=", value, "pbdate");
            return (Criteria) this;
        }

        public Criteria andPbdateLessThan(Date value) {
            addCriterionForJDBCDate("PBDate <", value, "pbdate");
            return (Criteria) this;
        }

        public Criteria andPbdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PBDate <=", value, "pbdate");
            return (Criteria) this;
        }

        public Criteria andPbdateIn(List<Date> values) {
            addCriterionForJDBCDate("PBDate in", values, "pbdate");
            return (Criteria) this;
        }

        public Criteria andPbdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PBDate not in", values, "pbdate");
            return (Criteria) this;
        }

        public Criteria andPbdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PBDate between", value1, value2, "pbdate");
            return (Criteria) this;
        }

        public Criteria andPbdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PBDate not between", value1, value2, "pbdate");
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

        public Criteria andPbothersIsNull() {
            addCriterion("PBOthers is null");
            return (Criteria) this;
        }

        public Criteria andPbothersIsNotNull() {
            addCriterion("PBOthers is not null");
            return (Criteria) this;
        }

        public Criteria andPbothersEqualTo(String value) {
            addCriterion("PBOthers =", value, "pbothers");
            return (Criteria) this;
        }

        public Criteria andPbothersNotEqualTo(String value) {
            addCriterion("PBOthers <>", value, "pbothers");
            return (Criteria) this;
        }

        public Criteria andPbothersGreaterThan(String value) {
            addCriterion("PBOthers >", value, "pbothers");
            return (Criteria) this;
        }

        public Criteria andPbothersGreaterThanOrEqualTo(String value) {
            addCriterion("PBOthers >=", value, "pbothers");
            return (Criteria) this;
        }

        public Criteria andPbothersLessThan(String value) {
            addCriterion("PBOthers <", value, "pbothers");
            return (Criteria) this;
        }

        public Criteria andPbothersLessThanOrEqualTo(String value) {
            addCriterion("PBOthers <=", value, "pbothers");
            return (Criteria) this;
        }

        public Criteria andPbothersLike(String value) {
            addCriterion("PBOthers like", value, "pbothers");
            return (Criteria) this;
        }

        public Criteria andPbothersNotLike(String value) {
            addCriterion("PBOthers not like", value, "pbothers");
            return (Criteria) this;
        }

        public Criteria andPbothersIn(List<String> values) {
            addCriterion("PBOthers in", values, "pbothers");
            return (Criteria) this;
        }

        public Criteria andPbothersNotIn(List<String> values) {
            addCriterion("PBOthers not in", values, "pbothers");
            return (Criteria) this;
        }

        public Criteria andPbothersBetween(String value1, String value2) {
            addCriterion("PBOthers between", value1, value2, "pbothers");
            return (Criteria) this;
        }

        public Criteria andPbothersNotBetween(String value1, String value2) {
            addCriterion("PBOthers not between", value1, value2, "pbothers");
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