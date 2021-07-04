package com.example.curs4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Challenge2Activity extends AppCompatActivity {
    private List<Student> students;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge2);

        RecyclerView recyclerViewStudents = findViewById(R.id.recycler_view_students);

        initStudents();

        //  set the layout manager
        recyclerViewStudents.setLayoutManager(new LinearLayoutManager(this));

        //  set the adapter
        recyclerViewStudents.setAdapter(new StudentAdapter(students));
    }

    private void initStudents() {
        students = new ArrayList<>();

        for (int i = 1; i < 14; i++) {
            students.add(new Student(i, "FirstName " + i, "LastName " + i));
        }
    }

    public void goToNextLayoutOnClick(View view) {
        Intent intentGoToNextLayout = new Intent(Challenge2Activity.this, Challenge3Activity.class);
        startActivity(intentGoToNextLayout);
    }
}
