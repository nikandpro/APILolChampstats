package com.github.lol.nikandpro.Deserialize;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.github.lol.nikandpro.model.activPlayer.Activeplayer;

import java.io.IOException;

public class ActivplayerDeserialize extends StdDeserializer<Activeplayer> {

    public ActivplayerDeserialize() {
        super(Activeplayer.class);
    }

    @Override
    public Activeplayer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        return null;
    }
}
