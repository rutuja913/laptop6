package com.example.bindingdata;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.DialogFragment;

import com.example.bindingdata.databinding.DatePickerBinding;

public class DatePickerExample extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {
   private DatePickerBinding datePickerBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        datePickerBinding = DataBindingUtil.setContentView(this, R.layout.date_picker);
        datePickerBinding.setCallBack(this);
    }
    public void onDatePicker()
    {
        //Once you've defined a DialogFragment like the one shown above, you can display
        // the time picker by creating an instance of the DialogFragment and calling show().
        // For example, here's a button that, when clicked, calls a method to show the dialog:
        //This method calls show() on a new instance of the DialogFragment defined above.
        // The show() method requires an instance of FragmentManager and a unique
        // tag name for the fragment.

        DialogFragment datePicker=new DatePickerFragment();
        datePicker.show(getSupportFragmentManager(),"date picker");
    }
    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
datePickerBinding.textView2.setText(" "+year+" "+month+" "+dayOfMonth);
    }
}
