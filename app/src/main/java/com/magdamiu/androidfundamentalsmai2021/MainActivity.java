package com.magdamiu.androidfundamentalsmai2021;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName;
    private Button buttonDisplayGreetings;
    private TextView textViewGreetings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*setContentView(R.layout.activity_main);*/
        setContentView(R.layout.sample);

        initViews();
        displayLogs();
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
        buttonDisplayGreetings.setOnClickListener(view -> {

        });
    }

    public void displayGreetingsOnClick(View view) {
        textViewGreetings.setText("");
        String inputName = editTextName.getText().toString();
        if (inputName.length() > 0) {
            textViewGreetings.setText(inputName);
        } else {
            editTextName.setError(getString(R.string.error_insert_name));
        }
    }
}