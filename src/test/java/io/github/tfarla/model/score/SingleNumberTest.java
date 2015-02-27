package io.github.tfarla.model.score;

import io.github.tfarla.model.Dice;
import junit.framework.TestCase;

public class SingleNumberTest extends TestCase {
    public void testGetTotalPoints() {
        Dice dices[] = {new Dice(1), new Dice(1), new Dice(2), new Dice(3), new Dice(6)};
        SingleNumber score = new SingleNumber(dices, 1);
        assertEquals(2, score.getTotal());
    }

    public void testGetTotalPointsFourOfAKind() {
        Dice dices[] = {new Dice(1), new Dice(1), new Dice(1), new Dice(1), new Dice(2)};
        SingleNumber score = new SingleNumber(dices, 1);
        assertEquals(4, score.getTotal());
    }
}
