package com.shahalam3041.hstubus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button campusTownButton, townCampusButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campusTownButton = findViewById(R.id.campusTownButton);
        townCampusButton = findViewById(R.id.townCampusButton);

        campusTownButton.setOnClickListener(this);
        townCampusButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.campusTownButton:
            {
                Intent intent = new Intent(MainActivity.this, CampusTown.class);
                startActivity(intent);
                break;
            }
            case R.id.townCampusButton:
            {
                Intent intent = new Intent(MainActivity.this, TownCampus.class);
                startActivity(intent);
                break;
            }
        }
    }
}
