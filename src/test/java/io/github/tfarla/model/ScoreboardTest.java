package io.github.tfarla.model;

import io.github.tfarla.model.score.Score;
import junit.framework.TestCase;

import java.util.ArrayList;

public class ScoreboardTest extends TestCase {
    public void testGetTotalPoints() {
        ArrayList scores = new ArrayList<Score>();
        Dice dices[] = {new Dice(1)};
        Score score = new Score(dices);
        scores.add(score);
        Scoreboard board = new Scoreboard(scores);
        assertEquals(score.getTotal(), board.getTotalPoints());
    }
}
