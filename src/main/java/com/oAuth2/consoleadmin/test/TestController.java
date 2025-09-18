package com.oAuth2.consoleadmin.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String responseMaker(){
        return "Consoleadmin : Test OAuth2";
    }

}
