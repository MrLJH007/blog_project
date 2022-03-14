package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mr.li JinHai
 * @date 2022/3/14-20:41
 */
@RestController
public class test {
    @GetMapping("/test")
    public String hello(){
        return "hallow";
    }


}
