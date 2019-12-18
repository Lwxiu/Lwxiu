package com.mr.user.controller;

import com.mr.user.mongoDB.MongoDBUtil;
import com.mr.user.redis.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("mongodb")
public class MongoDBController {

    @Autowired
    private MongoDBUtil mongodbUtil;

    @GetMapping("demo2")
    public void demo(){
        //mongodbUtil.save();
        Map<Object,Object> info = (Map<Object, Object>) mongodbUtil.findInfo();
        System.out.println(info);
    }


}
