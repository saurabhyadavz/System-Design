package org.example.lld.ticktaktoe.observer;

import org.example.lld.ticktaktoe.models.Move;
import org.example.lld.ticktaktoe.models.Player;
import org.example.lld.ticktaktoe.models.enums.GameState;

public interface GameObserver {
    void makesMove(Move move);

    void onGameStateChange(GameState gameState);

    void onPlayerChanged(Player player);
}
