package com.example.delhi_metro;

public class blueline {
    private int id;
    private String name;

    public blueline(String name,int id) {
        this.name = name;
        this.id=id;
    }
    public blueline(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



