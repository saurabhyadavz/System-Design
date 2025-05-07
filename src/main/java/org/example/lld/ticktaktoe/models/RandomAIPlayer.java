package org.example.lld.ticktaktoe.models;

import org.example.lld.ticktaktoe.models.enums.Symbol;

public class RandomAIPlayer extends Player {
    public RandomAIPlayer(String name, Symbol symbol) {
        super(name, symbol);
    }

    @Override
    public Move makeMove(Board board) {
        return null;
    }
}
