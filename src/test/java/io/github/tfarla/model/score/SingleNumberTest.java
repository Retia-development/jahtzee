package io.github.tfarla.model.score;

import io.github.tfarla.model.Dice;
import org.junit.Assert;
import org.junit.Test;

public class SingleNumberTest {
    @Test
    public void getTotalPoints() {
        Dice dices[] = {new Dice(1), new Dice(1)};
        SingleNumber score = new SingleNumber(dices);
        Assert.assertEquals(2, score.getTotal());
    }

    @Test
    public void getTotalPointsFourOfAKind() {
        Dice dices[] = {new Dice(1), new Dice(1), new Dice(1), new Dice(1)};
        SingleNumber score = new SingleNumber(dices);
        Assert.assertEquals(4, score.getTotal());
    }

    @Test
    public void isBottom() {
        Dice dices[] = {};
        SingleNumber score = new SingleNumber(dices);
        Assert.assertFalse(score.isBottom());
    }
}
