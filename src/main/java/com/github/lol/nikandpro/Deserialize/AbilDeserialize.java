package com.github.lol.nikandpro.Deserialize;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.github.lol.nikandpro.model.core.abilities.Abil;

import java.io.IOException;

public class AbilDeserialize extends StdDeserializer<Abil> {

    public AbilDeserialize() {
        super(Abil.class);
    }

    @Override
    public Abil deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        return null;
    }
}
