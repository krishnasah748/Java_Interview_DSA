package com.work.acttest;

import java.util.Scanner;

public class LongestWordInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] words=str.split("\\s+");
        String max=words[0];
        for (int i = 0; i < words.length; i++) {
            if(words[i].length()>max.length()){
                max=words[i];
            }
        }
        System.out.println(max);
    }
}
