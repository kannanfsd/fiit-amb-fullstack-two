package com.fiit.access;

import java.util.Scanner;

    public class ReturnDemo {
    public String getNumbersInWords(int number) {
        String numbers = "Please enter a number between 1 and 5";
        if(number == 1){
            numbers = "One";
        }else if(number == 2){
            numbers = "Two";
        }else if(number == 3){
            numbers = "Three";
        }else if(number == 4){
            numbers = "Four";
        }else if(number == 5){
            numbers = "Five";
        }
        return numbers;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number you want to return in words [1 to 5]");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        ReturnDemo demo = new ReturnDemo();
        System.out.println(demo.getNumbersInWords(number));
        scanner.close();
    }
}
