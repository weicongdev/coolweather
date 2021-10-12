package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * author : 梧桐
 * date : 2021/10/710:01
 * package : com.coolweather.android.gson
 */
public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
