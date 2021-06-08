package com.magdamiu.androidfundamentalsmai2021;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayLogs();
    }

    private void displayLogs() {
        Log.e("tag-error", "My first error log");
        Log.v("tag-verbose", "My first verbose log");
        Log.w("tag-warning", "My first warning log");
    }

}