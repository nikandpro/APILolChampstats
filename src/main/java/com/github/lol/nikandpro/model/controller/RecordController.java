package com.github.lol.nikandpro.model.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.lol.nikandpro.ObjectMapperFactory;
import com.github.lol.nikandpro.databaseConfiguration.DatabaseConfiguration;
import com.github.lol.nikandpro.model.activPlayer.*;
import com.github.lol.nikandpro.model.apiLol.liveClient.LiveHandle;
import com.github.lol.nikandpro.model.apiLol.liveClient.RequestCONST;
import com.github.lol.nikandpro.model.game.TimePoint;
import java.io.IOException;
import java.sql.SQLException;

public class RecordController {

    public static void recordAllActivPl(TimePoint timePoint) throws IOException, SQLException {
        Activeplayer activeplayer = recordActivPlayer(timePoint);
        recordFullRune(activeplayer);
        recordAbilActPlayer(activeplayer);
    }
    public static Activeplayer recordActivPlayer(TimePoint timePoint) throws IOException, SQLException {
        System.out.println("startActivPlayer");
        String json = LiveHandle.getJsonActiv(RequestCONST.ACTIVE_PLAYER);
        Activeplayer activeplayer;
        ObjectMapper obMap = ObjectMapperFactory.createObjectMapper(Activeplayer.class);
        activeplayer = obMap.readValue(json, Activeplayer.class);
        activeplayer.setTimePoint(timePoint);
        activeplayer.getChampionStats().setTimePoint(timePoint);
        DatabaseConfiguration.actPlayerDao.create(activeplayer);
        System.out.println("finishedActivPlayer");
        return activeplayer;
    }

    public static void recordAbilActPlayer(Activeplayer activeplayer) throws IOException, SQLException {
        System.out.println("recordAbilActPlayer");
        String json = LiveHandle.getJsonActiv(RequestCONST.ACTIVE_PLAYER_ABILITIES);
        AbilitiesActivPlayer abilitiesActivPlayer;
        ObjectMapper obMap = ObjectMapperFactory.createObjectMapper(AbilitiesActivPlayer.class);
        abilitiesActivPlayer = obMap.readValue(json, AbilitiesActivPlayer.class);
        abilitiesActivPlayer.setActiveplayer(activeplayer);
        abilitiesActivPlayer.setActiveplayer(activeplayer);
        abilitiesActivPlayer.setTimePoint(activeplayer.getTimePoint());
        //DatabaseConfiguration.abilActPlayerDao.create(abilitiesActivPlayer);
        System.out.println("finishedAbilActPlayer");
    }

    public static void recordFullRune(Activeplayer activeplayer) throws IOException, SQLException {
        System.out.println("recordFullRune");
        String json = LiveHandle.getJsonActiv(RequestCONST.ACTIVE_PLAYER_RUNES);
        RuneActivPlayer runeActivPlayer;
        ObjectMapper obMap = ObjectMapperFactory.createObjectMapper(RuneActivPlayer.class);
        runeActivPlayer = obMap.readValue(json, RuneActivPlayer.class);
        runeActivPlayer.setActiveplayer(activeplayer);
        runeActivPlayer.setTimePoint(activeplayer.getTimePoint());
        DatabaseConfiguration.runeActPlayerDao.create(runeActivPlayer);
        System.out.println("finishedFullRune");
    }

    public static void recordPlayer(Activeplayer activeplayer) throws IOException, SQLException {
        System.out.println("recordPlayer");
        String json = LiveHandle.getJsonPlayer(RequestCONST.PLAYER_LIST, activeplayer.getSummonerName());
        Player player;
        ObjectMapper obMap = ObjectMapperFactory.createObjectMapper(Player.class);
        player = obMap.readValue(json, Player.class);
        System.out.println("finishedPlayer");
    }

}
