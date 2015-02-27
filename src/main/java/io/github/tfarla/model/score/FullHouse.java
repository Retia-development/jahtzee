package io.github.tfarla.model.score;

import io.github.tfarla.model.Dice;

public class FullHouse extends ScoreImpl {
    public FullHouse(Dice dices[]) {
        super(dices);
    }

    @Override
    public int getTotal() {
        return Points.FULL_HOUSE.get();
    }
}
