package dbeventhandler.domain;

import java.io.Serializable;

public class Table implements Serializable {
    private String orgName;

    private String targetName;

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

    @Override
    public String toString() {
        return "Table{" +
                "org='" + orgName + '\'' +
                ", target='" + targetName + '\'' +
                '}';
    }
}
