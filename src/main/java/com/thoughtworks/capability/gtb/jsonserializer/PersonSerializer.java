package com.thoughtworks.capability.gtb.jsonserializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.thoughtworks.capability.gtb.vo.PersonVo;

import java.io.IOException;

public class PersonSerializer extends JsonSerializer<PersonVo> {
    @Override
    public void serialize(PersonVo value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        Integer writeAge = 0;
        if (value.getAge() != null) {
            writeAge = value.getAge();
        }
        gen.writeStartObject();
        gen.writeFieldName("id");
        gen.writeString(value.getId());
        gen.writeFieldName("age");
        gen.writeNumber(writeAge);
        gen.writeFieldName("name");
        gen.writeString(value.getName());
        if (value.getHobby() != null) {
            gen.writeFieldName("hobby");
            gen.writeString(value.getHobby());
        }
        gen.writeEndObject();
    }
}
