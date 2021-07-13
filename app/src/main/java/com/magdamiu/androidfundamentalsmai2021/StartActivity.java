package com.magdamiu.androidfundamentalsmai2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.magdamiu.androidfundamentalsmai2021.activities.FirstActivity;
import com.magdamiu.androidfundamentalsmai2021.fragments.DynamicFragmentActivity;
import com.magdamiu.androidfundamentalsmai2021.fragments.ResultActivity;
import com.magdamiu.androidfundamentalsmai2021.fragments.StaticFragmentActivity;
import com.magdamiu.androidfundamentalsmai2021.fragments.SumActivity;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        // debugSample();
    }

    // just to learn how to debug the code with breakpoints
    private void debugSample() {
        int a = 8, b = 0, c = 4;
        int sum = a + b;
        int diff = a - c;
        int div1 = a / c;
        int div2 = a / b;
    }

    public void startMainActivityOnClick(View view) {
        // starts from the current activity, and moves the user to the MainActivity screen
        Intent intentToStartMainActivity = new Intent(StartActivity.this, MainActivity.class);
        startActivity(intentToStartMainActivity);
    }

    public void startRecyclerViewActivityOnClick(View view) {
        // starts from the current activity, and moves the user to the EmailsActivity screen
        Intent intentToStartEmailsActivity = new Intent(StartActivity.this, EmailsActivity.class);
        startActivity(intentToStartEmailsActivity);
    }

    public void startConstraintActivityOnClick(View view) {
        Intent intentToStartConstraintActivity = new Intent(StartActivity.this, ConstraintLayoutSampleActivity.class);
        startActivity(intentToStartConstraintActivity);
    }

    public void startFirstActivityOnClick(View view) {
        Intent intentToStartFirstActivity = new Intent(StartActivity.this, FirstActivity.class);
        startActivity(intentToStartFirstActivity);
    }

    public void startStaticFragmentOnClick(View view) {
        Intent intentToStartStaticFragmentActivity = new Intent(StartActivity.this, StaticFragmentActivity.class);
        startActivity(intentToStartStaticFragmentActivity);
    }

    public void startDynamicFragmentOnClick(View view) {
        Intent intentToStartDynamicFragmentActivity = new Intent(StartActivity.this, DynamicFragmentActivity.class);
        startActivity(intentToStartDynamicFragmentActivity);
    }

    public void startBundleCommFragmentOnClick(View view) {
        Intent intentToStartSumActivity = new Intent(StartActivity.this, SumActivity.class);
        startActivity(intentToStartSumActivity);
    }

    public void startListenerCommFragmentOnClick(View view) {
        Intent intentToStartResultActivity = new Intent(StartActivity.this, ResultActivity.class);
        startActivity(intentToStartResultActivity);
    }
}