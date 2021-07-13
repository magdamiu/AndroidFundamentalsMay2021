package com.magdamiu.androidfundamentalsmai2021.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.magdamiu.androidfundamentalsmai2021.R;

public class DynamicFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_fragment);

        // new instance of the fragment
        BlankFragment blankFragment = new BlankFragment();
        initFragment(blankFragment);
    }

    private void initFragment(Fragment fragment) {
        // new instance for fragment manager (this one is responsible with all the fragments)
        FragmentManager fragmentManager = getSupportFragmentManager();

        // new instance of transaction responsible to trigger the replace operation
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // the placeholder is a FrameLayout
        fragmentTransaction.replace(R.id.framePlaceholder, fragment);

        // commit the transaction to persist the changes
        fragmentTransaction.commit();
    }
}