package com.magdamiu.androidfundamentalsmai2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class ConstraintLayoutSampleActivity extends AppCompatActivity {

    private ImageView imageViewAvatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_layout_sample);

        imageViewAvatar = findViewById(R.id.imageViewAvatar);
        Picasso.get()
                .load("http://i.imgur.com/DvpvklR.png")
                .placeholder(R.drawable.robot)
                .error(R.drawable.robot)
                .into(imageViewAvatar);
        // Picasso.get().load("http://i.imgur.com/DvpvklR.png").into(imageViewAvatar);
    }
}