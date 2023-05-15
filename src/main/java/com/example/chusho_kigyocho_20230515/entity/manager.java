package com.example.chusho_kigyocho_20230515.entity;

public class manager {
    private Integer managerId;

    private Integer managerDeleteFlag;

    private String managerUsername;

    private String managerPassword;

    public manager(Integer managerId, String managerUsername, String managerPassword) {
        this.managerId = managerId;
        this.managerUsername = managerUsername;
        this.managerPassword = managerPassword;
    }

    public manager(Integer managerId, Integer managerDeleteFlag, String managerUsername, String managerPassword) {
        this.managerId = managerId;
        this.managerDeleteFlag = managerDeleteFlag;
        this.managerUsername = managerUsername;
        this.managerPassword = managerPassword;
    }

    public manager() {
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Integer getManagerDeleteFlag() {
        return managerDeleteFlag;
    }

    public void setManagerDeleteFlag(Integer managerDeleteFlag) {
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
}
