package io.github.tfarla.model.score;

import io.github.tfarla.model.Dice;

public class FullHouse extends Score {
    public FullHouse(Dice dices[]) {
        super(dices);
    }

    @Override
    public int getTotal() {
        return Score.FULL_HOUSE;
    }
}
