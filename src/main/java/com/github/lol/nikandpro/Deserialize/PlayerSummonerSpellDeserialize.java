package com.github.lol.nikandpro.Deserialize;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.github.lol.nikandpro.model.activPlayer.PlayerSummonerSpell;

import java.io.IOException;

public class PlayerSummonerSpellDeserialize extends StdDeserializer<PlayerSummonerSpell> {

    public PlayerSummonerSpellDeserialize() {
        super(PlayerSummonerSpell.class);
    }

    @Override
    public PlayerSummonerSpell deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        return null;
    }
}
