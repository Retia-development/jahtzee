package io.github.tfarla.util;

import io.github.tfarla.model.Dice;
import org.junit.Assert;
import org.junit.Test;

public class CalcTest {
    @Test
    public void sumDicesWithNoDices() {
        Dice dices[] = {};
        Assert.assertEquals(0, Calc.sum(dices));
    }

    public void sumDicesWithDices() {
        Dice dices[] = {new Dice(1), new Dice(1), new Dice(1)};
        Assert.assertEquals(dices.length, Calc.sum(dices));
    }
}
