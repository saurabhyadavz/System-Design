package org.example.lld.ticktaktoe;

import org.example.lld.ticktaktoe.models.Board;
import org.example.lld.ticktaktoe.models.Move;
import org.example.lld.ticktaktoe.models.Player;
import org.example.lld.ticktaktoe.models.enums.GameState;
import org.example.lld.ticktaktoe.observer.GameObserver;

import java.util.ArrayList;
import java.util.List;

public class TikTakToeGame {
    private final Board board;
    private final Player player1;
    private final Player player2;
    private Player currentPlayer;
    private GameState gameState;
    private List<Integer> rowSum;
    private List<Integer> colSum;
    private int diagonalSum;
    private int revDiagonalSum;
    private List<GameObserver> observers = new ArrayList<>();


    public TikTakToeGame(Player player1, Player player2, int boardSize) {
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;
        this.board = new Board(boardSize);
        this.gameState = GameState.IN_PROGRESS;
        this.rowSum = new ArrayList<>(boardSize);
        this.colSum = new ArrayList<>(boardSize);
        for (int row = 0; row < boardSize; row++) {
            rowSum.add(0);
            colSum.add(0);
        }
        this.diagonalSum = 0;
        this.revDiagonalSum = 0;
    }

    public void addObserver(GameObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(GameObserver observer) {
        observers.remove(observer);
    }

    private void notifyMoveMade(Move move) {
        for (GameObserver gameObserver : observers) {
            gameObserver.makesMove(move);
        }
    }

    private void notifyOnGameStateChange(GameState gameState) {
        for (GameObserver gameObserver : observers) {
            gameObserver.onGameStateChange(gameState);
        }
    }

    private void notifyOnPlayerChanged(Player player) {
        for (GameObserver gameObserver : observers) {
            gameObserver.onPlayerChanged(player);
        }
    }

    public void play() {
        board.displayBoard();
        while (gameState == GameState.IN_PROGRESS) {
            Move move = currentPlayer.makeMove(board);
            board.mark(move.getRow(), move.getCol(), move.getSymbol());

            // notify observers on move made
            notifyMoveMade(move);

            updateSum(move);
            updateGameState(move);
            switchPlayer();
        }
        board.displayBoard();
    }

    private void switchPlayer() {
        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
        notifyOnPlayerChanged(currentPlayer);
    }

    private void updateSum(Move move) {
        int row = move.getRow();
        int col = move.getCol();
        int val = (currentPlayer == player1) ? 1 : -1;
        rowSum.set(row, rowSum.get(row) + val);
        colSum.set(col, colSum.get(col) + val);
        if (row == col) {
            diagonalSum += val;
        }
        if (row == (board.getSize() - 1 - col)) {
            revDiagonalSum += val;
        }
    }

    void updateGameState(Move move) {
        if (checkWin(move)) {
            gameState = (currentPlayer == player1) ? GameState.X_WON : GameState.O_WON;
            notifyOnGameStateChange(gameState);
            return;
        }

        if (board.isBoardFull()) {
            gameState = GameState.DRAW;
            notifyOnGameStateChange(gameState);
        }
    }

    boolean checkWin(Move move) {
        int currentRowSum = Math.abs(rowSum.get(move.getRow()));
        int currentColSum = Math.abs(colSum.get(move.getCol()));
        int currentDiagonalSum = Math.abs(diagonalSum);
        int currentRevDiagonalSum = Math.abs(revDiagonalSum);
        return currentColSum == board.getSize() || currentRowSum == board.getSize() || currentDiagonalSum == board.getSize() || currentRevDiagonalSum == board.getSize();
    }


}
