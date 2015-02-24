package io.github.tfarla.model;

import junit.framework.TestCase;

import java.util.ArrayList;

public class ThrowerTest extends TestCase {
    public void testThrowMustReturnListOfDices() {
        assertDicesThrown(0);
    }

    public void testThrowDicesMustReturnAmountSpecified() {
        assertDicesThrown(10);
    }

    public void testThrownDicesSmallestMustBeOne() {
        ArrayList<Dice> dices = throwDices(100);
        for (Dice dice : dices)
            assertTrue(dice.getPipes() >= 1);
    }

    public void testThrownDicesBiggestMustBeSix() {
        ArrayList<Dice> dices = throwDices(100);
        for (Dice dice : dices)
            assertTrue(dice.getPipes() <= 6);
    }

    private void assertDicesThrown(int amount) {
        ArrayList<Dice> dices = throwDices(amount);
        assertEquals(amount, dices.size());
    }

    private ArrayList<Dice> throwDices(int amount) {
        return Thrower.throwDices(amount);
    }
}
