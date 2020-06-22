package com.github.lol.nikandpro.model.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.lol.nikandpro.ObjectMapperFactory;
import com.github.lol.nikandpro.databaseConfiguration.DatabaseConfiguration;
import com.github.lol.nikandpro.model.activPlayer.Activeplayer;
import com.github.lol.nikandpro.model.apiLol.liveClient.LiveHandle;
import com.github.lol.nikandpro.model.apiLol.liveClient.RequestCONST;
import com.github.lol.nikandpro.model.game.TimePoint;

import java.io.IOException;
import java.sql.SQLException;

public class ActivplayerController {
    public static void recordActivPlayer(TimePoint timePoint) throws IOException, SQLException {
        System.out.println("startActivPlayer");
        String json = LiveHandle.getJsonActiv(RequestCONST.ACTIVE_PLAYER);
        Activeplayer activeplayer = new Activeplayer();
        System.out.println("1");
        ObjectMapper obMap = ObjectMapperFactory.createObjectMapper(Activeplayer.class);
        System.out.println("2");
        activeplayer = obMap.readValue(json, Activeplayer.class);
        System.out.println("3");
        System.out.println(timePoint);
        System.out.println(timePoint.getGameTime());
        //activeplayer.setTimePoint(timePoint);
        System.out.println("4");
        DatabaseConfiguration.actPlayerDao.create(activeplayer);
        System.out.println("5");
    }
}
