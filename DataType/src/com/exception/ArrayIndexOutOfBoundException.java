package com.exception;

public class ArrayIndexOutOfBoundException {


    public static void main(String[] args) {

        //try catch
        try {

            int[] numbers = new int[4];
            numbers[0] = 5;
            numbers[1] = 2;
            numbers[2] = 1;
            numbers[3] = 10;
            numbers[4] = 20;
            System.out.println(numbers[4]);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
