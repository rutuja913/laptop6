package com.example.bindingdata.recycler_view_example;

import android.util.Log;

import com.example.bindingdata.pojo.CustomerExtraInfoModel;
import com.example.bindingdata.pojo.CustomerInfoModel;
import com.example.bindingdata.retrofit.APIClient;
import com.google.gson.Gson;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GetUserDataFromRestAPI {
    RecyclerDataInterface recyclerDataInterface;
    private CustomerExtraInfoModel customerExtraInfoModel;
    public GetUserDataFromRestAPI()
    {
        recyclerDataInterface= APIClient.getClient().create(RecyclerDataInterface.class);
    }

    public ArrayList<CustomerInfoModel> getUserData() {
        //call rest api and get data

        String jsonData = "{\n" +
                "    \"page\": 2,\n" +
                "    \"per_page\": 6,\n" +
                "    \"total\": 12,\n" +
                "    \"total_pages\": 2,\n" +
                "    \"data\": [\n" +
                "        {\n" +
                "            \"id\": 7,\n" +
                "            \"email\": \"michael.lawson@reqres.in\",\n" +
                "            \"first_name\": \"Michael\",\n" +
                "            \"last_name\": \"Lawson\",\n" +
                "            \"avatar\": \"https://reqres.in/img/faces/7-image.jpg\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 8,\n" +
                "            \"email\": \"lindsay.ferguson@reqres.in\",\n" +
                "            \"first_name\": \"Lindsay\",\n" +
                "            \"last_name\": \"Ferguson\",\n" +
                "            \"avatar\": \"https://reqres.in/img/faces/8-image.jpg\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 9,\n" +
                "            \"email\": \"tobias.funke@reqres.in\",\n" +
                "            \"first_name\": \"Tobias\",\n" +
                "            \"last_name\": \"Funke\",\n" +
                "            \"avatar\": \"https://reqres.in/img/faces/9-image.jpg\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 10,\n" +
                "            \"email\": \"byron.fields@reqres.in\",\n" +
                "            \"first_name\": \"Byron\",\n" +
                "            \"last_name\": \"Fields\",\n" +
                "            \"avatar\": \"https://reqres.in/img/faces/10-image.jpg\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 11,\n" +
                "            \"email\": \"george.edwards@reqres.in\",\n" +
                "            \"first_name\": \"George\",\n" +
                "            \"last_name\": \"Edwards\",\n" +
                "            \"avatar\": \"https://reqres.in/img/faces/11-image.jpg\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 12,\n" +
                "            \"email\": \"rachel.howell@reqres.in\",\n" +
                "            \"first_name\": \"Rachel\",\n" +
                "            \"last_name\": \"Howell\",\n" +
                "            \"avatar\": \"https://reqres.in/img/faces/12-image.jpg\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"support\": {\n" +
                "        \"url\": \"https://reqres.in/#support-heading\",\n" +
                "        \"text\": \"To keep ReqRes free, contributions towards server costs are appreciated!\"\n" +
                "    }\n" +
                "}";
        //customerExtraInfoModel=new CustomerExtraInfoModel();
        Call<CustomerExtraInfoModel> call =recyclerDataInterface.getCustomerData(1);
        call.enqueue(new Callback<CustomerExtraInfoModel>() {
            @Override
            public void onResponse(Call<CustomerExtraInfoModel> call, Response<CustomerExtraInfoModel> response) {
                customerExtraInfoModel=response.body();
                Log.e("data",new Gson().toJson(response.body()));
            }

            @Override
            public void onFailure(Call<CustomerExtraInfoModel> call, Throwable t) {

            }
        });
        customerExtraInfoModel=new Gson().fromJson(jsonData,CustomerExtraInfoModel.class);
        Log.e("customerData",new Gson().toJson(customerExtraInfoModel)+" ");
        return customerExtraInfoModel.getData();
    }
}