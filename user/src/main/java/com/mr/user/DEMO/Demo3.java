package com.mr.user.DEMO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan
public class Demo3 {

    public static void main(String[] args) {
        System.out.println("==========");
        ApplicationContext app =  new AnnotationConfigApplicationContext(Demo3.class);
    }
}
