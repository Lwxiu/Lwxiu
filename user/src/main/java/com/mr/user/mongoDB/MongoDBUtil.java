package com.mr.user.mongoDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Component
public class MongoDBUtil {

    @Autowired
   private  MongoTemplate template;

    /**
     * 新增方法
     * collection的意思是收集
     * @param map
     * @param collectionName
     */
   public void save(Object map,String collectionName){
       template.save(map,collectionName);
   }

    /**
     * 查询
     * find 的意思是找到
     * info 的意思是信息
     * @return
     */
   public Object findInfo(){
       //创建一个Query对象,用来存放 要查询的信息
       Query query = new Query();

        //要查询的 字段   值
       Criteria criteria = Criteria.where("age").is("20");

       //将写好的要查询的信息放入Query中
       query.addCriteria(criteria);

       //把要查询的query 放入template中
       //第一个是要查询的字段和值,第二个是实体类,第三个是表名
       Map<Object, Object> demo1 = template.findOne(query,Map.class, "demo1");
       return demo1;
   }
}
