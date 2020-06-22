package com.github.lol.nikandpro.deserialize.modelDeserialize;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.github.lol.nikandpro.ObjectMapperFactory;
import com.github.lol.nikandpro.model.activPlayer.Activeplayer;
import com.github.lol.nikandpro.model.activPlayer.ChampionStats;

import java.io.IOException;

public class ActivplayerDeserialize extends StdDeserializer<Activeplayer> {

    public ActivplayerDeserialize() {
        super(Activeplayer.class);
    }

    @Override
    public Activeplayer deserialize(JsonParser parser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        JsonNode node = parser.getCodec().readTree(parser);
        Activeplayer activeplayer = new Activeplayer();
        activeplayer.setId(0);
        activeplayer.setChampionStats(null);
        activeplayer.setCurrentGold(node.get("currentGold").asDouble());
        activeplayer.setLevel(node.get("level").asInt());
        activeplayer.setSummonerName(node.get("summonerName").asText());

        return null;
    }
}
