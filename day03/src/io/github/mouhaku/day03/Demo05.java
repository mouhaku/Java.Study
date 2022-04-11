/*
https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/6/ITP1_6_B
 */
package io.github.mouhaku.day03;
import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Scanner sc = new Scanner(System.in);
        int[] S = new int[13];
        int[] H = new int[13];
        int[] C = new int[13];
        int[] D = new int[13];
        int n = sc.nextInt();
        int s;
        for(int i = 0;i < 13;i++)
        {
            S[i] = 0;
            H[i] = 0;
            C[i] = 0;
            D[i] = 0;
        }
        for(int i = 0;i < n;i++)
        {
            char type = sc.next().charAt(0);
            int sz = sc.nextInt();
            switch (type) {
                case 'S' -> S[sz - 1] = 1;
                case 'H' -> H[sz - 1] = 1;
                case 'C' -> C[sz - 1] = 1;
                case 'D' -> D[sz - 1] = 1;
            }
        }
        for(int i = 0;i < 13;i++)
        {
            if(S[i] == 0)
            {
                System.out.println("S " + (i + 1));
            }
        }
        for(int i = 0;i < 13;i++)
        {
            if(H[i] == 0)
            {
                System.out.println("H " + (i + 1));
            }
        }
        for(int i = 0;i < 13;i++)
        {
            if(C[i] == 0)
            {
                System.out.println("C " + (i + 1));
            }
        }
        for(int i = 0;i < 13;i++)
        {
            if(D[i] == 0)
            {
                System.out.println("D " + (i + 1));
            }
        }
    }
}
