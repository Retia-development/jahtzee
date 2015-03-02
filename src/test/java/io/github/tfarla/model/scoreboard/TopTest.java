package io.github.tfarla.model.scoreboard;

import io.github.tfarla.model.Dice;
import io.github.tfarla.model.score.Points;
import io.github.tfarla.model.score.SingleNumber;
import org.junit.Assert;
import org.junit.Test;

public class TopTest {
    @Test
    public void getSubTotalWithNoScores() {
        Top board = new Top();
        Assert.assertEquals(0, board.getSubTotal());
    }

    @Test
    public void add() {
        Top board = new Top();
        Dice dices[] = {new Dice(1), new Dice(1)};
        SingleNumber score = new SingleNumber(dices);
        board.add(score);
        Assert.assertEquals(score.getTotal(), board.getSubTotal());
    }

    @Test
    public void getBonusNoBonus() {
        Top board = new Top();
        Assert.assertEquals(0, board.getBonusTotal());
    }

    @Test
    public void getBonus() {
        Top board = new Top();
        Dice dices[] = {new Dice(Points.MINIMAL_FOR_TOP_BONUS.get())};
        board.add(new SingleNumber(dices));
        Assert.assertEquals(Points.TOP_BONUS.get(), board.getBonusTotal());
    }

    @Test
    public void getTotal() {
        Top board = new Top();
        Dice dices[] = {new Dice(1)};
        SingleNumber score = new SingleNumber(dices);
        board.add(score);
        Assert.assertEquals(score.getTotal(), board.getTotal());
    }

    @Test
    public void getTotalWithBonus() {
        Top board = new Top();
        Dice dices[] = {new Dice(1), new Dice(Points.MINIMAL_FOR_TOP_BONUS.get())};
        SingleNumber score = new SingleNumber(dices);
        board.add(score);
        Assert.assertEquals(score.getTotal() + board.getBonusTotal(), board.getTotal());
    }
}
