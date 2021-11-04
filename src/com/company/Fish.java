package com.company;

public class Fish extends Animal implements Pet{

     private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String setName(String name) {
        this.name = name;
        return name;
    }

    @Override
    public void play() {
        System.out.println("No puede Jugar");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("No puede caminar");
    }

    @Override
    public void eat() {
        System.out.println("Come peces");
    }

}
