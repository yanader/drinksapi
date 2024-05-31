package com.northcoderse.drinksapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeaController {

    @GetMapping("/tealover")
    public String tea() {
        return "I love tea";

    }
}
