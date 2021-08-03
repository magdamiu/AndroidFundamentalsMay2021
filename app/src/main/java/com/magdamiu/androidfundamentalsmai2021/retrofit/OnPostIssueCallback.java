package com.magdamiu.androidfundamentalsmai2021.retrofit;

public interface OnPostIssueCallback {
    void onSuccess(Issue issue);
    void onError();
}