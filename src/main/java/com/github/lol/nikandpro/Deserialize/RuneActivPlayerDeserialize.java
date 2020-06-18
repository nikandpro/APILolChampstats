package com.github.lol.nikandpro.Deserialize;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.github.lol.nikandpro.model.activPlayer.RuneActivPlayer;

import java.io.IOException;

public class RuneActivPlayerDeserialize extends StdDeserializer<RuneActivPlayer> {

    public RuneActivPlayerDeserialize() {
        super(RuneActivPlayer.class);
    }

    @Override
    public RuneActivPlayer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        return null;
    }
}
