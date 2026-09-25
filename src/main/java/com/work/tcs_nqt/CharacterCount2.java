package com.work.tcs_nqt;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class CharacterCount2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
        for (char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        boolean first=true;
        System.out.print("[");
        for (char ch:map.keySet()){
            if(!first){
                System.out.print(", ");
            }
            System.out.print("'"+ch+"'"+" = "+map.get(ch));
            first=false;
        }
//        System.out.print("\b\b");   // it removes the last line comma
        System.out.print("]");



    }
}
