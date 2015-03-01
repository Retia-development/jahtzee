package io.github.tfarla.model.score;

import io.github.tfarla.model.Dice;

public class ThreeOfAKind implements Bottom {
    private Dice dices[];

    public ThreeOfAKind(Dice dices[]) {
        this.dices = dices;
    }

    public int getTotal() {
        int total = 0;
        for (Dice dice : dices)
            total += dice.getPipes();

        return total;
    }
}
