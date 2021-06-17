package com.example.bindingdata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.bindingdata.databinding.ActivityMainBinding;
import com.example.bindingdata.pojo.StudentModel;
import com.example.bindingdata.recycler_view_example.RecyclerViewExample;
import com.example.bindingdata.user_details.UserDetailsActivity;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        activityMainBinding=DataBindingUtil.setContentView(this,R.layout.activity_main);
      // StudentModel studentModel=new StudentModel("rutuja soni","12"
      // ,"22","sonirutuja28@gmail.com");
       // activityMainBinding.studentName.setText(studentModel.getStudentName());
//activityMainBinding.setStudentInfo(studentModel);
       activityMainBinding.btn1.setOnClickListener(v -> {
    //Intent intent=new Intent;
       startActivity(new Intent(MainActivity.this, UserDetailsActivity.class));
       });
    }
}