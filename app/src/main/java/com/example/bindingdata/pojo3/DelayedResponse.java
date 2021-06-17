package com.example.bindingdata.pojo3;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class DelayedResponse implements Serializable {
    @SerializedName("page")
    @Expose
    private long page;
    @SerializedName("per_page")
    @Expose
    private long perPage;
    @SerializedName("total")
    @Expose
    private long total;
    @SerializedName("total_pages")
    @Expose
    private long totalPages;
    @SerializedName("data")
    @Expose
    private ArrayList<DelayedResponseData> data = null;
    @SerializedName("support")
    @Expose
    private DelayedResponseSupport support;

    public DelayedResponse(long page, long perPage, long total, long totalPages, ArrayList<DelayedResponseData> data, DelayedResponseSupport support) {
        this.page = page;
        this.perPage = perPage;
        this.total = total;
        this.totalPages = totalPages;
        this.data = data;
        this.support = support;
    }

    public long getPage() {
        return page;
    }

    public void setPage(long page) {
        this.page = page;
    }

    public long getPerPage() {
        return perPage;
    }

    public void setPerPage(long perPage) {
        this.perPage = perPage;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public long getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(long totalPages) {
        this.totalPages = totalPages;
    }

    public ArrayList<DelayedResponseData> getData() {
        return data;
    }

    public void setData(ArrayList<DelayedResponseData> data) {
        this.data = data;
    }

    public DelayedResponseSupport getSupport() {
        return support;
    }

    public void setSupport(DelayedResponseSupport support) {
        this.support = support;
    }
}
