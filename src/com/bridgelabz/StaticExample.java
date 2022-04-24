package com.bridgelabz;

public class StaticExample {
    static int num1=5;
    static int num2;
    static int sum(int num1, int num2){
        System.out.println("Static method!");
        return num1+num2;
    }
    static{
        System.out.println("Static Block Initialisation!");
        num2 = num1*num1;
    }
    public static void main(String[] args) {
        System.out.println("Number1: "+num1+" Number2: "+num2);
        int result = sum(num1, num2);
        System.out.println("Result of sum of two numbers: "+result);
    }
}
