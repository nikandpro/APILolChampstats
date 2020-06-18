package com.github.lol.nikandpro.Deserialize;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.github.lol.nikandpro.model.activPlayer.Scores;

import java.io.IOException;

public class ScoresDeserialize extends StdDeserializer<Scores> {

    public ScoresDeserialize() {
        super(Scores.class);
    }

    @Override
    public Scores deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        return null;
    }
}
