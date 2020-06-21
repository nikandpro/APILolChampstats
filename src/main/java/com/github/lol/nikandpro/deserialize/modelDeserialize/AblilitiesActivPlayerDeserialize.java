package com.github.lol.nikandpro.deserialize.modelDeserialize;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.github.lol.nikandpro.model.activPlayer.AbilitiesActivPlayer;

import java.io.IOException;

public class AblilitiesActivPlayerDeserialize extends StdDeserializer<AbilitiesActivPlayer> {


    public AblilitiesActivPlayerDeserialize() {
        super(AbilitiesActivPlayer.class);
    }

    @Override
    public AbilitiesActivPlayer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        return null;
    }


}
