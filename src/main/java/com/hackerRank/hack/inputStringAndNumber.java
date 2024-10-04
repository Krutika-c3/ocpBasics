package com.hackerRank.hack;

import java.util.Scanner;

public class inputStringAndNumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*
        abc 10
        pwc 03
        wdijfwoeij 102
         */
        System.out.println("================================");
        for(int i=0;i<=2;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-14s %03d\n", s1, x);
        }
        System.out.println("================================");
    }
}