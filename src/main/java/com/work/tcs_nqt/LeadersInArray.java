package com.work.tcs_nqt;

import java.util.Scanner;

public class LeadersInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
        boolean found=true;
            for (int j = i+1; j < n; j++) {
                if(arr[j]>arr[i]){
                    found=false;
                     break;
                }
            }

            if(found){
                System.out.print(arr[i]+" ");
            }
        }
//        System.out.println("\b");   // to remove the last space
    }

}

//A leader is an element that is greater than all the elements to its right.
// last element is always a leader
