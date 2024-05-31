package com.northcoderse.drinksapi.controller;

import com.northcoderse.drinksapi.model.Coffee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    @GetMapping(value = "/")
    public String home(){
        return "Welcome to the Drinks API!";
    }

    @GetMapping(value = "/coffeelover")
    public String coffee(){
        return "I like coffee!";
    }

    @GetMapping(value = "/coffee")

    public Coffee coffee(@RequestParam(name = "name", required = false)String name){
//        HashMap<String, String> map = new HashMap<>();
//        map.put("id","1");
//        if(name == null) {
//            map.put("name","latte");
//        } else {
//            map.put("name", name);
//        }
        Coffee coffee;
        if(name == null) {
           coffee = new Coffee(1,"latte");
        } else {
            coffee = new Coffee(1, name);
        }
    return coffee;
    }
}