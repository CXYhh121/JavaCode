package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class SjExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SjExample() {
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

        public Criteria andZyidIsNull() {
            addCriterion("zyid is null");
            return (Criteria) this;
        }

        public Criteria andZyidIsNotNull() {
            addCriterion("zyid is not null");
            return (Criteria) this;
        }

        public Criteria andZyidEqualTo(String value) {
            addCriterion("zyid =", value, "zyid");
            return (Criteria) this;
        }

        public Criteria andZyidNotEqualTo(String value) {
            addCriterion("zyid <>", value, "zyid");
            return (Criteria) this;
        }

        public Criteria andZyidGreaterThan(String value) {
            addCriterion("zyid >", value, "zyid");
            return (Criteria) this;
        }

        public Criteria andZyidGreaterThanOrEqualTo(String value) {
            addCriterion("zyid >=", value, "zyid");
            return (Criteria) this;
        }

        public Criteria andZyidLessThan(String value) {
            addCriterion("zyid <", value, "zyid");
            return (Criteria) this;
        }

        public Criteria andZyidLessThanOrEqualTo(String value) {
            addCriterion("zyid <=", value, "zyid");
            return (Criteria) this;
        }

        public Criteria andZyidLike(String value) {
            addCriterion("zyid like", value, "zyid");
            return (Criteria) this;
        }

        public Criteria andZyidNotLike(String value) {
            addCriterion("zyid not like", value, "zyid");
            return (Criteria) this;
        }

        public Criteria andZyidIn(List<String> values) {
            addCriterion("zyid in", values, "zyid");
            return (Criteria) this;
        }

        public Criteria andZyidNotIn(List<String> values) {
            addCriterion("zyid not in", values, "zyid");
            return (Criteria) this;
        }

        public Criteria andZyidBetween(String value1, String value2) {
            addCriterion("zyid between", value1, value2, "zyid");
            return (Criteria) this;
        }

        public Criteria andZyidNotBetween(String value1, String value2) {
            addCriterion("zyid not between", value1, value2, "zyid");
            return (Criteria) this;
        }

        public Criteria andMcIsNull() {
            addCriterion("mc is null");
            return (Criteria) this;
        }

        public Criteria andMcIsNotNull() {
            addCriterion("mc is not null");
            return (Criteria) this;
        }

        public Criteria andMcEqualTo(String value) {
            addCriterion("mc =", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotEqualTo(String value) {
            addCriterion("mc <>", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcGreaterThan(String value) {
            addCriterion("mc >", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcGreaterThanOrEqualTo(String value) {
            addCriterion("mc >=", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLessThan(String value) {
            addCriterion("mc <", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLessThanOrEqualTo(String value) {
            addCriterion("mc <=", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLike(String value) {
            addCriterion("mc like", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotLike(String value) {
            addCriterion("mc not like", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcIn(List<String> values) {
            addCriterion("mc in", values, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotIn(List<String> values) {
            addCriterion("mc not in", values, "mc");
            return (Criteria) this;
        }

        public Criteria andMcBetween(String value1, String value2) {
            addCriterion("mc between", value1, value2, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotBetween(String value1, String value2) {
            addCriterion("mc not between", value1, value2, "mc");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
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

        public Criteria andJsIsNull() {
            addCriterion("js is null");
            return (Criteria) this;
        }

        public Criteria andJsIsNotNull() {
            addCriterion("js is not null");
            return (Criteria) this;
        }

        public Criteria andJsEqualTo(String value) {
            addCriterion("js =", value, "js");
            return (Criteria) this;
        }

        public Criteria andJsNotEqualTo(String value) {
            addCriterion("js <>", value, "js");
            return (Criteria) this;
        }

        public Criteria andJsGreaterThan(String value) {
            addCriterion("js >", value, "js");
            return (Criteria) this;
        }

        public Criteria andJsGreaterThanOrEqualTo(String value) {
            addCriterion("js >=", value, "js");
            return (Criteria) this;
        }

        public Criteria andJsLessThan(String value) {
            addCriterion("js <", value, "js");
            return (Criteria) this;
        }

        public Criteria andJsLessThanOrEqualTo(String value) {
            addCriterion("js <=", value, "js");
            return (Criteria) this;
        }

        public Criteria andJsLike(String value) {
            addCriterion("js like", value, "js");
            return (Criteria) this;
        }

        public Criteria andJsNotLike(String value) {
            addCriterion("js not like", value, "js");
            return (Criteria) this;
        }

        public Criteria andJsIn(List<String> values) {
            addCriterion("js in", values, "js");
            return (Criteria) this;
        }

        public Criteria andJsNotIn(List<String> values) {
            addCriterion("js not in", values, "js");
            return (Criteria) this;
        }

        public Criteria andJsBetween(String value1, String value2) {
            addCriterion("js between", value1, value2, "js");
            return (Criteria) this;
        }

        public Criteria andJsNotBetween(String value1, String value2) {
            addCriterion("js not between", value1, value2, "js");
            return (Criteria) this;
        }

        public Criteria andPfIsNull() {
            addCriterion("pf is null");
            return (Criteria) this;
        }

        public Criteria andPfIsNotNull() {
            addCriterion("pf is not null");
            return (Criteria) this;
        }

        public Criteria andPfEqualTo(String value) {
            addCriterion("pf =", value, "pf");
            return (Criteria) this;
        }

        public Criteria andPfNotEqualTo(String value) {
            addCriterion("pf <>", value, "pf");
            return (Criteria) this;
        }

        public Criteria andPfGreaterThan(String value) {
            addCriterion("pf >", value, "pf");
            return (Criteria) this;
        }

        public Criteria andPfGreaterThanOrEqualTo(String value) {
            addCriterion("pf >=", value, "pf");
            return (Criteria) this;
        }

        public Criteria andPfLessThan(String value) {
            addCriterion("pf <", value, "pf");
            return (Criteria) this;
        }

        public Criteria andPfLessThanOrEqualTo(String value) {
            addCriterion("pf <=", value, "pf");
            return (Criteria) this;
        }

        public Criteria andPfLike(String value) {
            addCriterion("pf like", value, "pf");
            return (Criteria) this;
        }

        public Criteria andPfNotLike(String value) {
            addCriterion("pf not like", value, "pf");
            return (Criteria) this;
        }

        public Criteria andPfIn(List<String> values) {
            addCriterion("pf in", values, "pf");
            return (Criteria) this;
        }

        public Criteria andPfNotIn(List<String> values) {
            addCriterion("pf not in", values, "pf");
            return (Criteria) this;
        }

        public Criteria andPfBetween(String value1, String value2) {
            addCriterion("pf between", value1, value2, "pf");
            return (Criteria) this;
        }

        public Criteria andPfNotBetween(String value1, String value2) {
            addCriterion("pf not between", value1, value2, "pf");
            return (Criteria) this;
        }

        public Criteria andPyIsNull() {
            addCriterion("py is null");
            return (Criteria) this;
        }

        public Criteria andPyIsNotNull() {
            addCriterion("py is not null");
            return (Criteria) this;
        }

        public Criteria andPyEqualTo(String value) {
            addCriterion("py =", value, "py");
            return (Criteria) this;
        }

        public Criteria andPyNotEqualTo(String value) {
            addCriterion("py <>", value, "py");
            return (Criteria) this;
        }

        public Criteria andPyGreaterThan(String value) {
            addCriterion("py >", value, "py");
            return (Criteria) this;
        }

        public Criteria andPyGreaterThanOrEqualTo(String value) {
            addCriterion("py >=", value, "py");
            return (Criteria) this;
        }

        public Criteria andPyLessThan(String value) {
            addCriterion("py <", value, "py");
            return (Criteria) this;
        }

        public Criteria andPyLessThanOrEqualTo(String value) {
            addCriterion("py <=", value, "py");
            return (Criteria) this;
        }

        public Criteria andPyLike(String value) {
            addCriterion("py like", value, "py");
            return (Criteria) this;
        }

        public Criteria andPyNotLike(String value) {
            addCriterion("py not like", value, "py");
            return (Criteria) this;
        }

        public Criteria andPyIn(List<String> values) {
            addCriterion("py in", values, "py");
            return (Criteria) this;
        }

        public Criteria andPyNotIn(List<String> values) {
            addCriterion("py not in", values, "py");
            return (Criteria) this;
        }

        public Criteria andPyBetween(String value1, String value2) {
            addCriterion("py between", value1, value2, "py");
            return (Criteria) this;
        }

        public Criteria andPyNotBetween(String value1, String value2) {
            addCriterion("py not between", value1, value2, "py");
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