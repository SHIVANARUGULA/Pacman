package com.comp6442.assignment.pacman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        button = findViewById(R.id.button);
        button.setOnClickListener( e ->{
            Intent myIntent = new Intent(StartActivity.this, PacManActivity.class);
            StartActivity.this.startActivity(myIntent);


        });

    }
}
