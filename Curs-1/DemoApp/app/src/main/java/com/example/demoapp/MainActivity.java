package com.example.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "DemoApp";

    private static final String NOT_A_NUMBER = "not a number";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            Integer.parseInt(NOT_A_NUMBER);
        } catch (NumberFormatException e) {
            Log.e(TAG, e.getMessage());
        }

    }

}