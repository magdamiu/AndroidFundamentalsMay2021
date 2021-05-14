package com.clipicimadalin.happybirthday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TAG, "A simple verbose log!");
        Log.e(TAG, "A simple error log!");
        Log.w(TAG, "A simple warning log!");
        Log.wtf(TAG, "A simple wtf log!");
    }
}