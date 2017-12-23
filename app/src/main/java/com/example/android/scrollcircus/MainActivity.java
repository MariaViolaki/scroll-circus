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
            buttonClicked++;
            // Generate random number using multiples of 5
            points = ((int) (Math.random() * 15 + 2) * 5);
            // Show the number on the screen
            TextView numberOfPoints = findViewById(R.id.number_of_points);
            numberOfPoints.setText("" + points);
        } else {
            buttonClicked++;
            Toast.makeText(this, "You can't change your fate.", Toast.LENGTH_SHORT).show();
        }
    }

    public void addBudget(View view) {
        // Find Switch on XML
        Switch budget = findViewById(R.id.budget);
        // Allocate points to Switch
        if (budget.isChecked()) {
            if (points >= 25) {
                points = points - 25;
            } else {
                budget.setChecked(false);
            }
        } else {
            points = points + 25;
            budget.setChecked(false);
        }
        // Show new resources number
        TextView numberOfPoints = findViewById(R.id.number_of_points);
        numberOfPoints.setText("" + points);
    }

    public void addKnowledge(View view) {
        Switch knowledge = findViewById(R.id.knowledge);
        if (knowledge.isChecked()) {
            if (points >= 20) {
                points = points - 20;
            } else {
                knowledge.setChecked(false);
            }
        } else {
            points = points + 20;
            knowledge.setChecked(false);
        }
        TextView numberOfPoints = findViewById(R.id.number_of_points);
        numberOfPoints.setText("" + points);
    }

    public void addEntertainment(View view) {
        Switch entertainment = findViewById(R.id.entertainment);
        if (entertainment.isChecked()) {
            if (points >= 20) {
                points = points - 20;
            } else {
                entertainment.setChecked(false);
            }
        } else {
            points = points + 20;
            entertainment.setChecked(false);
        }
        TextView numberOfPoints = findViewById(R.id.number_of_points);
        numberOfPoints.setText("" + points);
    }

    public void addCaution(View view) {
        Switch caution = findViewById(R.id.caution);
        if (caution.isChecked()) {
            if (points >= 15) {
                points = points - 15;
            } else {
                caution.setChecked(false);
            }
        } else {
            points = points + 15;
            caution.setChecked(false);
        }
        TextView numberOfPoints = findViewById(R.id.number_of_points);
        numberOfPoints.setText("" + points);
    }

    public void addStrength(View view) {
        Switch strength = findViewById(R.id.strength);
        if (strength.isChecked()) {
            if (points >= 15) {
                points = points - 15;
            } else {
                strength.setChecked(false);
            }
        } else {
            points = points + 15;
            strength.setChecked(false);
        }
        TextView numberOfPoints = findViewById(R.id.number_of_points);
        numberOfPoints.setText("" + points);
    }

    public void addFlexibility(View view) {
        Switch flexibility = findViewById(R.id.flexibility);
        if (flexibility.isChecked()) {
            if (points >= 10) {
                points = points - 10;
            } else {
                flexibility.setChecked(false);
            }
        } else {
            points = points + 10;
            flexibility.setChecked(false);
        }
        TextView numberOfPoints = findViewById(R.id.number_of_points);
        numberOfPoints.setText("" + points);
    }

    public void addSnacks(View view) {
        Switch snacks = findViewById(R.id.snacks);
        if (snacks.isChecked()) {
            if (points >= 10) {
                points = points - 10;
            } else {
                snacks.setChecked(false);
            }
        } else {
            points = points + 10;
            snacks.setChecked(false);
        }
        TextView numberOfPoints = findViewById(R.id.number_of_points);
        numberOfPoints.setText("" + points);
    }

    public void addMerchandising(View view) {
        Switch merchandising = findViewById(R.id.merchandising);
        if (merchandising.isChecked()) {
            if (points >= 10) {
                points = points - 10;
            } else {
                merchandising.setChecked(false);
            }
        } else {
            points = points + 10;
            merchandising.setChecked(false);
        }
        TextView numberOfPoints = findViewById(R.id.number_of_points);
        numberOfPoints.setText("" + points);
    }

    public void addAnimals(View view) {
        Switch animals = findViewById(R.id.animals);
        if (animals.isChecked()) {
            if (points >= 5) {
                points = points - 5;
            } else {
                animals.setChecked(false);
            }
        } else {
            points = points + 5;
            animals.setChecked(false);
        }
        TextView numberOfPoints = findViewById(R.id.number_of_points);
        numberOfPoints.setText("" + points);
    }

    public void addFreaks(View view) {
        Switch freaks = findViewById(R.id.freaks);
        if (freaks.isChecked()) {
            if (points >= 5) {
                points = points - 5;
            } else {
                freaks.setChecked(false);
            }
        } else {
            points = points + 5;
            freaks.setChecked(false);
        }
        TextView numberOfPoints = findViewById(R.id.number_of_points);
        numberOfPoints.setText("" + points);
    }
}