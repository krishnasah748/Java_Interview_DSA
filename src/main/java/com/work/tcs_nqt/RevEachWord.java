package com.work.tcs_nqt;

import java.util.Scanner;

public class RevEachWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        String[] arr=str.split("\\s+");
        for(int i=0;i< arr.length;i++){
            StringBuilder sb=new StringBuilder(arr[i]);
            String res=sb.reverse().toString();
            System.out.print(res+" ");
        }
    }
}
