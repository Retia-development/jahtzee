package io.github.tfarla.util;

import io.github.tfarla.model.Dice;

public class Calc {
    public static int sum(Dice dices[]) {
        int total = 0;
        for (Dice dice : dices)
            total += dice.getPipes();

        return total;
    }
}
