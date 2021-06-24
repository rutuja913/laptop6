package com.example.bindingdata.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class CustomerExtraInfoModel implements Serializable {
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

    public ArrayList<CustomerInfoModel> getData() {
        return data;
    }

    public void setData(ArrayList<CustomerInfoModel> data) {
        this.data = data;
    }

    @SerializedName("data")
    @Expose
    private ArrayList<CustomerInfoModel> data ;

    public CustomerExtraInfoModel(long page, long perPage, long total, long totalPages, ArrayList<CustomerInfoModel> data) {
        this.page = page;
        this.perPage = perPage;
        this.total = total;
        this.totalPages = totalPages;
        this.data = data;
    }
}
