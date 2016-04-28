package com.example.p13134841.cs4056endterm;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity3Activity extends AppCompatActivity {

    ArrayList<Thumbnail> thumbnails;
    MainActivity3Activity.GridAdapter gridAdapter;
    TextView restTitle;
    String restaurantName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity3);

        //Retrieve retaurant namefrom bundle here.
        restaurantName = getIntent().getExtras().getString(MainActivity2Activity.KEY);

        //Set title to display restaurant name from passed bundle.
        restTitle = (TextView) findViewById(R.id.RestTitle);
        restTitle.setText(restaurantName);


        setup();

        Button menubutton = (Button) findViewById(R.id.menutab);
        menubutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity4Activity.class);
                //Create bundle for selected restaurant data
                Bundle myBundle = new Bundle();
                myBundle.putString(MainActivity2Activity.KEY, restaurantName);
                intent.putExtras(myBundle);//PASS BUNDLE TO ACTIVITY 4
                startActivity(intent);
                finish();
            }
        });

        Button locationbutton = (Button) findViewById(R.id.locationtab);
        locationbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity5Activity.class);
                //Create bundle for selected restaurant data
                Bundle myBundle = new Bundle();
                myBundle.putString(MainActivity2Activity.KEY, restaurantName);
                intent.putExtras(myBundle);//PASS BUNDLE TO ACTIVITY 4
                startActivity(intent);
                finish();
            }
        });
    }

    private void setup() {
        thumbnails = new ArrayList<>();

        if (restaurantName.equals("The Stables Club")) {
            //show stables deals...etc.
            thumbnails.add(new Thumbnail(R.drawable.goatscheesetart, "Goats cheese and caramelised onion tart"));
            thumbnails.add(new Thumbnail(R.drawable.tomatosoup, "Tomato & basil soup"));
            thumbnails.add(new Thumbnail(R.drawable.chickenwrap, "Spicy Chicken fajita wrap"));
            thumbnails.add(new Thumbnail(R.drawable.haddock, "Smoked haddock with onion sauce"));

        } else if (restaurantName.equals("The Scholars Club")) {
            //show scholars deals...etc.
            thumbnails.add(new Thumbnail(R.drawable.peasoup, "Cream of Pea & Carrot Soup"));
            thumbnails.add(new Thumbnail(R.drawable.ribs, "BBQ pork spare ribs"));
            thumbnails.add(new Thumbnail(R.drawable.lasagne, "Vegetarian lasagne"));
            thumbnails.add(new Thumbnail(R.drawable.pork, "Roast Loin of Pork with Apple Sauce"));

        } else if (restaurantName.equals("The Paddocks")) {
            thumbnails.add(new Thumbnail(R.drawable.sandwichsoup, "Toasted  sandwich & vegetable soup"));
            thumbnails.add(new Thumbnail(R.drawable.volauvent, "Chicken & mushroom vol au vent & chips "));
            thumbnails.add(new Thumbnail(R.drawable.codchips, "Baked fillet of cod & chips"));
            thumbnails.add(new Thumbnail(R.drawable.blt, "BLT with chips/salad"));

        } else {
            thumbnails.add(new Thumbnail(R.drawable.seafoodpie, "Atlantic seafood pie"));
            thumbnails.add(new Thumbnail(R.drawable.burger, "Irish beef burger"));
            thumbnails.add(new Thumbnail(R.drawable.springrolls, "Vegetarian spring rolls"));
            thumbnails.add(new Thumbnail(R.drawable.amatricana, "Wholewheat pasta Amatricana"));
        }

        gridAdapter = new MainActivity3Activity.GridAdapter();

        GridView imagesGridView = (GridView) findViewById(R.id.images_grid_view);
        imagesGridView.setAdapter(gridAdapter);
    }
    public class GridAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return thumbnails.size();
        }

        @Override
        public Object getItem(int position) {
            return thumbnails.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewGroup itemRootView;
            if (convertView == null) {
                itemRootView = (ViewGroup) LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_item, parent, false);
            }
            else {
                itemRootView = (ViewGroup) convertView;
            }
            Thumbnail thumbnail = thumbnails.get(position);
            TextView gridTextView = (TextView) itemRootView.findViewById(R.id.grid_text_view);
            gridTextView.setText(thumbnail.getName());
            ImageView gridImageView = (ImageView) itemRootView.findViewById(R.id.grid_image_view);
            gridImageView.setImageResource(thumbnail.getImageResId());
            return itemRootView;
        }
    }
}
