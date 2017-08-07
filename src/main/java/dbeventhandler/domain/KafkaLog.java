package dbeventhandler.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Map;

public class KafkaLog implements Serializable {
    @JsonProperty("table")
    private String table;
    @JsonProperty("op_type")
    private String type;
    @JsonProperty("op_ts")
    private String opTs;
    @JsonProperty("current_ts")
    private String currentTs;
    @JsonProperty("pos")
    private String pos;
    @JsonProperty("tokens")
    private String tokens;
    @JsonProperty("before")
    private Map beforeLog;
    @JsonProperty("after")
    private Map afterLog;

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOpTs() {
        return opTs;
    }

    public void setOpTs(String opTs) {
        this.opTs = opTs;
    }

    public String getCurrentTs() {
        return currentTs;
    }

    public void setCurrentTs(String currentTs) {
        this.currentTs = currentTs;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getTokens() {
        return tokens;
    }

    public void setTokens(String tokens) {
        this.tokens = tokens;
    }

    public Map getBeforeLog() {
        return beforeLog;
    }

    public void setBeforeLog(Map beforeLog) {
        this.beforeLog = beforeLog;
    }

    public Map getAfterLog() {
        return afterLog;
    }

    public void setAfterLog(Map afterLog) {
        this.afterLog = afterLog;
    }

    @Override
    public String toString() {
        return "KafkaLog{" +
                "table='" + table + '\'' +
                ", type='" + type + '\'' +
                ", opTs='" + opTs + '\'' +
                ", currentTs='" + currentTs + '\'' +
                ", pos='" + pos + '\'' +
                ", token='" + tokens + '\'' +
                ", beforeLog=" + beforeLog +
                ", afterLog=" + afterLog +
                '}';
    }
}
