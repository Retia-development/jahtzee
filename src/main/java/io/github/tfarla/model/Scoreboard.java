package io.github.tfarla.model;

import io.github.tfarla.model.score.ScoreImpl;

import java.util.ArrayList;

public class Scoreboard {
    private ArrayList<ScoreImpl> scores;

    public Scoreboard(ArrayList<ScoreImpl> scores) {
        this.scores = scores;
    }

    public void add(ScoreImpl score) {
        this.scores.add(score);
    }

    public int getTotalPoints() {
        int total = 0;
        for (ScoreImpl score : scores)
            total += score.getTotal();

        return total;
    }
}
