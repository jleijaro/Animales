package com.company;

public class Spider extends Animal{

    public Spider() {
        leg = 8;
    }

    @Override
    public void eat() {
        System.out.println("Insectos");
    }

    @Override
    public void walk() {
        super.walk();
    }
}
