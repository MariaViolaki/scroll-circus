package com.example.android.scrollcircus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int points = 50;
        TextView numberOfPoints = findViewById(R.id.number_of_points);
        numberOfPoints.setText("" + points);

    }

    int points = 50;

    public void calculateResources() {

        // Find Switches on XML
        Switch switchOne = findViewById(R.id.switch_one);
        Switch switchTwo = findViewById(R.id.switch_two);
        Switch switchThree = findViewById(R.id.switch_three);
        Switch switchFour = findViewById(R.id.switch_four);
        Switch switchFive = findViewById(R.id.switch_five);
        Switch switchSix = findViewById(R.id.switch_six);

        // Allocate points between Switches

        if (switchOne.isChecked()) {
            points -=
        }

    }
}