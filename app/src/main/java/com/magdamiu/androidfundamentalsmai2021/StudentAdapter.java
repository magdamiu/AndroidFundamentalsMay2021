package com.magdamiu.androidfundamentalsmai2021;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<Student> {
    List<Student> students;
    public StudentAdapter(List<Student> students) {
        this.students = students;
    }

    @NonNull

    @Override
    public Student onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_item, parent, false);
        return new Student(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull Student holder, int position) {

    }

    @Override
    public int getItemCount() {
        return students.size();
    }
}
