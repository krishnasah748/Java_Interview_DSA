package com.work.tcs_nqt;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        String[] s=str.split("\\s+");
        String lar=s[0];
        String seclar="";

        for (int i = 0; i < s.length; i++) {
            if(s[i].length() > lar.length()){
                seclar=lar;
                lar=s[i];
            }else if (s[i].length() > seclar.length() && s[i].length() !=lar.length()) {
                seclar = s[i];
            }
        }
        System.out.println(seclar);
    }
}
