package com.mr.utils.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;

@Component
public class RedisUtil {

    @Autowired
    RedisTemplate redisTemplate;

    public void setString(String key,String value){
        redisTemplate.opsForValue().set(key,value);
    }

    public Object getString(String key,String value){
        return redisTemplate.opsForValue().get(key);
    }

    public void setList(String key, List<Object> list){
        redisTemplate.opsForList().set(key,0,list);
    }

//    public Object getListSize(String key, long sta, long end){
//        return redisTemplate.opsForList().range(key,sta,end);
//    }
//
//    public Object getList(String key, long sta, long end){
//        return redisTemplate.opsForList().size(key);
//    }

    public void setHash(String kuName,String name,Object value){
        redisTemplate.opsForHash().put(kuName,name,value);
    }

    public Object getHash(String kuName,String name){
        return redisTemplate.opsForHash().get(kuName,name);
    }

}
