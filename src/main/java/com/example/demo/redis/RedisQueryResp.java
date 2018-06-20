package com.example.demo.redis;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@lombok.Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class RedisQueryResp {
    private String oid;
    private String name;
}