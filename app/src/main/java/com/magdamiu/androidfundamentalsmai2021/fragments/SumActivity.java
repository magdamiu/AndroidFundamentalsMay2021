package com.magdamiu.androidfundamentalsmai2021.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.magdamiu.androidfundamentalsmai2021.R;

public class SumActivity extends AppCompatActivity {
    protected static String FIRST_NUMBER = "first";
    protected static String SECOND_NUMBER = "second";

    private EditText editTextFirstNumber, editTextSecondNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum);

        initView();
    }

    private void initView() {
        editTextFirstNumber = findViewById(R.id.editTextFirstNumber);
        editTextSecondNumber = findViewById(R.id.editTextTextSecondNumber);
    }

    public void sendNumbersOnClick(View view) {
        int firstNumber = Integer.parseInt(editTextFirstNumber.getText().toString());
        int secondNumber = Integer.parseInt(editTextSecondNumber.getText().toString());

        // TODO check if the user inserted values
        Bundle bundle = new Bundle();
        bundle.putInt(FIRST_NUMBER, firstNumber);
        bundle.putInt(SECOND_NUMBER, secondNumber);

        ResultFragment resultFragment = new ResultFragment();
        resultFragment.setArguments(bundle);
        HandlingFragments.initFragment(SumActivity.this, R.id.framePlaceholderSum, resultFragment);
    }
}