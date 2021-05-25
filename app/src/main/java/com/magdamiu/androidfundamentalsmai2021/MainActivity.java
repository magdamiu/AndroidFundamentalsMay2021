package com.magdamiu.androidfundamentalsmai2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String ANDROID_URL = "https://developer.android.com/";

    private EditText editTextName;
    private Button buttonDisplayGreetings;
    private TextView textViewGreetings;

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*setContentView(R.layout.activity_main);*/
        /*setContentView(R.layout.sample);*/
        // setContentView(R.layout.scrollview_sample);
        setContentView(R.layout.webview_sample);

        loadUrl();

        // initViews();
        displayLogs();
    }

    private void loadUrl() {
        webView = findViewById(R.id.webViewSample);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(ANDROID_URL);
    }

    private void initViews() {
        editTextName = findViewById(R.id.editTextName);
        buttonDisplayGreetings = findViewById(R.id.buttonDisplayGreetings);
        textViewGreetings = findViewById(R.id.textViewGreetings);
    }

    private void displayLogs() {
        Log.e("tag-error", "my first error log");
        Log.v("tag-verbose", "my first verbose log");
        Log.w("tag-warning", "my first warning log");
    }

    private void clickOnDisplayGreetingsButton() {
        buttonDisplayGreetings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    public void displayGreetingsOnClick(View view) {
        textViewGreetings.setText("");
        String inputName = editTextName.getText().toString();
        if (inputName.length() > 0) {
            textViewGreetings.setText(inputName);
        } else {
            editTextName.setError(getString(R.string.error_insert_name));
            Toast.makeText(MainActivity.this, getString(R.string.error_insert_name), Toast.LENGTH_LONG).show();
        }
    }
}