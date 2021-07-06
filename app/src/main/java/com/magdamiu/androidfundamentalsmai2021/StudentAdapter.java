package com.magdamiu.androidfundamentalsmai2021;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentViewHolder> {
    private final List<Student> students;

    public StudentAdapter(List<Student> students) {
        this.students = students;
    }

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
        if (position % 2  == 1){
            holder.getStudentView().setBackgroundColor(Color.argb(125, 204, 204, 204));
        }
        holder.getTextFirstName().setText(currentStudent.getFirstName());
        holder.getTextLastName().setText(currentStudent.getLastName());
    }

    // decides how many items(total number) to create in our recycler view
    @Override
    public int getItemCount() {
        return students.size();
    }
}
