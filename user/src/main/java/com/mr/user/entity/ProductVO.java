package com.mr.user.entity;

import lombok.Data;

import java.util.Date;

@Data
public class ProductVO {

    private Integer pid;
    private String pname;
    private Date pdate;

//    @Override
//    public String toString() {
//        return "ProductVO{" +
//                "pid=" + pid +
//                ", pname='" + pname + '\'' +
//                ", pdate=" + pdate +
//                '}';
//    }
}
