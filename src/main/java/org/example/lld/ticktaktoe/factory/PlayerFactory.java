package org.example.lld.ticktaktoe.factory;

import org.example.lld.ticktaktoe.models.enums.Symbol;
import org.example.lld.ticktaktoe.models.Player;

interface PlayerFactory {
    Player createPlayer(String name, Symbol symbol);
}
