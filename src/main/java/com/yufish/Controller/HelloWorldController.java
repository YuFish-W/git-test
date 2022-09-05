package com.yufish.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class HelloWorldController {
    @GetMapping("/hello")
    public String hello(){
        return "hello1";
    }
}
