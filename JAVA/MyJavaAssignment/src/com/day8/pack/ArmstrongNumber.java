package com.day8.pack;

public class ArmstrongNumber {
    public static void main(String[] args) {

        int num = 153;
        int original = num;
        int sum = 0;
        int remainder;

        while (num != 0) {
            remainder = num % 10;                 // get last digit
            sum = sum + (remainder * remainder * remainder); // cube of digit
            num = num / 10;                       // remove last digit
        }

        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
