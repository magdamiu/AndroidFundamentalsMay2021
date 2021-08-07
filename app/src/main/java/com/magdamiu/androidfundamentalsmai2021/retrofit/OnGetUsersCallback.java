package com.magdamiu.androidfundamentalsmai2021.retrofit;

import java.util.List;

public interface OnGetUsersCallback {

    void onSuccess(List<User> users);

    void onError();
}