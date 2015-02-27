package io.github.tfarla.model;

import io.github.tfarla.model.score.Score;
import junit.framework.TestCase;

import java.util.ArrayList;

public class ScoreboardTest extends TestCase {
    public void testGetTotalPoints() {
        Dice dices[] = {new Dice(1)};
        Score score = new Score(dices);
        ArrayList<Score> scores = new ArrayList<Score>();
        scores.add(score);
        Scoreboard board = new Scoreboard(scores);
        assertEquals(score.getTotal(), board.getTotalPoints());
    }

    public void testAddScore() {
        Scoreboard board = new Scoreboard(new ArrayList<Score>());
        Dice dices[] = {new Dice(1)};
        Score score = new Score(dices);
        board.add(score);
        assertEquals(score.getTotal(), board.getTotalPoints());
    }
}
