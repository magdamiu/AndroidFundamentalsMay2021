package com.magdamiu.androidfundamentalsmai2021;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentViewHolder> {
    private List<Student> students;

    public StudentAdapter(List<Student> students) {
        this.students = students;
    }

    // creates the item view, only the ui elements (it's like a template)
    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_item, parent, false);
        return new StudentViewHolder(itemView);
    }

    // fills the item with the corresponding element from the list (data source)
    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        Student currentStudent = students.get(position);
        holder.getTextViewName().setText(currentStudent.getName());
        holder.getTextViewSurname().setText(currentStudent.getSurname());
    }

    // decides how many items(total number) to create in our recycler view
    @Override
    public int getItemCount() {
        return students.size();
    }
}
