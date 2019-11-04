package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


//@EnableZuulProxy 包含了 @EnableZuulServer 设置该类是网关启动类
//@EnableAutoConfiguration 可以帮助spring boot 应用将所有符合条件的 @Configuration 配置加载到spring boot 创建并使用的IOC容器中
@EnableZuulProxy
@EnableAutoConfiguration
public class ZuulApplication {
    public static void main(String[] args){
        SpringApplication.run(ZuulApplication.class, args);
    }
}
