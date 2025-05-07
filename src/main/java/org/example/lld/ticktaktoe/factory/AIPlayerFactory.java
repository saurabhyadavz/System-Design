package org.example.lld.ticktaktoe.factory;

import org.example.lld.ticktaktoe.models.Player;
import org.example.lld.ticktaktoe.models.RandomAIPlayer;
import org.example.lld.ticktaktoe.models.enums.Symbol;

public class AIPlayerFactory implements PlayerFactory {
    @Override
    public Player createPlayer(String name, Symbol symbol) {
        return new RandomAIPlayer(name, symbol);
    }
}
