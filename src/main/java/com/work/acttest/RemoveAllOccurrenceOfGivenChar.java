package com.work.acttest;

import java.util.Scanner;

public class RemoveAllOccurrenceOfGivenChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch=sc.next().charAt(0);

        char[] ch1=str.toCharArray();
        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i]!=ch){
                System.out.print(ch1[i]);
            }
        }
    }
}
