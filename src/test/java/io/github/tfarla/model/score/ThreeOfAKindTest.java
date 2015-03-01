package io.github.tfarla.model.score;

import io.github.tfarla.model.Dice;
import org.junit.Assert;
import org.junit.Test;

public class ThreeOfAKindTest {
    @Test
    public void getTotal() {
        Dice dices[] = {new Dice(1), new Dice(1), new Dice(1), new Dice(2), new Dice(2)};
        ThreeOfAKind score = new ThreeOfAKind(dices);
        Assert.assertEquals(7, score.getTotal());
    }

    @Test
    public void isBottom() {
        Dice dices[] = {};
        ThreeOfAKind score = new ThreeOfAKind(dices);
        Assert.assertTrue(score.isBottom());
    }
}
