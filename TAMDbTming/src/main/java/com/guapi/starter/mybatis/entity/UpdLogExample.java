package com.guapi.starter.mybatis.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UpdLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UpdLogExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDataSourceIsNull() {
            addCriterion("data_source is null");
            return (Criteria) this;
        }

        public Criteria andDataSourceIsNotNull() {
            addCriterion("data_source is not null");
            return (Criteria) this;
        }

        public Criteria andDataSourceEqualTo(Integer value) {
            addCriterion("data_source =", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotEqualTo(Integer value) {
            addCriterion("data_source <>", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceGreaterThan(Integer value) {
            addCriterion("data_source >", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("data_source >=", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLessThan(Integer value) {
            addCriterion("data_source <", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLessThanOrEqualTo(Integer value) {
            addCriterion("data_source <=", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceIn(List<Integer> values) {
            addCriterion("data_source in", values, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotIn(List<Integer> values) {
            addCriterion("data_source not in", values, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceBetween(Integer value1, Integer value2) {
            addCriterion("data_source between", value1, value2, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("data_source not between", value1, value2, "dataSource");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andRqStartIsNull() {
            addCriterion("rq_start is null");
            return (Criteria) this;
        }

        public Criteria andRqStartIsNotNull() {
            addCriterion("rq_start is not null");
            return (Criteria) this;
        }

        public Criteria andRqStartEqualTo(Date value) {
            addCriterion("rq_start =", value, "rqStart");
            return (Criteria) this;
        }

        public Criteria andRqStartNotEqualTo(Date value) {
            addCriterion("rq_start <>", value, "rqStart");
            return (Criteria) this;
        }

        public Criteria andRqStartGreaterThan(Date value) {
            addCriterion("rq_start >", value, "rqStart");
            return (Criteria) this;
        }

        public Criteria andRqStartGreaterThanOrEqualTo(Date value) {
            addCriterion("rq_start >=", value, "rqStart");
            return (Criteria) this;
        }

        public Criteria andRqStartLessThan(Date value) {
            addCriterion("rq_start <", value, "rqStart");
            return (Criteria) this;
        }

        public Criteria andRqStartLessThanOrEqualTo(Date value) {
            addCriterion("rq_start <=", value, "rqStart");
            return (Criteria) this;
        }

        public Criteria andRqStartIn(List<Date> values) {
            addCriterion("rq_start in", values, "rqStart");
            return (Criteria) this;
        }

        public Criteria andRqStartNotIn(List<Date> values) {
            addCriterion("rq_start not in", values, "rqStart");
            return (Criteria) this;
        }

        public Criteria andRqStartBetween(Date value1, Date value2) {
            addCriterion("rq_start between", value1, value2, "rqStart");
            return (Criteria) this;
        }

        public Criteria andRqStartNotBetween(Date value1, Date value2) {
            addCriterion("rq_start not between", value1, value2, "rqStart");
            return (Criteria) this;
        }

        public Criteria andRqEndIsNull() {
            addCriterion("rq_end is null");
            return (Criteria) this;
        }

        public Criteria andRqEndIsNotNull() {
            addCriterion("rq_end is not null");
            return (Criteria) this;
        }

        public Criteria andRqEndEqualTo(Date value) {
            addCriterion("rq_end =", value, "rqEnd");
            return (Criteria) this;
        }

        public Criteria andRqEndNotEqualTo(Date value) {
            addCriterion("rq_end <>", value, "rqEnd");
            return (Criteria) this;
        }

        public Criteria andRqEndGreaterThan(Date value) {
            addCriterion("rq_end >", value, "rqEnd");
            return (Criteria) this;
        }

        public Criteria andRqEndGreaterThanOrEqualTo(Date value) {
            addCriterion("rq_end >=", value, "rqEnd");
            return (Criteria) this;
        }

        public Criteria andRqEndLessThan(Date value) {
            addCriterion("rq_end <", value, "rqEnd");
            return (Criteria) this;
        }

        public Criteria andRqEndLessThanOrEqualTo(Date value) {
            addCriterion("rq_end <=", value, "rqEnd");
            return (Criteria) this;
        }

        public Criteria andRqEndIn(List<Date> values) {
            addCriterion("rq_end in", values, "rqEnd");
            return (Criteria) this;
        }

        public Criteria andRqEndNotIn(List<Date> values) {
            addCriterion("rq_end not in", values, "rqEnd");
            return (Criteria) this;
        }

        public Criteria andRqEndBetween(Date value1, Date value2) {
            addCriterion("rq_end between", value1, value2, "rqEnd");
            return (Criteria) this;
        }

        public Criteria andRqEndNotBetween(Date value1, Date value2) {
            addCriterion("rq_end not between", value1, value2, "rqEnd");
            return (Criteria) this;
        }

        public Criteria andMqFlagIsNull() {
            addCriterion("mq_flag is null");
            return (Criteria) this;
        }

        public Criteria andMqFlagIsNotNull() {
            addCriterion("mq_flag is not null");
            return (Criteria) this;
        }

        public Criteria andMqFlagEqualTo(Integer value) {
            addCriterion("mq_flag =", value, "mqFlag");
            return (Criteria) this;
        }

        public Criteria andMqFlagNotEqualTo(Integer value) {
            addCriterion("mq_flag <>", value, "mqFlag");
            return (Criteria) this;
        }

        public Criteria andMqFlagGreaterThan(Integer value) {
            addCriterion("mq_flag >", value, "mqFlag");
            return (Criteria) this;
        }

        public Criteria andMqFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("mq_flag >=", value, "mqFlag");
            return (Criteria) this;
        }

        public Criteria andMqFlagLessThan(Integer value) {
            addCriterion("mq_flag <", value, "mqFlag");
            return (Criteria) this;
        }

        public Criteria andMqFlagLessThanOrEqualTo(Integer value) {
            addCriterion("mq_flag <=", value, "mqFlag");
            return (Criteria) this;
        }

        public Criteria andMqFlagIn(List<Integer> values) {
            addCriterion("mq_flag in", values, "mqFlag");
            return (Criteria) this;
        }

        public Criteria andMqFlagNotIn(List<Integer> values) {
            addCriterion("mq_flag not in", values, "mqFlag");
            return (Criteria) this;
        }

        public Criteria andMqFlagBetween(Integer value1, Integer value2) {
            addCriterion("mq_flag between", value1, value2, "mqFlag");
            return (Criteria) this;
        }

        public Criteria andMqFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("mq_flag not between", value1, value2, "mqFlag");
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