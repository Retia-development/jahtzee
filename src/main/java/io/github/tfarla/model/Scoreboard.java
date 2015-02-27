package io.github.tfarla.model;

import io.github.tfarla.model.score.Score;

import java.util.ArrayList;

public class Scoreboard {
    private ArrayList<Score> scores;

    public Scoreboard(ArrayList<Score> scores) {
        this.scores = scores;
    }

    public void add(Score score) {
        this.scores.add(score);
    }

    public int getTotalPoints() {
        int total = 0;
        for (Score score : scores)
            total += score.getTotal();

        return total;
    }
}
