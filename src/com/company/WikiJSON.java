package com.company;


import com.google.gson.annotations.SerializedName;

public class WikiJSON {

    @SerializedName("batchcomplete")

    private String batchcomplete;
    @SerializedName("continue")

    private Continue _continue;
    @SerializedName("query")

    private Query query;

    public WikiJSON() {
        super();
    }

    public String getBatchcomplete() {
        return batchcomplete;
    }

    public void setBatchcomplete(String batchcomplete) {
        this.batchcomplete = batchcomplete;
    }

    public Continue getContinue() {
        return _continue;
    }

    public void setContinue(Continue _continue) {
        this._continue = _continue;
    }

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }

}