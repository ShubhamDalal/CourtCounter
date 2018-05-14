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
// These Methods are for Team A
    public void add3ToTeamA(View view){
        aTeamScore+=3;
        display('A');
    }
    public void add2ToTeamA(View view){
        aTeamScore+=2;
        display('A');
    }
    public void freeToTeamA(View view){
        aTeamScore+=1;
        display('A');
    }

// These Methods are for Team B
    public void add3ToTeamB(View view){
        bTeamScore+=3;
        display('B');
    }
    public void add2ToTeamB(View view){
        bTeamScore+=2;
        display('B');
    }
    public void freeToTeamB(View view){
        bTeamScore+=1;
        display('B');
    }

//    This Method Resets Score of both the teams.
    public void resetTeams(View view){
        aTeamScore =0;
        bTeamScore =0;
        display('R');
    }

// These Method displays the Score
    private void display(char team) {
        TextView aTeamTextView = (TextView) findViewById(R.id.aTeam);
        TextView bTeamTextView = (TextView) findViewById(R.id.bTeam);
        switch(team){
            case 'A':
                aTeamTextView.setText("" + aTeamScore);
                break;

            case 'B':
                bTeamTextView.setText("" + bTeamScore);
                break;

            case 'R':
                aTeamTextView.setText(""+aTeamScore);
                bTeamTextView.setText(""+bTeamScore);
                break;
        }
    }
}
