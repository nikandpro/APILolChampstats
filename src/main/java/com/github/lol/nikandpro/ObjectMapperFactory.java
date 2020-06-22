package com.github.lol.nikandpro;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.github.lol.nikandpro.Client.GivenPlayer;
import com.github.lol.nikandpro.deserialize.GameDeserialize;
import com.github.lol.nikandpro.deserialize.GivenplayerDeserialize;
import com.github.lol.nikandpro.deserialize.TimePointDeserialize;
import com.github.lol.nikandpro.deserialize.modelDeserialize.ActivplayerDeserialize;
import com.github.lol.nikandpro.deserialize.modelDeserialize.ChampionStatsDeserialize;
import com.github.lol.nikandpro.model.activPlayer.Activeplayer;
import com.github.lol.nikandpro.model.activPlayer.ChampionStats;
import com.github.lol.nikandpro.model.game.Game;
import com.github.lol.nikandpro.model.game.TimePoint;

public class ObjectMapperFactory {

    public static ObjectMapper createObjectMapper( Class<?> nameClass) {
        SimpleModule sm = new SimpleModule();
        ObjectMapper om = new ObjectMapper();
        if (GivenPlayer.class == nameClass) {
            sm.addDeserializer(GivenPlayer.class, new GivenplayerDeserialize());
        } else if (Game.class == nameClass) {
            sm.addDeserializer(Game.class, new GameDeserialize());
        } else if (TimePoint.class == nameClass) {
            sm.addDeserializer(TimePoint.class, new TimePointDeserialize());
        } else if (Activeplayer.class == nameClass) {
            sm.addDeserializer(Activeplayer.class, new ActivplayerDeserialize()).addDeserializer(ChampionStats.class, new ChampionStatsDeserialize());
        } else if (ChampionStats.class == nameClass) {
            sm.addDeserializer(ChampionStats.class, new ChampionStatsDeserialize());
        }
        return om.registerModule(sm);
    }

}
