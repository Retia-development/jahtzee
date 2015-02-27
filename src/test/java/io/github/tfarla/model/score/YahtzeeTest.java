package io.github.tfarla.model.score;

import io.github.tfarla.model.Dice;
import org.junit.Assert;
import org.junit.Test;

public class YahtzeeTest {
    @Test
    public void getTotalPoints() {
        Dice dices[] = {new Dice(1), new Dice(1), new Dice(1), new Dice(1), new Dice(1)};
        Yahtzee score = new Yahtzee(dices);
        Assert.assertEquals(Points.YAHTZEE.get(), score.getTotal());
    }
}
