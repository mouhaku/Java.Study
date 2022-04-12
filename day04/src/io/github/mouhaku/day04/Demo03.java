/*
https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/6/ITP1_6_D
 */
package io.github.mouhaku.day04;
import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] ewsz = new int[n][m];
        int[] ywsz = new int[m];
        int[] c = new int[n];
        for(int i = 0;i < n;i++)
        {
            c[i] = 0;
        }
        for(int i = 0;i < n;i++)
        {
            for(int j = 0;j < m;j++)
            {
                ewsz[i][j] = sc.nextInt();
            }
        }
        for(int i = 0;i < m;i++)
        {
            ywsz[i] = sc.nextInt();
        }
        for(int i = 0;i < n;i++)
        {
            for(int j = 0;j < m;j++)
            {
                c[i] += ewsz[i][j] * ywsz[j];
            }
            System.out.println(c[i]);
        }
    }
}
