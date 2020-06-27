package com.github.lol.nikandpro.deserialize.modelDeserialize;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.github.lol.nikandpro.model.core.abilities.Abil;
import com.github.lol.nikandpro.model.core.abilities.E;

import java.io.IOException;

public class EDeserialize extends StdDeserializer<E> {

    public EDeserialize() {
        super(E.class);
    }

    @Override
    public E deserialize(JsonParser parser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        JsonNode node = parser.getCodec().readTree(parser);
        E e = new E();
        e.setAbilityLevel(node.get("abilityLevel").asInt());
        e.setDisplayName(node.get("displayName").asText());
        e.setId(node.get("id").asText());
        e.setRawDescription(node.get("rawDescription").asText());
        e.setRawDisplayName(node.get("rawDisplayName").asText());

        return e;
    }
}
