package com.magdamiu.androidfundamentalsmai2021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class StudentActivity extends AppCompatActivity {

    private List<Student> students;

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private StudentAdapter studentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students);

        // data source for our RecyclerView
        populateListOfStudents();

        // init the UI elements
        initView();

        // set the linear layout manager to our recycler view
        setLayoutManager();

        // set the adapter to our recycler view
        setAdapter();
    }

    private void initView() {
        recyclerView = findViewById(R.id.recyclerViewStudents);
    }

    private void populateListOfStudents() {
        students = new ArrayList<>();
        int index;
        for (int i = 0; i < 20; i++) {
            index = i + 1;
            students.add(new Student(index, "FirstName " + index, "LastName " + index));
        }
    }

    private void setLayoutManager() {
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }

    private void setAdapter() {
        studentAdapter = new StudentAdapter(students);
        recyclerView.setAdapter(studentAdapter);
    }
}