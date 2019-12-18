package com.mr.user.controller;

import com.mr.user.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("demoController")
public class DemoController {

    @Autowired
    private DemoService demoSer;

    @RequestMapping("demo")
    public String demo(){
        return "demo/user";
    }

}
