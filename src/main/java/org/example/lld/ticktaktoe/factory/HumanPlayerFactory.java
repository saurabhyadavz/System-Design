package org.example.lld.ticktaktoe.factory;

import org.example.lld.ticktaktoe.models.Player;
import org.example.lld.ticktaktoe.models.HumanPlayer;
import org.example.lld.ticktaktoe.models.enums.Symbol;

import java.util.Scanner;

public class HumanPlayerFactory implements PlayerFactory {
    private final Scanner scanner;

    public HumanPlayerFactory(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public Player createPlayer(String name, Symbol symbol) {
        return new HumanPlayer(name, symbol, scanner);
    }
}
