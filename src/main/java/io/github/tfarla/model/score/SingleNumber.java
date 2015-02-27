package io.github.tfarla.model.score;

import io.github.tfarla.model.Dice;

public class SingleNumber extends ScoreImpl {
    private int chosen;

    public SingleNumber(Dice dices[], int chosen) {
        super(dices);
        this.chosen = chosen;
    }

    @Override
    public int getTotal() {
        int total = 0;
        for (Dice dice : dices)
            if (isChosen(dice))
                total += dice.getPipes();

        return total;
    }

    private boolean isChosen(Dice dice) {
        return dice.getPipes() == chosen;
    }
}
