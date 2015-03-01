package io.github.tfarla.model;

import io.github.tfarla.model.score.Bottom;
import io.github.tfarla.model.score.Score;
import io.github.tfarla.model.score.Top;

import java.util.ArrayList;

public class Scoreboard {
    private ArrayList<Top> topScore;
    private ArrayList<Bottom> bottomScore;

    public Scoreboard() {
        this.topScore = new ArrayList<Top>();
        this.bottomScore = new ArrayList<Bottom>();
    }

    public void add(Top score) {
        this.topScore.add(score);
    }

    public void add(Bottom score) {
        this.bottomScore.add(score);
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
}
