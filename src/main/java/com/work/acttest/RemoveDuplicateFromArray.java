package com.work.acttest;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        HashSet<Integer>set=new HashSet<>();
        for (int num:arr){
            set.add(num);
        }

        int count=0;
        for (int num:set){
            count++;
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println(count);
    }
}
