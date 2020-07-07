package com.github.lol.nikandpro.deserialize.modelDeserialize;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.github.lol.nikandpro.model.activPlayer.RuneActivPlayer;
import com.github.lol.nikandpro.model.core.rune.Rune;

import java.io.IOException;

public class RuneActivPlayerDeserialize extends StdDeserializer<RuneActivPlayer> {

    public RuneActivPlayerDeserialize() {
        super(RuneActivPlayer.class);
    }

    @Override
    public RuneActivPlayer deserialize(JsonParser parser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        JsonNode node = parser.getCodec().readTree(parser);
        JsonNode rune;
        rune = node.get("keystone");
        Rune keystone = parser.getCodec().readValue(rune.traverse(parser.getCodec()), Rune.class);
        keystone.setNameRune("keystone");

        rune = node.get("primaryRuneTree");
        Rune primaRune = parser.getCodec().readValue(rune.traverse(parser.getCodec()), Rune.class);
        primaRune.setNameRune("primaryRuneTree");

        rune = node.get("secondaryRuneTree");
        Rune secondRune = parser.getCodec().readValue(rune.traverse(parser.getCodec()), Rune.class);
        secondRune.setNameRune("secondaryRuneTree");

        RuneActivPlayer runeActivPlayer = new RuneActivPlayer();
        runeActivPlayer.setId(0);
        runeActivPlayer.setKeystone(keystone);
        runeActivPlayer.setPrimaryRuneTree(primaRune);
        runeActivPlayer.setSecondaryRuneTree(secondRune);

        return runeActivPlayer;
    }
}
