package io.github.tfarla.model.score;

public enum Points {
    YAHTZEE(50),
    SMALL_STREET(30),
    BIG_STREET(40),
    FULL_HOUSE(25);

    private int value;

    Points(int value) {
        this.value = value;
    }

    public int get() {
        return this.value;
    }
}
