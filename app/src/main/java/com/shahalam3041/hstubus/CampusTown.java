package com.shahalam3041.hstubus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class CampusTown extends AppCompatActivity {

    ImageView campusTownImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campus_town);

        campusTownImageView = findViewById(R.id.campusTownBusRoutine);

        Glide.with(this)
                .load("http://shahalam3041.000webhostapp.com/hstu/hstulogo.png")
                .placeholder(R.drawable.campustown)
                .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                .into(campusTownImageView);
    }
}
