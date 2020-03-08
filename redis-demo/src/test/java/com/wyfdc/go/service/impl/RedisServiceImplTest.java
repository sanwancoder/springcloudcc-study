package com.wyfdc.go.service.impl;

import com.wyfdc.go.RedisDemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RedisDemoApplication.class )
public class RedisServiceImplTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void test1(){
        String key = "hash";
        Map<String, String> map = new HashMap<>();
        map.put("filed1", "value1");
        map.put("filed2", "value2");
        //相当于hmset
        redisTemplate.opsForHash().putAll(key, map);
        //相当于hset
        redisTemplate.opsForHash().put(key, "filed3", "10");
        //相当于hexists key filed //是否存在
        boolean bool = redisTemplate.opsForHash().hasKey(key, "filed3");
        System.out.println(bool);
        //相当于hgetall {filed1=value1, filed2=value2, filed3=10}获取所有hash的键=值
        Map map1 = redisTemplate.opsForHash().entries(key);
        System.out.println(map1);
        //hincrby //加5  如果是原数据是float类型会异常
        redisTemplate.opsForHash().increment(key, "filed3", 5);
        redisTemplate.opsForHash().increment(key, "filed3", 2.2);
        //hvals [value1, value2, 17.199999999999999] 获取所有的value
        System.out.println(redisTemplate.opsForHash().values(key));
        //hkeys [filed1, filed2, filed3] //获取所有的键
        System.out.println(redisTemplate.opsForHash().keys(key));
        List<String> list = new ArrayList<>();
        list.add("filed1");
        list.add("filed2");
        //hmget  [value1, value2] // 获取对于的键  值 没有就返回空
        System.out.println(redisTemplate.opsForHash().multiGet(key, list));
        //hsetnx 不存在的时候才会设置进入true   否则返回false
        System.out.println(redisTemplate.opsForHash().putIfAbsent(key,"filed4", "value4"));
        //hdel 返回删除个数
        System.out.println(redisTemplate.opsForHash().delete(key,"filed1","filed2","filed6"));

    }



}