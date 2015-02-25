package io.github.tfarla.model.score;

import io.github.tfarla.model.Dice;

public class SmallStreet extends Score {
    public SmallStreet(Dice dices[]) {
        super(dices);
    }

    @Override
    public int getTotal() {
        return Score.SMALL_STREET;
    }
}
