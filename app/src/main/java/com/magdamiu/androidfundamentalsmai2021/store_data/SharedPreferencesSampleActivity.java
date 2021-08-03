package com.magdamiu.androidfundamentalsmai2021.store_data;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.magdamiu.androidfundamentalsmai2021.R;

public class SharedPreferencesSampleActivity extends AppCompatActivity {
    private static final String VALUE_KEY = "key";

    private EditText editTextValue;
    private TextView textViewDisplayValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences_sample);

        editTextValue = findViewById(R.id.editTextSharedPreferences);
        textViewDisplayValue = findViewById(R.id.textViewDisplaySavedData);

    }

    public void saveDataOnClick(View view) {
        //TODO check for null
        String text = editTextValue.getText().toString();
        ApplicationData.setStringValueInSharedPreferences(SharedPreferencesSampleActivity.this, VALUE_KEY, text);

    }

    public void getDataOnClick(View view) {
        String value = ApplicationData.getStringValueFromSharedPreferences(SharedPreferencesSampleActivity.this, VALUE_KEY);
        textViewDisplayValue.setText(value);
    }
}