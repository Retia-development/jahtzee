package io.github.tfarla.model;

import io.github.tfarla.model.score.FullHouse;
import io.github.tfarla.model.score.Score;
import io.github.tfarla.model.score.SingleNumber;
import io.github.tfarla.model.score.Yahtzee;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ScoreboardTest {
    @Test
    public void getTotalPoints() {
        Scoreboard board = new Scoreboard();
        Assert.assertEquals(0, board.getTotalPoints());
    }

    @Test
    public void addScore() {
        Scoreboard board = new Scoreboard();
        Dice dices[] = {new Dice(1)};
        FullHouse score = new FullHouse(dices);
        board.add(score);
        Assert.assertEquals(score.getTotal(), board.getTotalPoints());
    }

    @Test
    public void getTopTotalPoints() {
        Scoreboard board = new Scoreboard();
        Assert.assertEquals(0, board.getTopTotalPoints());
    }

    @Test
    public void getTopTotalPointsWithScore() {
        Scoreboard board = new Scoreboard();
        Dice dices[] = {new Dice(1), new Dice(1)};
        SingleNumber score = new SingleNumber(dices);
        board.add(score);
        Assert.assertEquals(score.getTotal(), board.getTopTotalPoints());
    }
}
