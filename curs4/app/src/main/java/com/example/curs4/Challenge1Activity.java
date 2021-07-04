package com.example.curs4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Challenge1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge1);
    }

    public void goToNextLayoutOnClick(View view) {
        Intent intentGoToNextLayout = new Intent(Challenge1Activity.this, Challenge2Activity.class);
        startActivity(intentGoToNextLayout);
    }
}