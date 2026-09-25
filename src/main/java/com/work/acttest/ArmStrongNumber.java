package com.work.acttest;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int original=n;
        int count=0;
        while (original!=0){
            original/=10;
            count++;
        }

        original=n;
        int sum=0;
        while (original!=0){
            int rem=original%10;
            sum+=(int) Math.pow(rem,count);
            original/=10;
        }

        if(n==sum){
            System.out.println("ArmStrong Number");
        }else{
            System.out.println("Not ArmsStrong number");
        }
    }
}
