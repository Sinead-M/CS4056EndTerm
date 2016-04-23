package com.example.p13134841.cs4056endterm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity5);

        Button dealsbutton = (Button)findViewById(R.id.dealstab);
        dealsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity3Activity.class);
                startActivity(intent);
            }
        });

        Button menubutton = (Button)findViewById(R.id.menutab);
        menubutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),MainActivity4Activity.class);
                startActivity(intent);
            }
        });
    }
}
