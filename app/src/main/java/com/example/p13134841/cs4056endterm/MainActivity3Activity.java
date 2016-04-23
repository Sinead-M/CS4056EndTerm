package com.example.p13134841.cs4056endterm;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
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

        Button menubutton = (Button)findViewById(R.id.menutab);
        menubutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent intent = new Intent(v.getContext(),MainActivity4Activity.class);
              startActivity(intent);
            }
        });

        Button locationbutton = (Button)findViewById(R.id.locationtab);
        locationbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),MainActivity5Activity.class);
                startActivity(intent);
            }
        });
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

        namesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, names);

        ListView namesListView = (ListView) findViewById(R.id.listView);
        namesListView.setAdapter(namesAdapter);
    }
}
