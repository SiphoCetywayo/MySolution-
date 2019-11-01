package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number you want multiplied");
        int numInput = input.nextInt();

        multiplesOfInput(numInput);
    }

    private static void multiplesOfInput(int num) {
        for(int i = 1; i<=num; i++){
            int numMultiples = num * i;

            System.out.println(num + " * " + i + " = " + numMultiples);
        }
    }
}
