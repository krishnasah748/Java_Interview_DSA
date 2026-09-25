package com.work.acttest;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class CharCount2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        for(char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        System.out.print("[");
        for (char ch: map.keySet()){
            System.out.print("'"+ch+"'= "+map.get(ch)+", ");
        }
        System.out.print("\b\b");
        System.out.print("]");
    }
}
