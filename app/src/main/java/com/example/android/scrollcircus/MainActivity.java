package com.example.android.scrollcircus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
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
        LinearLayout newspaper = findViewById(R.id.newspaper);
        newspaper.setVisibility(View.GONE);
    }

    int points;
    int buttonClicked = 0;
    boolean hasBudget;
    boolean hasKnowledge;
    boolean hasEntertainment;
    boolean hasCaution;
    boolean hasStrength;
    boolean hasFlexibility;
    boolean hasSnacks;
    boolean hasMerchandising;
    boolean hasAnimals;
    boolean hasFreaks;
    boolean isSuccessful;
    String goodPrologue;
    String badPrologue;
    String goodBudgetSentence;
    String badBudgetSentence;
    String goodKnowledgeSentence;
    String badKnowledgeSentence;
    String goodEntertainmentSentence;
    String badEntertainmentSentence;
    String goodCautionSentence;
    String badCautionSentence;
    String goodStrengthSentence;
    String badStrengthSentence;
    String goodFlexibilitySentence;
    String badFlexibilitySentence;
    String goodSnacksSentence;
    String badSnacksSentence;
    String goodMerchandisingSentence;
    String badMerchandisingSentence;
    String goodAnimalsSentence;
    String averageAnimalsSentence;
    String badAnimalsSentence;
    String goodFreaksSentence;
    String averageFreaksSentence;
    String badFreaksSentence;
    String goodEpilogue;
    String badEpilogue;

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
                hasBudget = true;
            } else {
                budget.setChecked(false);
                hasBudget = false;
            }
        } else {
            points = points + 25;
            budget.setChecked(false);
            hasBudget = false;
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
                hasKnowledge = true;
            } else {
                knowledge.setChecked(false);
                hasKnowledge = false;
            }
        } else {
            points = points + 20;
            knowledge.setChecked(false);
            hasKnowledge = false;
        }
        TextView numberOfPoints = findViewById(R.id.number_of_points);
        numberOfPoints.setText("" + points);
    }

    public void addEntertainment(View view) {
        Switch entertainment = findViewById(R.id.entertainment);
        if (entertainment.isChecked()) {
            if (points >= 20) {
                points = points - 20;
                hasEntertainment = true;
            } else {
                entertainment.setChecked(false);
                hasEntertainment = false;
            }
        } else {
            points = points + 20;
            entertainment.setChecked(false);
            hasEntertainment = false;
        }
        TextView numberOfPoints = findViewById(R.id.number_of_points);
        numberOfPoints.setText("" + points);
    }

    public void addCaution(View view) {
        Switch caution = findViewById(R.id.caution);
        if (caution.isChecked()) {
            if (points >= 15) {
                points = points - 15;
                hasCaution = true;
            } else {
                caution.setChecked(false);
                hasCaution = false;
            }
        } else {
            points = points + 15;
            caution.setChecked(false);
            hasCaution = false;
        }
        TextView numberOfPoints = findViewById(R.id.number_of_points);
        numberOfPoints.setText("" + points);
    }

    public void addStrength(View view) {
        Switch strength = findViewById(R.id.strength);
        if (strength.isChecked()) {
            if (points >= 15) {
                points = points - 15;
                hasStrength = true;
            } else {
                strength.setChecked(false);
                hasStrength = false;
            }
        } else {
            points = points + 15;
            strength.setChecked(false);
            hasStrength = false;
        }
        TextView numberOfPoints = findViewById(R.id.number_of_points);
        numberOfPoints.setText("" + points);
    }

    public void addFlexibility(View view) {
        Switch flexibility = findViewById(R.id.flexibility);
        if (flexibility.isChecked()) {
            if (points >= 10) {
                points = points - 10;
                hasFlexibility = true;
            } else {
                flexibility.setChecked(false);
                hasFlexibility = false;
            }
        } else {
            points = points + 10;
            flexibility.setChecked(false);
            hasFlexibility = false;
        }
        TextView numberOfPoints = findViewById(R.id.number_of_points);
        numberOfPoints.setText("" + points);
    }

    public void addSnacks(View view) {
        Switch snacks = findViewById(R.id.snacks);
        if (snacks.isChecked()) {
            if (points >= 10) {
                points = points - 10;
                hasSnacks = true;
            } else {
                snacks.setChecked(false);
                hasSnacks = false;
            }
        } else {
            points = points + 10;
            snacks.setChecked(false);
            hasSnacks = false;
        }
        TextView numberOfPoints = findViewById(R.id.number_of_points);
        numberOfPoints.setText("" + points);
    }

    public void addMerchandising(View view) {
        Switch merchandising = findViewById(R.id.merchandising);
        if (merchandising.isChecked()) {
            if (points >= 10) {
                points = points - 10;
                hasMerchandising = true;
            } else {
                merchandising.setChecked(false);
                hasMerchandising = false;
            }
        } else {
            points = points + 10;
            merchandising.setChecked(false);
            hasMerchandising = false;
        }
        TextView numberOfPoints = findViewById(R.id.number_of_points);
        numberOfPoints.setText("" + points);
    }

    public void addAnimals(View view) {
        Switch animals = findViewById(R.id.animals);
        if (animals.isChecked()) {
            if (points >= 5) {
                points = points - 5;
                hasAnimals = true;
            } else {
                animals.setChecked(false);
                hasAnimals = false;
            }
        } else {
            points = points + 5;
            animals.setChecked(false);
            hasAnimals = false;
        }
        TextView numberOfPoints = findViewById(R.id.number_of_points);
        numberOfPoints.setText("" + points);
    }

    public void addFreaks(View view) {
        Switch freaks = findViewById(R.id.freaks);
        if (freaks.isChecked()) {
            if (points >= 5) {
                points = points - 5;
                hasFreaks = true;
            } else {
                freaks.setChecked(false);
                hasFreaks = false;
            }
        } else {
            points = points + 5;
            freaks.setChecked(false);
            hasFreaks = false;
        }
        TextView numberOfPoints = findViewById(R.id.number_of_points);
        numberOfPoints.setText("" + points);
    }

    public void displayNewspaper(View view) {

        LinearLayout newspaper = findViewById(R.id.newspaper);
        newspaper.setVisibility(View.VISIBLE);

        // Determine success depending on resources availability
        if (hasBudget && hasKnowledge && hasEntertainment && hasCaution && hasStrength && hasFlexibility && hasSnacks && hasMerchandising) {
            isSuccessful = true;
        } else {
            isSuccessful = false;
        }

        // Add the appropriate prologue and epilogue
        if (isSuccessful) {
            goodPrologue = getString(R.string.prologue_good);
            badPrologue = "";
            goodEpilogue = getString(R.string.epilogue_good);
            badEpilogue = "";
        } else {
            goodPrologue = "";
            badPrologue = getString(R.string.prologue_bad);
            goodEpilogue = "";
            badEpilogue = getString(R.string.epilogue_bad);
        }

        // Add the appropriate resource sentences
        if (hasBudget) {
            goodBudgetSentence = getString(R.string.yes_budget);
            badBudgetSentence = "";
        } else {
            goodBudgetSentence = "";
            badBudgetSentence = getString(R.string.no_budget);
        }
        if (hasKnowledge) {
            goodKnowledgeSentence = getString(R.string.yes_knowledge);
            badKnowledgeSentence = "";
        } else {
            goodKnowledgeSentence = "";
            badKnowledgeSentence = getString(R.string.no_knowledge);
        }
        if (hasEntertainment) {
            goodEntertainmentSentence = getString(R.string.yes_entertainment);
            badEntertainmentSentence = "";
        } else {
            goodEntertainmentSentence = "";
            badEntertainmentSentence = getString(R.string.no_entertainment);
        }
        if (hasCaution) {
            goodCautionSentence = getString(R.string.yes_caution);
            badCautionSentence = "";
        } else {
            goodCautionSentence = "";
            badCautionSentence = getString(R.string.no_caution);
        }
        if (hasStrength) {
            goodStrengthSentence = getString(R.string.yes_strength);
            badStrengthSentence = "";
        } else {
            goodStrengthSentence = "";
            badStrengthSentence = getString(R.string.no_strength);
        }
        if (hasFlexibility) {
            goodFlexibilitySentence = getString(R.string.yes_flexibility);
            badFlexibilitySentence = "";
        } else {
            goodFlexibilitySentence = "";
            badFlexibilitySentence = getString(R.string.no_flexibility);
        }
        if (hasSnacks) {
            goodSnacksSentence = getString(R.string.yes_snacks);
            badSnacksSentence = "";
        } else {
            goodSnacksSentence = "";
            badSnacksSentence = getString(R.string.no_snacks);
        }
        if (hasMerchandising) {
            goodMerchandisingSentence = getString(R.string.yes_merchandising);
            badMerchandisingSentence = "";
        } else {
            goodMerchandisingSentence = "";
            badMerchandisingSentence = getString(R.string.no_merchandising);
        }
        if (hasAnimals && isSuccessful) {
            goodAnimalsSentence = getString(R.string.yes_animals_good);
            averageAnimalsSentence = "";
            badAnimalsSentence = "";
        } else if (hasAnimals) {
            goodAnimalsSentence = "";
            averageAnimalsSentence = "";
            badAnimalsSentence = getString(R.string.yes_animals_bad);
        } else {
            goodAnimalsSentence = "";
            averageAnimalsSentence = getString(R.string.no_animals);
            badAnimalsSentence = "";
        }
        if (hasFreaks && isSuccessful) {
            goodFreaksSentence = getString(R.string.yes_freaks_good);
            averageFreaksSentence = "";
            badFreaksSentence = "";
        } else if (hasFreaks) {
            goodFreaksSentence = "";
            averageFreaksSentence = "";
            badFreaksSentence = getString(R.string.yes_freaks_bad);
        } else {
            goodFreaksSentence = "";
            averageFreaksSentence = getString(R.string.no_freaks);
            badFreaksSentence = "";
        }

        String article = goodPrologue + badPrologue + "\n\n" + getString(R.string.introduction_good);
        article += goodBudgetSentence + goodKnowledgeSentence + goodEntertainmentSentence;
        article += goodCautionSentence + goodStrengthSentence + goodFlexibilitySentence;
        article += goodSnacksSentence + goodMerchandisingSentence + goodAnimalsSentence;
        article += averageAnimalsSentence + goodFreaksSentence + averageFreaksSentence;
        if (isSuccessful) {
            article += "\n\n" + goodEpilogue;
        } else {
            article += "\n\n" + getString(R.string.introduction_bad) + badBudgetSentence;
            article += badKnowledgeSentence + badEntertainmentSentence + badCautionSentence;
            article += badStrengthSentence + badFlexibilitySentence + badSnacksSentence;
            article += badMerchandisingSentence + badAnimalsSentence + badFreaksSentence;
            article += "\n\n" + badEpilogue;
        }

        TextView articleTextView = findViewById(R.id.article);
        articleTextView.setText(article);
    }
}