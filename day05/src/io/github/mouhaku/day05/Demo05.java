/*
https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/7/ITP1_7_C
 */
package io.github.mouhaku.day05;
import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] ewsz = new int[r + 1][c + 1];

        for(int i = 0;i < r;i++)
        {
            for(int j = 0;j < c;j++)
            {
                ewsz[i][j] = sc.nextInt();
                ewsz[i][c] += ewsz[i][j];
                ewsz[r][j] += ewsz[i][j];
                ewsz[r][c] += ewsz[i][j];
            }

        }
        for(int a = 0;a < r + 1;a++)
        {
            for(int b = 0;b < c + 1;b++)
            {
                if(b > 0)
                {
                    System.out.print(" ");
                }
                System.out.print(ewsz[a][b]);
            }
            System.out.println();
        }

    }
}
