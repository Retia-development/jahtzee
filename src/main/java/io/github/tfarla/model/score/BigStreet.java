package io.github.tfarla.model.score;

import io.github.tfarla.model.Dice;

public class BigStreet implements Score {
    private Dice dices[];

    public BigStreet(Dice dices[]) {
        this.dices = dices;
    }

    public int getTotal() {
        return Points.BIG_STREET.get();
    }
    public boolean isBottom() {
        return true;
    }
}
