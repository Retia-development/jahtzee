package io.github.tfarla.model.score;

import io.github.tfarla.model.Dice;

public class BigStreet extends Score {
    public BigStreet(Dice dices[]) {
        super(dices);
    }

    @Override
    public int getTotal() {
        return Score.BIG_STREET;
    }
}
