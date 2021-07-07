package com.magdamiu.androidfundamentalsmai2021;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Student extends RecyclerView.ViewHolder {

    String name, surname;
    public Student(@NonNull View itemView) {
        super(itemView);
    }
    public Student(@NonNull View itemView, String name, String surname) {
        super(itemView);
        this.name = name;
        this.surname = surname;
    }
}
