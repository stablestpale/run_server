package top.su_root.run_server.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class UserInfo implements Serializable {
    private String account;

    private Double distance;

    private static final long serialVersionUID = 1L;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", account=").append(account);
        sb.append(", distance=").append(distance);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}