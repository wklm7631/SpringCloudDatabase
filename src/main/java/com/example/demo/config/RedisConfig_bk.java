//package com.example.demo.config;//package com.example.demo.config;
//
//import org.apache.log4j.Logger;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.web.client.RestTemplateBuilder;
//import org.springframework.cache.CacheManager;
//import org.springframework.cache.annotation.CachingConfigurerSupport;
//import org.springframework.cache.annotation.EnableCaching;
//import org.springframework.cache.interceptor.KeyGenerator;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.redis.cache.RedisCacheManager;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.core.StringRedisTemplate;
//import org.springframework.data.redis.core.ValueOperations;
//import org.springframework.web.client.RestTemplate;
//
//import java.lang.reflect.Method;
//
//@Configuration
//@EnableCaching
//public class RedisConfig extends CachingConfigurerSupport {
//    private static Logger logger=Logger.getLogger(RedisConfig.class);
//
//    @Bean
//    public KeyGenerator keyGenerator(){
//        return new KeyGenerator(){
//            @Override
//            public Object generate(Object target, Method method, Object... params){
//                StringBuilder sb=new StringBuilder();
//                sb.append(target.getClass().getName());
//                sb.append(method.getName());
//                for(Object obj:params){
//                    sb.append(obj.toString());
//                }
//                return sb.toString();
//            }
//        };
//    }
//
////    @Bean
////    public CacheManager cacheManager(RedisTemplate redisTemplate){
////        RedisCacheManager rcm=new RedisCacheManager(redisTemplate);
////        return rcm;
////    }
//
//    @Bean
//    public RestTemplate restTemplate(RestTemplateBuilder builder) {
//        return builder.build();
//    }
//
//    @Autowired
//    RedisTemplate redisTemplate;
//
//    @Bean
//    public ValueOperations<String, Object> vod(){
//        return redisTemplate.opsForValue();
//    }
//
//}