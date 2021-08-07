package com.magdamiu.androidfundamentalsmai2021.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.magdamiu.androidfundamentalsmai2021.R;

public class InputFragment extends Fragment {
    private EditText editTextNumber1, editTextNumber2;
    private Button buttonSendData;

    public InputFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_input, container, false);

        initView(view);

        return view;
    }

    private void initView(View view) {
        editTextNumber1 = view.findViewById(R.id.editTextNumber1);
        editTextNumber2 = view.findViewById(R.id.editTextNumber2);
        buttonSendData = view.findViewById(R.id.buttonSendDataToActivity);
        buttonSendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendDataToActivity();
            }
        });
    }

    private void sendDataToActivity() {
        //TODO validate the content from EditTexts
        int number1 = Integer.parseInt(editTextNumber1.getText().toString());
        int number2 = Integer.parseInt(editTextNumber2.getText().toString());

        SumListener sumListener = (SumListener) getActivity();
        sumListener.computeSum(number1, number2);
    }
}

