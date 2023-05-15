package com.example.chusho_kigyocho_20230515.entity;

public class Normaluser {
//    private Integer
    private Integer normaluserId;

    private Integer normaluserDeleteFlag;

    private String normaluserUsername;

    private String normaluserPassword;

    public Normaluser(String normaluserUsername, String normaluserPassword) {
        this.normaluserUsername = normaluserUsername;
        this.normaluserPassword = normaluserPassword;
    }

    public Integer getNormaluserId() {
        return normaluserId;
    }

    public void setNormaluserId(Integer normaluserId) {
        this.normaluserId = normaluserId;
    }

    public Integer getNormaluserDeleteFlag() {
        return normaluserDeleteFlag;
    }

    public void setNormaluserDeleteFlag(Integer normaluserDeleteFlag) {
        this.normaluserDeleteFlag = normaluserDeleteFlag;
    }

    public String getNormaluserUsername() {
        return normaluserUsername;
    }

    public void setNormaluserUsername(String normaluserUsername) {
        this.normaluserUsername = normaluserUsername;
    }

    public String getNormaluserPassword() {
        return normaluserPassword;
    }

    public void setNormaluserPassword(String normaluserPassword) {
        this.normaluserPassword = normaluserPassword;
    }
}
