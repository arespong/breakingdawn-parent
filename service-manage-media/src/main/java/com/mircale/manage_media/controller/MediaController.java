package com.mircale.manage_media.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MediaController {
    @RequestMapping("/echo")
    public String echo(){
        return "echo1111";
    }
}
