package io.github.tfarla.model;

import io.github.tfarla.model.score.ScoreImpl;
import junit.framework.TestCase;

import java.util.ArrayList;

public class ScoreboardTest extends TestCase {
    public void testGetTotalPoints() {
        Dice dices[] = {new Dice(1)};
        ScoreImpl score = new ScoreImpl(dices);
        ArrayList<ScoreImpl> scores = new ArrayList<ScoreImpl>();
        scores.add(score);
        Scoreboard board = new Scoreboard(scores);
        assertEquals(score.getTotal(), board.getTotalPoints());
    }

    public void testAddScore() {
        Scoreboard board = new Scoreboard(new ArrayList<ScoreImpl>());
        Dice dices[] = {new Dice(1)};
        ScoreImpl score = new ScoreImpl(dices);
        board.add(score);
        assertEquals(score.getTotal(), board.getTotalPoints());
    }
}
