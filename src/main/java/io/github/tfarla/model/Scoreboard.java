package io.github.tfarla.model;

import io.github.tfarla.model.score.Score;

import java.util.ArrayList;

public class Scoreboard {
    private ArrayList<Score> topScore;
    private ArrayList<Score> bottomScore;

    public Scoreboard() {
        this.topScore = new ArrayList<Score>();
        this.bottomScore = new ArrayList<Score>();
    }

    public void add(Score score) {
        if (score.isBottom())
            addScoreToBottom(score);
        else
            addScoreToTop(score);
    }

    public int getTotalPoints() {
        int total = 0;
        for (Score score : bottomScore)
            total += score.getTotal();

        return total;
    }

    public int getTopTotalPoints() {
        int total = 0;
        for (Score score : topScore)
            total += score.getTotal();

        return total;
    }

    private void addScoreToTop(Score score) {
        this.topScore.add(score);
    }

    private void addScoreToBottom(Score score) {
        this.bottomScore.add(score);
    }
}
