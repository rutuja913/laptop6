package com.example.bindingdata.recycler_view_example;

import com.example.bindingdata.pojo.CustomerExtraInfoModel;

import retrofit2.Call;

public interface RecyclerDataInterface {
    long page = 0;

    Call<CustomerExtraInfoModel> getCustomerData(long page);
}
