/*
https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/4/ITP1_4_D
 */
package io.github.mouhaku.day02;
import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] str = new int[n];
        for(int i = 0;i < n;i++)
        {
            int a = sc.nextInt();
            str[i] = a;
        }

        int y = str[0];
        for(int i = 0;i < n; i++)
        {
            if(str[i] < y)
                y = str[i];
        }
        System.out.print(y + " ");
        int x = str[0];
        for(int i = 0;i < n; i++)
        {
            if(str[i] > x)
                x = str[i];
        }
        System.out.print(x + " ");
        long z = 0;
        for(int i = 0;i < n; i++)
        {
            z += str[i];
        }
        System.out.println(z);
    }
}
