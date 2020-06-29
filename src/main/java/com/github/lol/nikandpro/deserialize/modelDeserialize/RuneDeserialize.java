package com.github.lol.nikandpro.deserialize.modelDeserialize;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.github.lol.nikandpro.model.core.rune.Rune;

import java.io.IOException;

public class RuneDeserialize extends StdDeserializer<Rune> {

    public RuneDeserialize() {
        super(Rune.class);
    }

    @Override
    public Rune deserialize(JsonParser parser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        JsonNode node = parser.getCodec().readTree(parser);
        Rune rune = new Rune();
        rune.setDisplayName(node.get("displayName").asText());
        rune.setId(node.get("id").asInt());
        rune.setRawDescription(node.get("rawDescription").asText());
        rune.setRawDisplayName(node.get("rawDisplayName").asText());
        return rune;
    }
}
