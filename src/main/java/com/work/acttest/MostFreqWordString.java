package com.work.acttest;

import java.util.HashMap;
import java.util.Scanner;

public class MostFreqWordString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        String[] words=str.split("\\s+");
        HashMap<String,Integer>map=new HashMap<>();
        for (String ch:words){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int count=0;
        String res=" ";
        for (String ch:words){
            if(map.get(ch)>count){
                count=map.get(ch);
                res=ch;
            }
        }
        System.out.println(res+" = "+count);
    }
}
