package com.example.bindingdata.user_details;

import com.example.bindingdata.AppConstants;
import com.example.bindingdata.pojo.CustomerExtraInfoModel;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface UserDetailsService {
    @GET(AppConstants.GET_USER_LIST)
    Call<CustomerExtraInfoModel> getCustomerData(
        @Query("page") long page
        );
    //ArrayList<CustomerExtraInfoModel> getCustomerData(long page);
}
