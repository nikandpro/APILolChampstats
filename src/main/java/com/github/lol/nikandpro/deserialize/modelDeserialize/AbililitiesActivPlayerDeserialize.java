package com.github.lol.nikandpro.deserialize.modelDeserialize;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.github.lol.nikandpro.model.activPlayer.AbilitiesActivPlayer;
import com.github.lol.nikandpro.model.activPlayer.Activeplayer;
import com.github.lol.nikandpro.model.activPlayer.ChampionStats;
import com.github.lol.nikandpro.model.core.abilities.E;
import com.github.lol.nikandpro.model.core.abilities.Q;

import java.io.IOException;

public class AbililitiesActivPlayerDeserialize extends StdDeserializer<AbilitiesActivPlayer> {


    public AbililitiesActivPlayerDeserialize() {
        super(AbilitiesActivPlayer.class);
    }

    @Override
    public AbilitiesActivPlayer deserialize(JsonParser parser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        System.out.println("1");
        AbilitiesActivPlayer abilitiesActivPlayer = new AbilitiesActivPlayer();
        JsonNode node = parser.getCodec().readTree(parser);
        JsonNode eE = node.get("E");
        E e = parser.getCodec().readValue(eE.traverse(parser.getCodec()), E.class);
        System.out.println("2");
        //JsonNode qQ = node.get("Q");
        //Q q = parser.getCodec().readValue(qQ.traverse(parser.getCodec()), Q.class);
        abilitiesActivPlayer.setId(0);
        abilitiesActivPlayer.setE(e);
        System.out.println("3");
        abilitiesActivPlayer.setPassive(null);
        abilitiesActivPlayer.setActiveplayer(null);
        //abilitiesActivPlayer.setQ(q);
        abilitiesActivPlayer.setR(null);
        abilitiesActivPlayer.setW(null);
        abilitiesActivPlayer.setTimePoint(null);
        System.out.println("4");
        return abilitiesActivPlayer;
    }


}
