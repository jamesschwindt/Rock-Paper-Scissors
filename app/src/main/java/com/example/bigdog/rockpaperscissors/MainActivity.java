package com.example.bigdog.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int user = 0;
    private int compPoints = 0;
    private int userPoints = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void rock(View view) {
        user = 1;
        decideWinner();
    }

    public void paper(View view) {
        user = 2;
        decideWinner();
    }

    public void scissors(View view) {
        user = 3;
        decideWinner();
    }
    private void decideWinner() {
        Random randy = new Random();
        int comp = randy.nextInt(3);
        TextView pointUser = (TextView) findViewById(R.id.score);
       if (user == 1 && comp == 3) {
            userPoints++;
            pointUser.setText("Your score: " + userPoints);
            //win
        } else if (user == 1 && comp == 2) {
            compPoints++;
           pointUser.setText("Computer score: " + compPoints);
            //lose
        } else if (user == 2 && comp == 1) {
            userPoints++;
           pointUser.setText("Your score: " + userPoints);
            //win
        } else if (user == 2 && comp == 3) {
            compPoints++;
           pointUser.setText("Computer score: " + compPoints);
            //lose
        } else if (user == 3 && comp == 1) {
            compPoints++;
           pointUser.setText("Computer score: " + compPoints);
            //lose
        } else if (user == 3 && comp == 2) {
            userPoints++;
           pointUser.setText("Your score: " + userPoints);
            //win
        }


    }
}
