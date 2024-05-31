package com.northcoderse.drinksapi.model;

public class Tea {

    private final long id;
    private final String name;
    private final boolean hasMilk;
    private final int sugar;

    public Tea(long id, String name, boolean hasMilk, int sugar) {
        this.id = id;
        this.name = name;
        this.hasMilk = hasMilk;
        this.sugar = sugar;
    }

    public long getID() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public boolean isHasMilk() {
        return hasMilk;
    }

    public int getSugar() {
        return sugar;
    }
}
