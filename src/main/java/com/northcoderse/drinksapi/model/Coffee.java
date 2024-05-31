package com.northcoderse.drinksapi.model;

public class Coffee {

    int id;
    String name;

    public Coffee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
