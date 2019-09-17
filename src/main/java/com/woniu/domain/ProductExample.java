package com.woniu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andPspecificationIsNull() {
            addCriterion("PSpecification is null");
            return (Criteria) this;
        }

        public Criteria andPspecificationIsNotNull() {
            addCriterion("PSpecification is not null");
            return (Criteria) this;
        }

        public Criteria andPspecificationEqualTo(String value) {
            addCriterion("PSpecification =", value, "pspecification");
            return (Criteria) this;
        }

        public Criteria andPspecificationNotEqualTo(String value) {
            addCriterion("PSpecification <>", value, "pspecification");
            return (Criteria) this;
        }

        public Criteria andPspecificationGreaterThan(String value) {
            addCriterion("PSpecification >", value, "pspecification");
            return (Criteria) this;
        }

        public Criteria andPspecificationGreaterThanOrEqualTo(String value) {
            addCriterion("PSpecification >=", value, "pspecification");
            return (Criteria) this;
        }

        public Criteria andPspecificationLessThan(String value) {
            addCriterion("PSpecification <", value, "pspecification");
            return (Criteria) this;
        }

        public Criteria andPspecificationLessThanOrEqualTo(String value) {
            addCriterion("PSpecification <=", value, "pspecification");
            return (Criteria) this;
        }

        public Criteria andPspecificationLike(String value) {
            addCriterion("PSpecification like", value, "pspecification");
            return (Criteria) this;
        }

        public Criteria andPspecificationNotLike(String value) {
            addCriterion("PSpecification not like", value, "pspecification");
            return (Criteria) this;
        }

        public Criteria andPspecificationIn(List<String> values) {
            addCriterion("PSpecification in", values, "pspecification");
            return (Criteria) this;
        }

        public Criteria andPspecificationNotIn(List<String> values) {
            addCriterion("PSpecification not in", values, "pspecification");
            return (Criteria) this;
        }

        public Criteria andPspecificationBetween(String value1, String value2) {
            addCriterion("PSpecification between", value1, value2, "pspecification");
            return (Criteria) this;
        }

        public Criteria andPspecificationNotBetween(String value1, String value2) {
            addCriterion("PSpecification not between", value1, value2, "pspecification");
            return (Criteria) this;
        }

        public Criteria andPcolorIsNull() {
            addCriterion("PColor is null");
            return (Criteria) this;
        }

        public Criteria andPcolorIsNotNull() {
            addCriterion("PColor is not null");
            return (Criteria) this;
        }

        public Criteria andPcolorEqualTo(String value) {
            addCriterion("PColor =", value, "pcolor");
            return (Criteria) this;
        }

        public Criteria andPcolorNotEqualTo(String value) {
            addCriterion("PColor <>", value, "pcolor");
            return (Criteria) this;
        }

        public Criteria andPcolorGreaterThan(String value) {
            addCriterion("PColor >", value, "pcolor");
            return (Criteria) this;
        }

        public Criteria andPcolorGreaterThanOrEqualTo(String value) {
            addCriterion("PColor >=", value, "pcolor");
            return (Criteria) this;
        }

        public Criteria andPcolorLessThan(String value) {
            addCriterion("PColor <", value, "pcolor");
            return (Criteria) this;
        }

        public Criteria andPcolorLessThanOrEqualTo(String value) {
            addCriterion("PColor <=", value, "pcolor");
            return (Criteria) this;
        }

        public Criteria andPcolorLike(String value) {
            addCriterion("PColor like", value, "pcolor");
            return (Criteria) this;
        }

        public Criteria andPcolorNotLike(String value) {
            addCriterion("PColor not like", value, "pcolor");
            return (Criteria) this;
        }

        public Criteria andPcolorIn(List<String> values) {
            addCriterion("PColor in", values, "pcolor");
            return (Criteria) this;
        }

        public Criteria andPcolorNotIn(List<String> values) {
            addCriterion("PColor not in", values, "pcolor");
            return (Criteria) this;
        }

        public Criteria andPcolorBetween(String value1, String value2) {
            addCriterion("PColor between", value1, value2, "pcolor");
            return (Criteria) this;
        }

        public Criteria andPcolorNotBetween(String value1, String value2) {
            addCriterion("PColor not between", value1, value2, "pcolor");
            return (Criteria) this;
        }

        public Criteria andPstateIsNull() {
            addCriterion("PState is null");
            return (Criteria) this;
        }

        public Criteria andPstateIsNotNull() {
            addCriterion("PState is not null");
            return (Criteria) this;
        }

        public Criteria andPstateEqualTo(String value) {
            addCriterion("PState =", value, "pstate");
            return (Criteria) this;
        }

        public Criteria andPstateNotEqualTo(String value) {
            addCriterion("PState <>", value, "pstate");
            return (Criteria) this;
        }

        public Criteria andPstateGreaterThan(String value) {
            addCriterion("PState >", value, "pstate");
            return (Criteria) this;
        }

        public Criteria andPstateGreaterThanOrEqualTo(String value) {
            addCriterion("PState >=", value, "pstate");
            return (Criteria) this;
        }

        public Criteria andPstateLessThan(String value) {
            addCriterion("PState <", value, "pstate");
            return (Criteria) this;
        }

        public Criteria andPstateLessThanOrEqualTo(String value) {
            addCriterion("PState <=", value, "pstate");
            return (Criteria) this;
        }

        public Criteria andPstateLike(String value) {
            addCriterion("PState like", value, "pstate");
            return (Criteria) this;
        }

        public Criteria andPstateNotLike(String value) {
            addCriterion("PState not like", value, "pstate");
            return (Criteria) this;
        }

        public Criteria andPstateIn(List<String> values) {
            addCriterion("PState in", values, "pstate");
            return (Criteria) this;
        }

        public Criteria andPstateNotIn(List<String> values) {
            addCriterion("PState not in", values, "pstate");
            return (Criteria) this;
        }

        public Criteria andPstateBetween(String value1, String value2) {
            addCriterion("PState between", value1, value2, "pstate");
            return (Criteria) this;
        }

        public Criteria andPstateNotBetween(String value1, String value2) {
            addCriterion("PState not between", value1, value2, "pstate");
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

        public Criteria andPimportpriceIsNull() {
            addCriterion("PImportPrice is null");
            return (Criteria) this;
        }

        public Criteria andPimportpriceIsNotNull() {
            addCriterion("PImportPrice is not null");
            return (Criteria) this;
        }

        public Criteria andPimportpriceEqualTo(Float value) {
            addCriterion("PImportPrice =", value, "pimportprice");
            return (Criteria) this;
        }

        public Criteria andPimportpriceNotEqualTo(Float value) {
            addCriterion("PImportPrice <>", value, "pimportprice");
            return (Criteria) this;
        }

        public Criteria andPimportpriceGreaterThan(Float value) {
            addCriterion("PImportPrice >", value, "pimportprice");
            return (Criteria) this;
        }

        public Criteria andPimportpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("PImportPrice >=", value, "pimportprice");
            return (Criteria) this;
        }

        public Criteria andPimportpriceLessThan(Float value) {
            addCriterion("PImportPrice <", value, "pimportprice");
            return (Criteria) this;
        }

        public Criteria andPimportpriceLessThanOrEqualTo(Float value) {
            addCriterion("PImportPrice <=", value, "pimportprice");
            return (Criteria) this;
        }

        public Criteria andPimportpriceIn(List<Float> values) {
            addCriterion("PImportPrice in", values, "pimportprice");
            return (Criteria) this;
        }

        public Criteria andPimportpriceNotIn(List<Float> values) {
            addCriterion("PImportPrice not in", values, "pimportprice");
            return (Criteria) this;
        }

        public Criteria andPimportpriceBetween(Float value1, Float value2) {
            addCriterion("PImportPrice between", value1, value2, "pimportprice");
            return (Criteria) this;
        }

        public Criteria andPimportpriceNotBetween(Float value1, Float value2) {
            addCriterion("PImportPrice not between", value1, value2, "pimportprice");
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

        public Criteria andPstocknumIsNull() {
            addCriterion("PStockNum is null");
            return (Criteria) this;
        }

        public Criteria andPstocknumIsNotNull() {
            addCriterion("PStockNum is not null");
            return (Criteria) this;
        }

        public Criteria andPstocknumEqualTo(Integer value) {
            addCriterion("PStockNum =", value, "pstocknum");
            return (Criteria) this;
        }

        public Criteria andPstocknumNotEqualTo(Integer value) {
            addCriterion("PStockNum <>", value, "pstocknum");
            return (Criteria) this;
        }

        public Criteria andPstocknumGreaterThan(Integer value) {
            addCriterion("PStockNum >", value, "pstocknum");
            return (Criteria) this;
        }

        public Criteria andPstocknumGreaterThanOrEqualTo(Integer value) {
            addCriterion("PStockNum >=", value, "pstocknum");
            return (Criteria) this;
        }

        public Criteria andPstocknumLessThan(Integer value) {
            addCriterion("PStockNum <", value, "pstocknum");
            return (Criteria) this;
        }

        public Criteria andPstocknumLessThanOrEqualTo(Integer value) {
            addCriterion("PStockNum <=", value, "pstocknum");
            return (Criteria) this;
        }

        public Criteria andPstocknumIn(List<Integer> values) {
            addCriterion("PStockNum in", values, "pstocknum");
            return (Criteria) this;
        }

        public Criteria andPstocknumNotIn(List<Integer> values) {
            addCriterion("PStockNum not in", values, "pstocknum");
            return (Criteria) this;
        }

        public Criteria andPstocknumBetween(Integer value1, Integer value2) {
            addCriterion("PStockNum between", value1, value2, "pstocknum");
            return (Criteria) this;
        }

        public Criteria andPstocknumNotBetween(Integer value1, Integer value2) {
            addCriterion("PStockNum not between", value1, value2, "pstocknum");
            return (Criteria) this;
        }

        public Criteria andPcautionnumIsNull() {
            addCriterion("PCautionNum is null");
            return (Criteria) this;
        }

        public Criteria andPcautionnumIsNotNull() {
            addCriterion("PCautionNum is not null");
            return (Criteria) this;
        }

        public Criteria andPcautionnumEqualTo(Integer value) {
            addCriterion("PCautionNum =", value, "pcautionnum");
            return (Criteria) this;
        }

        public Criteria andPcautionnumNotEqualTo(Integer value) {
            addCriterion("PCautionNum <>", value, "pcautionnum");
            return (Criteria) this;
        }

        public Criteria andPcautionnumGreaterThan(Integer value) {
            addCriterion("PCautionNum >", value, "pcautionnum");
            return (Criteria) this;
        }

        public Criteria andPcautionnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("PCautionNum >=", value, "pcautionnum");
            return (Criteria) this;
        }

        public Criteria andPcautionnumLessThan(Integer value) {
            addCriterion("PCautionNum <", value, "pcautionnum");
            return (Criteria) this;
        }

        public Criteria andPcautionnumLessThanOrEqualTo(Integer value) {
            addCriterion("PCautionNum <=", value, "pcautionnum");
            return (Criteria) this;
        }

        public Criteria andPcautionnumIn(List<Integer> values) {
            addCriterion("PCautionNum in", values, "pcautionnum");
            return (Criteria) this;
        }

        public Criteria andPcautionnumNotIn(List<Integer> values) {
            addCriterion("PCautionNum not in", values, "pcautionnum");
            return (Criteria) this;
        }

        public Criteria andPcautionnumBetween(Integer value1, Integer value2) {
            addCriterion("PCautionNum between", value1, value2, "pcautionnum");
            return (Criteria) this;
        }

        public Criteria andPcautionnumNotBetween(Integer value1, Integer value2) {
            addCriterion("PCautionNum not between", value1, value2, "pcautionnum");
            return (Criteria) this;
        }

        public Criteria andPdeaddateIsNull() {
            addCriterion("PDeadDate is null");
            return (Criteria) this;
        }

        public Criteria andPdeaddateIsNotNull() {
            addCriterion("PDeadDate is not null");
            return (Criteria) this;
        }

        public Criteria andPdeaddateEqualTo(Date value) {
            addCriterionForJDBCDate("PDeadDate =", value, "pdeaddate");
            return (Criteria) this;
        }

        public Criteria andPdeaddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PDeadDate <>", value, "pdeaddate");
            return (Criteria) this;
        }

        public Criteria andPdeaddateGreaterThan(Date value) {
            addCriterionForJDBCDate("PDeadDate >", value, "pdeaddate");
            return (Criteria) this;
        }

        public Criteria andPdeaddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PDeadDate >=", value, "pdeaddate");
            return (Criteria) this;
        }

        public Criteria andPdeaddateLessThan(Date value) {
            addCriterionForJDBCDate("PDeadDate <", value, "pdeaddate");
            return (Criteria) this;
        }

        public Criteria andPdeaddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PDeadDate <=", value, "pdeaddate");
            return (Criteria) this;
        }

        public Criteria andPdeaddateIn(List<Date> values) {
            addCriterionForJDBCDate("PDeadDate in", values, "pdeaddate");
            return (Criteria) this;
        }

        public Criteria andPdeaddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PDeadDate not in", values, "pdeaddate");
            return (Criteria) this;
        }

        public Criteria andPdeaddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PDeadDate between", value1, value2, "pdeaddate");
            return (Criteria) this;
        }

        public Criteria andPdeaddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PDeadDate not between", value1, value2, "pdeaddate");
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

        public Criteria andPothersIsNull() {
            addCriterion("POthers is null");
            return (Criteria) this;
        }

        public Criteria andPothersIsNotNull() {
            addCriterion("POthers is not null");
            return (Criteria) this;
        }

        public Criteria andPothersEqualTo(String value) {
            addCriterion("POthers =", value, "pothers");
            return (Criteria) this;
        }

        public Criteria andPothersNotEqualTo(String value) {
            addCriterion("POthers <>", value, "pothers");
            return (Criteria) this;
        }

        public Criteria andPothersGreaterThan(String value) {
            addCriterion("POthers >", value, "pothers");
            return (Criteria) this;
        }

        public Criteria andPothersGreaterThanOrEqualTo(String value) {
            addCriterion("POthers >=", value, "pothers");
            return (Criteria) this;
        }

        public Criteria andPothersLessThan(String value) {
            addCriterion("POthers <", value, "pothers");
            return (Criteria) this;
        }

        public Criteria andPothersLessThanOrEqualTo(String value) {
            addCriterion("POthers <=", value, "pothers");
            return (Criteria) this;
        }

        public Criteria andPothersLike(String value) {
            addCriterion("POthers like", value, "pothers");
            return (Criteria) this;
        }

        public Criteria andPothersNotLike(String value) {
            addCriterion("POthers not like", value, "pothers");
            return (Criteria) this;
        }

        public Criteria andPothersIn(List<String> values) {
            addCriterion("POthers in", values, "pothers");
            return (Criteria) this;
        }

        public Criteria andPothersNotIn(List<String> values) {
            addCriterion("POthers not in", values, "pothers");
            return (Criteria) this;
        }

        public Criteria andPothersBetween(String value1, String value2) {
            addCriterion("POthers between", value1, value2, "pothers");
            return (Criteria) this;
        }

        public Criteria andPothersNotBetween(String value1, String value2) {
            addCriterion("POthers not between", value1, value2, "pothers");
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