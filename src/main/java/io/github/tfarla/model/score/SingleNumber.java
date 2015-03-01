package io.github.tfarla.model.score;

import io.github.tfarla.model.Dice;

public class SingleNumber implements Top {
    private int chosen;
    private Dice dices[];

    public SingleNumber(Dice dices[], int chosen) {
        this.dices = dices;
        this.chosen = chosen;
    }

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
