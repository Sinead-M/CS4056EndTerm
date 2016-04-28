package com.example.p13134841.cs4056endterm;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity5Activity extends AppCompatActivity {

    MapFragment mMapFragment;
    TextView restTitle, location, information;
    String restaurantName="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity5);

        //Retrieve retaurant namefrom bundle here.
        restaurantName = getIntent().getExtras().getString(MainActivity2Activity.KEY);

        //Set title to display restaurant name from passed bundle.
        restTitle = (TextView) findViewById(R.id.RestTitle);
        restTitle.setText(restaurantName);

        mMapFragment = MapFragment.newInstance();
        FragmentTransaction fragmentTransaction =
                getFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.map, mMapFragment);
        fragmentTransaction.commit();

        if(restaurantName.equals("The Stables Club")) {
            mMapFragment.getMapAsync(new OnMapReadyCallback() {
                @Override
                public void onMapReady(GoogleMap googleMap) {
                    googleMap.addMarker(new MarkerOptions()
                            .position(new LatLng(52.67317136212457, -8.570969781343138))
                            .title("The Stables Club"));
                    googleMap.moveCamera(CameraUpdateFactory
                            .newLatLngZoom(new LatLng(52.67317136212457, -8.570969781343138), 15));
                }
            });
            location = (TextView) findViewById(R.id.location);
            location.setText("University of Limerick - Student Center");
            information = (TextView) findViewById(R.id.info);
            information.setText("The main campus bar, the Stables Club offers food and beverages all day. Located in the Student Centre, the Club also offers night time entertainment for students.");
        } else if(restaurantName.equals("The Paddocks")) {
            mMapFragment.getMapAsync(new OnMapReadyCallback() {
                @Override
                public void onMapReady(GoogleMap googleMap) {
                    googleMap.addMarker(new MarkerOptions()
                            .position(new LatLng(52.6729339595839, -8.570837972048366))
                            .title("The Paddocks"));
                    googleMap.moveCamera(CameraUpdateFactory
                            .newLatLngZoom(new LatLng(52.6729339595839, -8.570837972048366), 15));
                }
            });
            location = (TextView) findViewById(R.id.location);
            location.setText("University of Limerick - Student Center");
            information = (TextView) findViewById(R.id.info);
            information.setText("Located in the Student Centre, the Paddock Restaurant provides self- service breakfast and lunch. While a variety of hot dishes are available throughout the day, sandwiches and rolls are made to order. ");

        } else if(restaurantName.equals("The Scholars Club")) {
            mMapFragment.getMapAsync(new OnMapReadyCallback() {
                @Override
                public void onMapReady(GoogleMap googleMap) {
                    googleMap.addMarker(new MarkerOptions()
                            .position(new LatLng(52.67294371795449, -8.569824097040737))
                            .title("The Scholars Club"));
                    googleMap.moveCamera(CameraUpdateFactory
                            .newLatLngZoom(new LatLng(52.67294371795449, -8.569824097040737), 15));
                }
            });
            location = (TextView) findViewById(R.id.location);
            location.setText("University of Limerick - Student Center");
            information = (TextView) findViewById(R.id.info);
            information.setText("The Scholars Club and Bar provides food and beverages in a relaxed and intimate environment. The Club serves carvery every day and can cater for parties of up to 80 people.");
        } else {
            mMapFragment.getMapAsync(new OnMapReadyCallback() {
                @Override
                public void onMapReady(GoogleMap googleMap) {
                    googleMap.addMarker(new MarkerOptions()
                            .position(new LatLng(52.674420459577206, -8.570714590433681))
                            .title("Eden"));
                    googleMap.moveCamera(CameraUpdateFactory
                            .newLatLngZoom(new LatLng(52.674420459577206, -8.570714590433681), 15));
                }
            });
            location = (TextView) findViewById(R.id.location);
            location.setText("University of Limerick - Main Building");
            information = (TextView) findViewById(R.id.info);
            information.setText("Eden is the university main self-service restaurant. Located in the Main Building, Eden offers daily specials, sandwiches made to order and a live action station where fresh produce is prepared before your eyes.");
        }


        Button dealsbutton = (Button) findViewById(R.id.dealstab);
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
    }
}
