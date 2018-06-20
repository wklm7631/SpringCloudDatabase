package com.example.demo.redis;

public interface RedisService {

    void set(String key, Object value);

    Object get(String key);
}
