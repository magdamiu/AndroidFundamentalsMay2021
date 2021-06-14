package com.magdamiu.androidfundamentalsmai2021;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String tagError = "Tag Error";
    private static final String tagVerbose = "Tag Verbose";
    private static final String tagWarning = "Tag Warning";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayLogs();
    }

    private void displayLogs() {
        int a = 100;
        int b = 0;

        if (a > 99) {
            Log.v(tagVerbose, "a is greater than 99!");
        }
        if (b == 0) {
            Log.w(tagWarning, "b is equal with 0!");
        }
        try {
            int result = a / b;
        } catch (Exception ignored) {
            Log.e(tagError, "Divide by 0!");
        }
    }
}