package com.woniu.domain;

import java.util.ArrayList;
import java.util.List;

public class SupplierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplierExample() {
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

        public Criteria andSnameIsNull() {
            addCriterion("SName is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("SName is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("SName =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("SName <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("SName >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("SName >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("SName <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("SName <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("SName like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("SName not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("SName in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("SName not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("SName between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("SName not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSlinkmanIsNull() {
            addCriterion("SLinkman is null");
            return (Criteria) this;
        }

        public Criteria andSlinkmanIsNotNull() {
            addCriterion("SLinkman is not null");
            return (Criteria) this;
        }

        public Criteria andSlinkmanEqualTo(String value) {
            addCriterion("SLinkman =", value, "slinkman");
            return (Criteria) this;
        }

        public Criteria andSlinkmanNotEqualTo(String value) {
            addCriterion("SLinkman <>", value, "slinkman");
            return (Criteria) this;
        }

        public Criteria andSlinkmanGreaterThan(String value) {
            addCriterion("SLinkman >", value, "slinkman");
            return (Criteria) this;
        }

        public Criteria andSlinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("SLinkman >=", value, "slinkman");
            return (Criteria) this;
        }

        public Criteria andSlinkmanLessThan(String value) {
            addCriterion("SLinkman <", value, "slinkman");
            return (Criteria) this;
        }

        public Criteria andSlinkmanLessThanOrEqualTo(String value) {
            addCriterion("SLinkman <=", value, "slinkman");
            return (Criteria) this;
        }

        public Criteria andSlinkmanLike(String value) {
            addCriterion("SLinkman like", value, "slinkman");
            return (Criteria) this;
        }

        public Criteria andSlinkmanNotLike(String value) {
            addCriterion("SLinkman not like", value, "slinkman");
            return (Criteria) this;
        }

        public Criteria andSlinkmanIn(List<String> values) {
            addCriterion("SLinkman in", values, "slinkman");
            return (Criteria) this;
        }

        public Criteria andSlinkmanNotIn(List<String> values) {
            addCriterion("SLinkman not in", values, "slinkman");
            return (Criteria) this;
        }

        public Criteria andSlinkmanBetween(String value1, String value2) {
            addCriterion("SLinkman between", value1, value2, "slinkman");
            return (Criteria) this;
        }

        public Criteria andSlinkmanNotBetween(String value1, String value2) {
            addCriterion("SLinkman not between", value1, value2, "slinkman");
            return (Criteria) this;
        }

        public Criteria andSphoneIsNull() {
            addCriterion("SPhone is null");
            return (Criteria) this;
        }

        public Criteria andSphoneIsNotNull() {
            addCriterion("SPhone is not null");
            return (Criteria) this;
        }

        public Criteria andSphoneEqualTo(String value) {
            addCriterion("SPhone =", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneNotEqualTo(String value) {
            addCriterion("SPhone <>", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneGreaterThan(String value) {
            addCriterion("SPhone >", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneGreaterThanOrEqualTo(String value) {
            addCriterion("SPhone >=", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneLessThan(String value) {
            addCriterion("SPhone <", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneLessThanOrEqualTo(String value) {
            addCriterion("SPhone <=", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneLike(String value) {
            addCriterion("SPhone like", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneNotLike(String value) {
            addCriterion("SPhone not like", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneIn(List<String> values) {
            addCriterion("SPhone in", values, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneNotIn(List<String> values) {
            addCriterion("SPhone not in", values, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneBetween(String value1, String value2) {
            addCriterion("SPhone between", value1, value2, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneNotBetween(String value1, String value2) {
            addCriterion("SPhone not between", value1, value2, "sphone");
            return (Criteria) this;
        }

        public Criteria andSaddressIsNull() {
            addCriterion("SAddress is null");
            return (Criteria) this;
        }

        public Criteria andSaddressIsNotNull() {
            addCriterion("SAddress is not null");
            return (Criteria) this;
        }

        public Criteria andSaddressEqualTo(String value) {
            addCriterion("SAddress =", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotEqualTo(String value) {
            addCriterion("SAddress <>", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressGreaterThan(String value) {
            addCriterion("SAddress >", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressGreaterThanOrEqualTo(String value) {
            addCriterion("SAddress >=", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressLessThan(String value) {
            addCriterion("SAddress <", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressLessThanOrEqualTo(String value) {
            addCriterion("SAddress <=", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressLike(String value) {
            addCriterion("SAddress like", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotLike(String value) {
            addCriterion("SAddress not like", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressIn(List<String> values) {
            addCriterion("SAddress in", values, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotIn(List<String> values) {
            addCriterion("SAddress not in", values, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressBetween(String value1, String value2) {
            addCriterion("SAddress between", value1, value2, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotBetween(String value1, String value2) {
            addCriterion("SAddress not between", value1, value2, "saddress");
            return (Criteria) this;
        }

        public Criteria andSbankIsNull() {
            addCriterion("SBank is null");
            return (Criteria) this;
        }

        public Criteria andSbankIsNotNull() {
            addCriterion("SBank is not null");
            return (Criteria) this;
        }

        public Criteria andSbankEqualTo(String value) {
            addCriterion("SBank =", value, "sbank");
            return (Criteria) this;
        }

        public Criteria andSbankNotEqualTo(String value) {
            addCriterion("SBank <>", value, "sbank");
            return (Criteria) this;
        }

        public Criteria andSbankGreaterThan(String value) {
            addCriterion("SBank >", value, "sbank");
            return (Criteria) this;
        }

        public Criteria andSbankGreaterThanOrEqualTo(String value) {
            addCriterion("SBank >=", value, "sbank");
            return (Criteria) this;
        }

        public Criteria andSbankLessThan(String value) {
            addCriterion("SBank <", value, "sbank");
            return (Criteria) this;
        }

        public Criteria andSbankLessThanOrEqualTo(String value) {
            addCriterion("SBank <=", value, "sbank");
            return (Criteria) this;
        }

        public Criteria andSbankLike(String value) {
            addCriterion("SBank like", value, "sbank");
            return (Criteria) this;
        }

        public Criteria andSbankNotLike(String value) {
            addCriterion("SBank not like", value, "sbank");
            return (Criteria) this;
        }

        public Criteria andSbankIn(List<String> values) {
            addCriterion("SBank in", values, "sbank");
            return (Criteria) this;
        }

        public Criteria andSbankNotIn(List<String> values) {
            addCriterion("SBank not in", values, "sbank");
            return (Criteria) this;
        }

        public Criteria andSbankBetween(String value1, String value2) {
            addCriterion("SBank between", value1, value2, "sbank");
            return (Criteria) this;
        }

        public Criteria andSbankNotBetween(String value1, String value2) {
            addCriterion("SBank not between", value1, value2, "sbank");
            return (Criteria) this;
        }

        public Criteria andSaccountidIsNull() {
            addCriterion("SAccountID is null");
            return (Criteria) this;
        }

        public Criteria andSaccountidIsNotNull() {
            addCriterion("SAccountID is not null");
            return (Criteria) this;
        }

        public Criteria andSaccountidEqualTo(String value) {
            addCriterion("SAccountID =", value, "saccountid");
            return (Criteria) this;
        }

        public Criteria andSaccountidNotEqualTo(String value) {
            addCriterion("SAccountID <>", value, "saccountid");
            return (Criteria) this;
        }

        public Criteria andSaccountidGreaterThan(String value) {
            addCriterion("SAccountID >", value, "saccountid");
            return (Criteria) this;
        }

        public Criteria andSaccountidGreaterThanOrEqualTo(String value) {
            addCriterion("SAccountID >=", value, "saccountid");
            return (Criteria) this;
        }

        public Criteria andSaccountidLessThan(String value) {
            addCriterion("SAccountID <", value, "saccountid");
            return (Criteria) this;
        }

        public Criteria andSaccountidLessThanOrEqualTo(String value) {
            addCriterion("SAccountID <=", value, "saccountid");
            return (Criteria) this;
        }

        public Criteria andSaccountidLike(String value) {
            addCriterion("SAccountID like", value, "saccountid");
            return (Criteria) this;
        }

        public Criteria andSaccountidNotLike(String value) {
            addCriterion("SAccountID not like", value, "saccountid");
            return (Criteria) this;
        }

        public Criteria andSaccountidIn(List<String> values) {
            addCriterion("SAccountID in", values, "saccountid");
            return (Criteria) this;
        }

        public Criteria andSaccountidNotIn(List<String> values) {
            addCriterion("SAccountID not in", values, "saccountid");
            return (Criteria) this;
        }

        public Criteria andSaccountidBetween(String value1, String value2) {
            addCriterion("SAccountID between", value1, value2, "saccountid");
            return (Criteria) this;
        }

        public Criteria andSaccountidNotBetween(String value1, String value2) {
            addCriterion("SAccountID not between", value1, value2, "saccountid");
            return (Criteria) this;
        }

        public Criteria andSothersIsNull() {
            addCriterion("SOthers is null");
            return (Criteria) this;
        }

        public Criteria andSothersIsNotNull() {
            addCriterion("SOthers is not null");
            return (Criteria) this;
        }

        public Criteria andSothersEqualTo(String value) {
            addCriterion("SOthers =", value, "sothers");
            return (Criteria) this;
        }

        public Criteria andSothersNotEqualTo(String value) {
            addCriterion("SOthers <>", value, "sothers");
            return (Criteria) this;
        }

        public Criteria andSothersGreaterThan(String value) {
            addCriterion("SOthers >", value, "sothers");
            return (Criteria) this;
        }

        public Criteria andSothersGreaterThanOrEqualTo(String value) {
            addCriterion("SOthers >=", value, "sothers");
            return (Criteria) this;
        }

        public Criteria andSothersLessThan(String value) {
            addCriterion("SOthers <", value, "sothers");
            return (Criteria) this;
        }

        public Criteria andSothersLessThanOrEqualTo(String value) {
            addCriterion("SOthers <=", value, "sothers");
            return (Criteria) this;
        }

        public Criteria andSothersLike(String value) {
            addCriterion("SOthers like", value, "sothers");
            return (Criteria) this;
        }

        public Criteria andSothersNotLike(String value) {
            addCriterion("SOthers not like", value, "sothers");
            return (Criteria) this;
        }

        public Criteria andSothersIn(List<String> values) {
            addCriterion("SOthers in", values, "sothers");
            return (Criteria) this;
        }

        public Criteria andSothersNotIn(List<String> values) {
            addCriterion("SOthers not in", values, "sothers");
            return (Criteria) this;
        }

        public Criteria andSothersBetween(String value1, String value2) {
            addCriterion("SOthers between", value1, value2, "sothers");
            return (Criteria) this;
        }

        public Criteria andSothersNotBetween(String value1, String value2) {
            addCriterion("SOthers not between", value1, value2, "sothers");
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