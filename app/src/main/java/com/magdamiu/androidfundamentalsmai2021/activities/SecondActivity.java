package com.magdamiu.androidfundamentalsmai2021.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.magdamiu.androidfundamentalsmai2021.R;

public class SecondActivity extends AppCompatActivity {
    private static final String SECOND_TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.e(SECOND_TAG, "onCreate method was called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(SECOND_TAG, "onStart method was called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(SECOND_TAG, "onResume method was called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(SECOND_TAG, "onPause method was called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(SECOND_TAG, "onStop method was called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(SECOND_TAG, "onDestroy method was called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(SECOND_TAG, "onRestart method was called");
    }
}