package io.github.tfarla.model.scoreboard;

import io.github.tfarla.model.Dice;
import io.github.tfarla.model.score.FullHouse;
import io.github.tfarla.model.score.Points;
import io.github.tfarla.model.score.Yahtzee;
import org.junit.Assert;
import org.junit.Test;

public class BottomTest {
    @Test
    public void getSubTotal() {
        Bottom board = new Bottom();
        Assert.assertEquals(0, board.getSubTotal());
    }

    @Test
    public void add() {
        Bottom board = new Bottom();
        Dice dices[] = {};
        FullHouse score = new FullHouse(dices);
        board.add(score);
        Assert.assertEquals(score.getTotal(), board.getSubTotal());
    }

    @Test
    public void getBonusTotalNoBonus() {
        Bottom board = new Bottom();
        Assert.assertEquals(0, board.getBonusTotal());
    }

    @Test
    public void getBonusTotalWithOneYahtzee() {
        Bottom board = new Bottom();
        Dice dices[] = {};
        Yahtzee score = new Yahtzee(dices);
        board.add(score);
        Assert.assertEquals(0, board.getBonusTotal());
    }

    @Test
    public void getBonusTotalWithTwoYahtzee() {
        Bottom board = new Bottom();
        Dice dices[] = {};
        for (int i = 0; i < 2; i++)
            board.add(new Yahtzee(dices));
        Assert.assertEquals(Points.YAHTZEE_BONUS.get(), board.getBonusTotal());
    }

    @Test
    public void getBonusTotalWithMultipleYahtzee() {
        Bottom board = new Bottom();
        Dice dices[] = {};
        int totalYahtzee = 3;
        for (int i = 0; i < totalYahtzee; i++)
            board.add(new Yahtzee(dices));
        Assert.assertEquals((totalYahtzee - 1) * Points.YAHTZEE_BONUS.get(), board.getBonusTotal());
    }

    @Test
    public void getTotal() {
        Bottom board = new Bottom();
        Assert.assertEquals(0, board.getTotal());
    }

    @Test
    public void getTotalWithoutBonus() {
        Bottom board = new Bottom();
        Dice dices[] = {};
        FullHouse score = new FullHouse(dices);
        board.add(score);
        Assert.assertEquals(score.getTotal(), board.getTotal());
    }

    @Test
    public void getTotalWithBonus() {
        Bottom board = new Bottom();
        Dice dices[] = {};
        for (int i = 0; i < 2; i++)
            board.add(new Yahtzee(dices));
        Assert.assertEquals(board.getSubTotal() + board.getBonusTotal(), board.getTotal());
    }
}
