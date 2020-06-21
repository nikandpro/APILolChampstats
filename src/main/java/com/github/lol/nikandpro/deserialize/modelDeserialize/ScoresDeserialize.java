package com.github.lol.nikandpro.deserialize.modelDeserialize;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.github.lol.nikandpro.model.activPlayer.Scores;

import java.io.IOException;

public class ScoresDeserialize extends StdDeserializer<Scores> {

    public ScoresDeserialize() {
        super(Scores.class);
    }

    @Override
    public Scores deserialize(JsonParser parser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        Scores scores = new Scores();
        JsonNode node = parser.getCodec().readTree(parser);
        scores.setId(0);
        scores.setAssists(node.get("assists").asInt());
        scores.setCreepScore(node.get("creepScore").asInt());
        scores.setDeaths(node.get("deaths").asInt());
        scores.setKill(node.get("kills").asInt());
        scores.setPlayer(null);
        //scores.setTimePoint(null);
        scores.setWardScore(node.get("wardScore").asInt());

        return scores;
    }
}
