package com.vw.rent.config.redis;

import org.apache.commons.lang.SerializationUtils;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;
import org.springframework.lang.Nullable;

import java.io.Serializable;

public class EntityRedisSerializer implements RedisSerializer<Object> {
    @Nullable
    @Override
    public byte[] serialize(@Nullable Object o) throws SerializationException {
        if (o == null) {
            return new byte[0];
        }
        return SerializationUtils.serialize((Serializable) o);
    }

    @Nullable
    @Override
    public Object deserialize(@Nullable byte[] bytes) throws SerializationException {
        if (bytes == null || bytes.length == 0) {
            return null;
        }
        return SerializationUtils.deserialize(bytes);
    }
}
