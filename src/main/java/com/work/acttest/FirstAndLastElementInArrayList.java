package com.work.acttest;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLastElementInArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(list.getFirst());
        System.out.println(list.get(n-1));
    }
}
