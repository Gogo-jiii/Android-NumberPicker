package com.example.numberpicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.widget.NumberPicker;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @SuppressLint({"SetTextI18n", "DefaultLocale"})
    @RequiresApi(api = Build.VERSION_CODES.Q)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NumberPicker numberPicker = findViewById(R.id.numberPicker);
        textView = findViewById(R.id.textView);

        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(100);
        numberPicker.setValue(10);
        numberPicker.setWrapSelectorWheel(false);

        numberPicker.setFormatter(value -> String.format("%03d", value));

        numberPicker.setTextColor(getColor(R.color.black));
        numberPicker.setTextSize(64.0f);

        numberPicker.setOnValueChangedListener((picker, oldVal, newVal) -> textView.setText("Result: " + newVal));

    }
}