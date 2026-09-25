package com.work.acttest;

import java.util.Scanner;

public class MoveZeroToFirst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        int count=0;
        StringBuilder sb=new StringBuilder();
        for (char ch:str.toCharArray()){
            if(ch=='0'){
                count++;
            }else{
                sb.append(ch);
            }
        }

        StringBuilder res=new StringBuilder();
        for (int i = 0; i < count; i++) {
            res.append('0');
        }

        res.append(sb);
        System.out.println(res);
    }
}
