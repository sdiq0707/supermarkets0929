package com.woniu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SalesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalesExample() {
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

        public Criteria andSaleidIsNull() {
            addCriterion("saleID is null");
            return (Criteria) this;
        }

        public Criteria andSaleidIsNotNull() {
            addCriterion("saleID is not null");
            return (Criteria) this;
        }

        public Criteria andSaleidEqualTo(Integer value) {
            addCriterion("saleID =", value, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidNotEqualTo(Integer value) {
            addCriterion("saleID <>", value, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidGreaterThan(Integer value) {
            addCriterion("saleID >", value, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("saleID >=", value, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidLessThan(Integer value) {
            addCriterion("saleID <", value, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidLessThanOrEqualTo(Integer value) {
            addCriterion("saleID <=", value, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidIn(List<Integer> values) {
            addCriterion("saleID in", values, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidNotIn(List<Integer> values) {
            addCriterion("saleID not in", values, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidBetween(Integer value1, Integer value2) {
            addCriterion("saleID between", value1, value2, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidNotBetween(Integer value1, Integer value2) {
            addCriterion("saleID not between", value1, value2, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleallpriceIsNull() {
            addCriterion("saleAllPrice is null");
            return (Criteria) this;
        }

        public Criteria andSaleallpriceIsNotNull() {
            addCriterion("saleAllPrice is not null");
            return (Criteria) this;
        }

        public Criteria andSaleallpriceEqualTo(Float value) {
            addCriterion("saleAllPrice =", value, "saleallprice");
            return (Criteria) this;
        }

        public Criteria andSaleallpriceNotEqualTo(Float value) {
            addCriterion("saleAllPrice <>", value, "saleallprice");
            return (Criteria) this;
        }

        public Criteria andSaleallpriceGreaterThan(Float value) {
            addCriterion("saleAllPrice >", value, "saleallprice");
            return (Criteria) this;
        }

        public Criteria andSaleallpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("saleAllPrice >=", value, "saleallprice");
            return (Criteria) this;
        }

        public Criteria andSaleallpriceLessThan(Float value) {
            addCriterion("saleAllPrice <", value, "saleallprice");
            return (Criteria) this;
        }

        public Criteria andSaleallpriceLessThanOrEqualTo(Float value) {
            addCriterion("saleAllPrice <=", value, "saleallprice");
            return (Criteria) this;
        }

        public Criteria andSaleallpriceIn(List<Float> values) {
            addCriterion("saleAllPrice in", values, "saleallprice");
            return (Criteria) this;
        }

        public Criteria andSaleallpriceNotIn(List<Float> values) {
            addCriterion("saleAllPrice not in", values, "saleallprice");
            return (Criteria) this;
        }

        public Criteria andSaleallpriceBetween(Float value1, Float value2) {
            addCriterion("saleAllPrice between", value1, value2, "saleallprice");
            return (Criteria) this;
        }

        public Criteria andSaleallpriceNotBetween(Float value1, Float value2) {
            addCriterion("saleAllPrice not between", value1, value2, "saleallprice");
            return (Criteria) this;
        }

        public Criteria andSaledateIsNull() {
            addCriterion("saleDate is null");
            return (Criteria) this;
        }

        public Criteria andSaledateIsNotNull() {
            addCriterion("saleDate is not null");
            return (Criteria) this;
        }

        public Criteria andSaledateEqualTo(Date value) {
            addCriterionForJDBCDate("saleDate =", value, "saledate");
            return (Criteria) this;
        }

        public Criteria andSaledateNotEqualTo(Date value) {
            addCriterionForJDBCDate("saleDate <>", value, "saledate");
            return (Criteria) this;
        }

        public Criteria andSaledateGreaterThan(Date value) {
            addCriterionForJDBCDate("saleDate >", value, "saledate");
            return (Criteria) this;
        }

        public Criteria andSaledateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("saleDate >=", value, "saledate");
            return (Criteria) this;
        }

        public Criteria andSaledateLessThan(Date value) {
            addCriterionForJDBCDate("saleDate <", value, "saledate");
            return (Criteria) this;
        }

        public Criteria andSaledateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("saleDate <=", value, "saledate");
            return (Criteria) this;
        }

        public Criteria andSaledateIn(List<Date> values) {
            addCriterionForJDBCDate("saleDate in", values, "saledate");
            return (Criteria) this;
        }

        public Criteria andSaledateNotIn(List<Date> values) {
            addCriterionForJDBCDate("saleDate not in", values, "saledate");
            return (Criteria) this;
        }

        public Criteria andSaledateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("saleDate between", value1, value2, "saledate");
            return (Criteria) this;
        }

        public Criteria andSaledateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("saleDate not between", value1, value2, "saledate");
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

        public Criteria andSdidIsNull() {
            addCriterion("SDID is null");
            return (Criteria) this;
        }

        public Criteria andSdidIsNotNull() {
            addCriterion("SDID is not null");
            return (Criteria) this;
        }

        public Criteria andSdidEqualTo(Integer value) {
            addCriterion("SDID =", value, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidNotEqualTo(Integer value) {
            addCriterion("SDID <>", value, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidGreaterThan(Integer value) {
            addCriterion("SDID >", value, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SDID >=", value, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidLessThan(Integer value) {
            addCriterion("SDID <", value, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidLessThanOrEqualTo(Integer value) {
            addCriterion("SDID <=", value, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidIn(List<Integer> values) {
            addCriterion("SDID in", values, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidNotIn(List<Integer> values) {
            addCriterion("SDID not in", values, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidBetween(Integer value1, Integer value2) {
            addCriterion("SDID between", value1, value2, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidNotBetween(Integer value1, Integer value2) {
            addCriterion("SDID not between", value1, value2, "sdid");
            return (Criteria) this;
        }

        public Criteria andVipidIsNull() {
            addCriterion("VIPID is null");
            return (Criteria) this;
        }

        public Criteria andVipidIsNotNull() {
            addCriterion("VIPID is not null");
            return (Criteria) this;
        }

        public Criteria andVipidEqualTo(Integer value) {
            addCriterion("VIPID =", value, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidNotEqualTo(Integer value) {
            addCriterion("VIPID <>", value, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidGreaterThan(Integer value) {
            addCriterion("VIPID >", value, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidGreaterThanOrEqualTo(Integer value) {
            addCriterion("VIPID >=", value, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidLessThan(Integer value) {
            addCriterion("VIPID <", value, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidLessThanOrEqualTo(Integer value) {
            addCriterion("VIPID <=", value, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidIn(List<Integer> values) {
            addCriterion("VIPID in", values, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidNotIn(List<Integer> values) {
            addCriterion("VIPID not in", values, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidBetween(Integer value1, Integer value2) {
            addCriterion("VIPID between", value1, value2, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidNotBetween(Integer value1, Integer value2) {
            addCriterion("VIPID not between", value1, value2, "vipid");
            return (Criteria) this;
        }

        public Criteria andSaleothersIsNull() {
            addCriterion("saleOthers is null");
            return (Criteria) this;
        }

        public Criteria andSaleothersIsNotNull() {
            addCriterion("saleOthers is not null");
            return (Criteria) this;
        }

        public Criteria andSaleothersEqualTo(String value) {
            addCriterion("saleOthers =", value, "saleothers");
            return (Criteria) this;
        }

        public Criteria andSaleothersNotEqualTo(String value) {
            addCriterion("saleOthers <>", value, "saleothers");
            return (Criteria) this;
        }

        public Criteria andSaleothersGreaterThan(String value) {
            addCriterion("saleOthers >", value, "saleothers");
            return (Criteria) this;
        }

        public Criteria andSaleothersGreaterThanOrEqualTo(String value) {
            addCriterion("saleOthers >=", value, "saleothers");
            return (Criteria) this;
        }

        public Criteria andSaleothersLessThan(String value) {
            addCriterion("saleOthers <", value, "saleothers");
            return (Criteria) this;
        }

        public Criteria andSaleothersLessThanOrEqualTo(String value) {
            addCriterion("saleOthers <=", value, "saleothers");
            return (Criteria) this;
        }

        public Criteria andSaleothersLike(String value) {
            addCriterion("saleOthers like", value, "saleothers");
            return (Criteria) this;
        }

        public Criteria andSaleothersNotLike(String value) {
            addCriterion("saleOthers not like", value, "saleothers");
            return (Criteria) this;
        }

        public Criteria andSaleothersIn(List<String> values) {
            addCriterion("saleOthers in", values, "saleothers");
            return (Criteria) this;
        }

        public Criteria andSaleothersNotIn(List<String> values) {
            addCriterion("saleOthers not in", values, "saleothers");
            return (Criteria) this;
        }

        public Criteria andSaleothersBetween(String value1, String value2) {
            addCriterion("saleOthers between", value1, value2, "saleothers");
            return (Criteria) this;
        }

        public Criteria andSaleothersNotBetween(String value1, String value2) {
            addCriterion("saleOthers not between", value1, value2, "saleothers");
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