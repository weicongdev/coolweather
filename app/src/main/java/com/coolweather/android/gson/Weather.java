package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * author : 梧桐
 * date : 2021/10/710:24
 * package : com.coolweather.android.gson
 */
public class Weather {
    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;
    
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
