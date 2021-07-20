package com.magdamiu.androidfundamentalsmai2021.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class HandlingFragments {

    public static void initFragment(AppCompatActivity activity, int placeholderId, Fragment fragment) {
        // new instance for fragment manager (this one is responsible with all the fragments)
        FragmentManager fragmentManager = activity.getSupportFragmentManager();

        // new instance of transaction responsible to trigger the replace operation
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // the placeholder is a FrameLayout
        fragmentTransaction.replace(placeholderId, fragment);

        // commit the transaction to persist the changes
        fragmentTransaction.commit();
    }
}
