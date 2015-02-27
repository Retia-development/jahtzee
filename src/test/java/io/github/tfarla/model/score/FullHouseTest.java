package io.github.tfarla.model.score;

import io.github.tfarla.model.Dice;
import org.junit.Assert;
import org.junit.Test;

public class FullHouseTest {
    @Test
    public void getTotal() {
        Dice dices[] = {new Dice(1), new Dice(1), new Dice(1), new Dice(2), new Dice(2)};
        FullHouse score = new FullHouse(dices);
        Assert.assertEquals(Points.FULL_HOUSE.get(), score.getTotal());
    }
}
