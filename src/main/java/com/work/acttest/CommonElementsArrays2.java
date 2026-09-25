package com.work.acttest;

import java.util.HashSet;
import java.util.Scanner;

public class CommonElementsArrays2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i]=sc.nextInt();
        }

        int m=sc.nextInt();
        int[] arr2=new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i]=sc.nextInt();
        }

        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr1[i]);
        }

        boolean found=false;
        for (int i = 0; i < m; i++) {
            if(set.contains(arr2[i])){
                System.out.print(arr2[i]+" ");
                found=true;
            }
        }
        if (!found){
            System.out.println("common elements are not found");
        }
    }
}
