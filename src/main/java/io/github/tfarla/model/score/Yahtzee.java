package io.github.tfarla.model.score;

import io.github.tfarla.model.Dice;

public class Yahtzee extends Score {
    public Yahtzee(Dice dices[]) {
        super(dices);
    }

    @Override
    public int getTotal() {
        return Score.YAHTZEE;
    }
}
