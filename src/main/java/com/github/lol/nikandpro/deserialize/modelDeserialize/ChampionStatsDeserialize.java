package com.github.lol.nikandpro.deserialize.modelDeserialize;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.github.lol.nikandpro.model.activPlayer.ChampionStats;

import java.io.IOException;

public class ChampionStatsDeserialize extends StdDeserializer<ChampionStats> {

    public ChampionStatsDeserialize() {
        super(ChampionStats.class);
    }

    @Override
    public ChampionStats deserialize(JsonParser parser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        JsonNode node = parser.getCodec().readTree(parser);
        ChampionStats chamSt = new ChampionStats();
        chamSt.setId(0);
        chamSt.setAbilityPower(node.get("abilityPower").asDouble());
        chamSt.setArmor(node.get("armor").asDouble());
        chamSt.setAttackDamage(node.get("attackDamage").asDouble());
        chamSt.setMaxHealth(node.get("maxHealth").asDouble());
        chamSt.setMoveSpeed(node.get("moveSpeed").asDouble());
        return chamSt;
    }
}
