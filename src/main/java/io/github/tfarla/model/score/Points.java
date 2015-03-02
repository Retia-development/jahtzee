package io.github.tfarla.model.score;

public enum Points {
    YAHTZEE(50),
    SMALL_STREET(30),
    BIG_STREET(40),
    FULL_HOUSE(25),
    MINIMAL_FOR_TOP_BONUS(63),
    TOP_BONUS(35),
    YAHTZEE_BONUS(100);

    private int value;

    Points(int value) {
        this.value = value;
    }

    public int get() {
        return this.value;
    }
}
