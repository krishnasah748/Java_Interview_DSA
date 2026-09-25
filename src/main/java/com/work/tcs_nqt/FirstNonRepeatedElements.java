package com.work.tcs_nqt;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatedElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        HashMap<Integer, Integer>map=new HashMap<>();
        for (int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for (int num:arr){
            if (map.get(num)==1){
                System.out.println(num);
                break;
            }
        }

//        int res=-1;
//        for (int num:arr){
//            if (map.get(num)==1){
//                res=num;
//                break;
//            }
//        }
//        System.out.println("First non-repeated Element : "+res);
    }
}
