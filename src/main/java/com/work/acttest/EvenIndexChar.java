package com.work.acttest;

import java.util.Scanner;

public class EvenIndexChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] ch=str.toCharArray();
        for (int i = 0; i <ch.length; i++) {
            if (i%2==0){
                System.out.print(ch[i]);
            }
        }
    }
}
