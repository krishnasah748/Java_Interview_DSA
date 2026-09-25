package com.work.acttest;

import java.util.HashMap;
import java.util.Scanner;

public class DuplicateElementsInArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for (int num:map.keySet()){
            if (map.get(num)>=2){
                System.out.print(num+" ");
            }
        }
    }
}
