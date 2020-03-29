package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class LyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LyExample() {
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

        public Criteria andNrIsNull() {
            addCriterion("nr is null");
            return (Criteria) this;
        }

        public Criteria andNrIsNotNull() {
            addCriterion("nr is not null");
            return (Criteria) this;
        }

        public Criteria andNrEqualTo(String value) {
            addCriterion("nr =", value, "nr");
            return (Criteria) this;
        }

        public Criteria andNrNotEqualTo(String value) {
            addCriterion("nr <>", value, "nr");
            return (Criteria) this;
        }

        public Criteria andNrGreaterThan(String value) {
            addCriterion("nr >", value, "nr");
            return (Criteria) this;
        }

        public Criteria andNrGreaterThanOrEqualTo(String value) {
            addCriterion("nr >=", value, "nr");
            return (Criteria) this;
        }

        public Criteria andNrLessThan(String value) {
            addCriterion("nr <", value, "nr");
            return (Criteria) this;
        }

        public Criteria andNrLessThanOrEqualTo(String value) {
            addCriterion("nr <=", value, "nr");
            return (Criteria) this;
        }

        public Criteria andNrLike(String value) {
            addCriterion("nr like", value, "nr");
            return (Criteria) this;
        }

        public Criteria andNrNotLike(String value) {
            addCriterion("nr not like", value, "nr");
            return (Criteria) this;
        }

        public Criteria andNrIn(List<String> values) {
            addCriterion("nr in", values, "nr");
            return (Criteria) this;
        }

        public Criteria andNrNotIn(List<String> values) {
            addCriterion("nr not in", values, "nr");
            return (Criteria) this;
        }

        public Criteria andNrBetween(String value1, String value2) {
            addCriterion("nr between", value1, value2, "nr");
            return (Criteria) this;
        }

        public Criteria andNrNotBetween(String value1, String value2) {
            addCriterion("nr not between", value1, value2, "nr");
            return (Criteria) this;
        }

        public Criteria andMemberIsNull() {
            addCriterion("member is null");
            return (Criteria) this;
        }

        public Criteria andMemberIsNotNull() {
            addCriterion("member is not null");
            return (Criteria) this;
        }

        public Criteria andMemberEqualTo(String value) {
            addCriterion("member =", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberNotEqualTo(String value) {
            addCriterion("member <>", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberGreaterThan(String value) {
            addCriterion("member >", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberGreaterThanOrEqualTo(String value) {
            addCriterion("member >=", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberLessThan(String value) {
            addCriterion("member <", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberLessThanOrEqualTo(String value) {
            addCriterion("member <=", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberLike(String value) {
            addCriterion("member like", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberNotLike(String value) {
            addCriterion("member not like", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberIn(List<String> values) {
            addCriterion("member in", values, "member");
            return (Criteria) this;
        }

        public Criteria andMemberNotIn(List<String> values) {
            addCriterion("member not in", values, "member");
            return (Criteria) this;
        }

        public Criteria andMemberBetween(String value1, String value2) {
            addCriterion("member between", value1, value2, "member");
            return (Criteria) this;
        }

        public Criteria andMemberNotBetween(String value1, String value2) {
            addCriterion("member not between", value1, value2, "member");
            return (Criteria) this;
        }

        public Criteria andSjIsNull() {
            addCriterion("sj is null");
            return (Criteria) this;
        }

        public Criteria andSjIsNotNull() {
            addCriterion("sj is not null");
            return (Criteria) this;
        }

        public Criteria andSjEqualTo(String value) {
            addCriterion("sj =", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjNotEqualTo(String value) {
            addCriterion("sj <>", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjGreaterThan(String value) {
            addCriterion("sj >", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjGreaterThanOrEqualTo(String value) {
            addCriterion("sj >=", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjLessThan(String value) {
            addCriterion("sj <", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjLessThanOrEqualTo(String value) {
            addCriterion("sj <=", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjLike(String value) {
            addCriterion("sj like", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjNotLike(String value) {
            addCriterion("sj not like", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjIn(List<String> values) {
            addCriterion("sj in", values, "sj");
            return (Criteria) this;
        }

        public Criteria andSjNotIn(List<String> values) {
            addCriterion("sj not in", values, "sj");
            return (Criteria) this;
        }

        public Criteria andSjBetween(String value1, String value2) {
            addCriterion("sj between", value1, value2, "sj");
            return (Criteria) this;
        }

        public Criteria andSjNotBetween(String value1, String value2) {
            addCriterion("sj not between", value1, value2, "sj");
            return (Criteria) this;
        }

        public Criteria andHfIsNull() {
            addCriterion("hf is null");
            return (Criteria) this;
        }

        public Criteria andHfIsNotNull() {
            addCriterion("hf is not null");
            return (Criteria) this;
        }

        public Criteria andHfEqualTo(String value) {
            addCriterion("hf =", value, "hf");
            return (Criteria) this;
        }

        public Criteria andHfNotEqualTo(String value) {
            addCriterion("hf <>", value, "hf");
            return (Criteria) this;
        }

        public Criteria andHfGreaterThan(String value) {
            addCriterion("hf >", value, "hf");
            return (Criteria) this;
        }

        public Criteria andHfGreaterThanOrEqualTo(String value) {
            addCriterion("hf >=", value, "hf");
            return (Criteria) this;
        }

        public Criteria andHfLessThan(String value) {
            addCriterion("hf <", value, "hf");
            return (Criteria) this;
        }

        public Criteria andHfLessThanOrEqualTo(String value) {
            addCriterion("hf <=", value, "hf");
            return (Criteria) this;
        }

        public Criteria andHfLike(String value) {
            addCriterion("hf like", value, "hf");
            return (Criteria) this;
        }

        public Criteria andHfNotLike(String value) {
            addCriterion("hf not like", value, "hf");
            return (Criteria) this;
        }

        public Criteria andHfIn(List<String> values) {
            addCriterion("hf in", values, "hf");
            return (Criteria) this;
        }

        public Criteria andHfNotIn(List<String> values) {
            addCriterion("hf not in", values, "hf");
            return (Criteria) this;
        }

        public Criteria andHfBetween(String value1, String value2) {
            addCriterion("hf between", value1, value2, "hf");
            return (Criteria) this;
        }

        public Criteria andHfNotBetween(String value1, String value2) {
            addCriterion("hf not between", value1, value2, "hf");
            return (Criteria) this;
        }

        public Criteria andHfrIsNull() {
            addCriterion("hfr is null");
            return (Criteria) this;
        }

        public Criteria andHfrIsNotNull() {
            addCriterion("hfr is not null");
            return (Criteria) this;
        }

        public Criteria andHfrEqualTo(String value) {
            addCriterion("hfr =", value, "hfr");
            return (Criteria) this;
        }

        public Criteria andHfrNotEqualTo(String value) {
            addCriterion("hfr <>", value, "hfr");
            return (Criteria) this;
        }

        public Criteria andHfrGreaterThan(String value) {
            addCriterion("hfr >", value, "hfr");
            return (Criteria) this;
        }

        public Criteria andHfrGreaterThanOrEqualTo(String value) {
            addCriterion("hfr >=", value, "hfr");
            return (Criteria) this;
        }

        public Criteria andHfrLessThan(String value) {
            addCriterion("hfr <", value, "hfr");
            return (Criteria) this;
        }

        public Criteria andHfrLessThanOrEqualTo(String value) {
            addCriterion("hfr <=", value, "hfr");
            return (Criteria) this;
        }

        public Criteria andHfrLike(String value) {
            addCriterion("hfr like", value, "hfr");
            return (Criteria) this;
        }

        public Criteria andHfrNotLike(String value) {
            addCriterion("hfr not like", value, "hfr");
            return (Criteria) this;
        }

        public Criteria andHfrIn(List<String> values) {
            addCriterion("hfr in", values, "hfr");
            return (Criteria) this;
        }

        public Criteria andHfrNotIn(List<String> values) {
            addCriterion("hfr not in", values, "hfr");
            return (Criteria) this;
        }

        public Criteria andHfrBetween(String value1, String value2) {
            addCriterion("hfr between", value1, value2, "hfr");
            return (Criteria) this;
        }

        public Criteria andHfrNotBetween(String value1, String value2) {
            addCriterion("hfr not between", value1, value2, "hfr");
            return (Criteria) this;
        }

        public Criteria andHfsjIsNull() {
            addCriterion("hfsj is null");
            return (Criteria) this;
        }

        public Criteria andHfsjIsNotNull() {
            addCriterion("hfsj is not null");
            return (Criteria) this;
        }

        public Criteria andHfsjEqualTo(String value) {
            addCriterion("hfsj =", value, "hfsj");
            return (Criteria) this;
        }

        public Criteria andHfsjNotEqualTo(String value) {
            addCriterion("hfsj <>", value, "hfsj");
            return (Criteria) this;
        }

        public Criteria andHfsjGreaterThan(String value) {
            addCriterion("hfsj >", value, "hfsj");
            return (Criteria) this;
        }

        public Criteria andHfsjGreaterThanOrEqualTo(String value) {
            addCriterion("hfsj >=", value, "hfsj");
            return (Criteria) this;
        }

        public Criteria andHfsjLessThan(String value) {
            addCriterion("hfsj <", value, "hfsj");
            return (Criteria) this;
        }

        public Criteria andHfsjLessThanOrEqualTo(String value) {
            addCriterion("hfsj <=", value, "hfsj");
            return (Criteria) this;
        }

        public Criteria andHfsjLike(String value) {
            addCriterion("hfsj like", value, "hfsj");
            return (Criteria) this;
        }

        public Criteria andHfsjNotLike(String value) {
            addCriterion("hfsj not like", value, "hfsj");
            return (Criteria) this;
        }

        public Criteria andHfsjIn(List<String> values) {
            addCriterion("hfsj in", values, "hfsj");
            return (Criteria) this;
        }

        public Criteria andHfsjNotIn(List<String> values) {
            addCriterion("hfsj not in", values, "hfsj");
            return (Criteria) this;
        }

        public Criteria andHfsjBetween(String value1, String value2) {
            addCriterion("hfsj between", value1, value2, "hfsj");
            return (Criteria) this;
        }

        public Criteria andHfsjNotBetween(String value1, String value2) {
            addCriterion("hfsj not between", value1, value2, "hfsj");
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