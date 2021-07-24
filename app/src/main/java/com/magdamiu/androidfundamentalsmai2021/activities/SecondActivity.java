package com.magdamiu.androidfundamentalsmai2021.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.magdamiu.androidfundamentalsmai2021.R;

public class SecondActivity extends AppCompatActivity {
    private static final String SECOND_TAG = "SecondActivity";
    private static final String PERSON_NAME = "personName";
    private static final String TERMS_AND_COND = "terms";

    private TextView textViewMessage;
    private EditText editTextPersonName;
    private CheckBox checkBoxTermsAndConditions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.e(SECOND_TAG, "onCreate method was called");

        textViewMessage = findViewById(R.id.textViewMessageActivities);
        editTextPersonName = findViewById(R.id.editTextPersonName);
        checkBoxTermsAndConditions = findViewById(R.id.checkBoxTermsAndConditions);

        //processBundle();
    }

    private void processBundle() {
        Bundle bundle = getIntent().getExtras();
        if(bundle != null) {
            String messageReceived = bundle.getString(FirstActivity.MESSAGE);
            textViewMessage.setText(messageReceived);

            // process the message and send the result (dummy processing)
            messageReceived = getString(R.string.confirm_message);

            // send back the result to the FirstActivity
            Intent intent = new Intent();
            intent.putExtra(FirstActivity.MESSAGE, messageReceived);
            setResult(RESULT_OK, intent);

            // close the current activity (remove it from the stack)
            finish();
        }
    }

    // cache the filled data
    // @SuppressLint("MissingSuperCall")
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e(SECOND_TAG, "onSaveInstanceState method was called");

        //TODO check for null
        String personName = editTextPersonName.getText().toString();
        outState.putString(PERSON_NAME, personName);

        boolean isTermsAndCondChecked = checkBoxTermsAndConditions.isChecked();
        outState.putBoolean(TERMS_AND_COND, isTermsAndCondChecked);
    }

    // restore the cached data
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        //TODO check for null
        String personName = savedInstanceState.getString(PERSON_NAME);
        editTextPersonName.setText(personName);

        boolean isTermsAndCondChecked = savedInstanceState.getBoolean(TERMS_AND_COND);
        checkBoxTermsAndConditions.setChecked(isTermsAndCondChecked);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(SECOND_TAG, "onStart method was called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(SECOND_TAG, "onResume method was called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(SECOND_TAG, "onPause method was called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(SECOND_TAG, "onStop method was called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(SECOND_TAG, "onDestroy method was called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(SECOND_TAG, "onRestart method was called");
    }
}