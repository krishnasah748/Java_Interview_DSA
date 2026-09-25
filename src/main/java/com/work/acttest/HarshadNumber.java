package com.work.acttest;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int original=n;
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        if (original%sum==0){
            System.out.println("Harshad number");
        }else{
            System.out.println("Not a harshad number");
        }
    }
}

//A Harshad number (also called a Niven number) is a number that is divisible by the sum of its digits.
