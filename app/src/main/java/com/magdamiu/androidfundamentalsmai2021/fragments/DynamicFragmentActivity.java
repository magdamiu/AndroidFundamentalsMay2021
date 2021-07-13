package com.magdamiu.androidfundamentalsmai2021.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import com.magdamiu.androidfundamentalsmai2021.R;

public class DynamicFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_fragment);

        // new instance of the fragment
        BlankFragment blankFragment = new BlankFragment();
        HandlingFragments.initFragment(this, R.id.framePlaceholder, blankFragment);
    }
}