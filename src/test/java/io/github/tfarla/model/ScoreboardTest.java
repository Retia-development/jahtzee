package io.github.tfarla.model;

import io.github.tfarla.model.score.FullHouse;
import io.github.tfarla.model.score.Score;
import io.github.tfarla.model.score.Yahtzee;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ScoreboardTest {
    @Test
    public void getTotalPoints() {
        Dice dices[] = {new Dice(1)};
        Yahtzee score = new Yahtzee(dices);
        ArrayList<Score> scores = new ArrayList<Score>();
        scores.add(score);
        Scoreboard board = new Scoreboard(scores);
        Assert.assertEquals(score.getTotal(), board.getTotalPoints());
    }

    @Test
    public void addScore() {
        Scoreboard board = new Scoreboard(new ArrayList<Score>());
        Dice dices[] = {new Dice(1)};
        FullHouse score = new FullHouse(dices);
        board.add(score);
        Assert.assertEquals(score.getTotal(), board.getTotalPoints());
    }
}
