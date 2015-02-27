package io.github.tfarla.model.score;

import io.github.tfarla.model.Dice;
import org.junit.Assert;
import org.junit.Test;

public class BigStreetTest {
    @Test
    public void getTotal() {
        Dice dices[] = {new Dice(1), new Dice(2), new Dice(3), new Dice(4), new Dice(5)};
        BigStreet score = new BigStreet(dices);
        Assert.assertEquals(Points.BIG_STREET.get(), score.getTotal());
    }
}
