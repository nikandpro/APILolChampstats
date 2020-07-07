package com.github.lol.nikandpro.model.controller;

import com.github.lol.nikandpro.Client.GivenPlayer;
import com.github.lol.nikandpro.databaseConfiguration.DatabaseConfiguration;
import com.github.lol.nikandpro.model.activPlayer.Player;
import com.github.lol.nikandpro.model.game.Game;

import java.sql.SQLException;

public class LogController {
    public static void showStats(Game game, GivenPlayer givenPlayer) throws SQLException {
        System.out.println("Name:"+givenPlayer.getName()+" level"+givenPlayer.getSummonerLevel());
        System.out.println("Runes"+ DatabaseConfiguration.runeActPlayerDao.queryForId(1).getKeystone());
        System.out.println("Runes"+ DatabaseConfiguration.runeActPlayerDao.queryForId(1).getPrimaryRuneTree());
        System.out.println("Runes"+ DatabaseConfiguration.runeActPlayerDao.queryForId(1).getSecondaryRuneTree());
        System.out.println("Players:");
        for (Player player : DatabaseConfiguration.playerDao.queryForAll()) {
            if (player.getTimePoint().getGame() == game) {
                System.out.println("Name:"+player.getSummonerName()+" level"+player.getLevel());
            }
        }

    }
}
