package com.magdamiu.androidfundamentalsmai2021;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText emailLogin;
    private EditText phoneLogin;
    CheckBox checkBoxLogin;
    private Button buttonLogin;
    private TextView textLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logfile);
        initViews();
    }

    private void initViews() {
        emailLogin = findViewById(R.id.emailLogin);
        phoneLogin = findViewById(R.id.phoneLogin);
        checkBoxLogin = findViewById(R.id.checkboxLogin);
        buttonLogin = findViewById(R.id.buttonLogin);
        textLogin = findViewById(R.id.textLogin);
    }

    public void displaySubmitOnClick(View view) {
        textLogin.setText("");
        String email = emailLogin.getText().toString();
        String phone = phoneLogin.getText().toString();
        final String successSubmit = "Successfully submitted";
        if (email.length() > 0 && Patterns.EMAIL_ADDRESS.matcher(email).find()) {
            if (phone.length() == 10 && Patterns.PHONE.matcher(phone).find()) {
                if (checkBoxLogin.isChecked()) {

                    textLogin.setText(successSubmit);
                } else {
                    checkBoxLogin.setError(getString(R.string.error_check_t_and_c));
                    Toast.makeText(MainActivity.this, getString(R.string.error_check_t_and_c), Toast.LENGTH_LONG).show();
                }
            } else {
                phoneLogin.setError(getString(R.string.error_insert_phone));
                Toast.makeText(MainActivity.this, getString(R.string.error_insert_phone), Toast.LENGTH_LONG).show();
            }
        } else {
            emailLogin.setError(getString(R.string.error_insert_email));
            Toast.makeText(MainActivity.this, getString(R.string.error_insert_email), Toast.LENGTH_LONG).show();
        }
    }
}