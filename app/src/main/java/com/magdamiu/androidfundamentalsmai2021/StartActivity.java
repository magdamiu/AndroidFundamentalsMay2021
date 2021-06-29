package com.magdamiu.androidfundamentalsmai2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void startMainActivityOnClick(View view) {
        // starts from the current activity, and moves the user to the MainActivity screen
        Intent intentToStartMainActivity = new Intent(StartActivity.this, MainActivity.class);
        startActivity(intentToStartMainActivity);
    }

    public void startRecyclerViewActivityOnClick(View view) {
        // starts from the current activity, and moves the user to the EmailsActivity screen
        Intent intentToStartEmailsActivity = new Intent(StartActivity.this, EmailsActivity.class);
        startActivity(intentToStartEmailsActivity);
    }
}