package com.work.acttest;

import java.util.Scanner;

public class IndexOfFirstOccInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String needle=sc.nextLine();
        int index=str.indexOf(needle);
        System.out.println(index);
    }
}
