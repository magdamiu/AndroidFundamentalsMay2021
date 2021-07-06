package com.magdamiu.androidfundamentalsmai2021.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.magdamiu.androidfundamentalsmai2021.R;

public class FirstActivity extends AppCompatActivity {
    private static final String FIRST_TAG = "FirstActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Log.e(FIRST_TAG, "onCreate method was called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(FIRST_TAG, "onStart method was called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(FIRST_TAG, "onResume method was called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(FIRST_TAG, "onPause method was called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(FIRST_TAG, "onStop method was called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(FIRST_TAG, "onDestroy method was called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(FIRST_TAG, "onRestart method was called");
    }

    public void startSecondActivityOnClick(View view) {
        Intent intentToStartSecondActivity = new Intent(FirstActivity.this, SecondActivity.class);
        startActivity(intentToStartSecondActivity);
    }
}