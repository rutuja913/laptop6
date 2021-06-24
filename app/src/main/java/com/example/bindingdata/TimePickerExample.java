package com.example.bindingdata;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.DialogFragment;

import com.example.bindingdata.databinding.TimePickerBinding;

public class TimePickerExample extends AppCompatActivity implements TimePickerDialog.OnTimeSetListener {
    private TimePickerBinding timePickerBinding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        timePickerBinding = DataBindingUtil.setContentView(this, R.layout.time_picker);
timePickerBinding.setCallBack(this);
    }
    public void onTimePicker()
    {
        //Once you've defined a DialogFragment like the one shown above, you can display
        // the time picker by creating an instance of the DialogFragment and calling show().
       // For example, here's a button that, when clicked, calls a method to show the dialog:
        //This method calls show() on a new instance of the DialogFragment defined above.
        // The show() method requires an instance of FragmentManager and a unique
        // tag name for the fragment.

        DialogFragment timePicker=new TimePickerFragment();
        timePicker.show(getSupportFragmentManager(),"time picker");
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        // Do something with the time chosen by the user
        //Implement the TimePickerDialog.OnTimeSetListener interface to receive a callback when the
        // user sets the time.
      timePickerBinding.textView.setText("Hour: "+hourOfDay+"Minute:"+minute);
    }
}
