package com.guapi.starter.mybatis.entity;

import java.util.ArrayList;
import java.util.List;

public class ProvinceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProvinceExample() {
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

        public Criteria andRegncodeIsNull() {
            addCriterion("regnCode is null");
            return (Criteria) this;
        }

        public Criteria andRegncodeIsNotNull() {
            addCriterion("regnCode is not null");
            return (Criteria) this;
        }

        public Criteria andRegncodeEqualTo(String value) {
            addCriterion("regnCode =", value, "regncode");
            return (Criteria) this;
        }

        public Criteria andRegncodeNotEqualTo(String value) {
            addCriterion("regnCode <>", value, "regncode");
            return (Criteria) this;
        }

        public Criteria andRegncodeGreaterThan(String value) {
            addCriterion("regnCode >", value, "regncode");
            return (Criteria) this;
        }

        public Criteria andRegncodeGreaterThanOrEqualTo(String value) {
            addCriterion("regnCode >=", value, "regncode");
            return (Criteria) this;
        }

        public Criteria andRegncodeLessThan(String value) {
            addCriterion("regnCode <", value, "regncode");
            return (Criteria) this;
        }

        public Criteria andRegncodeLessThanOrEqualTo(String value) {
            addCriterion("regnCode <=", value, "regncode");
            return (Criteria) this;
        }

        public Criteria andRegncodeLike(String value) {
            addCriterion("regnCode like", value, "regncode");
            return (Criteria) this;
        }

        public Criteria andRegncodeNotLike(String value) {
            addCriterion("regnCode not like", value, "regncode");
            return (Criteria) this;
        }

        public Criteria andRegncodeIn(List<String> values) {
            addCriterion("regnCode in", values, "regncode");
            return (Criteria) this;
        }

        public Criteria andRegncodeNotIn(List<String> values) {
            addCriterion("regnCode not in", values, "regncode");
            return (Criteria) this;
        }

        public Criteria andRegncodeBetween(String value1, String value2) {
            addCriterion("regnCode between", value1, value2, "regncode");
            return (Criteria) this;
        }

        public Criteria andRegncodeNotBetween(String value1, String value2) {
            addCriterion("regnCode not between", value1, value2, "regncode");
            return (Criteria) this;
        }

        public Criteria andRegnnmIsNull() {
            addCriterion("regnNm is null");
            return (Criteria) this;
        }

        public Criteria andRegnnmIsNotNull() {
            addCriterion("regnNm is not null");
            return (Criteria) this;
        }

        public Criteria andRegnnmEqualTo(String value) {
            addCriterion("regnNm =", value, "regnnm");
            return (Criteria) this;
        }

        public Criteria andRegnnmNotEqualTo(String value) {
            addCriterion("regnNm <>", value, "regnnm");
            return (Criteria) this;
        }

        public Criteria andRegnnmGreaterThan(String value) {
            addCriterion("regnNm >", value, "regnnm");
            return (Criteria) this;
        }

        public Criteria andRegnnmGreaterThanOrEqualTo(String value) {
            addCriterion("regnNm >=", value, "regnnm");
            return (Criteria) this;
        }

        public Criteria andRegnnmLessThan(String value) {
            addCriterion("regnNm <", value, "regnnm");
            return (Criteria) this;
        }

        public Criteria andRegnnmLessThanOrEqualTo(String value) {
            addCriterion("regnNm <=", value, "regnnm");
            return (Criteria) this;
        }

        public Criteria andRegnnmLike(String value) {
            addCriterion("regnNm like", value, "regnnm");
            return (Criteria) this;
        }

        public Criteria andRegnnmNotLike(String value) {
            addCriterion("regnNm not like", value, "regnnm");
            return (Criteria) this;
        }

        public Criteria andRegnnmIn(List<String> values) {
            addCriterion("regnNm in", values, "regnnm");
            return (Criteria) this;
        }

        public Criteria andRegnnmNotIn(List<String> values) {
            addCriterion("regnNm not in", values, "regnnm");
            return (Criteria) this;
        }

        public Criteria andRegnnmBetween(String value1, String value2) {
            addCriterion("regnNm between", value1, value2, "regnnm");
            return (Criteria) this;
        }

        public Criteria andRegnnmNotBetween(String value1, String value2) {
            addCriterion("regnNm not between", value1, value2, "regnnm");
            return (Criteria) this;
        }

        public Criteria andRegnfullpinyinIsNull() {
            addCriterion("regnFullPinyin is null");
            return (Criteria) this;
        }

        public Criteria andRegnfullpinyinIsNotNull() {
            addCriterion("regnFullPinyin is not null");
            return (Criteria) this;
        }

        public Criteria andRegnfullpinyinEqualTo(String value) {
            addCriterion("regnFullPinyin =", value, "regnfullpinyin");
            return (Criteria) this;
        }

        public Criteria andRegnfullpinyinNotEqualTo(String value) {
            addCriterion("regnFullPinyin <>", value, "regnfullpinyin");
            return (Criteria) this;
        }

        public Criteria andRegnfullpinyinGreaterThan(String value) {
            addCriterion("regnFullPinyin >", value, "regnfullpinyin");
            return (Criteria) this;
        }

        public Criteria andRegnfullpinyinGreaterThanOrEqualTo(String value) {
            addCriterion("regnFullPinyin >=", value, "regnfullpinyin");
            return (Criteria) this;
        }

        public Criteria andRegnfullpinyinLessThan(String value) {
            addCriterion("regnFullPinyin <", value, "regnfullpinyin");
            return (Criteria) this;
        }

        public Criteria andRegnfullpinyinLessThanOrEqualTo(String value) {
            addCriterion("regnFullPinyin <=", value, "regnfullpinyin");
            return (Criteria) this;
        }

        public Criteria andRegnfullpinyinLike(String value) {
            addCriterion("regnFullPinyin like", value, "regnfullpinyin");
            return (Criteria) this;
        }

        public Criteria andRegnfullpinyinNotLike(String value) {
            addCriterion("regnFullPinyin not like", value, "regnfullpinyin");
            return (Criteria) this;
        }

        public Criteria andRegnfullpinyinIn(List<String> values) {
            addCriterion("regnFullPinyin in", values, "regnfullpinyin");
            return (Criteria) this;
        }

        public Criteria andRegnfullpinyinNotIn(List<String> values) {
            addCriterion("regnFullPinyin not in", values, "regnfullpinyin");
            return (Criteria) this;
        }

        public Criteria andRegnfullpinyinBetween(String value1, String value2) {
            addCriterion("regnFullPinyin between", value1, value2, "regnfullpinyin");
            return (Criteria) this;
        }

        public Criteria andRegnfullpinyinNotBetween(String value1, String value2) {
            addCriterion("regnFullPinyin not between", value1, value2, "regnfullpinyin");
            return (Criteria) this;
        }

        public Criteria andRegnlvlcdIsNull() {
            addCriterion("regnLvlCd is null");
            return (Criteria) this;
        }

        public Criteria andRegnlvlcdIsNotNull() {
            addCriterion("regnLvlCd is not null");
            return (Criteria) this;
        }

        public Criteria andRegnlvlcdEqualTo(Short value) {
            addCriterion("regnLvlCd =", value, "regnlvlcd");
            return (Criteria) this;
        }

        public Criteria andRegnlvlcdNotEqualTo(Short value) {
            addCriterion("regnLvlCd <>", value, "regnlvlcd");
            return (Criteria) this;
        }

        public Criteria andRegnlvlcdGreaterThan(Short value) {
            addCriterion("regnLvlCd >", value, "regnlvlcd");
            return (Criteria) this;
        }

        public Criteria andRegnlvlcdGreaterThanOrEqualTo(Short value) {
            addCriterion("regnLvlCd >=", value, "regnlvlcd");
            return (Criteria) this;
        }

        public Criteria andRegnlvlcdLessThan(Short value) {
            addCriterion("regnLvlCd <", value, "regnlvlcd");
            return (Criteria) this;
        }

        public Criteria andRegnlvlcdLessThanOrEqualTo(Short value) {
            addCriterion("regnLvlCd <=", value, "regnlvlcd");
            return (Criteria) this;
        }

        public Criteria andRegnlvlcdIn(List<Short> values) {
            addCriterion("regnLvlCd in", values, "regnlvlcd");
            return (Criteria) this;
        }

        public Criteria andRegnlvlcdNotIn(List<Short> values) {
            addCriterion("regnLvlCd not in", values, "regnlvlcd");
            return (Criteria) this;
        }

        public Criteria andRegnlvlcdBetween(Short value1, Short value2) {
            addCriterion("regnLvlCd between", value1, value2, "regnlvlcd");
            return (Criteria) this;
        }

        public Criteria andRegnlvlcdNotBetween(Short value1, Short value2) {
            addCriterion("regnLvlCd not between", value1, value2, "regnlvlcd");
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