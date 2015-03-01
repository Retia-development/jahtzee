package io.github.tfarla.model.score;

import io.github.tfarla.model.Dice;
import org.junit.Assert;
import org.junit.Test;

public class FourOfAKindTest {
    @Test
    public void getTotal() {
        Dice dices[] = {new Dice(1), new Dice(1), new Dice(1), new Dice(1), new Dice(2)};
        FourOfAKind score = new FourOfAKind(dices);
        Assert.assertEquals(6, score.getTotal());
    }

    @Test
    public void isBottom() {
        Dice dices[] = {};
        FourOfAKind score = new FourOfAKind(dices);
        Assert.assertTrue(score.isBottom());
    }
}
