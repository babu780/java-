package com.javabasic;

public class Variables {
    String getNameFirst,getNameLast;
    String nameFirst = "Nasrullah";
    String nameLast = "Bari";
    int age = 50;
    double price = 3.3;
    boolean news = true;

    public static void main(String[] args) {
        Variables mccoynet = new Variables();
        System.out.println("nameFirst =" +mccoynet.nameFirst);
        System.out.println("nameLast=" +mccoynet.nameLast);
        System.out.println("age =" +mccoynet.age);
        System.out.println("price=" +mccoynet.price);
        System.out.println("news = " +mccoynet.news);
    }
}
