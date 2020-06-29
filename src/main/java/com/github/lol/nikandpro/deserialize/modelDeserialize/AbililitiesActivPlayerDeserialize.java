package com.github.lol.nikandpro.deserialize.modelDeserialize;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.github.lol.nikandpro.model.activPlayer.AbilitiesActivPlayer;
import com.github.lol.nikandpro.model.core.abilities.Abilities;
import com.github.lol.nikandpro.model.core.abilities.Passive;
import com.github.lol.nikandpro.model.core.rune.Rune;

import java.io.IOException;

public class AbililitiesActivPlayerDeserialize extends StdDeserializer<AbilitiesActivPlayer> {


    public AbililitiesActivPlayerDeserialize() {
        super(AbilitiesActivPlayer.class);
    }

    @Override
    public AbilitiesActivPlayer deserialize(JsonParser parser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        System.out.println("DeserializeAbilities");
        JsonNode node = parser.getCodec().readTree(parser);
        JsonNode abil;
        abil = node.get("E");
        Abilities e = parser.getCodec().readValue(abil.traverse(parser.getCodec()), Abilities.class);

        abil = node.get("Passive");
        System.out.println(abil.toString());
        Passive passive = parser.getCodec().readValue(abil.traverse(parser.getCodec()), Passive.class);

        abil = node.get("Q");
        Abilities q = parser.getCodec().readValue(abil.traverse(parser.getCodec()), Abilities.class);

        abil = node.get("R");
        Abilities r = parser.getCodec().readValue(abil.traverse(parser.getCodec()), Abilities.class);

        abil = node.get("W");
        Abilities w = parser.getCodec().readValue(abil.traverse(parser.getCodec()), Abilities.class);


        AbilitiesActivPlayer abilitiesActivPlayer = new AbilitiesActivPlayer();
        abilitiesActivPlayer.setId(0);
        abilitiesActivPlayer.setE(e);
        abilitiesActivPlayer.setPassive(passive);
        abilitiesActivPlayer.setQ(q);
        abilitiesActivPlayer.setR(r);
        abilitiesActivPlayer.setW(w);
        System.out.println("3");
        abilitiesActivPlayer.setActiveplayer(null);
        abilitiesActivPlayer.setTimePoint(null);
        System.out.println("4");
        return abilitiesActivPlayer;
    }


}
