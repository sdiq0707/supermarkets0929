package com.woniu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ReducepriceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReducepriceExample() {
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

        public Criteria andRidIsNull() {
            addCriterion("RID is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("RID is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(Integer value) {
            addCriterion("RID =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(Integer value) {
            addCriterion("RID <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(Integer value) {
            addCriterion("RID >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(Integer value) {
            addCriterion("RID >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(Integer value) {
            addCriterion("RID <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(Integer value) {
            addCriterion("RID <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<Integer> values) {
            addCriterion("RID in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<Integer> values) {
            addCriterion("RID not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(Integer value1, Integer value2) {
            addCriterion("RID between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(Integer value1, Integer value2) {
            addCriterion("RID not between", value1, value2, "rid");
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

        public Criteria andRchangepriceIsNull() {
            addCriterion("RChangePrice is null");
            return (Criteria) this;
        }

        public Criteria andRchangepriceIsNotNull() {
            addCriterion("RChangePrice is not null");
            return (Criteria) this;
        }

        public Criteria andRchangepriceEqualTo(Float value) {
            addCriterion("RChangePrice =", value, "rchangeprice");
            return (Criteria) this;
        }

        public Criteria andRchangepriceNotEqualTo(Float value) {
            addCriterion("RChangePrice <>", value, "rchangeprice");
            return (Criteria) this;
        }

        public Criteria andRchangepriceGreaterThan(Float value) {
            addCriterion("RChangePrice >", value, "rchangeprice");
            return (Criteria) this;
        }

        public Criteria andRchangepriceGreaterThanOrEqualTo(Float value) {
            addCriterion("RChangePrice >=", value, "rchangeprice");
            return (Criteria) this;
        }

        public Criteria andRchangepriceLessThan(Float value) {
            addCriterion("RChangePrice <", value, "rchangeprice");
            return (Criteria) this;
        }

        public Criteria andRchangepriceLessThanOrEqualTo(Float value) {
            addCriterion("RChangePrice <=", value, "rchangeprice");
            return (Criteria) this;
        }

        public Criteria andRchangepriceIn(List<Float> values) {
            addCriterion("RChangePrice in", values, "rchangeprice");
            return (Criteria) this;
        }

        public Criteria andRchangepriceNotIn(List<Float> values) {
            addCriterion("RChangePrice not in", values, "rchangeprice");
            return (Criteria) this;
        }

        public Criteria andRchangepriceBetween(Float value1, Float value2) {
            addCriterion("RChangePrice between", value1, value2, "rchangeprice");
            return (Criteria) this;
        }

        public Criteria andRchangepriceNotBetween(Float value1, Float value2) {
            addCriterion("RChangePrice not between", value1, value2, "rchangeprice");
            return (Criteria) this;
        }

        public Criteria andRchangevippriceIsNull() {
            addCriterion("RChangeVIPPrice is null");
            return (Criteria) this;
        }

        public Criteria andRchangevippriceIsNotNull() {
            addCriterion("RChangeVIPPrice is not null");
            return (Criteria) this;
        }

        public Criteria andRchangevippriceEqualTo(Float value) {
            addCriterion("RChangeVIPPrice =", value, "rchangevipprice");
            return (Criteria) this;
        }

        public Criteria andRchangevippriceNotEqualTo(Float value) {
            addCriterion("RChangeVIPPrice <>", value, "rchangevipprice");
            return (Criteria) this;
        }

        public Criteria andRchangevippriceGreaterThan(Float value) {
            addCriterion("RChangeVIPPrice >", value, "rchangevipprice");
            return (Criteria) this;
        }

        public Criteria andRchangevippriceGreaterThanOrEqualTo(Float value) {
            addCriterion("RChangeVIPPrice >=", value, "rchangevipprice");
            return (Criteria) this;
        }

        public Criteria andRchangevippriceLessThan(Float value) {
            addCriterion("RChangeVIPPrice <", value, "rchangevipprice");
            return (Criteria) this;
        }

        public Criteria andRchangevippriceLessThanOrEqualTo(Float value) {
            addCriterion("RChangeVIPPrice <=", value, "rchangevipprice");
            return (Criteria) this;
        }

        public Criteria andRchangevippriceIn(List<Float> values) {
            addCriterion("RChangeVIPPrice in", values, "rchangevipprice");
            return (Criteria) this;
        }

        public Criteria andRchangevippriceNotIn(List<Float> values) {
            addCriterion("RChangeVIPPrice not in", values, "rchangevipprice");
            return (Criteria) this;
        }

        public Criteria andRchangevippriceBetween(Float value1, Float value2) {
            addCriterion("RChangeVIPPrice between", value1, value2, "rchangevipprice");
            return (Criteria) this;
        }

        public Criteria andRchangevippriceNotBetween(Float value1, Float value2) {
            addCriterion("RChangeVIPPrice not between", value1, value2, "rchangevipprice");
            return (Criteria) this;
        }

        public Criteria andRsdateIsNull() {
            addCriterion("RSDate is null");
            return (Criteria) this;
        }

        public Criteria andRsdateIsNotNull() {
            addCriterion("RSDate is not null");
            return (Criteria) this;
        }

        public Criteria andRsdateEqualTo(Date value) {
            addCriterionForJDBCDate("RSDate =", value, "rsdate");
            return (Criteria) this;
        }

        public Criteria andRsdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("RSDate <>", value, "rsdate");
            return (Criteria) this;
        }

        public Criteria andRsdateGreaterThan(Date value) {
            addCriterionForJDBCDate("RSDate >", value, "rsdate");
            return (Criteria) this;
        }

        public Criteria andRsdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RSDate >=", value, "rsdate");
            return (Criteria) this;
        }

        public Criteria andRsdateLessThan(Date value) {
            addCriterionForJDBCDate("RSDate <", value, "rsdate");
            return (Criteria) this;
        }

        public Criteria andRsdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RSDate <=", value, "rsdate");
            return (Criteria) this;
        }

        public Criteria andRsdateIn(List<Date> values) {
            addCriterionForJDBCDate("RSDate in", values, "rsdate");
            return (Criteria) this;
        }

        public Criteria andRsdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("RSDate not in", values, "rsdate");
            return (Criteria) this;
        }

        public Criteria andRsdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RSDate between", value1, value2, "rsdate");
            return (Criteria) this;
        }

        public Criteria andRsdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RSDate not between", value1, value2, "rsdate");
            return (Criteria) this;
        }

        public Criteria andRedateIsNull() {
            addCriterion("REDate is null");
            return (Criteria) this;
        }

        public Criteria andRedateIsNotNull() {
            addCriterion("REDate is not null");
            return (Criteria) this;
        }

        public Criteria andRedateEqualTo(Date value) {
            addCriterionForJDBCDate("REDate =", value, "redate");
            return (Criteria) this;
        }

        public Criteria andRedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("REDate <>", value, "redate");
            return (Criteria) this;
        }

        public Criteria andRedateGreaterThan(Date value) {
            addCriterionForJDBCDate("REDate >", value, "redate");
            return (Criteria) this;
        }

        public Criteria andRedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REDate >=", value, "redate");
            return (Criteria) this;
        }

        public Criteria andRedateLessThan(Date value) {
            addCriterionForJDBCDate("REDate <", value, "redate");
            return (Criteria) this;
        }

        public Criteria andRedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REDate <=", value, "redate");
            return (Criteria) this;
        }

        public Criteria andRedateIn(List<Date> values) {
            addCriterionForJDBCDate("REDate in", values, "redate");
            return (Criteria) this;
        }

        public Criteria andRedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("REDate not in", values, "redate");
            return (Criteria) this;
        }

        public Criteria andRedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REDate between", value1, value2, "redate");
            return (Criteria) this;
        }

        public Criteria andRedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REDate not between", value1, value2, "redate");
            return (Criteria) this;
        }

        public Criteria andRothersIsNull() {
            addCriterion("ROthers is null");
            return (Criteria) this;
        }

        public Criteria andRothersIsNotNull() {
            addCriterion("ROthers is not null");
            return (Criteria) this;
        }

        public Criteria andRothersEqualTo(String value) {
            addCriterion("ROthers =", value, "rothers");
            return (Criteria) this;
        }

        public Criteria andRothersNotEqualTo(String value) {
            addCriterion("ROthers <>", value, "rothers");
            return (Criteria) this;
        }

        public Criteria andRothersGreaterThan(String value) {
            addCriterion("ROthers >", value, "rothers");
            return (Criteria) this;
        }

        public Criteria andRothersGreaterThanOrEqualTo(String value) {
            addCriterion("ROthers >=", value, "rothers");
            return (Criteria) this;
        }

        public Criteria andRothersLessThan(String value) {
            addCriterion("ROthers <", value, "rothers");
            return (Criteria) this;
        }

        public Criteria andRothersLessThanOrEqualTo(String value) {
            addCriterion("ROthers <=", value, "rothers");
            return (Criteria) this;
        }

        public Criteria andRothersLike(String value) {
            addCriterion("ROthers like", value, "rothers");
            return (Criteria) this;
        }

        public Criteria andRothersNotLike(String value) {
            addCriterion("ROthers not like", value, "rothers");
            return (Criteria) this;
        }

        public Criteria andRothersIn(List<String> values) {
            addCriterion("ROthers in", values, "rothers");
            return (Criteria) this;
        }

        public Criteria andRothersNotIn(List<String> values) {
            addCriterion("ROthers not in", values, "rothers");
            return (Criteria) this;
        }

        public Criteria andRothersBetween(String value1, String value2) {
            addCriterion("ROthers between", value1, value2, "rothers");
            return (Criteria) this;
        }

        public Criteria andRothersNotBetween(String value1, String value2) {
            addCriterion("ROthers not between", value1, value2, "rothers");
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