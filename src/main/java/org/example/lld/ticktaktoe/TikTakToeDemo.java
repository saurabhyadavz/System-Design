package org.example.lld.ticktaktoe;

import org.example.lld.ticktaktoe.factory.HumanPlayerFactory;
import org.example.lld.ticktaktoe.models.Player;
import org.example.lld.ticktaktoe.models.enums.Symbol;
import org.example.lld.ticktaktoe.observer.GameLogger;

import java.util.Scanner;

public class TikTakToeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HumanPlayerFactory humanPlayerFactory = new HumanPlayerFactory(scanner);

        Player humanPlayer1 = humanPlayerFactory.createPlayer("Saurabh", Symbol.X);
        Player humanPlayer2 = humanPlayerFactory.createPlayer("Gaurav", Symbol.O);
        TikTakToeGame tikTakToeGame = new TikTakToeGame(humanPlayer1, humanPlayer2, 3);

        tikTakToeGame.addObserver(new GameLogger());

        tikTakToeGame.play();
    }

}
