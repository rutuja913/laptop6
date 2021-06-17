package com.example.bindingdata;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.bindingdata.databinding.PractiseBinding;

public class PractiseView extends AppCompatActivity {
  private PractiseBinding practiseBinding;
  private String userInputText = "";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        practiseBinding= DataBindingUtil.setContentView(this,R.layout.practise);
        practiseBinding.imageView.setVisibility(View.GONE);
        practiseBinding.nextScreenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userInputText=practiseBinding.inputFieldET.getText().toString();

                if(userInputText!=null&&!TextUtils.isEmpty(userInputText))
                {
                    Log.e("enteredText",userInputText);
                    Intent moveForward=new Intent(PractiseView.this,MainActivity.class);
                    moveForward.putExtra(AppConstants.USER_INPUT_DATA,userInputText);
                    //moveForward.putExtra("number",45324);
                    startActivity(moveForward);
                }
            }
        });

    }
}
