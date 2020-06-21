package com.github.lol.nikandpro.deserialize.modelDeserialize;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.github.lol.nikandpro.model.core.rune.Rune;

import java.io.IOException;

public class RuneDeserialize extends StdDeserializer<Rune> {

    public RuneDeserialize() {
        super(Rune.class);
    }

    @Override
    public Rune deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        return null;
    }
}
