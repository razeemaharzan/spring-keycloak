package com.example.springkeycloak.controller;

import com.example.springkeycloak.controller.dto.MessageDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class DemoController {

    @GetMapping(value="/demo")
    public MessageDto adminEndPoint() {
        return new MessageDto("Hello From Admin");
    }
    @GetMapping(value="/manager")
    public MessageDto managerEndPoint() {
        return new MessageDto("Hello From Manager");
    }
}