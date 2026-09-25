package com.work.acttest;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
        for (char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for (char ch:str.toCharArray()){
            System.out.println(ch+": "+map.get(ch));
        }
    }
}
