package com.example.bindingdata.recycler_view_example;

import com.example.bindingdata.AppConstants;
import com.example.bindingdata.pojo.CustomerExtraInfoModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RecyclerDataInterface {

@GET(AppConstants.GET_USER_LIST)
    Call<CustomerExtraInfoModel> getCustomerData(long page);

}
/*
public interface RecyclerDataInterface {

    @GET(AppConstants.GET_USER_LIST)
    Call<CustomerExtraInfoModel> getCustomerData(
            @Query("page") long page
    );

}
 */
