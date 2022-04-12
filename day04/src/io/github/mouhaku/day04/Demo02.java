/*
https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/6/ITP1_6_C
 */
package io.github.mouhaku.day04;
import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][][] swsz = new int[4][3][10];
        for(int i = 0;i < 4;i++)
        {
            for(int j = 0;j < 3;j++)
            {
                for(int k = 0;k < 10;k++)
                {
                    swsz[i][j][k] = 0;
                }
            }
        }
        for(int i = 0;i < n;i++)
        {
            int b = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            int v = sc.nextInt();

            swsz[b - 1][f - 1][r - 1] += v;
        }
        for(int i = 0;i < 4;i++)
        {
            for(int j = 0;j < 3;j++)
            {
                for(int k = 0;k < 10;k++)
                {
                    System.out.print(" " + swsz[i][j][k]);
                }
                System.out.println();
            }
            if(i == 3)
            {
                break;
            }
            System.out.println("####################");
        }

    }
}
