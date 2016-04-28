package com.example.p13134841.cs4056endterm;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity4Activity extends AppCompatActivity {

    TextView restTitle;
    String restaurantName = "";

    LinearLayout menuView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity4);

        //Retrieve retaurant namefrom bundle here.
        restaurantName = getIntent().getExtras().getString(MainActivity2Activity.KEY);

        //Set title to display restaurant name from passed bundle.
        restTitle = (TextView) findViewById(R.id.RestTitle);
        restTitle.setText(restaurantName);

        menuView = (LinearLayout) findViewById(R.id.menuView);
        menuView.setBackgroundColor(Color.WHITE);
        String[] menuItems;

        //CHOOSE MENU ARRAY BASED ON RESTAURANT NAME.

        if(restaurantName.equals("The Stables Club")) {
            menuItems = getApplicationContext().getResources().getStringArray(R.array.stables_menu);
        } else if(restaurantName.equals("The Paddocks")) {
            menuItems = getApplicationContext().getResources().getStringArray(R.array.paddocks_menu);
        } else if(restaurantName.equals("The Scholars Club")) {
            menuItems = getApplicationContext().getResources().getStringArray(R.array.scholars_menu);
        } else {
            menuItems = getApplicationContext().getResources().getStringArray(R.array.eden_menu);
        }

        //ADD MENU ITEM TO VIEW FOR EACH STRING.

        for(String item : menuItems) {
            TextView tv = new TextView(getApplicationContext());
            tv.setText(item);
            tv.setTextColor(Color.BLACK);
            tv.setTextSize(15);
            menuView.addView(tv);
        }

        Button dealsbutton = (Button)findViewById(R.id.dealstab);
        dealsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity3Activity.class);
                //Create bundle for selected restaurant data
                Bundle myBundle = new Bundle();
                myBundle.putString(MainActivity2Activity.KEY, restaurantName);
                intent.putExtras(myBundle);//PASS BUNDLE TO ACTIVITY 4
                startActivity(intent);
                finish();
            }
        });

        Button locationbutton = (Button)findViewById(R.id.locationtab);
        locationbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), MainActivity5Activity.class);
                //Create bundle for selected restaurant data
                Bundle myBundle = new Bundle();
                myBundle.putString(MainActivity2Activity.KEY, restaurantName);
                intent.putExtras(myBundle);//PASS BUNDLE TO ACTIVITY 4
                startActivity(intent);
                finish();    }
        });
    }
}
