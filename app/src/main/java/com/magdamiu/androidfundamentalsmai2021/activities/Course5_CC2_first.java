package com.magdamiu.androidfundamentalsmai2021.activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.magdamiu.androidfundamentalsmai2021.R;

public class Course5_CC2_first extends AppCompatActivity {

    private static final String FIRST_TAG = "first_activity_tag";
    protected static final String MESSAGE = "message";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c5_cc2_activity_first);
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

    public void startSecondActivity1(View view) {
        Intent intentToStartSecondActivity = new Intent(view.getContext(), Course5_CC2_second.class);
        intentToStartSecondActivity.putExtra(MESSAGE, getString(R.string.hello_from_first_activity1));
        startActivity(intentToStartSecondActivity);
    }

    public void startSecondActivity2(View view) {
        Intent intentToStartSecondActivity = new Intent(view.getContext(), Course5_CC2_second.class);
        intentToStartSecondActivity.putExtra(MESSAGE, getString(R.string.hello_from_first_activity2));
        startActivity(intentToStartSecondActivity);
    }

    public void startSecondActivity3(View view) {
        Intent intentToStartSecondActivity = new Intent(view.getContext(), Course5_CC2_second.class);
        intentToStartSecondActivity.putExtra(MESSAGE, getString(R.string.hello_from_first_activity3));
        startActivity(intentToStartSecondActivity);
    }

    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
