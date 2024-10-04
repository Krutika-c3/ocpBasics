package com.hackerRank.hack;

import java.util.*;

public class OddEven {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        String var;
        if (N % 2 == 0) {
            if (N >= 2 && N <= 5) {
                var = "Not Weird";
            } else if (N >= 6 && N <= 20) {
                var = "Weird";
            } else if (N > 20) {
                var = "Not Weird";
            } else {
                var = "Not Weird";
            }
        } else {
            var = "Weird";
        }
        System.out.println(var);
    }
}

