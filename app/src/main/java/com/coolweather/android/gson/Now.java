package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * author : 梧桐
 * date : 2021/10/710:10
 * package : com.coolweather.android.gson
 */
public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
