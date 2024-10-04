package com.hackerRank.hack;

import java.util.Scanner;

public class SomeMathProblem {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
/*        2
        0 2 10
        5 3 5*/
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            System.out.println();
            int calc = a;
            for(int j=0;j<n;j++)
            {
                calc = (int) (calc + (Math.pow(2,j)*b));
                System.out.print(calc+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
