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
    TextView restTitle;
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

        mMapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap googleMap) {
                googleMap.addMarker(new MarkerOptions()
                        .position(new LatLng(52.67317136212457, -8.570969781343138))
                        .title("Limerick")
                        .snippet("Come here for the craic!"));
                googleMap.moveCamera(CameraUpdateFactory
                        .newLatLngZoom(new LatLng(52.67317136212457, -8.570969781343138), 7));
            }
        });

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
