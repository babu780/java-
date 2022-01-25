package com.exception;

import java.util.Scanner;

public class InputMismatchException {
    public static void main(String[] args) {
        try {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter Number 1");

            int number1 = input.nextInt();

            System.out.println("Enter Number 2");
            int number2 = input.nextInt();

            System.out.println("Enter Number 3");
            int number3 = input.nextInt();

            int addition = number1 + number2 + number3;
            System.out.println("Final result =" + addition);
        }catch (Exception e){
            System.out.println( e);
        }
    }


}

