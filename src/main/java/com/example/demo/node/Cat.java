package com.example.demo.node;

public class Cat {

    private String name;
    private int age;
    private Cat cat;
    public Cat(){

    }
    public Cat( String name, int age, Cat cat){
        this.name = name;
        this.age = age;
        this.cat = cat;
    }
    public Cat(String name){
        this.name = name;
    }
    public Cat(int age){
        this.age = age;
    }
    public Cat(String name, int age){
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", 11);
        System.out.println(barsik.name + " " + barsik.age);

        Cat vaska = new Cat("Vaska", 8, barsik);
        System.out.println(vaska.cat.name + "  can bi Barsic");


    }

}
