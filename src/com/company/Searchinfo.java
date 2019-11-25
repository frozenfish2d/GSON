package com.company;


import com.google.gson.annotations.SerializedName;

public class Searchinfo {

    @SerializedName("totalhits")

    private Integer totalhits;

    public Integer getTotalhits() {
        return totalhits;
    }

    public void setTotalhits(Integer totalhits) {
        this.totalhits = totalhits;
    }

}