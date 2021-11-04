package com.company;

public abstract  class Animal {
    protected int leg;

    public int Animal(int leg) {
        this.leg = leg;
        return leg;
    }

    public abstract void eat();

    public void walk(){
        System.out.println("numero de patas"+leg);
    }
}
