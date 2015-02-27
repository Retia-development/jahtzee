package io.github.tfarla.model.score;

import io.github.tfarla.model.Dice;

public class Yahtzee extends ScoreImpl {
    public Yahtzee(Dice dices[]) {
        super(dices);
    }

    @Override
    public int getTotal() {
        return Points.YAHTZEE.get();
    }
}
