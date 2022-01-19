package com.oop.inheritance.multipleinheritance;

public class C implements A,B {


    @Override
    public void car() {
        System.out.println(" I have a car name Toyota");

    }

    @Override
    public void cycle() {
        System.out.println("cycle");

    }

    @Override
    public void plane() {
        System.out.println("Qutar airlines");

    }
}
