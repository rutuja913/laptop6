package com.example.bindingdata.user_details;

import com.example.bindingdata.pojo.CustomerInfoModel;

import java.util.ArrayList;

public interface UserDetailsContract {
    interface UserDetailsView
    {
        void showUserList(ArrayList<CustomerInfoModel> userList);
        void showToast(String message);
        public void onGetListBtnClicked();
    }
    interface UserDetailsBackend{
        void getUserList(long pageNumber);
    }
}
