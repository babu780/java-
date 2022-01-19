package com.oop.inheritance.hybridinheritance;

public class Mehedi extends Human implements Nasrullah,Nazmul{
    @Override
    public void intelligent() {
        System.out.println("He was intelligent");
    }

    @Override
    public void patience() {
        System.out.println("He has lot of patience");

    }
}
