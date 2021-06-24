package com.example.bindingdata;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;
//To display a TimePickerDialog using DialogFragment, you need to define
// a fragment class that extends
// DialogFragment and return a TimePickerDialog from the fragment's
// onCreateDialog() method.
public class TimePickerFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        //// Use the current time as the default values for the picker
        //Define the onCreateDialog() method to return an instance of TimePickerDialog
        Calendar c= Calendar.getInstance();
        int hour=c.get(Calendar.HOUR_OF_DAY);
        int minute=c.get(Calendar.MINUTE);
        // Create a new instance of TimePickerDialog and return it
        return new TimePickerDialog(getActivity(),(TimePickerDialog.OnTimeSetListener)getActivity(),hour,
                minute,android.text.format.DateFormat.is24HourFormat(getActivity()));
    }
}
