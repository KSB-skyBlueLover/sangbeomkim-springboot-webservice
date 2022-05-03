package com.sangbeomkim.admin.springboot.web;

import com.sangbeomkim.admin.springboot.test2Arg.Test2Arg;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.tags.Param;

@RestController
@RequestMapping("/v1/api")
public class HelloController {


    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/get_test")
    public Test2Arg getTest(
            @RequestParam(value = "var1") String var1,
            @RequestParam(value = "var2") String var2) {

        Test2Arg test2Arg = new Test2Arg();
        test2Arg.setVar1(var2);
        test2Arg.setVar2(var1);

        return test2Arg;
    }
//    @Configuration
//    @EnableWebSecurity
//    public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//        @Override
//        protected void configure(HttpSecurity httpSecurity) throws Exception{
//            httpSecurity.httpBasic().disable();
//        }
//
//    }

}
