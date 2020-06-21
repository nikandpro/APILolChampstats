package com.github.lol.nikandpro.deserialize;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.github.lol.nikandpro.model.game.Game;
import com.github.lol.nikandpro.model.game.GameStatus;

import java.io.IOException;

public class GameDeserialize extends StdDeserializer<Game> {

    public GameDeserialize() {
        super(Game.class);
    }

    @Override
    public Game deserialize(JsonParser parser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        Game game = new Game();
        JsonNode node = parser.getCodec().readTree(parser);
        game.setId(node.get("gameId").asLong());
        game.setGameMode(node.get("gameType").asText());
        game.setGameStatus(GameStatus.play);
        return game;
    }
}
