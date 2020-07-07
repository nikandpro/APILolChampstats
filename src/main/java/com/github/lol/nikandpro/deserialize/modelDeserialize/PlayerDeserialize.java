package com.github.lol.nikandpro.deserialize.modelDeserialize;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.github.lol.nikandpro.model.activPlayer.Player;

import java.io.IOException;
import java.util.Collection;

public class PlayerDeserialize extends StdDeserializer<Player> {

    public PlayerDeserialize() {
        super(Player.class);
    }

    @Override
    public Player deserialize(JsonParser parser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        JsonNode node = parser.getCodec().readTree(parser);
        System.out.println("PlayerDeserialize");
        Player player = new Player();
        player.setId(0);
        player.setBot(node.get("isBot").asBoolean());
        player.setLevel(node.get("level").asInt());
        player.setSummonerName(node.get("summonerName").asText());
        player.setChampionName(node.get("championName").asText());
        player.setDead(node.get("isDead").asBoolean());
        player.setPosition(node.get("position").asText());
        player.setRawChampionName(node.get("rawChampionName").asText());

        return player;
    }
}
