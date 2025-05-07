package org.example.lld.ticktaktoe.models;

import org.example.lld.ticktaktoe.models.enums.Symbol;

public class Move {
    private final int row;
    private final int col;
    private final Symbol symbol;


    public Move(int row, int col, Symbol symbol) {
        this.row = row;
        this.col = col;
        this.symbol = symbol;
    }

    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.col;
    }

    public Symbol getSymbol() {
        return this.symbol;
    }
}
