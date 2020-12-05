package com.javarush.task.task35.task3513;

public class MoveEfficiency implements Comparable<MoveEfficiency> {
    private int numberOfEmptyTiles, score;
    private Move move;

    public MoveEfficiency(int numberOfEmptyTiles, int score, Move move) {
        this.numberOfEmptyTiles = numberOfEmptyTiles;
        this.score = score;
        this.move = move;
    }

    public Move getMove() {
        return move;
    }

    @Override
    public int compareTo(MoveEfficiency o) {
        return this.numberOfEmptyTiles == o.numberOfEmptyTiles ? Integer.compare(this.score, o.score) : Integer.compare(this.numberOfEmptyTiles, o.numberOfEmptyTiles);
    }
}