package io.github.tfarla.model.scoreboard;

import io.github.tfarla.model.score.Score;

public interface Board {
    public int getTotal();

    public void add(Score score);
}
