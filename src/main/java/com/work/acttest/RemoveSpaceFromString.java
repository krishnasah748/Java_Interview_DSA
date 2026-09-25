package com.work.acttest;

import java.util.Scanner;

public class RemoveSpaceFromString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        str=str.replaceAll("\\s+","");
        System.out.println(str);
    }
}
