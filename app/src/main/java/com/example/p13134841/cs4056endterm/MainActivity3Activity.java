package com.example.p13134841.cs4056endterm;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity3Activity extends AppCompatActivity {

    ArrayList<String> names;
    ArrayAdapter<String> namesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity3);

        setup();
    }

    private void setup() {
        names = new ArrayList<>();
        names.add("DEAL 1");
        names.add("DEAL 2");
        names.add("DEAL 3");
        names.add("DEAL 4");
        names.add("DEAL 5");
        names.add("DEAL 6");
        names.add("DEAL 7");
        names.add("DEAL 8");
        names.add("DEAL 9");
        names.add("DEAL 10");
        names.add("DEAL 11");
        names.add("DEAL 12");
        names.add("DEAL 13");

        namesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_2, names);

        ListView namesListView = (ListView) findViewById(R.id.listView);
        namesListView.setAdapter(namesAdapter);
    }
}
