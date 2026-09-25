package com.work.acttest;

import java.util.Scanner;

public class CountVowelAndConst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        int vc=0;
        int cc=0;
        str=str.toLowerCase();
        for (char ch:str.toCharArray()){
            if(ch>='a' && ch<='z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vc++;
                } else {
                    cc++;
                }
            }
        }
        System.out.println("vowel count: "+vc);
        System.out.println("Const count: "+cc);
    }
}
