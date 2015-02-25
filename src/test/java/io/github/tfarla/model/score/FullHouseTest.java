package io.github.tfarla.model.score;

import io.github.tfarla.model.Dice;
import junit.framework.TestCase;

public class FullHouseTest extends TestCase {
    public void testGetTotal() {
        Dice dices[] = {new Dice(1), new Dice(1), new Dice(1), new Dice(2), new Dice(2)};
        FullHouse score = new FullHouse(dices);
        assertEquals(Score.FULL_HOUSE, score.getTotal());
    }
}
