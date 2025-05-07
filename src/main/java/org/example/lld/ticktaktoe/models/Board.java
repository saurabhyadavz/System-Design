package org.example.lld.ticktaktoe.models;

import org.example.lld.ticktaktoe.models.enums.Symbol;

public class Board {
    private final int size;
    private final Symbol[][] board;

    public Board(int size) {
        this.size = size;
        board = new Symbol[size][size];
        initializeBoard(size);
    }

    private void initializeBoard(int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                board[row][col] = Symbol.EMPTY;
            }
        }
    }

    public int getSize() {
        return this.size;
    }

    public boolean isBoardFull() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (board[row][col] == Symbol.EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isValidPosition(int row, int col) {
        return row >= 0 && row < size && col >= 0 && col < size;
    }

    public boolean isCellEmpty(int row, int col) {
        return board[row][col] == Symbol.EMPTY;
    }

    public Symbol getCellSymbol(int row, int col) {
        if (isValidPosition(row, col)) {
            return board[row][col];
        }
        return null;
    }

    public void displayBoard() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }

    public void mark(int row, int col, Symbol symbol) {
        board[row][col] = symbol;
    }
}
