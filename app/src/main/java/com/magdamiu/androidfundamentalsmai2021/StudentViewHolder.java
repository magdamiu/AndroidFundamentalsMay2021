package com.magdamiu.androidfundamentalsmai2021;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

// the class associated to the item of the recycler view
// each ui element from the item should have a dedicated field in this class
public class StudentViewHolder extends RecyclerView.ViewHolder {
    final private TextView textViewName;
    final private TextView textViewSurname;

    public StudentViewHolder(@NonNull View itemView) {
        super(itemView);

        textViewName= itemView.findViewById(R.id.textViewSender);
        textViewSurname = itemView.findViewById(R.id.textViewSubject);
    }

    public TextView getTextViewName() {
        return textViewName;
    }

    public TextView getTextViewSurname() {
        return textViewSurname;
    }
}
