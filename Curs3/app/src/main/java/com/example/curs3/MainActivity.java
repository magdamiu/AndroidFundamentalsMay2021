package com.example.curs3;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText email;
    private EditText phone;
    private CheckBox terms;
    private Button submit;
    private TextView user_input;

    private Button next_layout_1_2;
    private Button next_layout_2_3;

    private Spinner androidVersions;
    private ArrayList<String> androidVersionsList;
    private ArrayAdapter<String> spinnerAdapter;

    protected void initSubmitButton() {
        submit.setOnClickListener(v -> {
            boolean isValidInput = true;

            String emailStr = email.getText().toString();
            String phoneStr = phone.getText().toString();

            if (emailStr.isEmpty() ||
                    !Patterns.EMAIL_ADDRESS.matcher(emailStr).matches()) {
                email.setError("Fill the input with a valid email address");
                isValidInput = false;
            }

            if (phoneStr.isEmpty() ||
                    !Patterns.PHONE.matcher(phoneStr).matches()) {
                phone.setError("Fill the input with a valid phone number");
                isValidInput = false;
            }

            if (!terms.isChecked()) {
                terms.setError("You must accept the terms and conditions");
                isValidInput = false;
            }

            String userInputStr = "email: " + emailStr +
                    ", phone: " + phoneStr +
                    ", terms agreed: " + terms.isChecked();
            user_input.setText(userInputStr);

            if (isValidInput) {
                setContentView(R.layout.code_challenge_2_1);

                next_layout_1_2 = findViewById(R.id.button_next_layout_1_2);

                initNextLayoutButton12();
            }
        });
    }

    protected void initNextLayoutButton12() {
        next_layout_1_2.setOnClickListener(v -> {
            setContentView(R.layout.code_challenge_2_2);

            next_layout_2_3 = findViewById(R.id.button_next_layout_2_3);

            initNextLayoutButton23();
        });
    }

    protected void initSpinner() {
        androidVersionsList = new ArrayList<>();
        androidVersionsList.add("Cupcake");
        androidVersionsList.add("Donut");
        androidVersionsList.add("Eclair");
        androidVersionsList.add("KitKat");
        androidVersionsList.add("Pie");

        androidVersions = findViewById(R.id.spinner_android_versions);
        spinnerAdapter = new ArrayAdapter<>(MainActivity.this,
                android.R.layout.simple_spinner_item,
                androidVersionsList);
        androidVersions.setAdapter(spinnerAdapter);

        androidVersions.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedVersion = androidVersionsList.get(position);

                Toast.makeText(MainActivity.this, "Selected: " + selectedVersion, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    protected void initNextLayoutButton23() {
        next_layout_2_3.setOnClickListener(v -> {
            setContentView(R.layout.code_challenge_2_3);

            initSpinner();
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.code_challenge_1);

        email = findViewById(R.id.edit_email);
        phone = findViewById(R.id.edit_phone);
        terms = findViewById(R.id.checkbox_terms);
        submit = findViewById(R.id.button_submit);
        user_input = findViewById(R.id.text_user_input);

        initSubmitButton();
    }
}