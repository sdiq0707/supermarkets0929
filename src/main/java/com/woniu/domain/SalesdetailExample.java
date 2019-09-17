package com.woniu.domain;

import java.util.ArrayList;
import java.util.List;

public class SalesdetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalesdetailExample() {
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

        public Criteria andPnameIsNull() {
            addCriterion("PName is null");
            return (Criteria) this;
        }

        public Criteria andPnameIsNotNull() {
            addCriterion("PName is not null");
            return (Criteria) this;
        }

        public Criteria andPnameEqualTo(String value) {
            addCriterion("PName =", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotEqualTo(String value) {
            addCriterion("PName <>", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThan(String value) {
            addCriterion("PName >", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThanOrEqualTo(String value) {
            addCriterion("PName >=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThan(String value) {
            addCriterion("PName <", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThanOrEqualTo(String value) {
            addCriterion("PName <=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLike(String value) {
            addCriterion("PName like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotLike(String value) {
            addCriterion("PName not like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameIn(List<String> values) {
            addCriterion("PName in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotIn(List<String> values) {
            addCriterion("PName not in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameBetween(String value1, String value2) {
            addCriterion("PName between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotBetween(String value1, String value2) {
            addCriterion("PName not between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andSalequantiyIsNull() {
            addCriterion("saleQuantiy is null");
            return (Criteria) this;
        }

        public Criteria andSalequantiyIsNotNull() {
            addCriterion("saleQuantiy is not null");
            return (Criteria) this;
        }

        public Criteria andSalequantiyEqualTo(Integer value) {
            addCriterion("saleQuantiy =", value, "salequantiy");
            return (Criteria) this;
        }

        public Criteria andSalequantiyNotEqualTo(Integer value) {
            addCriterion("saleQuantiy <>", value, "salequantiy");
            return (Criteria) this;
        }

        public Criteria andSalequantiyGreaterThan(Integer value) {
            addCriterion("saleQuantiy >", value, "salequantiy");
            return (Criteria) this;
        }

        public Criteria andSalequantiyGreaterThanOrEqualTo(Integer value) {
            addCriterion("saleQuantiy >=", value, "salequantiy");
            return (Criteria) this;
        }

        public Criteria andSalequantiyLessThan(Integer value) {
            addCriterion("saleQuantiy <", value, "salequantiy");
            return (Criteria) this;
        }

        public Criteria andSalequantiyLessThanOrEqualTo(Integer value) {
            addCriterion("saleQuantiy <=", value, "salequantiy");
            return (Criteria) this;
        }

        public Criteria andSalequantiyIn(List<Integer> values) {
            addCriterion("saleQuantiy in", values, "salequantiy");
            return (Criteria) this;
        }

        public Criteria andSalequantiyNotIn(List<Integer> values) {
            addCriterion("saleQuantiy not in", values, "salequantiy");
            return (Criteria) this;
        }

        public Criteria andSalequantiyBetween(Integer value1, Integer value2) {
            addCriterion("saleQuantiy between", value1, value2, "salequantiy");
            return (Criteria) this;
        }

        public Criteria andSalequantiyNotBetween(Integer value1, Integer value2) {
            addCriterion("saleQuantiy not between", value1, value2, "salequantiy");
            return (Criteria) this;
        }

        public Criteria andPsellpriceIsNull() {
            addCriterion("PSellPrice is null");
            return (Criteria) this;
        }

        public Criteria andPsellpriceIsNotNull() {
            addCriterion("PSellPrice is not null");
            return (Criteria) this;
        }

        public Criteria andPsellpriceEqualTo(Float value) {
            addCriterion("PSellPrice =", value, "psellprice");
            return (Criteria) this;
        }

        public Criteria andPsellpriceNotEqualTo(Float value) {
            addCriterion("PSellPrice <>", value, "psellprice");
            return (Criteria) this;
        }

        public Criteria andPsellpriceGreaterThan(Float value) {
            addCriterion("PSellPrice >", value, "psellprice");
            return (Criteria) this;
        }

        public Criteria andPsellpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("PSellPrice >=", value, "psellprice");
            return (Criteria) this;
        }

        public Criteria andPsellpriceLessThan(Float value) {
            addCriterion("PSellPrice <", value, "psellprice");
            return (Criteria) this;
        }

        public Criteria andPsellpriceLessThanOrEqualTo(Float value) {
            addCriterion("PSellPrice <=", value, "psellprice");
            return (Criteria) this;
        }

        public Criteria andPsellpriceIn(List<Float> values) {
            addCriterion("PSellPrice in", values, "psellprice");
            return (Criteria) this;
        }

        public Criteria andPsellpriceNotIn(List<Float> values) {
            addCriterion("PSellPrice not in", values, "psellprice");
            return (Criteria) this;
        }

        public Criteria andPsellpriceBetween(Float value1, Float value2) {
            addCriterion("PSellPrice between", value1, value2, "psellprice");
            return (Criteria) this;
        }

        public Criteria andPsellpriceNotBetween(Float value1, Float value2) {
            addCriterion("PSellPrice not between", value1, value2, "psellprice");
            return (Criteria) this;
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