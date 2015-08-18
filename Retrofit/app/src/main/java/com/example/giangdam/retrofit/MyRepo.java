package com.example.giangdam.retrofit;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Giang.Dam on 8/18/2015.
 */
public class MyRepo {
    @SerializedName("id")
    public String id;

    @SerializedName("company")
    public String company;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
