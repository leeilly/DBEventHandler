package dbeventhandler.domain;

import java.io.Serializable;

public class Column implements Serializable {
    private String orgName;
    private String targetName;
    private String orgValue;
    private String targetValue;

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public String getOrgValue() {
        return orgValue;
    }

    public void setOrgValue(String orgValue) {
        this.orgValue = orgValue;
    }

    public String getTargetValue() {
        return targetValue;
    }

    public void setTargetValue(String targetValue) {
        this.targetValue = targetValue;
    }

    @Override
    public String toString() {
        return "Column{" +
                "orgName='" + orgName + '\'' +
                ", targetName='" + targetName + '\'' +
                ", orgValue='" + orgValue + '\'' +
                ", targetValue='" + targetValue + '\'' +
                '}';
    }
}
