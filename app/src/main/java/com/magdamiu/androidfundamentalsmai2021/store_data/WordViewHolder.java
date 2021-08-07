package com.magdamiu.androidfundamentalsmai2021.store_data;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.magdamiu.androidfundamentalsmai2021.R;

public class WordViewHolder extends RecyclerView.ViewHolder {
       private final TextView wordItemView;

       public WordViewHolder(View itemView) {
           super(itemView);
           wordItemView = itemView.findViewById(R.id.textView);
       }

    public TextView getWordItemView() {
        return wordItemView;
    }
}