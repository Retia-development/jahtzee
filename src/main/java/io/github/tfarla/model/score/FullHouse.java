package io.github.tfarla.model.score;

import io.github.tfarla.model.Dice;

public class FullHouse implements Score {
    private Dice dices[];

    public FullHouse(Dice dices[]) {
        this.dices = dices;
    }

    public int getTotal() {
        return Points.FULL_HOUSE.get();
    }
}
