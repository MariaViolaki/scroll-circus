package com.example.android.scrollcircus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int points;
    int buttonClicked = 0;

    public void randomizePoints(View view) {
        if (buttonClicked == 0) {
            buttonClicked ++;
            // Generate random number using multiples of 5
            points = ((int)(Math.random() * 15 + 2) * 5);
            // Show the number on the screen
            TextView numberOfPoints = findViewById(R.id.number_of_points);
            numberOfPoints.setText("" + points);
        }
        else {
            buttonClicked ++;
            Toast.makeText(this, "You can't change your fate.", Toast.LENGTH_SHORT).show();
        }
    }

    public void resourceOne(View view) {
        // Find Switch on XML
        Switch switchOne = findViewById(R.id.switch_one);
        // Allocate points to Switch
        if (switchOne.isChecked()) {
            if (points >= 15) {
                points = points - 15;
            } else {
                switchOne.setChecked(false);
            }
        } else {
            points = points + 15;
            switchOne.setChecked(false);
        }
        // Show new resources number
        TextView numberOfPoints = findViewById(R.id.number_of_points);
        numberOfPoints.setText("" + points);
    }

    public void resourceTwo(View view) {
        Switch switchTwo = findViewById(R.id.switch_two);
        if (switchTwo.isChecked()) {
            if (points >= 10) {
                points = points - 10;
            } else {
                switchTwo.setChecked(false);
            }
        } else {
            points = points + 10;
            switchTwo.setChecked(false);
        }
        TextView numberOfPoints = findViewById(R.id.number_of_points);
        numberOfPoints.setText("" + points);
    }

    public void resourceThree(View view) {
        Switch switchThree = findViewById(R.id.switch_three);
        if (switchThree.isChecked()) {
            if (points >= 20) {
                points = points - 20;
            } else {
                switchThree.setChecked(false);
            }
        } else {
            points = points + 20;
            switchThree.setChecked(false);
        }
        TextView numberOfPoints = findViewById(R.id.number_of_points);
        numberOfPoints.setText("" + points);
    }

    public void resourceFour(View view) {
        Switch switchFour = findViewById(R.id.switch_four);
        if (switchFour.isChecked()) {
            if (points >= 5) {
                points = points - 5;
            } else {
                switchFour.setChecked(false);
            }
        } else {
            points = points + 5;
            switchFour.setChecked(false);
        }
        TextView numberOfPoints = findViewById(R.id.number_of_points);
        numberOfPoints.setText("" + points);
    }

    public void resourceFive(View view) {
        Switch switchFive = findViewById(R.id.switch_five);
        if (switchFive.isChecked()) {
            if (points >= 25) {
                points = points - 25;
            } else {
                switchFive.setChecked(false);
            }
        } else {
            points = points + 25;
            switchFive.setChecked(false);
        }
        TextView numberOfPoints = findViewById(R.id.number_of_points);
        numberOfPoints.setText("" + points);
    }

    public void resourceSix(View view) {
        Switch switchSix = findViewById(R.id.switch_six);
        if (switchSix.isChecked()) {
            if (points >= 10) {
                points = points - 10;
            } else {
                switchSix.setChecked(false);
            }
        } else {
            points = points + 10;
            switchSix.setChecked(false);
        }
        TextView numberOfPoints = findViewById(R.id.number_of_points);
        numberOfPoints.setText("" + points);
    }

    public void resourceSeven(View view) {
        Switch switchSeven = findViewById(R.id.switch_seven);
        if (switchSeven.isChecked()) {
            if (points >= 20) {
                points = points - 20;
            } else {
                switchSeven.setChecked(false);
            }
        } else {
            points = points + 20;
            switchSeven.setChecked(false);
        }
        TextView numberOfPoints = findViewById(R.id.number_of_points);
        numberOfPoints.setText("" + points);
    }

    public void resourceEight(View view) {
        Switch switchEight = findViewById(R.id.switch_eight);
        if (switchEight.isChecked()) {
            if (points >= 15) {
                points = points - 15;
            } else {
                switchEight.setChecked(false);
            }
        } else {
            points = points + 15;
            switchEight.setChecked(false);
        }
        TextView numberOfPoints = findViewById(R.id.number_of_points);
        numberOfPoints.setText("" + points);
    }
}