package com.work.acttest;

import java.util.Scanner;

public class SepAlphaNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        char[] ch=str.toCharArray();
        String alpha="";
        String num="";
        for (int i = 0; i < ch.length; i++) {
            if(Character.isDigit(ch[i])){
                num+=ch[i];
            }
            else if(Character.isLetter(ch[i])){
                alpha+=ch[i];
            }
        }
        System.out.println("alpha: "+alpha);
        System.out.println("numeric: "+num);


    }
}
