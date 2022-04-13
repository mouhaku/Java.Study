/*
https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/7/ITP1_7_D
 */
package io.github.mouhaku.day05;
import java.util.Scanner;

public class Demo06 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        int[][] A = new int[n][m];
        int[][] B = new int[m][l];
        long[][] C = new long[n][l];
        for(int i = 0;i < n;i++)
        {
            for(int j = 0;j < l;j++)
            {
                C[i][j] = 0;
            }
        }
        for(int i = 0;i < n;i++)
        {
            for(int j = 0;j < m;j++)
            {
                A[i][j] = sc.nextInt();
            }
        }
        for(int i = 0;i < m;i++)
        {
            for(int j = 0;j < l;j++)
            {
                B[i][j] = sc.nextInt();
            }
        }
        for(int i = 0;i < n;i++)
        {
            for(int j = 0;j < l;j++)
            {
                for(int k = 0;k < m;k++)
                {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        for(int i = 0;i < n;i++)
        {
            for(int j = 0;j < l;j++)
            {
                if(j > 0)
                {
                    System.out.print(" ");
                }
                System.out.print(C[i][j]);
            }
            System.out.println();
        }
    }
}
