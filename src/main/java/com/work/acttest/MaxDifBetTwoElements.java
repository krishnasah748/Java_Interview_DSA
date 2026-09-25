package com.work.acttest;

import java.util.Scanner;

public class MaxDifBetTwoElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        int md=0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int d=arr[j]-arr[i];
                if(d>md){
                    md=d;
                }
            }
        }
        System.out.println(md);
    }
}
