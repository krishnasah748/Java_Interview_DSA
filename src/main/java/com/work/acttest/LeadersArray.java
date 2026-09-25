package com.work.acttest;

import java.util.Scanner;

public class LeadersArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
        boolean found=true;
            for (int j = i+1; j <n ; j++) {
                if (arr[i]<arr[j]){
                    found=false;
                }
            }
            if (found){
                System.out.print(arr[i]+" ");
            }

        }

    }

}

//A leader is an element that is greater than all the elements to its right.
// last element is always a leader
