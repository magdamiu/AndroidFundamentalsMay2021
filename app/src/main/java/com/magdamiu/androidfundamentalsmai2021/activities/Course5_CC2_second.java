package com.magdamiu.androidfundamentalsmai2021.activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.magdamiu.androidfundamentalsmai2021.R;

public class Course5_CC2_second extends AppCompatActivity {
    private static final String SECOND_TAG = "SecondActivity";

    private TextView textViewMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c5_cc2_activity_second);
        Log.e(SECOND_TAG, "onCreate method was called");

        textViewMessage = findViewById(R.id.textViewMessage1);

        processBundle();
    }

//    protected void onSaveInstanceState(@NonNull Bundle outState) {
//        super.onSaveInstanceState(outState);
//    }
    private void processBundle() {
        Bundle bundle = getIntent().getExtras();
        if(bundle != null) {
            String messageReceived = bundle.getString(Course5_CC2_first.MESSAGE);
            textViewMessage.setText(messageReceived);
        }
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
