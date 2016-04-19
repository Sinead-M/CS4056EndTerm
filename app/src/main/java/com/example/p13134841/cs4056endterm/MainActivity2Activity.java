package com.example.p13134841.cs4056endterm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity2Activity extends AppCompatActivity {

    ArrayList<Thumbnail> thumbnails;
    GridAdapter gridAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);

        setup();
    }

    public void setup() {
        thumbnails = new ArrayList<>();
        thumbnails.add(new Thumbnail(R.drawable.newbridge, "Stables"));
        thumbnails.add(new Thumbnail(R.drawable.newbridge, "Scholars"));
        thumbnails.add(new Thumbnail(R.drawable.newbridge, "Spar"));
        thumbnails.add(new Thumbnail(R.drawable.newbridge, "The Paddocks"));
        thumbnails.add(new Thumbnail(R.drawable.newbridge, "The Sports Bar"));
        thumbnails.add(new Thumbnail(R.drawable.newbridge, "The Pavilion"));
        thumbnails.add(new Thumbnail(R.drawable.newbridge, "Pizza CO"));
        thumbnails.add(new Thumbnail(R.drawable.newbridge, "Eden"));
        thumbnails.add(new Thumbnail(R.drawable.newbridge, "Subway"));

        gridAdapter = new GridAdapter();

        GridView imagesGridView = (GridView) findViewById(R.id.images_grid_view);
        imagesGridView.setAdapter(gridAdapter);

        imagesGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),MainActivity3Activity.class);
                startActivity(intent);
            }
        });
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
//            TextView gridTextView = (TextView) itemRootView.findViewById(R.id.grid_text_view);
//            gridTextView.setText(thumbnail.getName());
            ImageView gridImageView = (ImageView) itemRootView.findViewById(R.id.grid_image_view);
            gridImageView.setImageResource(thumbnail.getImageResId());
            return itemRootView;
        }
    }
}
