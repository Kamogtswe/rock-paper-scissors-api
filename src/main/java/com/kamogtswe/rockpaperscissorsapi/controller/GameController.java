package com.kamogtswe.rockpaperscissorsapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/game")
public class GameController {
    
    @GetMapping("/")
    public String hello() {
        return "hello world";
    }
}
