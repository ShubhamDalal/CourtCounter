package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int aTeamScore= 0;
int bTeamScore= 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

// Using Enums to Display Action via Switch
    public enum ActionDisplay {
        TEAM_A,
        TEAM_B,
        RESET
    }

    ActionDisplay teamA = ActionDisplay.TEAM_A;
    ActionDisplay teamB = ActionDisplay.TEAM_B;
    ActionDisplay reset = ActionDisplay.RESET;

// These Methods are for Team A
    public void add3ToTeamA(View view){
        aTeamScore+=3;
        display(teamA);
    }
    public void add2ToTeamA(View view){
        aTeamScore+=2;
        display(teamA);
    }
    public void freeToTeamA(View view){
        aTeamScore+=1;
        display(teamA);
    }

// These Methods are for Team B
    public void add3ToTeamB(View view){
        bTeamScore+=3;
        display(teamB);
    }
    public void add2ToTeamB(View view){
        bTeamScore+=2;
        display(teamB);
    }
    public void freeToTeamB(View view){
        bTeamScore+=1;
        display(teamB);
    }

//    This Method Resets Score of both the teams.
    public void resetTeams(View view){
        aTeamScore =0;
        bTeamScore =0;
        display(reset);
    }

// These Method displays the Score
    private void display(ActionDisplay Action) {
        TextView aTeamTextView = (TextView) findViewById(R.id.aTeam);
        TextView bTeamTextView = (TextView) findViewById(R.id.bTeam);

        switch(Action){
            case TEAM_A:
                aTeamTextView.setText("" + aTeamScore);
                break;

            case TEAM_B:
                bTeamTextView.setText("" + bTeamScore);
                break;

            case RESET:
                aTeamTextView.setText(""+aTeamScore);
                bTeamTextView.setText(""+bTeamScore);
                break;
        }
    }
}
