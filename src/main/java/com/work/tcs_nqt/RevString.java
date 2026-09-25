package com.work.tcs_nqt;

import java.util.Scanner;

public class RevString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        char[] ch=str.toCharArray();
        for (int i= ch.length-1;i>=0;i--){
            System.out.print(ch[i]);
        }
    }
}
