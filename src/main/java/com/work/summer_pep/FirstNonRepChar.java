package com.work.summer_pep;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        HashMap<Character,Integer> map=new HashMap<>();
        for (char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for (char ch:map.keySet()){
            if(map.get(ch)>=2){
                System.out.println(ch);
                break;
            }
        }

    }
}
