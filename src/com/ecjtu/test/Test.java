package com.ecjtu.test;

public class Test {
    private String name;
    private String adress;
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}
