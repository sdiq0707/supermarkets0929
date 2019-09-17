package com.woniu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class VipExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VipExample() {
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

        public Criteria andVipnameIsNull() {
            addCriterion("VIPName is null");
            return (Criteria) this;
        }

        public Criteria andVipnameIsNotNull() {
            addCriterion("VIPName is not null");
            return (Criteria) this;
        }

        public Criteria andVipnameEqualTo(String value) {
            addCriterion("VIPName =", value, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameNotEqualTo(String value) {
            addCriterion("VIPName <>", value, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameGreaterThan(String value) {
            addCriterion("VIPName >", value, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameGreaterThanOrEqualTo(String value) {
            addCriterion("VIPName >=", value, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameLessThan(String value) {
            addCriterion("VIPName <", value, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameLessThanOrEqualTo(String value) {
            addCriterion("VIPName <=", value, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameLike(String value) {
            addCriterion("VIPName like", value, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameNotLike(String value) {
            addCriterion("VIPName not like", value, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameIn(List<String> values) {
            addCriterion("VIPName in", values, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameNotIn(List<String> values) {
            addCriterion("VIPName not in", values, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameBetween(String value1, String value2) {
            addCriterion("VIPName between", value1, value2, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameNotBetween(String value1, String value2) {
            addCriterion("VIPName not between", value1, value2, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipscoreIsNull() {
            addCriterion("VIPScore is null");
            return (Criteria) this;
        }

        public Criteria andVipscoreIsNotNull() {
            addCriterion("VIPScore is not null");
            return (Criteria) this;
        }

        public Criteria andVipscoreEqualTo(Integer value) {
            addCriterion("VIPScore =", value, "vipscore");
            return (Criteria) this;
        }

        public Criteria andVipscoreNotEqualTo(Integer value) {
            addCriterion("VIPScore <>", value, "vipscore");
            return (Criteria) this;
        }

        public Criteria andVipscoreGreaterThan(Integer value) {
            addCriterion("VIPScore >", value, "vipscore");
            return (Criteria) this;
        }

        public Criteria andVipscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("VIPScore >=", value, "vipscore");
            return (Criteria) this;
        }

        public Criteria andVipscoreLessThan(Integer value) {
            addCriterion("VIPScore <", value, "vipscore");
            return (Criteria) this;
        }

        public Criteria andVipscoreLessThanOrEqualTo(Integer value) {
            addCriterion("VIPScore <=", value, "vipscore");
            return (Criteria) this;
        }

        public Criteria andVipscoreIn(List<Integer> values) {
            addCriterion("VIPScore in", values, "vipscore");
            return (Criteria) this;
        }

        public Criteria andVipscoreNotIn(List<Integer> values) {
            addCriterion("VIPScore not in", values, "vipscore");
            return (Criteria) this;
        }

        public Criteria andVipscoreBetween(Integer value1, Integer value2) {
            addCriterion("VIPScore between", value1, value2, "vipscore");
            return (Criteria) this;
        }

        public Criteria andVipscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("VIPScore not between", value1, value2, "vipscore");
            return (Criteria) this;
        }

        public Criteria andVipparkIsNull() {
            addCriterion("VIPPark is null");
            return (Criteria) this;
        }

        public Criteria andVipparkIsNotNull() {
            addCriterion("VIPPark is not null");
            return (Criteria) this;
        }

        public Criteria andVipparkEqualTo(String value) {
            addCriterion("VIPPark =", value, "vippark");
            return (Criteria) this;
        }

        public Criteria andVipparkNotEqualTo(String value) {
            addCriterion("VIPPark <>", value, "vippark");
            return (Criteria) this;
        }

        public Criteria andVipparkGreaterThan(String value) {
            addCriterion("VIPPark >", value, "vippark");
            return (Criteria) this;
        }

        public Criteria andVipparkGreaterThanOrEqualTo(String value) {
            addCriterion("VIPPark >=", value, "vippark");
            return (Criteria) this;
        }

        public Criteria andVipparkLessThan(String value) {
            addCriterion("VIPPark <", value, "vippark");
            return (Criteria) this;
        }

        public Criteria andVipparkLessThanOrEqualTo(String value) {
            addCriterion("VIPPark <=", value, "vippark");
            return (Criteria) this;
        }

        public Criteria andVipparkLike(String value) {
            addCriterion("VIPPark like", value, "vippark");
            return (Criteria) this;
        }

        public Criteria andVipparkNotLike(String value) {
            addCriterion("VIPPark not like", value, "vippark");
            return (Criteria) this;
        }

        public Criteria andVipparkIn(List<String> values) {
            addCriterion("VIPPark in", values, "vippark");
            return (Criteria) this;
        }

        public Criteria andVipparkNotIn(List<String> values) {
            addCriterion("VIPPark not in", values, "vippark");
            return (Criteria) this;
        }

        public Criteria andVipparkBetween(String value1, String value2) {
            addCriterion("VIPPark between", value1, value2, "vippark");
            return (Criteria) this;
        }

        public Criteria andVipparkNotBetween(String value1, String value2) {
            addCriterion("VIPPark not between", value1, value2, "vippark");
            return (Criteria) this;
        }

        public Criteria andVipphoneIsNull() {
            addCriterion("VIPPhone is null");
            return (Criteria) this;
        }

        public Criteria andVipphoneIsNotNull() {
            addCriterion("VIPPhone is not null");
            return (Criteria) this;
        }

        public Criteria andVipphoneEqualTo(String value) {
            addCriterion("VIPPhone =", value, "vipphone");
            return (Criteria) this;
        }

        public Criteria andVipphoneNotEqualTo(String value) {
            addCriterion("VIPPhone <>", value, "vipphone");
            return (Criteria) this;
        }

        public Criteria andVipphoneGreaterThan(String value) {
            addCriterion("VIPPhone >", value, "vipphone");
            return (Criteria) this;
        }

        public Criteria andVipphoneGreaterThanOrEqualTo(String value) {
            addCriterion("VIPPhone >=", value, "vipphone");
            return (Criteria) this;
        }

        public Criteria andVipphoneLessThan(String value) {
            addCriterion("VIPPhone <", value, "vipphone");
            return (Criteria) this;
        }

        public Criteria andVipphoneLessThanOrEqualTo(String value) {
            addCriterion("VIPPhone <=", value, "vipphone");
            return (Criteria) this;
        }

        public Criteria andVipphoneLike(String value) {
            addCriterion("VIPPhone like", value, "vipphone");
            return (Criteria) this;
        }

        public Criteria andVipphoneNotLike(String value) {
            addCriterion("VIPPhone not like", value, "vipphone");
            return (Criteria) this;
        }

        public Criteria andVipphoneIn(List<String> values) {
            addCriterion("VIPPhone in", values, "vipphone");
            return (Criteria) this;
        }

        public Criteria andVipphoneNotIn(List<String> values) {
            addCriterion("VIPPhone not in", values, "vipphone");
            return (Criteria) this;
        }

        public Criteria andVipphoneBetween(String value1, String value2) {
            addCriterion("VIPPhone between", value1, value2, "vipphone");
            return (Criteria) this;
        }

        public Criteria andVipphoneNotBetween(String value1, String value2) {
            addCriterion("VIPPhone not between", value1, value2, "vipphone");
            return (Criteria) this;
        }

        public Criteria andVipdateIsNull() {
            addCriterion("VIPDate is null");
            return (Criteria) this;
        }

        public Criteria andVipdateIsNotNull() {
            addCriterion("VIPDate is not null");
            return (Criteria) this;
        }

        public Criteria andVipdateEqualTo(Date value) {
            addCriterionForJDBCDate("VIPDate =", value, "vipdate");
            return (Criteria) this;
        }

        public Criteria andVipdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("VIPDate <>", value, "vipdate");
            return (Criteria) this;
        }

        public Criteria andVipdateGreaterThan(Date value) {
            addCriterionForJDBCDate("VIPDate >", value, "vipdate");
            return (Criteria) this;
        }

        public Criteria andVipdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("VIPDate >=", value, "vipdate");
            return (Criteria) this;
        }

        public Criteria andVipdateLessThan(Date value) {
            addCriterionForJDBCDate("VIPDate <", value, "vipdate");
            return (Criteria) this;
        }

        public Criteria andVipdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("VIPDate <=", value, "vipdate");
            return (Criteria) this;
        }

        public Criteria andVipdateIn(List<Date> values) {
            addCriterionForJDBCDate("VIPDate in", values, "vipdate");
            return (Criteria) this;
        }

        public Criteria andVipdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("VIPDate not in", values, "vipdate");
            return (Criteria) this;
        }

        public Criteria andVipdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("VIPDate between", value1, value2, "vipdate");
            return (Criteria) this;
        }

        public Criteria andVipdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("VIPDate not between", value1, value2, "vipdate");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
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