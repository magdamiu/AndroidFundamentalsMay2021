package com.magdamiu.androidfundamentalsmai2021;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class EmailAdapter extends RecyclerView.Adapter<EmailViewHolder> {
    private List<Mail> emails;

    public EmailAdapter(List<Mail> emails) {
        this.emails = emails;
    }

    // creates the item view, only the UI elements (it's like a template)
    @NonNull
    @Override
    public EmailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.email_item, parent, false);
        return new EmailViewHolder(itemView);
    }

    // fills the item with the corresponding element from the list (data source)
    @Override
    public void onBindViewHolder(@NonNull EmailViewHolder holder, int position) {
        Mail currentMail = emails.get(position);
        holder.getTextViewSender().setText(currentMail.getSenderName());
        holder.getTextViewSubject().setText(currentMail.getSubject());
    }

    // decides how many items to create in our recycler view
    @Override
    public int getItemCount() {
        return emails.size();
    }
}
