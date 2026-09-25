package com.work.acttest;

import java.util.Scanner;

public class SmallestWordInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        String[] words=str.split("\\s+");
        String min=words[0];
        for (int i = 0; i < words.length; i++) {
            if(min.length()>words[i].length()){
                min=words[i];
            }
        }
        System.out.println("smallest string : "+min);
    }
}
