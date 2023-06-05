package com.example.chusho_kigyocho_20230515.entity;

import java.util.Date;

public class Notification {
    private Integer ntcID;
    private Date ntcDATE;

    private String ntcTITLE;

    private String ntcJUYO;

    public Notification(Integer ntcID, Date ntcDATE, String ntcTITLE, String ntcJUYO) {
        this.ntcID = ntcID;
        this.ntcDATE = ntcDATE;
        this.ntcTITLE = ntcTITLE;
        this.ntcJUYO = ntcJUYO;
    }

    public Notification(Integer ntcID) {
        this.ntcID = ntcID;
    }

    public Integer getNtcID() {
        return ntcID;
    }

    public void setNtcID(Integer ntcID) {
        this.ntcID = ntcID;
    }

    public Date getNtcDATE() {
        return ntcDATE;
    }

    public void setNtcDATE(Date ntcDATE) {
        this.ntcDATE = ntcDATE;
    }

    public String getNtcTITLE() {
        return ntcTITLE;
    }

    public void setNtcTITLE(String ntcTITLE) {
        this.ntcTITLE = ntcTITLE;
    }

    public String getNtcJUYO() {
        return ntcJUYO;
    }



    public void setNtcJUYO(String ntcJUYO) {
        this.ntcJUYO = ntcJUYO;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "ntcID=" + ntcID +
                ", ntcDATE=" + ntcDATE +
                ", ntcTITLE='" + ntcTITLE + '\'' +
                ", ntcJUYO='" + ntcJUYO + '\'' +
                '}';
    }
}
