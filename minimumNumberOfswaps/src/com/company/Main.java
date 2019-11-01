package com.company;

import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    static int minimumSwaps(int[] arr) {
        int swap=0;
        boolean visited[]=new boolean[arr.length];

        for(int i=0;i<arr.length;i++){
            int j=i,mcycle=0;

            while(!visited[j]){
                visited[j]=true;
                j=arr[j]-1;
                mcycle++;
            }

            if(mcycle!=0)
                swap+=mcycle-1;
        }
        return swap;
    }

    public static void main(String[] args) {

        int [] arr = {1,5,4,3,2};
        int res =minimumSwaps(arr);
        System.out.println("Output : " +res);
    }
}

