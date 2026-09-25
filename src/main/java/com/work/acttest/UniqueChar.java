package com.work.acttest;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        LinkedHashSet<Character> set=new LinkedHashSet<>();
        for (char ch:str.toCharArray()){
            set.add(ch);
        }
        for(char ch:set){
            System.out.print(ch);
        }
    }
}
