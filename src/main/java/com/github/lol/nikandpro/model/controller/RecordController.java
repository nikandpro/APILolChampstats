package com.github.lol.nikandpro.model.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.lol.nikandpro.ObjectMapperFactory;
import com.github.lol.nikandpro.databaseConfiguration.DatabaseConfiguration;
import com.github.lol.nikandpro.model.activPlayer.AbilitiesActivPlayer;
import com.github.lol.nikandpro.model.activPlayer.Activeplayer;
import com.github.lol.nikandpro.model.activPlayer.RuneActivPlayer;
import com.github.lol.nikandpro.model.apiLol.liveClient.LiveHandle;
import com.github.lol.nikandpro.model.apiLol.liveClient.RequestCONST;
import com.github.lol.nikandpro.model.game.TimePoint;

import java.io.IOException;
import java.sql.SQLException;

public class RecordController {
    public static void recordActivPlayer(TimePoint timePoint) throws IOException, SQLException {
        System.out.println("startActivPlayer");
        String json = LiveHandle.getJsonActiv(RequestCONST.ACTIVE_PLAYER);
        Activeplayer activeplayer;
        ObjectMapper obMap = ObjectMapperFactory.createObjectMapper(Activeplayer.class);
        activeplayer = obMap.readValue(json, Activeplayer.class);
        activeplayer.setTimePoint(timePoint);
        activeplayer.getChampionStats().setTimePoint(timePoint);
        DatabaseConfiguration.actPlayerDao.create(activeplayer);
        System.out.println("finishedActivPlayer");
        recordFullRune(activeplayer);
    }

    public static void recordAbilActPlayer(Activeplayer activeplayer) throws IOException, SQLException {
        System.out.println("recordAbilActPlayer");
        String json = LiveHandle.getJsonActiv(RequestCONST.ACTIVE_PLAYER_ABILITIES);
        AbilitiesActivPlayer abilitiesActivPlayer;
        ObjectMapper obMap = ObjectMapperFactory.createObjectMapper(AbilitiesActivPlayer.class);
        abilitiesActivPlayer = obMap.readValue(json, AbilitiesActivPlayer.class);
        abilitiesActivPlayer.setActiveplayer(activeplayer);
        //abilitiesActivPlayer.setTimePoint(activeplayer.getTimePoint());
        DatabaseConfiguration.abilActPlayerDao.create(abilitiesActivPlayer);
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
        //DatabaseConfiguration.keystoneDao.create(runeActivPlayer.getKeystone());
        System.out.println("finishedFullRune");
    }
}
