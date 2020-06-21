package com.github.lol.nikandpro;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.github.lol.nikandpro.Client.GivenPlayer;
import com.github.lol.nikandpro.deserialize.GameDeserialize;
import com.github.lol.nikandpro.deserialize.GivenplayerDeserialize;
import com.github.lol.nikandpro.model.game.Game;

public class ObjectMapperFactory {

    public static ObjectMapper createObjectMapper( Class<?> nameClass) {
        SimpleModule sm = new SimpleModule();
        ObjectMapper om = new ObjectMapper();
        if (GivenPlayer.class == nameClass) {
            sm.addDeserializer(GivenPlayer.class, new GivenplayerDeserialize());
        } else if (Game.class == nameClass) {
            sm.addDeserializer(Game.class, new GameDeserialize());
        }
        return om.registerModule(sm);
    }

}
