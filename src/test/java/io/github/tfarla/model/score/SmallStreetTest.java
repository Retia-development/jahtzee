package io.github.tfarla.model.score;

import io.github.tfarla.model.Dice;
import org.junit.Assert;
import org.junit.Test;

public class SmallStreetTest {
    @Test
    public void getTotal() {
        Dice dices[] = {new Dice(1), new Dice(2), new Dice(3), new Dice(4), new Dice(1)};
        SmallStreet score = new SmallStreet(dices);
        Assert.assertEquals(Points.SMALL_STREET.get(), score.getTotal());
    }

    @Test
    public void isBottom() {
        Dice dices[] = {};
        SmallStreet score = new SmallStreet(dices);
        Assert.assertTrue(score.isBottom());
    }
}
