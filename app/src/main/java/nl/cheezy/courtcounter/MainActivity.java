package nl.cheezy.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    final int threePointer = 3;
    final int twoPointer = 2;
    final int freeThrowPoint = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeA(View view) {
        scoreTeamA = scoreTeamA + threePointer;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoA(View view) {
        scoreTeamA = scoreTeamA + twoPointer;
        displayForTeamA(scoreTeamA);
    }

    public void addOneA(View view) {
        scoreTeamA = scoreTeamA + freeThrowPoint;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team B.
     */

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeB(View view) {
        scoreTeamB = scoreTeamB + threePointer;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoB(View view) {
        scoreTeamB = scoreTeamB + twoPointer;
        displayForTeamB(scoreTeamB);
    }

    public void addOneB(View view) {
        scoreTeamB = scoreTeamB + freeThrowPoint;
        displayForTeamB(scoreTeamB);
    }

    public void resetPoints(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
