package top.su_root.run_server.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class RunTrace implements Serializable {
    private Integer id;

    private Integer recordId;

    private String trace;

    private static final long serialVersionUID = 1L;

    public RunTrace(Integer recordId, String trace) {
        this.recordId = recordId;
        this.trace = trace;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public String getTrace() {
        return trace;
    }

    public void setTrace(String trace) {
        this.trace = trace;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", recordId=").append(recordId);
        sb.append(", trace=").append(trace);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}