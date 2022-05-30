package top.su_root.run_server.entity;

import java.util.ArrayList;
import java.util.List;

public class RunRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RunRecordExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andDistanceIsNull() {
            addCriterion("distance is null");
            return (Criteria) this;
        }

        public Criteria andDistanceIsNotNull() {
            addCriterion("distance is not null");
            return (Criteria) this;
        }

        public Criteria andDistanceEqualTo(Double value) {
            addCriterion("distance =", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotEqualTo(Double value) {
            addCriterion("distance <>", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceGreaterThan(Double value) {
            addCriterion("distance >", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceGreaterThanOrEqualTo(Double value) {
            addCriterion("distance >=", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceLessThan(Double value) {
            addCriterion("distance <", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceLessThanOrEqualTo(Double value) {
            addCriterion("distance <=", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceIn(List<Double> values) {
            addCriterion("distance in", values, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotIn(List<Double> values) {
            addCriterion("distance not in", values, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceBetween(Double value1, Double value2) {
            addCriterion("distance between", value1, value2, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotBetween(Double value1, Double value2) {
            addCriterion("distance not between", value1, value2, "distance");
            return (Criteria) this;
        }

        public Criteria andDurationIsNull() {
            addCriterion("duration is null");
            return (Criteria) this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("duration is not null");
            return (Criteria) this;
        }

        public Criteria andDurationEqualTo(String value) {
            addCriterion("duration =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(String value) {
            addCriterion("duration <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(String value) {
            addCriterion("duration >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(String value) {
            addCriterion("duration >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(String value) {
            addCriterion("duration <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(String value) {
            addCriterion("duration <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLike(String value) {
            addCriterion("duration like", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotLike(String value) {
            addCriterion("duration not like", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<String> values) {
            addCriterion("duration in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<String> values) {
            addCriterion("duration not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(String value1, String value2) {
            addCriterion("duration between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(String value1, String value2) {
            addCriterion("duration not between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andStartpointIsNull() {
            addCriterion("startPoint is null");
            return (Criteria) this;
        }

        public Criteria andStartpointIsNotNull() {
            addCriterion("startPoint is not null");
            return (Criteria) this;
        }

        public Criteria andStartpointEqualTo(String value) {
            addCriterion("startPoint =", value, "startpoint");
            return (Criteria) this;
        }

        public Criteria andStartpointNotEqualTo(String value) {
            addCriterion("startPoint <>", value, "startpoint");
            return (Criteria) this;
        }

        public Criteria andStartpointGreaterThan(String value) {
            addCriterion("startPoint >", value, "startpoint");
            return (Criteria) this;
        }

        public Criteria andStartpointGreaterThanOrEqualTo(String value) {
            addCriterion("startPoint >=", value, "startpoint");
            return (Criteria) this;
        }

        public Criteria andStartpointLessThan(String value) {
            addCriterion("startPoint <", value, "startpoint");
            return (Criteria) this;
        }

        public Criteria andStartpointLessThanOrEqualTo(String value) {
            addCriterion("startPoint <=", value, "startpoint");
            return (Criteria) this;
        }

        public Criteria andStartpointLike(String value) {
            addCriterion("startPoint like", value, "startpoint");
            return (Criteria) this;
        }

        public Criteria andStartpointNotLike(String value) {
            addCriterion("startPoint not like", value, "startpoint");
            return (Criteria) this;
        }

        public Criteria andStartpointIn(List<String> values) {
            addCriterion("startPoint in", values, "startpoint");
            return (Criteria) this;
        }

        public Criteria andStartpointNotIn(List<String> values) {
            addCriterion("startPoint not in", values, "startpoint");
            return (Criteria) this;
        }

        public Criteria andStartpointBetween(String value1, String value2) {
            addCriterion("startPoint between", value1, value2, "startpoint");
            return (Criteria) this;
        }

        public Criteria andStartpointNotBetween(String value1, String value2) {
            addCriterion("startPoint not between", value1, value2, "startpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointIsNull() {
            addCriterion("endPoint is null");
            return (Criteria) this;
        }

        public Criteria andEndpointIsNotNull() {
            addCriterion("endPoint is not null");
            return (Criteria) this;
        }

        public Criteria andEndpointEqualTo(String value) {
            addCriterion("endPoint =", value, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointNotEqualTo(String value) {
            addCriterion("endPoint <>", value, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointGreaterThan(String value) {
            addCriterion("endPoint >", value, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointGreaterThanOrEqualTo(String value) {
            addCriterion("endPoint >=", value, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointLessThan(String value) {
            addCriterion("endPoint <", value, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointLessThanOrEqualTo(String value) {
            addCriterion("endPoint <=", value, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointLike(String value) {
            addCriterion("endPoint like", value, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointNotLike(String value) {
            addCriterion("endPoint not like", value, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointIn(List<String> values) {
            addCriterion("endPoint in", values, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointNotIn(List<String> values) {
            addCriterion("endPoint not in", values, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointBetween(String value1, String value2) {
            addCriterion("endPoint between", value1, value2, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointNotBetween(String value1, String value2) {
            addCriterion("endPoint not between", value1, value2, "endpoint");
            return (Criteria) this;
        }

        public Criteria andMStartTimeIsNull() {
            addCriterion("m_start_time is null");
            return (Criteria) this;
        }

        public Criteria andMStartTimeIsNotNull() {
            addCriterion("m_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andMStartTimeEqualTo(String value) {
            addCriterion("m_start_time =", value, "mStartTime");
            return (Criteria) this;
        }

        public Criteria andMStartTimeNotEqualTo(String value) {
            addCriterion("m_start_time <>", value, "mStartTime");
            return (Criteria) this;
        }

        public Criteria andMStartTimeGreaterThan(String value) {
            addCriterion("m_start_time >", value, "mStartTime");
            return (Criteria) this;
        }

        public Criteria andMStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("m_start_time >=", value, "mStartTime");
            return (Criteria) this;
        }

        public Criteria andMStartTimeLessThan(String value) {
            addCriterion("m_start_time <", value, "mStartTime");
            return (Criteria) this;
        }

        public Criteria andMStartTimeLessThanOrEqualTo(String value) {
            addCriterion("m_start_time <=", value, "mStartTime");
            return (Criteria) this;
        }

        public Criteria andMStartTimeLike(String value) {
            addCriterion("m_start_time like", value, "mStartTime");
            return (Criteria) this;
        }

        public Criteria andMStartTimeNotLike(String value) {
            addCriterion("m_start_time not like", value, "mStartTime");
            return (Criteria) this;
        }

        public Criteria andMStartTimeIn(List<String> values) {
            addCriterion("m_start_time in", values, "mStartTime");
            return (Criteria) this;
        }

        public Criteria andMStartTimeNotIn(List<String> values) {
            addCriterion("m_start_time not in", values, "mStartTime");
            return (Criteria) this;
        }

        public Criteria andMStartTimeBetween(String value1, String value2) {
            addCriterion("m_start_time between", value1, value2, "mStartTime");
            return (Criteria) this;
        }

        public Criteria andMStartTimeNotBetween(String value1, String value2) {
            addCriterion("m_start_time not between", value1, value2, "mStartTime");
            return (Criteria) this;
        }

        public Criteria andMEndTimeIsNull() {
            addCriterion("m_end_time is null");
            return (Criteria) this;
        }

        public Criteria andMEndTimeIsNotNull() {
            addCriterion("m_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andMEndTimeEqualTo(String value) {
            addCriterion("m_end_time =", value, "mEndTime");
            return (Criteria) this;
        }

        public Criteria andMEndTimeNotEqualTo(String value) {
            addCriterion("m_end_time <>", value, "mEndTime");
            return (Criteria) this;
        }

        public Criteria andMEndTimeGreaterThan(String value) {
            addCriterion("m_end_time >", value, "mEndTime");
            return (Criteria) this;
        }

        public Criteria andMEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("m_end_time >=", value, "mEndTime");
            return (Criteria) this;
        }

        public Criteria andMEndTimeLessThan(String value) {
            addCriterion("m_end_time <", value, "mEndTime");
            return (Criteria) this;
        }

        public Criteria andMEndTimeLessThanOrEqualTo(String value) {
            addCriterion("m_end_time <=", value, "mEndTime");
            return (Criteria) this;
        }

        public Criteria andMEndTimeLike(String value) {
            addCriterion("m_end_time like", value, "mEndTime");
            return (Criteria) this;
        }

        public Criteria andMEndTimeNotLike(String value) {
            addCriterion("m_end_time not like", value, "mEndTime");
            return (Criteria) this;
        }

        public Criteria andMEndTimeIn(List<String> values) {
            addCriterion("m_end_time in", values, "mEndTime");
            return (Criteria) this;
        }

        public Criteria andMEndTimeNotIn(List<String> values) {
            addCriterion("m_end_time not in", values, "mEndTime");
            return (Criteria) this;
        }

        public Criteria andMEndTimeBetween(String value1, String value2) {
            addCriterion("m_end_time between", value1, value2, "mEndTime");
            return (Criteria) this;
        }

        public Criteria andMEndTimeNotBetween(String value1, String value2) {
            addCriterion("m_end_time not between", value1, value2, "mEndTime");
            return (Criteria) this;
        }

        public Criteria andCalorieIsNull() {
            addCriterion("calorie is null");
            return (Criteria) this;
        }

        public Criteria andCalorieIsNotNull() {
            addCriterion("calorie is not null");
            return (Criteria) this;
        }

        public Criteria andCalorieEqualTo(Double value) {
            addCriterion("calorie =", value, "calorie");
            return (Criteria) this;
        }

        public Criteria andCalorieNotEqualTo(Double value) {
            addCriterion("calorie <>", value, "calorie");
            return (Criteria) this;
        }

        public Criteria andCalorieGreaterThan(Double value) {
            addCriterion("calorie >", value, "calorie");
            return (Criteria) this;
        }

        public Criteria andCalorieGreaterThanOrEqualTo(Double value) {
            addCriterion("calorie >=", value, "calorie");
            return (Criteria) this;
        }

        public Criteria andCalorieLessThan(Double value) {
            addCriterion("calorie <", value, "calorie");
            return (Criteria) this;
        }

        public Criteria andCalorieLessThanOrEqualTo(Double value) {
            addCriterion("calorie <=", value, "calorie");
            return (Criteria) this;
        }

        public Criteria andCalorieIn(List<Double> values) {
            addCriterion("calorie in", values, "calorie");
            return (Criteria) this;
        }

        public Criteria andCalorieNotIn(List<Double> values) {
            addCriterion("calorie not in", values, "calorie");
            return (Criteria) this;
        }

        public Criteria andCalorieBetween(Double value1, Double value2) {
            addCriterion("calorie between", value1, value2, "calorie");
            return (Criteria) this;
        }

        public Criteria andCalorieNotBetween(Double value1, Double value2) {
            addCriterion("calorie not between", value1, value2, "calorie");
            return (Criteria) this;
        }

        public Criteria andSpeedIsNull() {
            addCriterion("speed is null");
            return (Criteria) this;
        }

        public Criteria andSpeedIsNotNull() {
            addCriterion("speed is not null");
            return (Criteria) this;
        }

        public Criteria andSpeedEqualTo(Double value) {
            addCriterion("speed =", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedNotEqualTo(Double value) {
            addCriterion("speed <>", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedGreaterThan(Double value) {
            addCriterion("speed >", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedGreaterThanOrEqualTo(Double value) {
            addCriterion("speed >=", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedLessThan(Double value) {
            addCriterion("speed <", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedLessThanOrEqualTo(Double value) {
            addCriterion("speed <=", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedIn(List<Double> values) {
            addCriterion("speed in", values, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedNotIn(List<Double> values) {
            addCriterion("speed not in", values, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedBetween(Double value1, Double value2) {
            addCriterion("speed between", value1, value2, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedNotBetween(Double value1, Double value2) {
            addCriterion("speed not between", value1, value2, "speed");
            return (Criteria) this;
        }

        public Criteria andDistributionIsNull() {
            addCriterion("distribution is null");
            return (Criteria) this;
        }

        public Criteria andDistributionIsNotNull() {
            addCriterion("distribution is not null");
            return (Criteria) this;
        }

        public Criteria andDistributionEqualTo(Double value) {
            addCriterion("distribution =", value, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionNotEqualTo(Double value) {
            addCriterion("distribution <>", value, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionGreaterThan(Double value) {
            addCriterion("distribution >", value, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionGreaterThanOrEqualTo(Double value) {
            addCriterion("distribution >=", value, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionLessThan(Double value) {
            addCriterion("distribution <", value, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionLessThanOrEqualTo(Double value) {
            addCriterion("distribution <=", value, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionIn(List<Double> values) {
            addCriterion("distribution in", values, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionNotIn(List<Double> values) {
            addCriterion("distribution not in", values, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionBetween(Double value1, Double value2) {
            addCriterion("distribution between", value1, value2, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionNotBetween(Double value1, Double value2) {
            addCriterion("distribution not between", value1, value2, "distribution");
            return (Criteria) this;
        }

        public Criteria andDateTagIsNull() {
            addCriterion("date_tag is null");
            return (Criteria) this;
        }

        public Criteria andDateTagIsNotNull() {
            addCriterion("date_tag is not null");
            return (Criteria) this;
        }

        public Criteria andDateTagEqualTo(String value) {
            addCriterion("date_tag =", value, "dateTag");
            return (Criteria) this;
        }

        public Criteria andDateTagNotEqualTo(String value) {
            addCriterion("date_tag <>", value, "dateTag");
            return (Criteria) this;
        }

        public Criteria andDateTagGreaterThan(String value) {
            addCriterion("date_tag >", value, "dateTag");
            return (Criteria) this;
        }

        public Criteria andDateTagGreaterThanOrEqualTo(String value) {
            addCriterion("date_tag >=", value, "dateTag");
            return (Criteria) this;
        }

        public Criteria andDateTagLessThan(String value) {
            addCriterion("date_tag <", value, "dateTag");
            return (Criteria) this;
        }

        public Criteria andDateTagLessThanOrEqualTo(String value) {
            addCriterion("date_tag <=", value, "dateTag");
            return (Criteria) this;
        }

        public Criteria andDateTagLike(String value) {
            addCriterion("date_tag like", value, "dateTag");
            return (Criteria) this;
        }

        public Criteria andDateTagNotLike(String value) {
            addCriterion("date_tag not like", value, "dateTag");
            return (Criteria) this;
        }

        public Criteria andDateTagIn(List<String> values) {
            addCriterion("date_tag in", values, "dateTag");
            return (Criteria) this;
        }

        public Criteria andDateTagNotIn(List<String> values) {
            addCriterion("date_tag not in", values, "dateTag");
            return (Criteria) this;
        }

        public Criteria andDateTagBetween(String value1, String value2) {
            addCriterion("date_tag between", value1, value2, "dateTag");
            return (Criteria) this;
        }

        public Criteria andDateTagNotBetween(String value1, String value2) {
            addCriterion("date_tag not between", value1, value2, "dateTag");
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