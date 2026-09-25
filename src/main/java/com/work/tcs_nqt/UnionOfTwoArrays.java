package com.work.tcs_nqt;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        for (int num:arr1){
            set.add(num);
        }
        for (int res:arr2){
            set.add(res);
        }

        //union
        for (int num:set) {
            System.out.print(num + " ");
        }


    }
}
