package org.xiangbalao.stickyheaderdemo.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by longtaoge on 2016/9/18.
 */
public class City implements Serializable {
    private String cityCode;
    private String cityName;
    /**
     * countyCode : 130102
     * countyName : 长安区
     */

    private List<Counties> counties;

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public List<Counties> getCounties() {
        return counties;
    }

    public void setCounties(List<Counties> counties) {
        this.counties = counties;
    }
}
