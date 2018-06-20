package com.example.demo.redis;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RedisController {

    private static final Logger logger = Logger.getLogger(RedisController.class);

//    @Autowired
//    private RestTemplate restTemplate;
//    @Autowired
//    private RedisTemplate redisTemplate;
    @Autowired
    private RedisService redisService;

//    @RequestMapping(value="/get/redisResp")
//    @ResponseBody
//    public RedisQueryResp getRedisResp(String respId){
//        logger.info("测试redis");
//        String redisSet = "hello";
//        redisTemplate.opsForValue().set("redisSet",redisSet);
//        Object obj = redisTemplate.opsForValue().get("redisSet");
//        RedisQueryResp resp=new RedisQueryResp();
//        resp.setOid(respId);
//        resp.setName(obj.toString());
//
//        return resp;
//    }

        @RequestMapping("/save")
        public String save(){   //这里用于测试，key值可以自定义实现
            redisService.set("123456","test-redis");
            return "SUCCESS";
        }

        @RequestMapping("/get")
        public String get(){    //这里用于测试，key值可以自定义实现
            return (String) redisService.get("123456");
    }
}