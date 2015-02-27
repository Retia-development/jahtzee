package io.github.tfarla.model.score;

import io.github.tfarla.model.Dice;
import org.junit.Assert;
import org.junit.Test;

public class SingleNumberTest {
    @Test
    public void getTotalPoints() {
        Dice dices[] = {new Dice(1), new Dice(1), new Dice(2), new Dice(3), new Dice(6)};
        SingleNumber score = new SingleNumber(dices, 1);
        Assert.assertEquals(2, score.getTotal());
    }

    @Test
    public void getTotalPointsFourOfAKind() {
        Dice dices[] = {new Dice(1), new Dice(1), new Dice(1), new Dice(1), new Dice(2)};
        SingleNumber score = new SingleNumber(dices, 1);
        Assert.assertEquals(4, score.getTotal());
    }
}
