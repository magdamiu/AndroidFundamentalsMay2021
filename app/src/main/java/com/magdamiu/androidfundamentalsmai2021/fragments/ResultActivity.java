package com.magdamiu.androidfundamentalsmai2021.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.magdamiu.androidfundamentalsmai2021.R;

public class ResultActivity extends AppCompatActivity implements SumListener {

    private TextView textViewSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        textViewSum = findViewById(R.id.textViewSum);

        initFragment();
    }

    private void initFragment() {
        HandlingFragments.initFragment(ResultActivity.this, R.id.frameLayout, new InputFragment());
    }

    @Override
    public void computeSum(int number1, int number2) {
        int sum = number1 + number2;
        displayResult(sum);
    }

    private void displayResult(int sum) {
        textViewSum.setText(String.valueOf(sum));
    }
}