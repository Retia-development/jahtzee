package io.github.tfarla.model.score;

import io.github.tfarla.model.Dice;
import io.github.tfarla.util.Calc;

public class ThreeOfAKind implements Bottom {
    private Dice dices[];

    public ThreeOfAKind(Dice dices[]) {
        this.dices = dices;
    }

    public int getTotal() {
        return Calc.sum(dices);
    }
}
