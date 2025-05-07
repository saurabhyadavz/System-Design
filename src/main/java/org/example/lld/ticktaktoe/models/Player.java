package org.example.lld.ticktaktoe.models;

import org.example.lld.ticktaktoe.models.enums.Symbol;

public abstract class Player {
    private final String name;
    private final Symbol symbol;

    public Player(String name, Symbol symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return this.name;
    }

    public Symbol getPlayerSymbol() {
        return this.symbol;
    }

    public abstract Move makeMove(Board board);

}
