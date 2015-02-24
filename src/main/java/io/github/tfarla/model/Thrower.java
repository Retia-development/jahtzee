package io.github.tfarla.model;

import java.util.ArrayList;
import java.util.Random;

public class Thrower {
    public static ArrayList<Dice> throwDices(int amount) {
        ArrayList<Dice> dices = new ArrayList<Dice>();
        int i = 0;
        while (i < amount) {
            dices.add(throwDice());
            i++;
        }

        return dices;
    }

    private static Dice throwDice() {
        return new Dice(getRandomPipe());
    }

    private static int getRandomPipe() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }
}
