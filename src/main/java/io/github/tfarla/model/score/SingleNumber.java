package io.github.tfarla.model.score;

import io.github.tfarla.model.Dice;
import io.github.tfarla.util.Calc;

public class SingleNumber implements Score {
    private Dice dices[];

    public SingleNumber(Dice dices[]) {
        this.dices = dices;
    }

    public int getTotal() {
        return Calc.sum(dices);
    }

    public boolean isBottom() {
        return false;
    }
}
