package com.magdamiu.androidfundamentalsmai2021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class EmailsActivity extends AppCompatActivity {

    private List<Mail> emails;

    private RecyclerView recyclerViewEmails;
    private RecyclerView.LayoutManager layoutManager;
    private EmailAdapter emailAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emails);

        // data source for our RecyclerView
        populateListOfEmails();

        // init the ui elements
        initView();

        // set the linear layout manager to our recycler view
        setLayoutManager();

        // set the adapter to our recycler view
        setAdapter();
    }

    private void initView() {
        recyclerViewEmails = findViewById(R.id.recyclerViewEmails);
    }

    private void populateListOfEmails() {
        emails = new ArrayList<>();
        Mail newEmail = new Mail(1, "Magda", "Curs Android");
        emails.add(newEmail);
        int index;
        for (int i = 1; i < 20; i++) {
            index = i + 1;
            newEmail = new Mail(index, "Sender " + index, "Subject " + index);
            emails.add(newEmail);
        }
    }

    private void setLayoutManager() {
        layoutManager = new LinearLayoutManager(this);
        recyclerViewEmails.setLayoutManager(layoutManager);
    }

    private void setAdapter() {
        emailAdapter = new EmailAdapter(emails);
        recyclerViewEmails.setAdapter(emailAdapter);
    }
}