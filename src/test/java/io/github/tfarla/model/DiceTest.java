package io.github.tfarla.model;


import org.junit.Assert;
import org.junit.Test;

public class DiceTest {
    @Test
    public void getAmountOfPipes() {
        int pipes = 2;
        Dice dice = new Dice(pipes);
        Assert.assertEquals(pipes, dice.getPipes());
    }
}
