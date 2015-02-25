package io.github.tfarla.model.score;

import io.github.tfarla.model.Dice;

public class Score {
    final static int YAHTZEE = 50;
    final static int SMALL_STREET = 30;
    final static int BIG_STREET = 40;
    final static int FULL_HOUSE = 25;

    private Dice dices[];

    public Score(Dice dices[]) {
        this.dices = dices;
    }

    public int getTotal() {
        int total = 0;
        for (Dice dice : dices)
            total += dice.getPipes();

        return total;
    }
}
