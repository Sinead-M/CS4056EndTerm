package com.example.p13134841.cs4056endterm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity4);

        Button dealsbutton = (Button)findViewById(R.id.dealstab);
        dealsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity3Activity.class);
                startActivity(intent);
            }
        });

        Button locationbutton = (Button)findViewById(R.id.locationtab);
        locationbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), MainActivity5Activity.class);
                startActivity(intent);
            }
        });
    }
}
