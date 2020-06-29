package com.github.lol.nikandpro.deserialize.modelDeserialize;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.github.lol.nikandpro.model.core.abilities.Abilities;

import java.io.IOException;

public class AbilDeserialize extends StdDeserializer<Abilities> {

    public AbilDeserialize() {
        super(Abilities.class);
    }

    @Override
    public Abilities deserialize(JsonParser parser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        JsonNode node = parser.getCodec().readTree(parser);
        Abilities ab = new Abilities();
        ab.setAbilityLevel(node.get("abilityLevel").asInt());
        ab.setDisplayName(node.get("displayName").asText());
        ab.setId(node.get("id").asText());
        ab.setRawDescription(node.get("rawDescription").asText());
        ab.setRawDisplayName(node.get("rawDisplayName").asText());

        return ab;
    }
}
