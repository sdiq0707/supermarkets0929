package com.woniu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffExample() {
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

        public Criteria andStaffidIsNull() {
            addCriterion("staffID is null");
            return (Criteria) this;
        }

        public Criteria andStaffidIsNotNull() {
            addCriterion("staffID is not null");
            return (Criteria) this;
        }

        public Criteria andStaffidEqualTo(Integer value) {
            addCriterion("staffID =", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotEqualTo(Integer value) {
            addCriterion("staffID <>", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidGreaterThan(Integer value) {
            addCriterion("staffID >", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidGreaterThanOrEqualTo(Integer value) {
            addCriterion("staffID >=", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidLessThan(Integer value) {
            addCriterion("staffID <", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidLessThanOrEqualTo(Integer value) {
            addCriterion("staffID <=", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidIn(List<Integer> values) {
            addCriterion("staffID in", values, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotIn(List<Integer> values) {
            addCriterion("staffID not in", values, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidBetween(Integer value1, Integer value2) {
            addCriterion("staffID between", value1, value2, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotBetween(Integer value1, Integer value2) {
            addCriterion("staffID not between", value1, value2, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffnameIsNull() {
            addCriterion("staffName is null");
            return (Criteria) this;
        }

        public Criteria andStaffnameIsNotNull() {
            addCriterion("staffName is not null");
            return (Criteria) this;
        }

        public Criteria andStaffnameEqualTo(String value) {
            addCriterion("staffName =", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotEqualTo(String value) {
            addCriterion("staffName <>", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameGreaterThan(String value) {
            addCriterion("staffName >", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameGreaterThanOrEqualTo(String value) {
            addCriterion("staffName >=", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameLessThan(String value) {
            addCriterion("staffName <", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameLessThanOrEqualTo(String value) {
            addCriterion("staffName <=", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameLike(String value) {
            addCriterion("staffName like", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotLike(String value) {
            addCriterion("staffName not like", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameIn(List<String> values) {
            addCriterion("staffName in", values, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotIn(List<String> values) {
            addCriterion("staffName not in", values, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameBetween(String value1, String value2) {
            addCriterion("staffName between", value1, value2, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotBetween(String value1, String value2) {
            addCriterion("staffName not between", value1, value2, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffsexIsNull() {
            addCriterion("staffSex is null");
            return (Criteria) this;
        }

        public Criteria andStaffsexIsNotNull() {
            addCriterion("staffSex is not null");
            return (Criteria) this;
        }

        public Criteria andStaffsexEqualTo(Boolean value) {
            addCriterion("staffSex =", value, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffsexNotEqualTo(Boolean value) {
            addCriterion("staffSex <>", value, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffsexGreaterThan(Boolean value) {
            addCriterion("staffSex >", value, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffsexGreaterThanOrEqualTo(Boolean value) {
            addCriterion("staffSex >=", value, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffsexLessThan(Boolean value) {
            addCriterion("staffSex <", value, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffsexLessThanOrEqualTo(Boolean value) {
            addCriterion("staffSex <=", value, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffsexIn(List<Boolean> values) {
            addCriterion("staffSex in", values, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffsexNotIn(List<Boolean> values) {
            addCriterion("staffSex not in", values, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffsexBetween(Boolean value1, Boolean value2) {
            addCriterion("staffSex between", value1, value2, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffsexNotBetween(Boolean value1, Boolean value2) {
            addCriterion("staffSex not between", value1, value2, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffageIsNull() {
            addCriterion("staffAge is null");
            return (Criteria) this;
        }

        public Criteria andStaffageIsNotNull() {
            addCriterion("staffAge is not null");
            return (Criteria) this;
        }

        public Criteria andStaffageEqualTo(Integer value) {
            addCriterion("staffAge =", value, "staffage");
            return (Criteria) this;
        }

        public Criteria andStaffageNotEqualTo(Integer value) {
            addCriterion("staffAge <>", value, "staffage");
            return (Criteria) this;
        }

        public Criteria andStaffageGreaterThan(Integer value) {
            addCriterion("staffAge >", value, "staffage");
            return (Criteria) this;
        }

        public Criteria andStaffageGreaterThanOrEqualTo(Integer value) {
            addCriterion("staffAge >=", value, "staffage");
            return (Criteria) this;
        }

        public Criteria andStaffageLessThan(Integer value) {
            addCriterion("staffAge <", value, "staffage");
            return (Criteria) this;
        }

        public Criteria andStaffageLessThanOrEqualTo(Integer value) {
            addCriterion("staffAge <=", value, "staffage");
            return (Criteria) this;
        }

        public Criteria andStaffageIn(List<Integer> values) {
            addCriterion("staffAge in", values, "staffage");
            return (Criteria) this;
        }

        public Criteria andStaffageNotIn(List<Integer> values) {
            addCriterion("staffAge not in", values, "staffage");
            return (Criteria) this;
        }

        public Criteria andStaffageBetween(Integer value1, Integer value2) {
            addCriterion("staffAge between", value1, value2, "staffage");
            return (Criteria) this;
        }

        public Criteria andStaffageNotBetween(Integer value1, Integer value2) {
            addCriterion("staffAge not between", value1, value2, "staffage");
            return (Criteria) this;
        }

        public Criteria andStaffhomeIsNull() {
            addCriterion("staffHome is null");
            return (Criteria) this;
        }

        public Criteria andStaffhomeIsNotNull() {
            addCriterion("staffHome is not null");
            return (Criteria) this;
        }

        public Criteria andStaffhomeEqualTo(String value) {
            addCriterion("staffHome =", value, "staffhome");
            return (Criteria) this;
        }

        public Criteria andStaffhomeNotEqualTo(String value) {
            addCriterion("staffHome <>", value, "staffhome");
            return (Criteria) this;
        }

        public Criteria andStaffhomeGreaterThan(String value) {
            addCriterion("staffHome >", value, "staffhome");
            return (Criteria) this;
        }

        public Criteria andStaffhomeGreaterThanOrEqualTo(String value) {
            addCriterion("staffHome >=", value, "staffhome");
            return (Criteria) this;
        }

        public Criteria andStaffhomeLessThan(String value) {
            addCriterion("staffHome <", value, "staffhome");
            return (Criteria) this;
        }

        public Criteria andStaffhomeLessThanOrEqualTo(String value) {
            addCriterion("staffHome <=", value, "staffhome");
            return (Criteria) this;
        }

        public Criteria andStaffhomeLike(String value) {
            addCriterion("staffHome like", value, "staffhome");
            return (Criteria) this;
        }

        public Criteria andStaffhomeNotLike(String value) {
            addCriterion("staffHome not like", value, "staffhome");
            return (Criteria) this;
        }

        public Criteria andStaffhomeIn(List<String> values) {
            addCriterion("staffHome in", values, "staffhome");
            return (Criteria) this;
        }

        public Criteria andStaffhomeNotIn(List<String> values) {
            addCriterion("staffHome not in", values, "staffhome");
            return (Criteria) this;
        }

        public Criteria andStaffhomeBetween(String value1, String value2) {
            addCriterion("staffHome between", value1, value2, "staffhome");
            return (Criteria) this;
        }

        public Criteria andStaffhomeNotBetween(String value1, String value2) {
            addCriterion("staffHome not between", value1, value2, "staffhome");
            return (Criteria) this;
        }

        public Criteria andStaffdiplomaIsNull() {
            addCriterion("staffDiploma is null");
            return (Criteria) this;
        }

        public Criteria andStaffdiplomaIsNotNull() {
            addCriterion("staffDiploma is not null");
            return (Criteria) this;
        }

        public Criteria andStaffdiplomaEqualTo(String value) {
            addCriterion("staffDiploma =", value, "staffdiploma");
            return (Criteria) this;
        }

        public Criteria andStaffdiplomaNotEqualTo(String value) {
            addCriterion("staffDiploma <>", value, "staffdiploma");
            return (Criteria) this;
        }

        public Criteria andStaffdiplomaGreaterThan(String value) {
            addCriterion("staffDiploma >", value, "staffdiploma");
            return (Criteria) this;
        }

        public Criteria andStaffdiplomaGreaterThanOrEqualTo(String value) {
            addCriterion("staffDiploma >=", value, "staffdiploma");
            return (Criteria) this;
        }

        public Criteria andStaffdiplomaLessThan(String value) {
            addCriterion("staffDiploma <", value, "staffdiploma");
            return (Criteria) this;
        }

        public Criteria andStaffdiplomaLessThanOrEqualTo(String value) {
            addCriterion("staffDiploma <=", value, "staffdiploma");
            return (Criteria) this;
        }

        public Criteria andStaffdiplomaLike(String value) {
            addCriterion("staffDiploma like", value, "staffdiploma");
            return (Criteria) this;
        }

        public Criteria andStaffdiplomaNotLike(String value) {
            addCriterion("staffDiploma not like", value, "staffdiploma");
            return (Criteria) this;
        }

        public Criteria andStaffdiplomaIn(List<String> values) {
            addCriterion("staffDiploma in", values, "staffdiploma");
            return (Criteria) this;
        }

        public Criteria andStaffdiplomaNotIn(List<String> values) {
            addCriterion("staffDiploma not in", values, "staffdiploma");
            return (Criteria) this;
        }

        public Criteria andStaffdiplomaBetween(String value1, String value2) {
            addCriterion("staffDiploma between", value1, value2, "staffdiploma");
            return (Criteria) this;
        }

        public Criteria andStaffdiplomaNotBetween(String value1, String value2) {
            addCriterion("staffDiploma not between", value1, value2, "staffdiploma");
            return (Criteria) this;
        }

        public Criteria andStaffsalaryIsNull() {
            addCriterion("staffSalary is null");
            return (Criteria) this;
        }

        public Criteria andStaffsalaryIsNotNull() {
            addCriterion("staffSalary is not null");
            return (Criteria) this;
        }

        public Criteria andStaffsalaryEqualTo(Float value) {
            addCriterion("staffSalary =", value, "staffsalary");
            return (Criteria) this;
        }

        public Criteria andStaffsalaryNotEqualTo(Float value) {
            addCriterion("staffSalary <>", value, "staffsalary");
            return (Criteria) this;
        }

        public Criteria andStaffsalaryGreaterThan(Float value) {
            addCriterion("staffSalary >", value, "staffsalary");
            return (Criteria) this;
        }

        public Criteria andStaffsalaryGreaterThanOrEqualTo(Float value) {
            addCriterion("staffSalary >=", value, "staffsalary");
            return (Criteria) this;
        }

        public Criteria andStaffsalaryLessThan(Float value) {
            addCriterion("staffSalary <", value, "staffsalary");
            return (Criteria) this;
        }

        public Criteria andStaffsalaryLessThanOrEqualTo(Float value) {
            addCriterion("staffSalary <=", value, "staffsalary");
            return (Criteria) this;
        }

        public Criteria andStaffsalaryIn(List<Float> values) {
            addCriterion("staffSalary in", values, "staffsalary");
            return (Criteria) this;
        }

        public Criteria andStaffsalaryNotIn(List<Float> values) {
            addCriterion("staffSalary not in", values, "staffsalary");
            return (Criteria) this;
        }

        public Criteria andStaffsalaryBetween(Float value1, Float value2) {
            addCriterion("staffSalary between", value1, value2, "staffsalary");
            return (Criteria) this;
        }

        public Criteria andStaffsalaryNotBetween(Float value1, Float value2) {
            addCriterion("staffSalary not between", value1, value2, "staffsalary");
            return (Criteria) this;
        }

        public Criteria andStaffdutyIsNull() {
            addCriterion("staffDuty is null");
            return (Criteria) this;
        }

        public Criteria andStaffdutyIsNotNull() {
            addCriterion("staffDuty is not null");
            return (Criteria) this;
        }

        public Criteria andStaffdutyEqualTo(String value) {
            addCriterion("staffDuty =", value, "staffduty");
            return (Criteria) this;
        }

        public Criteria andStaffdutyNotEqualTo(String value) {
            addCriterion("staffDuty <>", value, "staffduty");
            return (Criteria) this;
        }

        public Criteria andStaffdutyGreaterThan(String value) {
            addCriterion("staffDuty >", value, "staffduty");
            return (Criteria) this;
        }

        public Criteria andStaffdutyGreaterThanOrEqualTo(String value) {
            addCriterion("staffDuty >=", value, "staffduty");
            return (Criteria) this;
        }

        public Criteria andStaffdutyLessThan(String value) {
            addCriterion("staffDuty <", value, "staffduty");
            return (Criteria) this;
        }

        public Criteria andStaffdutyLessThanOrEqualTo(String value) {
            addCriterion("staffDuty <=", value, "staffduty");
            return (Criteria) this;
        }

        public Criteria andStaffdutyLike(String value) {
            addCriterion("staffDuty like", value, "staffduty");
            return (Criteria) this;
        }

        public Criteria andStaffdutyNotLike(String value) {
            addCriterion("staffDuty not like", value, "staffduty");
            return (Criteria) this;
        }

        public Criteria andStaffdutyIn(List<String> values) {
            addCriterion("staffDuty in", values, "staffduty");
            return (Criteria) this;
        }

        public Criteria andStaffdutyNotIn(List<String> values) {
            addCriterion("staffDuty not in", values, "staffduty");
            return (Criteria) this;
        }

        public Criteria andStaffdutyBetween(String value1, String value2) {
            addCriterion("staffDuty between", value1, value2, "staffduty");
            return (Criteria) this;
        }

        public Criteria andStaffdutyNotBetween(String value1, String value2) {
            addCriterion("staffDuty not between", value1, value2, "staffduty");
            return (Criteria) this;
        }

        public Criteria andStaffphoneIsNull() {
            addCriterion("staffPhone is null");
            return (Criteria) this;
        }

        public Criteria andStaffphoneIsNotNull() {
            addCriterion("staffPhone is not null");
            return (Criteria) this;
        }

        public Criteria andStaffphoneEqualTo(String value) {
            addCriterion("staffPhone =", value, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneNotEqualTo(String value) {
            addCriterion("staffPhone <>", value, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneGreaterThan(String value) {
            addCriterion("staffPhone >", value, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneGreaterThanOrEqualTo(String value) {
            addCriterion("staffPhone >=", value, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneLessThan(String value) {
            addCriterion("staffPhone <", value, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneLessThanOrEqualTo(String value) {
            addCriterion("staffPhone <=", value, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneLike(String value) {
            addCriterion("staffPhone like", value, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneNotLike(String value) {
            addCriterion("staffPhone not like", value, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneIn(List<String> values) {
            addCriterion("staffPhone in", values, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneNotIn(List<String> values) {
            addCriterion("staffPhone not in", values, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneBetween(String value1, String value2) {
            addCriterion("staffPhone between", value1, value2, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffphoneNotBetween(String value1, String value2) {
            addCriterion("staffPhone not between", value1, value2, "staffphone");
            return (Criteria) this;
        }

        public Criteria andStaffaddressIsNull() {
            addCriterion("staffAddress is null");
            return (Criteria) this;
        }

        public Criteria andStaffaddressIsNotNull() {
            addCriterion("staffAddress is not null");
            return (Criteria) this;
        }

        public Criteria andStaffaddressEqualTo(String value) {
            addCriterion("staffAddress =", value, "staffaddress");
            return (Criteria) this;
        }

        public Criteria andStaffaddressNotEqualTo(String value) {
            addCriterion("staffAddress <>", value, "staffaddress");
            return (Criteria) this;
        }

        public Criteria andStaffaddressGreaterThan(String value) {
            addCriterion("staffAddress >", value, "staffaddress");
            return (Criteria) this;
        }

        public Criteria andStaffaddressGreaterThanOrEqualTo(String value) {
            addCriterion("staffAddress >=", value, "staffaddress");
            return (Criteria) this;
        }

        public Criteria andStaffaddressLessThan(String value) {
            addCriterion("staffAddress <", value, "staffaddress");
            return (Criteria) this;
        }

        public Criteria andStaffaddressLessThanOrEqualTo(String value) {
            addCriterion("staffAddress <=", value, "staffaddress");
            return (Criteria) this;
        }

        public Criteria andStaffaddressLike(String value) {
            addCriterion("staffAddress like", value, "staffaddress");
            return (Criteria) this;
        }

        public Criteria andStaffaddressNotLike(String value) {
            addCriterion("staffAddress not like", value, "staffaddress");
            return (Criteria) this;
        }

        public Criteria andStaffaddressIn(List<String> values) {
            addCriterion("staffAddress in", values, "staffaddress");
            return (Criteria) this;
        }

        public Criteria andStaffaddressNotIn(List<String> values) {
            addCriterion("staffAddress not in", values, "staffaddress");
            return (Criteria) this;
        }

        public Criteria andStaffaddressBetween(String value1, String value2) {
            addCriterion("staffAddress between", value1, value2, "staffaddress");
            return (Criteria) this;
        }

        public Criteria andStaffaddressNotBetween(String value1, String value2) {
            addCriterion("staffAddress not between", value1, value2, "staffaddress");
            return (Criteria) this;
        }

        public Criteria andStaffidcardIsNull() {
            addCriterion("staffIdCard is null");
            return (Criteria) this;
        }

        public Criteria andStaffidcardIsNotNull() {
            addCriterion("staffIdCard is not null");
            return (Criteria) this;
        }

        public Criteria andStaffidcardEqualTo(String value) {
            addCriterion("staffIdCard =", value, "staffidcard");
            return (Criteria) this;
        }

        public Criteria andStaffidcardNotEqualTo(String value) {
            addCriterion("staffIdCard <>", value, "staffidcard");
            return (Criteria) this;
        }

        public Criteria andStaffidcardGreaterThan(String value) {
            addCriterion("staffIdCard >", value, "staffidcard");
            return (Criteria) this;
        }

        public Criteria andStaffidcardGreaterThanOrEqualTo(String value) {
            addCriterion("staffIdCard >=", value, "staffidcard");
            return (Criteria) this;
        }

        public Criteria andStaffidcardLessThan(String value) {
            addCriterion("staffIdCard <", value, "staffidcard");
            return (Criteria) this;
        }

        public Criteria andStaffidcardLessThanOrEqualTo(String value) {
            addCriterion("staffIdCard <=", value, "staffidcard");
            return (Criteria) this;
        }

        public Criteria andStaffidcardLike(String value) {
            addCriterion("staffIdCard like", value, "staffidcard");
            return (Criteria) this;
        }

        public Criteria andStaffidcardNotLike(String value) {
            addCriterion("staffIdCard not like", value, "staffidcard");
            return (Criteria) this;
        }

        public Criteria andStaffidcardIn(List<String> values) {
            addCriterion("staffIdCard in", values, "staffidcard");
            return (Criteria) this;
        }

        public Criteria andStaffidcardNotIn(List<String> values) {
            addCriterion("staffIdCard not in", values, "staffidcard");
            return (Criteria) this;
        }

        public Criteria andStaffidcardBetween(String value1, String value2) {
            addCriterion("staffIdCard between", value1, value2, "staffidcard");
            return (Criteria) this;
        }

        public Criteria andStaffidcardNotBetween(String value1, String value2) {
            addCriterion("staffIdCard not between", value1, value2, "staffidcard");
            return (Criteria) this;
        }

        public Criteria andStaffbegindateIsNull() {
            addCriterion("staffBeginDate is null");
            return (Criteria) this;
        }

        public Criteria andStaffbegindateIsNotNull() {
            addCriterion("staffBeginDate is not null");
            return (Criteria) this;
        }

        public Criteria andStaffbegindateEqualTo(Date value) {
            addCriterionForJDBCDate("staffBeginDate =", value, "staffbegindate");
            return (Criteria) this;
        }

        public Criteria andStaffbegindateNotEqualTo(Date value) {
            addCriterionForJDBCDate("staffBeginDate <>", value, "staffbegindate");
            return (Criteria) this;
        }

        public Criteria andStaffbegindateGreaterThan(Date value) {
            addCriterionForJDBCDate("staffBeginDate >", value, "staffbegindate");
            return (Criteria) this;
        }

        public Criteria andStaffbegindateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("staffBeginDate >=", value, "staffbegindate");
            return (Criteria) this;
        }

        public Criteria andStaffbegindateLessThan(Date value) {
            addCriterionForJDBCDate("staffBeginDate <", value, "staffbegindate");
            return (Criteria) this;
        }

        public Criteria andStaffbegindateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("staffBeginDate <=", value, "staffbegindate");
            return (Criteria) this;
        }

        public Criteria andStaffbegindateIn(List<Date> values) {
            addCriterionForJDBCDate("staffBeginDate in", values, "staffbegindate");
            return (Criteria) this;
        }

        public Criteria andStaffbegindateNotIn(List<Date> values) {
            addCriterionForJDBCDate("staffBeginDate not in", values, "staffbegindate");
            return (Criteria) this;
        }

        public Criteria andStaffbegindateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("staffBeginDate between", value1, value2, "staffbegindate");
            return (Criteria) this;
        }

        public Criteria andStaffbegindateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("staffBeginDate not between", value1, value2, "staffbegindate");
            return (Criteria) this;
        }

        public Criteria andStaffenacttimeIsNull() {
            addCriterion("staffEnactTime is null");
            return (Criteria) this;
        }

        public Criteria andStaffenacttimeIsNotNull() {
            addCriterion("staffEnactTime is not null");
            return (Criteria) this;
        }

        public Criteria andStaffenacttimeEqualTo(Date value) {
            addCriterionForJDBCDate("staffEnactTime =", value, "staffenacttime");
            return (Criteria) this;
        }

        public Criteria andStaffenacttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("staffEnactTime <>", value, "staffenacttime");
            return (Criteria) this;
        }

        public Criteria andStaffenacttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("staffEnactTime >", value, "staffenacttime");
            return (Criteria) this;
        }

        public Criteria andStaffenacttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("staffEnactTime >=", value, "staffenacttime");
            return (Criteria) this;
        }

        public Criteria andStaffenacttimeLessThan(Date value) {
            addCriterionForJDBCDate("staffEnactTime <", value, "staffenacttime");
            return (Criteria) this;
        }

        public Criteria andStaffenacttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("staffEnactTime <=", value, "staffenacttime");
            return (Criteria) this;
        }

        public Criteria andStaffenacttimeIn(List<Date> values) {
            addCriterionForJDBCDate("staffEnactTime in", values, "staffenacttime");
            return (Criteria) this;
        }

        public Criteria andStaffenacttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("staffEnactTime not in", values, "staffenacttime");
            return (Criteria) this;
        }

        public Criteria andStaffenacttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("staffEnactTime between", value1, value2, "staffenacttime");
            return (Criteria) this;
        }

        public Criteria andStaffenacttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("staffEnactTime not between", value1, value2, "staffenacttime");
            return (Criteria) this;
        }

        public Criteria andStaffothersIsNull() {
            addCriterion("staffOthers is null");
            return (Criteria) this;
        }

        public Criteria andStaffothersIsNotNull() {
            addCriterion("staffOthers is not null");
            return (Criteria) this;
        }

        public Criteria andStaffothersEqualTo(String value) {
            addCriterion("staffOthers =", value, "staffothers");
            return (Criteria) this;
        }

        public Criteria andStaffothersNotEqualTo(String value) {
            addCriterion("staffOthers <>", value, "staffothers");
            return (Criteria) this;
        }

        public Criteria andStaffothersGreaterThan(String value) {
            addCriterion("staffOthers >", value, "staffothers");
            return (Criteria) this;
        }

        public Criteria andStaffothersGreaterThanOrEqualTo(String value) {
            addCriterion("staffOthers >=", value, "staffothers");
            return (Criteria) this;
        }

        public Criteria andStaffothersLessThan(String value) {
            addCriterion("staffOthers <", value, "staffothers");
            return (Criteria) this;
        }

        public Criteria andStaffothersLessThanOrEqualTo(String value) {
            addCriterion("staffOthers <=", value, "staffothers");
            return (Criteria) this;
        }

        public Criteria andStaffothersLike(String value) {
            addCriterion("staffOthers like", value, "staffothers");
            return (Criteria) this;
        }

        public Criteria andStaffothersNotLike(String value) {
            addCriterion("staffOthers not like", value, "staffothers");
            return (Criteria) this;
        }

        public Criteria andStaffothersIn(List<String> values) {
            addCriterion("staffOthers in", values, "staffothers");
            return (Criteria) this;
        }

        public Criteria andStaffothersNotIn(List<String> values) {
            addCriterion("staffOthers not in", values, "staffothers");
            return (Criteria) this;
        }

        public Criteria andStaffothersBetween(String value1, String value2) {
            addCriterion("staffOthers between", value1, value2, "staffothers");
            return (Criteria) this;
        }

        public Criteria andStaffothersNotBetween(String value1, String value2) {
            addCriterion("staffOthers not between", value1, value2, "staffothers");
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