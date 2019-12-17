package com.mr.user.controller;

import com.mr.user.redis.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private RedisUtil redisUtil;

    @GetMapping("demo")
    public Object demo(){
        HashMap<Object, Object> map = new HashMap<>();
        HashMap<Object, Object> map2 = new HashMap<>();
        map.put("name","liwegnxiu");
        map.put("age","12");
        map2.put("name","123");
        map2.put("age","122");
        redisUtil.setHash("user","user",map);
        redisUtil.setHash("user","user1",map2);
        Object map3 = redisUtil.getHash("user","user");
        //Object map3 =redisUtil.getHash("user","user1");
        return map3;
    }


}
