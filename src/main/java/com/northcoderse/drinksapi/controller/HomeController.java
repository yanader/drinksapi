package com.northcoderse.drinksapi.controller;

import com.northcoderse.drinksapi.model.Coffee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HomeController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping(value = "/")
    public String home(){
        return "Welcome to the Drinks API!";
    }

    @GetMapping(value="/health")
    public String health() {
        return "The drinks service is up and running";
    }

    @GetMapping(value = "/coffeelover")
    public String coffee(){
        return "I like coffee!";
    }


    @GetMapping("/coffee")
    public Coffee coffee(@RequestParam(value = "name", defaultValue = "latte") String name) {
        return new Coffee(counter.incrementAndGet(), name);
    }
}