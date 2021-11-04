package com.company;

public class Cat extends Animal implements Pet{

    private String name;
    /*public String Cat(String name){
        setName(name);
        return name;
    }*/

    /*public Cat() {
        leg=4;
    }*/

    public Cat(){
        this( " ");
    }
   public Cat(String name) {
       this.setName(name);
        //Cat(name);
        leg=4;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String setName(String name) {
        this.name=name;
        return name;
    }

    @Override
    public void play() {
        System.out.println("Juega con bolas de estambre");
    }

    @Override
    public void eat() {
        System.out.println("Come ratones");
    }
}
