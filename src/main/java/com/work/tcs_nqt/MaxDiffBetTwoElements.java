package com.work.tcs_nqt;

import java.util.Scanner;

public class MaxDiffBetTwoElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        int maxDiff = 0;
        for (int i = 0; i < n ; i++) {
            for (int j = i + 1; j < n; j++) {
                int diff = arr[j] - arr[i];
                if (diff > maxDiff) {
                    maxDiff = diff;
                }
            }
        }
        System.out.println(maxDiff);
    }
}

 // TODO   5 --> 7 9 5 6 3   ouput: 9-7=2