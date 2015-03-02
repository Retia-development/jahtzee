package io.github.tfarla.model.scoreboard;

import io.github.tfarla.model.Dice;
import io.github.tfarla.model.score.SingleNumber;
import io.github.tfarla.model.score.Yahtzee;
import org.junit.Assert;
import org.junit.Test;

public class ScoreboardTest {
    @Test
    public void getTotalWithNoScore() {
        Scoreboard board = new Scoreboard();
        Assert.assertEquals(0, board.getTotal());
    }

    @Test
    public void getTotalTopScore() {
        Scoreboard board = new Scoreboard();
        Dice dices[] = {new Dice(1)};
        SingleNumber score = new SingleNumber(dices);
        board.add(score);
        Assert.assertEquals(score.getTotal(), board.getTotal());
    }

    @Test
    public void getTotalBottomScore() {
        Scoreboard board = new Scoreboard();
        Dice dices[] = {};
        Yahtzee score = new Yahtzee(dices);
        board.add(score);
        Assert.assertEquals(score.getTotal(), board.getTotal());
    }

    @Test
    public void getTop() {
        Scoreboard board = new Scoreboard();
        Dice dices[] = {new Dice(1)};
        SingleNumber score = new SingleNumber(dices);
        board.add(score);
        Top top = board.getTop();
        Assert.assertEquals(top.getTotal(), board.getTotal());
    }

    @Test
    public void getBottom() {
        Scoreboard board = new Scoreboard();
        Dice dices[] = {new Dice(1)};
        board.add(new Yahtzee(dices));
        Bottom bottom = board.getBottom();
        Assert.assertEquals(bottom.getTotal(), board.getTotal());
    }
}
