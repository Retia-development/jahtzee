package io.github.tfarla.model;

import io.github.tfarla.model.score.Score;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class GameTest {
    @Test
    public void getPlayers() {
        Player player = new Player("A", new Scoreboard());
        Player players[] = {player};
        Game game = new Game(players);
        Assert.assertSame(players, game.getPlayers());
    }

    @Test
    public void getActivePlayer() {
        Player player = new Player("A", new Scoreboard());
        Player players[] = {player};
        Game game = new Game(players);
        Assert.assertSame(player, game.getActivePlayer());
    }

    @Test
    public void setNextActivePlayer() {
        Player first = new Player("A", new Scoreboard());
        Player second = new Player("B", new Scoreboard());
        Player players[] = {first, second};
        Game game = new Game(players);
        game.setNextPlayerActive();
        Assert.assertSame(second, game.getActivePlayer());
    }

    @Test
    public void setNextActivePlayerMustCycle() {
        Player first = new Player("A", new Scoreboard());
        Player second = new Player("B", new Scoreboard());
        Player players[] = {first, second};
        Game game = new Game(players);
        for (int i = 0; i < 2; i++)
            game.setNextPlayerActive();

        Assert.assertSame(first, game.getActivePlayer());
    }
}
