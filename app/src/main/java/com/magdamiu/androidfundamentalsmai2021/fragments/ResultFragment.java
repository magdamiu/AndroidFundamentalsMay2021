package com.magdamiu.androidfundamentalsmai2021.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.magdamiu.androidfundamentalsmai2021.R;

public class ResultFragment extends Fragment {

    private int number1;
    private int number2;
    private TextView textViewResult;

    public ResultFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            number1 = getArguments().getInt(SumActivity.FIRST_NUMBER);
            number2 = getArguments().getInt(SumActivity.SECOND_NUMBER);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_result, container, false);
        textViewResult = view.findViewById(R.id.textViewResult);

        displayResult();
        return view;
    }

    private void displayResult() {
        // TODO validate number1 and number2
        int sum = number1 + number2;
        textViewResult.setText(String.valueOf(sum));
    }

    public void setNumbers(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
}