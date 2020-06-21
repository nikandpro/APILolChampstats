package com.github.lol.nikandpro.deserialize.modelDeserialize;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.github.lol.nikandpro.model.activPlayer.ChampionStats;

import java.io.IOException;

public class ChampionStatsDeserialize extends StdDeserializer<ChampionStats> {

    public ChampionStatsDeserialize() {
        super(ChampionStats.class);
    }

    @Override
    public ChampionStats deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        return null;
    }
}
