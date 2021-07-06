package com.magdamiu.androidfundamentalsmai2021.activities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.magdamiu.androidfundamentalsmai2021.R;

import java.net.URI;

import static com.magdamiu.androidfundamentalsmai2021.R.string.use_device_with_sim;

public class FirstActivity extends AppCompatActivity {
    protected static final String MESSAGE = "message";
    protected static final int REQUEST_CODE_FIRST_ACTIVITY = 255;
    private static final String FIRST_TAG = "FirstActivity";


    private EditText editTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Log.e(FIRST_TAG, "onCreate method was called");

        editTextMessage = findViewById(R.id.editTextMessage);
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

    public void sendMessageOnClick(View view) {
        String message = editTextMessage.getText().toString();
        if (message.length() > 0) {
            Intent startSecondActivity = new Intent(FirstActivity.this, SecondActivity.class);
            startSecondActivity.putExtra(MESSAGE, message);
            startActivityForResult(startSecondActivity, REQUEST_CODE_FIRST_ACTIVITY);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE_FIRST_ACTIVITY && resultCode == RESULT_OK) {
            String messageReceivedAsResult = data.getStringExtra(MESSAGE);
            editTextMessage.setText(messageReceivedAsResult);
        }
    }

}