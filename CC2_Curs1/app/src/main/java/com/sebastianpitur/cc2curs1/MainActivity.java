package com.sebastianpitur.cc2curs1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            String null_ = null;
            System.out.println(null_.toString());
        } catch (Exception exp) {
            Log.e("Error", exp.toString());
        }
    }
}