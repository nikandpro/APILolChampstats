package com.github.lol.nikandpro.deserialize.modelDeserialize;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.github.lol.nikandpro.model.activPlayer.Player;

import java.io.IOException;

public class PlayerDeserialize extends StdDeserializer<Player> {

    public PlayerDeserialize() {
        super(Player.class);
    }

    @Override
    public Player deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        return null;
    }
}
