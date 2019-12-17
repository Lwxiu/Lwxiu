package com.mr.user.controller;

import com.mr.user.swagger.SwaggerEntity;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Api(value = "sa",tags = "SawggerController测试")
@RestController
@RequestMapping("sa")
public class SawggerController {



    //操作
    @ApiOperation(value = "test",notes = "SawggerController测试类的第一个方法",httpMethod = "GET")
    //入参
    @ApiImplicitParams({
            //是什么操作   什么数据类型  名字 值 必须的
            @ApiImplicitParam(paramType = "query",dataType = "String",name = "id",value = "查询的id",required = true),
            @ApiImplicitParam(paramType = "query",dataType = "SwaggerEntity",name = "entity",value = "查询的对象")
    })
    //返回
    @ApiResponses({
            //路径   提示  返回的数据类型
            @ApiResponse(code = 200,message = "操作成功",response = Map.class),
            @ApiResponse(code = 500,message = "失败")
    })
    @GetMapping("test")
    public Map<String,Object> demo(String id, SwaggerEntity entity){
        System.out.println("66666666666666");
        Map<String, Object> map = new HashMap<>();
        map.put("ley",id);
        map.put("value",entity);
        return map;
    }
}
