package com.example.p13134841.cs4056endterm;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity4Activity extends AppCompatActivity {

    TextView restTitle;
    TextView Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9;
    TextView Price1, Price2, Price3, Price4, Price5, Price6, Price7, Price8, Price9;
    String restaurantName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity4);

        //Retrieve retaurant namefrom bundle here.
        restaurantName = getIntent().getExtras().getString(MainActivity2Activity.KEY);

        //Set title to display restaurant name from passed bundle.
        restTitle = (TextView) findViewById(R.id.RestTitle);
        restTitle.setText(restaurantName);

        setup();


        Button dealsbutton = (Button) findViewById(R.id.dealstab);
        dealsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity3Activity.class);
                startActivity(intent);
            }
        });

        Button locationbutton = (Button) findViewById(R.id.locationtab);
        locationbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), MainActivity5Activity.class);
                startActivity(intent);
            }
        });
    }

    private void setup() {

        if (restaurantName.equals("STABLES")) {
            //show stables menu...etc.
            Item1 = (TextView) findViewById(R.id.item1);
            Item1.setText("Goats cheese and caramelised onion tart (V)");
            Price1 = (TextView) findViewById(R.id.price1);
            Price1.setText("€5.90");

            Item2 = (TextView) findViewById(R.id.item2);
            Item2.setText("Smoked haddock with onion sauce (GF)");
            Price2 = (TextView) findViewById(R.id.price2);
            Price2.setText("€6.95");

            Item3 = (TextView) findViewById(R.id.item3);
            Item3.setText("Spicy Chicken fajita wrap");
            Price3 = (TextView) findViewById(R.id.price3);
            Price3.setText("€5.00");

            Item4 = (TextView) findViewById(R.id.item4);
            Item4.setText("Cheeseburger and chips");
            Price4 = (TextView) findViewById(R.id.price4);
            Price4.setText("€5.00");

            Item5 = (TextView) findViewById(R.id.item5);
            Item5.setText("Tomato and basil soup");
            Price5 = (TextView) findViewById(R.id.price5);
            Price5.setText("€2.30");

            Item6 = (TextView) findViewById(R.id.item6);
            Item6.setText("Roast stuffed loin of pork with apple sauce");
            Price6 = (TextView) findViewById(R.id.price6);
            Price6.setText("€6.95");

            Item7 = (TextView) findViewById(R.id.item7);
            Item7.setText("Golden crumbed chicken in garlic butter");
            Price7 = (TextView) findViewById(R.id.price7);
            Price7.setText("€6.95");

            Item8 = (TextView) findViewById(R.id.item8);
            Item8.setText("Chicken and broccoli bake");
            Price8 = (TextView) findViewById(R.id.price8);
            Price8.setText("€5.90");

            Item9 = (TextView) findViewById(R.id.item9);
            Item9.setText("Spring rolls with salad and chips (V)");
            Price9 = (TextView) findViewById(R.id.price9);
            Price9.setText("€5.90");

        } else if (restaurantName.equals("SCHOLARS")) {
            //show scholars menu...etc.
            Item1 = (TextView) findViewById(R.id.item1);
            Item1.setText("Toasted Sandwich and Vegetable Soup (V)");
            Price1 = (TextView) findViewById(R.id.price1);
            Price1.setText("€5");

            Item2 = (TextView) findViewById(R.id.item2);
            Item2.setText("Pizza Wrap and Chips (V)");
            Price2 = (TextView) findViewById(R.id.price2);
            Price2.setText("€5");

            Item3 = (TextView) findViewById(R.id.item3);
            Item3.setText("BLT with chips/salad");
            Price3 = (TextView) findViewById(R.id.price3);
            Price3.setText("€5.25");

            Item4 = (TextView) findViewById(R.id.item4);
            Item4.setText("This is the Stables Menu");
            Price4 = (TextView) findViewById(R.id.price4);
            Price4.setText("This is the Stables Menu");

            Item5 = (TextView) findViewById(R.id.item5);
            Item5.setText("This is the Stables Menu");
            Price5 = (TextView) findViewById(R.id.price5);
            Price5.setText("This is the Stables Menu");

            Item6 = (TextView) findViewById(R.id.item6);
            Item6.setText("This is the Stables Menu");
            Price6 = (TextView) findViewById(R.id.price6);
            Price6.setText("This is the Stables Menu");

            Item7 = (TextView) findViewById(R.id.item7);
            Item7.setText("This is the Stables Menu");
            Price7 = (TextView) findViewById(R.id.price7);
            Price7.setText("This is the Stables Menu");

            Item8 = (TextView) findViewById(R.id.item8);
            Item8.setText("This is the Stables Menu");
            Price8 = (TextView) findViewById(R.id.price8);
            Price8.setText("This is the Stables Menu");

            Item9 = (TextView) findViewById(R.id.item9);
            Item9.setText("This is the Stables Menu");
            Price9 = (TextView) findViewById(R.id.price9);
            Price9.setText("This is the Stables Menu");

        } else if (restaurantName.equals("PADDOCKS")) {
            Item1 = (TextView) findViewById(R.id.item1);
            Item1.setText("This is the Stables Menu");
            Price1 = (TextView) findViewById(R.id.price1);
            Price1.setText("This is the Stables Menu");

            Item2 = (TextView) findViewById(R.id.item2);
            Item2.setText("This is the Stables Menu");
            Price2 = (TextView) findViewById(R.id.price2);
            Price2.setText("This is the Stables Menu");

            Item3 = (TextView) findViewById(R.id.item3);
            Item3.setText("This is the Stables Menu");
            Price3 = (TextView) findViewById(R.id.price3);
            Price3.setText("This is the Stables Menu");

            Item4 = (TextView) findViewById(R.id.item4);
            Item4.setText("This is the Stables Menu");
            Price4 = (TextView) findViewById(R.id.price4);
            Price4.setText("This is the Stables Menu");

            Item5 = (TextView) findViewById(R.id.item5);
            Item5.setText("This is the Stables Menu");
            Price5 = (TextView) findViewById(R.id.price5);
            Price5.setText("This is the Stables Menu");

            Item6 = (TextView) findViewById(R.id.item6);
            Item6.setText("This is the Stables Menu");
            Price6 = (TextView) findViewById(R.id.price6);
            Price6.setText("This is the Stables Menu");

            Item7 = (TextView) findViewById(R.id.item7);
            Item7.setText("This is the Stables Menu");
            Price7 = (TextView) findViewById(R.id.price7);
            Price7.setText("This is the Stables Menu");

            Item8 = (TextView) findViewById(R.id.item8);
            Item8.setText("This is the Stables Menu");
            Price8 = (TextView) findViewById(R.id.price8);
            Price8.setText("This is the Stables Menu");

            Item9 = (TextView) findViewById(R.id.item9);
            Item9.setText("This is the Stables Menu");
            Price9 = (TextView) findViewById(R.id.price9);
            Price9.setText("This is the Stables Menu");

        } else if (restaurantName.equals("EDEN")) {

            Item1 = (TextView) findViewById(R.id.item1);
            Item1.setText("This is the Stables Menu");
            Price1 = (TextView) findViewById(R.id.price1);
            Price1.setText("This is the Stables Menu");

            Item2 = (TextView) findViewById(R.id.item2);
            Item2.setText("This is the Stables Menu");
            Price2 = (TextView) findViewById(R.id.price2);
            Price2.setText("This is the Stables Menu");

            Item3 = (TextView) findViewById(R.id.item3);
            Item3.setText("This is the Stables Menu");
            Price3 = (TextView) findViewById(R.id.price3);
            Price3.setText("This is the Stables Menu");

            Item4 = (TextView) findViewById(R.id.item4);
            Item4.setText("This is the Stables Menu");
            Price4 = (TextView) findViewById(R.id.price4);
            Price4.setText("This is the Stables Menu");

            Item5 = (TextView) findViewById(R.id.item5);
            Item5.setText("This is the Stables Menu");
            Price5 = (TextView) findViewById(R.id.price5);
            Price5.setText("This is the Stables Menu");

            Item6 = (TextView) findViewById(R.id.item6);
            Item6.setText("This is the Stables Menu");
            Price6 = (TextView) findViewById(R.id.price6);
            Price6.setText("This is the Stables Menu");

            Item7 = (TextView) findViewById(R.id.item7);
            Item7.setText("This is the Stables Menu");
            Price7 = (TextView) findViewById(R.id.price7);
            Price7.setText("This is the Stables Menu");

            Item8 = (TextView) findViewById(R.id.item8);
            Item8.setText("This is the Stables Menu");
            Price8 = (TextView) findViewById(R.id.price8);
            Price8.setText("This is the Stables Menu");

            Item9 = (TextView) findViewById(R.id.item9);
            Item9.setText("This is the Stables Menu");
            Price9 = (TextView) findViewById(R.id.price9);
            Price9.setText("This is the Stables Menu");
        }
    }
}
