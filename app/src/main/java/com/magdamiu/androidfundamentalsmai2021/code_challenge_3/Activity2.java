package com.magdamiu.androidfundamentalsmai2021.code_challenge_3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.magdamiu.androidfundamentalsmai2021.R;
import com.magdamiu.androidfundamentalsmai2021.activities.FirstActivity;

public class Activity2 extends AppCompatActivity {

    private static final String MESSAGE_RECEIVED = "Message received";
    private TextView textViewMessageReceived, textViewMessage;
    private EditText editTextReply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        textViewMessageReceived = findViewById(R.id.textViewMessageReceived);
        textViewMessage = findViewById(R.id.textViewMessage);
        editTextReply = findViewById(R.id.editTextReply);

        processBundle();
    }

    private void processBundle() {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String messageReceived = bundle.getString(Activity1.MESSAGE);
            textViewMessageReceived.setText(MESSAGE_RECEIVED);
            textViewMessage.setText(messageReceived);
        }
    }

    public void sendReplyOnClick(View view) {
        String reply = editTextReply.getText().toString();
        if (!reply.isEmpty()) {
            Intent intentToStartActivity1 = new Intent(Activity2.this, Activity1.class);
            intentToStartActivity1.putExtra(Activity1.MESSAGE, reply);
            startActivityForResult(intentToStartActivity1, Activity1.REQUEST_CODE_ACTIVITY_1);
        } else {
            editTextReply.setError(getString(R.string.error_insert_reply));
        }
    }
}