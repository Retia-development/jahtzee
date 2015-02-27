package io.github.tfarla.model;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ThrowerTest {
    @Test
    public void throwMustReturnListOfDices() {
        assertDicesThrown(0);
    }

    @Test
    public void throwDicesMustReturnAmountSpecified() {
        assertDicesThrown(10);
    }

    @Test
    public void thrownDicesSmallestMustBeOne() {
        ArrayList<Dice> dices = throwDices(100);
        for (Dice dice : dices)
            Assert.assertTrue(dice.getPipes() >= 1);
    }

    @Test
    public void thrownDicesBiggestMustBeSix() {
        ArrayList<Dice> dices = throwDices(100);
        for (Dice dice : dices)
            Assert.assertTrue(dice.getPipes() <= 6);
    }

    private void assertDicesThrown(int amount) {
        ArrayList<Dice> dices = throwDices(amount);
        Assert.assertEquals(amount, dices.size());
    }

    private ArrayList<Dice> throwDices(int amount) {
        return Thrower.throwDices(amount);
    }
}
