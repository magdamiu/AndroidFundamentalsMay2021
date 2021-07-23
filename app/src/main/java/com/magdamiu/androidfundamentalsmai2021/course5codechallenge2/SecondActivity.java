package com.magdamiu.androidfundamentalsmai2021.course5codechallenge2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.magdamiu.androidfundamentalsmai2021.R;

public class SecondActivity extends AppCompatActivity {

    private TextView textViewPassages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_code_challenge);

        textViewPassages = findViewById(R.id.textViewPassages);
        getExtrasFromBundle();
    }

    private void getExtrasFromBundle() {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String passageReceived = bundle.getString(FirstActivity.PASSAGE);
            textViewPassages.setText(passageReceived);
        }
    }
}