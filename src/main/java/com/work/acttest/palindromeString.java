package com.work.acttest;

import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        StringBuilder sb=new StringBuilder(str);
        String res=sb.reverse().toString();
        if(res.equals(str)){
            System.out.println(str+" is a palindrome");
        }else {
            System.out.println(str+" is not a palindrome");
        }
    }
}
