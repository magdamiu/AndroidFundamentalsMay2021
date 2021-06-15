package com.magdamiu.androidfundamentalsmai2021;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner spinnerAndroidVersions;
    private List<String> androidVersions;
    private ArrayAdapter<String> spinnerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.course3_codechallenge2_scrollview);
        setContentView(R.layout.course3_codechallenge2_framelayout);
        //setContentView(R.layout.course3_codechallenge2_spinner);

        //setAndroidVersions();
        //initialiseSpinnerAdapter();
        //setSpinnerAdapter();
        //handlingSpinnerListener();
    }

    // step 1: data source for our spinner
    private void setAndroidVersions() {
        androidVersions = new ArrayList<>();
        androidVersions.add("Cupcake");
        androidVersions.add("Donut");
        androidVersions.add("Eclair");
        androidVersions.add("Kitkat");
        androidVersions.add("Pie");
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
                String selectedAndroidVersion = "Selected: " + androidVersions.get(i);
                Toast.makeText(MainActivity.this, selectedAndroidVersion, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}