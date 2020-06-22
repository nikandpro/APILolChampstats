package com.github.lol.nikandpro.deserialize;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.github.lol.nikandpro.model.game.TimePoint;

import java.io.IOException;

public class TimePointDeserialize extends StdDeserializer<TimePoint> {

    public TimePointDeserialize() {
        super(TimePoint.class);
    }

    @Override
    public TimePoint deserialize(JsonParser parser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        System.out.println("timePointDes");
        TimePoint timePoint = new TimePoint();
        JsonNode node = parser.getCodec().readTree(parser);
        timePoint.setId(0);
        timePoint.setGameTime(node.get("gameTime").asDouble());
        timePoint.setGame(null);
        System.out.println("finishedTimePointDes");
        return timePoint;
    }
}
