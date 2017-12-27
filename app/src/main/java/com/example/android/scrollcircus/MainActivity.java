package com.example.android.scrollcircus;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    boolean firstTry = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout firstResults = findViewById(R.id.first_results);
        firstResults.setVisibility(View.GONE);
        LinearLayout lastTry = findViewById(R.id.last_try);
        lastTry.setVisibility(View.GONE);
        LinearLayout lastResults = findViewById(R.id.last_results);
        lastResults.setVisibility(View.GONE);
    }

    int points;
    int buttonClicked = 0;
    int totalPoints = 0;
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
        Switch budget2 = findViewById(R.id.budget2);
        // Allocate points to Switch
        if (budget.isChecked()) {
            if (points >= 25) {
                budget.setChecked(true);
                budget2.setChecked(true);
                points = points - 25;
                hasBudget = true;
            } else {
                budget.setChecked(false);
                budget2.setChecked(false);
                hasBudget = false;
            }
        } else {
            budget.setChecked(false);
            budget2.setChecked(false);
            points = points + 25;
            hasBudget = false;
        }
        // Show new resources number
        TextView numberOfPoints = findViewById(R.id.number_of_points);
        numberOfPoints.setText("" + points);
    }

    public void addKnowledge(View view) {
        Switch knowledge = findViewById(R.id.knowledge);
        Switch knowledge2 = findViewById(R.id.knowledge2);
        if (knowledge.isChecked()) {
            if (points >= 20) {
                knowledge.setChecked(true);
                knowledge2.setChecked(true);
                points = points - 20;
                hasKnowledge = true;
            } else {
                knowledge.setChecked(false);
                knowledge2.setChecked(false);
                hasKnowledge = false;
            }
        } else {
            knowledge.setChecked(false);
            knowledge2.setChecked(false);
            points = points + 20;
            hasKnowledge = false;
        }
        TextView numberOfPoints = findViewById(R.id.number_of_points);
        numberOfPoints.setText("" + points);
    }

    public void addEntertainment(View view) {
        Switch entertainment = findViewById(R.id.entertainment);
        Switch entertainment2 = findViewById(R.id.entertainment2);
        if (entertainment.isChecked()) {
            if (points >= 20) {
                entertainment.setChecked(true);
                entertainment2.setChecked(true);
                points = points - 20;
                hasEntertainment = true;
            } else {
                entertainment.setChecked(false);
                entertainment2.setChecked(false);
                hasEntertainment = false;
            }
        } else {
            entertainment.setChecked(false);
            entertainment2.setChecked(false);
            points = points + 20;
            hasEntertainment = false;
        }
        TextView numberOfPoints = findViewById(R.id.number_of_points);
        numberOfPoints.setText("" + points);
    }

    public void addCaution(View view) {
        Switch caution = findViewById(R.id.caution);
        Switch caution2 = findViewById(R.id.caution2);
        if (caution.isChecked()) {
            if (points >= 15) {
                caution.setChecked(true);
                caution2.setChecked(true);
                points = points - 15;
                hasCaution = true;
            } else {
                caution.setChecked(false);
                caution2.setChecked(false);
                hasCaution = false;
            }
        } else {
            caution.setChecked(false);
            caution2.setChecked(false);
            points = points + 15;
            hasCaution = false;
        }
        TextView numberOfPoints = findViewById(R.id.number_of_points);
        numberOfPoints.setText("" + points);
    }

    public void addStrength(View view) {
        Switch strength = findViewById(R.id.strength);
        Switch strength2 = findViewById(R.id.strength2);
        if (strength.isChecked()) {
            if (points >= 15) {
                strength.setChecked(true);
                strength2.setChecked(true);
                points = points - 15;
                hasStrength = true;
            } else {
                strength.setChecked(false);
                strength2.setChecked(false);
                hasStrength = false;
            }
        } else {
            strength.setChecked(false);
            strength2.setChecked(false);
            points = points + 15;
            hasStrength = false;
        }
        TextView numberOfPoints = findViewById(R.id.number_of_points);
        numberOfPoints.setText("" + points);
    }

    public void addFlexibility(View view) {
        Switch flexibility = findViewById(R.id.flexibility);
        Switch flexibility2 = findViewById(R.id.flexibility2);
        if (flexibility.isChecked()) {
            if (points >= 10) {
                flexibility.setChecked(true);
                flexibility2.setChecked(true);
                points = points - 10;
                hasFlexibility = true;
            } else {
                flexibility.setChecked(false);
                flexibility2.setChecked(false);
                hasFlexibility = false;
            }
        } else {
            flexibility.setChecked(false);
            flexibility2.setChecked(false);
            points = points + 10;
            hasFlexibility = false;
        }
        TextView numberOfPoints = findViewById(R.id.number_of_points);
        numberOfPoints.setText("" + points);
    }

    public void addSnacks(View view) {
        Switch snacks = findViewById(R.id.snacks);
        Switch snacks2 = findViewById(R.id.snacks2);
        if (snacks.isChecked()) {
            if (points >= 10) {
                snacks.setChecked(true);
                snacks2.setChecked(true);
                points = points - 10;
                hasSnacks = true;
            } else {
                snacks.setChecked(false);
                snacks2.setChecked(false);
                hasSnacks = false;
            }
        } else {
            snacks.setChecked(false);
            snacks2.setChecked(false);
            points = points + 10;
            hasSnacks = false;
        }
        TextView numberOfPoints = findViewById(R.id.number_of_points);
        numberOfPoints.setText("" + points);
    }

    public void addMerchandising(View view) {
        Switch merchandising = findViewById(R.id.merchandising);
        Switch merchandising2 = findViewById(R.id.merchandising2);
        if (merchandising.isChecked()) {
            if (points >= 10) {
                merchandising.setChecked(true);
                merchandising2.setChecked(true);
                points = points - 10;
                hasMerchandising = true;
            } else {
                merchandising.setChecked(false);
                merchandising2.setChecked(false);
                hasMerchandising = false;
            }
        } else {
            merchandising.setChecked(false);
            merchandising2.setChecked(false);
            points = points + 10;
            hasMerchandising = false;
        }
        TextView numberOfPoints = findViewById(R.id.number_of_points);
        numberOfPoints.setText("" + points);
    }

    public void addAnimals(View view) {
        Switch animals = findViewById(R.id.animals);
        Switch animals2 = findViewById(R.id.animals2);
        if (animals.isChecked()) {
            if (points >= 5) {
                animals.setChecked(true);
                animals2.setChecked(true);
                points = points - 5;
                hasAnimals = true;
            } else {
                animals.setChecked(false);
                animals2.setChecked(false);
                hasAnimals = false;
            }
        } else {
            animals.setChecked(false);
            animals2.setChecked(false);
            points = points + 5;
            hasAnimals = false;
        }
        TextView numberOfPoints = findViewById(R.id.number_of_points);
        numberOfPoints.setText("" + points);
    }

    public void addFreaks(View view) {
        Switch freaks = findViewById(R.id.freaks);
        Switch freaks2 = findViewById(R.id.freaks2);
        if (freaks.isChecked()) {
            if (points >= 5) {
                freaks.setChecked(true);
                freaks2.setChecked(true);
                points = points - 5;
                hasFreaks = true;
            } else {
                freaks.setChecked(false);
                freaks2.setChecked(false);
                hasFreaks = false;
            }
        } else {
            freaks.setChecked(false);
            freaks2.setChecked(false);
            points = points + 5;
            hasFreaks = false;
        }
        TextView numberOfPoints = findViewById(R.id.number_of_points);
        numberOfPoints.setText("" + points);
    }

    private String composeArticle() {

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

        // Create the article body
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

        return article;
    }

    public void showFirstResults(View view) {

        // Make the results visible
        LinearLayout firstResults = findViewById(R.id.first_results);
        firstResults.setVisibility(View.VISIBLE);

        // Display the article body
        TextView firstArticle = findViewById(R.id.first_article);
        firstArticle.setText(composeArticle());
    }

    public void startOver(View view) {
        recreate();
        // Make first switches unchecked
        Switch budget = findViewById(R.id.budget);
        budget.setChecked(false);
        Switch knowledge = findViewById(R.id.knowledge);
        knowledge.setChecked(false);
        Switch entertainment = findViewById(R.id.entertainment);
        entertainment.setChecked(false);
        Switch caution = findViewById(R.id.caution);
        caution.setChecked(false);
        Switch strength = findViewById(R.id.strength);
        strength.setChecked(false);
        Switch flexibility = findViewById(R.id.flexibility);
        flexibility.setChecked(false);
        Switch snacks = findViewById(R.id.snacks);
        snacks.setChecked(false);
        Switch merchandising = findViewById(R.id.merchandising);
        merchandising.setChecked(false);
        Switch animals = findViewById(R.id.animals);
        animals.setChecked(false);
        Switch freaks = findViewById(R.id.freaks);
        freaks.setChecked(false);

        // Make last switches unchecked
        Switch budget2 = findViewById(R.id.budget2);
        budget2.setChecked(false);
        Switch knowledge2 = findViewById(R.id.knowledge2);
        knowledge2.setChecked(false);
        Switch entertainment2 = findViewById(R.id.entertainment2);
        entertainment2.setChecked(false);
        Switch caution2 = findViewById(R.id.caution2);
        caution2.setChecked(false);
        Switch strength2 = findViewById(R.id.strength2);
        strength2.setChecked(false);
        Switch flexibility2 = findViewById(R.id.flexibility2);
        flexibility2.setChecked(false);
        Switch snacks2 = findViewById(R.id.snacks2);
        snacks2.setChecked(false);
        Switch merchandising2 = findViewById(R.id.merchandising2);
        merchandising2.setChecked(false);
        Switch animals2 = findViewById(R.id.animals2);
        animals2.setChecked(false);
        Switch freaks2 = findViewById(R.id.freaks2);
        freaks2.setChecked(false);
    }

    private int calculateIncome() {

        int newPoints = 0;

        if (hasBudget) {
            newPoints += 10;
        }
        if (hasKnowledge) {
            newPoints += 10;
        }
        if (hasEntertainment) {
            newPoints += 15;
        }
        if (hasCaution) {
            newPoints += 15;
        }
        if (hasStrength) {
            newPoints += 15;
        }
        if (hasFlexibility) {
            newPoints += 15;
        }
        if (hasSnacks) {
            newPoints += 5;
        }
        if (hasMerchandising) {
            newPoints += 5;
        }
        return newPoints;
    }

    public void proceed(View view) {
        totalPoints = points + calculateIncome();
        TextView numberOfTotalPoints = findViewById(R.id.number_of_total_points);
        numberOfTotalPoints.setText("" + totalPoints);
        LinearLayout lastTry = findViewById(R.id.last_try);
        lastTry.setVisibility(View.VISIBLE);
    }

    public void addBudget2(View view) {
        Switch budget = findViewById(R.id.budget);
        Switch budget2 = findViewById(R.id.budget2);
        if (budget2.isChecked()) {
            if (totalPoints >= 25) {
                budget.setChecked(true);
                budget2.setChecked(true);
                totalPoints = totalPoints - 25;
                hasBudget = true;
            } else {
                budget.setChecked(false);
                budget2.setChecked(false);
                hasBudget = false;
            }
        } else {
            budget.setChecked(false);
            budget2.setChecked(false);
            totalPoints = totalPoints + 25;
            hasBudget = false;
        }
        TextView numberOfTotalPoints = findViewById(R.id.number_of_total_points);
        numberOfTotalPoints.setText("" + totalPoints);
    }

    public void addKnowledge2(View view) {
        Switch knowledge = findViewById(R.id.knowledge);
        Switch knowledge2 = findViewById(R.id.knowledge2);
        if (knowledge2.isChecked()) {
            if (totalPoints >= 20) {
                knowledge.setChecked(true);
                knowledge2.setChecked(true);
                totalPoints = totalPoints - 20;
                hasKnowledge = true;
            } else {
                knowledge.setChecked(false);
                knowledge2.setChecked(false);
                hasKnowledge = false;
            }
        } else {
            knowledge.setChecked(false);
            knowledge2.setChecked(false);
            totalPoints = totalPoints + 20;
            hasKnowledge = false;
        }
        TextView numberOfTotalPoints = findViewById(R.id.number_of_total_points);
        numberOfTotalPoints.setText("" + totalPoints);
    }

    public void addEntertainment2(View view) {
        Switch entertainment = findViewById(R.id.entertainment);
        Switch entertainment2 = findViewById(R.id.entertainment2);
        if (entertainment2.isChecked()) {
            if (totalPoints >= 20) {
                entertainment.setChecked(true);
                entertainment2.setChecked(true);
                totalPoints = totalPoints - 20;
                hasEntertainment = true;
            } else {
                entertainment.setChecked(false);
                entertainment2.setChecked(false);
                hasEntertainment = false;
            }
        } else {
            entertainment.setChecked(false);
            entertainment2.setChecked(false);
            totalPoints = totalPoints + 20;
            hasEntertainment = false;
        }
        TextView numberOfTotalPoints = findViewById(R.id.number_of_total_points);
        numberOfTotalPoints.setText("" + totalPoints);
    }

    public void addCaution2(View view) {
        Switch caution = findViewById(R.id.caution);
        Switch caution2 = findViewById(R.id.caution2);
        if (caution2.isChecked()) {
            if (totalPoints >= 15) {
                caution.setChecked(true);
                caution2.setChecked(true);
                totalPoints = totalPoints - 15;
                hasCaution = true;
            } else {
                caution.setChecked(false);
                caution2.setChecked(false);
                hasCaution = false;
            }
        } else {
            caution.setChecked(false);
            caution2.setChecked(false);
            totalPoints = totalPoints + 15;
            hasCaution = false;
        }
        TextView numberOfTotalPoints = findViewById(R.id.number_of_total_points);
        numberOfTotalPoints.setText("" + totalPoints);
    }

    public void addStrength2(View view) {
        Switch strength = findViewById(R.id.strength);
        Switch strength2 = findViewById(R.id.strength2);
        if (strength2.isChecked()) {
            if (totalPoints >= 15) {
                strength.setChecked(true);
                strength2.setChecked(true);
                totalPoints = totalPoints - 15;
                hasStrength = true;
            } else {
                strength.setChecked(false);
                strength2.setChecked(false);
                hasStrength = false;
            }
        } else {
            strength.setChecked(false);
            strength2.setChecked(false);
            totalPoints = totalPoints + 15;
            hasStrength = false;
        }
        TextView numberOfTotalPoints = findViewById(R.id.number_of_total_points);
        numberOfTotalPoints.setText("" + totalPoints);
    }

    public void addFlexibility2(View view) {
        Switch flexibility = findViewById(R.id.flexibility);
        Switch flexibility2 = findViewById(R.id.flexibility2);
        if (flexibility2.isChecked()) {
            if (totalPoints >= 10) {
                flexibility.setChecked(true);
                flexibility2.setChecked(true);
                totalPoints = totalPoints - 10;
                hasFlexibility = true;
            } else {
                flexibility.setChecked(false);
                flexibility2.setChecked(false);
                hasFlexibility = false;
            }
        } else {
            flexibility.setChecked(false);
            flexibility2.setChecked(false);
            totalPoints = totalPoints + 10;
            hasFlexibility = false;
        }
        TextView numberOfTotalPoints = findViewById(R.id.number_of_total_points);
        numberOfTotalPoints.setText("" + totalPoints);
    }

    public void addSnacks2(View view) {
        Switch snacks = findViewById(R.id.snacks);
        Switch snacks2 = findViewById(R.id.snacks2);
        if (snacks2.isChecked()) {
            if (totalPoints >= 10) {
                snacks.setChecked(true);
                snacks2.setChecked(true);
                totalPoints = totalPoints - 10;
                hasSnacks = true;
            } else {
                snacks.setChecked(false);
                snacks2.setChecked(false);
                hasSnacks = false;
            }
        } else {
            snacks.setChecked(false);
            snacks2.setChecked(false);
            totalPoints = totalPoints + 10;
            hasSnacks = false;
        }
        TextView numberOfTotalPoints = findViewById(R.id.number_of_total_points);
        numberOfTotalPoints.setText("" + totalPoints);
    }

    public void addMerchandising2(View view) {
        Switch merchandising = findViewById(R.id.merchandising);
        Switch merchandising2 = findViewById(R.id.merchandising2);
        if (merchandising2.isChecked()) {
            if (totalPoints >= 10) {
                merchandising.setChecked(true);
                merchandising2.setChecked(true);
                totalPoints = totalPoints - 10;
                hasMerchandising = true;
            } else {
                merchandising.setChecked(false);
                merchandising2.setChecked(false);
                hasMerchandising = false;
            }
        } else {
            merchandising.setChecked(false);
            merchandising2.setChecked(false);
            totalPoints = totalPoints + 10;
            hasMerchandising = false;
        }
        TextView numberOfTotalPoints = findViewById(R.id.number_of_total_points);
        numberOfTotalPoints.setText("" + totalPoints);
    }

    public void addAnimals2(View view) {
        Switch animals = findViewById(R.id.animals);
        Switch animals2 = findViewById(R.id.animals2);
        if (animals2.isChecked()) {
            if (totalPoints >= 5) {
                animals.setChecked(true);
                animals2.setChecked(true);
                totalPoints = totalPoints - 5;
                hasAnimals = true;
            } else {
                animals.setChecked(false);
                animals2.setChecked(false);
                hasAnimals = false;
            }
        } else {
            animals.setChecked(false);
            animals2.setChecked(false);
            totalPoints = totalPoints + 5;
            hasAnimals = false;
        }
        TextView numberOfTotalPoints = findViewById(R.id.number_of_total_points);
        numberOfTotalPoints.setText("" + totalPoints);
    }

    public void addFreaks2(View view) {
        Switch freaks = findViewById(R.id.freaks);
        Switch freaks2 = findViewById(R.id.freaks2);
        if (freaks2.isChecked()) {
            if (totalPoints >= 5) {
                freaks.setChecked(true);
                freaks2.setChecked(true);
                totalPoints = totalPoints - 5;
                hasFreaks = true;
            } else {
                freaks.setChecked(false);
                freaks2.setChecked(false);
                hasFreaks = false;
            }
        } else {
            freaks.setChecked(false);
            freaks2.setChecked(false);
            totalPoints = totalPoints + 5;
            hasFreaks = false;
        }
        TextView numberOfTotalPoints = findViewById(R.id.number_of_total_points);
        numberOfTotalPoints.setText("" + totalPoints);
    }

    public void showLastResults(View view) {

        // Determine success depending on resources availability
        if (hasBudget && hasKnowledge && hasEntertainment && hasCaution && hasStrength && hasFlexibility && hasSnacks && hasMerchandising) {
            isSuccessful = true;
        } else {
            isSuccessful = false;
        }

        // Make the results visible
        LinearLayout lastResults = findViewById(R.id.last_results);
        lastResults.setVisibility(View.VISIBLE);

        // Display the article body
        TextView lastArticle = findViewById(R.id.last_article);
        lastArticle.setText(composeArticle());

        // Locate the last Views
        TextView lastStep = findViewById(R.id.last_step);
        ImageView hat = findViewById(R.id.hat);

        if (isSuccessful) {
            lastStep.setText(getText(R.string.congratulations));
        } else {
            lastStep.setText(getText(R.string.game_over));
            hat.setVisibility(View.GONE);
        }
    }
}