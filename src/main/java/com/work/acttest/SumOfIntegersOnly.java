package com.work.acttest;

import java.util.Scanner;

public class SumOfIntegersOnly {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] str=new String[n];
        for (int i = 0; i < n; i++) {
            str[i]=sc.next();
        }

        int sum=0;
        for (int i=0;i< str.length;i++){
            try {
                sum+=Integer.parseInt(str[i]);
            }catch (NumberFormatException e){

            }
        }
        System.out.println("sum of integers only :"+ sum);
    }
}
