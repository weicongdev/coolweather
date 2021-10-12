package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * author : 梧桐
 * date : 2021/10/710:14
 * package : com.coolweather.android.gson
 */
public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort{
        @SerializedName("txt")
        public String info;
    }
    public class CarWash{
        @SerializedName("txt")
        public String info;
    }
    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
