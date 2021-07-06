package com.magdamiu.androidfundamentalsmai2021.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.magdamiu.androidfundamentalsmai2021.R;

import java.net.URI;

import static com.magdamiu.androidfundamentalsmai2021.R.string.use_device_with_sim;

public class FirstActivity extends AppCompatActivity {
    protected static final String MESSAGE = "message";
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
        intentToStartSecondActivity.putExtra(MESSAGE, getString(R.string.hello_from_first_activity));
        startActivity(intentToStartSecondActivity);
    }

    public void callPhoneNumberOnClick(View view) {
        Intent callPhoneNumber = new Intent(Intent.ACTION_DIAL);
        callPhoneNumber.setData(Uri.parse("tel:0744444444"));

        if (callPhoneNumber.resolveActivity(getPackageManager()) != null) {
            startActivity(callPhoneNumber);
        } else {
            Toast.makeText(FirstActivity.this, use_device_with_sim, Toast.LENGTH_LONG).show();
        }
    }

    public void openURlInBrowserOnClick(View view) {
        Intent openURLInBrowser = new Intent(Intent.ACTION_VIEW);
        openURLInBrowser.setData(Uri.parse("http://www.twitter.com"));
        startActivity(openURLInBrowser);
    }
}