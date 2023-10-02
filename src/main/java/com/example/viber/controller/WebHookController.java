package com.example.viber.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebHookController {

    @PostMapping("hook")
    public void testWebHook() {
        System.out.println("Test web hook!!");
    }
}
