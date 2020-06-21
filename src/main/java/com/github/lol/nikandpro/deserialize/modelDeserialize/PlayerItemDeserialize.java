package com.github.lol.nikandpro.deserialize.modelDeserialize;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.github.lol.nikandpro.model.activPlayer.PlayerItem;

import java.io.IOException;

public class PlayerItemDeserialize extends StdDeserializer<PlayerItem> {

    public PlayerItemDeserialize() {
        super(PlayerItem.class);
    }

    @Override
    public PlayerItem deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        return null;
    }
}
