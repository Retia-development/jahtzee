package io.github.tfarla.model.score;

import io.github.tfarla.model.Dice;

public class BigStreet extends ScoreImpl {
    public BigStreet(Dice dices[]) {
        super(dices);
    }

    @Override
    public int getTotal() {
        return Points.BIG_STREET.get();
    }
}
