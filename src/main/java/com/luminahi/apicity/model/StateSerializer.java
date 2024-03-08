package com.luminahi.apicity.model;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class StateSerializer extends JsonSerializer<City> {
    
    @Override
    public void serialize(City value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeStartObject();
        gen.writeNumberField("id", value.getId());
        gen.writeStringField("city", value.getCity());
        gen.writeStringField("state", value.getState().toString());
        gen.writeEndObject();
    }
}
