package io.github.tfarla.model.score;

import io.github.tfarla.model.Dice;

public class SmallStreet implements Bottom {
    private Dice dices[];

    public SmallStreet(Dice dices[]) {
        this.dices = dices;
    }

    public int getTotal() {
        return Points.SMALL_STREET.get();
    }
}
