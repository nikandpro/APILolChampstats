package com.github.lol.nikandpro.deserialize.modelDeserialize;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.github.lol.nikandpro.model.core.SummonerSpell;

import java.io.IOException;

public class SummonerSpellDeserialize extends StdDeserializer<SummonerSpell> {

    public SummonerSpellDeserialize() {
        super(SummonerSpell.class);
    }

    @Override
    public SummonerSpell deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        return null;
    }
}
