package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printFibonacciNumbers(100);
    }

    private static void printFibonacciNumbers(int num) {

        int Fnum = 0, Snum = 1, count;

        if(num < 1)
            return;

        for(count = 1; count<=num; count++){
            System.out.print(Snum + ",");
            int next = Fnum + Snum;
            Fnum = Snum;
            Snum = next;
        }
    }
}
