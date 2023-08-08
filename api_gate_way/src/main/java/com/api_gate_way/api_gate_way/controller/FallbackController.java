package com.api_gate_way.api_gate_way.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/userServiceFallback")
    public String userServiceFallback(){
        return "User Service is Down!!";
    }

    @GetMapping("/contactServiceFallback")
    public String contactServiceFallback(){
        return "Contact Service is Down!!";
    }
}
