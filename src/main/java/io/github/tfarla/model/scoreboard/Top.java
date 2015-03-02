package io.github.tfarla.model.scoreboard;

import io.github.tfarla.model.score.Points;
import io.github.tfarla.model.score.Score;

import java.util.ArrayList;

public class Top implements Board {
    private ArrayList<Score> scores;

    public Top() {
        this.scores = new ArrayList<Score>();
    }

    public void add(Score score) {
        scores.add(score);
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
        if (getSubTotal() >= Points.MINIMAL_FOR_TOP_BONUS.get())
            return Points.TOP_BONUS.get();
        else
            return 0;
    }
}
