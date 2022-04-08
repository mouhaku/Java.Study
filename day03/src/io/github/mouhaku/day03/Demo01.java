/*
https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/5/ITP1_5_D
 */
package io.github.mouhaku.day03;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 1;
        while (i <= a) {
            int x = i;

            if (x % 3 == 0) {
                System.out.print(" " + i);
            } else {
                while (x != 0) {
                    if (x % 10 == 3) {
                        System.out.print(" " + i);
                        break;
                    } else {
                        x /= 10;
                    }
                }
            }
            i++;
        }
        System.out.println();
    }
}
