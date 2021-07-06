package com.magdamiu.androidfundamentalsmai2021;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

// the class associated to the item of the recycler view
// each ui element from the item should have a dedicated field in this class
public class StudentViewHolder extends RecyclerView.ViewHolder {
    final private LinearLayout studentView;
    final private TextView textFirstName;
    final private TextView textLastName;

    public StudentViewHolder(@NonNull View itemView) {
        super(itemView);
        studentView = itemView.findViewById(R.id.student);
        textFirstName = itemView.findViewById(R.id.textFirstName);
        textLastName = itemView.findViewById(R.id.textLastName);
    }


    public TextView getTextFirstName() {
        return textFirstName;
    }

    public TextView getTextLastName() {
        return textLastName;
    }

    public LinearLayout getStudentView() {
        return studentView;
    }
}
