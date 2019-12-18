package com.mr.user.controller;

import com.mr.user.entity.CommentVO;
import com.mr.user.entity.ProductVO;
import com.mr.user.mongoDB.MongoDBUtil;
import com.mr.user.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("demoController")
public class DemoController {

    @Autowired
    private DemoService demoSer;

    @Autowired
    private MongoDBUtil mongodbUtil;

    @RequestMapping("demo")
    public void test(String id, ProductVO productVO){
        CommentVO c1 = new CommentVO("Giaole","华为的新电脑真特喵的好用");
        CommentVO c2 = new CommentVO("Qige","你瞎说 这个电脑 怎么说呢  真特喵的垃圾");
        CommentVO c3 = new CommentVO("Dai","你俩都是弟弟  你们不是从我这买的");
        CommentVO c4 = new CommentVO("wanglei" ,"班长 你看咱俩关系这么好  便宜点儿呗 1折你看成么");
        List<CommentVO> list = new ArrayList<>();
        List<CommentVO> list1 = new ArrayList<>();
        list1.add(c4);
        c3.setCommentList(list1);
        list.add(c2);
        list.add(c3);
        c1.setCommentList(list);
//        HashMap<List, String> map = new HashMap<>();
//        map.put(list,"list");
//        map.put(list1,"list1");
        mongodbUtil.save(c1,"demo1");
    }
    @RequestMapping("list")
    public String list(String id, ProductVO productVO,ModelMap map){
        Map<Object,Object> list = (Map<Object, Object>) mongodbUtil.findInfo();
        map.put("list",list);
        System.out.println(map.values());
        System.out.println(list.get("userId"));

        return "demo/user";
    }


}
