package com.company;


import com.google.gson.annotations.SerializedName;

public class Search {

    @SerializedName("ns")

    private Integer ns;
    @SerializedName("title")

    private String title;
    @SerializedName("pageid")

    private Integer pageid;
    @SerializedName("size")

    private Integer size;
    @SerializedName("wordcount")

    private Integer wordcount;
    @SerializedName("snippet")

    private String snippet;
    @SerializedName("timestamp")

    private String timestamp;

    public Integer getNs() {
        return ns;
    }

    public void setNs(Integer ns) {
        this.ns = ns;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPageid() {
        return pageid;
    }

    public void setPageid(Integer pageid) {
        this.pageid = pageid;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getWordcount() {
        return wordcount;
    }

    public void setWordcount(Integer wordcount) {
        this.wordcount = wordcount;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

}