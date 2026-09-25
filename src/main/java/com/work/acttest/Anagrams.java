package com.work.acttest;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();

        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2)){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagrams");
        }
    }
}
