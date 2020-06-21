package com.github.lol.nikandpro.deserialize;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.github.lol.nikandpro.Client.GivenPlayer;
import com.github.lol.nikandpro.Client.Region;

import java.io.IOException;

public class GivenplayerDeserialize extends StdDeserializer<GivenPlayer> {

    public GivenplayerDeserialize() {
        super(GivenPlayer.class);
    }

    @Override
    public GivenPlayer deserialize(JsonParser parser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        System.out.println("des1");
        GivenPlayer givenPlayer = new GivenPlayer();
        JsonNode node = parser.getCodec().readTree(parser);
        System.out.println("des2");
        givenPlayer.setId(node.get("id").asText());
        givenPlayer.setName(node.get("name").asText());
        givenPlayer.setSummonerLevel(node.get("summonerLevel").asInt());
        System.out.println("des3");
        givenPlayer.setRegion(GivenPlayer.staticRegion);
        return givenPlayer;
    }
}
