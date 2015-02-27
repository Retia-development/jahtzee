package io.github.tfarla.model;

public class Game {
    private Player[] players;
    private Player activePlayer;
    private int activePlayerCounter = 0;

    public Game(Player[] players) {
        this.players = players;
        setActivePlayer(activePlayerCounter);
    }

    public Player[] getPlayers() {
        return players;
    }

    public Player getActivePlayer() {
        return activePlayer;
    }

    public void setNextPlayerActive() {
        setNextActivePlayerCounter();
        setActivePlayer(activePlayerCounter);
    }

    private void setNextActivePlayerCounter() {
        activePlayerCounter++;
        if (activePlayerCounter == players.length)
            activePlayerCounter = 0;
    }

    private void setActivePlayer(int index) {
        activePlayer = players[index];
    }
}
