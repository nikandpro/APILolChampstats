package com.github.lol.nikandpro.deserialize.modelDeserialize;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.github.lol.nikandpro.model.core.abilities.Abilities;
import com.github.lol.nikandpro.model.core.abilities.Passive;

import java.io.IOException;

public class PassiveDeserialize extends StdDeserializer<Passive> {

    public PassiveDeserialize() {
        super(Passive.class);
    }

    @Override
    public Passive deserialize(JsonParser parser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        JsonNode node = parser.getCodec().readTree(parser);
        Passive passive = new Passive();
        passive.setDisplayName(node.get("displayName").asText());
        passive.setRawDescription(node.get("rawDescription").asText());
        passive.setRawDisplayName(node.get("rawDisplayName").asText());

        return passive;
    }
}
