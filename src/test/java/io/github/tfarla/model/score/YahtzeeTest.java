package io.github.tfarla.model.score;

import io.github.tfarla.model.Dice;
import junit.framework.TestCase;

public class YahtzeeTest extends TestCase {
    public void testGetTotalPoints() {
        Dice dices[] = {new Dice(1), new Dice(1), new Dice(1), new Dice(1), new Dice(1)};
        Yahtzee score = new Yahtzee(dices);
        assertEquals(Points.YAHTZEE.get(), score.getTotal());
    }
}
