package io.github.tfarla.model.score;

import io.github.tfarla.model.Dice;

public class SmallStreet extends ScoreImpl {
    public SmallStreet(Dice dices[]) {
        super(dices);
    }

    @Override
    public int getTotal() {
        return Points.SMALL_STREET.get();
    }
}
