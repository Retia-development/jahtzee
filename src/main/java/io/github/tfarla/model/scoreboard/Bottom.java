package io.github.tfarla.model.scoreboard;

import io.github.tfarla.model.score.Points;
import io.github.tfarla.model.score.Score;
import io.github.tfarla.model.score.Yahtzee;

import java.util.ArrayList;

public class Bottom implements Board {
    private ArrayList<Score> scores;

    public Bottom() {
        this.scores = new ArrayList<Score>();
    }

    public void add(Score score) {
        this.scores.add(score);
    }

    public int getTotal() {
        return getSubTotal() + getBonusTotal();
    }

    public int getSubTotal() {
        int total = 0;
        for (Score score : scores)
            total += score.getTotal();

        return total;
    }

    public int getBonusTotal() {
        int total = 0;
        boolean shouldAdd = false;
        for (Score score : scores)
            if (isYahtzee(score))
                if (shouldAdd)
                    total += Points.YAHTZEE_BONUS.get();
                else
                    shouldAdd = true;

        return total;
    }

    private boolean isYahtzee(Score score) {
        return score.getClass() == Yahtzee.class;
    }
}
