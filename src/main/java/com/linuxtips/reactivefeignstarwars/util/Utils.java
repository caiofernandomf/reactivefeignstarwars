package com.linuxtips.reactivefeignstarwars.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public final class Utils {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static <T> T[] convert (String value,Class<T[]> c) {

        JsonNode array = null;
        try {
            array = objectMapper.readTree(value);

            String key = array.get("results").toString();
            // JavaType javaType = objectMapper.getTypeFactory().constructParametricType(c.getClass()[]);

            return objectMapper.readValue(key, c);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
