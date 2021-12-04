package com.maartenmusic.day4;

public class BingoNumber {
    private final int number;
    private boolean marked;

    public BingoNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public boolean isMarked() {
        return marked;
    }

    public void setMarked() {
        this.marked = true;
    }

    @Override
    public String toString() {
        return "BingoNumber{" +
                "number=" + number +
                ", marked=" + marked +
                '}';
    }
}
