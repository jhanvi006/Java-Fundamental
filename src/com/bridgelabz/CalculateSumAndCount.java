package com.bridgelabz;

public class CalculateSumAndCount {
    public static void main(String[] args) {
        int sum=0;
        int invalidNo=0;
        for (int i=0; i< args.length; i++){
            try {
                sum += Integer.parseInt(args[i]);
            }
            catch (NumberFormatException e){
                invalidNo++;
            }
        }
        System.out.println("Sum of integers: "+sum+" and "+invalidNo+" invalid numbers.");
    }
}
