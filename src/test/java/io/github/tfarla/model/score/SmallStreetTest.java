package io.github.tfarla.model.score;

import io.github.tfarla.model.Dice;
import junit.framework.TestCase;

public class SmallStreetTest extends TestCase {
    public void testGetTotal() {
        Dice dices[] = {new Dice(1), new Dice(2), new Dice(3), new Dice(4), new Dice(1)};
        SmallStreet score = new SmallStreet(dices);
        assertEquals(Score.SMALL_STREET, score.getTotal());
    }
}
