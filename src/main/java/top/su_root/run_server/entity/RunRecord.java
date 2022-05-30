package top.su_root.run_server.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class RunRecord implements Serializable {
    private Long id;

    private String account;

    private Double distance;

    private String duration;

    private String startpoint;

    private String endpoint;

    private String mStartTime;

    private String mEndTime;

    private Double calorie;

    private Double speed;

    private Double distribution;

    private String dateTag;

    private String pathline;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getStartpoint() {
        return startpoint;
    }

    public void setStartpoint(String startpoint) {
        this.startpoint = startpoint;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getmStartTime() {
        return mStartTime;
    }

    public void setmStartTime(String mStartTime) {
        this.mStartTime = mStartTime;
    }

    public String getmEndTime() {
        return mEndTime;
    }

    public void setmEndTime(String mEndTime) {
        this.mEndTime = mEndTime;
    }

    public Double getCalorie() {
        return calorie;
    }

    public void setCalorie(Double calorie) {
        this.calorie = calorie;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Double getDistribution() {
        return distribution;
    }

    public void setDistribution(Double distribution) {
        this.distribution = distribution;
    }

    public String getDateTag() {
        return dateTag;
    }

    public void setDateTag(String dateTag) {
        this.dateTag = dateTag;
    }

    public String getPathline() {
        return pathline;
    }

    public void setPathline(String pathline) {
        this.pathline = pathline;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", account=").append(account);
        sb.append(", distance=").append(distance);
        sb.append(", duration=").append(duration);
        sb.append(", startpoint=").append(startpoint);
        sb.append(", endpoint=").append(endpoint);
        sb.append(", mStartTime=").append(mStartTime);
        sb.append(", mEndTime=").append(mEndTime);
        sb.append(", calorie=").append(calorie);
        sb.append(", speed=").append(speed);
        sb.append(", distribution=").append(distribution);
        sb.append(", dateTag=").append(dateTag);
        sb.append(", pathline=").append(pathline);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}