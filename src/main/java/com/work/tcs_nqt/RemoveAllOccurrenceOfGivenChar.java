package com.work.tcs_nqt;

import java.util.Scanner;

public class RemoveAllOccurrenceOfGivenChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        char ch=sc.next().charAt(0);

        char[] ch2=str.toCharArray();
        for (int i = 0; i < ch2.length; i++) {
            if(ch2[i]!=ch){
                System.out.print(ch2[i]);
            }
        }
    }
}
