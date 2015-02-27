package io.github.tfarla.model.score;

import io.github.tfarla.model.Dice;
import junit.framework.TestCase;

public class ScoreImplTest extends TestCase {
    public void testGetTotal() {
        Dice dices[] = {new Dice(1), new Dice(1), new Dice(1), new Dice(1), new Dice(1)};
        ScoreImpl score = new ScoreImpl(dices);
        assertEquals(5, score.getTotal());
    }
}
