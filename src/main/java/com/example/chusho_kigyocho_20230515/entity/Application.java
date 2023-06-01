package com.example.chusho_kigyocho_20230515.entity;

import java.util.Date;

public class Application {
    private Integer appUketsukeNo;
    private String appShinseiKubun;
    private Date appShinseiDate;

    private String appKokaiyoStatus;

    private Date appShinseishaKoshinDateTime;

    public Application(Integer appUketsukeNo, String appShinseiKubun, Date appShinseiDate, String appKokaiyoStatus, Date appShinseishaKoshinDateTime) {
        this.appUketsukeNo = appUketsukeNo;
        this.appShinseiKubun = appShinseiKubun;
        this.appShinseiDate = appShinseiDate;
        this.appKokaiyoStatus = appKokaiyoStatus;
        this.appShinseishaKoshinDateTime = appShinseishaKoshinDateTime;
    }

    public Application() {
    }

    public Integer getAppUketsukeNo() {
        return appUketsukeNo;
    }

    public void setAppUketsukeNo(Integer appUketsukeNo) {
        this.appUketsukeNo = appUketsukeNo;
    }

    public String getAppShinseiKubun() {
        return appShinseiKubun;
    }

    public void setAppShinseiKubun(String appShinseiKubun) {
        this.appShinseiKubun = appShinseiKubun;
    }

    public Date getAppShinseiDate() {
        return appShinseiDate;
    }

    public void setAppShinseiDate(Date appShinseiDate) {
        this.appShinseiDate = appShinseiDate;
    }

    public String getAppKokaiyoStatus() {
        return appKokaiyoStatus;
    }

    public void setAppKokaiyoStatus(String appKokaiyoStatus) {
        this.appKokaiyoStatus = appKokaiyoStatus;
    }

    public Date getAppShinseishaKoshinDateTime() {
        return appShinseishaKoshinDateTime;
    }

    @Override
    public String toString() {
        return "Application{" +
                "appUketsukeNo=" + appUketsukeNo +
                ", appShinseiKubun='" + appShinseiKubun + '\'' +
                ", appShinseiDate=" + appShinseiDate +
                ", appKokaiyoStatus='" + appKokaiyoStatus + '\'' +
                ", appShinseishaKoshinDateTime=" + appShinseishaKoshinDateTime +
                '}';
    }

    public void setAppShinseishaKoshinDateTime(Date appShinseishaKoshinDateTime) {
        this.appShinseishaKoshinDateTime = appShinseishaKoshinDateTime;
    }
}
