package com.magdamiu.androidfundamentalsmai2021;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

// the class associated to the item of the recycler view
// each UI element from the item should have a dedicated field in this class
public class EmailViewHolder extends RecyclerView.ViewHolder {
    final private TextView textViewSender;
    final private TextView textViewSubject;

    public EmailViewHolder(@NonNull View itemView) {
        super(itemView);

        textViewSender = itemView.findViewById(R.id.textViewSender);
        textViewSubject = itemView.findViewById(R.id.textViewSubject);
    }

    public TextView getTextViewSender() {
        return textViewSender;
    }

    public TextView getTextViewSubject() {
        return textViewSubject;
    }
}
