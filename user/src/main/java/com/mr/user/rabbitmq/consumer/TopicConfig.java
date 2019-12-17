package com.mr.user.rabbitmq.consumer;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration//此注解表示该类为配置类
public class TopicConfig {

    @Bean//指把当前方法的返回值放入ioc中
    public Queue coreQueue(){
        return new Queue("queue1905");
    }

    @Bean
    public TopicExchange coreExchange(){
        return new TopicExchange("exchange11905");
    }

    @Bean
    public Binding bindCoreQueueExchange(Queue coreQueue,TopicExchange coreExchange){
        return BindingBuilder.bind(coreQueue).to(coreExchange).with("demo11905");
    }

}
