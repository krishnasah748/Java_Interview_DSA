package com.work.acttest;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int org=n;
        int rev=0;
        while(org!=0){
            int rem=org%10;
            rev=rev*10+rem;
            org/=10;
        }
        if(n==rev){
            System.out.println(n+" is a palindrome number");
        }else{
            System.out.println(n+" is not a palindrome number");
        }
    }
}
