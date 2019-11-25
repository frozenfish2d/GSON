package com.company;


import com.google.gson.annotations.SerializedName;

public class Continue {

    @SerializedName("sroffset")

    private Integer sroffset;
    @SerializedName("continue")

    private String _continue;

    public Integer getSroffset() {
        return sroffset;
    }

    public void setSroffset(Integer sroffset) {
        this.sroffset = sroffset;
    }

    public String getContinue() {
        return _continue;
    }

    public void setContinue(String _continue) {
        this._continue = _continue;
    }

}