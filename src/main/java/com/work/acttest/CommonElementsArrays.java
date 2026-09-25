package com.work.acttest;

import java.util.Scanner;

public class CommonElementsArrays {
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

        boolean found=false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                    found=true;
                    break;
                }
            }
        }

        if(!found){
            System.out.println("common elements are not found");
        }

    }
}
