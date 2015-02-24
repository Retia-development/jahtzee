package io.github.tfarla.model;

import junit.framework.TestCase;

public class DiceTest extends TestCase {
    public void testGetAmountOfPipes() {
        int pipes = 2;
        Dice dice = new Dice(pipes);
        assertEquals(pipes, dice.getPipes());
    }
}
