package com.shahalam3041.hstubus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class TownCampus extends AppCompatActivity {


    ImageView townCampusBusRoutine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_town_campus);

        townCampusBusRoutine = findViewById(R.id.townCampusBusRoutine);

        Glide.with(this)
                .load("https://4.bp.blogspot.com/-l62yL-HSwgE/Vtnr5quHXVI/AAAAAAAAASM/1djODv6kA4w/s320/gaussian.png")
                .placeholder(R.drawable.towncampus)
                .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                .into(townCampusBusRoutine);


    }

}
