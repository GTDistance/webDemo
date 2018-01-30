package com.thomas.webdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by Thomas.Wang on 2018/1/28.
 */
//使用自动配置，主动添加并解析bean，配置文件等信息
//@EnableAutoConfiguration
@SpringBootApplication
public class SpringApp extends SpringBootServletInitializer {
    /**
     * 本地tomcat服务器的问题
     * @param application
     * @return
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringApp.class);
    }

    public static void main(String[] args) throws Exception {
        //通过SpringApplication的run()方法启动应用，无需额外的配置其他的文件
        SpringApplication.run(SpringApp.class, args);
    }
}
