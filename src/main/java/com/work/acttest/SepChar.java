package com.work.acttest;

import java.util.Scanner;

public class SepChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        char[] ch=str.toCharArray();
        String lc="";
        String uc="";
        for (int i = 0; i < ch.length; i++) {
            if(Character.isLowerCase(ch[i])){
                lc+=ch[i];
            }else if (Character.isUpperCase(ch[i])){
                uc+=ch[i];
            }
        }
        System.out.println("lower case : "+lc);
        System.out.println("upper case : "+uc);
    }
}
