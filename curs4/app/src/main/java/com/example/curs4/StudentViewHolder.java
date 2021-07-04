package com.example.curs4;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentViewHolder extends RecyclerView.ViewHolder {
    private final TextView textViewFirstName;
    private final TextView textViewLastName;
    private final View delimiterLine;
    private final View background;

    public StudentViewHolder(@NonNull View itemView) {
        super(itemView);

        textViewFirstName = itemView.findViewById(R.id.student_first_name);
        textViewLastName = itemView.findViewById(R.id.student_last_name);
        delimiterLine = itemView.findViewById(R.id.delimiter_line);
        background = itemView.findViewById(R.id.student_background);
    }

    public TextView getTextViewFirstName() {
        return textViewFirstName;
    }

    public TextView getTextViewLastName() {
        return textViewLastName;
    }


    public View getBackground() {
        return background;
    }

    public View getDelimiterLine() {
        return delimiterLine;
    }
}
