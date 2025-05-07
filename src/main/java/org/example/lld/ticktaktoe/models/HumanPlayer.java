package org.example.lld.ticktaktoe.models;

import org.example.lld.ticktaktoe.models.enums.Symbol;

import java.util.Scanner;

public class HumanPlayer extends Player {
    private final Scanner scanner;

    public HumanPlayer(String name, Symbol symbol, Scanner scanner) {
        super(name, symbol);
        this.scanner = scanner;
    }

    @Override
    public Move makeMove(Board board) {
        Move move = null;
        boolean validMove = false;
        while (!validMove) {
            System.out.printf("%s's turn (%s). Enter row (0-%d) and column (0-%d)", getName(), getPlayerSymbol(), board.getSize() - 1, board.getSize() - 1);
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (!board.isValidPosition(row, col)) {
                System.out.println("Position is outside of the board. Try again");
                continue;
            }

            if (!board.isCellEmpty(row, col)) {
                System.out.println("Cell is already occupied. Try again");
                continue;
            }

            move = new Move(row, col, getPlayerSymbol());
            validMove = true;
        }
        return move;
    }
}
