package com.magdamiu.androidfundamentalsmai2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String ANDROID_URL = "https://developer.android.com/";

    private EditText editTextName;
    private EditText editTextEmail;
    private EditText editTextPhone;
    private Button buttonDisplayGreetings;
    private TextView textViewGreetings;

    private WebView webView;

    private Spinner spinnerAndroidVersions;
    private List<String> androidVersions;
    private ArrayAdapter<String> spinnerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /* setContentView(R.layout.activity_main);
        setContentView(R.layout.sample);
        setContentView(R.layout.code_challenge_c2);
        setContentView(R.layout.scrollview_sample);
        setContentView(R.layout.webview_sample);
        setContentView(R.layout.spinner_sample);
        setContentView(R.layout.code_challenge2_c3); */
        setContentView(R.layout.code_challenge1_c3);

        /* setAndroidVersions();
        initialiseSpinnerAdapter();
        setSpinnerAdapter();
        handlingSpinnerListener(); */

        // loadUrl();
        initViews();
        displayLogs();
    }

    // step 1: data source for our spinner
    private void setAndroidVersions() {
        androidVersions = new ArrayList<>();
        androidVersions.add("cupcake");
        androidVersions.add("eclair");
        androidVersions.add("pie");
        androidVersions.add("donut");
        androidVersions.add("kitkat");
    }


    // step 2: initialise adapter for our spinner
    // ArrayAdapter is a default adapter
    private void initialiseSpinnerAdapter() {
        spinnerAdapter = new ArrayAdapter<>(MainActivity.this,
                android.R.layout.simple_spinner_item,
                androidVersions);
    }

    // step 3: set the adapter to our spinner
    private void setSpinnerAdapter() {
        spinnerAndroidVersions = findViewById(R.id.spinnerAndroidVersions);
        spinnerAndroidVersions.setAdapter(spinnerAdapter);
    }

    private void handlingSpinnerListener() {
        spinnerAndroidVersions.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedAndroidVersion = androidVersions.get(i);
                Toast.makeText(MainActivity.this, selectedAndroidVersion, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }


    // webview load url
    private void loadUrl() {
        webView = findViewById(R.id.webViewSample);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(ANDROID_URL);
    }


    // init views for implementing a first simple form
    private void initViews() {
        editTextName = findViewById(R.id.editTextName);
        buttonDisplayGreetings = findViewById(R.id.buttonDisplayGreetings);
        textViewGreetings = findViewById(R.id.textViewGreetings);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPhone = findViewById(R.id.editTextPhone);
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

    // Course 3: Code Challenge 1
    public static boolean isValidEmail(CharSequence target) {
        return (!TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches());
    }

    public static boolean isValidPhone(CharSequence phone) {
        return (!TextUtils.isEmpty(phone) && Patterns.PHONE.matcher(phone).matches());
    }

    public void displaySubmitOnClick(View view) {
        String inputName = editTextEmail.getText().toString();
        if (!isValidEmail(inputName)) {
            editTextEmail.setError(getString(R.string.error_insert_email));
            Toast.makeText(MainActivity.this, getString(R.string.error_insert_email),
                    Toast.LENGTH_LONG).show();
        }
        inputName = editTextPhone.getText().toString();
        if (!isValidPhone(inputName)) {
            editTextPhone.setError(getString(R.string.error_insert_phone));
            Toast.makeText(MainActivity.this, getString(R.string.error_insert_phone),
                    Toast.LENGTH_LONG).show();
        }
    }
}