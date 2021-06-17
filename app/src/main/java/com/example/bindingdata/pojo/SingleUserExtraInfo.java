package com.example.bindingdata.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class SingleUserExtraInfo implements Serializable {
    @SerializedName("data")
    @Expose
    private SingleUserInfo data;
    @SerializedName("support")
    @Expose
    private SingleUserSupportInfo support;

    public SingleUserExtraInfo(SingleUserInfo data, SingleUserSupportInfo support) {
        this.data = data;
        this.support = support;
    }

    public SingleUserInfo getData() {
        return data;
    }

    public void setData(SingleUserInfo data) {
        this.data = data;
    }

    public SingleUserSupportInfo getSupport() {
        return support;
    }

    public void setSupport(SingleUserSupportInfo support) {
        this.support = support;
    }
}
