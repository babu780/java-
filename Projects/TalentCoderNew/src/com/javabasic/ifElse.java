package com.javabasic;

public class ifElse {
    public static void main(String[] args) {
        int age1 = 60;
        int age2 = 40;

        if (age1 < age2) {
            System.out.println("Hello");
        }else if  (age1 > age2){
            System.out.println("Hello2");

        }else{
            System.out.println("Bye BYe");
        }
        String userId = "nasrullah";
        String passward = "123456";

        if ((userId == "nasrullah") && (passward == "123456")){
            System.out.println("Login successful");
        } else {
            System.out.println("you entered incorrect userid and passward");
        }

    }
}
