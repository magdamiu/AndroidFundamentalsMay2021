package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "onCreate");

        int sum = 0;
        for ( int i = 0; i < 10; i++ ) {
            try {
                sum += 100 / (i % 2);
            } catch (Exception e) {
                Log.e(TAG, "division by 0, i = " + i);
            }
        }

        Log.i(TAG, "sum is " + sum);
    }
}