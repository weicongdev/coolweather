package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * author : 梧桐
 * date : 2021/10/616:22
 * package : com.coolweather.android.db
 */
public class City extends DataSupport {

    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return this.provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
