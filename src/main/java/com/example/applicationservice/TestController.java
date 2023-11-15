package com.example.applicationservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {
    @Value("${test.data}")
    private String data = "";

    @Value("${default.value}")
    private String value =" ";

    @Value("${database.url}")
    private String url;

    @GetMapping("/test")
    public String test(){
        return data;
    }

    @GetMapping("/value")
    public String getValue(){
        return value;
    }

    @GetMapping("/db")
    public String db() {
        return url;
    }

}
