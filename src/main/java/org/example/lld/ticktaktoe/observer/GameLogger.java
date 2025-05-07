package org.example.lld.ticktaktoe.observer;

import org.example.lld.ticktaktoe.models.Move;
import org.example.lld.ticktaktoe.models.Player;
import org.example.lld.ticktaktoe.models.enums.GameState;

public class GameLogger implements GameObserver {
    @Override
    public void makesMove(Move move) {
        System.out.printf("Move: %s to row: %d and col: %d", move.getSymbol(), move.getRow(), move.getCol());
    }

    @Override
    public void onGameStateChange(GameState gameState) {
        System.out.printf("Game state has changed to: %s\n", gameState.toString());
    }

    @Override
    public void onPlayerChanged(Player player) {
        System.out.printf("Player has changed to %s\n", player.getName());
    }
}
