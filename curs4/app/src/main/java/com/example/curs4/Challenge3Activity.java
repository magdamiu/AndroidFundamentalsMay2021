package com.example.curs4;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.QuickContactBadge;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class Challenge3Activity extends AppCompatActivity {
    private ImageView imageViewTop;
    private ImageView imageViewLeft;
    private RatingBar star;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge3);

        imageViewTop = findViewById(R.id.image_top);
        imageViewLeft = findViewById(R.id.image_left);
        star = findViewById(R.id.star);

        //loadImages();
    }

    protected void loadImages() {
        Picasso.get()
                .load("https://drive.google.com/file/d/1x9xjiibbr85CUdVzAVrE3KwYQdb7_T25/view?usp=sharing")
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.placeholder)
                .resize(150, 150)
                .centerCrop()
                .into(imageViewTop);

        Picasso.get()
                .load("https://drive.google.com/file/d/1ryWDeRdDWXJuy9lrdEdvJUjHci3RxTjN/view?usp=sharing")
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.placeholder)
                .resize(50, 50)
                .centerCrop()
                .into(imageViewLeft);
    }
}
