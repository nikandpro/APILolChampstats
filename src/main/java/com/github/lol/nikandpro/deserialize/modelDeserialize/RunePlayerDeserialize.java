package com.github.lol.nikandpro.deserialize.modelDeserialize;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.github.lol.nikandpro.model.activPlayer.RunePlayer;

import java.io.IOException;

public class RunePlayerDeserialize extends StdDeserializer<RunePlayer> {

    public RunePlayerDeserialize() {
        super(RunePlayer.class);
    }

    @Override
    public RunePlayer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        return null;
    }
}
