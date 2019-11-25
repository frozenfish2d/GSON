package com.company;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Query {

    @SerializedName("searchinfo")

    private Searchinfo searchinfo;
    @SerializedName("search")

    private List<Search> search = null;

    public Searchinfo getSearchinfo() {
        return searchinfo;
    }

    public void setSearchinfo(Searchinfo searchinfo) {
        this.searchinfo = searchinfo;
    }

    public List<Search> getSearch() {
        return search;
    }

    public void setSearch(List<Search> search) {
        this.search = search;
    }

}