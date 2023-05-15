package com.example.chusho_kigyocho_20230515.entity;

public class Manager {
    private Integer managerId;

    private Boolean managerDeleteFlag;

    private String managerUsername;

    private String managerPassword;

    public Manager(String managerUsername, String managerPassword) {
        this.managerUsername = managerUsername;
        this.managerPassword = managerPassword;
    }

    public Manager() {
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Boolean getManagerDeleteFlag() {
        return managerDeleteFlag;
    }

    public void setManagerDeleteFlag(Boolean managerDeleteFlag) {
        this.managerDeleteFlag = managerDeleteFlag;
    }

    public String getManagerUsername() {
        return managerUsername;
    }

    public void setManagerUsername(String managerUsername) {
        this.managerUsername = managerUsername;
    }

    public String getManagerPassword() {
        return managerPassword;
    }

    public void setManagerPassword(String managerPassword) {
        this.managerPassword = managerPassword;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "managerId=" + managerId +
                ", managerDeleteFlag=" + managerDeleteFlag +
                ", managerUsername='" + managerUsername + '\'' +
                ", managerPassword='" + managerPassword + '\'' +
                '}';
    }
}
