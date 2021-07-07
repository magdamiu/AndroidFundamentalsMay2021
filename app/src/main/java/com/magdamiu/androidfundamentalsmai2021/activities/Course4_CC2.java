package com.magdamiu.androidfundamentalsmai2021.activities;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.magdamiu.androidfundamentalsmai2021.R;
import com.magdamiu.androidfundamentalsmai2021.Student;
import com.magdamiu.androidfundamentalsmai2021.StudentAdapter;

import java.util.List;

public class Course4_CC2 extends AppCompatActivity {
    private List<Student> students;
    private RecyclerView recyclerViewStudents;
    private RecyclerView.LayoutManager layoutManager;
    private StudentAdapter studentAdapter;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.course4_cc2);
        populateListOfStudents();

        // init the ui elements
        initView();

        // set the linear layout manager to our recycler view
        setLayoutManager();

        // set the adapter to our recycler view
        setAdapter();
    }

    private void populateListOfStudents() {
        for (int i = 1; i <= 20; i++) {
           students.add(new Student(recyclerViewStudents,
                   "FirstName " + i,
                   "LastName " + i));
        }
    }

    private void setAdapter() {
        studentAdapter = new StudentAdapter(students);
    }

    private void setLayoutManager() {
        layoutManager = new LinearLayoutManager(this);
        recyclerViewStudents.setLayoutManager(layoutManager);
    }

    private void initView() {
        recyclerViewStudents = findViewById(R.id.recyclerViewStudents);
    }


}


