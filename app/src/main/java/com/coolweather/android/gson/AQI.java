package com.coolweather.android.gson;

/**
 * author : 梧桐
 * date : 2021/10/710:09
 * package : com.coolweather.android.gson
 */
public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
