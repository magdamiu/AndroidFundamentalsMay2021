package com.magdamiu.androidfundamentalsmai2021.code_challenge_4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.magdamiu.androidfundamentalsmai2021.R;
import com.magdamiu.androidfundamentalsmai2021.activities.FirstActivity;

import static com.magdamiu.androidfundamentalsmai2021.R.string.use_device_with_sim;

public class ImplicitActivity extends AppCompatActivity {

    private EditText editTextWebsite, editTextLocation, editTextShareText, editTextPhoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit);
        findViews();
    }

    private void findViews() {
        editTextWebsite = findViewById(R.id.editTextWebsite);
        editTextLocation = findViewById(R.id.editTextLocation);
        editTextShareText = findViewById(R.id.editTextShareText);
        editTextPhoneNumber = findViewById(R.id.editTextPhoneNumber);
    }

    public void openWebsiteOnClick(View view) {
        Intent openWebsite = new Intent(Intent.ACTION_VIEW);
        String urlOfWebsite = editTextWebsite.getText().toString();
        if (urlOfWebsite.isEmpty()) {
            editTextWebsite.setError(getString(R.string.error_insert_url));
        } else {
            openWebsite.setData(Uri.parse(urlOfWebsite));
            startActivity(openWebsite);
        }
    }

    public void openLocationOnClick(View view) {
        String location = editTextLocation.getText().toString();
        if (location.isEmpty()) {
            editTextLocation.setError(getString(R.string.error_insert_location));
        } else {
            Uri gmmIntentUri = Uri.parse("geo:37.7749,-122.4192?q=" + Uri.encode(location));
            Intent openLocation = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            openLocation.setPackage("com.google.android.apps.maps");
            startActivity(openLocation);
        }
    }

    @SuppressLint("QueryPermissionsNeeded")
    public void shareTextOnClick(View view) {
        String textToShare = editTextShareText.getText().toString();
        if (textToShare.isEmpty()) {
            editTextShareText.setError(getString(R.string.error_insert_text));
        } else {
            Intent shareText = new Intent(Intent.ACTION_SEND);
            shareText.setType("text/plain");
            shareText.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.share_subject));
            shareText.putExtra(android.content.Intent.EXTRA_TEXT, textToShare);
            if (shareText.resolveActivity(ImplicitActivity.this.getPackageManager()) != null) {
                startActivity(Intent.createChooser(shareText, getString(R.string.share_using)));
            } else {
                Toast.makeText(ImplicitActivity.this, "No app found on your phone which can perform this action", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @SuppressLint("QueryPermissionsNeeded")
    public void callPhoneNumberOnClick(View view) {
        String phoneNumber = editTextPhoneNumber.getText().toString();
        if (phoneNumber.length() != 10) {
            editTextPhoneNumber.setError(getString(R.string.error_insert_phone_number));
        } else {
            Intent callPhoneNumber = new Intent(Intent.ACTION_DIAL);
            callPhoneNumber.setData(Uri.fromParts("tel", phoneNumber.trim(), null));
            if (callPhoneNumber.resolveActivity(ImplicitActivity.this.getPackageManager()) != null) {
                startActivity(callPhoneNumber);
            } else {
                Toast.makeText(ImplicitActivity.this, use_device_with_sim, Toast.LENGTH_LONG).show();
            }
        }
    }
}