package com.work.acttest;

import java.util.Scanner;

public class RevEachWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        String[] words=str.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            StringBuilder sb=new StringBuilder(words[i]);
            String res=sb.reverse().toString();
            System.out.print(res+" ");
        }
    }
}
