package com.work.acttest;

import java.util.HashMap;
import java.util.Scanner;

public class MostFreqChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        HashMap<Character,Integer>map=new HashMap<>();
        for (char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int count=0;
        char res=' ';
        for (char ch:str.toCharArray()){
            if(map.get(ch)>count){
                count=map.get(ch);
                res=ch;
            }
        }
        System.out.println(res);
    }
}
