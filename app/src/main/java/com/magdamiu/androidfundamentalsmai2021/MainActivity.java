package com.magdamiu.androidfundamentalsmai2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
<<<<<<< HEAD
=======
import java.util.regex.Pattern;
>>>>>>> curs3_cc1

public class MainActivity extends AppCompatActivity {
    private static final String ANDROID_URL = "https://developer.android.com/";

    private EditText phone;
    private EditText email;
    private EditText editTextName;
    private Button buttonDisplayGreetings;
    private TextView textViewGreetings;
<<<<<<< HEAD

    private WebView webView;

    private Spinner spinnerAndroidVersions;
    private List<String> androidVersions;
    private ArrayAdapter<String> spinnerAdapter;

=======
    private WebView webView;
    private Spinner spinnerAndroidVersions;
    private List<String> androidVersions;
    private ArrayAdapter<String> spinnerAdapter;
>>>>>>> curs3_cc1
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*setContentView(R.layout.activity_main);*/
<<<<<<< HEAD
        /*setContentView(R.layout.sample);*/
        // setContentView(R.layout.scrollview_sample);
        // setContentView(R.layout.webview_sample);
        setContentView(R.layout.week3_code_challenge_2);

    /*    setAndroidVersions();
        initialiseSpinnerAdapter();
        setSpinnerAdapter();
        handlingSpinnerListener();*/

        //loadUrl();

        // initViews();
=======
//        setContentView(R.layout.web_view_sample);
//        load_url();
        setContentView(R.layout.spinner_sample);
        setAndroidVersions();
//        initViews();
        initializeSpinnerAdapter();
        setSpinnerAdapter();
>>>>>>> curs3_cc1
        displayLogs();
    }
    // step 1:  data source for our spinner
    private void setAndroidVersions() {
        androidVersions = new ArrayList<>();
        androidVersions.add("cupcake");
        androidVersions.add("eclair");
        androidVersions.add("donut");
        androidVersions.add("pie");
    }

    private void initializeSpinnerAdapter() {
        spinnerAdapter = new ArrayAdapter<>(MainActivity.this,
                android.R.layout.simple_spinner_item,
                androidVersions);
    }

    private void setSpinnerAdapter() {
        spinnerAndroidVersions = findViewById(R.id.spinnerAndroidVersions);
        spinnerAndroidVersions.setAdapter(spinnerAdapter);
    }

    private void handlingSpinnerListener() {
        spinnerAndroidVersions.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                String selectedAndroidVersion = androidVersions.get(i);
                Toast.makeText(MainActivity.this, selectedAndroidVersion, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void load_url() {
        webView = findViewById(R.id.webViewSample);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(getString(R.string.ANDROID_URL));
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

    boolean isPhoneNumber(String phoneNumber) {
        return Patterns.PHONE.matcher(phoneNumber).matches();
    }

    boolean isEmail(String email) {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    public void submitInformation(View view) {

        phone = findViewById(R.id.phone);
        email = findViewById(R.id.email);
        if (!isPhoneNumber(phone.toString())) {
            Toast.makeText(MainActivity.this, getString(R.string.wrong_phone_pattern), Toast.LENGTH_LONG).show();
            return;
        }

        if (!isEmail(email.toString())) {
            Toast.makeText(MainActivity.this, getString(R.string.wrong_email_pattern), Toast.LENGTH_LONG).show();
        }
    }
}