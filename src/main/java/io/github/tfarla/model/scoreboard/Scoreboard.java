package io.github.tfarla.model.scoreboard;

import io.github.tfarla.model.score.Score;

public class Scoreboard {
    private Top top;
    private Bottom bottom;

    public Scoreboard() {
        this.top = new Top();
        this.bottom = new Bottom();
    }

    public int getTotal() {
        return top.getTotal() + bottom.getTotal();
    }

    public Top getTop() {
        return top;
    }

    public Bottom getBottom() {
        return bottom;
    }

    public void add(Score score) {
        Board board = getBoardToAdd(score);
        board.add(score);
    }

    private Board getBoardToAdd(Score score) {
        if (score.isBottom())
            return bottom;

        return top;
    }
}
