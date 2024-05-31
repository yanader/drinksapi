package com.northcoderse.drinksapi.controller;

import com.northcoderse.drinksapi.model.Tea;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class TeaController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/tealover")
    public String tea() {
        return "I love tea";
    }

    @GetMapping("/tea")
    public Tea getTea(@RequestParam(value="name", defaultValue="tea") String name,
                      @RequestParam(value="hasMilk", defaultValue = "false") boolean hasMilk,
                      @RequestParam(value="sugar", defaultValue = "0") int sugar) {
        return new Tea(counter.incrementAndGet(), name, hasMilk, sugar);
    }
}
