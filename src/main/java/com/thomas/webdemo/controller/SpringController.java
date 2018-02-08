package com.thomas.webdemo.controller;


//表明这是一个 Controller
//@Controller

import com.thomas.webdemo.bean.HelloBean;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//RestController是一种Rest风格的Controller，可以直接返回对象而不返回视图，返回的对象可以使JSON，XML等
@RestController
//使用自动配置，主动添加并解析bean，配置文件等信息
@EnableAutoConfiguration
public class SpringController {

    //设置访问的url
    @RequestMapping("/hello")
    //表示返回JSON格式的结果，如果前面使用的是@RestController可以不用写
//    @ResponseBody
    public String hello() {

        return "Hello World!";//返回结果为字符串
    }


    @RequestMapping("/helloBean")
    public HelloBean getHelloBean(@RequestBody HelloBean helloBean){
        System.out.println(helloBean.toString());
        return helloBean;
    }


}