package com.example.demo.redisUser;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@lombok.Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo implements Serializable {
    private static final long serialVersionUID=1L;

    private String id;
    private String name;
    private int age;

}