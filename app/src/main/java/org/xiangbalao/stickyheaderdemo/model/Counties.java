package org.xiangbalao.stickyheaderdemo.model;

import java.io.Serializable;

/**
 * Created by longtaoge on 2016/9/18.
 */
public class Counties implements Serializable {

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    private  String cityName;

    private String countyCode;
    private String countyName;

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }
}
