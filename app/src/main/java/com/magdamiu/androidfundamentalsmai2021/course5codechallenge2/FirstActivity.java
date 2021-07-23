package com.magdamiu.androidfundamentalsmai2021.course5codechallenge2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.magdamiu.androidfundamentalsmai2021.R;

public class FirstActivity extends AppCompatActivity {

    protected static final String PASSAGE = "passage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_code_challenge);
    }

    public void startSecondActivityWithTextOneOnClick(View view) {
        Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
        intent.putExtra(PASSAGE, getString(R.string.first_text));
        startActivity(intent);
    }

    public void startSecondActivityWithTextTwoOnClick(View view) {
        Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
        intent.putExtra(PASSAGE, getString(R.string.second_text));
        startActivity(intent);
    }

    public void startSecondActivityWithTextThreeOnClick(View view) {
        Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
        intent.putExtra(PASSAGE, getString(R.string.third_text));
        startActivity(intent);
    }
}