package com.woniu.domain;

import java.util.ArrayList;
import java.util.List;

public class ProductindetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductindetailExample() {
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

        public Criteria andPiinquantiyIsNull() {
            addCriterion("PIInQuantiy is null");
            return (Criteria) this;
        }

        public Criteria andPiinquantiyIsNotNull() {
            addCriterion("PIInQuantiy is not null");
            return (Criteria) this;
        }

        public Criteria andPiinquantiyEqualTo(Integer value) {
            addCriterion("PIInQuantiy =", value, "piinquantiy");
            return (Criteria) this;
        }

        public Criteria andPiinquantiyNotEqualTo(Integer value) {
            addCriterion("PIInQuantiy <>", value, "piinquantiy");
            return (Criteria) this;
        }

        public Criteria andPiinquantiyGreaterThan(Integer value) {
            addCriterion("PIInQuantiy >", value, "piinquantiy");
            return (Criteria) this;
        }

        public Criteria andPiinquantiyGreaterThanOrEqualTo(Integer value) {
            addCriterion("PIInQuantiy >=", value, "piinquantiy");
            return (Criteria) this;
        }

        public Criteria andPiinquantiyLessThan(Integer value) {
            addCriterion("PIInQuantiy <", value, "piinquantiy");
            return (Criteria) this;
        }

        public Criteria andPiinquantiyLessThanOrEqualTo(Integer value) {
            addCriterion("PIInQuantiy <=", value, "piinquantiy");
            return (Criteria) this;
        }

        public Criteria andPiinquantiyIn(List<Integer> values) {
            addCriterion("PIInQuantiy in", values, "piinquantiy");
            return (Criteria) this;
        }

        public Criteria andPiinquantiyNotIn(List<Integer> values) {
            addCriterion("PIInQuantiy not in", values, "piinquantiy");
            return (Criteria) this;
        }

        public Criteria andPiinquantiyBetween(Integer value1, Integer value2) {
            addCriterion("PIInQuantiy between", value1, value2, "piinquantiy");
            return (Criteria) this;
        }

        public Criteria andPiinquantiyNotBetween(Integer value1, Integer value2) {
            addCriterion("PIInQuantiy not between", value1, value2, "piinquantiy");
            return (Criteria) this;
        }

        public Criteria andPimportpriceIsNull() {
            addCriterion("PimportPrice is null");
            return (Criteria) this;
        }

        public Criteria andPimportpriceIsNotNull() {
            addCriterion("PimportPrice is not null");
            return (Criteria) this;
        }

        public Criteria andPimportpriceEqualTo(Float value) {
            addCriterion("PimportPrice =", value, "pimportprice");
            return (Criteria) this;
        }

        public Criteria andPimportpriceNotEqualTo(Float value) {
            addCriterion("PimportPrice <>", value, "pimportprice");
            return (Criteria) this;
        }

        public Criteria andPimportpriceGreaterThan(Float value) {
            addCriterion("PimportPrice >", value, "pimportprice");
            return (Criteria) this;
        }

        public Criteria andPimportpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("PimportPrice >=", value, "pimportprice");
            return (Criteria) this;
        }

        public Criteria andPimportpriceLessThan(Float value) {
            addCriterion("PimportPrice <", value, "pimportprice");
            return (Criteria) this;
        }

        public Criteria andPimportpriceLessThanOrEqualTo(Float value) {
            addCriterion("PimportPrice <=", value, "pimportprice");
            return (Criteria) this;
        }

        public Criteria andPimportpriceIn(List<Float> values) {
            addCriterion("PimportPrice in", values, "pimportprice");
            return (Criteria) this;
        }

        public Criteria andPimportpriceNotIn(List<Float> values) {
            addCriterion("PimportPrice not in", values, "pimportprice");
            return (Criteria) this;
        }

        public Criteria andPimportpriceBetween(Float value1, Float value2) {
            addCriterion("PimportPrice between", value1, value2, "pimportprice");
            return (Criteria) this;
        }

        public Criteria andPimportpriceNotBetween(Float value1, Float value2) {
            addCriterion("PimportPrice not between", value1, value2, "pimportprice");
            return (Criteria) this;
        }

        public Criteria andSupplieridIsNull() {
            addCriterion("SupplierID is null");
            return (Criteria) this;
        }

        public Criteria andSupplieridIsNotNull() {
            addCriterion("SupplierID is not null");
            return (Criteria) this;
        }

        public Criteria andSupplieridEqualTo(Integer value) {
            addCriterion("SupplierID =", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotEqualTo(Integer value) {
            addCriterion("SupplierID <>", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThan(Integer value) {
            addCriterion("SupplierID >", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThanOrEqualTo(Integer value) {
            addCriterion("SupplierID >=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThan(Integer value) {
            addCriterion("SupplierID <", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThanOrEqualTo(Integer value) {
            addCriterion("SupplierID <=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridIn(List<Integer> values) {
            addCriterion("SupplierID in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotIn(List<Integer> values) {
            addCriterion("SupplierID not in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridBetween(Integer value1, Integer value2) {
            addCriterion("SupplierID between", value1, value2, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotBetween(Integer value1, Integer value2) {
            addCriterion("SupplierID not between", value1, value2, "supplierid");
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