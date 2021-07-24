package com.magdamiu.androidfundamentalsmai2021.code_challenge_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.magdamiu.androidfundamentalsmai2021.R;

public class Activity1 extends AppCompatActivity {

    protected static final String MESSAGE = "Message";
    protected static final int REQUEST_CODE_ACTIVITY_1 = 1;
    private TextView textViewReplyReceived, textViewReply;
    private EditText editTextMessage;
    private static final String REPLY_RECEIVED = "Reply received";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        textViewReplyReceived = findViewById(R.id.textViewReplyReceived);
        textViewReply = findViewById(R.id.textViewMessageActivities);
        editTextMessage = findViewById(R.id.editTextMessage);

        processBundle();
    }

    private void processBundle() {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String reply = bundle.getString(Activity1.MESSAGE);
            textViewReplyReceived.setText(REPLY_RECEIVED);
            textViewReply.setText(reply);
        }
    }

    public void sendMessageOnClick(View view) {
        String message = editTextMessage.getText().toString();
        if (!message.isEmpty()) {
            Intent intentToStartActivity2 = new Intent(Activity1.this, Activity2.class);
            intentToStartActivity2.putExtra(MESSAGE, message);
            startActivityForResult(intentToStartActivity2, REQUEST_CODE_ACTIVITY_1);
        } else {
            editTextMessage.setError(getString(R.string.error_insert_message));
        }
    }
}