/*
https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/6/ITP1_6_A
 */
package io.github.mouhaku.day03;
import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] str = new int[n];
        int[] rts = new int[n];
        for(int i = 0;i < n;i++)
        {
            str[i] = sc.nextInt();
        }
        for(int i = 0;i < n;i++)
        {
            rts[i] = str[n - i - 1];
        }
        for(int i = 0;i < n;i++)
        {
            if(i > 0)
            {
                System.out.print(" ");
            }
            System.out.print(rts[i]);
        }
        System.out.println();
    }
}
