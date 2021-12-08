package com.example.android.practiceset2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int pointsA=0;
    int pointsB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    //methods for team A
    public void incrementABy1(View view){
        pointsA+=1;
        displayForTeamA(pointsA);
    }
    public void incrementABy2(View view){
        pointsA+=2;
        displayForTeamA(pointsA);
    }
    public void incrementABy3(View view){
        pointsA+=3;
        displayForTeamA(pointsA);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    //methods for team B
    public void incrementBBy1(View view){
        pointsB+=1;
        displayForTeamB(pointsB);
    }
    public void incrementBBy2(View view){
        pointsB+=2;
        displayForTeamB(pointsB);
    }
    public void incrementBBy3(View view){
        pointsB+=3;
        displayForTeamB(pointsB);
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    //reset
    public void reset(View view){
        pointsA=0;
        pointsB=0;
        displayForTeamA(pointsA);
        displayForTeamB(pointsB);
    }


}