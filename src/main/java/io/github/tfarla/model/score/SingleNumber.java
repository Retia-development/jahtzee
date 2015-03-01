package io.github.tfarla.model.score;

import io.github.tfarla.model.Dice;

public class SingleNumber implements Top {
    private Dice dices[];

    public SingleNumber(Dice dices[]) {
        this.dices = dices;
    }

    public int getTotal() {
        int total = 0;
        for (Dice dice : dices)
            total += dice.getPipes();

        return total;
    }
}
